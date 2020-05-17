package typingsSlinky.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DragDrop extends js.Object {
  var drag: js.UndefOr[ItemsDragStart] = js.native
  var drop: js.UndefOr[ItemsDragOver] = js.native
  var reorder: `12` = js.native
}

object DragDrop {
  @scala.inline
  def apply(reorder: `12`): DragDrop = {
    val __obj = js.Dynamic.literal(reorder = reorder.asInstanceOf[js.Any])
    __obj.asInstanceOf[DragDrop]
  }
  @scala.inline
  implicit class DragDropOps[Self <: DragDrop] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReorder(value: `12`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reorder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDrag(value: ItemsDragStart): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDrag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drag")(js.undefined)
        ret
    }
    @scala.inline
    def withDrop(value: ItemsDragOver): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDrop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drop")(js.undefined)
        ret
    }
  }
  
}

