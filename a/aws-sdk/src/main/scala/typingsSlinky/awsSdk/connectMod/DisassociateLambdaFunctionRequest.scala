package typingsSlinky.awsSdk.connectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DisassociateLambdaFunctionRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the Lambda function being disassociated.
    */
  var FunctionArn: typingsSlinky.awsSdk.connectMod.FunctionArn = js.native
  
  /**
    * The identifier of the Amazon Connect instance..
    */
  var InstanceId: typingsSlinky.awsSdk.connectMod.InstanceId = js.native
}
object DisassociateLambdaFunctionRequest {
  
  @scala.inline
  def apply(FunctionArn: FunctionArn, InstanceId: InstanceId): DisassociateLambdaFunctionRequest = {
    val __obj = js.Dynamic.literal(FunctionArn = FunctionArn.asInstanceOf[js.Any], InstanceId = InstanceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateLambdaFunctionRequest]
  }
  
  @scala.inline
  implicit class DisassociateLambdaFunctionRequestMutableBuilder[Self <: DisassociateLambdaFunctionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFunctionArn(value: FunctionArn): Self = StObject.set(x, "FunctionArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
  }
}
