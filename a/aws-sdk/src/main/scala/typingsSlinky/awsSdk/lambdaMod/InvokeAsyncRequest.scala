package typingsSlinky.awsSdk.lambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InvokeAsyncRequest extends js.Object {
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
  implicit class InvokeAsyncRequestOps[Self <: InvokeAsyncRequest] (val x: Self) extends AnyVal {
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
    def withInvokeArgsUint8Array(value: js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InvokeArgs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInvokeArgs(value: BlobStream): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InvokeArgs")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

