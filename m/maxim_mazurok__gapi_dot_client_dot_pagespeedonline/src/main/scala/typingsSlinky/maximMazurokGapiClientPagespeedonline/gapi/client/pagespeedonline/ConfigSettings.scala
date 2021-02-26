package typingsSlinky.maximMazurokGapiClientPagespeedonline.gapi.client.pagespeedonline

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConfigSettings extends StObject {
  
  /** How Lighthouse was run, e.g. from the Chrome extension or from the npm module. */
  var channel: js.UndefOr[String] = js.native
  
  /** The form factor the emulation should use. */
  var emulatedFormFactor: js.UndefOr[String] = js.native
  
  /** The locale setting. */
  var locale: js.UndefOr[String] = js.native
  
  /** List of categories of audits the run should conduct. */
  var onlyCategories: js.UndefOr[js.Any] = js.native
}
object ConfigSettings {
  
  @scala.inline
  def apply(): ConfigSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigSettings]
  }
  
  @scala.inline
  implicit class ConfigSettingsMutableBuilder[Self <: ConfigSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannel(value: String): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelUndefined: Self = StObject.set(x, "channel", js.undefined)
    
    @scala.inline
    def setEmulatedFormFactor(value: String): Self = StObject.set(x, "emulatedFormFactor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmulatedFormFactorUndefined: Self = StObject.set(x, "emulatedFormFactor", js.undefined)
    
    @scala.inline
    def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    @scala.inline
    def setOnlyCategories(value: js.Any): Self = StObject.set(x, "onlyCategories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnlyCategoriesUndefined: Self = StObject.set(x, "onlyCategories", js.undefined)
  }
}
