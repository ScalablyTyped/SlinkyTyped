package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TopicRuleListItem extends js.Object {
  /**
    * The date and time the rule was created.
    */
  var createdAt: js.UndefOr[js.Date] = js.native
  /**
    * The rule ARN.
    */
  var ruleArn: js.UndefOr[RuleArn] = js.native
  /**
    * Specifies whether the rule is disabled.
    */
  var ruleDisabled: js.UndefOr[IsDisabled] = js.native
  /**
    * The name of the rule.
    */
  var ruleName: js.UndefOr[RuleName] = js.native
  /**
    * The pattern for the topic names that apply.
    */
  var topicPattern: js.UndefOr[TopicPattern] = js.native
}

object TopicRuleListItem {
  @scala.inline
  def apply(): TopicRuleListItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TopicRuleListItem]
  }
  @scala.inline
  implicit class TopicRuleListItemOps[Self <: TopicRuleListItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreatedAt(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreatedAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdAt")(js.undefined)
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
    @scala.inline
    def withRuleDisabled(value: IsDisabled): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ruleDisabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRuleDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ruleDisabled")(js.undefined)
        ret
    }
    @scala.inline
    def withRuleName(value: RuleName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ruleName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRuleName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ruleName")(js.undefined)
        ret
    }
    @scala.inline
    def withTopicPattern(value: TopicPattern): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topicPattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTopicPattern: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topicPattern")(js.undefined)
        ret
    }
  }
  
}

