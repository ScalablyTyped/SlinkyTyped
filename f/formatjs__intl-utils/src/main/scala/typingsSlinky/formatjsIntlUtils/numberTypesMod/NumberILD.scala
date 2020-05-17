package typingsSlinky.formatjsIntlUtils.numberTypesMod

import typingsSlinky.formatjsIntlUtils.anon.CompactLong
import typingsSlinky.formatjsIntlUtils.anon.CurrencyName
import typingsSlinky.formatjsIntlUtils.anon.Decimal
import typingsSlinky.formatjsIntlUtils.anon.UnitName
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NumberILD extends js.Object {
  var currency: CompactLong = js.native
  var currencySymbols: Record[String, CurrencyName] = js.native
  var decimal: CompactLong = js.native
  var symbols: Decimal = js.native
  var unitSymbols: Record[String, UnitName] = js.native
}

object NumberILD {
  @scala.inline
  def apply(
    currency: CompactLong,
    currencySymbols: Record[String, CurrencyName],
    decimal: CompactLong,
    symbols: Decimal,
    unitSymbols: Record[String, UnitName]
  ): NumberILD = {
    val __obj = js.Dynamic.literal(currency = currency.asInstanceOf[js.Any], currencySymbols = currencySymbols.asInstanceOf[js.Any], decimal = decimal.asInstanceOf[js.Any], symbols = symbols.asInstanceOf[js.Any], unitSymbols = unitSymbols.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumberILD]
  }
  @scala.inline
  implicit class NumberILDOps[Self <: NumberILD] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrency(value: CompactLong): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrencySymbols(value: Record[String, CurrencyName]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currencySymbols")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDecimal(value: CompactLong): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decimal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSymbols(value: Decimal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbols")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnitSymbols(value: Record[String, UnitName]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unitSymbols")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

