package typingsSlinky.devextreme.anon

import typingsSlinky.devextreme.mod.DevExpress.core.dxElement
import typingsSlinky.devextreme.mod.DevExpress.events.event
import typingsSlinky.devextreme.mod.DevExpress.ui.dxTreeList
import typingsSlinky.devextreme.mod.DevExpress.ui.dxTreeListRowObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PrevRowIndex extends StObject {
  
  var cancel: js.UndefOr[Boolean] = js.native
  
  var component: js.UndefOr[dxTreeList] = js.native
  
  var element: js.UndefOr[dxElement] = js.native
  
  var event: js.UndefOr[typingsSlinky.devextreme.mod.DevExpress.events.event] = js.native
  
  var model: js.UndefOr[js.Any] = js.native
  
  var newRowIndex: js.UndefOr[Double] = js.native
  
  var prevRowIndex: js.UndefOr[Double] = js.native
  
  var rowElement: js.UndefOr[dxElement] = js.native
  
  var rows: js.UndefOr[js.Array[dxTreeListRowObject]] = js.native
}
object PrevRowIndex {
  
  @scala.inline
  def apply(): PrevRowIndex = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrevRowIndex]
  }
  
  @scala.inline
  implicit class PrevRowIndexMutableBuilder[Self <: PrevRowIndex] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
    
    @scala.inline
    def setComponent(value: dxTreeList): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    
    @scala.inline
    def setElement(value: dxElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    
    @scala.inline
    def setEvent(value: event): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
    
    @scala.inline
    def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
    
    @scala.inline
    def setNewRowIndex(value: Double): Self = StObject.set(x, "newRowIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewRowIndexUndefined: Self = StObject.set(x, "newRowIndex", js.undefined)
    
    @scala.inline
    def setPrevRowIndex(value: Double): Self = StObject.set(x, "prevRowIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrevRowIndexUndefined: Self = StObject.set(x, "prevRowIndex", js.undefined)
    
    @scala.inline
    def setRowElement(value: dxElement): Self = StObject.set(x, "rowElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowElementUndefined: Self = StObject.set(x, "rowElement", js.undefined)
    
    @scala.inline
    def setRows(value: js.Array[dxTreeListRowObject]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
    
    @scala.inline
    def setRowsVarargs(value: dxTreeListRowObject*): Self = StObject.set(x, "rows", js.Array(value :_*))
  }
}
