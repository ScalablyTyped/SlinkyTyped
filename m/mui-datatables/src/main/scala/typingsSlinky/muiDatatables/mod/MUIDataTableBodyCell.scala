package typingsSlinky.muiDatatables.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MUIDataTableBodyCell extends StObject {
  
  var children: js.UndefOr[js.Any] = js.native
  
  var className: js.UndefOr[String] = js.native
  
  var classes: js.UndefOr[js.Object] = js.native
  
  var colIndex: js.UndefOr[Double] = js.native
  
  var columnHeader: js.UndefOr[js.Any] = js.native
  
  var dataIndex: js.UndefOr[Double] = js.native
  
  var options: js.UndefOr[MUIDataTableOptions] = js.native
  
  var otherProps: js.UndefOr[js.Any] = js.native
  
  var rowIndex: js.UndefOr[Double] = js.native
}
object MUIDataTableBodyCell {
  
  @scala.inline
  def apply(): MUIDataTableBodyCell = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MUIDataTableBodyCell]
  }
  
  @scala.inline
  implicit class MUIDataTableBodyCellMutableBuilder[Self <: MUIDataTableBodyCell] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: js.Any): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setClasses(value: js.Object): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
    
    @scala.inline
    def setColIndex(value: Double): Self = StObject.set(x, "colIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColIndexUndefined: Self = StObject.set(x, "colIndex", js.undefined)
    
    @scala.inline
    def setColumnHeader(value: js.Any): Self = StObject.set(x, "columnHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnHeaderUndefined: Self = StObject.set(x, "columnHeader", js.undefined)
    
    @scala.inline
    def setDataIndex(value: Double): Self = StObject.set(x, "dataIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataIndexUndefined: Self = StObject.set(x, "dataIndex", js.undefined)
    
    @scala.inline
    def setOptions(value: MUIDataTableOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    @scala.inline
    def setOtherProps(value: js.Any): Self = StObject.set(x, "otherProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOtherPropsUndefined: Self = StObject.set(x, "otherProps", js.undefined)
    
    @scala.inline
    def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowIndexUndefined: Self = StObject.set(x, "rowIndex", js.undefined)
  }
}
