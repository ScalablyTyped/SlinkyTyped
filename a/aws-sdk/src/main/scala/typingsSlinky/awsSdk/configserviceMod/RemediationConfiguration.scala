package typingsSlinky.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemediationConfiguration extends js.Object {
  /**
    * Amazon Resource Name (ARN) of remediation configuration.
    */
  var Arn: js.UndefOr[StringWithCharLimit1024] = js.native
  /**
    * The remediation is triggered automatically.
    */
  var Automatic: js.UndefOr[Boolean] = js.native
  /**
    * The name of the AWS Config rule.
    */
  var ConfigRuleName: typingsSlinky.awsSdk.configserviceMod.ConfigRuleName = js.native
  /**
    * Name of the service that owns the service linked rule, if applicable.
    */
  var CreatedByService: js.UndefOr[StringWithCharLimit1024] = js.native
  /**
    * An ExecutionControls object.
    */
  var ExecutionControls: js.UndefOr[typingsSlinky.awsSdk.configserviceMod.ExecutionControls] = js.native
  /**
    * The maximum number of failed attempts for auto-remediation. If you do not select a number, the default is 5. For example, if you specify MaximumAutomaticAttempts as 5 with RetryAttemptsSeconds as 50 seconds, AWS Config throws an exception after the 5th failed attempt within 50 seconds.
    */
  var MaximumAutomaticAttempts: js.UndefOr[AutoRemediationAttempts] = js.native
  /**
    * An object of the RemediationParameterValue.
    */
  var Parameters: js.UndefOr[RemediationParameters] = js.native
  /**
    * The type of a resource. 
    */
  var ResourceType: js.UndefOr[String] = js.native
  /**
    * Maximum time in seconds that AWS Config runs auto-remediation. If you do not select a number, the default is 60 seconds.  For example, if you specify RetryAttemptsSeconds as 50 seconds and MaximumAutomaticAttempts as 5, AWS Config will run auto-remediations 5 times within 50 seconds before throwing an exception. 
    */
  var RetryAttemptSeconds: js.UndefOr[AutoRemediationAttemptSeconds] = js.native
  /**
    * Target ID is the name of the public document.
    */
  var TargetId: StringWithCharLimit256 = js.native
  /**
    * The type of the target. Target executes remediation. For example, SSM document.
    */
  var TargetType: RemediationTargetType = js.native
  /**
    * Version of the target. For example, version of the SSM document.
    */
  var TargetVersion: js.UndefOr[String] = js.native
}

object RemediationConfiguration {
  @scala.inline
  def apply(
    ConfigRuleName: ConfigRuleName,
    TargetId: StringWithCharLimit256,
    TargetType: RemediationTargetType
  ): RemediationConfiguration = {
    val __obj = js.Dynamic.literal(ConfigRuleName = ConfigRuleName.asInstanceOf[js.Any], TargetId = TargetId.asInstanceOf[js.Any], TargetType = TargetType.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemediationConfiguration]
  }
  @scala.inline
  implicit class RemediationConfigurationOps[Self <: RemediationConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfigRuleName(value: ConfigRuleName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConfigRuleName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargetId(value: StringWithCharLimit256): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargetType(value: RemediationTargetType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withArn(value: StringWithCharLimit1024): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Arn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Arn")(js.undefined)
        ret
    }
    @scala.inline
    def withAutomatic(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Automatic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutomatic: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Automatic")(js.undefined)
        ret
    }
    @scala.inline
    def withCreatedByService(value: StringWithCharLimit1024): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatedByService")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreatedByService: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatedByService")(js.undefined)
        ret
    }
    @scala.inline
    def withExecutionControls(value: ExecutionControls): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExecutionControls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExecutionControls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExecutionControls")(js.undefined)
        ret
    }
    @scala.inline
    def withMaximumAutomaticAttempts(value: AutoRemediationAttempts): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaximumAutomaticAttempts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaximumAutomaticAttempts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaximumAutomaticAttempts")(js.undefined)
        ret
    }
    @scala.inline
    def withParameters(value: RemediationParameters): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parameters")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceType")(js.undefined)
        ret
    }
    @scala.inline
    def withRetryAttemptSeconds(value: AutoRemediationAttemptSeconds): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RetryAttemptSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRetryAttemptSeconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RetryAttemptSeconds")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetVersion")(js.undefined)
        ret
    }
  }
  
}

