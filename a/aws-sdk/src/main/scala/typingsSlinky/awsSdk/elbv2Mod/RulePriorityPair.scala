package typingsSlinky.awsSdk.elbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RulePriorityPair extends js.Object {
  /**
    * The rule priority.
    */
  var Priority: js.UndefOr[RulePriority] = js.native
  /**
    * The Amazon Resource Name (ARN) of the rule.
    */
  var RuleArn: js.UndefOr[typingsSlinky.awsSdk.elbv2Mod.RuleArn] = js.native
}

object RulePriorityPair {
  @scala.inline
  def apply(): RulePriorityPair = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RulePriorityPair]
  }
  @scala.inline
  implicit class RulePriorityPairOps[Self <: RulePriorityPair] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPriority(value: RulePriority): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Priority")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPriority: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Priority")(js.undefined)
        ret
    }
    @scala.inline
    def withRuleArn(value: RuleArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RuleArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRuleArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RuleArn")(js.undefined)
        ret
    }
  }
  
}

