package typingsSlinky.oracleOraclejet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDragDrop extends js.Object {
  var drag: js.UndefOr[AnonItemsAnonDragStart] = js.native
  var drop: js.UndefOr[AnonItemsAnonDragOver] = js.native
  var reorder: Anon12 = js.native
}

object AnonDragDrop {
  @scala.inline
  def apply(reorder: Anon12): AnonDragDrop = {
    val __obj = js.Dynamic.literal(reorder = reorder.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDragDrop]
  }
  @scala.inline
  implicit class AnonDragDropOps[Self <: AnonDragDrop] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReorder(value: Anon12): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reorder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDrag(value: AnonItemsAnonDragStart): Self = {
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
    def withDrop(value: AnonItemsAnonDragOver): Self = {
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

