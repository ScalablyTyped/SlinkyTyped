package typingsSlinky.backlogJs.mod.Error

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BacklogErrorMessage extends js.Object {
  var code: Double = js.native
  var errorInfo: String = js.native
  var message: String = js.native
  var moreInfo: String = js.native
}

object BacklogErrorMessage {
  @scala.inline
  def apply(code: Double, errorInfo: String, message: String, moreInfo: String): BacklogErrorMessage = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], errorInfo = errorInfo.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], moreInfo = moreInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[BacklogErrorMessage]
  }
  @scala.inline
  implicit class BacklogErrorMessageOps[Self <: BacklogErrorMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withErrorInfo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMoreInfo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moreInfo")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

