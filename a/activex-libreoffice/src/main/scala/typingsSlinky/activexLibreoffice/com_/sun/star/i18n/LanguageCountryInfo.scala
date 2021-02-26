package typingsSlinky.activexLibreoffice.com_.sun.star.i18n

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The language and country identifiers and descriptive names of the loaded locale data returned by {@link XLocaleData.getLanguageCountryInfo()} .
  * @see XLocaleData for links to DTD of XML locale data files.
  */
@js.native
trait LanguageCountryInfo extends StObject {
  
  var Country: String = js.native
  
  var CountryDefaultName: String = js.native
  
  var Language: String = js.native
  
  var LanguageDefaultName: String = js.native
  
  var Variant: String = js.native
}
object LanguageCountryInfo {
  
  @scala.inline
  def apply(
    Country: String,
    CountryDefaultName: String,
    Language: String,
    LanguageDefaultName: String,
    Variant: String
  ): LanguageCountryInfo = {
    val __obj = js.Dynamic.literal(Country = Country.asInstanceOf[js.Any], CountryDefaultName = CountryDefaultName.asInstanceOf[js.Any], Language = Language.asInstanceOf[js.Any], LanguageDefaultName = LanguageDefaultName.asInstanceOf[js.Any], Variant = Variant.asInstanceOf[js.Any])
    __obj.asInstanceOf[LanguageCountryInfo]
  }
  
  @scala.inline
  implicit class LanguageCountryInfoMutableBuilder[Self <: LanguageCountryInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCountry(value: String): Self = StObject.set(x, "Country", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountryDefaultName(value: String): Self = StObject.set(x, "CountryDefaultName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguage(value: String): Self = StObject.set(x, "Language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageDefaultName(value: String): Self = StObject.set(x, "LanguageDefaultName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariant(value: String): Self = StObject.set(x, "Variant", value.asInstanceOf[js.Any])
  }
}
