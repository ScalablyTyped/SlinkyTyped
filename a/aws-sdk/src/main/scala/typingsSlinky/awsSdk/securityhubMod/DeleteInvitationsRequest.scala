package typingsSlinky.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteInvitationsRequest extends js.Object {
  /**
    * The list of the account IDs that sent the invitations to delete.
    */
  var AccountIds: AccountIdList = js.native
}

object DeleteInvitationsRequest {
  @scala.inline
  def apply(AccountIds: AccountIdList): DeleteInvitationsRequest = {
    val __obj = js.Dynamic.literal(AccountIds = AccountIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteInvitationsRequest]
  }
  @scala.inline
  implicit class DeleteInvitationsRequestOps[Self <: DeleteInvitationsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccountIds(value: AccountIdList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccountIds")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

