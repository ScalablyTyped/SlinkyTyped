package typingsSlinky.chromeApps.chrome.i18n

import typingsSlinky.chromeApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Holds detected ISO language code and its percentage in the input string */
@js.native
trait DetectedLanguage extends js.Object {
  
  /**
    * An ISO language code such as 'en' or 'fr'.
    * For a complete list of languages supported by this method:
    * @see [kLanguageInfoTable]{@link https://src.chromium.org/viewvc/chrome/trunk/src/third_party/cld/languages/internal/languages.cc}.
    * For an unknown language, 'und' will be returned, which means that [percentage] of the text is unknown to CLD */
  var language: kLanguageInfoTable = js.native
  
  /** The percentage of the detected language */
  var percentage: integer = js.native
}
object DetectedLanguage {
  
  @scala.inline
  def apply(language: kLanguageInfoTable, percentage: integer): DetectedLanguage = {
    val __obj = js.Dynamic.literal(language = language.asInstanceOf[js.Any], percentage = percentage.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetectedLanguage]
  }
  
  @scala.inline
  implicit class DetectedLanguageOps[Self <: DetectedLanguage] (val x: Self) extends AnyVal {
    
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
    def setLanguage(value: kLanguageInfoTable): Self = this.set("language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPercentage(value: integer): Self = this.set("percentage", value.asInstanceOf[js.Any])
  }
}
