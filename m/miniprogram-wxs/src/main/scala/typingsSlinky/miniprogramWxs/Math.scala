package typingsSlinky.miniprogramWxs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Math extends js.Object {
  /** The mathematical constant e. This is Euler's number, the base of natural logarithms. */
  val E: Double = js.native
  /** The natural logarithm of 10. */
  val LN10: Double = js.native
  /** The natural logarithm of 2. */
  val LN2: Double = js.native
  /** The base-10 logarithm of e. */
  val LOG10E: Double = js.native
  /** The base-2 logarithm of e. */
  val LOG2E: Double = js.native
  /** Pi. This is the ratio of the circumference of a circle to its diameter. */
  val PI: Double = js.native
  /** The square root of 0.5, or, equivalently, one divided by the square root of 2. */
  val SQRT1_2: Double = js.native
  /** The square root of 2. */
  val SQRT2: Double = js.native
  /**
    * Returns the absolute value of a number (the value without regard to whether it is positive or negative).
    * For example, the absolute value of -5 is the same as the absolute value of 5.
    * @param x A numeric expression for which the absolute value is needed.
    */
  def abs(x: Double): Double = js.native
  /**
    * Returns the arc cosine (or inverse cosine) of a number.
    * @param x A numeric expression.
    */
  def acos(x: Double): Double = js.native
  /**
    * Returns the arcsine of a number.
    * @param x A numeric expression.
    */
  def asin(x: Double): Double = js.native
  /**
    * Returns the arctangent of a number.
    * @param x A numeric expression for which the arctangent is needed.
    */
  def atan(x: Double): Double = js.native
  /**
    * Returns the angle (in radians) from the X axis to a point.
    * @param y A numeric expression representing the cartesian y-coordinate.
    * @param x A numeric expression representing the cartesian x-coordinate.
    */
  def atan2(y: Double, x: Double): Double = js.native
  /**
    * Returns the smallest integer greater than or equal to its numeric argument.
    * @param x A numeric expression.
    */
  def ceil(x: Double): Double = js.native
  /**
    * Returns the cosine of a number.
    * @param x A numeric expression that contains an angle measured in radians.
    */
  def cos(x: Double): Double = js.native
  /**
    * Returns e (the base of natural logarithms) raised to a power.
    * @param x A numeric expression representing the power of e.
    */
  def exp(x: Double): Double = js.native
  /**
    * Returns the greatest integer less than or equal to its numeric argument.
    * @param x A numeric expression.
    */
  def floor(x: Double): Double = js.native
  /**
    * Returns the natural logarithm (base e) of a number.
    * @param x A numeric expression.
    */
  def log(x: Double): Double = js.native
  /**
    * Returns the larger of a set of supplied numeric expressions.
    * @param values Numeric expressions to be evaluated.
    */
  def max(values: Double*): Double = js.native
  /**
    * Returns the smaller of a set of supplied numeric expressions.
    * @param values Numeric expressions to be evaluated.
    */
  def min(values: Double*): Double = js.native
  /**
    * Returns the value of a base expression taken to a specified power.
    * @param x The base value of the expression.
    * @param y The exponent value of the expression.
    */
  def pow(x: Double, y: Double): Double = js.native
  /** Returns a pseudorandom number between 0 and 1. */
  def random(): Double = js.native
  /**
    * Returns a supplied numeric expression rounded to the nearest number.
    * @param x The value to be rounded to the nearest number.
    */
  def round(x: Double): Double = js.native
  /**
    * Returns the sine of a number.
    * @param x A numeric expression that contains an angle measured in radians.
    */
  def sin(x: Double): Double = js.native
  /**
    * Returns the square root of a number.
    * @param x A numeric expression.
    */
  def sqrt(x: Double): Double = js.native
  /**
    * Returns the tangent of a number.
    * @param x A numeric expression that contains an angle measured in radians.
    */
  def tan(x: Double): Double = js.native
}

object Math {
  @scala.inline
  def apply(
    E: Double,
    LN10: Double,
    LN2: Double,
    LOG10E: Double,
    LOG2E: Double,
    PI: Double,
    SQRT1_2: Double,
    SQRT2: Double,
    abs: Double => Double,
    acos: Double => Double,
    asin: Double => Double,
    atan: Double => Double,
    atan2: (Double, Double) => Double,
    ceil: Double => Double,
    cos: Double => Double,
    exp: Double => Double,
    floor: Double => Double,
    log: Double => Double,
    max: /* repeated */ Double => Double,
    min: /* repeated */ Double => Double,
    pow: (Double, Double) => Double,
    random: () => Double,
    round: Double => Double,
    sin: Double => Double,
    sqrt: Double => Double,
    tan: Double => Double
  ): Math = {
    val __obj = js.Dynamic.literal(E = E.asInstanceOf[js.Any], LN10 = LN10.asInstanceOf[js.Any], LN2 = LN2.asInstanceOf[js.Any], LOG10E = LOG10E.asInstanceOf[js.Any], LOG2E = LOG2E.asInstanceOf[js.Any], PI = PI.asInstanceOf[js.Any], SQRT1_2 = SQRT1_2.asInstanceOf[js.Any], SQRT2 = SQRT2.asInstanceOf[js.Any], abs = js.Any.fromFunction1(abs), acos = js.Any.fromFunction1(acos), asin = js.Any.fromFunction1(asin), atan = js.Any.fromFunction1(atan), atan2 = js.Any.fromFunction2(atan2), ceil = js.Any.fromFunction1(ceil), cos = js.Any.fromFunction1(cos), exp = js.Any.fromFunction1(exp), floor = js.Any.fromFunction1(floor), log = js.Any.fromFunction1(log), max = js.Any.fromFunction1(max), min = js.Any.fromFunction1(min), pow = js.Any.fromFunction2(pow), random = js.Any.fromFunction0(random), round = js.Any.fromFunction1(round), sin = js.Any.fromFunction1(sin), sqrt = js.Any.fromFunction1(sqrt), tan = js.Any.fromFunction1(tan))
    __obj.asInstanceOf[Math]
  }
  @scala.inline
  implicit class MathOps[Self <: Math] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withE(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("E")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLN10(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LN10")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLN2(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LN2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLOG10E(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LOG10E")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLOG2E(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LOG2E")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPI(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PI")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSQRT1_2(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SQRT1_2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSQRT2(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SQRT2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAbs(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abs")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAcos(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acos")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAsin(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asin")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAtan(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("atan")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAtan2(value: (Double, Double) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("atan2")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withCeil(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ceil")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCos(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cos")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withExp(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exp")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFloor(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floor")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLog(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("log")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMax(value: /* repeated */ Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMin(value: /* repeated */ Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPow(value: (Double, Double) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pow")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withRandom(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("random")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRound(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("round")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSin(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sin")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSqrt(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sqrt")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTan(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tan")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

