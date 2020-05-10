package typingsSlinky.awsSdk.detectiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetMembersResponse extends js.Object {
  /**
    * The member account details that Detective is returning in response to the request.
    */
  var MemberDetails: js.UndefOr[MemberDetailList] = js.native
  /**
    * The requested member accounts for which Detective was unable to return member details. For each account, provides the reason why the request could not be processed.
    */
  var UnprocessedAccounts: js.UndefOr[UnprocessedAccountList] = js.native
}

object GetMembersResponse {
  @scala.inline
  def apply(): GetMembersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetMembersResponse]
  }
  @scala.inline
  implicit class GetMembersResponseOps[Self <: GetMembersResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMemberDetails(value: MemberDetailList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MemberDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMemberDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MemberDetails")(js.undefined)
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

