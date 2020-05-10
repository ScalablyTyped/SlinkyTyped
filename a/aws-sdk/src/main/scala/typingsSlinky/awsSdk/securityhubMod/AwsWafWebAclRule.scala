package typingsSlinky.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AwsWafWebAclRule extends js.Object {
  /**
    * Specifies the action that CloudFront or AWS WAF takes when a web request matches the conditions in the Rule. 
    */
  var Action: js.UndefOr[WafAction] = js.native
  /**
    * Rules to exclude from a rule group.
    */
  var ExcludedRules: js.UndefOr[WafExcludedRuleList] = js.native
  /**
    * Use the OverrideAction to test your RuleGroup. Any rule in a RuleGroup can potentially block a request. If you set the OverrideAction to None, the RuleGroup blocks a request if any individual rule in the RuleGroup matches the request and is configured to block that request. However, if you first want to test the RuleGroup, set the OverrideAction to Count. The RuleGroup then overrides any block action specified by individual rules contained within the group. Instead of blocking matching requests, those requests are counted.  ActivatedRule|OverrideAction applies only when updating or adding a RuleGroup to a WebACL. In this case you do not use ActivatedRule|Action. For all other update requests, ActivatedRule|Action is used instead of ActivatedRule|OverrideAction. 
    */
  var OverrideAction: js.UndefOr[WafOverrideAction] = js.native
  /**
    * Specifies the order in which the Rules in a WebACL are evaluated. Rules with a lower value for Priority are evaluated before Rules with a higher value. The value must be a unique integer. If you add multiple Rules to a WebACL, the values do not need to be consecutive.
    */
  var Priority: js.UndefOr[Integer] = js.native
  /**
    * The identifier for a Rule.
    */
  var RuleId: js.UndefOr[NonEmptyString] = js.native
  /**
    * The rule type. Valid values: REGULAR | RATE_BASED | GROUP  The default is REGULAR.
    */
  var Type: js.UndefOr[NonEmptyString] = js.native
}

object AwsWafWebAclRule {
  @scala.inline
  def apply(): AwsWafWebAclRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsWafWebAclRule]
  }
  @scala.inline
  implicit class AwsWafWebAclRuleOps[Self <: AwsWafWebAclRule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAction(value: WafAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Action")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Action")(js.undefined)
        ret
    }
    @scala.inline
    def withExcludedRules(value: WafExcludedRuleList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExcludedRules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExcludedRules: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExcludedRules")(js.undefined)
        ret
    }
    @scala.inline
    def withOverrideAction(value: WafOverrideAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OverrideAction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverrideAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OverrideAction")(js.undefined)
        ret
    }
    @scala.inline
    def withPriority(value: Integer): Self = {
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
    @scala.inline
    def withType(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(js.undefined)
        ret
    }
  }
  
}

