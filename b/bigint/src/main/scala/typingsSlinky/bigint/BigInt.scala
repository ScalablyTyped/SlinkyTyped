package typingsSlinky.bigint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BigInt")
@js.native
object BigInt extends js.Object {
  def GCD(x: typingsSlinky.bigint.BigInt.BigInt, y: typingsSlinky.bigint.BigInt.BigInt): typingsSlinky.bigint.BigInt.BigInt = js.native
  def GCD_(x: typingsSlinky.bigint.BigInt.BigInt, y: typingsSlinky.bigint.BigInt.BigInt): Unit = js.native
  def add(x: typingsSlinky.bigint.BigInt.BigInt, y: typingsSlinky.bigint.BigInt.BigInt): typingsSlinky.bigint.BigInt.BigInt = js.native
  def addInt(x: typingsSlinky.bigint.BigInt.BigInt, n: Double): typingsSlinky.bigint.BigInt.BigInt = js.native
  def addInt_(x: typingsSlinky.bigint.BigInt.BigInt, n: Double): Unit = js.native
  def addShift_(x: typingsSlinky.bigint.BigInt.BigInt, y: typingsSlinky.bigint.BigInt.BigInt, ys: Double): Unit = js.native
  def add_(x: typingsSlinky.bigint.BigInt.BigInt, y: typingsSlinky.bigint.BigInt.BigInt): Unit = js.native
  def bigInt2str(x: typingsSlinky.bigint.BigInt.BigInt, base: String): String = js.native
  def bigInt2str(x: typingsSlinky.bigint.BigInt.BigInt, base: Double): String = js.native
  def bitSize(x: typingsSlinky.bigint.BigInt.BigInt): Double = js.native
  def carry_(x: typingsSlinky.bigint.BigInt.BigInt): Unit = js.native
  def copyInt_(x: typingsSlinky.bigint.BigInt.BigInt, n: Double): Unit = js.native
  def copy_(x: typingsSlinky.bigint.BigInt.BigInt, y: typingsSlinky.bigint.BigInt.BigInt): Unit = js.native
  def divInt_(x: typingsSlinky.bigint.BigInt.BigInt, n: Double): Double = js.native
  def divide_(
    x: typingsSlinky.bigint.BigInt.BigInt,
    y: typingsSlinky.bigint.BigInt.BigInt,
    q: typingsSlinky.bigint.BigInt.BigInt,
    r: typingsSlinky.bigint.BigInt.BigInt
  ): Unit = js.native
  def dup(x: typingsSlinky.bigint.BigInt.BigInt): typingsSlinky.bigint.BigInt.BigInt = js.native
  def eGCD_(
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
  def halve_(x: typingsSlinky.bigint.BigInt.BigInt): Unit = js.native
  def int2bigInt(t: Double): typingsSlinky.bigint.BigInt.BigInt = js.native
  def int2bigInt(t: Double, n: Double): typingsSlinky.bigint.BigInt.BigInt = js.native
  def int2bigInt(t: Double, n: Double, m: Double): typingsSlinky.bigint.BigInt.BigInt = js.native
  def inverseMod(x: typingsSlinky.bigint.BigInt.BigInt, n: typingsSlinky.bigint.BigInt.BigInt): typingsSlinky.bigint.BigInt.BigInt = js.native
  def inverseModInt(x: Double, n: Double): typingsSlinky.bigint.BigInt.BigInt = js.native
  def inverseMod_(x: typingsSlinky.bigint.BigInt.BigInt, n: typingsSlinky.bigint.BigInt.BigInt): Boolean = js.native
  def isZero(x: typingsSlinky.bigint.BigInt.BigInt): Boolean = js.native
  def leftShift_(x: typingsSlinky.bigint.BigInt.BigInt, n: Double): Unit = js.native
  def linCombShift_(
    x: typingsSlinky.bigint.BigInt.BigInt,
    y: typingsSlinky.bigint.BigInt.BigInt,
    b: Double,
    ys: Double
  ): Unit = js.native
  def linComb_(x: typingsSlinky.bigint.BigInt.BigInt, y: typingsSlinky.bigint.BigInt.BigInt, a: Double, b: Double): Unit = js.native
  def millerRabin(x: typingsSlinky.bigint.BigInt.BigInt, b: typingsSlinky.bigint.BigInt.BigInt): Boolean = js.native
  def millerRabinInt(x: Double, b: Double): Boolean = js.native
  def mod(x: typingsSlinky.bigint.BigInt.BigInt, n: typingsSlinky.bigint.BigInt.BigInt): typingsSlinky.bigint.BigInt.BigInt = js.native
  def modInt(x: typingsSlinky.bigint.BigInt.BigInt, n: Double): Double = js.native
  def mod_(x: typingsSlinky.bigint.BigInt.BigInt, n: typingsSlinky.bigint.BigInt.BigInt): Unit = js.native
  def mont_(
    x: typingsSlinky.bigint.BigInt.BigInt,
    y: typingsSlinky.bigint.BigInt.BigInt,
    n: typingsSlinky.bigint.BigInt.BigInt,
    np: Double
  ): Unit = js.native
  def mult(x: typingsSlinky.bigint.BigInt.BigInt, y: typingsSlinky.bigint.BigInt.BigInt): typingsSlinky.bigint.BigInt.BigInt = js.native
  def multInt_(x: typingsSlinky.bigint.BigInt.BigInt, n: Double): Unit = js.native
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
  def rightShift_(x: typingsSlinky.bigint.BigInt.BigInt, n: Double): Unit = js.native
  def setRandom(random: IRandom): Unit = js.native
  def squareMod_(x: typingsSlinky.bigint.BigInt.BigInt, n: typingsSlinky.bigint.BigInt.BigInt): Unit = js.native
  def str2bigInt(s: String, b: String): typingsSlinky.bigint.BigInt.BigInt = js.native
  def str2bigInt(s: String, b: String, n: Double): typingsSlinky.bigint.BigInt.BigInt = js.native
  def str2bigInt(s: String, b: String, n: Double, m: Double): typingsSlinky.bigint.BigInt.BigInt = js.native
  def str2bigInt(s: String, b: Double): typingsSlinky.bigint.BigInt.BigInt = js.native
  def str2bigInt(s: String, b: Double, n: Double): typingsSlinky.bigint.BigInt.BigInt = js.native
  def str2bigInt(s: String, b: Double, n: Double, m: Double): typingsSlinky.bigint.BigInt.BigInt = js.native
  def sub(x: typingsSlinky.bigint.BigInt.BigInt, y: typingsSlinky.bigint.BigInt.BigInt): typingsSlinky.bigint.BigInt.BigInt = js.native
  def subShift_(x: typingsSlinky.bigint.BigInt.BigInt, y: typingsSlinky.bigint.BigInt.BigInt, ys: Double): Unit = js.native
  def sub_(x: typingsSlinky.bigint.BigInt.BigInt, y: typingsSlinky.bigint.BigInt.BigInt): Unit = js.native
  def trim(x: typingsSlinky.bigint.BigInt.BigInt, k: Double): typingsSlinky.bigint.BigInt.BigInt = js.native
  type BigInt = js.Array[Double]
  type IRandom = js.Function0[Double]
}

