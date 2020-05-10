package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeAccountAuditConfigurationResponse extends js.Object {
  /**
    * Which audit checks are enabled and disabled for this account.
    */
  var auditCheckConfigurations: js.UndefOr[AuditCheckConfigurations] = js.native
  /**
    * Information about the targets to which audit notifications are sent for this account.
    */
  var auditNotificationTargetConfigurations: js.UndefOr[AuditNotificationTargetConfigurations] = js.native
  /**
    * The ARN of the role that grants permission to AWS IoT to access information about your devices, policies, certificates, and other items as required when performing an audit. On the first call to UpdateAccountAuditConfiguration, this parameter is required.
    */
  var roleArn: js.UndefOr[RoleArn] = js.native
}

object DescribeAccountAuditConfigurationResponse {
  @scala.inline
  def apply(): DescribeAccountAuditConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAccountAuditConfigurationResponse]
  }
  @scala.inline
  implicit class DescribeAccountAuditConfigurationResponseOps[Self <: DescribeAccountAuditConfigurationResponse] (val x: Self) extends AnyVal {
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

