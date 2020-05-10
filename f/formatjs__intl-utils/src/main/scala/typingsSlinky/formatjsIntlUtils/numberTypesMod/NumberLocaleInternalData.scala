package typingsSlinky.formatjsIntlUtils.numberTypesMod

import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NumberLocaleInternalData extends js.Object {
  var currencies: Record[String, CurrencyData] = js.native
  var nu: js.Array[String] = js.native
  var numbers: RawNumberData = js.native
  var units: Record[String, UnitData] = js.native
}

object NumberLocaleInternalData {
  @scala.inline
  def apply(
    currencies: Record[String, CurrencyData],
    nu: js.Array[String],
    numbers: RawNumberData,
    units: Record[String, UnitData]
  ): NumberLocaleInternalData = {
    val __obj = js.Dynamic.literal(currencies = currencies.asInstanceOf[js.Any], nu = nu.asInstanceOf[js.Any], numbers = numbers.asInstanceOf[js.Any], units = units.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumberLocaleInternalData]
  }
  @scala.inline
  implicit class NumberLocaleInternalDataOps[Self <: NumberLocaleInternalData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrencies(value: Record[String, CurrencyData]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNu(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumbers(value: RawNumberData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numbers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnits(value: Record[String, UnitData]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("units")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

