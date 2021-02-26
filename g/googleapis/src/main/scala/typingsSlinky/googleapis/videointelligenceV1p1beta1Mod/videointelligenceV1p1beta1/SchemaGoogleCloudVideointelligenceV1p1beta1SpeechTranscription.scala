package typingsSlinky.googleapis.videointelligenceV1p1beta1Mod.videointelligenceV1p1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A speech recognition result corresponding to a portion of the audio.
  */
@js.native
trait SchemaGoogleCloudVideointelligenceV1p1beta1SpeechTranscription extends StObject {
  
  /**
    * May contain one or more recognition hypotheses (up to the maximum
    * specified in `max_alternatives`).  These alternatives are ordered in
    * terms of accuracy, with the top (first) alternative being the most
    * probable, as ranked by the recognizer.
    */
  var alternatives: js.UndefOr[
    js.Array[SchemaGoogleCloudVideointelligenceV1p1beta1SpeechRecognitionAlternative]
  ] = js.native
  
  /**
    * Output only. The [BCP-47](https://www.rfc-editor.org/rfc/bcp/bcp47.txt)
    * language tag of the language in this result. This language code was
    * detected to have the most likelihood of being spoken in the audio.
    */
  var languageCode: js.UndefOr[String] = js.native
}
object SchemaGoogleCloudVideointelligenceV1p1beta1SpeechTranscription {
  
  @scala.inline
  def apply(): SchemaGoogleCloudVideointelligenceV1p1beta1SpeechTranscription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVideointelligenceV1p1beta1SpeechTranscription]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudVideointelligenceV1p1beta1SpeechTranscriptionMutableBuilder[Self <: SchemaGoogleCloudVideointelligenceV1p1beta1SpeechTranscription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlternatives(value: js.Array[SchemaGoogleCloudVideointelligenceV1p1beta1SpeechRecognitionAlternative]): Self = StObject.set(x, "alternatives", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlternativesUndefined: Self = StObject.set(x, "alternatives", js.undefined)
    
    @scala.inline
    def setAlternativesVarargs(value: SchemaGoogleCloudVideointelligenceV1p1beta1SpeechRecognitionAlternative*): Self = StObject.set(x, "alternatives", js.Array(value :_*))
    
    @scala.inline
    def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageCodeUndefined: Self = StObject.set(x, "languageCode", js.undefined)
  }
}
