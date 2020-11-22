package typingsSlinky.maximMazurokGapiClientVideointelligence.gapi.client.videointelligence

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudVideointelligenceV1p3beta1SpeechTranscription extends js.Object {
  
  /**
    * May contain one or more recognition hypotheses (up to the maximum specified in `max_alternatives`). These alternatives are ordered in terms of accuracy, with the top (first)
    * alternative being the most probable, as ranked by the recognizer.
    */
  var alternatives: js.UndefOr[js.Array[GoogleCloudVideointelligenceV1p3beta1SpeechRecognitionAlternative]] = js.native
  
  /**
    * Output only. The [BCP-47](https://www.rfc-editor.org/rfc/bcp/bcp47.txt) language tag of the language in this result. This language code was detected to have the most likelihood of
    * being spoken in the audio.
    */
  var languageCode: js.UndefOr[String] = js.native
}
object GoogleCloudVideointelligenceV1p3beta1SpeechTranscription {
  
  @scala.inline
  def apply(): GoogleCloudVideointelligenceV1p3beta1SpeechTranscription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVideointelligenceV1p3beta1SpeechTranscription]
  }
  
  @scala.inline
  implicit class GoogleCloudVideointelligenceV1p3beta1SpeechTranscriptionOps[Self <: GoogleCloudVideointelligenceV1p3beta1SpeechTranscription] (val x: Self) extends AnyVal {
    
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
    def setAlternativesVarargs(value: GoogleCloudVideointelligenceV1p3beta1SpeechRecognitionAlternative*): Self = this.set("alternatives", js.Array(value :_*))
    
    @scala.inline
    def setAlternatives(value: js.Array[GoogleCloudVideointelligenceV1p3beta1SpeechRecognitionAlternative]): Self = this.set("alternatives", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlternatives: Self = this.set("alternatives", js.undefined)
    
    @scala.inline
    def setLanguageCode(value: String): Self = this.set("languageCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguageCode: Self = this.set("languageCode", js.undefined)
  }
}
