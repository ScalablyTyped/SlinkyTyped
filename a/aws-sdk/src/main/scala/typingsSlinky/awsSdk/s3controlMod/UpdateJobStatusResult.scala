package typingsSlinky.awsSdk.s3controlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateJobStatusResult extends js.Object {
  /**
    * The ID for the job whose status was updated.
    */
  var JobId: js.UndefOr[typingsSlinky.awsSdk.s3controlMod.JobId] = js.native
  /**
    * The current status for the specified job.
    */
  var Status: js.UndefOr[JobStatus] = js.native
  /**
    * The reason that the specified job's status was updated.
    */
  var StatusUpdateReason: js.UndefOr[JobStatusUpdateReason] = js.native
}

object UpdateJobStatusResult {
  @scala.inline
  def apply(): UpdateJobStatusResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateJobStatusResult]
  }
  @scala.inline
  implicit class UpdateJobStatusResultOps[Self <: UpdateJobStatusResult] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withStatus(value: JobStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(js.undefined)
        ret
    }
    @scala.inline
    def withStatusUpdateReason(value: JobStatusUpdateReason): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StatusUpdateReason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatusUpdateReason: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StatusUpdateReason")(js.undefined)
        ret
    }
  }
  
}

