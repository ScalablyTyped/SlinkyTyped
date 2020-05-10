package typingsSlinky.agGrid.rowNodeBlockMod

import typingsSlinky.agGrid.eventsMod.AgEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoadCompleteEvent extends AgEvent {
  var lastRow: Double = js.native
  var page: RowNodeBlock = js.native
  var success: Boolean = js.native
}

object LoadCompleteEvent {
  @scala.inline
  def apply(lastRow: Double, page: RowNodeBlock, success: Boolean, `type`: String): LoadCompleteEvent = {
    val __obj = js.Dynamic.literal(lastRow = lastRow.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadCompleteEvent]
  }
  @scala.inline
  implicit class LoadCompleteEventOps[Self <: LoadCompleteEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLastRow(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastRow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPage(value: RowNodeBlock): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuccess(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

