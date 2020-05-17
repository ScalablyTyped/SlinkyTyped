package typingsSlinky.reactIntl.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.formatjsIntlUnifiedNumberformat.mod.Unit
import typingsSlinky.formatjsIntlUtils.unifiedNumberformatTypesMod.UnifiedNumberFormatOptionsCompactDisplay
import typingsSlinky.formatjsIntlUtils.unifiedNumberformatTypesMod.UnifiedNumberFormatOptionsCurrencyDisplay
import typingsSlinky.formatjsIntlUtils.unifiedNumberformatTypesMod.UnifiedNumberFormatOptionsCurrencySign
import typingsSlinky.formatjsIntlUtils.unifiedNumberformatTypesMod.UnifiedNumberFormatOptionsLocaleMatcher
import typingsSlinky.formatjsIntlUtils.unifiedNumberformatTypesMod.UnifiedNumberFormatOptionsNotation
import typingsSlinky.formatjsIntlUtils.unifiedNumberformatTypesMod.UnifiedNumberFormatOptionsSignDisplay
import typingsSlinky.formatjsIntlUtils.unifiedNumberformatTypesMod.UnifiedNumberFormatOptionsStyle
import typingsSlinky.formatjsIntlUtils.unifiedNumberformatTypesMod.UnifiedNumberFormatOptionsUnitDisplay
import typingsSlinky.reactIntl.anon.`3`
import typingsSlinky.reactIntl.mod.FormatNumberOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object FormattedNumberParts {
  @JSImport("react-intl", "FormattedNumberParts")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    @scala.inline
    def compactDisplay(value: UnifiedNumberFormatOptionsCompactDisplay): this.type = set("compactDisplay", value.asInstanceOf[js.Any])
    @scala.inline
    def currency(value: String): this.type = set("currency", value.asInstanceOf[js.Any])
    @scala.inline
    def currencyDisplay(value: String with UnifiedNumberFormatOptionsCurrencyDisplay): this.type = set("currencyDisplay", value.asInstanceOf[js.Any])
    @scala.inline
    def currencySign(value: UnifiedNumberFormatOptionsCurrencySign): this.type = set("currencySign", value.asInstanceOf[js.Any])
    @scala.inline
    def format(value: String): this.type = set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def localeMatcher(value: String with UnifiedNumberFormatOptionsLocaleMatcher): this.type = set("localeMatcher", value.asInstanceOf[js.Any])
    @scala.inline
    def maximumFractionDigits(value: Double): this.type = set("maximumFractionDigits", value.asInstanceOf[js.Any])
    @scala.inline
    def maximumSignificantDigits(value: Double): this.type = set("maximumSignificantDigits", value.asInstanceOf[js.Any])
    @scala.inline
    def minimumFractionDigits(value: Double): this.type = set("minimumFractionDigits", value.asInstanceOf[js.Any])
    @scala.inline
    def minimumIntegerDigits(value: Double): this.type = set("minimumIntegerDigits", value.asInstanceOf[js.Any])
    @scala.inline
    def minimumSignificantDigits(value: Double): this.type = set("minimumSignificantDigits", value.asInstanceOf[js.Any])
    @scala.inline
    def notation(value: UnifiedNumberFormatOptionsNotation): this.type = set("notation", value.asInstanceOf[js.Any])
    @scala.inline
    def signDisplay(value: UnifiedNumberFormatOptionsSignDisplay): this.type = set("signDisplay", value.asInstanceOf[js.Any])
    @scala.inline
    def style(value: String with UnifiedNumberFormatOptionsStyle): this.type = set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def unit(value: Unit): this.type = set("unit", value.asInstanceOf[js.Any])
    @scala.inline
    def unitDisplay(value: UnifiedNumberFormatOptionsUnitDisplay): this.type = set("unitDisplay", value.asInstanceOf[js.Any])
    @scala.inline
    def useGrouping(value: Boolean): this.type = set("useGrouping", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: FormatNumberOptions with `3`): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(
    value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<std.Intl.NumberFormat['format']>[0], opts ? : react-intl.react-intl.FormatNumberOptions): string>[0] */ js.Any
  ): Builder = {
    val __props = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[FormatNumberOptions with `3`]))
  }
}

