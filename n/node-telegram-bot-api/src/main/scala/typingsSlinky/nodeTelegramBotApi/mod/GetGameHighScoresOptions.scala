package typingsSlinky.nodeTelegramBotApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetGameHighScoresOptions extends js.Object {
  var chat_id: js.UndefOr[Double] = js.native
  var inline_message_id: js.UndefOr[String] = js.native
  var message_id: js.UndefOr[Double] = js.native
}

object GetGameHighScoresOptions {
  @scala.inline
  def apply(): GetGameHighScoresOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetGameHighScoresOptions]
  }
  @scala.inline
  implicit class GetGameHighScoresOptionsOps[Self <: GetGameHighScoresOptions] (val x: Self) extends AnyVal {
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

