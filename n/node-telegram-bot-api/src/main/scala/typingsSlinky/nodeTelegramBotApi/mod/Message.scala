package typingsSlinky.nodeTelegramBotApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Message extends js.Object {
  var animation: js.UndefOr[Animation] = js.native
  var audio: js.UndefOr[Audio] = js.native
  var author_signature: js.UndefOr[String] = js.native
  var caption: js.UndefOr[String] = js.native
  var caption_entities: js.UndefOr[js.Array[MessageEntity]] = js.native
  var channel_chat_created: js.UndefOr[Boolean] = js.native
  var chat: Chat = js.native
  var connected_website: js.UndefOr[String] = js.native
  var contact: js.UndefOr[Contact] = js.native
  var date: Double = js.native
  var delete_chat_photo: js.UndefOr[Boolean] = js.native
  var document: js.UndefOr[Document] = js.native
  var edit_date: js.UndefOr[Double] = js.native
  var entities: js.UndefOr[js.Array[MessageEntity]] = js.native
  var forward_date: js.UndefOr[Double] = js.native
  var forward_from: js.UndefOr[User] = js.native
  var forward_from_chat: js.UndefOr[Chat] = js.native
  var forward_from_message_id: js.UndefOr[Double] = js.native
  var forward_sender_name: js.UndefOr[String] = js.native
  var forward_signature: js.UndefOr[String] = js.native
  var from: js.UndefOr[User] = js.native
  var game: js.UndefOr[Game] = js.native
  var group_chat_created: js.UndefOr[Boolean] = js.native
  var invoice: js.UndefOr[Invoice] = js.native
  var left_chat_member: js.UndefOr[User] = js.native
  var location: js.UndefOr[Location] = js.native
  var media_group_id: js.UndefOr[String] = js.native
  var message_id: Double = js.native
  var migrate_from_chat_id: js.UndefOr[Double] = js.native
  var migrate_to_chat_id: js.UndefOr[Double] = js.native
  var new_chat_members: js.UndefOr[js.Array[User]] = js.native
  var new_chat_photo: js.UndefOr[js.Array[PhotoSize]] = js.native
  var new_chat_title: js.UndefOr[String] = js.native
  var passport_data: js.UndefOr[PassportData] = js.native
  var photo: js.UndefOr[js.Array[PhotoSize]] = js.native
  var pinned_message: js.UndefOr[Message] = js.native
  var poll: js.UndefOr[Poll] = js.native
  var reply_markup: js.UndefOr[InlineKeyboardMarkup] = js.native
  var reply_to_message: js.UndefOr[Message] = js.native
  var sticker: js.UndefOr[Sticker] = js.native
  var successful_payment: js.UndefOr[SuccessfulPayment] = js.native
  var supergroup_chat_created: js.UndefOr[Boolean] = js.native
  var text: js.UndefOr[String] = js.native
  var venue: js.UndefOr[Venue] = js.native
  var video: js.UndefOr[Video] = js.native
  var video_note: js.UndefOr[VideoNote] = js.native
  var voice: js.UndefOr[Voice] = js.native
}

