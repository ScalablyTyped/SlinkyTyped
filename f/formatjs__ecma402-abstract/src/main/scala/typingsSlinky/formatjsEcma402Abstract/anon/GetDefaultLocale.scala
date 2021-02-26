package typingsSlinky.formatjsEcma402Abstract.anon

import typingsSlinky.formatjsEcma402Abstract.typesNumberMod.NumberFormatInternal
import typingsSlinky.formatjsEcma402Abstract.typesNumberMod.NumberFormatLocaleInternalData
import typingsSlinky.std.Intl.NumberFormat
import typingsSlinky.std.Record
import typingsSlinky.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetDefaultLocale extends StObject {
  
  var availableLocales: Set[String] = js.native
  
  var currencyDigitsData: Record[String, Double] = js.native
  
  def getDefaultLocale(): String = js.native
  
  def getInternalSlots(nf: NumberFormat): NumberFormatInternal = js.native
  
  var localeData: Record[String, js.UndefOr[NumberFormatLocaleInternalData]] = js.native
  
  var numberingSystemNames: js.Array[String] = js.native
}
object GetDefaultLocale {
  
  @scala.inline
  def apply(
    availableLocales: Set[String],
    currencyDigitsData: Record[String, Double],
    getDefaultLocale: () => String,
    getInternalSlots: NumberFormat => NumberFormatInternal,
    localeData: Record[String, js.UndefOr[NumberFormatLocaleInternalData]],
    numberingSystemNames: js.Array[String]
  ): GetDefaultLocale = {
    val __obj = js.Dynamic.literal(availableLocales = availableLocales.asInstanceOf[js.Any], currencyDigitsData = currencyDigitsData.asInstanceOf[js.Any], getDefaultLocale = js.Any.fromFunction0(getDefaultLocale), getInternalSlots = js.Any.fromFunction1(getInternalSlots), localeData = localeData.asInstanceOf[js.Any], numberingSystemNames = numberingSystemNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDefaultLocale]
  }
  
  @scala.inline
  implicit class GetDefaultLocaleMutableBuilder[Self <: GetDefaultLocale] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAvailableLocales(value: Set[String]): Self = StObject.set(x, "availableLocales", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrencyDigitsData(value: Record[String, Double]): Self = StObject.set(x, "currencyDigitsData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetDefaultLocale(value: () => String): Self = StObject.set(x, "getDefaultLocale", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetInternalSlots(value: NumberFormat => NumberFormatInternal): Self = StObject.set(x, "getInternalSlots", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLocaleData(value: Record[String, js.UndefOr[NumberFormatLocaleInternalData]]): Self = StObject.set(x, "localeData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberingSystemNames(value: js.Array[String]): Self = StObject.set(x, "numberingSystemNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberingSystemNamesVarargs(value: String*): Self = StObject.set(x, "numberingSystemNames", js.Array(value :_*))
  }
}
