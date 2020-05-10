package typingsSlinky.cssTree.mod

import typingsSlinky.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SyntaxParseError extends Error {
  var input: String = js.native
  var offset: Double = js.native
  var rawMessage: String = js.native
}

object SyntaxParseError {
  @scala.inline
  def apply(input: String, message: String, name: String, offset: Double, rawMessage: String): SyntaxParseError = {
    val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], rawMessage = rawMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[SyntaxParseError]
  }
  @scala.inline
  implicit class SyntaxParseErrorOps[Self <: SyntaxParseError] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInput(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRawMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rawMessage")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

