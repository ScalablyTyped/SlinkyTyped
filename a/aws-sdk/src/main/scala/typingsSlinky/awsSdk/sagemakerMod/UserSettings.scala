package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserSettings extends js.Object {
  /**
    * The execution role for the user.
    */
  var ExecutionRole: js.UndefOr[RoleArn] = js.native
  /**
    * The Jupyter server's app settings.
    */
  var JupyterServerAppSettings: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.JupyterServerAppSettings] = js.native
  /**
    * The kernel gateway app settings.
    */
  var KernelGatewayAppSettings: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.KernelGatewayAppSettings] = js.native
  /**
    * The security groups.
    */
  var SecurityGroups: js.UndefOr[SecurityGroupIds] = js.native
  /**
    * The sharing settings.
    */
  var SharingSettings: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.SharingSettings] = js.native
  /**
    * The TensorBoard app settings.
    */
  var TensorBoardAppSettings: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.TensorBoardAppSettings] = js.native
}

object UserSettings {
  @scala.inline
  def apply(): UserSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserSettings]
  }
  @scala.inline
  implicit class UserSettingsOps[Self <: UserSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExecutionRole(value: RoleArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExecutionRole")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExecutionRole: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExecutionRole")(js.undefined)
        ret
    }
    @scala.inline
    def withJupyterServerAppSettings(value: JupyterServerAppSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JupyterServerAppSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJupyterServerAppSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JupyterServerAppSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withKernelGatewayAppSettings(value: KernelGatewayAppSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KernelGatewayAppSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKernelGatewayAppSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KernelGatewayAppSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withSecurityGroups(value: SecurityGroupIds): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SecurityGroups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecurityGroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SecurityGroups")(js.undefined)
        ret
    }
    @scala.inline
    def withSharingSettings(value: SharingSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SharingSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSharingSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SharingSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withTensorBoardAppSettings(value: TensorBoardAppSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TensorBoardAppSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTensorBoardAppSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TensorBoardAppSettings")(js.undefined)
        ret
    }
  }
  
}

