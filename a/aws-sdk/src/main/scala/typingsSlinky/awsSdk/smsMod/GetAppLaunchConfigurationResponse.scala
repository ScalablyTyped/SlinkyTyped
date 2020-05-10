package typingsSlinky.awsSdk.smsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAppLaunchConfigurationResponse extends js.Object {
  /**
    * ID of the application associated with the launch configuration.
    */
  var appId: js.UndefOr[AppId] = js.native
  /**
    * Name of the service role in the customer's account that Amazon CloudFormation uses to launch the application.
    */
  var roleName: js.UndefOr[RoleName] = js.native
  /**
    * List of launch configurations for server groups in this application.
    */
  var serverGroupLaunchConfigurations: js.UndefOr[ServerGroupLaunchConfigurations] = js.native
}

object GetAppLaunchConfigurationResponse {
  @scala.inline
  def apply(): GetAppLaunchConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAppLaunchConfigurationResponse]
  }
  @scala.inline
  implicit class GetAppLaunchConfigurationResponseOps[Self <: GetAppLaunchConfigurationResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppId(value: AppId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appId")(js.undefined)
        ret
    }
    @scala.inline
    def withRoleName(value: RoleName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roleName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoleName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roleName")(js.undefined)
        ret
    }
    @scala.inline
    def withServerGroupLaunchConfigurations(value: ServerGroupLaunchConfigurations): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverGroupLaunchConfigurations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServerGroupLaunchConfigurations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverGroupLaunchConfigurations")(js.undefined)
        ret
    }
  }
  
}

