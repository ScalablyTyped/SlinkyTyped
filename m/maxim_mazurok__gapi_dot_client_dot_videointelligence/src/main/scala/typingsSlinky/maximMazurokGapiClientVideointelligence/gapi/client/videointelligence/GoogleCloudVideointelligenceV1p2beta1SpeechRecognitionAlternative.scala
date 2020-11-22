package typingsSlinky.maximMazurokGapiClientVideointelligence.gapi.client.videointelligence

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudVideointelligenceV1p2beta1SpeechRecognitionAlternative extends js.Object {
  
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
  var words: js.UndefOr[js.Array[GoogleCloudVideointelligenceV1p2beta1WordInfo]] = js.native
}
object GoogleCloudVideointelligenceV1p2beta1SpeechRecognitionAlternative {
  
  @scala.inline
  def apply(): GoogleCloudVideointelligenceV1p2beta1SpeechRecognitionAlternative = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVideointelligenceV1p2beta1SpeechRecognitionAlternative]
  }
  
  @scala.inline
  implicit class GoogleCloudVideointelligenceV1p2beta1SpeechRecognitionAlternativeOps[Self <: GoogleCloudVideointelligenceV1p2beta1SpeechRecognitionAlternative] (val x: Self) extends AnyVal {
    
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
    def setConfidence(value: Double): Self = this.set("confidence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfidence: Self = this.set("confidence", js.undefined)
    
    @scala.inline
    def setTranscript(value: String): Self = this.set("transcript", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTranscript: Self = this.set("transcript", js.undefined)
    
    @scala.inline
    def setWordsVarargs(value: GoogleCloudVideointelligenceV1p2beta1WordInfo*): Self = this.set("words", js.Array(value :_*))
    
    @scala.inline
    def setWords(value: js.Array[GoogleCloudVideointelligenceV1p2beta1WordInfo]): Self = this.set("words", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWords: Self = this.set("words", js.undefined)
  }
}
