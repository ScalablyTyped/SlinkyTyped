package typingsSlinky.awsSdk.swfMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScheduleActivityTaskFailedEventAttributes extends StObject {
  
  /**
    * The activityId provided in the ScheduleActivityTask decision that failed.
    */
  var activityId: ActivityId = js.native
  
  /**
    * The activity type provided in the ScheduleActivityTask decision that failed.
    */
  var activityType: ActivityType = js.native
  
  /**
    * The cause of the failure. This information is generated by the system and can be useful for diagnostic purposes.  If cause is set to OPERATION_NOT_PERMITTED, the decision failed because it lacked sufficient permissions. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide. 
    */
  var cause: ScheduleActivityTaskFailedCause = js.native
  
  /**
    * The ID of the DecisionTaskCompleted event corresponding to the decision that resulted in the scheduling of this activity task. This information can be useful for diagnosing problems by tracing back the chain of events leading up to this event.
    */
  var decisionTaskCompletedEventId: EventId = js.native
}
object ScheduleActivityTaskFailedEventAttributes {
  
  @scala.inline
  def apply(
    activityId: ActivityId,
    activityType: ActivityType,
    cause: ScheduleActivityTaskFailedCause,
    decisionTaskCompletedEventId: EventId
  ): ScheduleActivityTaskFailedEventAttributes = {
    val __obj = js.Dynamic.literal(activityId = activityId.asInstanceOf[js.Any], activityType = activityType.asInstanceOf[js.Any], cause = cause.asInstanceOf[js.Any], decisionTaskCompletedEventId = decisionTaskCompletedEventId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScheduleActivityTaskFailedEventAttributes]
  }
  
  @scala.inline
  implicit class ScheduleActivityTaskFailedEventAttributesMutableBuilder[Self <: ScheduleActivityTaskFailedEventAttributes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActivityId(value: ActivityId): Self = StObject.set(x, "activityId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActivityType(value: ActivityType): Self = StObject.set(x, "activityType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCause(value: ScheduleActivityTaskFailedCause): Self = StObject.set(x, "cause", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecisionTaskCompletedEventId(value: EventId): Self = StObject.set(x, "decisionTaskCompletedEventId", value.asInstanceOf[js.Any])
  }
}
