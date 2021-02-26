package typingsSlinky.maximMazurokGapiClientVideointelligence.gapi.client.videointelligence

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudVideointelligenceV1p3beta1SpeechRecognitionAlternative extends StObject {
  
  /**
    * Output only. The confidence estimate between 0.0 and 1.0. A higher number indicates an estimated greater likelihood that the recognized words are correct. This field is set only for
    * the top alternative. This field is not guaranteed to be accurate and users should not rely on it to be always provided. The default of 0.0 is a sentinel value indicating
    * `confidence` was not set.
    */
  var confidence: js.UndefOr[Double] = js.native
  
  /** Transcript text representing the words that the user spoke. */
  var transcript: js.UndefOr[String] = js.native
  
  /**
    * Output only. A list of word-specific information for each recognized word. Note: When `enable_speaker_diarization` is set to true, you will see all the words from the beginning of
    * the audio.
    */
  var words: js.UndefOr[js.Array[GoogleCloudVideointelligenceV1p3beta1WordInfo]] = js.native
}
object GoogleCloudVideointelligenceV1p3beta1SpeechRecognitionAlternative {
  
  @scala.inline
  def apply(): GoogleCloudVideointelligenceV1p3beta1SpeechRecognitionAlternative = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVideointelligenceV1p3beta1SpeechRecognitionAlternative]
  }
  
  @scala.inline
  implicit class GoogleCloudVideointelligenceV1p3beta1SpeechRecognitionAlternativeMutableBuilder[Self <: GoogleCloudVideointelligenceV1p3beta1SpeechRecognitionAlternative] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfidence(value: Double): Self = StObject.set(x, "confidence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfidenceUndefined: Self = StObject.set(x, "confidence", js.undefined)
    
    @scala.inline
    def setTranscript(value: String): Self = StObject.set(x, "transcript", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTranscriptUndefined: Self = StObject.set(x, "transcript", js.undefined)
    
    @scala.inline
    def setWords(value: js.Array[GoogleCloudVideointelligenceV1p3beta1WordInfo]): Self = StObject.set(x, "words", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordsUndefined: Self = StObject.set(x, "words", js.undefined)
    
    @scala.inline
    def setWordsVarargs(value: GoogleCloudVideointelligenceV1p3beta1WordInfo*): Self = StObject.set(x, "words", js.Array(value :_*))
  }
}
