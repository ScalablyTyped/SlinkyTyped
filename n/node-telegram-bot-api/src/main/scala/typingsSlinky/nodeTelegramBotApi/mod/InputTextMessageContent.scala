package typingsSlinky.nodeTelegramBotApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped object */ @js.native
trait InputTextMessageContent extends js.Object {
  var disable_web_page_preview: js.UndefOr[Boolean] = js.native
  var message_text: String = js.native
  var parse_mode: js.UndefOr[ParseMode] = js.native
}

object InputTextMessageContent {
  @scala.inline
  def apply(message_text: String): InputTextMessageContent = {
    val __obj = js.Dynamic.literal(message_text = message_text.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputTextMessageContent]
  }
  @scala.inline
  implicit class InputTextMessageContentOps[Self <: InputTextMessageContent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMessage_text(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message_text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisable_web_page_preview(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disable_web_page_preview")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisable_web_page_preview: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disable_web_page_preview")(js.undefined)
        ret
    }
    @scala.inline
    def withParse_mode(value: ParseMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parse_mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParse_mode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parse_mode")(js.undefined)
        ret
    }
  }
  
}

