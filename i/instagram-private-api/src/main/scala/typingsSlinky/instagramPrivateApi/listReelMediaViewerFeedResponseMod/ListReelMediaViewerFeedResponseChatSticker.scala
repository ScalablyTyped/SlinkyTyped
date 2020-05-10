package typingsSlinky.instagramPrivateApi.listReelMediaViewerFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListReelMediaViewerFeedResponseChatSticker extends js.Object {
  var end_background_color: String = js.native
  var has_started_chat: Boolean = js.native
  var start_background_color: String = js.native
  var status: String = js.native
  var story_chat_id: String = js.native
  var text: String = js.native
  var thread_id: String = js.native
}

object ListReelMediaViewerFeedResponseChatSticker {
  @scala.inline
  def apply(
    end_background_color: String,
    has_started_chat: Boolean,
    start_background_color: String,
    status: String,
    story_chat_id: String,
    text: String,
    thread_id: String
  ): ListReelMediaViewerFeedResponseChatSticker = {
    val __obj = js.Dynamic.literal(end_background_color = end_background_color.asInstanceOf[js.Any], has_started_chat = has_started_chat.asInstanceOf[js.Any], start_background_color = start_background_color.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], story_chat_id = story_chat_id.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], thread_id = thread_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListReelMediaViewerFeedResponseChatSticker]
  }
  @scala.inline
  implicit class ListReelMediaViewerFeedResponseChatStickerOps[Self <: ListReelMediaViewerFeedResponseChatSticker] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnd_background_color(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end_background_color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHas_started_chat(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("has_started_chat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStart_background_color(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start_background_color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStory_chat_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("story_chat_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThread_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thread_id")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

