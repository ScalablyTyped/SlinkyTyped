package typingsSlinky.awsSdk.wafregionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteRuleGroupRequest extends js.Object {
  /**
    * The value returned by the most recent call to GetChangeToken.
    */
  var ChangeToken: typingsSlinky.awsSdk.wafregionalMod.ChangeToken = js.native
  /**
    * The RuleGroupId of the RuleGroup that you want to delete. RuleGroupId is returned by CreateRuleGroup and by ListRuleGroups.
    */
  var RuleGroupId: ResourceId = js.native
}

object DeleteRuleGroupRequest {
  @scala.inline
  def apply(ChangeToken: ChangeToken, RuleGroupId: ResourceId): DeleteRuleGroupRequest = {
    val __obj = js.Dynamic.literal(ChangeToken = ChangeToken.asInstanceOf[js.Any], RuleGroupId = RuleGroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteRuleGroupRequest]
  }
  @scala.inline
  implicit class DeleteRuleGroupRequestOps[Self <: DeleteRuleGroupRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChangeToken(value: ChangeToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ChangeToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRuleGroupId(value: ResourceId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RuleGroupId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

