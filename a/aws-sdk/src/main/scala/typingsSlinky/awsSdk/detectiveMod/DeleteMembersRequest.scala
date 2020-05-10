package typingsSlinky.awsSdk.detectiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteMembersRequest extends js.Object {
  /**
    * The list of AWS account identifiers for the member accounts to delete from the behavior graph.
    */
  var AccountIds: AccountIdList = js.native
  /**
    * The ARN of the behavior graph to delete members from.
    */
  var GraphArn: typingsSlinky.awsSdk.detectiveMod.GraphArn = js.native
}

object DeleteMembersRequest {
  @scala.inline
  def apply(AccountIds: AccountIdList, GraphArn: GraphArn): DeleteMembersRequest = {
    val __obj = js.Dynamic.literal(AccountIds = AccountIds.asInstanceOf[js.Any], GraphArn = GraphArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteMembersRequest]
  }
  @scala.inline
  implicit class DeleteMembersRequestOps[Self <: DeleteMembersRequest] (val x: Self) extends AnyVal {
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
    def withGraphArn(value: GraphArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GraphArn")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

