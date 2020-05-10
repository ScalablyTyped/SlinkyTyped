package typingsSlinky.googleapis.youtubeV3Mod.youtubeV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaLiveChatMessageSnippet extends js.Object {
  /**
    * The ID of the user that authored this message, this field is not always
    * filled. textMessageEvent - the user that wrote the message
    * fanFundingEvent - the user that funded the broadcast newSponsorEvent -
    * the user that just became a sponsor messageDeletedEvent - the moderator
    * that took the action messageRetractedEvent - the author that retracted
    * their message userBannedEvent - the moderator that took the action
    * superChatEvent - the user that made the purchase
    */
  var authorChannelId: js.UndefOr[String] = js.native
  /**
    * Contains a string that can be displayed to the user. If this field is not
    * present the message is silent, at the moment only messages of type
    * TOMBSTONE and CHAT_ENDED_EVENT are silent.
    */
  var displayMessage: js.UndefOr[String] = js.native
  /**
    * Details about the funding event, this is only set if the type is
    * &#39;fanFundingEvent&#39;.
    */
  var fanFundingEventDetails: js.UndefOr[SchemaLiveChatFanFundingEventDetails] = js.native
  /**
    * Whether the message has display content that should be displayed to
    * users.
    */
  var hasDisplayContent: js.UndefOr[Boolean] = js.native
  var liveChatId: js.UndefOr[String] = js.native
  var messageDeletedDetails: js.UndefOr[SchemaLiveChatMessageDeletedDetails] = js.native
  var messageRetractedDetails: js.UndefOr[SchemaLiveChatMessageRetractedDetails] = js.native
  var pollClosedDetails: js.UndefOr[SchemaLiveChatPollClosedDetails] = js.native
  var pollEditedDetails: js.UndefOr[SchemaLiveChatPollEditedDetails] = js.native
  var pollOpenedDetails: js.UndefOr[SchemaLiveChatPollOpenedDetails] = js.native
  var pollVotedDetails: js.UndefOr[SchemaLiveChatPollVotedDetails] = js.native
  /**
    * The date and time when the message was orignally published. The value is
    * specified in ISO 8601 (YYYY-MM-DDThh:mm:ss.sZ) format.
    */
  var publishedAt: js.UndefOr[String] = js.native
  /**
    * Details about the Super Chat event, this is only set if the type is
    * &#39;superChatEvent&#39;.
    */
  var superChatDetails: js.UndefOr[SchemaLiveChatSuperChatDetails] = js.native
  /**
    * Details about the Super Sticker event, this is only set if the type is
    * &#39;superStickerEvent&#39;.
    */
  var superStickerDetails: js.UndefOr[SchemaLiveChatSuperStickerDetails] = js.native
  /**
    * Details about the text message, this is only set if the type is
    * &#39;textMessageEvent&#39;.
    */
  var textMessageDetails: js.UndefOr[SchemaLiveChatTextMessageDetails] = js.native
  /**
    * The type of message, this will always be present, it determines the
    * contents of the message as well as which fields will be present.
    */
  var `type`: js.UndefOr[String] = js.native
  var userBannedDetails: js.UndefOr[SchemaLiveChatUserBannedMessageDetails] = js.native
}

object SchemaLiveChatMessageSnippet {
  @scala.inline
  def apply(): SchemaLiveChatMessageSnippet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLiveChatMessageSnippet]
  }
  @scala.inline
  implicit class SchemaLiveChatMessageSnippetOps[Self <: SchemaLiveChatMessageSnippet] (val x: Self) extends AnyVal {
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
    def withFanFundingEventDetails(value: SchemaLiveChatFanFundingEventDetails): Self = {
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
    def withMessageDeletedDetails(value: SchemaLiveChatMessageDeletedDetails): Self = {
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
    def withMessageRetractedDetails(value: SchemaLiveChatMessageRetractedDetails): Self = {
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
    def withPollClosedDetails(value: SchemaLiveChatPollClosedDetails): Self = {
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
    def withPollEditedDetails(value: SchemaLiveChatPollEditedDetails): Self = {
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
    def withPollOpenedDetails(value: SchemaLiveChatPollOpenedDetails): Self = {
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
    def withPollVotedDetails(value: SchemaLiveChatPollVotedDetails): Self = {
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
    def withSuperChatDetails(value: SchemaLiveChatSuperChatDetails): Self = {
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
    def withSuperStickerDetails(value: SchemaLiveChatSuperStickerDetails): Self = {
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
    def withTextMessageDetails(value: SchemaLiveChatTextMessageDetails): Self = {
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
    def withUserBannedDetails(value: SchemaLiveChatUserBannedMessageDetails): Self = {
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

