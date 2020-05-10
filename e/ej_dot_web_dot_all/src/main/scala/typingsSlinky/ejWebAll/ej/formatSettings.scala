package typingsSlinky.ejWebAll.ej

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait formatSettings extends js.Object {
  var currency: currencySettings = js.native
  var decimals: Double = js.native
  var groupSizes: js.Array[Double] = js.native
  var pattern: js.Array[String] = js.native
  var percent: percentSettings = js.native
}

object formatSettings {
  @scala.inline
  def apply(
    currency: currencySettings,
    decimals: Double,
    groupSizes: js.Array[Double],
    pattern: js.Array[String],
    percent: percentSettings
  ): formatSettings = {
    val __obj = js.Dynamic.literal(currency = currency.asInstanceOf[js.Any], decimals = decimals.asInstanceOf[js.Any], groupSizes = groupSizes.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any], percent = percent.asInstanceOf[js.Any])
    __obj.asInstanceOf[formatSettings]
  }
  @scala.inline
  implicit class formatSettingsOps[Self <: formatSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrency(value: currencySettings): Self = {
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
    def withGroupSizes(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupSizes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPattern(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPercent(value: percentSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("percent")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

