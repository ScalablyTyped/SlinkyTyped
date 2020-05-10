package typingsSlinky.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WafExcludedRule extends js.Object {
  /**
    * The unique identifier for the rule to exclude from the rule group.
    */
  var RuleId: js.UndefOr[NonEmptyString] = js.native
}

object WafExcludedRule {
  @scala.inline
  def apply(): WafExcludedRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WafExcludedRule]
  }
  @scala.inline
  implicit class WafExcludedRuleOps[Self <: WafExcludedRule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRuleId(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RuleId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRuleId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RuleId")(js.undefined)
        ret
    }
  }
  
}

