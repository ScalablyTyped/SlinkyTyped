package typingsSlinky.gapiClientYoutube.gapi.client.youtube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LiveChatPollVotedDetails extends js.Object {
  /** The poll item the user chose. */
  var itemId: js.UndefOr[String] = js.native
  /** The poll the user voted on. */
  var pollId: js.UndefOr[String] = js.native
}

object LiveChatPollVotedDetails {
  @scala.inline
  def apply(): LiveChatPollVotedDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LiveChatPollVotedDetails]
  }
  @scala.inline
  implicit class LiveChatPollVotedDetailsOps[Self <: LiveChatPollVotedDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItemId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemId")(js.undefined)
        ret
    }
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

