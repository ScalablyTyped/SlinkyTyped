package typingsSlinky.datatablesNetFixedcolumns.DataTables

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FixedColumnsMethods extends Api {
  /*
    * @Deprecated(use dt.cell(this).index())
    * Get the cell index of a cell in a fixed column
    */
  def cellIndex(): CellIndex = js.native
  /*
    * Redraw the fixed columns based on new table size
    */
  def relayout(): Api = js.native
  /*
    * @Deprecated(use dt.row(this).index())
    * Get the row index of a row in a fixed column
    */
  def rowIndex(): Double = js.native
  /*
    * Update the data shown in the FixedColumns
    */
  def update(): Api = js.native
}

object FixedColumnsMethods {
  @scala.inline
  def apply(
    cellIndex: () => CellIndex,
    fixedColumns: () => FixedColumnsMethods,
    relayout: () => Api,
    rowIndex: () => Double,
    update: () => Api
  ): FixedColumnsMethods = {
    val __obj = js.Dynamic.literal(cellIndex = js.Any.fromFunction0(cellIndex), fixedColumns = js.Any.fromFunction0(fixedColumns), relayout = js.Any.fromFunction0(relayout), rowIndex = js.Any.fromFunction0(rowIndex), update = js.Any.fromFunction0(update))
    __obj.asInstanceOf[FixedColumnsMethods]
  }
  @scala.inline
  implicit class FixedColumnsMethodsOps[Self <: FixedColumnsMethods] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCellIndex(value: () => CellIndex): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellIndex")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRelayout(value: () => Api): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relayout")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRowIndex(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowIndex")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withUpdate(value: () => Api): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

