package typingsSlinky.bigint

import typingsSlinky.bigint.BigInt.IRandom
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  @js.native
  object BigInt extends js.Object {
    
    def GCD(x: typingsSlinky.bigint.BigInt.BigInt, y: typingsSlinky.bigint.BigInt.BigInt): typingsSlinky.bigint.BigInt.BigInt = js.native
    
    def GCD_(x: typingsSlinky.bigint.BigInt.BigInt, y: typingsSlinky.bigint.BigInt.BigInt): Unit = js.native
    
    def add(x: typingsSlinky.bigint.BigInt.BigInt, y: typingsSlinky.bigint.BigInt.BigInt): typingsSlinky.bigint.BigInt.BigInt = js.native
    
    def addInt(x: typingsSlinky.bigint.BigInt.BigInt, n: Double): typingsSlinky.bigint.BigInt.BigInt = js.native
    
    def addInt_(x: typingsSlinky.bigint.BigInt.BigInt, n: Double): Unit = js.native
    
    @JSName("addShift_")
    def addShift(x: typingsSlinky.bigint.BigInt.BigInt, y: typingsSlinky.bigint.BigInt.BigInt, ys: Double): Unit = js.native
    
    def add_(x: typingsSlinky.bigint.BigInt.BigInt, y: typingsSlinky.bigint.BigInt.BigInt): Unit = js.native
    
    def bigInt2str(x: typingsSlinky.bigint.BigInt.BigInt, base: String): String = js.native
    def bigInt2str(x: typingsSlinky.bigint.BigInt.BigInt, base: Double): String = js.native
    
    def bitSize(x: typingsSlinky.bigint.BigInt.BigInt): Double = js.native
    
    @JSName("carry_")
    def carry(x: typingsSlinky.bigint.BigInt.BigInt): Unit = js.native
    
    @JSName("copy_")
    def copy(x: typingsSlinky.bigint.BigInt.BigInt, y: typingsSlinky.bigint.BigInt.BigInt): Unit = js.native
    
    @JSName("copyInt_")
    def copyInt(x: typingsSlinky.bigint.BigInt.BigInt, n: Double): Unit = js.native
    
    @JSName("divInt_")
    def divInt(x: typingsSlinky.bigint.BigInt.BigInt, n: Double): Double = js.native
    
    @JSName("divide_")
    def divide(
      x: typingsSlinky.bigint.BigInt.BigInt,
      y: typingsSlinky.bigint.BigInt.BigInt,
      q: typingsSlinky.bigint.BigInt.BigInt,
      r: typingsSlinky.bigint.BigInt.BigInt
    ): Unit = js.native
    
    def dup(x: typingsSlinky.bigint.BigInt.BigInt): typingsSlinky.bigint.BigInt.BigInt = js.native
    
    @JSName("eGCD_")
    def eGCD(
      x: typingsSlinky.bigint.BigInt.BigInt,
      y: typingsSlinky.bigint.BigInt.BigInt,
      d: typingsSlinky.bigint.BigInt.BigInt,
      a: typingsSlinky.bigint.BigInt.BigInt,
      b: typingsSlinky.bigint.BigInt.BigInt
    ): Unit = js.native
    
    def equals(x: typingsSlinky.bigint.BigInt.BigInt, y: typingsSlinky.bigint.BigInt.BigInt): Boolean = js.native
    
    def equalsInt(x: typingsSlinky.bigint.BigInt.BigInt, y: Double): Boolean = js.native
    
    def expand(value: typingsSlinky.bigint.BigInt.BigInt, n: Double): typingsSlinky.bigint.BigInt.BigInt = js.native
    
    def findPrimes(n: Double): js.Array[Double] = js.native
    
    def greater(x: typingsSlinky.bigint.BigInt.BigInt, y: typingsSlinky.bigint.BigInt.BigInt): Boolean = js.native
    
    def greaterShift(x: typingsSlinky.bigint.BigInt.BigInt, y: typingsSlinky.bigint.BigInt.BigInt, shift: Double): Boolean = js.native
    
    @JSName("halve_")
    def halve(x: typingsSlinky.bigint.BigInt.BigInt): Unit = js.native
    
    def int2bigInt(t: Double): typingsSlinky.bigint.BigInt.BigInt = js.native
    def int2bigInt(t: Double, n: js.UndefOr[scala.Nothing], m: Double): typingsSlinky.bigint.BigInt.BigInt = js.native
    def int2bigInt(t: Double, n: Double): typingsSlinky.bigint.BigInt.BigInt = js.native
    def int2bigInt(t: Double, n: Double, m: Double): typingsSlinky.bigint.BigInt.BigInt = js.native
    
    def inverseMod(x: typingsSlinky.bigint.BigInt.BigInt, n: typingsSlinky.bigint.BigInt.BigInt): typingsSlinky.bigint.BigInt.BigInt = js.native
    
    def inverseModInt(x: Double, n: Double): typingsSlinky.bigint.BigInt.BigInt = js.native
    
    def inverseMod_(x: typingsSlinky.bigint.BigInt.BigInt, n: typingsSlinky.bigint.BigInt.BigInt): Boolean = js.native
    
    def isZero(x: typingsSlinky.bigint.BigInt.BigInt): Boolean = js.native
    
    @JSName("leftShift_")
    def leftShift(x: typingsSlinky.bigint.BigInt.BigInt, n: Double): Unit = js.native
    
    @JSName("linComb_")
    def linComb(x: typingsSlinky.bigint.BigInt.BigInt, y: typingsSlinky.bigint.BigInt.BigInt, a: Double, b: Double): Unit = js.native
    
    @JSName("linCombShift_")
    def linCombShift(
      x: typingsSlinky.bigint.BigInt.BigInt,
      y: typingsSlinky.bigint.BigInt.BigInt,
      b: Double,
      ys: Double
    ): Unit = js.native
    
    def millerRabin(x: typingsSlinky.bigint.BigInt.BigInt, b: typingsSlinky.bigint.BigInt.BigInt): Boolean = js.native
    
    def millerRabinInt(x: Double, b: Double): Boolean = js.native
    
    def mod(x: typingsSlinky.bigint.BigInt.BigInt, n: typingsSlinky.bigint.BigInt.BigInt): typingsSlinky.bigint.BigInt.BigInt = js.native
    
    def modInt(x: typingsSlinky.bigint.BigInt.BigInt, n: Double): Double = js.native
    
    def mod_(x: typingsSlinky.bigint.BigInt.BigInt, n: typingsSlinky.bigint.BigInt.BigInt): Unit = js.native
    
    @JSName("mont_")
    def mont(
      x: typingsSlinky.bigint.BigInt.BigInt,
      y: typingsSlinky.bigint.BigInt.BigInt,
      n: typingsSlinky.bigint.BigInt.BigInt,
      np: Double
    ): Unit = js.native
    
    def mult(x: typingsSlinky.bigint.BigInt.BigInt, y: typingsSlinky.bigint.BigInt.BigInt): typingsSlinky.bigint.BigInt.BigInt = js.native
    
    @JSName("multInt_")
    def multInt(x: typingsSlinky.bigint.BigInt.BigInt, n: Double): Unit = js.native
    
    def multMod(
      x: typingsSlinky.bigint.BigInt.BigInt,
      y: typingsSlinky.bigint.BigInt.BigInt,
      n: typingsSlinky.bigint.BigInt.BigInt
    ): typingsSlinky.bigint.BigInt.BigInt = js.native
    
    def multMod_(
      x: typingsSlinky.bigint.BigInt.BigInt,
      y: typingsSlinky.bigint.BigInt.BigInt,
      n: typingsSlinky.bigint.BigInt.BigInt
    ): Unit = js.native
    
    def mult_(x: typingsSlinky.bigint.BigInt.BigInt, y: typingsSlinky.bigint.BigInt.BigInt): Unit = js.native
    
    def negative(x: typingsSlinky.bigint.BigInt.BigInt): Boolean = js.native
    
    def powMod(
      x: typingsSlinky.bigint.BigInt.BigInt,
      y: typingsSlinky.bigint.BigInt.BigInt,
      n: typingsSlinky.bigint.BigInt.BigInt
    ): typingsSlinky.bigint.BigInt.BigInt = js.native
    
    def powMod_(
      x: typingsSlinky.bigint.BigInt.BigInt,
      y: typingsSlinky.bigint.BigInt.BigInt,
      n: typingsSlinky.bigint.BigInt.BigInt
    ): Unit = js.native
    
    def randBigInt(n: Double, s: Double): typingsSlinky.bigint.BigInt.BigInt = js.native
    
    def randBigInt_(b: typingsSlinky.bigint.BigInt.BigInt, n: Double, s: Double): Unit = js.native
    
    def randProbPrime(k: Double): typingsSlinky.bigint.BigInt.BigInt = js.native
    
    def randTruePrime(k: Double): typingsSlinky.bigint.BigInt.BigInt = js.native
    
    def randTruePrime_(ans: typingsSlinky.bigint.BigInt.BigInt, k: Double): Unit = js.native
    
    @JSName("rightShift_")
    def rightShift(x: typingsSlinky.bigint.BigInt.BigInt, n: Double): Unit = js.native
    
    def setRandom(random: IRandom): Unit = js.native
    
    @JSName("squareMod_")
    def squareMod(x: typingsSlinky.bigint.BigInt.BigInt, n: typingsSlinky.bigint.BigInt.BigInt): Unit = js.native
    
    def str2bigInt(s: String, b: String): typingsSlinky.bigint.BigInt.BigInt = js.native
    def str2bigInt(s: String, b: String, n: js.UndefOr[scala.Nothing], m: Double): typingsSlinky.bigint.BigInt.BigInt = js.native
    def str2bigInt(s: String, b: String, n: Double): typingsSlinky.bigint.BigInt.BigInt = js.native
    def str2bigInt(s: String, b: String, n: Double, m: Double): typingsSlinky.bigint.BigInt.BigInt = js.native
    def str2bigInt(s: String, b: Double): typingsSlinky.bigint.BigInt.BigInt = js.native
    def str2bigInt(s: String, b: Double, n: js.UndefOr[scala.Nothing], m: Double): typingsSlinky.bigint.BigInt.BigInt = js.native
    def str2bigInt(s: String, b: Double, n: Double): typingsSlinky.bigint.BigInt.BigInt = js.native
    def str2bigInt(s: String, b: Double, n: Double, m: Double): typingsSlinky.bigint.BigInt.BigInt = js.native
    
    def sub(x: typingsSlinky.bigint.BigInt.BigInt, y: typingsSlinky.bigint.BigInt.BigInt): typingsSlinky.bigint.BigInt.BigInt = js.native
    
    @JSName("subShift_")
    def subShift(x: typingsSlinky.bigint.BigInt.BigInt, y: typingsSlinky.bigint.BigInt.BigInt, ys: Double): Unit = js.native
    
    def sub_(x: typingsSlinky.bigint.BigInt.BigInt, y: typingsSlinky.bigint.BigInt.BigInt): Unit = js.native
    
    def trim(x: typingsSlinky.bigint.BigInt.BigInt, k: Double): typingsSlinky.bigint.BigInt.BigInt = js.native
  }
}
