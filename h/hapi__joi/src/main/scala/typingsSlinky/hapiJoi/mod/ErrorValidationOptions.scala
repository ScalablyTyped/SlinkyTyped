package typingsSlinky.hapiJoi.mod

import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ErrorValidationOptions extends BaseValidationOptions {
  var messages: js.UndefOr[Record[String, LanguageMessageTemplate]] = js.native
}

object ErrorValidationOptions {
  @scala.inline
  def apply(): ErrorValidationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ErrorValidationOptions]
  }
  @scala.inline
  implicit class ErrorValidationOptionsOps[Self <: ErrorValidationOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMessages(value: Record[String, LanguageMessageTemplate]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messages")(js.undefined)
        ret
    }
  }
  
}

