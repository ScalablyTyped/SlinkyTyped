package typingsSlinky.reactDataGrid.AdazzleReactDataGrid.ReactDataGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *   Information about a cell expanded.
  */
@js.native
trait CellExpandEvent[T] extends js.Object {
  /**
    * Expand data.
    */
  var expandArgs: js.Any = js.native
  /**
    * The column index where the cell is being expanded.
    */
  var idx: Double = js.native
  /**
    * The values of the row.
    */
  var rowData: T = js.native
  /**
    * The row index where the cell is being expanded.
    */
  var rowIdx: Double = js.native
}

object CellExpandEvent {
  @scala.inline
  def apply[T](expandArgs: js.Any, idx: Double, rowData: T, rowIdx: Double): CellExpandEvent[T] = {
    val __obj = js.Dynamic.literal(expandArgs = expandArgs.asInstanceOf[js.Any], idx = idx.asInstanceOf[js.Any], rowData = rowData.asInstanceOf[js.Any], rowIdx = rowIdx.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellExpandEvent[T]]
  }
  @scala.inline
  implicit class CellExpandEventOps[Self[t] <: CellExpandEvent[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withExpandArgs(value: js.Any): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandArgs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIdx(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idx")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRowData(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRowIdx(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowIdx")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

