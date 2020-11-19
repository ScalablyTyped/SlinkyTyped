package typingsSlinky.reactVirtualized.esTableMod

import slinky.web.SyntheticMouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HeaderMouseEventHandlerParams extends js.Object {
  
  var columnData: js.Any = js.native
  
  var dataKey: String = js.native
  
  var event: SyntheticMouseEvent[_] = js.native
}
object HeaderMouseEventHandlerParams {
  
  @scala.inline
  def apply(columnData: js.Any, dataKey: String, event: SyntheticMouseEvent[_]): HeaderMouseEventHandlerParams = {
    val __obj = js.Dynamic.literal(columnData = columnData.asInstanceOf[js.Any], dataKey = dataKey.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeaderMouseEventHandlerParams]
  }
  
  @scala.inline
  implicit class HeaderMouseEventHandlerParamsOps[Self <: HeaderMouseEventHandlerParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setColumnData(value: js.Any): Self = this.set("columnData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataKey(value: String): Self = this.set("dataKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvent(value: SyntheticMouseEvent[_]): Self = this.set("event", value.asInstanceOf[js.Any])
  }
}
