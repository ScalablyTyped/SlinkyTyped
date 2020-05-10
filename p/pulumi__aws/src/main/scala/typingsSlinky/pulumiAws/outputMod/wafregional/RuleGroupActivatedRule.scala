package typingsSlinky.pulumiAws.outputMod.wafregional

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RuleGroupActivatedRule extends js.Object {
  /**
    * Specifies the action that CloudFront or AWS WAF takes when a web request matches the conditions in the rule.
    */
  var action: RuleGroupActivatedRuleAction = js.native
  /**
    * Specifies the order in which the rules are evaluated. Rules with a lower value are evaluated before rules with a higher value.
    */
  var priority: Double = js.native
  /**
    * The ID of a [rule](https://www.terraform.io/docs/providers/aws/r/wafregional_rule.html)
    */
  var ruleId: String = js.native
  /**
    * The rule type, either [`REGULAR`](https://www.terraform.io/docs/providers/aws/r/wafregional_rule.html), [`RATE_BASED`](https://www.terraform.io/docs/providers/aws/r/wafregional_rate_based_rule.html), or `GROUP`. Defaults to `REGULAR`.
    */
  var `type`: js.UndefOr[String] = js.native
}

object RuleGroupActivatedRule {
  @scala.inline
  def apply(action: RuleGroupActivatedRuleAction, priority: Double, ruleId: String): RuleGroupActivatedRule = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any], ruleId = ruleId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleGroupActivatedRule]
  }
  @scala.inline
  implicit class RuleGroupActivatedRuleOps[Self <: RuleGroupActivatedRule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAction(value: RuleGroupActivatedRuleAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPriority(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priority")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRuleId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ruleId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

