package typingsSlinky.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeclineInvitationsResponse extends js.Object {
  /**
    * The list of AWS accounts that were not processed. For each account, the list includes the account ID and the email address.
    */
  var UnprocessedAccounts: js.UndefOr[ResultList] = js.native
}

object DeclineInvitationsResponse {
  @scala.inline
  def apply(): DeclineInvitationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeclineInvitationsResponse]
  }
  @scala.inline
  implicit class DeclineInvitationsResponseOps[Self <: DeclineInvitationsResponse] (val x: Self) extends AnyVal {
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

