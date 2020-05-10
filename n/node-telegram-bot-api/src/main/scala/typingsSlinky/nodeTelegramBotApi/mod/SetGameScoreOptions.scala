package typingsSlinky.nodeTelegramBotApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetGameScoreOptions extends js.Object {
  var chat_id: js.UndefOr[Double] = js.native
  var disable_edit_message: js.UndefOr[Boolean] = js.native
  var force: js.UndefOr[Boolean] = js.native
  var inline_message_id: js.UndefOr[String] = js.native
  var message_id: js.UndefOr[Double] = js.native
}

object SetGameScoreOptions {
  @scala.inline
  def apply(): SetGameScoreOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SetGameScoreOptions]
  }
  @scala.inline
  implicit class SetGameScoreOptionsOps[Self <: SetGameScoreOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChat_id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chat_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChat_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chat_id")(js.undefined)
        ret
    }
    @scala.inline
    def withDisable_edit_message(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disable_edit_message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisable_edit_message: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disable_edit_message")(js.undefined)
        ret
    }
    @scala.inline
    def withForce(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("force")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForce: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("force")(js.undefined)
        ret
    }
    @scala.inline
    def withInline_message_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inline_message_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInline_message_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inline_message_id")(js.undefined)
        ret
    }
    @scala.inline
    def withMessage_id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessage_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message_id")(js.undefined)
        ret
    }
  }
  
}

