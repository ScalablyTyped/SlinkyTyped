package typingsSlinky.awsSdk.lambdaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InvocationRequest extends StObject {
  
  /**
    * Up to 3583 bytes of base64-encoded data about the invoking client to pass to the function in the context object.
    */
  var ClientContext: js.UndefOr[String] = js.native
  
  /**
    * The name of the Lambda function, version, or alias.  Name formats     Function name - my-function (name-only), my-function:v1 (with alias).    Function ARN - arn:aws:lambda:us-west-2:123456789012:function:my-function.    Partial ARN - 123456789012:function:my-function.   You can append a version number or alias to any of the formats. The length constraint applies only to the full ARN. If you specify only the function name, it is limited to 64 characters in length.
    */
  var FunctionName: NamespacedFunctionName = js.native
  
  /**
    * Choose from the following options.    RequestResponse (default) - Invoke the function synchronously. Keep the connection open until the function returns a response or times out. The API response includes the function response and additional data.    Event - Invoke the function asynchronously. Send events that fail multiple times to the function's dead-letter queue (if it's configured). The API response only includes a status code.    DryRun - Validate parameter values and verify that the user or role has permission to invoke the function.  
    */
  var InvocationType: js.UndefOr[typingsSlinky.awsSdk.lambdaMod.InvocationType] = js.native
  
  /**
    * Set to Tail to include the execution log in the response.
    */
  var LogType: js.UndefOr[typingsSlinky.awsSdk.lambdaMod.LogType] = js.native
  
  /**
    * The JSON that you want to provide to your Lambda function as input.
    */
  var Payload: js.UndefOr[_Blob] = js.native
  
  /**
    * Specify a version or alias to invoke a published version of the function.
    */
  var Qualifier: js.UndefOr[typingsSlinky.awsSdk.lambdaMod.Qualifier] = js.native
}
object InvocationRequest {
  
  @scala.inline
  def apply(FunctionName: NamespacedFunctionName): InvocationRequest = {
    val __obj = js.Dynamic.literal(FunctionName = FunctionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvocationRequest]
  }
  
  @scala.inline
  implicit class InvocationRequestMutableBuilder[Self <: InvocationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientContext(value: String): Self = StObject.set(x, "ClientContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientContextUndefined: Self = StObject.set(x, "ClientContext", js.undefined)
    
    @scala.inline
    def setFunctionName(value: NamespacedFunctionName): Self = StObject.set(x, "FunctionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvocationType(value: InvocationType): Self = StObject.set(x, "InvocationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvocationTypeUndefined: Self = StObject.set(x, "InvocationType", js.undefined)
    
    @scala.inline
    def setLogType(value: LogType): Self = StObject.set(x, "LogType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogTypeUndefined: Self = StObject.set(x, "LogType", js.undefined)
    
    @scala.inline
    def setPayload(value: _Blob): Self = StObject.set(x, "Payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayloadUint8Array(value: js.typedarray.Uint8Array): Self = StObject.set(x, "Payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayloadUndefined: Self = StObject.set(x, "Payload", js.undefined)
    
    @scala.inline
    def setQualifier(value: Qualifier): Self = StObject.set(x, "Qualifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQualifierUndefined: Self = StObject.set(x, "Qualifier", js.undefined)
  }
}
