package typingsSlinky.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetUserDefinedFunctionResponse extends js.Object {
  /**
    * The requested function definition.
    */
  var UserDefinedFunction: js.UndefOr[typingsSlinky.awsSdk.glueMod.UserDefinedFunction] = js.native
}

object GetUserDefinedFunctionResponse {
  @scala.inline
  def apply(): GetUserDefinedFunctionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetUserDefinedFunctionResponse]
  }
  @scala.inline
  implicit class GetUserDefinedFunctionResponseOps[Self <: GetUserDefinedFunctionResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUserDefinedFunction(value: UserDefinedFunction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserDefinedFunction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserDefinedFunction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserDefinedFunction")(js.undefined)
        ret
    }
  }
  
}

