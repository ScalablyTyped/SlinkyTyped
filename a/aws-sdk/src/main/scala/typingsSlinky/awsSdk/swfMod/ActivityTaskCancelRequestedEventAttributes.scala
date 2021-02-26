package typingsSlinky.awsSdk.swfMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActivityTaskCancelRequestedEventAttributes extends StObject {
  
  /**
    * The unique ID of the task.
    */
  var activityId: ActivityId = js.native
  
  /**
    * The ID of the DecisionTaskCompleted event corresponding to the decision task that resulted in the RequestCancelActivityTask decision for this cancellation request. This information can be useful for diagnosing problems by tracing back the chain of events leading up to this event.
    */
  var decisionTaskCompletedEventId: EventId = js.native
}
object ActivityTaskCancelRequestedEventAttributes {
  
  @scala.inline
  def apply(activityId: ActivityId, decisionTaskCompletedEventId: EventId): ActivityTaskCancelRequestedEventAttributes = {
    val __obj = js.Dynamic.literal(activityId = activityId.asInstanceOf[js.Any], decisionTaskCompletedEventId = decisionTaskCompletedEventId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivityTaskCancelRequestedEventAttributes]
  }
  
  @scala.inline
  implicit class ActivityTaskCancelRequestedEventAttributesMutableBuilder[Self <: ActivityTaskCancelRequestedEventAttributes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActivityId(value: ActivityId): Self = StObject.set(x, "activityId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecisionTaskCompletedEventId(value: EventId): Self = StObject.set(x, "decisionTaskCompletedEventId", value.asInstanceOf[js.Any])
  }
}
