package typingsSlinky.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeclineInvitationsRequest extends js.Object {
  /**
    * A list of account IDs of the AWS accounts that sent invitations to the current member account that you want to decline invitations from.
    */
  var AccountIds: typingsSlinky.awsSdk.guarddutyMod.AccountIds = js.native
}

object DeclineInvitationsRequest {
  @scala.inline
  def apply(AccountIds: AccountIds): DeclineInvitationsRequest = {
    val __obj = js.Dynamic.literal(AccountIds = AccountIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeclineInvitationsRequest]
  }
  @scala.inline
  implicit class DeclineInvitationsRequestOps[Self <: DeclineInvitationsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccountIds(value: AccountIds): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccountIds")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

