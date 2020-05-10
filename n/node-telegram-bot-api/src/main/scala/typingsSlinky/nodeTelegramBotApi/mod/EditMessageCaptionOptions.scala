package typingsSlinky.nodeTelegramBotApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EditMessageCaptionOptions extends EditMessageReplyMarkupOptions {
  var reply_markup: js.UndefOr[InlineKeyboardMarkup] = js.native
}

object EditMessageCaptionOptions {
  @scala.inline
  def apply(): EditMessageCaptionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditMessageCaptionOptions]
  }
  @scala.inline
  implicit class EditMessageCaptionOptionsOps[Self <: EditMessageCaptionOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
  }
  
}

