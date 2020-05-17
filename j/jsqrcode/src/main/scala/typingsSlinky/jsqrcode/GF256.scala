package typingsSlinky.jsqrcode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GF256 extends js.Object {
  val One: GF256Poly = js.native
  val Zero: GF256Poly = js.native
  var expTable: js.Array[Double] = js.native
  var logTable: js.Array[Double] = js.native
  var one: GF256Poly = js.native
  var zero: GF256Poly = js.native
  def buildMonomial(degree: Double, coefficient: Double): GF256Poly = js.native
  def exp(a: Double): Double = js.native
  def inverse(a: Double): Double = js.native
  def log(a: Double): Double = js.native
  def multiply(a: Double, b: Double): Double = js.native
}

object GF256 {
  @scala.inline
  def apply(
    One: GF256Poly,
    Zero: GF256Poly,
    buildMonomial: (Double, Double) => GF256Poly,
    exp: Double => Double,
    expTable: js.Array[Double],
    inverse: Double => Double,
    log: Double => Double,
    logTable: js.Array[Double],
    multiply: (Double, Double) => Double,
    one: GF256Poly,
    zero: GF256Poly
  ): GF256 = {
    val __obj = js.Dynamic.literal(One = One.asInstanceOf[js.Any], Zero = Zero.asInstanceOf[js.Any], buildMonomial = js.Any.fromFunction2(buildMonomial), exp = js.Any.fromFunction1(exp), expTable = expTable.asInstanceOf[js.Any], inverse = js.Any.fromFunction1(inverse), log = js.Any.fromFunction1(log), logTable = logTable.asInstanceOf[js.Any], multiply = js.Any.fromFunction2(multiply), one = one.asInstanceOf[js.Any], zero = zero.asInstanceOf[js.Any])
    __obj.asInstanceOf[GF256]
  }
  @scala.inline
  implicit class GF256Ops[Self <: GF256] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOne(value: GF256Poly): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("One")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withZero(value: GF256Poly): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Zero")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBuildMonomial(value: (Double, Double) => GF256Poly): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buildMonomial")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withExp(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exp")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withExpTable(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expTable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInverse(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inverse")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLog(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("log")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLogTable(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logTable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMultiply(value: (Double, Double) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiply")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

