package typingsSlinky.nodeTelegramBotApi.mod

import typingsSlinky.nodeTelegramBotApi.nodeTelegramBotApiStrings.sticker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InlineQueryResultCachedSticker
  extends InlineQueryResultBase
     with InlineQueryResult {
  var input_message_content: js.UndefOr[InputMessageContent] = js.native
  var sticker_file_id: String = js.native
  var `type`: sticker = js.native
}

object InlineQueryResultCachedSticker {
  @scala.inline
  def apply(id: String, sticker_file_id: String, `type`: sticker): InlineQueryResultCachedSticker = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], sticker_file_id = sticker_file_id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[InlineQueryResultCachedSticker]
  }
  @scala.inline
  implicit class InlineQueryResultCachedStickerOps[Self <: InlineQueryResultCachedSticker] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSticker_file_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sticker_file_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: sticker): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInput_message_content(value: InputMessageContent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input_message_content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInput_message_content: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input_message_content")(js.undefined)
        ret
    }
  }
  
}

