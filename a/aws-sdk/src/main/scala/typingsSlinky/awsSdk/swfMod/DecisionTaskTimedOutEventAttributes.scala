package typingsSlinky.awsSdk.swfMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DecisionTaskTimedOutEventAttributes extends StObject {
  
  /**
    * The ID of the DecisionTaskScheduled event that was recorded when this decision task was scheduled. This information can be useful for diagnosing problems by tracing back the chain of events leading up to this event.
    */
  var scheduledEventId: EventId = js.native
  
  /**
    * The ID of the DecisionTaskStarted event recorded when this decision task was started. This information can be useful for diagnosing problems by tracing back the chain of events leading up to this event.
    */
  var startedEventId: EventId = js.native
  
  /**
    * The type of timeout that expired before the decision task could be completed.
    */
  var timeoutType: DecisionTaskTimeoutType = js.native
}
object DecisionTaskTimedOutEventAttributes {
  
  @scala.inline
  def apply(scheduledEventId: EventId, startedEventId: EventId, timeoutType: DecisionTaskTimeoutType): DecisionTaskTimedOutEventAttributes = {
    val __obj = js.Dynamic.literal(scheduledEventId = scheduledEventId.asInstanceOf[js.Any], startedEventId = startedEventId.asInstanceOf[js.Any], timeoutType = timeoutType.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecisionTaskTimedOutEventAttributes]
  }
  
  @scala.inline
  implicit class DecisionTaskTimedOutEventAttributesMutableBuilder[Self <: DecisionTaskTimedOutEventAttributes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setScheduledEventId(value: EventId): Self = StObject.set(x, "scheduledEventId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartedEventId(value: EventId): Self = StObject.set(x, "startedEventId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutType(value: DecisionTaskTimeoutType): Self = StObject.set(x, "timeoutType", value.asInstanceOf[js.Any])
  }
}
