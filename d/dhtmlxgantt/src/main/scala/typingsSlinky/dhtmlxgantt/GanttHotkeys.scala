package typingsSlinky.dhtmlxgantt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GanttHotkeys extends js.Object {
  var edit_cancel: Double = js.native
  var edit_save: Double = js.native
}

object GanttHotkeys {
  @scala.inline
  def apply(edit_cancel: Double, edit_save: Double): GanttHotkeys = {
    val __obj = js.Dynamic.literal(edit_cancel = edit_cancel.asInstanceOf[js.Any], edit_save = edit_save.asInstanceOf[js.Any])
    __obj.asInstanceOf[GanttHotkeys]
  }
  @scala.inline
  implicit class GanttHotkeysOps[Self <: GanttHotkeys] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEdit_cancel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edit_cancel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEdit_save(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edit_save")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

