package typingsSlinky.raygun4js

import typingsSlinky.raygun4js.mod.RaygunStackTrace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonClassName extends js.Object {
  var ClassName: String = js.native
  var Message: String = js.native
  var StackTrace: js.Array[RaygunStackTrace] = js.native
}

object AnonClassName {
  @scala.inline
  def apply(ClassName: String, Message: String, StackTrace: js.Array[RaygunStackTrace]): AnonClassName = {
    val __obj = js.Dynamic.literal(ClassName = ClassName.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any], StackTrace = StackTrace.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonClassName]
  }
  @scala.inline
  implicit class AnonClassNameOps[Self <: AnonClassName] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStackTrace(value: js.Array[RaygunStackTrace]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StackTrace")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

