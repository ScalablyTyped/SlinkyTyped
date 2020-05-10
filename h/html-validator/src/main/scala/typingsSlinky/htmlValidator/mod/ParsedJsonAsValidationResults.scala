package typingsSlinky.htmlValidator.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParsedJsonAsValidationResults extends js.Object {
  var messages: js.Array[ValidationMessageObject] = js.native
}

object ParsedJsonAsValidationResults {
  @scala.inline
  def apply(messages: js.Array[ValidationMessageObject]): ParsedJsonAsValidationResults = {
    val __obj = js.Dynamic.literal(messages = messages.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParsedJsonAsValidationResults]
  }
  @scala.inline
  implicit class ParsedJsonAsValidationResultsOps[Self <: ParsedJsonAsValidationResults] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMessages(value: js.Array[ValidationMessageObject]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messages")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

