package typingsSlinky.awsSdk.workspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefaultWorkspaceCreationProperties extends js.Object {
  /**
    * The identifier of any security groups to apply to WorkSpaces when they are created.
    */
  var CustomSecurityGroupId: js.UndefOr[SecurityGroupId] = js.native
  /**
    * The organizational unit (OU) in the directory for the WorkSpace machine accounts.
    */
  var DefaultOu: js.UndefOr[typingsSlinky.awsSdk.workspacesMod.DefaultOu] = js.native
  /**
    * Specifies whether to automatically assign an Elastic public IP address to WorkSpaces in this directory by default. If enabled, the Elastic public IP address allows outbound internet access from your WorkSpaces when you’re using an internet gateway in the Amazon VPC in which your WorkSpaces are located. If you're using a Network Address Translation (NAT) gateway for outbound internet access from your VPC, or if your WorkSpaces are in public subnets and you manually assign them Elastic IP addresses, you should disable this setting. This setting applies to new WorkSpaces that you launch or to existing WorkSpaces that you rebuild. For more information, see  Configure a VPC for Amazon WorkSpaces.
    */
  var EnableInternetAccess: js.UndefOr[BooleanObject] = js.native
  /**
    * Specifies whether maintenance mode is enabled for WorkSpaces. For more information, see WorkSpace Maintenance.
    */
  var EnableMaintenanceMode: js.UndefOr[BooleanObject] = js.native
  /**
    * Specifies whether the directory is enabled for Amazon WorkDocs.
    */
  var EnableWorkDocs: js.UndefOr[BooleanObject] = js.native
  /**
    * Specifies whether WorkSpace users are local administrators on their WorkSpaces.
    */
  var UserEnabledAsLocalAdministrator: js.UndefOr[BooleanObject] = js.native
}

object DefaultWorkspaceCreationProperties {
  @scala.inline
  def apply(): DefaultWorkspaceCreationProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefaultWorkspaceCreationProperties]
  }
  @scala.inline
  implicit class DefaultWorkspaceCreationPropertiesOps[Self <: DefaultWorkspaceCreationProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCustomSecurityGroupId(value: SecurityGroupId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CustomSecurityGroupId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomSecurityGroupId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CustomSecurityGroupId")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultOu(value: DefaultOu): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DefaultOu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultOu: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DefaultOu")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableInternetAccess(value: BooleanObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnableInternetAccess")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableInternetAccess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnableInternetAccess")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableMaintenanceMode(value: BooleanObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnableMaintenanceMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableMaintenanceMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnableMaintenanceMode")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableWorkDocs(value: BooleanObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnableWorkDocs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableWorkDocs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnableWorkDocs")(js.undefined)
        ret
    }
    @scala.inline
    def withUserEnabledAsLocalAdministrator(value: BooleanObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserEnabledAsLocalAdministrator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserEnabledAsLocalAdministrator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserEnabledAsLocalAdministrator")(js.undefined)
        ret
    }
  }
  
}

