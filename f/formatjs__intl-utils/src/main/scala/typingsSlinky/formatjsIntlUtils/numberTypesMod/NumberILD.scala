package typingsSlinky.formatjsIntlUtils.numberTypesMod

import typingsSlinky.formatjsIntlUtils.anon.CompactLong
import typingsSlinky.formatjsIntlUtils.anon.CurrencyName
import typingsSlinky.formatjsIntlUtils.anon.Decimal
import typingsSlinky.formatjsIntlUtils.anon.UnitName
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NumberILD extends js.Object {
  var currency: CompactLong
  var currencySymbols: Record[String, CurrencyName]
  var decimal: CompactLong
  var symbols: Decimal
  var unitSymbols: Record[String, UnitName]
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
}

