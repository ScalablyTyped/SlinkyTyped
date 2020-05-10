package typingsSlinky.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisassociateMembersRequest extends js.Object {
  /**
    * The account IDs of the member accounts to disassociate from the master account.
    */
  var AccountIds: js.UndefOr[AccountIdList] = js.native
}

object DisassociateMembersRequest {
  @scala.inline
  def apply(): DisassociateMembersRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisassociateMembersRequest]
  }
  @scala.inline
  implicit class DisassociateMembersRequestOps[Self <: DisassociateMembersRequest] (val x: Self) extends AnyVal {
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

