package typingsSlinky.ejWebAll.ej

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait currencySettings extends js.Object {
  var decimals: Double = js.native
  var groupSizes: js.Array[Double] = js.native
  var pattern: js.Array[String] = js.native
  var symbol: String = js.native
}

object currencySettings {
  @scala.inline
  def apply(decimals: Double, groupSizes: js.Array[Double], pattern: js.Array[String], symbol: String): currencySettings = {
    val __obj = js.Dynamic.literal(decimals = decimals.asInstanceOf[js.Any], groupSizes = groupSizes.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any])
    __obj.asInstanceOf[currencySettings]
  }
  @scala.inline
  implicit class currencySettingsOps[Self <: currencySettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withSymbol(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbol")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

