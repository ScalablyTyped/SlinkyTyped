package typingsSlinky.rsocketCore.rsocketframeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ErrorSource extends js.Object {
  /** The error code returned by the server. */
  var code: Double = js.native
  /** Human-readable explanation of the code (this value is not standardized and may change). */
  var explanation: String = js.native
  /** The error string returned by the server. */
  var message: String = js.native
}

object ErrorSource {
  @scala.inline
  def apply(code: Double, explanation: String, message: String): ErrorSource = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], explanation = explanation.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorSource]
  }
  @scala.inline
  implicit class ErrorSourceOps[Self <: ErrorSource] (val x: Self) extends AnyVal {
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
    def withExplanation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("explanation")(value.asInstanceOf[js.Any])
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

