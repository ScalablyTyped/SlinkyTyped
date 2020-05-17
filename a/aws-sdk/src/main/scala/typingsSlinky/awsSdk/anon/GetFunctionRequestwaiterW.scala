package typingsSlinky.awsSdk.anon

import typingsSlinky.awsSdk.lambdaMod.NamespacedFunctionName
import typingsSlinky.awsSdk.lambdaMod.Qualifier
import typingsSlinky.awsSdk.serviceMod.WaiterConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined aws-sdk.aws-sdk/clients/lambda.GetFunctionRequest & {  $waiter ? :aws-sdk.aws-sdk/lib/service.WaiterConfiguration} */
@js.native
trait GetFunctionRequestwaiterW extends js.Object {
  @JSName("$waiter")
  var $waiter: js.UndefOr[WaiterConfiguration] = js.native
  /**
    * The name of the Lambda function, version, or alias.  Name formats     Function name - my-function (name-only), my-function:v1 (with alias).    Function ARN - arn:aws:lambda:us-west-2:123456789012:function:my-function.    Partial ARN - 123456789012:function:my-function.   You can append a version number or alias to any of the formats. The length constraint applies only to the full ARN. If you specify only the function name, it is limited to 64 characters in length.
    */
  var FunctionName: NamespacedFunctionName = js.native
  /**
    * Specify a version or alias to get details about a published version of the function.
    */
  var Qualifier: js.UndefOr[typingsSlinky.awsSdk.lambdaMod.Qualifier] = js.native
}

object GetFunctionRequestwaiterW {
  @scala.inline
  def apply(FunctionName: NamespacedFunctionName): GetFunctionRequestwaiterW = {
    val __obj = js.Dynamic.literal(FunctionName = FunctionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFunctionRequestwaiterW]
  }
  @scala.inline
  implicit class GetFunctionRequestwaiterWOps[Self <: GetFunctionRequestwaiterW] (val x: Self) extends AnyVal {
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
    def with$waiter(value: WaiterConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$waiter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$waiter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$waiter")(js.undefined)
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

