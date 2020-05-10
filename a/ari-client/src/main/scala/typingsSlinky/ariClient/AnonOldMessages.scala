package typingsSlinky.ariClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonOldMessages extends js.Object {
  var newMessages: Double = js.native
  var oldMessages: Double = js.native
}

object AnonOldMessages {
  @scala.inline
  def apply(newMessages: Double, oldMessages: Double): AnonOldMessages = {
    val __obj = js.Dynamic.literal(newMessages = newMessages.asInstanceOf[js.Any], oldMessages = oldMessages.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOldMessages]
  }
  @scala.inline
  implicit class AnonOldMessagesOps[Self <: AnonOldMessages] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNewMessages(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newMessages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOldMessages(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldMessages")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

