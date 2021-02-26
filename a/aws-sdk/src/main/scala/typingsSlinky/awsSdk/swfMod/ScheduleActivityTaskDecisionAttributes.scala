package typingsSlinky.awsSdk.swfMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScheduleActivityTaskDecisionAttributes extends StObject {
  
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
  implicit class ScheduleActivityTaskDecisionAttributesMutableBuilder[Self <: ScheduleActivityTaskDecisionAttributes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActivityId(value: ActivityId): Self = StObject.set(x, "activityId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActivityType(value: ActivityType): Self = StObject.set(x, "activityType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setControl(value: Data): Self = StObject.set(x, "control", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setControlUndefined: Self = StObject.set(x, "control", js.undefined)
    
    @scala.inline
    def setHeartbeatTimeout(value: DurationInSecondsOptional): Self = StObject.set(x, "heartbeatTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeartbeatTimeoutUndefined: Self = StObject.set(x, "heartbeatTimeout", js.undefined)
    
    @scala.inline
    def setInput(value: Data): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
    
    @scala.inline
    def setScheduleToCloseTimeout(value: DurationInSecondsOptional): Self = StObject.set(x, "scheduleToCloseTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScheduleToCloseTimeoutUndefined: Self = StObject.set(x, "scheduleToCloseTimeout", js.undefined)
    
    @scala.inline
    def setScheduleToStartTimeout(value: DurationInSecondsOptional): Self = StObject.set(x, "scheduleToStartTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScheduleToStartTimeoutUndefined: Self = StObject.set(x, "scheduleToStartTimeout", js.undefined)
    
    @scala.inline
    def setStartToCloseTimeout(value: DurationInSecondsOptional): Self = StObject.set(x, "startToCloseTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartToCloseTimeoutUndefined: Self = StObject.set(x, "startToCloseTimeout", js.undefined)
    
    @scala.inline
    def setTaskList(value: TaskList): Self = StObject.set(x, "taskList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaskListUndefined: Self = StObject.set(x, "taskList", js.undefined)
    
    @scala.inline
    def setTaskPriority(value: TaskPriority): Self = StObject.set(x, "taskPriority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaskPriorityUndefined: Self = StObject.set(x, "taskPriority", js.undefined)
  }
}
