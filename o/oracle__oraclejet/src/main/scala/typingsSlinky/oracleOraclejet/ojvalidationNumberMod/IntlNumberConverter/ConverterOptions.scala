package typingsSlinky.oracleOraclejet.ojvalidationNumberMod.IntlNumberConverter

import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.HALF_DOWN
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.HALF_EVEN
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.HALF_UP
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.bit
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.byte
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.code
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.currency
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.decimal
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.full
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.long
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.name
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.none
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.percent
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.short
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.standard
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.symbol
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.unit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
@js.native
trait ConverterOptions extends js.Object {
  var currency: js.UndefOr[String] = js.native
  var currencyDisplay: js.UndefOr[code | symbol | name] = js.native
  var currencyFormat: js.UndefOr[standard | short | long] = js.native
  var decimalFormat: js.UndefOr[standard | short | long] = js.native
  var lenientParse: js.UndefOr[full | none] = js.native
  var maximumFractionDigits: js.UndefOr[Double] = js.native
  var minimumFractionDigits: js.UndefOr[Double] = js.native
  var minimumIntegerDigits: js.UndefOr[Double] = js.native
  var pattern: js.UndefOr[String] = js.native
  var roundDuringParse: js.UndefOr[Boolean] = js.native
  var roundingMode: js.UndefOr[HALF_UP | HALF_DOWN | HALF_EVEN] = js.native
  var separators: js.UndefOr[Separators] = js.native
  var style: js.UndefOr[decimal | currency | percent | unit] = js.native
  var unit: js.UndefOr[byte | bit] = js.native
  var useGrouping: js.UndefOr[Boolean] = js.native
}

object ConverterOptions {
  @scala.inline
  def apply(): ConverterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConverterOptions]
  }
  @scala.inline
  implicit class ConverterOptionsOps[Self <: ConverterOptions] (val x: Self) extends AnyVal {
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
    def withoutCurrency: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currency")(js.undefined)
        ret
    }
    @scala.inline
    def withCurrencyDisplay(value: code | symbol | name): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currencyDisplay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrencyDisplay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currencyDisplay")(js.undefined)
        ret
    }
    @scala.inline
    def withCurrencyFormat(value: standard | short | long): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currencyFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrencyFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currencyFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withDecimalFormat(value: standard | short | long): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decimalFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDecimalFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decimalFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withLenientParse(value: full | none): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lenientParse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLenientParse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lenientParse")(js.undefined)
        ret
    }
    @scala.inline
    def withMaximumFractionDigits(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumFractionDigits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaximumFractionDigits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumFractionDigits")(js.undefined)
        ret
    }
    @scala.inline
    def withMinimumFractionDigits(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumFractionDigits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinimumFractionDigits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumFractionDigits")(js.undefined)
        ret
    }
    @scala.inline
    def withMinimumIntegerDigits(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumIntegerDigits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinimumIntegerDigits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumIntegerDigits")(js.undefined)
        ret
    }
    @scala.inline
    def withPattern(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPattern: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pattern")(js.undefined)
        ret
    }
    @scala.inline
    def withRoundDuringParse(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roundDuringParse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoundDuringParse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roundDuringParse")(js.undefined)
        ret
    }
    @scala.inline
    def withRoundingMode(value: HALF_UP | HALF_DOWN | HALF_EVEN): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roundingMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoundingMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roundingMode")(js.undefined)
        ret
    }
    @scala.inline
    def withSeparators(value: Separators): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("separators")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeparators: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("separators")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: decimal | currency | percent | unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
    @scala.inline
    def withUnit(value: byte | bit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unit")(js.undefined)
        ret
    }
    @scala.inline
    def withUseGrouping(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useGrouping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseGrouping: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useGrouping")(js.undefined)
        ret
    }
  }
  
}

