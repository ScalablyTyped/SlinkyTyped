package typingsSlinky.nodeTelegramBotApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SendPhotoOptions extends SendBasicOptions {
  var caption: js.UndefOr[String] = js.native
  var parse_mode: js.UndefOr[ParseMode] = js.native
}

object SendPhotoOptions {
  @scala.inline
  def apply(): SendPhotoOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SendPhotoOptions]
  }
  @scala.inline
  implicit class SendPhotoOptionsOps[Self <: SendPhotoOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCaption(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCaption: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caption")(js.undefined)
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

