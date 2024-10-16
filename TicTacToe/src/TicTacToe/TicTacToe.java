package TicTacToe;

//importation of packages.
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TicTacToe implements ActionListener{
	
	public boolean playerOne = true;
	public int scoreboardX = 0;
	public int scoreboardO = 0;
	public final static JButton[] button = new JButton[9];
	public JFrame frame = new JFrame("Tic-Tac-Toe");
	public JLabel label = new JLabel();
	public JPanel panel2 = new JPanel();
	public JPanel panel = new JPanel();

	
	
	public TicTacToe() {
		//Frame Deploy
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(700, 600);
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.setLayout(new BorderLayout());
		frame.setVisible(true);
		frame.setResizable(false);
		
		//label and score_board
		label.setBackground(Color.BLACK);
		label.setFont(new Font("MV Boli", Font.BOLD, 60));
		label.setText("Tic-Tac-Toe");
		label.setOpaque(true);
		
		//panel 2 customisation.
		panel2.setLayout(new BorderLayout());
		panel2.setBounds(0,0,500,200);
		
		//panel 1 deploy
		panel.setLayout(new GridLayout(3, 3));
		panel.setBackground(Color.LIGHT_GRAY);
		
		//creates 9 buttons and adds it to the JFrame.
		for(int i = 0; i < button.length; i++){
			button[i] = new JButton();
			panel.add(button[i]);
			button[i].setFont(new Font("MV Boli", Font.BOLD, 100));
			button[i].addActionListener(this);
			button[i].setBackground(Color.LIGHT_GRAY);
			button[i].setFocusable(false);
		}
		
		//add components to the frame.
		panel2.add(label);
		frame.add(panel,BorderLayout.CENTER);
		frame.add(panel2, BorderLayout.NORTH); 
		}


	
	public void checkForWinner() {
		//checks the possible patterns to see if there is a match is there is it displays the winner to the panel.
			if((button[0].getText() == "X") && 
				(button[1].getText() == "X") &&
				(button[2].getText() == "X")){
				xWins(0,1,2);
				scoreboardX++;
				resetButtons();
				}  
			
			if((button[3].getText() == "X") && 
				(button[4].getText() == "X") &&
				(button[5].getText() == "X")){
				xWins(3,4,5);
				scoreboardX++;
				resetButtons();
		} 
			
			if((button[6].getText() == "X") && 
				(button[7].getText() == "X") && 
				(button[8].getText() == "X")){
				xWins(6,7,8);
				scoreboardX++;
				resetButtons();
		} 
			
			if((button[0].getText() == "X") && 
					(button[3].getText() == "X") && 
					(button[6].getText() == "X")){
				xWins(0,3,6);
				scoreboardX++;
				resetButtons();
		} 
			if((button[1].getText() == "X") && 
					(button[4].getText() == "X") && 
					(button[7].getText() == "X")){
				xWins(1,4,7);
				scoreboardX++;
				resetButtons();
		}
		
			if((button[2].getText() == "X") && 
					(button[5].getText() == "X") && 
					(button[8].getText() == "X")){
				xWins(2,5,8);
				scoreboardX++;
				resetButtons();
		} 
			
			if((button[0].getText() == "X") && 
					(button[4].getText() == "X") &&
					(button[8].getText() == "X")){
				xWins(0,4,8);
				scoreboardX++;
				resetButtons();
		}
			
			if((button[2].getText() == "X") && 
					(button[4].getText() == "X") && 
					(button[6].getText() == "X")){
				xWins(2,4,6);
				scoreboardX++;
				resetButtons();
		} 
			
			if((button[0].getText() == "O") && 
					(button[1].getText() == "O") && 
					(button[2].getText() == "O")){
				oWins(0,1,2);
				scoreboardO++;
				resetButtons();
		} 
			
			if((button[3].getText() == "O") && 
					(button[4].getText() == "O") && 
					(button[5].getText() == "O")){
				oWins(3,4,5);
				scoreboardO++;
				resetButtons();
		} 
			
			if((button[6].getText() == "O") && 
					(button[7].getText() == "O") && 
					(button[8].getText() == "O")){
				oWins(6,7,8);
				scoreboardO++;
				resetButtons();
		} 
			
			if((button[0].getText() == "O") && 
					(button[3].getText() == "O") && 
					(button[6].getText() == "O")){
				oWins(0,3,6);
				scoreboardO++;
				resetButtons();
		} 
			if((button[1].getText() == "O") && 
					(button[4].getText() == "O") && 
					(button[7].getText() == "O")){
				oWins(1,4,7);
				scoreboardO++;
				resetButtons();
		} 
			if((button[2].getText() == "O") && 
					(button[5].getText() == "O") && 
					(button[8].getText() == "O")){
				oWins(2,5,8);
				scoreboardO++;
				resetButtons();
		} 
			if((button[0].getText() == "O") && 
					(button[4].getText() == "O") && 
					(button[8].getText() == "O")){
				oWins(0,4,8);
				resetButtons();
		} 
			if((button[2].getText() == "O") && 
					(button[4].getText() == "O") && 
					(button[6].getText() == "O")){
				oWins(2,4,6);
				scoreboardO++;
				resetButtons();
		} 
	}
		
	public void xWins(int a, int b, int c) {
		//changes the background colour of the winning pattern buttons to green, calls the disableButtons method and sets the label to display the winner.
		button[a].setBackground(Color.GREEN);
		button[b].setBackground(Color.GREEN);
		button[c].setBackground(Color.GREEN);
	}
	
	public void oWins(int a, int b, int c) {
		//changes the background colour of the winning pattern buttons to green, calls the disableButtons method and sets the label to display the winner.
		button[a].setBackground(Color.GREEN);
		button[b].setBackground(Color.GREEN);
		button[c].setBackground(Color.GREEN);
		}
		
	public void scoreBoardChecker() {
		//checks the score_board once its 7 the game ends 
		if(scoreboardX == 7) {
			label.setText("X WINS!");
			disableButtons();
		}else if (scoreboardO == 7){
			label.setText("O WINS!");
			disableButtons();
		}
	       
	}
	
	public void disableButtons(){
		//disables the buttons at the end of the game
		for(int i = 0; i < button.length; i++) {
			button[i].setEnabled(false);
			
		}
	}
	public void resetButtons() {
		//resets the buttons for a new round.
		
		for(int i = 0; i < button.length; i++) {
			button[i].setText("");
			button[i].setBackground(Color.LIGHT_GRAY);
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		//action that is performed when the button is clicked. Sets text to X or O.
			for(int j = 0; j < button.length; j++) {
				if(e.getSource() == button[j]) {
					if(playerOne == true) {
						button[j].setText("X");
						playerOne = false;
						checkForWinner();
						label.setText("Scores:" + " X : " + scoreboardX + " O : " + scoreboardO);
						scoreBoardChecker();
					}
					else if(playerOne == false) {
						button[j].setText("O");
						playerOne = true;
						checkForWinner();
						label.setText("Scores:" + " X : " + scoreboardX + " O : " + scoreboardO);
						scoreBoardChecker();
					}
			}
		}
	}
}
