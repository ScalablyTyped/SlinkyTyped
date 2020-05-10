package typingsSlinky.awsSdk.workspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RevokeIpRulesRequest extends js.Object {
  /**
    * The identifier of the group.
    */
  var GroupId: IpGroupId = js.native
  /**
    * The rules to remove from the group.
    */
  var UserRules: IpRevokedRuleList = js.native
}

object RevokeIpRulesRequest {
  @scala.inline
  def apply(GroupId: IpGroupId, UserRules: IpRevokedRuleList): RevokeIpRulesRequest = {
    val __obj = js.Dynamic.literal(GroupId = GroupId.asInstanceOf[js.Any], UserRules = UserRules.asInstanceOf[js.Any])
    __obj.asInstanceOf[RevokeIpRulesRequest]
  }
  @scala.inline
  implicit class RevokeIpRulesRequestOps[Self <: RevokeIpRulesRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGroupId(value: IpGroupId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GroupId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserRules(value: IpRevokedRuleList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserRules")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

