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
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCurrency(value: String): Self = this.set("currency", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrency: Self = this.set("currency", js.undefined)
    @scala.inline
    def setCurrencyDisplay(value: code | symbol | name): Self = this.set("currencyDisplay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrencyDisplay: Self = this.set("currencyDisplay", js.undefined)
    @scala.inline
    def setCurrencyFormat(value: standard | short | long): Self = this.set("currencyFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrencyFormat: Self = this.set("currencyFormat", js.undefined)
    @scala.inline
    def setDecimalFormat(value: standard | short | long): Self = this.set("decimalFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDecimalFormat: Self = this.set("decimalFormat", js.undefined)
    @scala.inline
    def setLenientParse(value: full | none): Self = this.set("lenientParse", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLenientParse: Self = this.set("lenientParse", js.undefined)
    @scala.inline
    def setMaximumFractionDigits(value: Double): Self = this.set("maximumFractionDigits", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaximumFractionDigits: Self = this.set("maximumFractionDigits", js.undefined)
    @scala.inline
    def setMinimumFractionDigits(value: Double): Self = this.set("minimumFractionDigits", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinimumFractionDigits: Self = this.set("minimumFractionDigits", js.undefined)
    @scala.inline
    def setMinimumIntegerDigits(value: Double): Self = this.set("minimumIntegerDigits", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinimumIntegerDigits: Self = this.set("minimumIntegerDigits", js.undefined)
    @scala.inline
    def setPattern(value: String): Self = this.set("pattern", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePattern: Self = this.set("pattern", js.undefined)
    @scala.inline
    def setRoundDuringParse(value: Boolean): Self = this.set("roundDuringParse", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoundDuringParse: Self = this.set("roundDuringParse", js.undefined)
    @scala.inline
    def setRoundingMode(value: HALF_UP | HALF_DOWN | HALF_EVEN): Self = this.set("roundingMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoundingMode: Self = this.set("roundingMode", js.undefined)
    @scala.inline
    def setSeparators(value: Separators): Self = this.set("separators", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeparators: Self = this.set("separators", js.undefined)
    @scala.inline
    def setStyle(value: decimal | currency | percent | unit): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setUnit(value: byte | bit): Self = this.set("unit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnit: Self = this.set("unit", js.undefined)
    @scala.inline
    def setUseGrouping(value: Boolean): Self = this.set("useGrouping", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseGrouping: Self = this.set("useGrouping", js.undefined)
  }
  
}

