package typingsSlinky.devextreme.anon

import typingsSlinky.devextreme.mod.DevExpress.core.dxElement
import typingsSlinky.devextreme.mod.DevExpress.ui.dxTreeList
import typingsSlinky.devextreme.mod.DevExpress.ui.dxTreeListRowObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RowRowElement extends StObject {
  
  var component: js.UndefOr[dxTreeList] = js.native
  
  var element: js.UndefOr[dxElement] = js.native
  
  var model: js.UndefOr[js.Any] = js.native
  
  var row: js.UndefOr[dxTreeListRowObject] = js.native
  
  var rowElement: js.UndefOr[dxElement] = js.native
  
  var rowIndex: js.UndefOr[Double] = js.native
}
object RowRowElement {
  
  @scala.inline
  def apply(): RowRowElement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RowRowElement]
  }
  
  @scala.inline
  implicit class RowRowElementMutableBuilder[Self <: RowRowElement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComponent(value: dxTreeList): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    
    @scala.inline
    def setElement(value: dxElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    
    @scala.inline
    def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
    
    @scala.inline
    def setRow(value: dxTreeListRowObject): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowElement(value: dxElement): Self = StObject.set(x, "rowElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowElementUndefined: Self = StObject.set(x, "rowElement", js.undefined)
    
    @scala.inline
    def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowIndexUndefined: Self = StObject.set(x, "rowIndex", js.undefined)
    
    @scala.inline
    def setRowUndefined: Self = StObject.set(x, "row", js.undefined)
  }
}
