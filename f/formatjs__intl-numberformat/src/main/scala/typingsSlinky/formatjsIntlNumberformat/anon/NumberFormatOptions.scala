package typingsSlinky.formatjsIntlNumberformat.anon

import typingsSlinky.formatjsIntlNumberformat.typesMod.NumberFormatOptionsCompactDisplay
import typingsSlinky.formatjsIntlNumberformat.typesMod.NumberFormatOptionsCurrencyDisplay
import typingsSlinky.formatjsIntlNumberformat.typesMod.NumberFormatOptionsCurrencySign
import typingsSlinky.formatjsIntlNumberformat.typesMod.NumberFormatOptionsLocaleMatcher
import typingsSlinky.formatjsIntlNumberformat.typesMod.NumberFormatOptionsNotation
import typingsSlinky.formatjsIntlNumberformat.typesMod.NumberFormatOptionsSignDisplay
import typingsSlinky.formatjsIntlNumberformat.typesMod.NumberFormatOptionsStyle
import typingsSlinky.formatjsIntlNumberformat.typesMod.NumberFormatOptionsUnitDisplay
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined @formatjs/intl-numberformat.@formatjs/intl-numberformat.NumberFormatOptions */
@js.native
trait NumberFormatOptions extends js.Object {
  var compactDisplay: js.UndefOr[NumberFormatOptionsCompactDisplay] with js.UndefOr[typingsSlinky.formatjsIntlNumberformat.mod.NumberFormatOptionsCompactDisplay] = js.native
  var currency: js.UndefOr[String] = js.native
  var currencyDisplay: js.UndefOr[String] with js.UndefOr[NumberFormatOptionsCurrencyDisplay] with js.UndefOr[typingsSlinky.formatjsIntlNumberformat.mod.NumberFormatOptionsCurrencyDisplay] = js.native
  var currencySign: js.UndefOr[NumberFormatOptionsCurrencySign] with js.UndefOr[typingsSlinky.formatjsIntlNumberformat.mod.NumberFormatOptionsCurrencySign] = js.native
  var localeMatcher: js.UndefOr[String] with js.UndefOr[NumberFormatOptionsLocaleMatcher] with js.UndefOr[typingsSlinky.formatjsIntlNumberformat.mod.NumberFormatOptionsLocaleMatcher] = js.native
  var maximumFractionDigits: js.UndefOr[Double] = js.native
  var maximumSignificantDigits: js.UndefOr[Double] = js.native
  var minimumFractionDigits: js.UndefOr[Double] = js.native
  var minimumIntegerDigits: js.UndefOr[Double] = js.native
  var minimumSignificantDigits: js.UndefOr[Double] = js.native
  var notation: js.UndefOr[NumberFormatOptionsNotation] with js.UndefOr[typingsSlinky.formatjsIntlNumberformat.mod.NumberFormatOptionsNotation] = js.native
  var numberingSystem: js.UndefOr[String] = js.native
  var signDisplay: js.UndefOr[NumberFormatOptionsSignDisplay] with js.UndefOr[typingsSlinky.formatjsIntlNumberformat.mod.NumberFormatOptionsSignDisplay] = js.native
  var style: js.UndefOr[String] with js.UndefOr[NumberFormatOptionsStyle] with js.UndefOr[typingsSlinky.formatjsIntlNumberformat.mod.NumberFormatOptionsStyle] = js.native
  var unit: js.UndefOr[String] = js.native
  var unitDisplay: js.UndefOr[NumberFormatOptionsUnitDisplay] with js.UndefOr[typingsSlinky.formatjsIntlNumberformat.mod.NumberFormatOptionsUnitDisplay] = js.native
  var useGrouping: js.UndefOr[Boolean] = js.native
}

