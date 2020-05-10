package typingsSlinky.nodeTelegramBotApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReplyKeyboardRemove extends js.Object {
  var remove_keyboard: Boolean = js.native
  var selective: js.UndefOr[Boolean] = js.native
}

object ReplyKeyboardRemove {
  @scala.inline
  def apply(remove_keyboard: Boolean): ReplyKeyboardRemove = {
    val __obj = js.Dynamic.literal(remove_keyboard = remove_keyboard.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplyKeyboardRemove]
  }
  @scala.inline
  implicit class ReplyKeyboardRemoveOps[Self <: ReplyKeyboardRemove] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRemove_keyboard(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove_keyboard")(value.asInstanceOf[js.Any])
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

