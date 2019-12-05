package typingsSlinky.reactDashVirtualized.distEsTableMod

import slinky.web.SyntheticMouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeaderMouseEventHandlerParams extends js.Object {
  var columnData: js.Any
  var dataKey: String
  var event: SyntheticMouseEvent[_]
}

object HeaderMouseEventHandlerParams {
  @scala.inline
  def apply(columnData: js.Any, dataKey: String, event: SyntheticMouseEvent[_]): HeaderMouseEventHandlerParams = {
    val __obj = js.Dynamic.literal(columnData = columnData.asInstanceOf[js.Any], dataKey = dataKey.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[HeaderMouseEventHandlerParams]
  }
}

