package typingsSlinky.blueprintjsTable.columnHeaderCellMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IColumnHeaderCellState extends js.Object {
  var isActive: js.UndefOr[Boolean] = js.native
}

object IColumnHeaderCellState {
  @scala.inline
  def apply(): IColumnHeaderCellState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IColumnHeaderCellState]
  }
  @scala.inline
  implicit class IColumnHeaderCellStateOps[Self <: IColumnHeaderCellState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsActive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isActive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsActive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isActive")(js.undefined)
        ret
    }
  }
  
}

