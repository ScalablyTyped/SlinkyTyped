package typingsSlinky.awsSdk.workspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateRulesOfIpGroupRequest extends js.Object {
  /**
    * The identifier of the group.
    */
  var GroupId: IpGroupId = js.native
  /**
    * One or more rules.
    */
  var UserRules: IpRuleList = js.native
}

object UpdateRulesOfIpGroupRequest {
  @scala.inline
  def apply(GroupId: IpGroupId, UserRules: IpRuleList): UpdateRulesOfIpGroupRequest = {
    val __obj = js.Dynamic.literal(GroupId = GroupId.asInstanceOf[js.Any], UserRules = UserRules.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateRulesOfIpGroupRequest]
  }
  @scala.inline
  implicit class UpdateRulesOfIpGroupRequestOps[Self <: UpdateRulesOfIpGroupRequest] (val x: Self) extends AnyVal {
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
    def withUserRules(value: IpRuleList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserRules")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

