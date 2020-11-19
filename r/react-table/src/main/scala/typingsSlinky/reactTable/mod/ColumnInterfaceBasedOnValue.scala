package typingsSlinky.reactTable.mod

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColumnInterfaceBasedOnValue[D /* <: js.Object */, V] extends js.Object {
  
  var Cell: js.UndefOr[Renderer[CellProps[D, V]]] = js.native
}
object ColumnInterfaceBasedOnValue {
  
  @scala.inline
  def apply[D /* <: js.Object */, V](): ColumnInterfaceBasedOnValue[D, V] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnInterfaceBasedOnValue[D, V]]
  }
  
  @scala.inline
  implicit class ColumnInterfaceBasedOnValueOps[Self <: ColumnInterfaceBasedOnValue[_, _], D /* <: js.Object */, V] (val x: Self with (ColumnInterfaceBasedOnValue[D, V])) extends AnyVal {
    
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
    def setCellReactElement(value: ReactElement): Self = this.set("Cell", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellFunctionComponent(value: ReactComponentClass[CellProps[D, V]]): Self = this.set("Cell", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellComponentClass(value: ReactComponentClass[CellProps[D, V]]): Self = this.set("Cell", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCell(value: Renderer[CellProps[D, V]]): Self = this.set("Cell", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCell: Self = this.set("Cell", js.undefined)
  }
}
