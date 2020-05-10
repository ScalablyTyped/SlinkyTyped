package typingsSlinky.ejWebAll.ej.PivotGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CellEditEventArgs extends js.Object {
  /** contains the array of cells selected for editing.
    */
  var editCellsInfo: js.UndefOr[js.Array[_]] = js.native
}

object CellEditEventArgs {
  @scala.inline
  def apply(): CellEditEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CellEditEventArgs]
  }
  @scala.inline
  implicit class CellEditEventArgsOps[Self <: CellEditEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEditCellsInfo(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editCellsInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEditCellsInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editCellsInfo")(js.undefined)
        ret
    }
  }
  
}

