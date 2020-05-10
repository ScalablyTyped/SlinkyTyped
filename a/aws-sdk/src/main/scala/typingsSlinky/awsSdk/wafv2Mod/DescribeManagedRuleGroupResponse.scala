package typingsSlinky.awsSdk.wafv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeManagedRuleGroupResponse extends js.Object {
  /**
    * The web ACL capacity units (WCUs) required for this rule group. AWS WAF uses web ACL capacity units (WCU) to calculate and control the operating resources that are used to run your rules, rule groups, and web ACLs. AWS WAF calculates capacity differently for each rule type, to reflect each rule's relative cost. Rule group capacity is fixed at creation, so users can plan their web ACL WCU usage when they use a rule group. The WCU limit for web ACLs is 1,500. 
    */
  var Capacity: js.UndefOr[CapacityUnit] = js.native
  /**
    * 
    */
  var Rules: js.UndefOr[RuleSummaries] = js.native
}

object DescribeManagedRuleGroupResponse {
  @scala.inline
  def apply(): DescribeManagedRuleGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeManagedRuleGroupResponse]
  }
  @scala.inline
  implicit class DescribeManagedRuleGroupResponseOps[Self <: DescribeManagedRuleGroupResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCapacity(value: CapacityUnit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Capacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCapacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Capacity")(js.undefined)
        ret
    }
    @scala.inline
    def withRules(value: RuleSummaries): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Rules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRules: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Rules")(js.undefined)
        ret
    }
  }
  
}

