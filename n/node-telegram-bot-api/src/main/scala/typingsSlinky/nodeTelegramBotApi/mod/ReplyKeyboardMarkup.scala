package typingsSlinky.nodeTelegramBotApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReplyKeyboardMarkup extends js.Object {
  var keyboard: js.Array[js.Array[KeyboardButton]] = js.native
  var one_time_keyboard: js.UndefOr[Boolean] = js.native
  var resize_keyboard: js.UndefOr[Boolean] = js.native
  var selective: js.UndefOr[Boolean] = js.native
}

object ReplyKeyboardMarkup {
  @scala.inline
  def apply(keyboard: js.Array[js.Array[KeyboardButton]]): ReplyKeyboardMarkup = {
    val __obj = js.Dynamic.literal(keyboard = keyboard.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplyKeyboardMarkup]
  }
  @scala.inline
  implicit class ReplyKeyboardMarkupOps[Self <: ReplyKeyboardMarkup] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKeyboard(value: js.Array[js.Array[KeyboardButton]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyboard")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOne_time_keyboard(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("one_time_keyboard")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOne_time_keyboard: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("one_time_keyboard")(js.undefined)
        ret
    }
    @scala.inline
    def withResize_keyboard(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resize_keyboard")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResize_keyboard: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resize_keyboard")(js.undefined)
        ret
    }
    @scala.inline
    def withSelective(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selective")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelective: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selective")(js.undefined)
        ret
    }
  }
  
}

