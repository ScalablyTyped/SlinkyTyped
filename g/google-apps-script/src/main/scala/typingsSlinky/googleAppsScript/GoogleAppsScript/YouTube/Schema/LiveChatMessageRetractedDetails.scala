package typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LiveChatMessageRetractedDetails extends js.Object {
  var retractedMessageId: js.UndefOr[String] = js.native
}

object LiveChatMessageRetractedDetails {
  @scala.inline
  def apply(): LiveChatMessageRetractedDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LiveChatMessageRetractedDetails]
  }
  @scala.inline
  implicit class LiveChatMessageRetractedDetailsOps[Self <: LiveChatMessageRetractedDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRetractedMessageId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retractedMessageId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRetractedMessageId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retractedMessageId")(js.undefined)
        ret
    }
  }
  
}

