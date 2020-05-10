package typingsSlinky.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrganizationManagedRuleMetadata extends js.Object {
  /**
    * The description that you provide for organization config rule.
    */
  var Description: js.UndefOr[StringWithCharLimit256Min0] = js.native
  /**
    * A string, in JSON format, that is passed to organization config rule Lambda function.
    */
  var InputParameters: js.UndefOr[StringWithCharLimit2048] = js.native
  /**
    * The maximum frequency with which AWS Config runs evaluations for a rule. You are using an AWS managed rule that is triggered at a periodic frequency.  By default, rules with a periodic trigger are evaluated every 24 hours. To change the frequency, specify a valid value for the MaximumExecutionFrequency parameter. 
    */
  var MaximumExecutionFrequency: js.UndefOr[typingsSlinky.awsSdk.configserviceMod.MaximumExecutionFrequency] = js.native
  /**
    * The ID of the AWS resource that was evaluated.
    */
  var ResourceIdScope: js.UndefOr[StringWithCharLimit768] = js.native
  /**
    * The type of the AWS resource that was evaluated.
    */
  var ResourceTypesScope: js.UndefOr[typingsSlinky.awsSdk.configserviceMod.ResourceTypesScope] = js.native
  /**
    * For organization config managed rules, a predefined identifier from a list. For example, IAM_PASSWORD_POLICY is a managed rule. To reference a managed rule, see Using AWS Managed Config Rules.
    */
  var RuleIdentifier: StringWithCharLimit256 = js.native
  /**
    * One part of a key-value pair that make up a tag. A key is a general label that acts like a category for more specific tag values. 
    */
  var TagKeyScope: js.UndefOr[StringWithCharLimit128] = js.native
  /**
    * The optional part of a key-value pair that make up a tag. A value acts as a descriptor within a tag category (key).
    */
  var TagValueScope: js.UndefOr[StringWithCharLimit256] = js.native
}

object OrganizationManagedRuleMetadata {
  @scala.inline
  def apply(RuleIdentifier: StringWithCharLimit256): OrganizationManagedRuleMetadata = {
    val __obj = js.Dynamic.literal(RuleIdentifier = RuleIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrganizationManagedRuleMetadata]
  }
  @scala.inline
  implicit class OrganizationManagedRuleMetadataOps[Self <: OrganizationManagedRuleMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRuleIdentifier(value: StringWithCharLimit256): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RuleIdentifier")(value.asInstanceOf[js.Any])
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

