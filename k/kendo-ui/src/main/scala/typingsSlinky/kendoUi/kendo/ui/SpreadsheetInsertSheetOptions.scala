package typingsSlinky.kendoUi.kendo.ui

import typingsSlinky.kendoUi.kendo.data.DataSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpreadsheetInsertSheetOptions extends StObject {
  
  var columnWidth: js.UndefOr[Double] = js.native
  
  var columns: js.UndefOr[Double] = js.native
  
  var data: js.UndefOr[js.Any] = js.native
  
  var dataSource: js.UndefOr[DataSource] = js.native
  
  var headerHeight: js.UndefOr[Double] = js.native
  
  var headerWidth: js.UndefOr[Double] = js.native
  
  var rowHeight: js.UndefOr[Double] = js.native
  
  var rows: js.UndefOr[Double] = js.native
}
object SpreadsheetInsertSheetOptions {
  
  @scala.inline
  def apply(): SpreadsheetInsertSheetOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpreadsheetInsertSheetOptions]
  }
  
  @scala.inline
  implicit class SpreadsheetInsertSheetOptionsMutableBuilder[Self <: SpreadsheetInsertSheetOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumnWidth(value: Double): Self = StObject.set(x, "columnWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnWidthUndefined: Self = StObject.set(x, "columnWidth", js.undefined)
    
    @scala.inline
    def setColumns(value: Double): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    @scala.inline
    def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSource(value: DataSource): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setHeaderHeight(value: Double): Self = StObject.set(x, "headerHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderHeightUndefined: Self = StObject.set(x, "headerHeight", js.undefined)
    
    @scala.inline
    def setHeaderWidth(value: Double): Self = StObject.set(x, "headerWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderWidthUndefined: Self = StObject.set(x, "headerWidth", js.undefined)
    
    @scala.inline
    def setRowHeight(value: Double): Self = StObject.set(x, "rowHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowHeightUndefined: Self = StObject.set(x, "rowHeight", js.undefined)
    
    @scala.inline
    def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
  }
}
