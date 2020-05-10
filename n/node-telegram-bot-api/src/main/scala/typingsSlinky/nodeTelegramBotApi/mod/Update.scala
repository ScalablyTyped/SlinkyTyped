package typingsSlinky.nodeTelegramBotApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Update extends js.Object {
  var callback_query: js.UndefOr[CallbackQuery] = js.native
  var channel_post: js.UndefOr[Message] = js.native
  var chosen_inline_result: js.UndefOr[ChosenInlineResult] = js.native
  var edited_channel_post: js.UndefOr[Message] = js.native
  var edited_message: js.UndefOr[Message] = js.native
  var inline_query: js.UndefOr[InlineQuery] = js.native
  var message: js.UndefOr[Message] = js.native
  var pre_checkout_query: js.UndefOr[PreCheckoutQuery] = js.native
  var shipping_query: js.UndefOr[ShippingQuery] = js.native
  var update_id: Double = js.native
}

object Update {
  @scala.inline
  def apply(update_id: Double): Update = {
    val __obj = js.Dynamic.literal(update_id = update_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Update]
  }
  @scala.inline
  implicit class UpdateOps[Self <: Update] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUpdate_id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCallback_query(value: CallbackQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callback_query")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCallback_query: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callback_query")(js.undefined)
        ret
    }
    @scala.inline
    def withChannel_post(value: Message): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channel_post")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChannel_post: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channel_post")(js.undefined)
        ret
    }
    @scala.inline
    def withChosen_inline_result(value: ChosenInlineResult): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chosen_inline_result")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChosen_inline_result: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chosen_inline_result")(js.undefined)
        ret
    }
    @scala.inline
    def withEdited_channel_post(value: Message): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edited_channel_post")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEdited_channel_post: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edited_channel_post")(js.undefined)
        ret
    }
    @scala.inline
    def withEdited_message(value: Message): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edited_message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEdited_message: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edited_message")(js.undefined)
        ret
    }
    @scala.inline
    def withInline_query(value: InlineQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inline_query")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInline_query: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inline_query")(js.undefined)
        ret
    }
    @scala.inline
    def withMessage(value: Message): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(js.undefined)
        ret
    }
    @scala.inline
    def withPre_checkout_query(value: PreCheckoutQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pre_checkout_query")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPre_checkout_query: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pre_checkout_query")(js.undefined)
        ret
    }
    @scala.inline
    def withShipping_query(value: ShippingQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shipping_query")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShipping_query: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shipping_query")(js.undefined)
        ret
    }
  }
  
}

