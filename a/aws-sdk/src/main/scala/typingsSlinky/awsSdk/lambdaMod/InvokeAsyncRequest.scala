package typingsSlinky.awsSdk.lambdaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InvokeAsyncRequest extends StObject {
  
  /**
    * The name of the Lambda function.  Name formats     Function name - my-function.    Function ARN - arn:aws:lambda:us-west-2:123456789012:function:my-function.    Partial ARN - 123456789012:function:my-function.   The length constraint applies only to the full ARN. If you specify only the function name, it is limited to 64 characters in length.
    */
  var FunctionName: NamespacedFunctionName = js.native
  
  /**
    * The JSON that you want to provide to your Lambda function as input.
    */
  var InvokeArgs: BlobStream = js.native
}
object InvokeAsyncRequest {
  
  @scala.inline
  def apply(FunctionName: NamespacedFunctionName, InvokeArgs: BlobStream): InvokeAsyncRequest = {
    val __obj = js.Dynamic.literal(FunctionName = FunctionName.asInstanceOf[js.Any], InvokeArgs = InvokeArgs.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvokeAsyncRequest]
  }
  
  @scala.inline
  implicit class InvokeAsyncRequestMutableBuilder[Self <: InvokeAsyncRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFunctionName(value: NamespacedFunctionName): Self = StObject.set(x, "FunctionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvokeArgs(value: BlobStream): Self = StObject.set(x, "InvokeArgs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvokeArgsUint8Array(value: js.typedarray.Uint8Array): Self = StObject.set(x, "InvokeArgs", value.asInstanceOf[js.Any])
  }
}
