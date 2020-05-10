package typingsSlinky.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DialogMessages extends js.Object {
  var close: js.UndefOr[String] = js.native
  var promptInput: js.UndefOr[String] = js.native
}

object DialogMessages {
  @scala.inline
  def apply(): DialogMessages = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DialogMessages]
  }
  @scala.inline
  implicit class DialogMessagesOps[Self <: DialogMessages] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClose(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("close")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("close")(js.undefined)
        ret
    }
    @scala.inline
    def withPromptInput(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("promptInput")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPromptInput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("promptInput")(js.undefined)
        ret
    }
  }
  
}

