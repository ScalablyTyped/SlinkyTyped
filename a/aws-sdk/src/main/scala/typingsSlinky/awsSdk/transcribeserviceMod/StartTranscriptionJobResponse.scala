package typingsSlinky.awsSdk.transcribeserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartTranscriptionJobResponse extends js.Object {
  /**
    * An object containing details of the asynchronous transcription job.
    */
  var TranscriptionJob: js.UndefOr[typingsSlinky.awsSdk.transcribeserviceMod.TranscriptionJob] = js.native
}

object StartTranscriptionJobResponse {
  @scala.inline
  def apply(): StartTranscriptionJobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartTranscriptionJobResponse]
  }
  @scala.inline
  implicit class StartTranscriptionJobResponseOps[Self <: StartTranscriptionJobResponse] (val x: Self) extends AnyVal {
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

