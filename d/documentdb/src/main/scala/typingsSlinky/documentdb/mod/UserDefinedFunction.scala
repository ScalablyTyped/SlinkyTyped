package typingsSlinky.documentdb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserDefinedFunction extends UserScriptable {
  /** Type of function */
  var userDefinedFunctionType: js.UndefOr[UserDefinedFunctionType] = js.native
}

object UserDefinedFunction {
  @scala.inline
  def apply(id: String): UserDefinedFunction = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserDefinedFunction]
  }
  @scala.inline
  implicit class UserDefinedFunctionOps[Self <: UserDefinedFunction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUserDefinedFunctionType(value: UserDefinedFunctionType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userDefinedFunctionType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserDefinedFunctionType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userDefinedFunctionType")(js.undefined)
        ret
    }
  }
  
}