object Message {
  @scala.inline
  def apply(chat: Chat, date: Double, message_id: Double): Message = {
    val __obj = js.Dynamic.literal(chat = chat.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], message_id = message_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Message]
  }
  @scala.inline
  implicit class MessageOps[Self <: Message] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChat(value: Chat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessage_id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAnimation(value: Animation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animation")(js.undefined)
        ret
    }
    @scala.inline
    def withAudio(value: Audio): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAudio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audio")(js.undefined)
        ret
    }
    @scala.inline
    def withAuthor_signature(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("author_signature")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthor_signature: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("author_signature")(js.undefined)
        ret
    }
    @scala.inline
    def withCaption(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCaption: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caption")(js.undefined)
        ret
    }
    @scala.inline
    def withCaption_entities(value: js.Array[MessageEntity]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caption_entities")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCaption_entities: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caption_entities")(js.undefined)
        ret
    }
    @scala.inline
    def withChannel_chat_created(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channel_chat_created")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChannel_chat_created: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channel_chat_created")(js.undefined)
        ret
    }
    @scala.inline
    def withConnected_website(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connected_website")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnected_website: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connected_website")(js.undefined)
        ret
    }
    @scala.inline
    def withContact(value: Contact): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contact")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContact: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contact")(js.undefined)
        ret
    }
    @scala.inline
    def withDelete_chat_photo(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete_chat_photo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelete_chat_photo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete_chat_photo")(js.undefined)
        ret
    }
    @scala.inline
    def withDocument(value: Document): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("document")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDocument: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("document")(js.undefined)
        ret
    }
    @scala.inline
    def withEdit_date(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edit_date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEdit_date: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edit_date")(js.undefined)
        ret
    }
    @scala.inline
    def withEntities(value: js.Array[MessageEntity]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entities")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEntities: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entities")(js.undefined)
        ret
    }
    @scala.inline
    def withForward_date(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forward_date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForward_date: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forward_date")(js.undefined)
        ret
    }
    @scala.inline
    def withForward_from(value: User): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forward_from")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForward_from: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forward_from")(js.undefined)
        ret
    }
    @scala.inline
    def withForward_from_chat(value: Chat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forward_from_chat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForward_from_chat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forward_from_chat")(js.undefined)
        ret
    }
    @scala.inline
    def withForward_from_message_id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forward_from_message_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForward_from_message_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forward_from_message_id")(js.undefined)
        ret
    }
    @scala.inline
    def withForward_sender_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forward_sender_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForward_sender_name: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forward_sender_name")(js.undefined)
        ret
    }
    @scala.inline
    def withForward_signature(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forward_signature")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForward_signature: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forward_signature")(js.undefined)
        ret
    }
    @scala.inline
    def withFrom(value: User): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("from")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("from")(js.undefined)
        ret
    }
    @scala.inline
    def withGame(value: Game): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("game")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGame: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("game")(js.undefined)
        ret
    }
    @scala.inline
    def withGroup_chat_created(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("group_chat_created")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroup_chat_created: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("group_chat_created")(js.undefined)
        ret
    }
    @scala.inline
    def withInvoice(value: Invoice): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invoice")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInvoice: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invoice")(js.undefined)
        ret
    }
    @scala.inline
    def withLeft_chat_member(value: User): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("left_chat_member")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeft_chat_member: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("left_chat_member")(js.undefined)
        ret
    }
    @scala.inline
    def withLocation(value: Location): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(js.undefined)
        ret
    }
    @scala.inline
    def withMedia_group_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("media_group_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMedia_group_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("media_group_id")(js.undefined)
        ret
    }
    @scala.inline
    def withMigrate_from_chat_id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("migrate_from_chat_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMigrate_from_chat_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("migrate_from_chat_id")(js.undefined)
        ret
    }
    @scala.inline
    def withMigrate_to_chat_id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("migrate_to_chat_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMigrate_to_chat_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("migrate_to_chat_id")(js.undefined)
        ret
    }
    @scala.inline
    def withNew_chat_members(value: js.Array[User]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("new_chat_members")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNew_chat_members: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("new_chat_members")(js.undefined)
        ret
    }
    @scala.inline
    def withNew_chat_photo(value: js.Array[PhotoSize]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("new_chat_photo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNew_chat_photo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("new_chat_photo")(js.undefined)
        ret
    }
    @scala.inline
    def withNew_chat_title(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("new_chat_title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNew_chat_title: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("new_chat_title")(js.undefined)
        ret
    }
    @scala.inline
    def withPassport_data(value: PassportData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passport_data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPassport_data: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passport_data")(js.undefined)
        ret
    }
    @scala.inline
    def withPhoto(value: js.Array[PhotoSize]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("photo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPhoto: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("photo")(js.undefined)
        ret
    }
    @scala.inline
    def withPinned_message(value: Message): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pinned_message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPinned_message: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pinned_message")(js.undefined)
        ret
    }
    @scala.inline
    def withPoll(value: Poll): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("poll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPoll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("poll")(js.undefined)
        ret
    }
    @scala.inline
    def withReply_markup(value: InlineKeyboardMarkup): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reply_markup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReply_markup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reply_markup")(js.undefined)
        ret
    }
    @scala.inline
    def withReply_to_message(value: Message): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reply_to_message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReply_to_message: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reply_to_message")(js.undefined)
        ret
    }
    @scala.inline
    def withSticker(value: Sticker): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sticker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSticker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sticker")(js.undefined)
        ret
    }
    @scala.inline
    def withSuccessful_payment(value: SuccessfulPayment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("successful_payment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuccessful_payment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("successful_payment")(js.undefined)
        ret
    }
    @scala.inline
    def withSupergroup_chat_created(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supergroup_chat_created")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSupergroup_chat_created: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supergroup_chat_created")(js.undefined)
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.undefined)
        ret
    }
    @scala.inline
    def withVenue(value: Venue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("venue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVenue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("venue")(js.undefined)
        ret
    }
    @scala.inline
    def withVideo(value: Video): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("video")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVideo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("video")(js.undefined)
        ret
    }
    @scala.inline
    def withVideo_note(value: VideoNote): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("video_note")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVideo_note: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("video_note")(js.undefined)
        ret
    }
    @scala.inline
    def withVoice(value: Voice): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("voice")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVoice: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("voice")(js.undefined)
        ret
    }
  }
  
}

