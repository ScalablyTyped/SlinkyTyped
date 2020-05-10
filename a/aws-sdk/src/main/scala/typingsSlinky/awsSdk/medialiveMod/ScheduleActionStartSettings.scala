package typingsSlinky.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScheduleActionStartSettings extends js.Object {
  /**
    * Option for specifying the start time for an action.
    */
  var FixedModeScheduleActionStartSettings: js.UndefOr[typingsSlinky.awsSdk.medialiveMod.FixedModeScheduleActionStartSettings] = js.native
  /**
    * Option for specifying an action as relative to another action.
    */
  var FollowModeScheduleActionStartSettings: js.UndefOr[typingsSlinky.awsSdk.medialiveMod.FollowModeScheduleActionStartSettings] = js.native
  /**
    * Option for specifying an action that should be applied immediately.
    */
  var ImmediateModeScheduleActionStartSettings: js.UndefOr[typingsSlinky.awsSdk.medialiveMod.ImmediateModeScheduleActionStartSettings] = js.native
}

object ScheduleActionStartSettings {
  @scala.inline
  def apply(): ScheduleActionStartSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScheduleActionStartSettings]
  }
  @scala.inline
  implicit class ScheduleActionStartSettingsOps[Self <: ScheduleActionStartSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFixedModeScheduleActionStartSettings(value: FixedModeScheduleActionStartSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FixedModeScheduleActionStartSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFixedModeScheduleActionStartSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FixedModeScheduleActionStartSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withFollowModeScheduleActionStartSettings(value: FollowModeScheduleActionStartSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FollowModeScheduleActionStartSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFollowModeScheduleActionStartSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FollowModeScheduleActionStartSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withImmediateModeScheduleActionStartSettings(value: ImmediateModeScheduleActionStartSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImmediateModeScheduleActionStartSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImmediateModeScheduleActionStartSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImmediateModeScheduleActionStartSettings")(js.undefined)
        ret
    }
  }
  
}

