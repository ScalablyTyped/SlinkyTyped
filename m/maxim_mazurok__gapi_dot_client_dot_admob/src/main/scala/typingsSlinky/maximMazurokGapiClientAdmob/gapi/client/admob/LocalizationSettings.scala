package typingsSlinky.maximMazurokGapiClientAdmob.gapi.client.admob

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocalizationSettings extends StObject {
  
  /**
    * Currency code of the earning related metrics, which is the 3-letter code defined in ISO 4217. The daily average rate is used for the currency conversion. Defaults to the account
    * currency code if unspecified.
    */
  var currencyCode: js.UndefOr[String] = js.native
  
  /** Language used for any localized text, such as some dimension value display labels. The language tag defined in the IETF BCP47. Defaults to 'en-US' if unspecified. */
  var languageCode: js.UndefOr[String] = js.native
}
object LocalizationSettings {
  
  @scala.inline
  def apply(): LocalizationSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocalizationSettings]
  }
  
  @scala.inline
  implicit class LocalizationSettingsMutableBuilder[Self <: LocalizationSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrencyCode(value: String): Self = StObject.set(x, "currencyCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrencyCodeUndefined: Self = StObject.set(x, "currencyCode", js.undefined)
    
    @scala.inline
    def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageCodeUndefined: Self = StObject.set(x, "languageCode", js.undefined)
  }
}
