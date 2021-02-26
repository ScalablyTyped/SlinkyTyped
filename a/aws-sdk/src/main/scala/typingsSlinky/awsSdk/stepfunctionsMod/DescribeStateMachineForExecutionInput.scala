package typingsSlinky.awsSdk.stepfunctionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeStateMachineForExecutionInput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the execution you want state machine information for.
    */
  var executionArn: Arn = js.native
}
object DescribeStateMachineForExecutionInput {
  
  @scala.inline
  def apply(executionArn: Arn): DescribeStateMachineForExecutionInput = {
    val __obj = js.Dynamic.literal(executionArn = executionArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeStateMachineForExecutionInput]
  }
  
  @scala.inline
  implicit class DescribeStateMachineForExecutionInputMutableBuilder[Self <: DescribeStateMachineForExecutionInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExecutionArn(value: Arn): Self = StObject.set(x, "executionArn", value.asInstanceOf[js.Any])
  }
}
