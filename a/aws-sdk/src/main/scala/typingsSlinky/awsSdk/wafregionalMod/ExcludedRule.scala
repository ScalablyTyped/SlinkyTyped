package typingsSlinky.awsSdk.wafregionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExcludedRule extends js.Object {
  /**
    * The unique identifier for the rule to exclude from the rule group.
    */
  var RuleId: ResourceId = js.native
}

object ExcludedRule {
  @scala.inline
  def apply(RuleId: ResourceId): ExcludedRule = {
    val __obj = js.Dynamic.literal(RuleId = RuleId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExcludedRule]
  }
  @scala.inline
  implicit class ExcludedRuleOps[Self <: ExcludedRule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRuleId(value: ResourceId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RuleId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

