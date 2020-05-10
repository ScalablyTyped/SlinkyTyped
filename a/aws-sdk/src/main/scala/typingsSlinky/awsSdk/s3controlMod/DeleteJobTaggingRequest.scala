package typingsSlinky.awsSdk.s3controlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteJobTaggingRequest extends js.Object {
  /**
    * The account ID for the Amazon Web Services account associated with the Amazon S3 batch operations job you want to remove tags from.
    */
  var AccountId: typingsSlinky.awsSdk.s3controlMod.AccountId = js.native
  /**
    * The ID for the job whose tags you want to delete.
    */
  var JobId: typingsSlinky.awsSdk.s3controlMod.JobId = js.native
}

object DeleteJobTaggingRequest {
  @scala.inline
  def apply(AccountId: AccountId, JobId: JobId): DeleteJobTaggingRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], JobId = JobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteJobTaggingRequest]
  }
  @scala.inline
  implicit class DeleteJobTaggingRequestOps[Self <: DeleteJobTaggingRequest] (val x: Self) extends AnyVal {
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
  }
  
}

