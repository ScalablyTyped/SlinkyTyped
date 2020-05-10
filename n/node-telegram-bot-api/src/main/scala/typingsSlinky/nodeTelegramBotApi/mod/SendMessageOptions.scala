package typingsSlinky.nodeTelegramBotApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SendMessageOptions extends SendBasicOptions {
  var disable_web_page_preview: js.UndefOr[Boolean] = js.native
  var parse_mode: js.UndefOr[ParseMode] = js.native
}

object SendMessageOptions {
  @scala.inline
  def apply(): SendMessageOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SendMessageOptions]
  }
  @scala.inline
  implicit class SendMessageOptionsOps[Self <: SendMessageOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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

