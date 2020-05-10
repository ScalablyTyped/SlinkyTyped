package typingsSlinky.pulumiAws.outputMod.workspaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DirectorySelfServicePermissions extends js.Object {
  /**
    * Whether WorkSpaces directory users can change the compute type (bundle) for their workspace. Default `false`.
    */
  var changeComputeType: js.UndefOr[Boolean] = js.native
  /**
    * Whether WorkSpaces directory users can increase the volume size of the drives on their workspace. Default `false`.
    */
  var increaseVolumeSize: js.UndefOr[Boolean] = js.native
  /**
    * Whether WorkSpaces directory users can rebuild the operating system of a workspace to its original state. Default `false`.
    */
  var rebuildWorkspace: js.UndefOr[Boolean] = js.native
  /**
    * Whether WorkSpaces directory users can restart their workspace. Default `true`.
    */
  var restartWorkspace: js.UndefOr[Boolean] = js.native
  /**
    * Whether WorkSpaces directory users can switch the running mode of their workspace. Default `false`.
    */
  var switchRunningMode: js.UndefOr[Boolean] = js.native
}

object DirectorySelfServicePermissions {
  @scala.inline
  def apply(): DirectorySelfServicePermissions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DirectorySelfServicePermissions]
  }
  @scala.inline
  implicit class DirectorySelfServicePermissionsOps[Self <: DirectorySelfServicePermissions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChangeComputeType(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changeComputeType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChangeComputeType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changeComputeType")(js.undefined)
        ret
    }
    @scala.inline
    def withIncreaseVolumeSize(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("increaseVolumeSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncreaseVolumeSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("increaseVolumeSize")(js.undefined)
        ret
    }
    @scala.inline
    def withRebuildWorkspace(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rebuildWorkspace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRebuildWorkspace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rebuildWorkspace")(js.undefined)
        ret
    }
    @scala.inline
    def withRestartWorkspace(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restartWorkspace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRestartWorkspace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restartWorkspace")(js.undefined)
        ret
    }
    @scala.inline
    def withSwitchRunningMode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("switchRunningMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSwitchRunningMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("switchRunningMode")(js.undefined)
        ret
    }
  }
  
}

