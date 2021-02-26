package typingsSlinky.devextreme.anon

import typingsSlinky.devextreme.mod.DevExpress.core.dxElement
import typingsSlinky.devextreme.mod.DevExpress.ui.dxPivotGrid
import typingsSlinky.devextreme.mod.DevExpress.ui.dxPivotGridPivotGridCell
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Cell extends StObject {
  
  var area: js.UndefOr[String] = js.native
  
  var cell: js.UndefOr[dxPivotGridPivotGridCell] = js.native
  
  var cellElement: js.UndefOr[dxElement] = js.native
  
  var columnIndex: js.UndefOr[Double] = js.native
  
  var component: js.UndefOr[dxPivotGrid] = js.native
  
  var element: js.UndefOr[dxElement] = js.native
  
  var model: js.UndefOr[js.Any] = js.native
  
  var rowIndex: js.UndefOr[Double] = js.native
}
object Cell {
  
  @scala.inline
  def apply(): Cell = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Cell]
  }
  
  @scala.inline
  implicit class CellMutableBuilder[Self <: Cell] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArea(value: String): Self = StObject.set(x, "area", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAreaUndefined: Self = StObject.set(x, "area", js.undefined)
    
    @scala.inline
    def setCell(value: dxPivotGridPivotGridCell): Self = StObject.set(x, "cell", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellElement(value: dxElement): Self = StObject.set(x, "cellElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellElementUndefined: Self = StObject.set(x, "cellElement", js.undefined)
    
    @scala.inline
    def setCellUndefined: Self = StObject.set(x, "cell", js.undefined)
    
    @scala.inline
    def setColumnIndex(value: Double): Self = StObject.set(x, "columnIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnIndexUndefined: Self = StObject.set(x, "columnIndex", js.undefined)
    
    @scala.inline
    def setComponent(value: dxPivotGrid): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
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
    def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowIndexUndefined: Self = StObject.set(x, "rowIndex", js.undefined)
  }
}
