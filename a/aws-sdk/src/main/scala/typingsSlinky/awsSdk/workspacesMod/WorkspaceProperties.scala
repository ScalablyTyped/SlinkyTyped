package typingsSlinky.awsSdk.workspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkspaceProperties extends js.Object {
  /**
    * The compute type. For more information, see Amazon WorkSpaces Bundles.
    */
  var ComputeTypeName: js.UndefOr[Compute] = js.native
  /**
    * The size of the root volume.
    */
  var RootVolumeSizeGib: js.UndefOr[typingsSlinky.awsSdk.workspacesMod.RootVolumeSizeGib] = js.native
  /**
    * The running mode. For more information, see Manage the WorkSpace Running Mode.
    */
  var RunningMode: js.UndefOr[typingsSlinky.awsSdk.workspacesMod.RunningMode] = js.native
  /**
    * The time after a user logs off when WorkSpaces are automatically stopped. Configured in 60-minute intervals.
    */
  var RunningModeAutoStopTimeoutInMinutes: js.UndefOr[typingsSlinky.awsSdk.workspacesMod.RunningModeAutoStopTimeoutInMinutes] = js.native
  /**
    * The size of the user storage.
    */
  var UserVolumeSizeGib: js.UndefOr[typingsSlinky.awsSdk.workspacesMod.UserVolumeSizeGib] = js.native
}

object WorkspaceProperties {
  @scala.inline
  def apply(): WorkspaceProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkspaceProperties]
  }
  @scala.inline
  implicit class WorkspacePropertiesOps[Self <: WorkspaceProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComputeTypeName(value: Compute): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ComputeTypeName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComputeTypeName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ComputeTypeName")(js.undefined)
        ret
    }
    @scala.inline
    def withRootVolumeSizeGib(value: RootVolumeSizeGib): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RootVolumeSizeGib")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRootVolumeSizeGib: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RootVolumeSizeGib")(js.undefined)
        ret
    }
    @scala.inline
    def withRunningMode(value: RunningMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RunningMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRunningMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RunningMode")(js.undefined)
        ret
    }
    @scala.inline
    def withRunningModeAutoStopTimeoutInMinutes(value: RunningModeAutoStopTimeoutInMinutes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RunningModeAutoStopTimeoutInMinutes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRunningModeAutoStopTimeoutInMinutes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RunningModeAutoStopTimeoutInMinutes")(js.undefined)
        ret
    }
    @scala.inline
    def withUserVolumeSizeGib(value: UserVolumeSizeGib): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserVolumeSizeGib")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserVolumeSizeGib: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserVolumeSizeGib")(js.undefined)
        ret
    }
  }
  
}

