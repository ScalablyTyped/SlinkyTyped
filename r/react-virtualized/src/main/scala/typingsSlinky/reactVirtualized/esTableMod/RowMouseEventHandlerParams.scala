package typingsSlinky.reactVirtualized.esTableMod

import slinky.web.SyntheticMouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RowMouseEventHandlerParams extends js.Object {
  var event: SyntheticMouseEvent[_]
  var index: Double
  var rowData: js.Any
}

object RowMouseEventHandlerParams {
  @scala.inline
  def apply(event: SyntheticMouseEvent[_], index: Double, rowData: js.Any): RowMouseEventHandlerParams = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], rowData = rowData.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowMouseEventHandlerParams]
  }
}

