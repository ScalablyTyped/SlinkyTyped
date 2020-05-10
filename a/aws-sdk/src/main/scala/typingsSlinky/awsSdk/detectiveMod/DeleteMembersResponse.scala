package typingsSlinky.awsSdk.detectiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteMembersResponse extends js.Object {
  /**
    * The list of AWS account identifiers for the member accounts that Detective successfully deleted from the behavior graph.
    */
  var AccountIds: js.UndefOr[AccountIdList] = js.native
  /**
    * The list of member accounts that Detective was not able to delete from the behavior graph. For each member account, provides the reason that the deletion could not be processed.
    */
  var UnprocessedAccounts: js.UndefOr[UnprocessedAccountList] = js.native
}

object DeleteMembersResponse {
  @scala.inline
  def apply(): DeleteMembersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteMembersResponse]
  }
  @scala.inline
  implicit class DeleteMembersResponseOps[Self <: DeleteMembersResponse] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withUnprocessedAccounts(value: UnprocessedAccountList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UnprocessedAccounts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnprocessedAccounts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UnprocessedAccounts")(js.undefined)
        ret
    }
  }
  
}

