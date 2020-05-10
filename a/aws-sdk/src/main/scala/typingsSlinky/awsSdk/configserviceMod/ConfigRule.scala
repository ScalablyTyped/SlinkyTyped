package typingsSlinky.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigRule extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the AWS Config rule.
    */
  var ConfigRuleArn: js.UndefOr[StringWithCharLimit256] = js.native
  /**
    * The ID of the AWS Config rule.
    */
  var ConfigRuleId: js.UndefOr[StringWithCharLimit64] = js.native
  /**
    * The name that you assign to the AWS Config rule. The name is required if you are adding a new rule.
    */
  var ConfigRuleName: js.UndefOr[typingsSlinky.awsSdk.configserviceMod.ConfigRuleName] = js.native
  /**
    * Indicates whether the AWS Config rule is active or is currently being deleted by AWS Config. It can also indicate the evaluation status for the AWS Config rule. AWS Config sets the state of the rule to EVALUATING temporarily after you use the StartConfigRulesEvaluation request to evaluate your resources against the AWS Config rule. AWS Config sets the state of the rule to DELETING_RESULTS temporarily after you use the DeleteEvaluationResults request to delete the current evaluation results for the AWS Config rule. AWS Config temporarily sets the state of a rule to DELETING after you use the DeleteConfigRule request to delete the rule. After AWS Config deletes the rule, the rule and all of its evaluations are erased and are no longer available.
    */
  var ConfigRuleState: js.UndefOr[typingsSlinky.awsSdk.configserviceMod.ConfigRuleState] = js.native
  /**
    * Service principal name of the service that created the rule.  The field is populated only if the service linked rule is created by a service. The field is empty if you create your own rule. 
    */
  var CreatedBy: js.UndefOr[StringWithCharLimit256] = js.native
  /**
    * The description that you provide for the AWS Config rule.
    */
  var Description: js.UndefOr[EmptiableStringWithCharLimit256] = js.native
  /**
    * A string, in JSON format, that is passed to the AWS Config rule Lambda function.
    */
  var InputParameters: js.UndefOr[StringWithCharLimit1024] = js.native
  /**
    * The maximum frequency with which AWS Config runs evaluations for a rule. You can specify a value for MaximumExecutionFrequency when:   You are using an AWS managed rule that is triggered at a periodic frequency.   Your custom rule is triggered when AWS Config delivers the configuration snapshot. For more information, see ConfigSnapshotDeliveryProperties.    By default, rules with a periodic trigger are evaluated every 24 hours. To change the frequency, specify a valid value for the MaximumExecutionFrequency parameter. 
    */
  var MaximumExecutionFrequency: js.UndefOr[typingsSlinky.awsSdk.configserviceMod.MaximumExecutionFrequency] = js.native
  /**
    * Defines which resources can trigger an evaluation for the rule. The scope can include one or more resource types, a combination of one resource type and one resource ID, or a combination of a tag key and value. Specify a scope to constrain the resources that can trigger an evaluation for the rule. If you do not specify a scope, evaluations are triggered when any resource in the recording group changes.
    */
  var Scope: js.UndefOr[typingsSlinky.awsSdk.configserviceMod.Scope] = js.native
  /**
    * Provides the rule owner (AWS or customer), the rule identifier, and the notifications that cause the function to evaluate your AWS resources.
    */
  var Source: typingsSlinky.awsSdk.configserviceMod.Source = js.native
}

object ConfigRule {
  @scala.inline
  def apply(Source: Source): ConfigRule = {
    val __obj = js.Dynamic.literal(Source = Source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigRule]
  }
  @scala.inline
  implicit class ConfigRuleOps[Self <: ConfigRule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSource(value: Source): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConfigRuleArn(value: StringWithCharLimit256): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConfigRuleArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfigRuleArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConfigRuleArn")(js.undefined)
        ret
    }
    @scala.inline
    def withConfigRuleId(value: StringWithCharLimit64): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConfigRuleId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfigRuleId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConfigRuleId")(js.undefined)
        ret
    }
    @scala.inline
    def withConfigRuleName(value: ConfigRuleName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConfigRuleName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfigRuleName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConfigRuleName")(js.undefined)
        ret
    }
    @scala.inline
    def withConfigRuleState(value: ConfigRuleState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConfigRuleState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfigRuleState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConfigRuleState")(js.undefined)
        ret
    }
    @scala.inline
    def withCreatedBy(value: StringWithCharLimit256): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatedBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreatedBy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatedBy")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: EmptiableStringWithCharLimit256): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(js.undefined)
        ret
    }
    @scala.inline
    def withInputParameters(value: StringWithCharLimit1024): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InputParameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InputParameters")(js.undefined)
        ret
    }
    @scala.inline
    def withMaximumExecutionFrequency(value: MaximumExecutionFrequency): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaximumExecutionFrequency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaximumExecutionFrequency: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaximumExecutionFrequency")(js.undefined)
        ret
    }
    @scala.inline
    def withScope(value: Scope): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Scope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScope: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Scope")(js.undefined)
        ret
    }
  }
  
}

