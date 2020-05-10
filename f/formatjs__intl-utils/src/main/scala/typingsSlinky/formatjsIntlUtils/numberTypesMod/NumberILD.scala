package typingsSlinky.formatjsIntlUtils.numberTypesMod

import typingsSlinky.formatjsIntlUtils.AnonCompactLong
import typingsSlinky.formatjsIntlUtils.AnonCurrencyName
import typingsSlinky.formatjsIntlUtils.AnonDecimal
import typingsSlinky.formatjsIntlUtils.AnonUnitName
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NumberILD extends js.Object {
  var currency: AnonCompactLong = js.native
  var currencySymbols: Record[String, AnonCurrencyName] = js.native
  var decimal: AnonCompactLong = js.native
  var symbols: AnonDecimal = js.native
  var unitSymbols: Record[String, AnonUnitName] = js.native
}

object NumberILD {
  @scala.inline
  def apply(
    currency: AnonCompactLong,
    currencySymbols: Record[String, AnonCurrencyName],
    decimal: AnonCompactLong,
    symbols: AnonDecimal,
    unitSymbols: Record[String, AnonUnitName]
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
    def withCurrency(value: AnonCompactLong): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrencySymbols(value: Record[String, AnonCurrencyName]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currencySymbols")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDecimal(value: AnonCompactLong): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decimal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSymbols(value: AnonDecimal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbols")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnitSymbols(value: Record[String, AnonUnitName]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unitSymbols")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

