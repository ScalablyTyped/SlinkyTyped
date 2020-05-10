package typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LiveChatModeratorSnippet extends js.Object {
  var liveChatId: js.UndefOr[String] = js.native
  var moderatorDetails: js.UndefOr[ChannelProfileDetails] = js.native
}

object LiveChatModeratorSnippet {
  @scala.inline
  def apply(): LiveChatModeratorSnippet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LiveChatModeratorSnippet]
  }
  @scala.inline
  implicit class LiveChatModeratorSnippetOps[Self <: LiveChatModeratorSnippet] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withModeratorDetails(value: ChannelProfileDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moderatorDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModeratorDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moderatorDetails")(js.undefined)
        ret
    }
  }
  
}

