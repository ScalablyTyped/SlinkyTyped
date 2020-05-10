package typingsSlinky.gapiClientYoutube.gapi.client.youtube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LiveChatMessageDeletedDetails extends js.Object {
  var deletedMessageId: js.UndefOr[String] = js.native
}

object LiveChatMessageDeletedDetails {
  @scala.inline
  def apply(): LiveChatMessageDeletedDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LiveChatMessageDeletedDetails]
  }
  @scala.inline
  implicit class LiveChatMessageDeletedDetailsOps[Self <: LiveChatMessageDeletedDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeletedMessageId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deletedMessageId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeletedMessageId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deletedMessageId")(js.undefined)
        ret
    }
  }
  
}

