package typingsSlinky.phonegapFacebookPlugin.PhonegapFacebookPlugin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The base result type for all showDialog() success callbacks.
  */
@js.native
trait BaseDialogResult extends js.Object {
  var error_code: String = js.native
  var error_message: String = js.native
}

object BaseDialogResult {
  @scala.inline
  def apply(error_code: String, error_message: String): BaseDialogResult = {
    val __obj = js.Dynamic.literal(error_code = error_code.asInstanceOf[js.Any], error_message = error_message.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseDialogResult]
  }
  @scala.inline
  implicit class BaseDialogResultOps[Self <: BaseDialogResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withError_code(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error_code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withError_message(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error_message")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

