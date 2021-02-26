package typingsSlinky.awsSdk.swfMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkflowExecutionFailedEventAttributes extends StObject {
  
  /**
    * The ID of the DecisionTaskCompleted event corresponding to the decision task that resulted in the FailWorkflowExecution decision to fail this execution. This information can be useful for diagnosing problems by tracing back the chain of events leading up to this event.
    */
  var decisionTaskCompletedEventId: EventId = js.native
  
  /**
    * The details of the failure.
    */
  var details: js.UndefOr[Data] = js.native
  
  /**
    * The descriptive reason provided for the failure.
    */
  var reason: js.UndefOr[FailureReason] = js.native
}
object WorkflowExecutionFailedEventAttributes {
  
  @scala.inline
  def apply(decisionTaskCompletedEventId: EventId): WorkflowExecutionFailedEventAttributes = {
    val __obj = js.Dynamic.literal(decisionTaskCompletedEventId = decisionTaskCompletedEventId.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkflowExecutionFailedEventAttributes]
  }
  
  @scala.inline
  implicit class WorkflowExecutionFailedEventAttributesMutableBuilder[Self <: WorkflowExecutionFailedEventAttributes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDecisionTaskCompletedEventId(value: EventId): Self = StObject.set(x, "decisionTaskCompletedEventId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetails(value: Data): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
    
    @scala.inline
    def setReason(value: FailureReason): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
  }
}
