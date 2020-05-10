package typingsSlinky.awsSdk.comprehendmedicalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StopPHIDetectionJobRequest extends js.Object {
  /**
    * The identifier of the PHI detection job to stop.
    */
  var JobId: typingsSlinky.awsSdk.comprehendmedicalMod.JobId = js.native
}

object StopPHIDetectionJobRequest {
  @scala.inline
  def apply(JobId: JobId): StopPHIDetectionJobRequest = {
    val __obj = js.Dynamic.literal(JobId = JobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopPHIDetectionJobRequest]
  }
  @scala.inline
  implicit class StopPHIDetectionJobRequestOps[Self <: StopPHIDetectionJobRequest] (val x: Self) extends AnyVal {
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
  }
  
}

