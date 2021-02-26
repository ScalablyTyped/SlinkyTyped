package typingsSlinky.googleapis.visionV1p1beta1Mod.visionV1p1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Detected language for a structural component.
  */
@js.native
trait SchemaDetectedLanguage extends StObject {
  
  /**
    * Confidence of detected language. Range [0, 1].
    */
  var confidence: js.UndefOr[Double] = js.native
  
  /**
    * The BCP-47 language code, such as &quot;en-US&quot; or
    * &quot;sr-Latn&quot;. For more information, see
    * http://www.unicode.org/reports/tr35/#Unicode_locale_identifier.
    */
  var languageCode: js.UndefOr[String] = js.native
}
object SchemaDetectedLanguage {
  
  @scala.inline
  def apply(): SchemaDetectedLanguage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDetectedLanguage]
  }
  
  @scala.inline
  implicit class SchemaDetectedLanguageMutableBuilder[Self <: SchemaDetectedLanguage] (val x: Self) extends AnyVal {
    
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
