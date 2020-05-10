package typingsSlinky.jsMoney.currencyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Currency extends js.Object {
  var code: String = js.native
  var decimal_digits: Double = js.native
  var name: String = js.native
  var name_plural: String = js.native
  var rounding: Double = js.native
  var symbol: String = js.native
  var symbol_native: String = js.native
}

object Currency {
  @scala.inline
  def apply(
    code: String,
    decimal_digits: Double,
    name: String,
    name_plural: String,
    rounding: Double,
    symbol: String,
    symbol_native: String
  ): Currency = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], decimal_digits = decimal_digits.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], name_plural = name_plural.asInstanceOf[js.Any], rounding = rounding.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any], symbol_native = symbol_native.asInstanceOf[js.Any])
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
    def withDecimal_digits(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decimal_digits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName_plural(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name_plural")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRounding(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rounding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSymbol(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSymbol_native(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbol_native")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

