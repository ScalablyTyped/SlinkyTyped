package typingsSlinky.exprEval.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Abs extends js.Object {
  var abs: js.UndefOr[Boolean] = js.native
  var acos: js.UndefOr[Boolean] = js.native
  var acosh: js.UndefOr[Boolean] = js.native
  var add: js.UndefOr[Boolean] = js.native
  var asin: js.UndefOr[Boolean] = js.native
  var asinh: js.UndefOr[Boolean] = js.native
  var assignment: js.UndefOr[Boolean] = js.native
  var atan: js.UndefOr[Boolean] = js.native
  var atanh: js.UndefOr[Boolean] = js.native
  var cbrt: js.UndefOr[Boolean] = js.native
  var ceil: js.UndefOr[Boolean] = js.native
  var comparison: js.UndefOr[Boolean] = js.native
  var concatenate: js.UndefOr[Boolean] = js.native
  var conditional: js.UndefOr[Boolean] = js.native
  var cos: js.UndefOr[Boolean] = js.native
  var cosh: js.UndefOr[Boolean] = js.native
  var divide: js.UndefOr[Boolean] = js.native
  var exp: js.UndefOr[Boolean] = js.native
  var expm1: js.UndefOr[Boolean] = js.native
  var factorial: js.UndefOr[Boolean] = js.native
  var floor: js.UndefOr[Boolean] = js.native
  var fndef: js.UndefOr[Boolean] = js.native
  var in: js.UndefOr[Boolean] = js.native
  var length: js.UndefOr[Boolean] = js.native
  var lg: js.UndefOr[Boolean] = js.native
  var ln: js.UndefOr[Boolean] = js.native
  var log: js.UndefOr[Boolean] = js.native
  var log10: js.UndefOr[Boolean] = js.native
  var log1p: js.UndefOr[Boolean] = js.native
  var log2: js.UndefOr[Boolean] = js.native
  var logical: js.UndefOr[Boolean] = js.native
  var max: js.UndefOr[Boolean] = js.native
  var min: js.UndefOr[Boolean] = js.native
  var multiply: js.UndefOr[Boolean] = js.native
  var power: js.UndefOr[Boolean] = js.native
  var random: js.UndefOr[Boolean] = js.native
  var remainder: js.UndefOr[Boolean] = js.native
  var round: js.UndefOr[Boolean] = js.native
  var sign: js.UndefOr[Boolean] = js.native
  var sin: js.UndefOr[Boolean] = js.native
  var sinh: js.UndefOr[Boolean] = js.native
  var sqrt: js.UndefOr[Boolean] = js.native
  var subtract: js.UndefOr[Boolean] = js.native
  var tan: js.UndefOr[Boolean] = js.native
  var tanh: js.UndefOr[Boolean] = js.native
  var trunc: js.UndefOr[Boolean] = js.native
}

