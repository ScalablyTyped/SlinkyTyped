package typingsSlinky.reactVirtualized.esTableMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TableCellDataGetterParams extends StObject {
  
  var columnData: js.UndefOr[js.Any] = js.native
  
  var dataKey: String = js.native
  
  var rowData: js.Any = js.native
}
object TableCellDataGetterParams {
  
  @scala.inline
  def apply(dataKey: String, rowData: js.Any): TableCellDataGetterParams = {
    val __obj = js.Dynamic.literal(dataKey = dataKey.asInstanceOf[js.Any], rowData = rowData.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableCellDataGetterParams]
  }
  
  @scala.inline
  implicit class TableCellDataGetterParamsMutableBuilder[Self <: TableCellDataGetterParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumnData(value: js.Any): Self = StObject.set(x, "columnData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnDataUndefined: Self = StObject.set(x, "columnData", js.undefined)
    
    @scala.inline
    def setDataKey(value: String): Self = StObject.set(x, "dataKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowData(value: js.Any): Self = StObject.set(x, "rowData", value.asInstanceOf[js.Any])
  }
}
