package typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LiveChatPollClosedDetails extends js.Object {
  var pollId: js.UndefOr[String] = js.native
}

object LiveChatPollClosedDetails {
  @scala.inline
  def apply(): LiveChatPollClosedDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LiveChatPollClosedDetails]
  }
  @scala.inline
  implicit class LiveChatPollClosedDetailsOps[Self <: LiveChatPollClosedDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPollId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pollId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPollId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pollId")(js.undefined)
        ret
    }
  }
  
}

