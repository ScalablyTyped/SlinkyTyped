package typingsSlinky.reactDashDataDashGrid.AdazzleReactDataGrid.ReactDataGrid

import org.scalajs.dom.raw.Event
import slinky.core.SyntheticEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information about a drag handle double click. Generic event type returns untyped row, use parameterized type with the row type as the parameter
  * @default T = any
  */
trait DragHandleDoubleClickEvent[T] extends js.Object {
  /**
    * The double click event.
    */
  var e: SyntheticEvent[Event, _]
  /**
    * The column where the double click occurred.
    */
  var idx: Double
  /**
    * The values of the row.
    */
  var rowData: T
  /**
    * The row where the double click occurred.
    */
  var rowIdx: Double
}

object DragHandleDoubleClickEvent {
  @scala.inline
  def apply[T](e: SyntheticEvent[Event, _], idx: Double, rowData: T, rowIdx: Double): DragHandleDoubleClickEvent[T] = {
    val __obj = js.Dynamic.literal(e = e.asInstanceOf[js.Any], idx = idx.asInstanceOf[js.Any], rowData = rowData.asInstanceOf[js.Any], rowIdx = rowIdx.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DragHandleDoubleClickEvent[T]]
  }
}

