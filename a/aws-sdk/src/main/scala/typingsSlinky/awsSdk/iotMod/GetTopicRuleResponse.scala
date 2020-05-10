package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetTopicRuleResponse extends js.Object {
  /**
    * The rule.
    */
  var rule: js.UndefOr[TopicRule] = js.native
  /**
    * The rule ARN.
    */
  var ruleArn: js.UndefOr[RuleArn] = js.native
}

object GetTopicRuleResponse {
  @scala.inline
  def apply(): GetTopicRuleResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetTopicRuleResponse]
  }
  @scala.inline
  implicit class GetTopicRuleResponseOps[Self <: GetTopicRuleResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRule(value: TopicRule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRule: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rule")(js.undefined)
        ret
    }
    @scala.inline
    def withRuleArn(value: RuleArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ruleArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRuleArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ruleArn")(js.undefined)
        ret
    }
  }
  
}

