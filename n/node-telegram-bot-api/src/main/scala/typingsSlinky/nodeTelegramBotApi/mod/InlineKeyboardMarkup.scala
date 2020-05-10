package typingsSlinky.nodeTelegramBotApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InlineKeyboardMarkup extends js.Object {
  var inline_keyboard: js.Array[js.Array[InlineKeyboardButton]] = js.native
}

object InlineKeyboardMarkup {
  @scala.inline
  def apply(inline_keyboard: js.Array[js.Array[InlineKeyboardButton]]): InlineKeyboardMarkup = {
    val __obj = js.Dynamic.literal(inline_keyboard = inline_keyboard.asInstanceOf[js.Any])
    __obj.asInstanceOf[InlineKeyboardMarkup]
  }
  @scala.inline
  implicit class InlineKeyboardMarkupOps[Self <: InlineKeyboardMarkup] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInline_keyboard(value: js.Array[js.Array[InlineKeyboardButton]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inline_keyboard")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

