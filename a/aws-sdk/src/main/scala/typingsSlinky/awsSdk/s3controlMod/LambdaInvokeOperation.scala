package typingsSlinky.awsSdk.s3controlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LambdaInvokeOperation extends js.Object {
  /**
    * The Amazon Resource Name (ARN) for the AWS Lambda function that the specified job will invoke for each object in the manifest.
    */
  var FunctionArn: js.UndefOr[NonEmptyMaxLength1024String] = js.native
}

object LambdaInvokeOperation {
  @scala.inline
  def apply(): LambdaInvokeOperation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LambdaInvokeOperation]
  }
  @scala.inline
  implicit class LambdaInvokeOperationOps[Self <: LambdaInvokeOperation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFunctionArn(value: NonEmptyMaxLength1024String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FunctionArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFunctionArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FunctionArn")(js.undefined)
        ret
    }
  }
  
}