object Abs {
  @scala.inline
  def apply(): Abs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Abs]
  }
  @scala.inline
  implicit class AbsOps[Self <: Abs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAbs(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAbs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abs")(js.undefined)
        ret
    }
    @scala.inline
    def withAcos(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAcos: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acos")(js.undefined)
        ret
    }
    @scala.inline
    def withAcosh(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acosh")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAcosh: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acosh")(js.undefined)
        ret
    }
    @scala.inline
    def withAdd(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("add")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("add")(js.undefined)
        ret
    }
    @scala.inline
    def withAsin(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAsin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asin")(js.undefined)
        ret
    }
    @scala.inline
    def withAsinh(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asinh")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAsinh: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asinh")(js.undefined)
        ret
    }
    @scala.inline
    def withAssignment(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assignment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssignment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assignment")(js.undefined)
        ret
    }
    @scala.inline
    def withAtan(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("atan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAtan: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("atan")(js.undefined)
        ret
    }
    @scala.inline
    def withAtanh(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("atanh")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAtanh: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("atanh")(js.undefined)
        ret
    }
    @scala.inline
    def withCbrt(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cbrt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCbrt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cbrt")(js.undefined)
        ret
    }
    @scala.inline
    def withCeil(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ceil")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCeil: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ceil")(js.undefined)
        ret
    }
    @scala.inline
    def withComparison(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comparison")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComparison: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comparison")(js.undefined)
        ret
    }
    @scala.inline
    def withConcatenate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("concatenate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConcatenate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("concatenate")(js.undefined)
        ret
    }
    @scala.inline
    def withConditional(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conditional")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConditional: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conditional")(js.undefined)
        ret
    }
    @scala.inline
    def withCos(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCos: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cos")(js.undefined)
        ret
    }
    @scala.inline
    def withCosh(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cosh")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCosh: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cosh")(js.undefined)
        ret
    }
    @scala.inline
    def withDivide(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("divide")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDivide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("divide")(js.undefined)
        ret
    }
    @scala.inline
    def withExp(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exp")(js.undefined)
        ret
    }
    @scala.inline
    def withExpm1(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expm1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpm1: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expm1")(js.undefined)
        ret
    }
    @scala.inline
    def withFactorial(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("factorial")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFactorial: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("factorial")(js.undefined)
        ret
    }
    @scala.inline
    def withFloor(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFloor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floor")(js.undefined)
        ret
    }
    @scala.inline
    def withFndef(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fndef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFndef: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fndef")(js.undefined)
        ret
    }
    @scala.inline
    def withIn(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("in")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("in")(js.undefined)
        ret
    }
    @scala.inline
    def withLength(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(js.undefined)
        ret
    }
    @scala.inline
    def withLg(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLg: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lg")(js.undefined)
        ret
    }
    @scala.inline
    def withLn(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ln")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ln")(js.undefined)
        ret
    }
    @scala.inline
    def withLog(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("log")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLog: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("log")(js.undefined)
        ret
    }
    @scala.inline
    def withLog10(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("log10")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLog10: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("log10")(js.undefined)
        ret
    }
    @scala.inline
    def withLog1p(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("log1p")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLog1p: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("log1p")(js.undefined)
        ret
    }
    @scala.inline
    def withLog2(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("log2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLog2: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("log2")(js.undefined)
        ret
    }
    @scala.inline
    def withLogical(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logical")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogical: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logical")(js.undefined)
        ret
    }
    @scala.inline
    def withMax(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(js.undefined)
        ret
    }
    @scala.inline
    def withMin(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(js.undefined)
        ret
    }
    @scala.inline
    def withMultiply(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiply")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultiply: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiply")(js.undefined)
        ret
    }
    @scala.inline
    def withPower(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("power")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPower: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("power")(js.undefined)
        ret
    }
    @scala.inline
    def withRandom(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("random")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRandom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("random")(js.undefined)
        ret
    }
    @scala.inline
    def withRemainder(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remainder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemainder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remainder")(js.undefined)
        ret
    }
    @scala.inline
    def withRound(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("round")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRound: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("round")(js.undefined)
        ret
    }
    @scala.inline
    def withSign(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sign")(js.undefined)
        ret
    }
    @scala.inline
    def withSin(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sin")(js.undefined)
        ret
    }
    @scala.inline
    def withSinh(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sinh")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSinh: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sinh")(js.undefined)
        ret
    }
    @scala.inline
    def withSqrt(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sqrt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSqrt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sqrt")(js.undefined)
        ret
    }
    @scala.inline
    def withSubtract(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subtract")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubtract: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subtract")(js.undefined)
        ret
    }
    @scala.inline
    def withTan(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTan: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tan")(js.undefined)
        ret
    }
    @scala.inline
    def withTanh(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tanh")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTanh: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tanh")(js.undefined)
        ret
    }
    @scala.inline
    def withTrunc(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trunc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrunc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trunc")(js.undefined)
        ret
    }
  }
  
}

