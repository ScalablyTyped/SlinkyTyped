package typingsSlinky.kendoUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCurrency extends js.Object {
  @JSName(",")
  var Comma: String = js.native
  @JSName(".")
  var Dot: String = js.native
  var currency: AnonDecimals = js.native
  var decimals: Double = js.native
  var groupSize: js.Array[Double] = js.native
  var pattern: js.Array[String] = js.native
  var percent: AnonDecimals = js.native
}

object AnonCurrency {
  @scala.inline
  def apply(
    Comma: String,
    Dot: String,
    currency: AnonDecimals,
    decimals: Double,
    groupSize: js.Array[Double],
    pattern: js.Array[String],
    percent: AnonDecimals
  ): AnonCurrency = {
    val __obj = js.Dynamic.literal(currency = currency.asInstanceOf[js.Any], decimals = decimals.asInstanceOf[js.Any], groupSize = groupSize.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any], percent = percent.asInstanceOf[js.Any])
    __obj.updateDynamic(",")(Comma.asInstanceOf[js.Any])
    __obj.updateDynamic(".")(Dot.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCurrency]
  }
  @scala.inline
  implicit class AnonCurrencyOps[Self <: AnonCurrency] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComma(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic(",")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDot(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic(".")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrency(value: AnonDecimals): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDecimals(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decimals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGroupSize(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPattern(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPercent(value: AnonDecimals): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("percent")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

