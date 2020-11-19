package typingsSlinky.googleapis.v1p2beta1Mod.videointelligenceV1p2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides &quot;hints&quot; to the speech recognizer to favor specific words
  * and phrases in the results.
  */
@js.native
trait SchemaGoogleCloudVideointelligenceV1p2beta1SpeechContext extends js.Object {
  
  /**
    * *Optional* A list of strings containing words and phrases
    * &quot;hints&quot; so that the speech recognition is more likely to
    * recognize them. This can be used to improve the accuracy for specific
    * words and phrases, for example, if specific commands are typically spoken
    * by the user. This can also be used to add additional words to the
    * vocabulary of the recognizer. See [usage
    * limits](https://cloud.google.com/speech/limits#content).
    */
  var phrases: js.UndefOr[js.Array[String]] = js.native
}
object SchemaGoogleCloudVideointelligenceV1p2beta1SpeechContext {
  
  @scala.inline
  def apply(): SchemaGoogleCloudVideointelligenceV1p2beta1SpeechContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVideointelligenceV1p2beta1SpeechContext]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudVideointelligenceV1p2beta1SpeechContextOps[Self <: SchemaGoogleCloudVideointelligenceV1p2beta1SpeechContext] (val x: Self) extends AnyVal {
    
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
    def setPhrasesVarargs(value: String*): Self = this.set("phrases", js.Array(value :_*))
    
    @scala.inline
    def setPhrases(value: js.Array[String]): Self = this.set("phrases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePhrases: Self = this.set("phrases", js.undefined)
  }
}
