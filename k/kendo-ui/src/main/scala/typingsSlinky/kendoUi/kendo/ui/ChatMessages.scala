package typingsSlinky.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChatMessages extends js.Object {
  var placeholder: js.UndefOr[String] = js.native
  var sendButton: js.UndefOr[String] = js.native
  var toggleButton: js.UndefOr[String] = js.native
}

object ChatMessages {
  @scala.inline
  def apply(): ChatMessages = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChatMessages]
  }
  @scala.inline
  implicit class ChatMessagesOps[Self <: ChatMessages] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPlaceholder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlaceholder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(js.undefined)
        ret
    }
    @scala.inline
    def withSendButton(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sendButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSendButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sendButton")(js.undefined)
        ret
    }
    @scala.inline
    def withToggleButton(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggleButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToggleButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggleButton")(js.undefined)
        ret
    }
  }
  
}

