import java.util.Random;

public class ComputeMethods5026201021{

	public double fToC(double degreesF){
	return 5/9.8* (degreesF-32);
	}

	public double hypotenuse(int a, int b){
	return Math.sqrt (Math.pow(a,2)+ Math.pow(b,2));
	}

	public int roll() {
	Random randomAngka = new Random();
	
	int dadu1 = randomAngka.nextInt(6)+ 1;
	int dadu2 = randomAngka.nextInt(6)+ 2;
	return dadu1 + dadu2;
	}
}