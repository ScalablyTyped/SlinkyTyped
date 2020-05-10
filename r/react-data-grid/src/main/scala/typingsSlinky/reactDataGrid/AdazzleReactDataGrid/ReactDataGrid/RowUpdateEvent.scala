package typingsSlinky.reactDataGrid.AdazzleReactDataGrid.ReactDataGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information about a row update. Generic event type returns untyped row, use parameterized type with the row type as the parameter
  * @default T = any
  */
@js.native
trait RowUpdateEvent[T] extends js.Object {
  /**
    * The name of the column that was updated.
    */
  var cellKey: String = js.native
  /**
    * The name of the key pressed to trigger the event ('Tab', 'Enter', etc.).
    */
  var key: String = js.native
  /**
    * The index of the updated row.
    */
  var rowIdx: Double = js.native
  /**
    * The columns that were updated and their values.
    */
  var updated: T = js.native
}

object RowUpdateEvent {
  @scala.inline
  def apply[T](cellKey: String, key: String, rowIdx: Double, updated: T): RowUpdateEvent[T] = {
    val __obj = js.Dynamic.literal(cellKey = cellKey.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], rowIdx = rowIdx.asInstanceOf[js.Any], updated = updated.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowUpdateEvent[T]]
  }
  @scala.inline
  implicit class RowUpdateEventOps[Self[t] <: RowUpdateEvent[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withCellKey(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKey(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRowIdx(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowIdx")(value.asInstanceOf[js.Any])
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

