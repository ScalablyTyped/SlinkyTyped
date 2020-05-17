package typingsSlinky.reactDataGrid.AdazzleReactDataGrid

import org.scalajs.dom.raw.Event
import slinky.core.SyntheticEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information about a drag handle double click. Generic event type returns untyped row, use parameterized type with the row type as the parameter
  * @default T = any
  */
@js.native
trait DragHandleDoubleClickEvent[T] extends js.Object {
  /**
    * The double click event.
    */
  var e: SyntheticEvent[Event, _] = js.native
  /**
    * The column where the double click occurred.
    */
  var idx: Double = js.native
  /**
    * The values of the row.
    */
  var rowData: T = js.native
  /**
    * The row where the double click occurred.
    */
  var rowIdx: Double = js.native
}

object DragHandleDoubleClickEvent {
  @scala.inline
  def apply[T](e: SyntheticEvent[Event, _], idx: Double, rowData: T, rowIdx: Double): DragHandleDoubleClickEvent[T] = {
    val __obj = js.Dynamic.literal(e = e.asInstanceOf[js.Any], idx = idx.asInstanceOf[js.Any], rowData = rowData.asInstanceOf[js.Any], rowIdx = rowIdx.asInstanceOf[js.Any])
    __obj.asInstanceOf[DragHandleDoubleClickEvent[T]]
  }
  @scala.inline
  implicit class DragHandleDoubleClickEventOps[Self[t] <: DragHandleDoubleClickEvent[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withE(value: SyntheticEvent[Event, _]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("e")(value.asInstanceOf[js.Any])
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

