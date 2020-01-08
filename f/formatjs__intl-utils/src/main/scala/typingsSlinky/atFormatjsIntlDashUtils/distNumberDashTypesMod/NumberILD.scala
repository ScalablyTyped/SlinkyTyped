package typingsSlinky.atFormatjsIntlDashUtils.distNumberDashTypesMod

import typingsSlinky.atFormatjsIntlDashUtils.Anon_CompactLong
import typingsSlinky.atFormatjsIntlDashUtils.Anon_CurrencyName
import typingsSlinky.atFormatjsIntlDashUtils.Anon_Decimal
import typingsSlinky.atFormatjsIntlDashUtils.Anon_UnitName
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NumberILD extends js.Object {
  var currency: Anon_CompactLong
  var currencySymbols: Record[String, Anon_CurrencyName]
  var decimal: Anon_CompactLong
  var symbols: Anon_Decimal
  var unitSymbols: Record[String, Anon_UnitName]
}

object NumberILD {
  @scala.inline
  def apply(
    currency: Anon_CompactLong,
    currencySymbols: Record[String, Anon_CurrencyName],
    decimal: Anon_CompactLong,
    symbols: Anon_Decimal,
    unitSymbols: Record[String, Anon_UnitName]
  ): NumberILD = {
    val __obj = js.Dynamic.literal(currency = currency.asInstanceOf[js.Any], currencySymbols = currencySymbols.asInstanceOf[js.Any], decimal = decimal.asInstanceOf[js.Any], symbols = symbols.asInstanceOf[js.Any], unitSymbols = unitSymbols.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[NumberILD]
  }
}

