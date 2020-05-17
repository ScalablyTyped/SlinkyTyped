package typingsSlinky.cordovaPluginGlobalization

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An object representing a error from the Globalization API. */
@js.native
trait GlobalizationError extends js.Object {
  /** One of the following codes representing the error type:
    * GlobalizationError.UNKNOWN_ERROR: 0
    * GlobalizationError.FORMATTING_ERROR: 1
    * GlobalizationError.PARSING_ERROR: 2
    * GlobalizationError.PATTERN_ERROR: 3
    */
  var code: Double = js.native
  /** A text message that includes the error's explanation and/or details */
  var message: String = js.native
}

object GlobalizationError {
  @scala.inline
  def apply(code: Double, message: String): GlobalizationError = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlobalizationError]
  }
  @scala.inline
  implicit class GlobalizationErrorOps[Self <: GlobalizationError] (val x: Self) extends AnyVal {
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
    def withMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

