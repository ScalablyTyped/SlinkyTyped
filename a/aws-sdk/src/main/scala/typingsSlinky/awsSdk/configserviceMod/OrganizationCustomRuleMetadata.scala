package typingsSlinky.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrganizationCustomRuleMetadata extends js.Object {
  /**
    * The description that you provide for organization config rule.
    */
  var Description: js.UndefOr[StringWithCharLimit256Min0] = js.native
  /**
    * A string, in JSON format, that is passed to organization config rule Lambda function.
    */
  var InputParameters: js.UndefOr[StringWithCharLimit2048] = js.native
  /**
    * The lambda function ARN.
    */
  var LambdaFunctionArn: StringWithCharLimit256 = js.native
  /**
    * The maximum frequency with which AWS Config runs evaluations for a rule. Your custom rule is triggered when AWS Config delivers the configuration snapshot. For more information, see ConfigSnapshotDeliveryProperties.  By default, rules with a periodic trigger are evaluated every 24 hours. To change the frequency, specify a valid value for the MaximumExecutionFrequency parameter. 
    */
  var MaximumExecutionFrequency: js.UndefOr[typingsSlinky.awsSdk.configserviceMod.MaximumExecutionFrequency] = js.native
  /**
    * The type of notification that triggers AWS Config to run an evaluation for a rule. You can specify the following notification types:    ConfigurationItemChangeNotification - Triggers an evaluation when AWS Config delivers a configuration item as a result of a resource change.    OversizedConfigurationItemChangeNotification - Triggers an evaluation when AWS Config delivers an oversized configuration item. AWS Config may generate this notification type when a resource changes and the notification exceeds the maximum size allowed by Amazon SNS.    ScheduledNotification - Triggers a periodic evaluation at the frequency specified for MaximumExecutionFrequency.  
    */
  var OrganizationConfigRuleTriggerTypes: typingsSlinky.awsSdk.configserviceMod.OrganizationConfigRuleTriggerTypes = js.native
  /**
    * The ID of the AWS resource that was evaluated.
    */
  var ResourceIdScope: js.UndefOr[StringWithCharLimit768] = js.native
  /**
    * The type of the AWS resource that was evaluated.
    */
  var ResourceTypesScope: js.UndefOr[typingsSlinky.awsSdk.configserviceMod.ResourceTypesScope] = js.native
  /**
    * One part of a key-value pair that make up a tag. A key is a general label that acts like a category for more specific tag values. 
    */
  var TagKeyScope: js.UndefOr[StringWithCharLimit128] = js.native
  /**
    * The optional part of a key-value pair that make up a tag. A value acts as a descriptor within a tag category (key). 
    */
  var TagValueScope: js.UndefOr[StringWithCharLimit256] = js.native
}

object OrganizationCustomRuleMetadata {
  @scala.inline
  def apply(
    LambdaFunctionArn: StringWithCharLimit256,
    OrganizationConfigRuleTriggerTypes: OrganizationConfigRuleTriggerTypes
  ): OrganizationCustomRuleMetadata = {
    val __obj = js.Dynamic.literal(LambdaFunctionArn = LambdaFunctionArn.asInstanceOf[js.Any], OrganizationConfigRuleTriggerTypes = OrganizationConfigRuleTriggerTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrganizationCustomRuleMetadata]
  }
  @scala.inline
  implicit class OrganizationCustomRuleMetadataOps[Self <: OrganizationCustomRuleMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLambdaFunctionArn(value: StringWithCharLimit256): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LambdaFunctionArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrganizationConfigRuleTriggerTypes(value: OrganizationConfigRuleTriggerTypes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OrganizationConfigRuleTriggerTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: StringWithCharLimit256Min0): Self = {
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
    def withInputParameters(value: StringWithCharLimit2048): Self = {
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
    def withResourceIdScope(value: StringWithCharLimit768): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceIdScope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceIdScope: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceIdScope")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceTypesScope(value: ResourceTypesScope): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceTypesScope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceTypesScope: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceTypesScope")(js.undefined)
        ret
    }
    @scala.inline
    def withTagKeyScope(value: StringWithCharLimit128): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TagKeyScope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTagKeyScope: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TagKeyScope")(js.undefined)
        ret
    }
    @scala.inline
    def withTagValueScope(value: StringWithCharLimit256): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TagValueScope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTagValueScope: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TagValueScope")(js.undefined)
        ret
    }
  }
  
}

