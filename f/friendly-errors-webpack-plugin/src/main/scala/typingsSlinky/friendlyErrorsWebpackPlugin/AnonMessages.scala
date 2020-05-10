package typingsSlinky.friendlyErrorsWebpackPlugin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonMessages extends js.Object {
  var messages: js.Array[String] = js.native
  var notes: js.Array[String] = js.native
}

object AnonMessages {
  @scala.inline
  def apply(messages: js.Array[String], notes: js.Array[String]): AnonMessages = {
    val __obj = js.Dynamic.literal(messages = messages.asInstanceOf[js.Any], notes = notes.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMessages]
  }
  @scala.inline
  implicit class AnonMessagesOps[Self <: AnonMessages] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMessages(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNotes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notes")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

