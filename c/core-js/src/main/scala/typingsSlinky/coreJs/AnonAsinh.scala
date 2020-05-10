package typingsSlinky.coreJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAsinh extends js.Object {
  def acosh(x: Double): Double = js.native
  def asinh(x: Double): Double = js.native
  def atanh(x: Double): Double = js.native
  def cbrt(x: Double): Double = js.native
  def clz32(x: Double): Double = js.native
  def cosh(x: Double): Double = js.native
  def expm1(x: Double): Double = js.native
  def fround(x: Double): Double = js.native
  def hypot(values: Double*): Double = js.native
  def imul(x: Double, y: Double): Double = js.native
  def log10(x: Double): Double = js.native
  def log1p(x: Double): Double = js.native
  def log2(x: Double): Double = js.native
  def sign(x: Double): Double = js.native
  def sinh(x: Double): Double = js.native
  def tanh(x: Double): Double = js.native
  def trunc(x: Double): Double = js.native
}

object AnonAsinh {
  @scala.inline
  def apply(
    acosh: Double => Double,
    asinh: Double => Double,
    atanh: Double => Double,
    cbrt: Double => Double,
    clz32: Double => Double,
    cosh: Double => Double,
    expm1: Double => Double,
    fround: Double => Double,
    hypot: /* repeated */ Double => Double,
    imul: (Double, Double) => Double,
    log10: Double => Double,
    log1p: Double => Double,
    log2: Double => Double,
    sign: Double => Double,
    sinh: Double => Double,
    tanh: Double => Double,
    trunc: Double => Double
  ): AnonAsinh = {
    val __obj = js.Dynamic.literal(acosh = js.Any.fromFunction1(acosh), asinh = js.Any.fromFunction1(asinh), atanh = js.Any.fromFunction1(atanh), cbrt = js.Any.fromFunction1(cbrt), clz32 = js.Any.fromFunction1(clz32), cosh = js.Any.fromFunction1(cosh), expm1 = js.Any.fromFunction1(expm1), fround = js.Any.fromFunction1(fround), hypot = js.Any.fromFunction1(hypot), imul = js.Any.fromFunction2(imul), log10 = js.Any.fromFunction1(log10), log1p = js.Any.fromFunction1(log1p), log2 = js.Any.fromFunction1(log2), sign = js.Any.fromFunction1(sign), sinh = js.Any.fromFunction1(sinh), tanh = js.Any.fromFunction1(tanh), trunc = js.Any.fromFunction1(trunc))
    __obj.asInstanceOf[AnonAsinh]
  }
  @scala.inline
  implicit class AnonAsinhOps[Self <: AnonAsinh] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAcosh(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acosh")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAsinh(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asinh")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAtanh(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("atanh")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCbrt(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cbrt")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withClz32(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clz32")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCosh(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cosh")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withExpm1(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expm1")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFround(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fround")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHypot(value: /* repeated */ Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hypot")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withImul(value: (Double, Double) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imul")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withLog10(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("log10")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLog1p(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("log1p")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLog2(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("log2")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSign(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sign")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSinh(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sinh")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTanh(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tanh")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTrunc(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trunc")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

