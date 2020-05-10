package typingsSlinky.awsSdk.transcribeserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetTranscriptionJobResponse extends js.Object {
  /**
    * An object that contains the results of the transcription job.
    */
  var TranscriptionJob: js.UndefOr[typingsSlinky.awsSdk.transcribeserviceMod.TranscriptionJob] = js.native
}

object GetTranscriptionJobResponse {
  @scala.inline
  def apply(): GetTranscriptionJobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetTranscriptionJobResponse]
  }
  @scala.inline
  implicit class GetTranscriptionJobResponseOps[Self <: GetTranscriptionJobResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTranscriptionJob(value: TranscriptionJob): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TranscriptionJob")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTranscriptionJob: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TranscriptionJob")(js.undefined)
        ret
    }
  }
  
}

