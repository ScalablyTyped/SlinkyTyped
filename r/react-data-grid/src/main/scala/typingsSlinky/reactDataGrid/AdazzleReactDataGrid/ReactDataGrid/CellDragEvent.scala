package typingsSlinky.reactDataGrid.AdazzleReactDataGrid.ReactDataGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information about a cell drag
  */
@js.native
trait CellDragEvent extends js.Object {
  /**
    * The name of the column that was dragged.
    */
  var cellKey: String = js.native
  /**
    * The row where the drag began.
    */
  var fromRow: Double = js.native
  /**
    * The row where the drag ended.
    */
  var toRow: Double = js.native
  /**
    * The value of the cell that was dragged.
    */
  var value: js.Any = js.native
}

object CellDragEvent {
  @scala.inline
  def apply(cellKey: String, fromRow: Double, toRow: Double, value: js.Any): CellDragEvent = {
    val __obj = js.Dynamic.literal(cellKey = cellKey.asInstanceOf[js.Any], fromRow = fromRow.asInstanceOf[js.Any], toRow = toRow.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellDragEvent]
  }
  @scala.inline
  implicit class CellDragEventOps[Self <: CellDragEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCellKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFromRow(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromRow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToRow(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toRow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

