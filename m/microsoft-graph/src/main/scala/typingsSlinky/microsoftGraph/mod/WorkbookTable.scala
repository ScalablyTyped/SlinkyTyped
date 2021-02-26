package typingsSlinky.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkbookTable extends Entity {
  
  // Represents a collection of all the columns in the table. Read-only.
  var columns: js.UndefOr[NullableOption[js.Array[WorkbookTableColumn]]] = js.native
  
  // Indicates whether the first column contains special formatting.
  var highlightFirstColumn: js.UndefOr[Boolean] = js.native
  
  // Indicates whether the last column contains special formatting.
  var highlightLastColumn: js.UndefOr[Boolean] = js.native
  
  /**
    * Legacy Id used in older Excle clients. The value of the identifier remains the same even when the table is renamed.
    * This property should be interpreted as an opaque string value and should not be parsed to any other type. Read-only.
    */
  var legacyId: js.UndefOr[NullableOption[String]] = js.native
  
  // Name of the table.
  var name: js.UndefOr[NullableOption[String]] = js.native
  
  // Represents a collection of all the rows in the table. Read-only.
  var rows: js.UndefOr[NullableOption[js.Array[WorkbookTableRow]]] = js.native
  
  /**
    * Indicates whether the columns show banded formatting in which odd columns are highlighted differently from even ones to
    * make reading the table easier.
    */
  var showBandedColumns: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicates whether the rows show banded formatting in which odd rows are highlighted differently from even ones to make
    * reading the table easier.
    */
  var showBandedRows: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicates whether the filter buttons are visible at the top of each column header. Setting this is only allowed if the
    * table contains a header row.
    */
  var showFilterButton: js.UndefOr[Boolean] = js.native
  
  // Indicates whether the header row is visible or not. This value can be set to show or remove the header row.
  var showHeaders: js.UndefOr[Boolean] = js.native
  
  // Indicates whether the total row is visible or not. This value can be set to show or remove the total row.
  var showTotals: js.UndefOr[Boolean] = js.native
  
  // Represents the sorting for the table. Read-only.
  var sort: js.UndefOr[NullableOption[WorkbookTableSort]] = js.native
  
  /**
    * Constant value that represents the Table style. The possible values are: TableStyleLight1 thru TableStyleLight21,
    * TableStyleMedium1 thru TableStyleMedium28, TableStyleStyleDark1 thru TableStyleStyleDark11. A custom user-defined style
    * present in the workbook can also be specified.
    */
  var style: js.UndefOr[NullableOption[String]] = js.native
  
  // The worksheet containing the current table. Read-only.
  var worksheet: js.UndefOr[NullableOption[WorkbookWorksheet]] = js.native
}
object WorkbookTable {
  
  @scala.inline
  def apply(): WorkbookTable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkbookTable]
  }
  
  @scala.inline
  implicit class WorkbookTableMutableBuilder[Self <: WorkbookTable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumns(value: NullableOption[js.Array[WorkbookTableColumn]]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnsNull: Self = StObject.set(x, "columns", null)
    
    @scala.inline
    def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    @scala.inline
    def setColumnsVarargs(value: WorkbookTableColumn*): Self = StObject.set(x, "columns", js.Array(value :_*))
    
    @scala.inline
    def setHighlightFirstColumn(value: Boolean): Self = StObject.set(x, "highlightFirstColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighlightFirstColumnUndefined: Self = StObject.set(x, "highlightFirstColumn", js.undefined)
    
    @scala.inline
    def setHighlightLastColumn(value: Boolean): Self = StObject.set(x, "highlightLastColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighlightLastColumnUndefined: Self = StObject.set(x, "highlightLastColumn", js.undefined)
    
    @scala.inline
    def setLegacyId(value: NullableOption[String]): Self = StObject.set(x, "legacyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLegacyIdNull: Self = StObject.set(x, "legacyId", null)
    
    @scala.inline
    def setLegacyIdUndefined: Self = StObject.set(x, "legacyId", js.undefined)
    
    @scala.inline
    def setName(value: NullableOption[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameNull: Self = StObject.set(x, "name", null)
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setRows(value: NullableOption[js.Array[WorkbookTableRow]]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowsNull: Self = StObject.set(x, "rows", null)
    
    @scala.inline
    def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
    
    @scala.inline
    def setRowsVarargs(value: WorkbookTableRow*): Self = StObject.set(x, "rows", js.Array(value :_*))
    
    @scala.inline
    def setShowBandedColumns(value: Boolean): Self = StObject.set(x, "showBandedColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowBandedColumnsUndefined: Self = StObject.set(x, "showBandedColumns", js.undefined)
    
    @scala.inline
    def setShowBandedRows(value: Boolean): Self = StObject.set(x, "showBandedRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowBandedRowsUndefined: Self = StObject.set(x, "showBandedRows", js.undefined)
    
    @scala.inline
    def setShowFilterButton(value: Boolean): Self = StObject.set(x, "showFilterButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowFilterButtonUndefined: Self = StObject.set(x, "showFilterButton", js.undefined)
    
    @scala.inline
    def setShowHeaders(value: Boolean): Self = StObject.set(x, "showHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowHeadersUndefined: Self = StObject.set(x, "showHeaders", js.undefined)
    
    @scala.inline
    def setShowTotals(value: Boolean): Self = StObject.set(x, "showTotals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowTotalsUndefined: Self = StObject.set(x, "showTotals", js.undefined)
    
    @scala.inline
    def setSort(value: NullableOption[WorkbookTableSort]): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortNull: Self = StObject.set(x, "sort", null)
    
    @scala.inline
    def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
    
    @scala.inline
    def setStyle(value: NullableOption[String]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleNull: Self = StObject.set(x, "style", null)
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setWorksheet(value: NullableOption[WorkbookWorksheet]): Self = StObject.set(x, "worksheet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorksheetNull: Self = StObject.set(x, "worksheet", null)
    
    @scala.inline
    def setWorksheetUndefined: Self = StObject.set(x, "worksheet", js.undefined)
  }
}
