package typingsSlinky.flexmonster.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Format extends js.Object {
  var beautifyFloatingPoint: js.UndefOr[Boolean] = js.native
  var currencySymbol: js.UndefOr[String] = js.native
  var currencySymbolAlign: js.UndefOr[String] = js.native
  var decimalPlaces: js.UndefOr[Double] = js.native
  var decimalSeparator: js.UndefOr[String] = js.native
  var divideByZeroValue: js.UndefOr[String] = js.native
  var infinityValue: js.UndefOr[String] = js.native
  var isPercent: js.UndefOr[Boolean] = js.native
  var maxDecimalPlaces: js.UndefOr[Double] = js.native
  var maxSymbols: js.UndefOr[Double] = js.native
  var name: js.UndefOr[String] = js.native
  var negativeCurrencyFormat: js.UndefOr[String] = js.native
  var nullValue: js.UndefOr[String] = js.native
  var positiveCurrencyFormat: js.UndefOr[String] = js.native
  var textAlign: js.UndefOr[String] = js.native
  var thousandsSeparator: js.UndefOr[String] = js.native
}

object Format {
  @scala.inline
  def apply(): Format = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Format]
  }
  @scala.inline
  implicit class FormatOps[Self <: Format] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBeautifyFloatingPoint(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beautifyFloatingPoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBeautifyFloatingPoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beautifyFloatingPoint")(js.undefined)
        ret
    }
    @scala.inline
    def withCurrencySymbol(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currencySymbol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrencySymbol: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currencySymbol")(js.undefined)
        ret
    }
    @scala.inline
    def withCurrencySymbolAlign(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currencySymbolAlign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrencySymbolAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currencySymbolAlign")(js.undefined)
        ret
    }
    @scala.inline
    def withDecimalPlaces(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decimalPlaces")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDecimalPlaces: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decimalPlaces")(js.undefined)
        ret
    }
    @scala.inline
    def withDecimalSeparator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decimalSeparator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDecimalSeparator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decimalSeparator")(js.undefined)
        ret
    }
    @scala.inline
    def withDivideByZeroValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("divideByZeroValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDivideByZeroValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("divideByZeroValue")(js.undefined)
        ret
    }
    @scala.inline
    def withInfinityValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("infinityValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInfinityValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("infinityValue")(js.undefined)
        ret
    }
    @scala.inline
    def withIsPercent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPercent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsPercent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPercent")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxDecimalPlaces(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDecimalPlaces")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxDecimalPlaces: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDecimalPlaces")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxSymbols(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxSymbols")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxSymbols: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxSymbols")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withNegativeCurrencyFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("negativeCurrencyFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNegativeCurrencyFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("negativeCurrencyFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withNullValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nullValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNullValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nullValue")(js.undefined)
        ret
    }
    @scala.inline
    def withPositiveCurrencyFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positiveCurrencyFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPositiveCurrencyFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positiveCurrencyFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withTextAlign(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textAlign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textAlign")(js.undefined)
        ret
    }
    @scala.inline
    def withThousandsSeparator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thousandsSeparator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThousandsSeparator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thousandsSeparator")(js.undefined)
        ret
    }
  }
  
}

