package typingsSlinky.awsSdk.comprehendmedicalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartPHIDetectionJobResponse extends js.Object {
  /**
    * The identifier generated for the job. To get the status of a job, use this identifier with the DescribePHIDetectionJob operation.
    */
  var JobId: js.UndefOr[typingsSlinky.awsSdk.comprehendmedicalMod.JobId] = js.native
}

object StartPHIDetectionJobResponse {
  @scala.inline
  def apply(): StartPHIDetectionJobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartPHIDetectionJobResponse]
  }
  @scala.inline
  implicit class StartPHIDetectionJobResponseOps[Self <: StartPHIDetectionJobResponse] (val x: Self) extends AnyVal {
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

