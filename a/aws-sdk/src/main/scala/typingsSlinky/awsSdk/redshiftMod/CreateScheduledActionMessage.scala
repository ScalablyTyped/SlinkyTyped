package typingsSlinky.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateScheduledActionMessage extends js.Object {
  /**
    * If true, the schedule is enabled. If false, the scheduled action does not trigger. For more information about state of the scheduled action, see ScheduledAction. 
    */
  var Enable: js.UndefOr[BooleanOptional] = js.native
  /**
    * The end time in UTC of the scheduled action. After this time, the scheduled action does not trigger. For more information about this parameter, see ScheduledAction. 
    */
  var EndTime: js.UndefOr[js.Date] = js.native
  /**
    * The IAM role to assume to run the target action. For more information about this parameter, see ScheduledAction. 
    */
  var IamRole: String = js.native
  /**
    * The schedule in at( ) or cron( ) format. For more information about this parameter, see ScheduledAction.
    */
  var Schedule: String = js.native
  /**
    * The description of the scheduled action. 
    */
  var ScheduledActionDescription: js.UndefOr[String] = js.native
  /**
    * The name of the scheduled action. The name must be unique within an account. For more information about this parameter, see ScheduledAction. 
    */
  var ScheduledActionName: String = js.native
  /**
    * The start time in UTC of the scheduled action. Before this time, the scheduled action does not trigger. For more information about this parameter, see ScheduledAction.
    */
  var StartTime: js.UndefOr[js.Date] = js.native
  /**
    * A JSON format string of the Amazon Redshift API operation with input parameters. For more information about this parameter, see ScheduledAction. 
    */
  var TargetAction: ScheduledActionType = js.native
}

object CreateScheduledActionMessage {
  @scala.inline
  def apply(IamRole: String, Schedule: String, ScheduledActionName: String, TargetAction: ScheduledActionType): CreateScheduledActionMessage = {
    val __obj = js.Dynamic.literal(IamRole = IamRole.asInstanceOf[js.Any], Schedule = Schedule.asInstanceOf[js.Any], ScheduledActionName = ScheduledActionName.asInstanceOf[js.Any], TargetAction = TargetAction.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateScheduledActionMessage]
  }
  @scala.inline
  implicit class CreateScheduledActionMessageOps[Self <: CreateScheduledActionMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIamRole(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IamRole")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSchedule(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Schedule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScheduledActionName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ScheduledActionName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargetAction(value: ScheduledActionType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetAction")(value.asInstanceOf[js.Any])
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
  }
  
}

