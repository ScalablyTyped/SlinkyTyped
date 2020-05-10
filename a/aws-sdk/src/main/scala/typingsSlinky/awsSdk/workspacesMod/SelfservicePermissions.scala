package typingsSlinky.awsSdk.workspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SelfservicePermissions extends js.Object {
  /**
    * Specifies whether users can change the compute type (bundle) for their WorkSpace.
    */
  var ChangeComputeType: js.UndefOr[ReconnectEnum] = js.native
  /**
    * Specifies whether users can increase the volume size of the drives on their WorkSpace.
    */
  var IncreaseVolumeSize: js.UndefOr[ReconnectEnum] = js.native
  /**
    * Specifies whether users can rebuild the operating system of a WorkSpace to its original state.
    */
  var RebuildWorkspace: js.UndefOr[ReconnectEnum] = js.native
  /**
    * Specifies whether users can restart their WorkSpace.
    */
  var RestartWorkspace: js.UndefOr[ReconnectEnum] = js.native
  /**
    * Specifies whether users can switch the running mode of their WorkSpace.
    */
  var SwitchRunningMode: js.UndefOr[ReconnectEnum] = js.native
}

object SelfservicePermissions {
  @scala.inline
  def apply(): SelfservicePermissions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SelfservicePermissions]
  }
  @scala.inline
  implicit class SelfservicePermissionsOps[Self <: SelfservicePermissions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChangeComputeType(value: ReconnectEnum): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ChangeComputeType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChangeComputeType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ChangeComputeType")(js.undefined)
        ret
    }
    @scala.inline
    def withIncreaseVolumeSize(value: ReconnectEnum): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IncreaseVolumeSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncreaseVolumeSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IncreaseVolumeSize")(js.undefined)
        ret
    }
    @scala.inline
    def withRebuildWorkspace(value: ReconnectEnum): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RebuildWorkspace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRebuildWorkspace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RebuildWorkspace")(js.undefined)
        ret
    }
    @scala.inline
    def withRestartWorkspace(value: ReconnectEnum): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RestartWorkspace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRestartWorkspace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RestartWorkspace")(js.undefined)
        ret
    }
    @scala.inline
    def withSwitchRunningMode(value: ReconnectEnum): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SwitchRunningMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSwitchRunningMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SwitchRunningMode")(js.undefined)
        ret
    }
  }
  
}