object NumberFormatOptions {
  @scala.inline
  def apply(
    currencyDisplay: js.UndefOr[String] with js.UndefOr[NumberFormatOptionsCurrencyDisplay] with js.UndefOr[typingsSlinky.formatjsIntlNumberformat.mod.NumberFormatOptionsCurrencyDisplay],
    localeMatcher: js.UndefOr[String] with js.UndefOr[NumberFormatOptionsLocaleMatcher] with js.UndefOr[typingsSlinky.formatjsIntlNumberformat.mod.NumberFormatOptionsLocaleMatcher],
    notation: js.UndefOr[NumberFormatOptionsNotation] with js.UndefOr[typingsSlinky.formatjsIntlNumberformat.mod.NumberFormatOptionsNotation],
    style: js.UndefOr[String] with js.UndefOr[NumberFormatOptionsStyle] with js.UndefOr[typingsSlinky.formatjsIntlNumberformat.mod.NumberFormatOptionsStyle]
  ): NumberFormatOptions = {
    val __obj = js.Dynamic.literal(currencyDisplay = currencyDisplay.asInstanceOf[js.Any], localeMatcher = localeMatcher.asInstanceOf[js.Any], notation = notation.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumberFormatOptions]
  }
  @scala.inline
  implicit class NumberFormatOptionsOps[Self <: NumberFormatOptions] (val x: Self) extends AnyVal {
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
    def setCurrencyDisplay(
      value: js.UndefOr[String] with js.UndefOr[NumberFormatOptionsCurrencyDisplay] with js.UndefOr[typingsSlinky.formatjsIntlNumberformat.mod.NumberFormatOptionsCurrencyDisplay]
    ): Self = this.set("currencyDisplay", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocaleMatcher(
      value: js.UndefOr[String] with js.UndefOr[NumberFormatOptionsLocaleMatcher] with js.UndefOr[typingsSlinky.formatjsIntlNumberformat.mod.NumberFormatOptionsLocaleMatcher]
    ): Self = this.set("localeMatcher", value.asInstanceOf[js.Any])
    @scala.inline
    def setNotation(
      value: js.UndefOr[NumberFormatOptionsNotation] with js.UndefOr[typingsSlinky.formatjsIntlNumberformat.mod.NumberFormatOptionsNotation]
    ): Self = this.set("notation", value.asInstanceOf[js.Any])
    @scala.inline
    def setStyle(
      value: js.UndefOr[String] with js.UndefOr[NumberFormatOptionsStyle] with js.UndefOr[typingsSlinky.formatjsIntlNumberformat.mod.NumberFormatOptionsStyle]
    ): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def setCompactDisplay(
      value: js.UndefOr[NumberFormatOptionsCompactDisplay] with js.UndefOr[typingsSlinky.formatjsIntlNumberformat.mod.NumberFormatOptionsCompactDisplay]
    ): Self = this.set("compactDisplay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompactDisplay: Self = this.set("compactDisplay", js.undefined)
    @scala.inline
    def setCurrency(value: String): Self = this.set("currency", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrency: Self = this.set("currency", js.undefined)
    @scala.inline
    def setCurrencySign(
      value: js.UndefOr[NumberFormatOptionsCurrencySign] with js.UndefOr[typingsSlinky.formatjsIntlNumberformat.mod.NumberFormatOptionsCurrencySign]
    ): Self = this.set("currencySign", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrencySign: Self = this.set("currencySign", js.undefined)
    @scala.inline
    def setMaximumFractionDigits(value: Double): Self = this.set("maximumFractionDigits", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaximumFractionDigits: Self = this.set("maximumFractionDigits", js.undefined)
    @scala.inline
    def setMaximumSignificantDigits(value: Double): Self = this.set("maximumSignificantDigits", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaximumSignificantDigits: Self = this.set("maximumSignificantDigits", js.undefined)
    @scala.inline
    def setMinimumFractionDigits(value: Double): Self = this.set("minimumFractionDigits", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinimumFractionDigits: Self = this.set("minimumFractionDigits", js.undefined)
    @scala.inline
    def setMinimumIntegerDigits(value: Double): Self = this.set("minimumIntegerDigits", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinimumIntegerDigits: Self = this.set("minimumIntegerDigits", js.undefined)
    @scala.inline
    def setMinimumSignificantDigits(value: Double): Self = this.set("minimumSignificantDigits", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinimumSignificantDigits: Self = this.set("minimumSignificantDigits", js.undefined)
    @scala.inline
    def setNumberingSystem(value: String): Self = this.set("numberingSystem", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumberingSystem: Self = this.set("numberingSystem", js.undefined)
    @scala.inline
    def setSignDisplay(
      value: js.UndefOr[NumberFormatOptionsSignDisplay] with js.UndefOr[typingsSlinky.formatjsIntlNumberformat.mod.NumberFormatOptionsSignDisplay]
    ): Self = this.set("signDisplay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSignDisplay: Self = this.set("signDisplay", js.undefined)
    @scala.inline
    def setUnit(value: String): Self = this.set("unit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnit: Self = this.set("unit", js.undefined)
    @scala.inline
    def setUnitDisplay(
      value: js.UndefOr[NumberFormatOptionsUnitDisplay] with js.UndefOr[typingsSlinky.formatjsIntlNumberformat.mod.NumberFormatOptionsUnitDisplay]
    ): Self = this.set("unitDisplay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnitDisplay: Self = this.set("unitDisplay", js.undefined)
    @scala.inline
    def setUseGrouping(value: Boolean): Self = this.set("useGrouping", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseGrouping: Self = this.set("useGrouping", js.undefined)
  }
  
}

