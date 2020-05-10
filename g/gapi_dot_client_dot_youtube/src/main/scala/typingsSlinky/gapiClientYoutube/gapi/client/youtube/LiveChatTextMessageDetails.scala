package typingsSlinky.gapiClientYoutube.gapi.client.youtube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LiveChatTextMessageDetails extends js.Object {
  /** The user's message. */
  var messageText: js.UndefOr[String] = js.native
}

object LiveChatTextMessageDetails {
  @scala.inline
  def apply(): LiveChatTextMessageDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LiveChatTextMessageDetails]
  }
  @scala.inline
  implicit class LiveChatTextMessageDetailsOps[Self <: LiveChatTextMessageDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMessageText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessageText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageText")(js.undefined)
        ret
    }
  }
  
}

