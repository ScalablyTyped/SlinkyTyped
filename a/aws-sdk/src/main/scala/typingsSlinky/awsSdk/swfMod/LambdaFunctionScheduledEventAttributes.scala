package typingsSlinky.awsSdk.swfMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LambdaFunctionScheduledEventAttributes extends StObject {
  
  /**
    * Data attached to the event that the decider can use in subsequent workflow tasks. This data isn't sent to the Lambda task.
    */
  var control: js.UndefOr[Data] = js.native
  
  /**
    * The ID of the LambdaFunctionCompleted event corresponding to the decision that resulted in scheduling this activity task. To help diagnose issues, use this information to trace back the chain of events leading up to this event.
    */
  var decisionTaskCompletedEventId: EventId = js.native
  
  /**
    * The unique ID of the Lambda task.
    */
  var id: FunctionId = js.native
  
  /**
    * The input provided to the Lambda task.
    */
  var input: js.UndefOr[FunctionInput] = js.native
  
  /**
    * The name of the Lambda function.
    */
  var name: FunctionName = js.native
  
  /**
    * The maximum amount of time a worker can take to process the Lambda task.
    */
  var startToCloseTimeout: js.UndefOr[DurationInSecondsOptional] = js.native
}
object LambdaFunctionScheduledEventAttributes {
  
  @scala.inline
  def apply(decisionTaskCompletedEventId: EventId, id: FunctionId, name: FunctionName): LambdaFunctionScheduledEventAttributes = {
    val __obj = js.Dynamic.literal(decisionTaskCompletedEventId = decisionTaskCompletedEventId.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[LambdaFunctionScheduledEventAttributes]
  }
  
  @scala.inline
  implicit class LambdaFunctionScheduledEventAttributesMutableBuilder[Self <: LambdaFunctionScheduledEventAttributes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setControl(value: Data): Self = StObject.set(x, "control", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setControlUndefined: Self = StObject.set(x, "control", js.undefined)
    
    @scala.inline
    def setDecisionTaskCompletedEventId(value: EventId): Self = StObject.set(x, "decisionTaskCompletedEventId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: FunctionId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInput(value: FunctionInput): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
    
    @scala.inline
    def setName(value: FunctionName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartToCloseTimeout(value: DurationInSecondsOptional): Self = StObject.set(x, "startToCloseTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartToCloseTimeoutUndefined: Self = StObject.set(x, "startToCloseTimeout", js.undefined)
  }
}
