package typingsSlinky.awsSdkClientLambdaNode.typesInvokeInputMod

import typingsSlinky.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.DryRun
import typingsSlinky.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.Event
import typingsSlinky.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.None
import typingsSlinky.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.RequestResponse
import typingsSlinky.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.Tail
import typingsSlinky.awsSdkClientLambdaNode.inputTypesUnionMod._InputTypesUnion
import typingsSlinky.awsSdkTypes.abortMod.AbortSignal
import typingsSlinky.awsSdkTypes.httpMod.NodeHttpOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InvokeInput extends _InputTypesUnion {
  
  /**
    * An object that may be queried to determine if the underlying operation has been aborted.
    *
    * @see https://developer.mozilla.org/en-US/docs/Web/API/AbortSignal
    */
  @JSName("$abortSignal")
  var $abortSignal: js.UndefOr[AbortSignal] = js.native
  
  /**
    * Per-request HTTP configuration options. If set, any options specified will override the corresponding HTTP option set on the client for this command.
    */
  @JSName("$httpOptions")
  var $httpOptions: js.UndefOr[NodeHttpOptions] = js.native
  
  /**
    * The maximum number of times this operation should be retried. If set, this value will override the `maxRetries` configuration set on the client for this command.
    */
  @JSName("$maxRetries")
  var $maxRetries: js.UndefOr[Double] = js.native
  
  /**
    * <p>Using the <code>ClientContext</code> you can pass client-specific information to the Lambda function you are invoking. You can then process the client information in your Lambda function as you choose through the context variable. For an example of a <code>ClientContext</code> JSON, see <a href="http://docs.aws.amazon.com/mobileanalytics/latest/ug/PutEvents.html">PutEvents</a> in the <i>Amazon Mobile Analytics API Reference and User Guide</i>.</p> <p>The ClientContext JSON must be base64-encoded and has a maximum size of 3583 bytes.</p> <note> <p> <code>ClientContext</code> information is returned only if you use the synchronous (<code>RequestResponse</code>) invocation type.</p> </note>
    */
  var ClientContext: js.UndefOr[String] = js.native
  
  /**
    * <p>The name of the lambda function.</p> <p class="title"> <b>Name formats</b> </p> <ul> <li> <p> <b>Function name</b> - <code>MyFunction</code>.</p> </li> <li> <p> <b>Function ARN</b> - <code>arn:aws:lambda:us-west-2:123456789012:function:MyFunction</code>.</p> </li> <li> <p> <b>Partial ARN</b> - <code>123456789012:function:MyFunction</code>.</p> </li> </ul> <p>The length constraint applies only to the full ARN. If you specify only the function name, it is limited to 64 characters in length.</p>
    */
  var FunctionName: String = js.native
  
  /**
    * <p>Choose from the following options.</p> <ul> <li> <p> <code>RequestResponse</code> (default) - Invoke the function synchronously. Keep the connection open until the function returns a response or times out.</p> </li> <li> <p> <code>Event</code> - Invoke the function asynchronously. Send events that fail multiple times to the function's dead-letter queue (if configured).</p> </li> <li> <p> <code>DryRun</code> - Validate parameter values and verify that the user or role has permission to invoke the function.</p> </li> </ul>
    */
  var InvocationType: js.UndefOr[Event | RequestResponse | DryRun | String] = js.native
  
  /**
    * <p>You can set this optional parameter to <code>Tail</code> in the request only if you specify the <code>InvocationType</code> parameter with value <code>RequestResponse</code>. In this case, AWS Lambda returns the base64-encoded last 4 KB of log data produced by your Lambda function in the <code>x-amz-log-result</code> header. </p>
    */
  var LogType: js.UndefOr[None | Tail | String] = js.native
  
  /**
    * <p>JSON that you want to provide to your Lambda function as input.</p>
    */
  var Payload: js.UndefOr[js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView | String] = js.native
  
  /**
    * <p>Specify a version or alias to invoke a published version of the function.</p>
    */
  var Qualifier: js.UndefOr[String] = js.native
}
object InvokeInput {
  
  @scala.inline
  def apply(FunctionName: String): InvokeInput = {
    val __obj = js.Dynamic.literal(FunctionName = FunctionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvokeInput]
  }
  
  @scala.inline
  implicit class InvokeInputOps[Self <: InvokeInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFunctionName(value: String): Self = this.set("FunctionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$abortSignal(value: AbortSignal): Self = this.set("$abortSignal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$abortSignal: Self = this.set("$abortSignal", js.undefined)
    
    @scala.inline
    def set$httpOptions(value: NodeHttpOptions): Self = this.set("$httpOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$httpOptions: Self = this.set("$httpOptions", js.undefined)
    
    @scala.inline
    def set$maxRetries(value: Double): Self = this.set("$maxRetries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$maxRetries: Self = this.set("$maxRetries", js.undefined)
    
    @scala.inline
    def setClientContext(value: String): Self = this.set("ClientContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientContext: Self = this.set("ClientContext", js.undefined)
    
    @scala.inline
    def setInvocationType(value: Event | RequestResponse | DryRun | String): Self = this.set("InvocationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInvocationType: Self = this.set("InvocationType", js.undefined)
    
    @scala.inline
    def setLogType(value: None | Tail | String): Self = this.set("LogType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogType: Self = this.set("LogType", js.undefined)
    
    @scala.inline
    def setPayloadArrayBufferView(value: js.typedarray.ArrayBufferView): Self = this.set("Payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayloadArrayBuffer(value: js.typedarray.ArrayBuffer): Self = this.set("Payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayload(value: js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView | String): Self = this.set("Payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePayload: Self = this.set("Payload", js.undefined)
    
    @scala.inline
    def setQualifier(value: String): Self = this.set("Qualifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQualifier: Self = this.set("Qualifier", js.undefined)
  }
}
