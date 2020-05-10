package typingsSlinky.currencyFormatter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Currency extends js.Object {
  var code: String = js.native
  var decimalDigits: Double = js.native
  var decimalSeparator: String = js.native
  var spaceBetweenAmountAndSymbol: Boolean = js.native
  var symbol: String = js.native
  var symbolOnLeft: Boolean = js.native
  var thousandsSeparator: String = js.native
}

object Currency {
  @scala.inline
  def apply(
    code: String,
    decimalDigits: Double,
    decimalSeparator: String,
    spaceBetweenAmountAndSymbol: Boolean,
    symbol: String,
    symbolOnLeft: Boolean,
    thousandsSeparator: String
  ): Currency = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], decimalDigits = decimalDigits.asInstanceOf[js.Any], decimalSeparator = decimalSeparator.asInstanceOf[js.Any], spaceBetweenAmountAndSymbol = spaceBetweenAmountAndSymbol.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any], symbolOnLeft = symbolOnLeft.asInstanceOf[js.Any], thousandsSeparator = thousandsSeparator.asInstanceOf[js.Any])
    __obj.asInstanceOf[Currency]
  }
  @scala.inline
  implicit class CurrencyOps[Self <: Currency] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDecimalDigits(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decimalDigits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDecimalSeparator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decimalSeparator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpaceBetweenAmountAndSymbol(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spaceBetweenAmountAndSymbol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSymbol(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSymbolOnLeft(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbolOnLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThousandsSeparator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thousandsSeparator")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

