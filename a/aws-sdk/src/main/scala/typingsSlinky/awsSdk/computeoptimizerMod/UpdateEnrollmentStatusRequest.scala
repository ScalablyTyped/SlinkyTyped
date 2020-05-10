package typingsSlinky.awsSdk.computeoptimizerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateEnrollmentStatusRequest extends js.Object {
  /**
    * Indicates whether to enroll member accounts within the organization, if the account is a master account of an organization.
    */
  var includeMemberAccounts: js.UndefOr[IncludeMemberAccounts] = js.native
  /**
    * The new enrollment status of the account. Accepted options are Active or Inactive. You will get an error if Pending or Failed are specified.
    */
  var status: Status = js.native
}

object UpdateEnrollmentStatusRequest {
  @scala.inline
  def apply(status: Status): UpdateEnrollmentStatusRequest = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateEnrollmentStatusRequest]
  }
  @scala.inline
  implicit class UpdateEnrollmentStatusRequestOps[Self <: UpdateEnrollmentStatusRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStatus(value: Status): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIncludeMemberAccounts(value: IncludeMemberAccounts): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeMemberAccounts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeMemberAccounts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeMemberAccounts")(js.undefined)
        ret
    }
  }
  
}

