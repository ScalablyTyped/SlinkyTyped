package typingsSlinky.pulumiAws.organizationCustomRuleMod

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrganizationCustomRuleState extends js.Object {
  /**
    * Amazon Resource Name (ARN) of the rule
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * Description of the rule
    */
  val description: js.UndefOr[Input[String]] = js.native
  /**
    * List of AWS account identifiers to exclude from the rule
    */
  val excludedAccounts: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * A string in JSON format that is passed to the AWS Config Rule Lambda Function
    */
  val inputParameters: js.UndefOr[Input[String]] = js.native
  /**
    * Amazon Resource Name (ARN) of the rule Lambda Function
    */
  val lambdaFunctionArn: js.UndefOr[Input[String]] = js.native
  /**
    * The maximum frequency with which AWS Config runs evaluations for a rule, if the rule is triggered at a periodic frequency. Defaults to `TwentyFour_Hours` for periodic frequency triggered rules. Valid values: `One_Hour`, `Three_Hours`, `Six_Hours`, `Twelve_Hours`, or `TwentyFour_Hours`.
    */
  val maximumExecutionFrequency: js.UndefOr[Input[String]] = js.native
  /**
    * The name of the rule
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * Identifier of the AWS resource to evaluate
    */
  val resourceIdScope: js.UndefOr[Input[String]] = js.native
  /**
    * List of types of AWS resources to evaluate
    */
  val resourceTypesScopes: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * Tag key of AWS resources to evaluate
    */
  val tagKeyScope: js.UndefOr[Input[String]] = js.native
  /**
    * Tag value of AWS resources to evaluate
    */
  val tagValueScope: js.UndefOr[Input[String]] = js.native
  /**
    * List of notification types that trigger AWS Config to run an evaluation for the rule. Valid values: `ConfigurationItemChangeNotification`, `OversizedConfigurationItemChangeNotification`, and `ScheduledNotification`
    */
  val triggerTypes: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
}

object OrganizationCustomRuleState {
  @scala.inline
  def apply(): OrganizationCustomRuleState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrganizationCustomRuleState]
  }
  @scala.inline
  implicit class OrganizationCustomRuleStateOps[Self <: OrganizationCustomRuleState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArn(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withExcludedAccounts(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludedAccounts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExcludedAccounts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludedAccounts")(js.undefined)
        ret
    }
    @scala.inline
    def withInputParameters(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputParameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputParameters")(js.undefined)
        ret
    }
    @scala.inline
    def withLambdaFunctionArn(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lambdaFunctionArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLambdaFunctionArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lambdaFunctionArn")(js.undefined)
        ret
    }
    @scala.inline
    def withMaximumExecutionFrequency(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumExecutionFrequency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaximumExecutionFrequency: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumExecutionFrequency")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceIdScope(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceIdScope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceIdScope: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceIdScope")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceTypesScopes(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceTypesScopes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceTypesScopes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceTypesScopes")(js.undefined)
        ret
    }
    @scala.inline
    def withTagKeyScope(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagKeyScope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTagKeyScope: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagKeyScope")(js.undefined)
        ret
    }
    @scala.inline
    def withTagValueScope(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagValueScope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTagValueScope: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagValueScope")(js.undefined)
        ret
    }
    @scala.inline
    def withTriggerTypes(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triggerTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTriggerTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triggerTypes")(js.undefined)
        ret
    }
  }
  
}

