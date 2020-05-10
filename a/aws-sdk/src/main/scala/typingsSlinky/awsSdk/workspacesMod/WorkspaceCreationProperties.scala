package typingsSlinky.awsSdk.workspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkspaceCreationProperties extends js.Object {
  /**
    * The identifier of your custom security group.
    */
  var CustomSecurityGroupId: js.UndefOr[SecurityGroupId] = js.native
  /**
    * The default organizational unit (OU) for your WorkSpace directories.
    */
  var DefaultOu: js.UndefOr[typingsSlinky.awsSdk.workspacesMod.DefaultOu] = js.native
  /**
    * Indicates whether internet access is enabled for your WorkSpaces.
    */
  var EnableInternetAccess: js.UndefOr[BooleanObject] = js.native
  /**
    * Indicates whether maintenance mode is enabled for your WorkSpaces. For more information, see WorkSpace Maintenance. 
    */
  var EnableMaintenanceMode: js.UndefOr[BooleanObject] = js.native
  /**
    * Indicates whether users are local administrators of their WorkSpaces.
    */
  var UserEnabledAsLocalAdministrator: js.UndefOr[BooleanObject] = js.native
}

object WorkspaceCreationProperties {
  @scala.inline
  def apply(): WorkspaceCreationProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkspaceCreationProperties]
  }
  @scala.inline
  implicit class WorkspaceCreationPropertiesOps[Self <: WorkspaceCreationProperties] (val x: Self) extends AnyVal {
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

