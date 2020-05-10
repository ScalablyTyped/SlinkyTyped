package typingsSlinky.formatjsIntlUnifiedNumberformat.mod

import typingsSlinky.formatjsIntlUtils.numberTypesMod.NumberFormatDigitInternalSlots
import typingsSlinky.formatjsIntlUtils.numberTypesMod.NumberFormatRoundingType
import typingsSlinky.formatjsIntlUtils.numberTypesMod.NumberILD
import typingsSlinky.formatjsIntlUtils.numberTypesMod.NumberLocalePatternData
import typingsSlinky.formatjsIntlUtils.unifiedNumberformatTypesMod.UnifiedNumberFormatOptionsCompactDisplay
import typingsSlinky.formatjsIntlUtils.unifiedNumberformatTypesMod.UnifiedNumberFormatOptionsCurrencyDisplay
import typingsSlinky.formatjsIntlUtils.unifiedNumberformatTypesMod.UnifiedNumberFormatOptionsCurrencySign
import typingsSlinky.formatjsIntlUtils.unifiedNumberformatTypesMod.UnifiedNumberFormatOptionsNotation
import typingsSlinky.formatjsIntlUtils.unifiedNumberformatTypesMod.UnifiedNumberFormatOptionsSignDisplay
import typingsSlinky.formatjsIntlUtils.unifiedNumberformatTypesMod.UnifiedNumberFormatOptionsStyle
import typingsSlinky.formatjsIntlUtils.unifiedNumberformatTypesMod.UnifiedNumberFormatOptionsUnitDisplay
import typingsSlinky.std.Intl.PluralRules
import typingsSlinky.std.NonNullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnifiedNumberFormatInternal extends NumberFormatDigitInternalSlots {
  var boundFormat: js.UndefOr[js.Function1[/* value */ Double, String]] = js.native
  var compactDisplay: NonNullable[js.UndefOr[UnifiedNumberFormatOptionsCompactDisplay]] = js.native
  var currency: js.UndefOr[String] = js.native
  var currencyDisplay: NonNullable[js.UndefOr[String] with js.UndefOr[UnifiedNumberFormatOptionsCurrencyDisplay]] = js.native
  var currencySign: NonNullable[js.UndefOr[UnifiedNumberFormatOptionsCurrencySign]] = js.native
  var dataLocale: String = js.native
  var ild: NumberILD = js.native
  var locale: String = js.native
  @JSName("notation")
  var notation_UnifiedNumberFormatInternal: NonNullable[js.UndefOr[UnifiedNumberFormatOptionsNotation]] = js.native
  var numberingSystem: String = js.native
  var patterns: NumberLocalePatternData = js.native
  var pl: PluralRules = js.native
  var signDisplay: NonNullable[js.UndefOr[UnifiedNumberFormatOptionsSignDisplay]] = js.native
  var style: NonNullable[js.UndefOr[String] with js.UndefOr[UnifiedNumberFormatOptionsStyle]] = js.native
  var unit: js.UndefOr[String] = js.native
  var unitDisplay: NonNullable[js.UndefOr[UnifiedNumberFormatOptionsUnitDisplay]] = js.native
  var useGrouping: Boolean = js.native
}

object UnifiedNumberFormatInternal {
  @scala.inline
  def apply(
    currencyDisplay: NonNullable[js.UndefOr[String] with js.UndefOr[UnifiedNumberFormatOptionsCurrencyDisplay]],
    dataLocale: String,
    ild: NumberILD,
    locale: String,
    minimumIntegerDigits: Double,
    numberingSystem: String,
    patterns: NumberLocalePatternData,
    pl: PluralRules,
    roundingType: NumberFormatRoundingType,
    style: NonNullable[js.UndefOr[String] with js.UndefOr[UnifiedNumberFormatOptionsStyle]],
    useGrouping: Boolean
  ): UnifiedNumberFormatInternal = {
    val __obj = js.Dynamic.literal(currencyDisplay = currencyDisplay.asInstanceOf[js.Any], dataLocale = dataLocale.asInstanceOf[js.Any], ild = ild.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], minimumIntegerDigits = minimumIntegerDigits.asInstanceOf[js.Any], numberingSystem = numberingSystem.asInstanceOf[js.Any], patterns = patterns.asInstanceOf[js.Any], pl = pl.asInstanceOf[js.Any], roundingType = roundingType.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], useGrouping = useGrouping.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnifiedNumberFormatInternal]
  }
  @scala.inline
  implicit class UnifiedNumberFormatInternalOps[Self <: UnifiedNumberFormatInternal] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrencyDisplay(value: NonNullable[js.UndefOr[String] with js.UndefOr[UnifiedNumberFormatOptionsCurrencyDisplay]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currencyDisplay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDataLocale(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataLocale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIld(value: NumberILD): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ild")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocale(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumberingSystem(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberingSystem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPatterns(value: NumberLocalePatternData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patterns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPl(value: PluralRules): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStyle(value: NonNullable[js.UndefOr[String] with js.UndefOr[UnifiedNumberFormatOptionsStyle]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUseGrouping(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useGrouping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBoundFormat(value: /* value */ Double => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boundFormat")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBoundFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boundFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withCompactDisplay(value: NonNullable[js.UndefOr[UnifiedNumberFormatOptionsCompactDisplay]]): Self = {
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
    def withCurrencySign(value: NonNullable[js.UndefOr[UnifiedNumberFormatOptionsCurrencySign]]): Self = {
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
    def withNotation(value: NonNullable[js.UndefOr[UnifiedNumberFormatOptionsNotation]]): Self = {
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
    def withSignDisplay(value: NonNullable[js.UndefOr[UnifiedNumberFormatOptionsSignDisplay]]): Self = {
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
    def withUnit(value: String): Self = {
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
    def withUnitDisplay(value: NonNullable[js.UndefOr[UnifiedNumberFormatOptionsUnitDisplay]]): Self = {
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
  }
  
}

