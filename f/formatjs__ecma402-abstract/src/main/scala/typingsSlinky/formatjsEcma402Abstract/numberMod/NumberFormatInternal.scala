package typingsSlinky.formatjsEcma402Abstract.numberMod

import typingsSlinky.formatjsEcma402Abstract.anon.FnCallValue
import typingsSlinky.std.Intl.PluralRules
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NumberFormatInternal extends NumberFormatDigitInternalSlots {
  
  var boundFormat: js.UndefOr[FnCallValue] = js.native
  
  var compactDisplay: NumberFormatOptionsCompactDisplay = js.native
  
  var currency: js.UndefOr[String] = js.native
  
  var currencyDisplay: NumberFormatOptionsCurrencyDisplay = js.native
  
  var currencySign: NumberFormatOptionsCurrencySign = js.native
  
  var dataLocale: String = js.native
  
  var dataLocaleData: NumberFormatLocaleInternalData = js.native
  
  var locale: String = js.native
  
  @JSName("notation")
  var notation_NumberFormatInternal: NumberFormatOptionsNotation = js.native
  
  var numberingSystem: String = js.native
  
  var pl: PluralRules = js.native
  
  var signDisplay: NumberFormatOptionsSignDisplay = js.native
  
  var style: NumberFormatOptionsStyle = js.native
  
  var unit: js.UndefOr[String] = js.native
  
  var unitDisplay: NumberFormatOptionsUnitDisplay = js.native
  
  var useGrouping: Boolean = js.native
}
object NumberFormatInternal {
  
  @scala.inline
  def apply(
    compactDisplay: NumberFormatOptionsCompactDisplay,
    currencyDisplay: NumberFormatOptionsCurrencyDisplay,
    currencySign: NumberFormatOptionsCurrencySign,
    dataLocale: String,
    dataLocaleData: NumberFormatLocaleInternalData,
    locale: String,
    minimumIntegerDigits: Double,
    notation: NumberFormatOptionsNotation,
    numberingSystem: String,
    pl: PluralRules,
    roundingType: NumberFormatRoundingType,
    signDisplay: NumberFormatOptionsSignDisplay,
    style: NumberFormatOptionsStyle,
    unitDisplay: NumberFormatOptionsUnitDisplay,
    useGrouping: Boolean
  ): NumberFormatInternal = {
    val __obj = js.Dynamic.literal(compactDisplay = compactDisplay.asInstanceOf[js.Any], currencyDisplay = currencyDisplay.asInstanceOf[js.Any], currencySign = currencySign.asInstanceOf[js.Any], dataLocale = dataLocale.asInstanceOf[js.Any], dataLocaleData = dataLocaleData.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], minimumIntegerDigits = minimumIntegerDigits.asInstanceOf[js.Any], notation = notation.asInstanceOf[js.Any], numberingSystem = numberingSystem.asInstanceOf[js.Any], pl = pl.asInstanceOf[js.Any], roundingType = roundingType.asInstanceOf[js.Any], signDisplay = signDisplay.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], unitDisplay = unitDisplay.asInstanceOf[js.Any], useGrouping = useGrouping.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumberFormatInternal]
  }
  
  @scala.inline
  implicit class NumberFormatInternalMutableBuilder[Self <: NumberFormatInternal] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBoundFormat(value: FnCallValue): Self = StObject.set(x, "boundFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoundFormatUndefined: Self = StObject.set(x, "boundFormat", js.undefined)
    
    @scala.inline
    def setCompactDisplay(value: NumberFormatOptionsCompactDisplay): Self = StObject.set(x, "compactDisplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrencyDisplay(value: NumberFormatOptionsCurrencyDisplay): Self = StObject.set(x, "currencyDisplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrencySign(value: NumberFormatOptionsCurrencySign): Self = StObject.set(x, "currencySign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
    
    @scala.inline
    def setDataLocale(value: String): Self = StObject.set(x, "dataLocale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataLocaleData(value: NumberFormatLocaleInternalData): Self = StObject.set(x, "dataLocaleData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotation(value: NumberFormatOptionsNotation): Self = StObject.set(x, "notation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberingSystem(value: String): Self = StObject.set(x, "numberingSystem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPl(value: PluralRules): Self = StObject.set(x, "pl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignDisplay(value: NumberFormatOptionsSignDisplay): Self = StObject.set(x, "signDisplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyle(value: NumberFormatOptionsStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnit(value: String): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnitDisplay(value: NumberFormatOptionsUnitDisplay): Self = StObject.set(x, "unitDisplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
    
    @scala.inline
    def setUseGrouping(value: Boolean): Self = StObject.set(x, "useGrouping", value.asInstanceOf[js.Any])
  }
}
