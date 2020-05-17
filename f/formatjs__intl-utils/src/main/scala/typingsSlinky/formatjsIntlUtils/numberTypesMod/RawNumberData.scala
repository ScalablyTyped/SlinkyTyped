package typingsSlinky.formatjsIntlUtils.numberTypesMod

import typingsSlinky.formatjsIntlUtils.anon.LongShort
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RawNumberData extends js.Object {
  var currency: Record[NumberingSystem, RawCurrencyData] = js.native
  var decimal: Record[NumberingSystem, LongShort] = js.native
  var nu: js.Array[String] = js.native
  var percent: Record[NumberingSystem, String] = js.native
  var symbols: Record[NumberingSystem, SymbolsData] = js.native
}

object RawNumberData {
  @scala.inline
  def apply(
    currency: Record[NumberingSystem, RawCurrencyData],
    decimal: Record[NumberingSystem, LongShort],
    nu: js.Array[String],
    percent: Record[NumberingSystem, String],
    symbols: Record[NumberingSystem, SymbolsData]
  ): RawNumberData = {
    val __obj = js.Dynamic.literal(currency = currency.asInstanceOf[js.Any], decimal = decimal.asInstanceOf[js.Any], nu = nu.asInstanceOf[js.Any], percent = percent.asInstanceOf[js.Any], symbols = symbols.asInstanceOf[js.Any])
    __obj.asInstanceOf[RawNumberData]
  }
  @scala.inline
  implicit class RawNumberDataOps[Self <: RawNumberData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrency(value: Record[NumberingSystem, RawCurrencyData]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDecimal(value: Record[NumberingSystem, LongShort]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decimal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNu(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPercent(value: Record[NumberingSystem, String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("percent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSymbols(value: Record[NumberingSystem, SymbolsData]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbols")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

