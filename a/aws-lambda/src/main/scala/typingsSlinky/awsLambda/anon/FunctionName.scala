package typingsSlinky.awsLambda.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FunctionName extends js.Object {
  var FunctionName: String = js.native
  var UserParameters: String = js.native
}

object FunctionName {
  @scala.inline
  def apply(FunctionName: String, UserParameters: String): FunctionName = {
    val __obj = js.Dynamic.literal(FunctionName = FunctionName.asInstanceOf[js.Any], UserParameters = UserParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[FunctionName]
  }
  @scala.inline
  implicit class FunctionNameOps[Self <: FunctionName] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFunctionName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FunctionName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserParameters(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserParameters")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

