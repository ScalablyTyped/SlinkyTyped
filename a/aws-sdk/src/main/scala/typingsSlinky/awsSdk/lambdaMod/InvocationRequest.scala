package typingsSlinky.awsSdk.lambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InvocationRequest extends js.Object {
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
  implicit class InvocationRequestOps[Self <: InvocationRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFunctionName(value: NamespacedFunctionName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FunctionName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClientContext(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClientContext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClientContext")(js.undefined)
        ret
    }
    @scala.inline
    def withInvocationType(value: InvocationType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InvocationType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInvocationType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InvocationType")(js.undefined)
        ret
    }
    @scala.inline
    def withLogType(value: LogType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LogType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LogType")(js.undefined)
        ret
    }
    @scala.inline
    def withPayloadUint8Array(value: js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Payload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPayload(value: _Blob): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Payload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPayload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Payload")(js.undefined)
        ret
    }
    @scala.inline
    def withQualifier(value: Qualifier): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Qualifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQualifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Qualifier")(js.undefined)
        ret
    }
  }
  
}

