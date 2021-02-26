package typingsSlinky.devextreme.anon

import typingsSlinky.devextreme.mod.DevExpress.core.dxElement
import typingsSlinky.devextreme.mod.DevExpress.data.PivotGridDataSourceField
import typingsSlinky.devextreme.mod.DevExpress.events.event
import typingsSlinky.devextreme.mod.DevExpress.ui.dxPivotGrid
import typingsSlinky.devextreme.mod.DevExpress.ui.dxPivotGridPivotGridCell
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Area extends StObject {
  
  var area: js.UndefOr[String] = js.native
  
  var cancel: js.UndefOr[Boolean] = js.native
  
  var cell: js.UndefOr[dxPivotGridPivotGridCell] = js.native
  
  var cellElement: js.UndefOr[dxElement] = js.native
  
  var columnFields: js.UndefOr[js.Array[PivotGridDataSourceField]] = js.native
  
  var columnIndex: js.UndefOr[Double] = js.native
  
  var component: js.UndefOr[dxPivotGrid] = js.native
  
  var dataFields: js.UndefOr[js.Array[PivotGridDataSourceField]] = js.native
  
  var element: js.UndefOr[dxElement] = js.native
  
  var event: js.UndefOr[typingsSlinky.devextreme.mod.DevExpress.events.event] = js.native
  
  var model: js.UndefOr[js.Any] = js.native
  
  var rowFields: js.UndefOr[js.Array[PivotGridDataSourceField]] = js.native
  
  var rowIndex: js.UndefOr[Double] = js.native
}
object Area {
  
  @scala.inline
  def apply(): Area = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Area]
  }
  
  @scala.inline
  implicit class AreaMutableBuilder[Self <: Area] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArea(value: String): Self = StObject.set(x, "area", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAreaUndefined: Self = StObject.set(x, "area", js.undefined)
    
    @scala.inline
    def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
    
    @scala.inline
    def setCell(value: dxPivotGridPivotGridCell): Self = StObject.set(x, "cell", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellElement(value: dxElement): Self = StObject.set(x, "cellElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellElementUndefined: Self = StObject.set(x, "cellElement", js.undefined)
    
    @scala.inline
    def setCellUndefined: Self = StObject.set(x, "cell", js.undefined)
    
    @scala.inline
    def setColumnFields(value: js.Array[PivotGridDataSourceField]): Self = StObject.set(x, "columnFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnFieldsUndefined: Self = StObject.set(x, "columnFields", js.undefined)
    
    @scala.inline
    def setColumnFieldsVarargs(value: PivotGridDataSourceField*): Self = StObject.set(x, "columnFields", js.Array(value :_*))
    
    @scala.inline
    def setColumnIndex(value: Double): Self = StObject.set(x, "columnIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnIndexUndefined: Self = StObject.set(x, "columnIndex", js.undefined)
    
    @scala.inline
    def setComponent(value: dxPivotGrid): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    
    @scala.inline
    def setDataFields(value: js.Array[PivotGridDataSourceField]): Self = StObject.set(x, "dataFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataFieldsUndefined: Self = StObject.set(x, "dataFields", js.undefined)
    
    @scala.inline
    def setDataFieldsVarargs(value: PivotGridDataSourceField*): Self = StObject.set(x, "dataFields", js.Array(value :_*))
    
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
    def setRowFields(value: js.Array[PivotGridDataSourceField]): Self = StObject.set(x, "rowFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowFieldsUndefined: Self = StObject.set(x, "rowFields", js.undefined)
    
    @scala.inline
    def setRowFieldsVarargs(value: PivotGridDataSourceField*): Self = StObject.set(x, "rowFields", js.Array(value :_*))
    
    @scala.inline
    def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowIndexUndefined: Self = StObject.set(x, "rowIndex", js.undefined)
  }
}
