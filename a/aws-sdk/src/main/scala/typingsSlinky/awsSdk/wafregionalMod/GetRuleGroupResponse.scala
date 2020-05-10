package typingsSlinky.awsSdk.wafregionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetRuleGroupResponse extends js.Object {
  /**
    * Information about the RuleGroup that you specified in the GetRuleGroup request. 
    */
  var RuleGroup: js.UndefOr[typingsSlinky.awsSdk.wafregionalMod.RuleGroup] = js.native
}

object GetRuleGroupResponse {
  @scala.inline
  def apply(): GetRuleGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetRuleGroupResponse]
  }
  @scala.inline
  implicit class GetRuleGroupResponseOps[Self <: GetRuleGroupResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRuleGroup(value: RuleGroup): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RuleGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRuleGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RuleGroup")(js.undefined)
        ret
    }
  }
  
}

