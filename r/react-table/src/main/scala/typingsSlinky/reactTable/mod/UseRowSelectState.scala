package typingsSlinky.reactTable.mod

import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UseRowSelectState[D /* <: js.Object */] extends js.Object {
  
  var selectedRowIds: Record[IdType[D], Boolean] = js.native
}
object UseRowSelectState {
  
  @scala.inline
  def apply[D /* <: js.Object */](selectedRowIds: Record[IdType[D], Boolean]): UseRowSelectState[D] = {
    val __obj = js.Dynamic.literal(selectedRowIds = selectedRowIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseRowSelectState[D]]
  }
  
  @scala.inline
  implicit class UseRowSelectStateOps[Self <: UseRowSelectState[_], D /* <: js.Object */] (val x: Self with UseRowSelectState[D]) extends AnyVal {
    
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
    def setSelectedRowIds(value: Record[IdType[D], Boolean]): Self = this.set("selectedRowIds", value.asInstanceOf[js.Any])
  }
}
