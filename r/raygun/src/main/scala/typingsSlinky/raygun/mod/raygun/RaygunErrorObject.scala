package typingsSlinky.raygun.mod.raygun

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RaygunErrorObject extends js.Object {
  var className: String = js.native
  var innerError: js.UndefOr[RaygunErrorObject] = js.native
  var message: String = js.native
  var stackTrace: js.Array[StackFrame] = js.native
}

object RaygunErrorObject {
  @scala.inline
  def apply(className: String, message: String, stackTrace: js.Array[StackFrame]): RaygunErrorObject = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], stackTrace = stackTrace.asInstanceOf[js.Any])
    __obj.asInstanceOf[RaygunErrorObject]
  }
  @scala.inline
  implicit class RaygunErrorObjectOps[Self <: RaygunErrorObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStackTrace(value: js.Array[StackFrame]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stackTrace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInnerError(value: RaygunErrorObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInnerError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerError")(js.undefined)
        ret
    }
  }
  
}

