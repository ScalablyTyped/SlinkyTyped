package typingsSlinky.awsSdk.swfMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FailWorkflowExecutionFailedEventAttributes extends StObject {
  
  /**
    * The cause of the failure. This information is generated by the system and can be useful for diagnostic purposes.  If cause is set to OPERATION_NOT_PERMITTED, the decision failed because it lacked sufficient permissions. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide. 
    */
  var cause: FailWorkflowExecutionFailedCause = js.native
  
  /**
    * The ID of the DecisionTaskCompleted event corresponding to the decision task that resulted in the FailWorkflowExecution decision to fail this execution. This information can be useful for diagnosing problems by tracing back the chain of events leading up to this event.
    */
  var decisionTaskCompletedEventId: EventId = js.native
}
object FailWorkflowExecutionFailedEventAttributes {
  
  @scala.inline
  def apply(cause: FailWorkflowExecutionFailedCause, decisionTaskCompletedEventId: EventId): FailWorkflowExecutionFailedEventAttributes = {
    val __obj = js.Dynamic.literal(cause = cause.asInstanceOf[js.Any], decisionTaskCompletedEventId = decisionTaskCompletedEventId.asInstanceOf[js.Any])
    __obj.asInstanceOf[FailWorkflowExecutionFailedEventAttributes]
  }
  
  @scala.inline
  implicit class FailWorkflowExecutionFailedEventAttributesMutableBuilder[Self <: FailWorkflowExecutionFailedEventAttributes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCause(value: FailWorkflowExecutionFailedCause): Self = StObject.set(x, "cause", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecisionTaskCompletedEventId(value: EventId): Self = StObject.set(x, "decisionTaskCompletedEventId", value.asInstanceOf[js.Any])
  }
}
