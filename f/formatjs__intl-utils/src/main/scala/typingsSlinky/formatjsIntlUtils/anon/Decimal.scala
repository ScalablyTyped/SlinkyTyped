package typingsSlinky.formatjsIntlUtils.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Decimal extends js.Object {
  var decimal: String = js.native
  var exponential: String = js.native
  var group: String = js.native
  var infinity: String = js.native
  var list: String = js.native
  var minusSign: String = js.native
  var nan: String = js.native
  var perMille: String = js.native
  var percentSign: String = js.native
  var plusSign: String = js.native
  var superscriptingExponent: String = js.native
  var timeSeparator: String = js.native
}

object Decimal {
  @scala.inline
  def apply(
    decimal: String,
    exponential: String,
    group: String,
    infinity: String,
    list: String,
    minusSign: String,
    nan: String,
    perMille: String,
    percentSign: String,
    plusSign: String,
    superscriptingExponent: String,
    timeSeparator: String
  ): Decimal = {
    val __obj = js.Dynamic.literal(decimal = decimal.asInstanceOf[js.Any], exponential = exponential.asInstanceOf[js.Any], group = group.asInstanceOf[js.Any], infinity = infinity.asInstanceOf[js.Any], list = list.asInstanceOf[js.Any], minusSign = minusSign.asInstanceOf[js.Any], nan = nan.asInstanceOf[js.Any], perMille = perMille.asInstanceOf[js.Any], percentSign = percentSign.asInstanceOf[js.Any], plusSign = plusSign.asInstanceOf[js.Any], superscriptingExponent = superscriptingExponent.asInstanceOf[js.Any], timeSeparator = timeSeparator.asInstanceOf[js.Any])
    __obj.asInstanceOf[Decimal]
  }
  @scala.inline
  implicit class DecimalOps[Self <: Decimal] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDecimal(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decimal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExponential(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exponential")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGroup(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("group")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInfinity(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("infinity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withList(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinusSign(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minusSign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNan(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPerMille(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("perMille")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPercentSign(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("percentSign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlusSign(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plusSign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuperscriptingExponent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("superscriptingExponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimeSeparator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeSeparator")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

