package typingsSlinky.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteInvitationsResponse extends js.Object {
  /**
    * The list of AWS accounts for which the invitations were not deleted. For each account, the list includes the account ID and the email address.
    */
  var UnprocessedAccounts: js.UndefOr[ResultList] = js.native
}

object DeleteInvitationsResponse {
  @scala.inline
  def apply(): DeleteInvitationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteInvitationsResponse]
  }
  @scala.inline
  implicit class DeleteInvitationsResponseOps[Self <: DeleteInvitationsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUnprocessedAccounts(value: ResultList): Self = {
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

