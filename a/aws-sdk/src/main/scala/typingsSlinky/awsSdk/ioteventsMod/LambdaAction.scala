package typingsSlinky.awsSdk.ioteventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LambdaAction extends js.Object {
  /**
    * The ARN of the Lambda function that is executed.
    */
  var functionArn: AmazonResourceName = js.native
}

object LambdaAction {
  @scala.inline
  def apply(functionArn: AmazonResourceName): LambdaAction = {
    val __obj = js.Dynamic.literal(functionArn = functionArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[LambdaAction]
  }
  @scala.inline
  implicit class LambdaActionOps[Self <: LambdaAction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFunctionArn(value: AmazonResourceName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("functionArn")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

