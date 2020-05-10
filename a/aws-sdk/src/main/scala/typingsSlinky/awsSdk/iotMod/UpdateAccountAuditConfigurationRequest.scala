package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateAccountAuditConfigurationRequest extends js.Object {
  /**
    * Specifies which audit checks are enabled and disabled for this account. Use DescribeAccountAuditConfiguration to see the list of all checks, including those that are currently enabled. Some data collection might start immediately when certain checks are enabled. When a check is disabled, any data collected so far in relation to the check is deleted. You cannot disable a check if it is used by any scheduled audit. You must first delete the check from the scheduled audit or delete the scheduled audit itself. On the first call to UpdateAccountAuditConfiguration, this parameter is required and must specify at least one enabled check.
    */
  var auditCheckConfigurations: js.UndefOr[AuditCheckConfigurations] = js.native
  /**
    * Information about the targets to which audit notifications are sent.
    */
  var auditNotificationTargetConfigurations: js.UndefOr[AuditNotificationTargetConfigurations] = js.native
  /**
    * The ARN of the role that grants permission to AWS IoT to access information about your devices, policies, certificates and other items as required when performing an audit.
    */
  var roleArn: js.UndefOr[RoleArn] = js.native
}

object UpdateAccountAuditConfigurationRequest {
  @scala.inline
  def apply(): UpdateAccountAuditConfigurationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateAccountAuditConfigurationRequest]
  }
  @scala.inline
  implicit class UpdateAccountAuditConfigurationRequestOps[Self <: UpdateAccountAuditConfigurationRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuditCheckConfigurations(value: AuditCheckConfigurations): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auditCheckConfigurations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuditCheckConfigurations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auditCheckConfigurations")(js.undefined)
        ret
    }
    @scala.inline
    def withAuditNotificationTargetConfigurations(value: AuditNotificationTargetConfigurations): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auditNotificationTargetConfigurations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuditNotificationTargetConfigurations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auditNotificationTargetConfigurations")(js.undefined)
        ret
    }
    @scala.inline
    def withRoleArn(value: RoleArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roleArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoleArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roleArn")(js.undefined)
        ret
    }
  }
  
}

