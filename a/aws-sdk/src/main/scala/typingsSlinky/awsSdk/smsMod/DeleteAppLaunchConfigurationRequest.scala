package typingsSlinky.awsSdk.smsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteAppLaunchConfigurationRequest extends js.Object {
  /**
    * ID of the application associated with the launch configuration.
    */
  var appId: js.UndefOr[AppId] = js.native
}

object DeleteAppLaunchConfigurationRequest {
  @scala.inline
  def apply(): DeleteAppLaunchConfigurationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteAppLaunchConfigurationRequest]
  }
  @scala.inline
  implicit class DeleteAppLaunchConfigurationRequestOps[Self <: DeleteAppLaunchConfigurationRequest] (val x: Self) extends AnyVal {
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
  }
  
}

