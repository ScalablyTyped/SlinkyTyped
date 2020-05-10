package typingsSlinky.nodeTelegramBotApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeyboardButton extends js.Object {
  var request_contact: js.UndefOr[Boolean] = js.native
  var request_location: js.UndefOr[Boolean] = js.native
  var text: String = js.native
}

object KeyboardButton {
  @scala.inline
  def apply(text: String): KeyboardButton = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyboardButton]
  }
  @scala.inline
  implicit class KeyboardButtonOps[Self <: KeyboardButton] (val x: Self) extends AnyVal {
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
    def withRequest_contact(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("request_contact")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequest_contact: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("request_contact")(js.undefined)
        ret
    }
    @scala.inline
    def withRequest_location(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("request_location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequest_location: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("request_location")(js.undefined)
        ret
    }
  }
  
}

