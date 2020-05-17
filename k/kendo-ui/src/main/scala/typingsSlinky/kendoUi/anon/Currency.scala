package typingsSlinky.kendoUi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Currency extends js.Object {
  @JSName(",")
  var Comma: String = js.native
  @JSName(".")
  var Dot: String = js.native
  var currency: Decimals = js.native
  var decimals: Double = js.native
  var groupSize: js.Array[Double] = js.native
  var pattern: js.Array[String] = js.native
  var percent: Decimals = js.native
}

object Currency {
  @scala.inline
  def apply(
    Comma: String,
    Dot: String,
    currency: Decimals,
    decimals: Double,
    groupSize: js.Array[Double],
    pattern: js.Array[String],
    percent: Decimals
  ): Currency = {
    val __obj = js.Dynamic.literal(currency = currency.asInstanceOf[js.Any], decimals = decimals.asInstanceOf[js.Any], groupSize = groupSize.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any], percent = percent.asInstanceOf[js.Any])
    __obj.updateDynamic(",")(Comma.asInstanceOf[js.Any])
    __obj.updateDynamic(".")(Dot.asInstanceOf[js.Any])
    __obj.asInstanceOf[Currency]
  }
  @scala.inline
  implicit class CurrencyOps[Self <: Currency] (val x: Self) extends AnyVal {
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
    def withCurrency(value: Decimals): Self = {
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
    def withPercent(value: Decimals): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("percent")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

