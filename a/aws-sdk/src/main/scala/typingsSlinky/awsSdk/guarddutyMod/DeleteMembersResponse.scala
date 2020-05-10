package typingsSlinky.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteMembersResponse extends js.Object {
  /**
    * The accounts that could not be processed.
    */
  var UnprocessedAccounts: typingsSlinky.awsSdk.guarddutyMod.UnprocessedAccounts = js.native
}

object DeleteMembersResponse {
  @scala.inline
  def apply(UnprocessedAccounts: UnprocessedAccounts): DeleteMembersResponse = {
    val __obj = js.Dynamic.literal(UnprocessedAccounts = UnprocessedAccounts.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteMembersResponse]
  }
  @scala.inline
  implicit class DeleteMembersResponseOps[Self <: DeleteMembersResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUnprocessedAccounts(value: UnprocessedAccounts): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UnprocessedAccounts")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

