package typingsSlinky.officeJs.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents a scoped collection of tables. For each table its top-left corner is considered its anchor location and the tables are sorted top to bottom and then left to right.
  *
  * [Api set: ExcelApi 1.9]
  */
@js.native
trait TableScopedCollectionLoadOptions extends js.Object {
  
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * For EACH ITEM in the collection: Represents the AutoFilter object of the table.
    *
    * [Api set: ExcelApi 1.9]
    */
  var autoFilter: js.UndefOr[AutoFilterLoadOptions] = js.native
  
  /**
    *
    * For EACH ITEM in the collection: Represents a collection of all the columns in the table.
    *
    * [Api set: ExcelApi 1.1]
    */
  var columns: js.UndefOr[TableColumnCollectionLoadOptions] = js.native
  
  /**
    *
    * For EACH ITEM in the collection: Specifies if the first column contains special formatting.
    *
    * [Api set: ExcelApi 1.3]
    */
  var highlightFirstColumn: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * For EACH ITEM in the collection: Specifies if the last column contains special formatting.
    *
    * [Api set: ExcelApi 1.3]
    */
  var highlightLastColumn: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * For EACH ITEM in the collection: Returns a value that uniquely identifies the table in a given workbook. The value of the identifier remains the same even when the table is renamed.
    *
    * [Api set: ExcelApi 1.1]
    */
  var id: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * For EACH ITEM in the collection: Returns a numeric id.
    *
    * [Api set: ExcelApi 1.8]
    */
  var legacyId: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * For EACH ITEM in the collection: Name of the table.
    
    The set name of the table must follow the guidelines specified in the {@link https://support.office.com/article/Rename-an-Excel-table-FBF49A4F-82A3-43EB-8BA2-44D21233B114 | Rename an Excel table} article.
    *
    * [Api set: ExcelApi 1.1]
    */
  var name: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * For EACH ITEM in the collection: Represents a collection of all the rows in the table.
    *
    * [Api set: ExcelApi 1.1]
    */
  var rows: js.UndefOr[TableRowCollectionLoadOptions] = js.native
  
  /**
    *
    * For EACH ITEM in the collection: Specifies if the columns show banded formatting in which odd columns are highlighted differently from even ones to make reading the table easier.
    *
    * [Api set: ExcelApi 1.3]
    */
  var showBandedColumns: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * For EACH ITEM in the collection: Specifies if the rows show banded formatting in which odd rows are highlighted differently from even ones to make reading the table easier.
    *
    * [Api set: ExcelApi 1.3]
    */
  var showBandedRows: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * For EACH ITEM in the collection: Specifies if the filter buttons are visible at the top of each column header. Setting this is only allowed if the table contains a header row.
    *
    * [Api set: ExcelApi 1.3]
    */
  var showFilterButton: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * For EACH ITEM in the collection: Specifies if the header row is visible. This value can be set to show or remove the header row.
    *
    * [Api set: ExcelApi 1.1]
    */
  var showHeaders: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * For EACH ITEM in the collection: Specifies if the total row is visible. This value can be set to show or remove the total row.
    *
    * [Api set: ExcelApi 1.1]
    */
  var showTotals: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * For EACH ITEM in the collection: Represents the sorting for the table.
    *
    * [Api set: ExcelApi 1.2]
    */
  var sort: js.UndefOr[TableSortLoadOptions] = js.native
  
  /**
    *
    * For EACH ITEM in the collection: Constant value that represents the Table style. Possible values are: "TableStyleLight1" through "TableStyleLight21", "TableStyleMedium1" through "TableStyleMedium28", "TableStyleDark1" through "TableStyleDark11". A custom user-defined style present in the workbook can also be specified.
    *
    * [Api set: ExcelApi 1.1]
    */
  var style: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * For EACH ITEM in the collection: The worksheet containing the current table.
    *
    * [Api set: ExcelApi 1.2]
    */
  var worksheet: js.UndefOr[WorksheetLoadOptions] = js.native
}
object TableScopedCollectionLoadOptions {
  
  @scala.inline
  def apply(): TableScopedCollectionLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableScopedCollectionLoadOptions]
  }
  
  @scala.inline
  implicit class TableScopedCollectionLoadOptionsOps[Self <: TableScopedCollectionLoadOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def set$all(value: Boolean): Self = this.set("$all", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$all: Self = this.set("$all", js.undefined)
    
    @scala.inline
    def setAutoFilter(value: AutoFilterLoadOptions): Self = this.set("autoFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoFilter: Self = this.set("autoFilter", js.undefined)
    
    @scala.inline
    def setColumns(value: TableColumnCollectionLoadOptions): Self = this.set("columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumns: Self = this.set("columns", js.undefined)
    
    @scala.inline
    def setHighlightFirstColumn(value: Boolean): Self = this.set("highlightFirstColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHighlightFirstColumn: Self = this.set("highlightFirstColumn", js.undefined)
    
    @scala.inline
    def setHighlightLastColumn(value: Boolean): Self = this.set("highlightLastColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHighlightLastColumn: Self = this.set("highlightLastColumn", js.undefined)
    
    @scala.inline
    def setId(value: Boolean): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setLegacyId(value: Boolean): Self = this.set("legacyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLegacyId: Self = this.set("legacyId", js.undefined)
    
    @scala.inline
    def setName(value: Boolean): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setRows(value: TableRowCollectionLoadOptions): Self = this.set("rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRows: Self = this.set("rows", js.undefined)
    
    @scala.inline
    def setShowBandedColumns(value: Boolean): Self = this.set("showBandedColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowBandedColumns: Self = this.set("showBandedColumns", js.undefined)
    
    @scala.inline
    def setShowBandedRows(value: Boolean): Self = this.set("showBandedRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowBandedRows: Self = this.set("showBandedRows", js.undefined)
    
    @scala.inline
    def setShowFilterButton(value: Boolean): Self = this.set("showFilterButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowFilterButton: Self = this.set("showFilterButton", js.undefined)
    
    @scala.inline
    def setShowHeaders(value: Boolean): Self = this.set("showHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowHeaders: Self = this.set("showHeaders", js.undefined)
    
    @scala.inline
    def setShowTotals(value: Boolean): Self = this.set("showTotals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowTotals: Self = this.set("showTotals", js.undefined)
    
    @scala.inline
    def setSort(value: TableSortLoadOptions): Self = this.set("sort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSort: Self = this.set("sort", js.undefined)
    
    @scala.inline
    def setStyle(value: Boolean): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setWorksheet(value: WorksheetLoadOptions): Self = this.set("worksheet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWorksheet: Self = this.set("worksheet", js.undefined)
  }
}
