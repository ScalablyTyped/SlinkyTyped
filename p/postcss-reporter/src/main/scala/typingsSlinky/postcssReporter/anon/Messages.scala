package typingsSlinky.postcssReporter.anon

import typingsSlinky.postcss.mod.ResultMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Messages extends js.Object {
  var messages: js.Array[ResultMessage] = js.native
  var source: String = js.native
}

object Messages {
  @scala.inline
  def apply(messages: js.Array[ResultMessage], source: String): Messages = {
    val __obj = js.Dynamic.literal(messages = messages.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[Messages]
  }
  @scala.inline
  implicit class MessagesOps[Self <: Messages] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMessages(value: js.Array[ResultMessage]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSource(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

