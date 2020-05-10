package typingsSlinky.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScheduleAction extends js.Object {
  /**
    * The name of the action, must be unique within the schedule. This name provides the main reference to an action once it is added to the schedule. A name is unique if it is no longer in the schedule. The schedule is automatically cleaned up to remove actions with a start time of more than 1 hour ago (approximately) so at that point a name can be reused.
    */
  var ActionName: string = js.native
  /**
    * Settings for this schedule action.
    */
  var ScheduleActionSettings: typingsSlinky.awsSdk.medialiveMod.ScheduleActionSettings = js.native
  /**
    * The time for the action to start in the channel.
    */
  var ScheduleActionStartSettings: typingsSlinky.awsSdk.medialiveMod.ScheduleActionStartSettings = js.native
}

object ScheduleAction {
  @scala.inline
  def apply(
    ActionName: string,
    ScheduleActionSettings: ScheduleActionSettings,
    ScheduleActionStartSettings: ScheduleActionStartSettings
  ): ScheduleAction = {
    val __obj = js.Dynamic.literal(ActionName = ActionName.asInstanceOf[js.Any], ScheduleActionSettings = ScheduleActionSettings.asInstanceOf[js.Any], ScheduleActionStartSettings = ScheduleActionStartSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScheduleAction]
  }
  @scala.inline
  implicit class ScheduleActionOps[Self <: ScheduleAction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActionName(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ActionName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScheduleActionSettings(value: ScheduleActionSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ScheduleActionSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScheduleActionStartSettings(value: ScheduleActionStartSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ScheduleActionStartSettings")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

