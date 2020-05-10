package typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LiveChatMessageSnippet extends js.Object {
  var authorChannelId: js.UndefOr[String] = js.native
  var displayMessage: js.UndefOr[String] = js.native
  var fanFundingEventDetails: js.UndefOr[LiveChatFanFundingEventDetails] = js.native
  var hasDisplayContent: js.UndefOr[Boolean] = js.native
  var liveChatId: js.UndefOr[String] = js.native
  var messageDeletedDetails: js.UndefOr[LiveChatMessageDeletedDetails] = js.native
  var messageRetractedDetails: js.UndefOr[LiveChatMessageRetractedDetails] = js.native
  var pollClosedDetails: js.UndefOr[LiveChatPollClosedDetails] = js.native
  var pollEditedDetails: js.UndefOr[LiveChatPollEditedDetails] = js.native
  var pollOpenedDetails: js.UndefOr[LiveChatPollOpenedDetails] = js.native
  var pollVotedDetails: js.UndefOr[LiveChatPollVotedDetails] = js.native
  var publishedAt: js.UndefOr[String] = js.native
  var superChatDetails: js.UndefOr[LiveChatSuperChatDetails] = js.native
  var superStickerDetails: js.UndefOr[LiveChatSuperStickerDetails] = js.native
  var textMessageDetails: js.UndefOr[LiveChatTextMessageDetails] = js.native
  var `type`: js.UndefOr[String] = js.native
  var userBannedDetails: js.UndefOr[LiveChatUserBannedMessageDetails] = js.native
}

object LiveChatMessageSnippet {
  @scala.inline
  def apply(): LiveChatMessageSnippet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LiveChatMessageSnippet]
  }
  @scala.inline
  implicit class LiveChatMessageSnippetOps[Self <: LiveChatMessageSnippet] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthorChannelId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorChannelId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthorChannelId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorChannelId")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withFanFundingEventDetails(value: LiveChatFanFundingEventDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fanFundingEventDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFanFundingEventDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fanFundingEventDetails")(js.undefined)
        ret
    }
    @scala.inline
    def withHasDisplayContent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasDisplayContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHasDisplayContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasDisplayContent")(js.undefined)
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
    def withMessageDeletedDetails(value: LiveChatMessageDeletedDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageDeletedDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessageDeletedDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageDeletedDetails")(js.undefined)
        ret
    }
    @scala.inline
    def withMessageRetractedDetails(value: LiveChatMessageRetractedDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageRetractedDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessageRetractedDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageRetractedDetails")(js.undefined)
        ret
    }
    @scala.inline
    def withPollClosedDetails(value: LiveChatPollClosedDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pollClosedDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPollClosedDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pollClosedDetails")(js.undefined)
        ret
    }
    @scala.inline
    def withPollEditedDetails(value: LiveChatPollEditedDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pollEditedDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPollEditedDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pollEditedDetails")(js.undefined)
        ret
    }
    @scala.inline
    def withPollOpenedDetails(value: LiveChatPollOpenedDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pollOpenedDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPollOpenedDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pollOpenedDetails")(js.undefined)
        ret
    }
    @scala.inline
    def withPollVotedDetails(value: LiveChatPollVotedDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pollVotedDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPollVotedDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pollVotedDetails")(js.undefined)
        ret
    }
    @scala.inline
    def withPublishedAt(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publishedAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPublishedAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publishedAt")(js.undefined)
        ret
    }
    @scala.inline
    def withSuperChatDetails(value: LiveChatSuperChatDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("superChatDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuperChatDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("superChatDetails")(js.undefined)
        ret
    }
    @scala.inline
    def withSuperStickerDetails(value: LiveChatSuperStickerDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("superStickerDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuperStickerDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("superStickerDetails")(js.undefined)
        ret
    }
    @scala.inline
    def withTextMessageDetails(value: LiveChatTextMessageDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textMessageDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextMessageDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textMessageDetails")(js.undefined)
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
    @scala.inline
    def withUserBannedDetails(value: LiveChatUserBannedMessageDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userBannedDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserBannedDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userBannedDetails")(js.undefined)
        ret
    }
  }
  
}

