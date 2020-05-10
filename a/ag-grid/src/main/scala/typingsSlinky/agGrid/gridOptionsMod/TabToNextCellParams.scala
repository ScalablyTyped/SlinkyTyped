package typingsSlinky.agGrid.gridOptionsMod

import typingsSlinky.agGrid.gridCellMod.GridCellDef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TabToNextCellParams extends js.Object {
  var backwards: Boolean = js.native
  var editing: Boolean = js.native
  var nextCellDef: GridCellDef = js.native
  var previousCellDef: GridCellDef = js.native
}

object TabToNextCellParams {
  @scala.inline
  def apply(backwards: Boolean, editing: Boolean, nextCellDef: GridCellDef, previousCellDef: GridCellDef): TabToNextCellParams = {
    val __obj = js.Dynamic.literal(backwards = backwards.asInstanceOf[js.Any], editing = editing.asInstanceOf[js.Any], nextCellDef = nextCellDef.asInstanceOf[js.Any], previousCellDef = previousCellDef.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabToNextCellParams]
  }
  @scala.inline
  implicit class TabToNextCellParamsOps[Self <: TabToNextCellParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackwards(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backwards")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEditing(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNextCellDef(value: GridCellDef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextCellDef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreviousCellDef(value: GridCellDef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousCellDef")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

