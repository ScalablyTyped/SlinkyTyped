package typingsSlinky.awsSdk.swfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScheduleActivityTaskDecisionAttributes extends js.Object {
  /**
    *  The activityId of the activity task. The specified string must not start or end with whitespace. It must not contain a : (colon), / (slash), | (vertical bar), or any control characters (\\u0000-\\u001f | \\u007f-\\u009f). Also, it must not contain the literal string arn.
    */
  var activityId: ActivityId = js.native
  /**
    *  The type of the activity task to schedule.
    */
  var activityType: ActivityType = js.native
  /**
    * Data attached to the event that can be used by the decider in subsequent workflow tasks. This data isn't sent to the activity.
    */
  var control: js.UndefOr[Data] = js.native
  /**
    * If set, specifies the maximum time before which a worker processing a task of this type must report progress by calling RecordActivityTaskHeartbeat. If the timeout is exceeded, the activity task is automatically timed out. If the worker subsequently attempts to record a heartbeat or returns a result, it is ignored. This overrides the default heartbeat timeout specified when registering the activity type using RegisterActivityType. The duration is specified in seconds, an integer greater than or equal to 0. You can use NONE to specify unlimited duration.
    */
  var heartbeatTimeout: js.UndefOr[DurationInSecondsOptional] = js.native
  /**
    * The input provided to the activity task.
    */
  var input: js.UndefOr[Data] = js.native
  /**
    * The maximum duration for this activity task. The duration is specified in seconds, an integer greater than or equal to 0. You can use NONE to specify unlimited duration.  A schedule-to-close timeout for this activity task must be specified either as a default for the activity type or through this field. If neither this field is set nor a default schedule-to-close timeout was specified at registration time then a fault is returned. 
    */
  var scheduleToCloseTimeout: js.UndefOr[DurationInSecondsOptional] = js.native
  /**
    *  If set, specifies the maximum duration the activity task can wait to be assigned to a worker. This overrides the default schedule-to-start timeout specified when registering the activity type using RegisterActivityType. The duration is specified in seconds, an integer greater than or equal to 0. You can use NONE to specify unlimited duration.  A schedule-to-start timeout for this activity task must be specified either as a default for the activity type or through this field. If neither this field is set nor a default schedule-to-start timeout was specified at registration time then a fault is returned. 
    */
  var scheduleToStartTimeout: js.UndefOr[DurationInSecondsOptional] = js.native
  /**
    * If set, specifies the maximum duration a worker may take to process this activity task. This overrides the default start-to-close timeout specified when registering the activity type using RegisterActivityType. The duration is specified in seconds, an integer greater than or equal to 0. You can use NONE to specify unlimited duration.  A start-to-close timeout for this activity task must be specified either as a default for the activity type or through this field. If neither this field is set nor a default start-to-close timeout was specified at registration time then a fault is returned. 
    */
  var startToCloseTimeout: js.UndefOr[DurationInSecondsOptional] = js.native
  /**
    * If set, specifies the name of the task list in which to schedule the activity task. If not specified, the defaultTaskList registered with the activity type is used.  A task list for this activity task must be specified either as a default for the activity type or through this field. If neither this field is set nor a default task list was specified at registration time then a fault is returned.  The specified string must not start or end with whitespace. It must not contain a : (colon), / (slash), | (vertical bar), or any control characters (\\u0000-\\u001f | \\u007f-\\u009f). Also, it must not contain the literal string arn.
    */
  var taskList: js.UndefOr[TaskList] = js.native
  /**
    *  If set, specifies the priority with which the activity task is to be assigned to a worker. This overrides the defaultTaskPriority specified when registering the activity type using RegisterActivityType. Valid values are integers that range from Java's Integer.MIN_VALUE (-2147483648) to Integer.MAX_VALUE (2147483647). Higher numbers indicate higher priority. For more information about setting task priority, see Setting Task Priority in the Amazon SWF Developer Guide.
    */
  var taskPriority: js.UndefOr[TaskPriority] = js.native
}

object ScheduleActivityTaskDecisionAttributes {
  @scala.inline
  def apply(activityId: ActivityId, activityType: ActivityType): ScheduleActivityTaskDecisionAttributes = {
    val __obj = js.Dynamic.literal(activityId = activityId.asInstanceOf[js.Any], activityType = activityType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScheduleActivityTaskDecisionAttributes]
  }
  @scala.inline
  implicit class ScheduleActivityTaskDecisionAttributesOps[Self <: ScheduleActivityTaskDecisionAttributes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActivityId(value: ActivityId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activityId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActivityType(value: ActivityType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activityType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withControl(value: Data): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("control")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutControl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("control")(js.undefined)
        ret
    }
    @scala.inline
    def withHeartbeatTimeout(value: DurationInSecondsOptional): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heartbeatTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeartbeatTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heartbeatTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withInput(value: Data): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input")(js.undefined)
        ret
    }
    @scala.inline
    def withScheduleToCloseTimeout(value: DurationInSecondsOptional): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scheduleToCloseTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScheduleToCloseTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scheduleToCloseTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withScheduleToStartTimeout(value: DurationInSecondsOptional): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scheduleToStartTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScheduleToStartTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scheduleToStartTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withStartToCloseTimeout(value: DurationInSecondsOptional): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startToCloseTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartToCloseTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startToCloseTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withTaskList(value: TaskList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTaskList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskList")(js.undefined)
        ret
    }
    @scala.inline
    def withTaskPriority(value: TaskPriority): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskPriority")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTaskPriority: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskPriority")(js.undefined)
        ret
    }
  }
  
}

