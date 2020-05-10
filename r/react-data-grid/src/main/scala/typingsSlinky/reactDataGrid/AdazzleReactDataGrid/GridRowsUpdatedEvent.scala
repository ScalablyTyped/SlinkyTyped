package typingsSlinky.reactDataGrid.AdazzleReactDataGrid

import typingsSlinky.reactDataGrid.reactDataGridStrings.cellDrag
import typingsSlinky.reactDataGrid.reactDataGridStrings.cellUpdate
import typingsSlinky.reactDataGrid.reactDataGridStrings.columnFill
import typingsSlinky.reactDataGrid.reactDataGridStrings.copyPaste
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information about some update to the grid's contents. Generic event type returns untyped row, use parameterized type with the row type as the parameter
  * @default T = any
  */
@js.native
trait GridRowsUpdatedEvent[T] extends js.Object {
  /**
    * The action that occurred to trigger this event.
    * One of 'cellUpdate', 'cellDrag', 'columnFill', or 'copyPaste'.
    */
  var action: cellUpdate | cellDrag | columnFill | copyPaste = js.native
  /**
    * The key of the column where the event occurred.
    */
  var cellKey: String = js.native
  /**
    * The top row affected by the event.
    */
  var fromRow: Double = js.native
  /**
    * The bottom row affected by the event.
    */
  var toRow: Double = js.native
  /**
    * The columns that were updated and their values.
    */
  var updated: T = js.native
}

object GridRowsUpdatedEvent {
  @scala.inline
  def apply[T](
    action: cellUpdate | cellDrag | columnFill | copyPaste,
    cellKey: String,
    fromRow: Double,
    toRow: Double,
    updated: T
  ): GridRowsUpdatedEvent[T] = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], cellKey = cellKey.asInstanceOf[js.Any], fromRow = fromRow.asInstanceOf[js.Any], toRow = toRow.asInstanceOf[js.Any], updated = updated.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridRowsUpdatedEvent[T]]
  }
  @scala.inline
  implicit class GridRowsUpdatedEventOps[Self[t] <: GridRowsUpdatedEvent[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withAction(value: cellUpdate | cellDrag | columnFill | copyPaste): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCellKey(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFromRow(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromRow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToRow(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toRow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdated(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updated")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

