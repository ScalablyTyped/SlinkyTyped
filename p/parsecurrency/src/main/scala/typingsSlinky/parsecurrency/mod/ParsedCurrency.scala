package typingsSlinky.parsecurrency.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParsedCurrency extends js.Object {
  var currency: String = js.native
  var decimalSeparator: String = js.native
  var decimals: String = js.native
  var groupSeparator: String = js.native
  var integer: String = js.native
  var raw: String = js.native
  var symbol: String = js.native
  var value: Double = js.native
}

object ParsedCurrency {
  @scala.inline
  def apply(
    currency: String,
    decimalSeparator: String,
    decimals: String,
    groupSeparator: String,
    integer: String,
    raw: String,
    symbol: String,
    value: Double
  ): ParsedCurrency = {
    val __obj = js.Dynamic.literal(currency = currency.asInstanceOf[js.Any], decimalSeparator = decimalSeparator.asInstanceOf[js.Any], decimals = decimals.asInstanceOf[js.Any], groupSeparator = groupSeparator.asInstanceOf[js.Any], integer = integer.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParsedCurrency]
  }
  @scala.inline
  implicit class ParsedCurrencyOps[Self <: ParsedCurrency] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrency(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDecimalSeparator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decimalSeparator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDecimals(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decimals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGroupSeparator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupSeparator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInteger(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("integer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRaw(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("raw")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSymbol(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

