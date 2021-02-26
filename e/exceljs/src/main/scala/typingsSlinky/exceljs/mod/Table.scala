package typingsSlinky.exceljs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Required<exceljs.exceljs.TableProperties> */
@js.native
trait Table extends StObject {
  
  /**
  	 * Add a new column, including column defn and values
  	 * inserts at colNumber or adds to the right
  	 */
  def addColumn(column: TableColumnProperties, values: js.Array[_], colIndex: Double): Unit = js.native
  
  /**
  	 * Add a row of data, either insert at rowNumber or append
  	 */
  def addRow(values: js.Array[_], rowNumber: Double): Unit = js.native
  
  var columns: js.Array[TableColumnProperties] = js.native
  
  /**
  	 * Commit changes
  	 */
  def commit(): Unit = js.native
  
  var displayName: String = js.native
  
  /**
  	 * Get column
  	 */
  def getColumn(colIndex: Double): TableColumn = js.native
  
  var headerRow: Boolean = js.native
  
  var name: String = js.native
  
  var ref: String = js.native
  
  /**
  	 * Remove a column with data
  	 */
  def removeColumns(colIndex: Double, count: Double): Unit = js.native
  
  /**
  	 * Remove a rows of data
  	 */
  def removeRows(rowIndex: Double, count: Double): Unit = js.native
  
  var rows: js.Array[js.Array[_]] = js.native
  
  var style: TableStyleProperties = js.native
  
  var totalsRow: Boolean = js.native
}
object Table {
  
  @scala.inline
  def apply(
    addColumn: (TableColumnProperties, js.Array[_], Double) => Unit,
    addRow: (js.Array[_], Double) => Unit,
    columns: js.Array[TableColumnProperties],
    commit: () => Unit,
    displayName: String,
    getColumn: Double => TableColumn,
    headerRow: Boolean,
    name: String,
    ref: String,
    removeColumns: (Double, Double) => Unit,
    removeRows: (Double, Double) => Unit,
    rows: js.Array[js.Array[_]],
    style: TableStyleProperties,
    totalsRow: Boolean
  ): Table = {
    val __obj = js.Dynamic.literal(addColumn = js.Any.fromFunction3(addColumn), addRow = js.Any.fromFunction2(addRow), columns = columns.asInstanceOf[js.Any], commit = js.Any.fromFunction0(commit), displayName = displayName.asInstanceOf[js.Any], getColumn = js.Any.fromFunction1(getColumn), headerRow = headerRow.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], removeColumns = js.Any.fromFunction2(removeColumns), removeRows = js.Any.fromFunction2(removeRows), rows = rows.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], totalsRow = totalsRow.asInstanceOf[js.Any])
    __obj.asInstanceOf[Table]
  }
  
  @scala.inline
  implicit class TableMutableBuilder[Self <: Table] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddColumn(value: (TableColumnProperties, js.Array[_], Double) => Unit): Self = StObject.set(x, "addColumn", js.Any.fromFunction3(value))
    
    @scala.inline
    def setAddRow(value: (js.Array[_], Double) => Unit): Self = StObject.set(x, "addRow", js.Any.fromFunction2(value))
    
    @scala.inline
    def setColumns(value: js.Array[TableColumnProperties]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnsVarargs(value: TableColumnProperties*): Self = StObject.set(x, "columns", js.Array(value :_*))
    
    @scala.inline
    def setCommit(value: () => Unit): Self = StObject.set(x, "commit", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetColumn(value: Double => TableColumn): Self = StObject.set(x, "getColumn", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHeaderRow(value: Boolean): Self = StObject.set(x, "headerRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRef(value: String): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveColumns(value: (Double, Double) => Unit): Self = StObject.set(x, "removeColumns", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRemoveRows(value: (Double, Double) => Unit): Self = StObject.set(x, "removeRows", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRows(value: js.Array[js.Array[_]]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowsVarargs(value: js.Array[js.Any]*): Self = StObject.set(x, "rows", js.Array(value :_*))
    
    @scala.inline
    def setStyle(value: TableStyleProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalsRow(value: Boolean): Self = StObject.set(x, "totalsRow", value.asInstanceOf[js.Any])
  }
}
