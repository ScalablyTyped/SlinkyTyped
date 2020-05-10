package typingsSlinky.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartPersonTrackingResponse extends js.Object {
  /**
    * The identifier for the person detection job. Use JobId to identify the job in a subsequent call to GetPersonTracking.
    */
  var JobId: js.UndefOr[typingsSlinky.awsSdk.rekognitionMod.JobId] = js.native
}

object StartPersonTrackingResponse {
  @scala.inline
  def apply(): StartPersonTrackingResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartPersonTrackingResponse]
  }
  @scala.inline
  implicit class StartPersonTrackingResponseOps[Self <: StartPersonTrackingResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withJobId(value: JobId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JobId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJobId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JobId")(js.undefined)
        ret
    }
  }
  
}

