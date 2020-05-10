package typingsSlinky.reactIntl

import typingsSlinky.formatjsIntlUnifiedNumberformat.mod.Unit
import typingsSlinky.formatjsIntlUtils.unifiedNumberformatTypesMod.UnifiedNumberFormatOptionsCompactDisplay
import typingsSlinky.formatjsIntlUtils.unifiedNumberformatTypesMod.UnifiedNumberFormatOptionsCurrencyDisplay
import typingsSlinky.formatjsIntlUtils.unifiedNumberformatTypesMod.UnifiedNumberFormatOptionsCurrencySign
import typingsSlinky.formatjsIntlUtils.unifiedNumberformatTypesMod.UnifiedNumberFormatOptionsLocaleMatcher
import typingsSlinky.formatjsIntlUtils.unifiedNumberformatTypesMod.UnifiedNumberFormatOptionsNotation
import typingsSlinky.formatjsIntlUtils.unifiedNumberformatTypesMod.UnifiedNumberFormatOptionsSignDisplay
import typingsSlinky.formatjsIntlUtils.unifiedNumberformatTypesMod.UnifiedNumberFormatOptionsStyle
import typingsSlinky.formatjsIntlUtils.unifiedNumberformatTypesMod.UnifiedNumberFormatOptionsUnitDisplay
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined @formatjs/intl-unified-numberformat.@formatjs/intl-unified-numberformat.UnifiedNumberFormatOptions & react-intl.react-intl.CustomFormatConfig & {  value  :number} */
@js.native
trait UnifiedNumberFormatOption extends js.Object {
  var compactDisplay: js.UndefOr[UnifiedNumberFormatOptionsCompactDisplay] = js.native
  var currency: js.UndefOr[String] = js.native
  var currencyDisplay: js.UndefOr[String with UnifiedNumberFormatOptionsCurrencyDisplay] = js.native
  var currencySign: js.UndefOr[UnifiedNumberFormatOptionsCurrencySign] = js.native
  var format: js.UndefOr[String] = js.native
  var localeMatcher: js.UndefOr[String with UnifiedNumberFormatOptionsLocaleMatcher] = js.native
  var maximumFractionDigits: js.UndefOr[Double] = js.native
  var maximumSignificantDigits: js.UndefOr[Double] = js.native
  var minimumFractionDigits: js.UndefOr[Double] = js.native
  var minimumIntegerDigits: js.UndefOr[Double] = js.native
  var minimumSignificantDigits: js.UndefOr[Double] = js.native
  var notation: js.UndefOr[UnifiedNumberFormatOptionsNotation] = js.native
  var signDisplay: js.UndefOr[UnifiedNumberFormatOptionsSignDisplay] = js.native
  var style: js.UndefOr[String with UnifiedNumberFormatOptionsStyle] = js.native
  var unit: js.UndefOr[Unit] = js.native
  var unitDisplay: js.UndefOr[UnifiedNumberFormatOptionsUnitDisplay] = js.native
  var useGrouping: js.UndefOr[Boolean] = js.native
  var value: Double = js.native
}

object UnifiedNumberFormatOption {
  @scala.inline
  def apply(value: Double): UnifiedNumberFormatOption = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnifiedNumberFormatOption]
  }
  @scala.inline
  implicit class UnifiedNumberFormatOptionOps[Self <: UnifiedNumberFormatOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCompactDisplay(value: UnifiedNumberFormatOptionsCompactDisplay): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compactDisplay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompactDisplay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compactDisplay")(js.undefined)
        ret
    }
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
    def withCurrencyDisplay(value: String with UnifiedNumberFormatOptionsCurrencyDisplay): Self = {
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
    def withCurrencySign(value: UnifiedNumberFormatOptionsCurrencySign): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currencySign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrencySign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currencySign")(js.undefined)
        ret
    }
    @scala.inline
    def withFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.undefined)
        ret
    }
    @scala.inline
    def withLocaleMatcher(value: String with UnifiedNumberFormatOptionsLocaleMatcher): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localeMatcher")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocaleMatcher: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localeMatcher")(js.undefined)
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
    def withMaximumSignificantDigits(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumSignificantDigits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaximumSignificantDigits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumSignificantDigits")(js.undefined)
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
    def withMinimumSignificantDigits(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumSignificantDigits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinimumSignificantDigits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumSignificantDigits")(js.undefined)
        ret
    }
    @scala.inline
    def withNotation(value: UnifiedNumberFormatOptionsNotation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notation")(js.undefined)
        ret
    }
    @scala.inline
    def withSignDisplay(value: UnifiedNumberFormatOptionsSignDisplay): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signDisplay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSignDisplay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signDisplay")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: String with UnifiedNumberFormatOptionsStyle): Self = {
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
    def withUnit(value: Unit): Self = {
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
    def withUnitDisplay(value: UnifiedNumberFormatOptionsUnitDisplay): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unitDisplay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnitDisplay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unitDisplay")(js.undefined)
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

