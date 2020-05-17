package typingsSlinky.jestSnapshot.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Message extends js.Object {
  var actual: js.UndefOr[scala.Nothing] = js.native
  var expected: js.UndefOr[scala.Nothing] = js.native
  var name: js.UndefOr[scala.Nothing] = js.native
  var pass: Boolean = js.native
  var report: js.UndefOr[scala.Nothing] = js.native
  def message(): String = js.native
}

object Message {
  @scala.inline
  def apply(message: () => String, pass: Boolean): Message = {
    val __obj = js.Dynamic.literal(message = js.Any.fromFunction0(message), pass = pass.asInstanceOf[js.Any])
    __obj.asInstanceOf[Message]
  }
  @scala.inline
  implicit class MessageOps[Self <: Message] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMessage(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPass(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pass")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

