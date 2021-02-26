package typingsSlinky.awsSdk.connectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssociateLambdaFunctionRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) for the Lambda function being associated. Maximum number of characters allowed is 140.
    */
  var FunctionArn: typingsSlinky.awsSdk.connectMod.FunctionArn = js.native
  
  /**
    * The identifier of the Amazon Connect instance.
    */
  var InstanceId: typingsSlinky.awsSdk.connectMod.InstanceId = js.native
}
object AssociateLambdaFunctionRequest {
  
  @scala.inline
  def apply(FunctionArn: FunctionArn, InstanceId: InstanceId): AssociateLambdaFunctionRequest = {
    val __obj = js.Dynamic.literal(FunctionArn = FunctionArn.asInstanceOf[js.Any], InstanceId = InstanceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateLambdaFunctionRequest]
  }
  
  @scala.inline
  implicit class AssociateLambdaFunctionRequestMutableBuilder[Self <: AssociateLambdaFunctionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFunctionArn(value: FunctionArn): Self = StObject.set(x, "FunctionArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
  }
}
