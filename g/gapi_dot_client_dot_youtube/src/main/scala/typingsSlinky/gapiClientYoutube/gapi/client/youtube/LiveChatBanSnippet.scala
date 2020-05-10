package typingsSlinky.gapiClientYoutube.gapi.client.youtube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LiveChatBanSnippet extends js.Object {
  /** The duration of a ban, only filled if the ban has type TEMPORARY. */
  var banDurationSeconds: js.UndefOr[String] = js.native
  var bannedUserDetails: js.UndefOr[ChannelProfileDetails] = js.native
  /** The chat this ban is pertinent to. */
  var liveChatId: js.UndefOr[String] = js.native
  /** The type of ban. */
  var `type`: js.UndefOr[String] = js.native
}

object LiveChatBanSnippet {
  @scala.inline
  def apply(): LiveChatBanSnippet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LiveChatBanSnippet]
  }
  @scala.inline
  implicit class LiveChatBanSnippetOps[Self <: LiveChatBanSnippet] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBanDurationSeconds(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("banDurationSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBanDurationSeconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("banDurationSeconds")(js.undefined)
        ret
    }
    @scala.inline
    def withBannedUserDetails(value: ChannelProfileDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bannedUserDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBannedUserDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bannedUserDetails")(js.undefined)
        ret
    }
    @scala.inline
    def withLiveChatId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("liveChatId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLiveChatId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("liveChatId")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

