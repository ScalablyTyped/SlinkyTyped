package typingsSlinky.psl

import typingsSlinky.psl.pslStrings.DOMAIN_TOO_LONG
import typingsSlinky.psl.pslStrings.DOMAIN_TOO_SHORT
import typingsSlinky.psl.pslStrings.LABEL_ENDS_WITH_DASH
import typingsSlinky.psl.pslStrings.LABEL_INVALID_CHARS
import typingsSlinky.psl.pslStrings.LABEL_STARTS_WITH_DASH
import typingsSlinky.psl.pslStrings.LABEL_TOO_LONG
import typingsSlinky.psl.pslStrings.LABEL_TOO_SHORT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCode extends js.Object {
  var code: DOMAIN_TOO_SHORT | DOMAIN_TOO_LONG | LABEL_STARTS_WITH_DASH | LABEL_ENDS_WITH_DASH | LABEL_TOO_LONG | LABEL_TOO_SHORT | LABEL_INVALID_CHARS = js.native
  var message: String = js.native
}

object AnonCode {
  @scala.inline
  def apply(
    code: DOMAIN_TOO_SHORT | DOMAIN_TOO_LONG | LABEL_STARTS_WITH_DASH | LABEL_ENDS_WITH_DASH | LABEL_TOO_LONG | LABEL_TOO_SHORT | LABEL_INVALID_CHARS,
    message: String
  ): AnonCode = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCode]
  }
  @scala.inline
  implicit class AnonCodeOps[Self <: AnonCode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCode(
      value: DOMAIN_TOO_SHORT | DOMAIN_TOO_LONG | LABEL_STARTS_WITH_DASH | LABEL_ENDS_WITH_DASH | LABEL_TOO_LONG | LABEL_TOO_SHORT | LABEL_INVALID_CHARS
    ): Self = {
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

