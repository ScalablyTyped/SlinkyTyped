package typingsSlinky.awsSdk.s3controlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateJobStatusRequest extends js.Object {
  /**
    * 
    */
  var AccountId: typingsSlinky.awsSdk.s3controlMod.AccountId = js.native
  /**
    * The ID of the job whose status you want to update.
    */
  var JobId: typingsSlinky.awsSdk.s3controlMod.JobId = js.native
  /**
    * The status that you want to move the specified job to.
    */
  var RequestedJobStatus: typingsSlinky.awsSdk.s3controlMod.RequestedJobStatus = js.native
  /**
    * A description of the reason why you want to change the specified job's status. This field can be any string up to the maximum length.
    */
  var StatusUpdateReason: js.UndefOr[JobStatusUpdateReason] = js.native
}

object UpdateJobStatusRequest {
  @scala.inline
  def apply(AccountId: AccountId, JobId: JobId, RequestedJobStatus: RequestedJobStatus): UpdateJobStatusRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], JobId = JobId.asInstanceOf[js.Any], RequestedJobStatus = RequestedJobStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateJobStatusRequest]
  }
  @scala.inline
  implicit class UpdateJobStatusRequestOps[Self <: UpdateJobStatusRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccountId(value: AccountId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccountId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJobId(value: JobId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JobId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequestedJobStatus(value: RequestedJobStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RequestedJobStatus")(value.asInstanceOf[js.Any])
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

