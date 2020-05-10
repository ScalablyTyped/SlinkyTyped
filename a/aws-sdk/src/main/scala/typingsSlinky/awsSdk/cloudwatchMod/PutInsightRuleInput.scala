package typingsSlinky.awsSdk.cloudwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutInsightRuleInput extends js.Object {
  /**
    * The definition of the rule, as a JSON object. For details on the valid syntax, see Contributor Insights Rule Syntax.
    */
  var RuleDefinition: InsightRuleDefinition = js.native
  /**
    * A unique name for the rule.
    */
  var RuleName: InsightRuleName = js.native
  /**
    * The state of the rule. Valid values are ENABLED and DISABLED.
    */
  var RuleState: js.UndefOr[InsightRuleState] = js.native
}

object PutInsightRuleInput {
  @scala.inline
  def apply(RuleDefinition: InsightRuleDefinition, RuleName: InsightRuleName): PutInsightRuleInput = {
    val __obj = js.Dynamic.literal(RuleDefinition = RuleDefinition.asInstanceOf[js.Any], RuleName = RuleName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutInsightRuleInput]
  }
  @scala.inline
  implicit class PutInsightRuleInputOps[Self <: PutInsightRuleInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRuleDefinition(value: InsightRuleDefinition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RuleDefinition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRuleName(value: InsightRuleName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RuleName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRuleState(value: InsightRuleState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RuleState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRuleState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RuleState")(js.undefined)
        ret
    }
  }
  
}

