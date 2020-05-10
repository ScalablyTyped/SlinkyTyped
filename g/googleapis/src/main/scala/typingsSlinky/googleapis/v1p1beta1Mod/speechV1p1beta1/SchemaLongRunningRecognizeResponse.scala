package typingsSlinky.googleapis.v1p1beta1Mod.speechV1p1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The only message returned to the client by the `LongRunningRecognize`
  * method. It contains the result as zero or more sequential
  * `SpeechRecognitionResult` messages. It is included in the `result.response`
  * field of the `Operation` returned by the `GetOperation` call of the
  * `google::longrunning::Operations` service.
  */
@js.native
trait SchemaLongRunningRecognizeResponse extends js.Object {
  /**
    * Output only. Sequential list of transcription results corresponding to
    * sequential portions of audio.
    */
  var results: js.UndefOr[js.Array[SchemaSpeechRecognitionResult]] = js.native
}

object SchemaLongRunningRecognizeResponse {
  @scala.inline
  def apply(): SchemaLongRunningRecognizeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLongRunningRecognizeResponse]
  }
  @scala.inline
  implicit class SchemaLongRunningRecognizeResponseOps[Self <: SchemaLongRunningRecognizeResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResults(value: js.Array[SchemaSpeechRecognitionResult]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("results")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("results")(js.undefined)
        ret
    }
  }
  
}

