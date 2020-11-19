package typingsSlinky.reactTable.mod

import typingsSlinky.reactTable.anon.ColumnWidth
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UseResizeColumnsState[D /* <: js.Object */] extends js.Object {
  
  var columnResizing: ColumnWidth = js.native
}
object UseResizeColumnsState {
  
  @scala.inline
  def apply[D /* <: js.Object */](columnResizing: ColumnWidth): UseResizeColumnsState[D] = {
    val __obj = js.Dynamic.literal(columnResizing = columnResizing.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseResizeColumnsState[D]]
  }
  
  @scala.inline
  implicit class UseResizeColumnsStateOps[Self <: UseResizeColumnsState[_], D /* <: js.Object */] (val x: Self with UseResizeColumnsState[D]) extends AnyVal {
    
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
    def setColumnResizing(value: ColumnWidth): Self = this.set("columnResizing", value.asInstanceOf[js.Any])
  }
}
