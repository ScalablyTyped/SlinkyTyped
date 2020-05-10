package typingsSlinky.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetMembersResponse extends js.Object {
  /**
    * A list of members.
    */
  var Members: typingsSlinky.awsSdk.guarddutyMod.Members = js.native
  /**
    * A list of objects containing the unprocessed account and a result string explaining why it was unprocessed.
    */
  var UnprocessedAccounts: typingsSlinky.awsSdk.guarddutyMod.UnprocessedAccounts = js.native
}

object GetMembersResponse {
  @scala.inline
  def apply(Members: Members, UnprocessedAccounts: UnprocessedAccounts): GetMembersResponse = {
    val __obj = js.Dynamic.literal(Members = Members.asInstanceOf[js.Any], UnprocessedAccounts = UnprocessedAccounts.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMembersResponse]
  }
  @scala.inline
  implicit class GetMembersResponseOps[Self <: GetMembersResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMembers(value: Members): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Members")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnprocessedAccounts(value: UnprocessedAccounts): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UnprocessedAccounts")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

