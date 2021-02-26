package typingsSlinky.maximMazurokGapiClientTranslate.gapi.client.translate

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DetectedLanguage extends StObject {
  
  /** The confidence of the detection result for this language. */
  var confidence: js.UndefOr[Double] = js.native
  
  /** The BCP-47 language code of source content in the request, detected automatically. */
  var languageCode: js.UndefOr[String] = js.native
}
object DetectedLanguage {
  
  @scala.inline
  def apply(): DetectedLanguage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DetectedLanguage]
  }
  
  @scala.inline
  implicit class DetectedLanguageMutableBuilder[Self <: DetectedLanguage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfidence(value: Double): Self = StObject.set(x, "confidence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfidenceUndefined: Self = StObject.set(x, "confidence", js.undefined)
    
    @scala.inline
    def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageCodeUndefined: Self = StObject.set(x, "languageCode", js.undefined)
  }
}
