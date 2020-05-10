package typingsSlinky.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListBoxMessagesTools extends js.Object {
  var moveDown: js.UndefOr[String] = js.native
  var moveUp: js.UndefOr[String] = js.native
  var remove: js.UndefOr[String] = js.native
  var transferAllFrom: js.UndefOr[String] = js.native
  var transferAllTo: js.UndefOr[String] = js.native
  var transferFrom: js.UndefOr[String] = js.native
  var transferTo: js.UndefOr[String] = js.native
}

object ListBoxMessagesTools {
  @scala.inline
  def apply(): ListBoxMessagesTools = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListBoxMessagesTools]
  }
  @scala.inline
  implicit class ListBoxMessagesToolsOps[Self <: ListBoxMessagesTools] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMoveDown(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moveDown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMoveDown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moveDown")(js.undefined)
        ret
    }
    @scala.inline
    def withMoveUp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moveUp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMoveUp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moveUp")(js.undefined)
        ret
    }
    @scala.inline
    def withRemove(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.undefined)
        ret
    }
    @scala.inline
    def withTransferAllFrom(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transferAllFrom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransferAllFrom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transferAllFrom")(js.undefined)
        ret
    }
    @scala.inline
    def withTransferAllTo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transferAllTo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransferAllTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transferAllTo")(js.undefined)
        ret
    }
    @scala.inline
    def withTransferFrom(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transferFrom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransferFrom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transferFrom")(js.undefined)
        ret
    }
    @scala.inline
    def withTransferTo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transferTo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransferTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transferTo")(js.undefined)
        ret
    }
  }
  
}

