package typingsSlinky.formatjsIntlUnifiedNumberformat.coreMod

import typingsSlinky.formatjsIntlUtils.unifiedNumberformatTypesMod.UnifiedNumberFormatOptionsCompactDisplay
import typingsSlinky.formatjsIntlUtils.unifiedNumberformatTypesMod.UnifiedNumberFormatOptionsCurrencySign
import typingsSlinky.formatjsIntlUtils.unifiedNumberformatTypesMod.UnifiedNumberFormatOptionsNotation
import typingsSlinky.formatjsIntlUtils.unifiedNumberformatTypesMod.UnifiedNumberFormatOptionsSignDisplay
import typingsSlinky.formatjsIntlUtils.unifiedNumberformatTypesMod.UnifiedNumberFormatOptionsUnitDisplay
import typingsSlinky.std.NonNullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Intl.ResolvedNumberFormatOptions & std.Pick<@formatjs/intl-unified-numberformat.@formatjs/intl-unified-numberformat/lib/core.UnifiedNumberFormatInternal, 'currencySign' | 'unit' | 'unitDisplay' | 'notation' | 'compactDisplay' | 'signDisplay'> */
@js.native
trait ResolvedUnifiedNumberFormatOptions extends js.Object {
  var compactDisplay: NonNullable[js.UndefOr[UnifiedNumberFormatOptionsCompactDisplay]] = js.native
  var currency: js.UndefOr[String] = js.native
  var currencyDisplay: js.UndefOr[String] = js.native
  var currencySign: NonNullable[js.UndefOr[UnifiedNumberFormatOptionsCurrencySign]] = js.native
  var locale: String = js.native
  var maximumFractionDigits: Double = js.native
  var maximumSignificantDigits: js.UndefOr[Double] = js.native
  var minimumFractionDigits: Double = js.native
  var minimumIntegerDigits: Double = js.native
  var minimumSignificantDigits: js.UndefOr[Double] = js.native
  var notation: NonNullable[js.UndefOr[UnifiedNumberFormatOptionsNotation]] = js.native
  var numberingSystem: String = js.native
  var signDisplay: NonNullable[js.UndefOr[UnifiedNumberFormatOptionsSignDisplay]] = js.native
  var style: String = js.native
  var unit: js.UndefOr[String] = js.native
  var unitDisplay: NonNullable[js.UndefOr[UnifiedNumberFormatOptionsUnitDisplay]] = js.native
  var useGrouping: Boolean = js.native
}

object ResolvedUnifiedNumberFormatOptions {
  @scala.inline
  def apply(
    locale: String,
    maximumFractionDigits: Double,
    minimumFractionDigits: Double,
    minimumIntegerDigits: Double,
    numberingSystem: String,
    style: String,
    useGrouping: Boolean
  ): ResolvedUnifiedNumberFormatOptions = {
    val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any], maximumFractionDigits = maximumFractionDigits.asInstanceOf[js.Any], minimumFractionDigits = minimumFractionDigits.asInstanceOf[js.Any], minimumIntegerDigits = minimumIntegerDigits.asInstanceOf[js.Any], numberingSystem = numberingSystem.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], useGrouping = useGrouping.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolvedUnifiedNumberFormatOptions]
  }
  @scala.inline
  implicit class ResolvedUnifiedNumberFormatOptionsOps[Self <: ResolvedUnifiedNumberFormatOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLocale(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaximumFractionDigits(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumFractionDigits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinimumFractionDigits(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumFractionDigits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinimumIntegerDigits(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumIntegerDigits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumberingSystem(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberingSystem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStyle(value: String): Self = {
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
    def withCurrencyDisplay(value: String): Self = {
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

