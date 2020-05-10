package typingsSlinky.nodeTelegramBotApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SendBasicOptions extends js.Object {
  var disable_notification: js.UndefOr[Boolean] = js.native
  var reply_markup: js.UndefOr[InlineKeyboardMarkup | ReplyKeyboardMarkup | ReplyKeyboardRemove | ForceReply] = js.native
  var reply_to_message_id: js.UndefOr[Double] = js.native
}

object SendBasicOptions {
  @scala.inline
  def apply(): SendBasicOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SendBasicOptions]
  }
  @scala.inline
  implicit class SendBasicOptionsOps[Self <: SendBasicOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisable_notification(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disable_notification")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisable_notification: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disable_notification")(js.undefined)
        ret
    }
    @scala.inline
    def withReply_markup(value: InlineKeyboardMarkup | ReplyKeyboardMarkup | ReplyKeyboardRemove | ForceReply): Self = {
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
    def withReply_to_message_id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reply_to_message_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReply_to_message_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reply_to_message_id")(js.undefined)
        ret
    }
  }
  
}

