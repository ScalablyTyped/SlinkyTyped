package typingsSlinky.ejWebAll.ej.datavisualization.HeatMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CellMouseLeaveEventArgs extends js.Object {
  /** Returns the specific HeatMap cell
    */
  var cell: js.UndefOr[js.Any] = js.native
  /** Value displayed on the cell
    */
  var cellValue: js.UndefOr[String] = js.native
  /** Returns the HeatMap cell data
    */
  var source: js.UndefOr[js.Any] = js.native
}

object CellMouseLeaveEventArgs {
  @scala.inline
  def apply(): CellMouseLeaveEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CellMouseLeaveEventArgs]
  }
  @scala.inline
  implicit class CellMouseLeaveEventArgsOps[Self <: CellMouseLeaveEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCell(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cell")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCell: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cell")(js.undefined)
        ret
    }
    @scala.inline
    def withCellValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCellValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellValue")(js.undefined)
        ret
    }
    @scala.inline
    def withSource(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(js.undefined)
        ret
    }
  }
  
}

