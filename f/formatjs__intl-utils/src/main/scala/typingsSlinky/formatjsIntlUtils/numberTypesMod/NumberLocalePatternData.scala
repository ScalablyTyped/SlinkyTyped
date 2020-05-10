package typingsSlinky.formatjsIntlUtils.numberTypesMod

import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NumberLocalePatternData extends js.Object {
  var currency: Record[String, CurrencyPattern] = js.native
  var decimal: SignDisplayPattern = js.native
  var percent: SignDisplayPattern = js.native
  var unit: Record[String, UnitPattern] = js.native
}

object NumberLocalePatternData {
  @scala.inline
  def apply(
    currency: Record[String, CurrencyPattern],
    decimal: SignDisplayPattern,
    percent: SignDisplayPattern,
    unit: Record[String, UnitPattern]
  ): NumberLocalePatternData = {
    val __obj = js.Dynamic.literal(currency = currency.asInstanceOf[js.Any], decimal = decimal.asInstanceOf[js.Any], percent = percent.asInstanceOf[js.Any], unit = unit.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumberLocalePatternData]
  }
  @scala.inline
  implicit class NumberLocalePatternDataOps[Self <: NumberLocalePatternData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrency(value: Record[String, CurrencyPattern]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDecimal(value: SignDisplayPattern): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decimal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPercent(value: SignDisplayPattern): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("percent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnit(value: Record[String, UnitPattern]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unit")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

