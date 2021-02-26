package typingsSlinky.officeJs.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Provides information about the selection that raised the "SelectionChanged" event.
  
  **Note**: If multiple, discontiguous cells are selected, `Binding.onSelectionChanged` only reports row and column information for one selection. Use `Worksheet.onSelectionChanged` for multiple selected ranges.
  *
  * [Api set: ExcelApi 1.2]
  */
@js.native
trait BindingSelectionChangedEventArgs extends StObject {
  
  /**
    *
    * Gets a temporary `Binding` object that contains the ID of the `Binding` object that raised the event. Use that ID with `BindingCollection.getItem(id)` to get the binding.
    *
    * [Api set: ExcelApi 1.2]
    */
  var binding: Binding = js.native
  
  /**
    *
    * Gets the number of columns selected.
    *
    * [Api set: ExcelApi 1.2]
    */
  var columnCount: Double = js.native
  
  /**
    *
    * Gets the number of rows selected.
    *
    * [Api set: ExcelApi 1.2]
    */
  var rowCount: Double = js.native
  
  /**
    *
    * Gets the index of the first column of the selection (zero-based).
    *
    * [Api set: ExcelApi 1.2]
    */
  var startColumn: Double = js.native
  
  /**
    *
    * Gets the index of the first row of the selection (zero-based).
    *
    * [Api set: ExcelApi 1.2]
    */
  var startRow: Double = js.native
}
object BindingSelectionChangedEventArgs {
  
  @scala.inline
  def apply(binding: Binding, columnCount: Double, rowCount: Double, startColumn: Double, startRow: Double): BindingSelectionChangedEventArgs = {
    val __obj = js.Dynamic.literal(binding = binding.asInstanceOf[js.Any], columnCount = columnCount.asInstanceOf[js.Any], rowCount = rowCount.asInstanceOf[js.Any], startColumn = startColumn.asInstanceOf[js.Any], startRow = startRow.asInstanceOf[js.Any])
    __obj.asInstanceOf[BindingSelectionChangedEventArgs]
  }
  
  @scala.inline
  implicit class BindingSelectionChangedEventArgsMutableBuilder[Self <: BindingSelectionChangedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBinding(value: Binding): Self = StObject.set(x, "binding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnCount(value: Double): Self = StObject.set(x, "columnCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowCount(value: Double): Self = StObject.set(x, "rowCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartColumn(value: Double): Self = StObject.set(x, "startColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartRow(value: Double): Self = StObject.set(x, "startRow", value.asInstanceOf[js.Any])
  }
}
