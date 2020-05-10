package typingsSlinky.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InviteMembersRequest extends js.Object {
  /**
    * The list of account IDs of the AWS accounts to invite to Security Hub as members. 
    */
  var AccountIds: js.UndefOr[AccountIdList] = js.native
}

object InviteMembersRequest {
  @scala.inline
  def apply(): InviteMembersRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InviteMembersRequest]
  }
  @scala.inline
  implicit class InviteMembersRequestOps[Self <: InviteMembersRequest] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withoutAccountIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccountIds")(js.undefined)
        ret
    }
  }
  
}

