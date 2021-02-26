package typingsSlinky.reactIntl.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.formatjsEcma402Abstract.typesNumberMod.NumberFormatOptionsCompactDisplay
import typingsSlinky.formatjsEcma402Abstract.typesNumberMod.NumberFormatOptionsCurrencyDisplay
import typingsSlinky.formatjsEcma402Abstract.typesNumberMod.NumberFormatOptionsCurrencySign
import typingsSlinky.formatjsEcma402Abstract.typesNumberMod.NumberFormatOptionsLocaleMatcher
import typingsSlinky.formatjsEcma402Abstract.typesNumberMod.NumberFormatOptionsNotation
import typingsSlinky.formatjsEcma402Abstract.typesNumberMod.NumberFormatOptionsSignDisplay
import typingsSlinky.formatjsEcma402Abstract.typesNumberMod.NumberFormatOptionsStyle
import typingsSlinky.formatjsEcma402Abstract.typesNumberMod.NumberFormatOptionsUnitDisplay
import typingsSlinky.formatjsIntl.srcTypesMod.FormatNumberOptions
import typingsSlinky.reactIntl.anon.Value
import typingsSlinky.std.Intl.NumberFormatPart
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FormattedNumberParts {
  
  @scala.inline
  def apply(
    children: js.Array[NumberFormatPart] => ReactElement | Null,
    compactDisplay: js.UndefOr[String] with js.UndefOr[NumberFormatOptionsCompactDisplay],
    currencyDisplay: js.UndefOr[String] with js.UndefOr[NumberFormatOptionsCurrencyDisplay],
    currencySign: js.UndefOr[String] with js.UndefOr[NumberFormatOptionsCurrencySign],
    localeMatcher: js.UndefOr[String] with js.UndefOr[NumberFormatOptionsLocaleMatcher],
    notation: js.UndefOr[String] with js.UndefOr[NumberFormatOptionsNotation],
    signDisplay: js.UndefOr[String] with js.UndefOr[NumberFormatOptionsSignDisplay],
    style: js.UndefOr[String] with js.UndefOr[NumberFormatOptionsStyle],
    unitDisplay: js.UndefOr[String] with js.UndefOr[NumberFormatOptionsUnitDisplay],
    value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<react-intl.anon.FnCallValueOpts>[0] */ js.Any
  ): Builder = {
    val __props = js.Dynamic.literal(children = js.Any.fromFunction1(children), compactDisplay = compactDisplay.asInstanceOf[js.Any], currencyDisplay = currencyDisplay.asInstanceOf[js.Any], currencySign = currencySign.asInstanceOf[js.Any], localeMatcher = localeMatcher.asInstanceOf[js.Any], notation = notation.asInstanceOf[js.Any], signDisplay = signDisplay.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], unitDisplay = unitDisplay.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[FormatNumberOptions with Value]))
  }
  
  @JSImport("react-intl", "FormattedNumberParts")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def currency(value: String): this.type = set("currency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def format(value: String): this.type = set("format", value.asInstanceOf[js.Any])
    
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
    def numberingSystem(value: String): this.type = set("numberingSystem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def unit(value: String): this.type = set("unit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def useGrouping(value: Boolean): this.type = set("useGrouping", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: FormatNumberOptions with Value): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
