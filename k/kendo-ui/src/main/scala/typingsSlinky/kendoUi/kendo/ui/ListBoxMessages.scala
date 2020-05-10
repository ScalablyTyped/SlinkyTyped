package typingsSlinky.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListBoxMessages extends js.Object {
  var tools: js.UndefOr[ListBoxMessagesTools] = js.native
}

object ListBoxMessages {
  @scala.inline
  def apply(): ListBoxMessages = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListBoxMessages]
  }
  @scala.inline
  implicit class ListBoxMessagesOps[Self <: ListBoxMessages] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTools(value: ListBoxMessagesTools): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tools")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTools: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tools")(js.undefined)
        ret
    }
  }
  
}

