package typingsSlinky.maximMazurokGapiClientGmail.gapi.client.gmail

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LanguageSettings extends StObject {
  
  /**
    * The language to display Gmail in, formatted as an RFC 3066 Language Tag (for example `en-GB`, `fr` or `ja` for British English, French, or Japanese respectively). The set of
    * languages supported by Gmail evolves over time, so please refer to the "Language" dropdown in the Gmail settings for all available options, as described in the language settings
    * help article. A table of sample values is also provided in the Managing Language Settings guide Not all Gmail clients can display the same set of languages. In the case that a
    * user's display language is not available for use on a particular client, said client automatically chooses to display in the closest supported variant (or a reasonable default).
    */
  var displayLanguage: js.UndefOr[String] = js.native
}
object LanguageSettings {
  
  @scala.inline
  def apply(): LanguageSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LanguageSettings]
  }
  
  @scala.inline
  implicit class LanguageSettingsMutableBuilder[Self <: LanguageSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayLanguage(value: String): Self = StObject.set(x, "displayLanguage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayLanguageUndefined: Self = StObject.set(x, "displayLanguage", js.undefined)
  }
}
