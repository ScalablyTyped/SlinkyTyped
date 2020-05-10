package typingsSlinky.awsSdk.detectiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetMembersRequest extends js.Object {
  /**
    * The list of AWS account identifiers for the member account for which to return member details. You cannot use GetMembers to retrieve information about member accounts that were removed from the behavior graph.
    */
  var AccountIds: AccountIdList = js.native
  /**
    * The ARN of the behavior graph for which to request the member details.
    */
  var GraphArn: typingsSlinky.awsSdk.detectiveMod.GraphArn = js.native
}

object GetMembersRequest {
  @scala.inline
  def apply(AccountIds: AccountIdList, GraphArn: GraphArn): GetMembersRequest = {
    val __obj = js.Dynamic.literal(AccountIds = AccountIds.asInstanceOf[js.Any], GraphArn = GraphArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMembersRequest]
  }
  @scala.inline
  implicit class GetMembersRequestOps[Self <: GetMembersRequest] (val x: Self) extends AnyVal {
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

