package typingsSlinky.nodeAppleReceiptVerify.mod

import typingsSlinky.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValidationError extends Error {
  var appleStatus: Double = js.native
  var isRetryable: Boolean = js.native
}

object ValidationError {
  @scala.inline
  def apply(appleStatus: Double, isRetryable: Boolean, message: String, name: String): ValidationError = {
    val __obj = js.Dynamic.literal(appleStatus = appleStatus.asInstanceOf[js.Any], isRetryable = isRetryable.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidationError]
  }
  @scala.inline
  implicit class ValidationErrorOps[Self <: ValidationError] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppleStatus(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appleStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsRetryable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRetryable")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

