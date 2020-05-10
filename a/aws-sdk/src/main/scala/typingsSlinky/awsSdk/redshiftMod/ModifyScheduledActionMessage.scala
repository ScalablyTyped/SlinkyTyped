package typingsSlinky.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyScheduledActionMessage extends js.Object {
  /**
    * A modified enable flag of the scheduled action. If true, the scheduled action is active. If false, the scheduled action is disabled. 
    */
  var Enable: js.UndefOr[BooleanOptional] = js.native
  /**
    * A modified end time of the scheduled action. For more information about this parameter, see ScheduledAction. 
    */
  var EndTime: js.UndefOr[js.Date] = js.native
  /**
    * A different IAM role to assume to run the target action. For more information about this parameter, see ScheduledAction.
    */
  var IamRole: js.UndefOr[String] = js.native
  /**
    * A modified schedule in either at( ) or cron( ) format. For more information about this parameter, see ScheduledAction.
    */
  var Schedule: js.UndefOr[String] = js.native
  /**
    * A modified description of the scheduled action. 
    */
  var ScheduledActionDescription: js.UndefOr[String] = js.native
  /**
    * The name of the scheduled action to modify. 
    */
  var ScheduledActionName: String = js.native
  /**
    * A modified start time of the scheduled action. For more information about this parameter, see ScheduledAction. 
    */
  var StartTime: js.UndefOr[js.Date] = js.native
  /**
    * A modified JSON format of the scheduled action. For more information about this parameter, see ScheduledAction. 
    */
  var TargetAction: js.UndefOr[ScheduledActionType] = js.native
}

object ModifyScheduledActionMessage {
  @scala.inline
  def apply(ScheduledActionName: String): ModifyScheduledActionMessage = {
    val __obj = js.Dynamic.literal(ScheduledActionName = ScheduledActionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyScheduledActionMessage]
  }
  @scala.inline
  implicit class ModifyScheduledActionMessageOps[Self <: ModifyScheduledActionMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withScheduledActionName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ScheduledActionName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnable(value: BooleanOptional): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Enable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Enable")(js.undefined)
        ret
    }
    @scala.inline
    def withEndTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndTime")(js.undefined)
        ret
    }
    @scala.inline
    def withIamRole(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IamRole")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIamRole: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IamRole")(js.undefined)
        ret
    }
    @scala.inline
    def withSchedule(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Schedule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSchedule: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Schedule")(js.undefined)
        ret
    }
    @scala.inline
    def withScheduledActionDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ScheduledActionDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScheduledActionDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ScheduledActionDescription")(js.undefined)
        ret
    }
    @scala.inline
    def withStartTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StartTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StartTime")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetAction(value: ScheduledActionType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetAction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetAction")(js.undefined)
        ret
    }
  }
  
}

