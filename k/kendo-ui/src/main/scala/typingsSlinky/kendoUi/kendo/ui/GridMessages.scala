package typingsSlinky.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GridMessages extends js.Object {
  var commands: js.UndefOr[GridMessagesCommands] = js.native
  var expandCollapseColumnHeader: js.UndefOr[String] = js.native
  var noRecords: js.UndefOr[String] = js.native
}

object GridMessages {
  @scala.inline
  def apply(): GridMessages = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridMessages]
  }
  @scala.inline
  implicit class GridMessagesOps[Self <: GridMessages] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCommands(value: GridMessagesCommands): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commands")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCommands: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commands")(js.undefined)
        ret
    }
    @scala.inline
    def withExpandCollapseColumnHeader(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandCollapseColumnHeader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpandCollapseColumnHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandCollapseColumnHeader")(js.undefined)
        ret
    }
    @scala.inline
    def withNoRecords(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noRecords")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoRecords: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noRecords")(js.undefined)
        ret
    }
  }
  
}

