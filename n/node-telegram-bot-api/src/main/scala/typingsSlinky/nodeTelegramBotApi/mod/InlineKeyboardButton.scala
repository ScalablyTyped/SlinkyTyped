package typingsSlinky.nodeTelegramBotApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InlineKeyboardButton extends js.Object {
  var callback_data: js.UndefOr[String] = js.native
  var callback_game: js.UndefOr[CallbackGame] = js.native
  var login_url: js.UndefOr[LoginUrl] = js.native
  var pay: js.UndefOr[Boolean] = js.native
  var switch_inline_query: js.UndefOr[String] = js.native
  var switch_inline_query_current_chat: js.UndefOr[String] = js.native
  var text: String = js.native
  var url: js.UndefOr[String] = js.native
}

object InlineKeyboardButton {
  @scala.inline
  def apply(text: String): InlineKeyboardButton = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[InlineKeyboardButton]
  }
  @scala.inline
  implicit class InlineKeyboardButtonOps[Self <: InlineKeyboardButton] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCallback_data(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callback_data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCallback_data: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callback_data")(js.undefined)
        ret
    }
    @scala.inline
    def withCallback_game(value: CallbackGame): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callback_game")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCallback_game: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callback_game")(js.undefined)
        ret
    }
    @scala.inline
    def withLogin_url(value: LoginUrl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("login_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogin_url: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("login_url")(js.undefined)
        ret
    }
    @scala.inline
    def withPay(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pay")(js.undefined)
        ret
    }
    @scala.inline
    def withSwitch_inline_query(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("switch_inline_query")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSwitch_inline_query: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("switch_inline_query")(js.undefined)
        ret
    }
    @scala.inline
    def withSwitch_inline_query_current_chat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("switch_inline_query_current_chat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSwitch_inline_query_current_chat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("switch_inline_query_current_chat")(js.undefined)
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.undefined)
        ret
    }
  }
  
}

