package typingsSlinky.ejWebAll.ej

import typingsSlinky.ejWebAll.ej.Pivot.AnalysisMode
import typingsSlinky.ejWebAll.ej.Pivot.OperationalMode
import typingsSlinky.ejWebAll.ej.PivotAnalysis.FilterType
import typingsSlinky.ejWebAll.ej.PivotAnalysis.SortOrder
import typingsSlinky.ejWebAll.ej.PivotAnalysis.SummaryType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PivotGrid extends Widget_ {
  
  /** This function returns the height of all rows and the width of all columns.
    * @returns {any}
    */
  def calculateCellWidths(): js.Any = js.native
  
  var defaults: Model = js.native
  
  /** Performs an asynchronous HTTP (AJAX) request.
    * @returns {void}
    */
  def doAjaxPost(): Unit = js.native
  
  /** Performs an asynchronous HTTP (FullPost) submit.
    * @returns {void}
    */
  def doPostBack(): Unit = js.native
  
  /** This function reconstructs the JSON data that is formed for rendering the PivotGrid in the excel-like layout format.
    * @returns {void}
    */
  def excelLikeLayout(): Unit = js.native
  
  /** Exports the PivotGrid to the specified format.
    * @returns {void}
    */
  def exportPivotGrid(): Unit = js.native
  
  /** Returns the JSON records that are formed to render the control.
    * @returns {any[]}
    */
  def getJSONRecords(): js.Array[_] = js.native
  
  /** Returns the OlapReport string that is maintained along with the axis elements information.
    * @returns {string}
    */
  def getOlapReport(): String = js.native
  
  /** This function loads the specified report from the database/local storage.
    * @returns {void}
    */
  def loadReport(): Unit = js.native
  
  @JSName("model")
  var model_PivotGrid: Model = js.native
  
  /** This function creates the conditional formatting dialog to apply conditional formatting for the PivotGrid control.
    * @returns {void}
    */
  def openConditionalFormattingDialog(): Unit = js.native
  
  /** This function re-renders the control with the report available at that instant.
    * @returns {void}
    */
  def refreshControl(): Unit = js.native
  
  /** This function allows you to change the caption of the pivot item (name displayed in UI) on-demand for the relational datasource in client-mode.
    * @returns {void}
    */
  def refreshFieldCaption(): Unit = js.native
  
  /** This function re-renders the PivotGrid when clicking the navigation buttons on the PivotPager.
    * @returns {void}
    */
  def refreshPagedPivotGrid(): Unit = js.native
  
  /** This function refreshes the PivotGrid with the modified data input in client-mode.
    * @returns {void}
    */
  def refreshPivotGrid(): Unit = js.native
  
  /** This function receives the JSON formatted datasource to render the PivotGrid control.
    * @returns {void}
    */
  def renderControlFromJSON(): Unit = js.native
  
  /** This function saves the current report to the database/local storage.
    * @returns {void}
    */
  def saveReport(): Unit = js.native
  
  /** Sets the JSON records that are formed to render the control.
    * @returns {void}
    */
  def setJSONRecords(): Unit = js.native
  
  /** Sets the OlapReport string along with the axis information.
    * @returns {void}
    */
  def setOlapReport(): Unit = js.native
}
object PivotGrid {
  
  @js.native
  sealed trait Layout extends StObject
  @JSGlobal("ej.PivotGrid.Layout")
  @js.native
  object Layout extends StObject {
    
    ///To set excel-like layout in PivotGrid.
    @js.native
    sealed trait ExcelLikeLayout extends Layout
    
    ///To set layout without summaries in PivotGrid.
    @js.native
    sealed trait NoSummaries extends Layout
    
    ///To set normal summary layout in PivotGrid.
    @js.native
    sealed trait Normal extends Layout
    
    ///To set layout with summaries at the top in PivotGrid.
    @js.native
    sealed trait NormalTopSummary extends Layout
  }
  
  @js.native
  trait AfterServiceInvokeEventArgs extends StObject {
    
    /** returns the current action of PivotGrid control.
      */
    var action: js.UndefOr[String] = js.native
    
    /** returns the custom object bound with PivotGrid control.
      */
    var customObject: js.UndefOr[js.Any] = js.native
    
    /** returns the HTML element of PivotGrid control.
      */
    var element: js.UndefOr[js.Any] = js.native
  }
  object AfterServiceInvokeEventArgs {
    
    @scala.inline
    def apply(): AfterServiceInvokeEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AfterServiceInvokeEventArgs]
    }
    
    @scala.inline
    implicit class AfterServiceInvokeEventArgsMutableBuilder[Self <: AfterServiceInvokeEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      @scala.inline
      def setCustomObject(value: js.Any): Self = StObject.set(x, "customObject", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomObjectUndefined: Self = StObject.set(x, "customObject", js.undefined)
      
      @scala.inline
      def setElement(value: js.Any): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    }
  }
  
  @js.native
  trait BeforeExportEventArgs extends StObject {
    
    /** contains the name of the exporting file.
      */
    var fileName: js.UndefOr[String] = js.native
    
    /** contains the url of the service responsible for exporting.
      */
    var url: js.UndefOr[String] = js.native
  }
  object BeforeExportEventArgs {
    
    @scala.inline
    def apply(): BeforeExportEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BeforeExportEventArgs]
    }
    
    @scala.inline
    implicit class BeforeExportEventArgsMutableBuilder[Self <: BeforeExportEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileNameUndefined: Self = StObject.set(x, "fileName", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  @js.native
  trait BeforePivotEnginePopulateEventArgs extends StObject {
    
    /** returns the PivotGrid object
      */
    var pivotGridObject: js.UndefOr[js.Any] = js.native
  }
  object BeforePivotEnginePopulateEventArgs {
    
    @scala.inline
    def apply(): BeforePivotEnginePopulateEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BeforePivotEnginePopulateEventArgs]
    }
    
    @scala.inline
    implicit class BeforePivotEnginePopulateEventArgsMutableBuilder[Self <: BeforePivotEnginePopulateEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPivotGridObject(value: js.Any): Self = StObject.set(x, "pivotGridObject", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPivotGridObjectUndefined: Self = StObject.set(x, "pivotGridObject", js.undefined)
    }
  }
  
  @js.native
  trait BeforeServiceInvokeEventArgs extends StObject {
    
    /** returns the current action of PivotGrid control.
      */
    var action: js.UndefOr[String] = js.native
    
    /** returns the custom object bound with PivotGrid control.
      */
    var customObject: js.UndefOr[js.Any] = js.native
    
    /** returns the HTML element of PivotGrid control.
      */
    var element: js.UndefOr[js.Any] = js.native
  }
  object BeforeServiceInvokeEventArgs {
    
    @scala.inline
    def apply(): BeforeServiceInvokeEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BeforeServiceInvokeEventArgs]
    }
    
    @scala.inline
    implicit class BeforeServiceInvokeEventArgsMutableBuilder[Self <: BeforeServiceInvokeEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      @scala.inline
      def setCustomObject(value: js.Any): Self = StObject.set(x, "customObject", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomObjectUndefined: Self = StObject.set(x, "customObject", js.undefined)
      
      @scala.inline
      def setElement(value: js.Any): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    }
  }
  
  @js.native
  trait CellClickEventArgs extends StObject {
    
    /** returns the custom object bound with PivotGrid control.
      */
    var customObject: js.UndefOr[js.Any] = js.native
    
    /** returns the HTML element of PivotGrid control.
      */
    var element: js.UndefOr[js.Any] = js.native
    
    /** returns the JSON details of the respective on cell.
      */
    var selectedData: js.UndefOr[js.Array[_]] = js.native
  }
  object CellClickEventArgs {
    
    @scala.inline
    def apply(): CellClickEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CellClickEventArgs]
    }
    
    @scala.inline
    implicit class CellClickEventArgsMutableBuilder[Self <: CellClickEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCustomObject(value: js.Any): Self = StObject.set(x, "customObject", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomObjectUndefined: Self = StObject.set(x, "customObject", js.undefined)
      
      @scala.inline
      def setElement(value: js.Any): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
      
      @scala.inline
      def setSelectedData(value: js.Array[_]): Self = StObject.set(x, "selectedData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedDataUndefined: Self = StObject.set(x, "selectedData", js.undefined)
      
      @scala.inline
      def setSelectedDataVarargs(value: js.Any*): Self = StObject.set(x, "selectedData", js.Array(value :_*))
    }
  }
  
  @js.native
  trait CellContextEventArgs extends StObject {
    
    /** returns the original event object.
      */
    var args: js.UndefOr[js.Any] = js.native
    
    /** returns the cell position (row index and column index) in table.
      */
    var cellPosition: js.UndefOr[String] = js.native
    
    /** returns the type of the cell.
      */
    var cellType: js.UndefOr[String] = js.native
    
    /** returns the content of the cell.
      */
    var cellValue: js.UndefOr[String] = js.native
    
    /** returns JSON record corresponding to the selected cell.
      */
    var rawdata: js.UndefOr[js.Any] = js.native
    
    /** returns the role of the cell in PivotGrid.
      */
    var role: js.UndefOr[String] = js.native
    
    /** returns the unique name of levels/members.
      */
    var uniqueName: js.UndefOr[String] = js.native
  }
  object CellContextEventArgs {
    
    @scala.inline
    def apply(): CellContextEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CellContextEventArgs]
    }
    
    @scala.inline
    implicit class CellContextEventArgsMutableBuilder[Self <: CellContextEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArgs(value: js.Any): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
      
      @scala.inline
      def setCellPosition(value: String): Self = StObject.set(x, "cellPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCellPositionUndefined: Self = StObject.set(x, "cellPosition", js.undefined)
      
      @scala.inline
      def setCellType(value: String): Self = StObject.set(x, "cellType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCellTypeUndefined: Self = StObject.set(x, "cellType", js.undefined)
      
      @scala.inline
      def setCellValue(value: String): Self = StObject.set(x, "cellValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCellValueUndefined: Self = StObject.set(x, "cellValue", js.undefined)
      
      @scala.inline
      def setRawdata(value: js.Any): Self = StObject.set(x, "rawdata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRawdataUndefined: Self = StObject.set(x, "rawdata", js.undefined)
      
      @scala.inline
      def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      @scala.inline
      def setUniqueName(value: String): Self = StObject.set(x, "uniqueName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUniqueNameUndefined: Self = StObject.set(x, "uniqueName", js.undefined)
    }
  }
  
  @js.native
  trait CellDoubleClickEventArgs extends StObject {
    
    /** returns the custom object bound with PivotGrid control.
      */
    var customObject: js.UndefOr[js.Any] = js.native
    
    /** returns the HTML element of PivotGrid control.
      */
    var element: js.UndefOr[js.Any] = js.native
    
    /** returns the JSON details of the double respective on cell.
      */
    var selectedData: js.UndefOr[js.Array[_]] = js.native
  }
  object CellDoubleClickEventArgs {
    
    @scala.inline
    def apply(): CellDoubleClickEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CellDoubleClickEventArgs]
    }
    
    @scala.inline
    implicit class CellDoubleClickEventArgsMutableBuilder[Self <: CellDoubleClickEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCustomObject(value: js.Any): Self = StObject.set(x, "customObject", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomObjectUndefined: Self = StObject.set(x, "customObject", js.undefined)
      
      @scala.inline
      def setElement(value: js.Any): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
      
      @scala.inline
      def setSelectedData(value: js.Array[_]): Self = StObject.set(x, "selectedData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedDataUndefined: Self = StObject.set(x, "selectedData", js.undefined)
      
      @scala.inline
      def setSelectedDataVarargs(value: js.Any*): Self = StObject.set(x, "selectedData", js.Array(value :_*))
    }
  }
  
  @js.native
  trait CellEditEventArgs extends StObject {
    
    /** contains the array of cells selected for editing.
      */
    var editCellsInfo: js.UndefOr[js.Array[_]] = js.native
  }
  object CellEditEventArgs {
    
    @scala.inline
    def apply(): CellEditEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CellEditEventArgs]
    }
    
    @scala.inline
    implicit class CellEditEventArgsMutableBuilder[Self <: CellEditEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEditCellsInfo(value: js.Array[_]): Self = StObject.set(x, "editCellsInfo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEditCellsInfoUndefined: Self = StObject.set(x, "editCellsInfo", js.undefined)
      
      @scala.inline
      def setEditCellsInfoVarargs(value: js.Any*): Self = StObject.set(x, "editCellsInfo", js.Array(value :_*))
    }
  }
  
  @js.native
  trait CellSelectionEventArgs extends StObject {
    
    /** returns the JSON records of the selected range of cells.
      */
    var JSONRecords: js.UndefOr[js.Any] = js.native
    
    /** Returns the column headers corresponding to the selected value cells.
      */
    var columnheader: js.UndefOr[js.Any] = js.native
    
    /** Returns the information about the measure associated with the selected cell.
      */
    var measureCount: js.UndefOr[String] = js.native
    
    /** Returns the row headers corresponding to the selected value cells.
      */
    var rowheader: js.UndefOr[js.Any] = js.native
  }
  object CellSelectionEventArgs {
    
    @scala.inline
    def apply(): CellSelectionEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CellSelectionEventArgs]
    }
    
    @scala.inline
    implicit class CellSelectionEventArgsMutableBuilder[Self <: CellSelectionEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColumnheader(value: js.Any): Self = StObject.set(x, "columnheader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnheaderUndefined: Self = StObject.set(x, "columnheader", js.undefined)
      
      @scala.inline
      def setJSONRecords(value: js.Any): Self = StObject.set(x, "JSONRecords", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJSONRecordsUndefined: Self = StObject.set(x, "JSONRecords", js.undefined)
      
      @scala.inline
      def setMeasureCount(value: String): Self = StObject.set(x, "measureCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMeasureCountUndefined: Self = StObject.set(x, "measureCount", js.undefined)
      
      @scala.inline
      def setRowheader(value: js.Any): Self = StObject.set(x, "rowheader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowheaderUndefined: Self = StObject.set(x, "rowheader", js.undefined)
    }
  }
  
  @js.native
  trait ColumnHeaderHyperlinkClickEventArgs extends StObject {
    
    /** returns the information about the clicked cell
      */
    var args: js.UndefOr[js.Any] = js.native
    
    /** returns the custom object bound to the control.
      */
    var customObject: js.UndefOr[js.Any] = js.native
    
    /** returns the HTML element of the control.
      */
    var element: js.UndefOr[js.Any] = js.native
  }
  object ColumnHeaderHyperlinkClickEventArgs {
    
    @scala.inline
    def apply(): ColumnHeaderHyperlinkClickEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ColumnHeaderHyperlinkClickEventArgs]
    }
    
    @scala.inline
    implicit class ColumnHeaderHyperlinkClickEventArgsMutableBuilder[Self <: ColumnHeaderHyperlinkClickEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArgs(value: js.Any): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
      
      @scala.inline
      def setCustomObject(value: js.Any): Self = StObject.set(x, "customObject", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomObjectUndefined: Self = StObject.set(x, "customObject", js.undefined)
      
      @scala.inline
      def setElement(value: js.Any): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    }
  }
  
  @js.native
  trait DataSource extends StObject {
    
    /** In connection with an OLAP database, this property contains the database name as string to fetch the data from the given connection string.
      * @Default {â€œâ€}
      */
    var catalog: js.UndefOr[String] = js.native
    
    /** Lists out the items to be arranged in the columns section of the PivotGrid.
      * @Default {[]}
      */
    var columns: js.UndefOr[js.Array[DataSourceColumn]] = js.native
    
    /** Contains the respective cube name as string type in the OLAP database.
      * @Default {â€œâ€}
      */
    var cube: js.UndefOr[String] = js.native
    
    /** Provides the raw data source for the PivotGrid.
      * @Default {null}
      */
    var data: js.UndefOr[js.Any] = js.native
    
    /** Allows you to filter the members (by its name and values) through advanced filtering (e.g., Microsoft Excel) option at OLAP data source in client-mode.
      * @Default {false}
      */
    var enableAdvancedFilter: js.UndefOr[Boolean] = js.native
    
    /** Lists out the items which supports filtering of values without displaying the members in UI of the PivotGrid.
      * @Default {[]}
      */
    var filters: js.UndefOr[js.Array[DataSourceFilter]] = js.native
    
    /** Allows to set the page size and current page number for each axis on applying the paging.
      * @Default {{}}
      */
    var pagerOptions: js.UndefOr[DataSourcePagerOptions] = js.native
    
    /** Sets the provider name for PivotGrid to identify whether the provider is SSAS or Mondrian.
      * @Default {ssas}
      */
    var providerName: js.UndefOr[String] = js.native
    
    /** Sets a name to the report that is bound to the control.
      */
    var reportName: js.UndefOr[String] = js.native
    
    /** Lists out the items to be arranged in the rows section of PivotGrid.
      * @Default {[]}
      */
    var rows: js.UndefOr[js.Array[DataSourceRow]] = js.native
    
    /** To set the data source name to fetch the data.
      * @Default {â€œâ€}
      */
    var sourceInfo: js.UndefOr[String] = js.native
    
    /** Lists out the items that support calculation in the PivotGrid.
      * @Default {[]}
      */
    var values: js.UndefOr[js.Array[DataSourceValue]] = js.native
  }
  object DataSource {
    
    @scala.inline
    def apply(): DataSource = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DataSource]
    }
    
    @scala.inline
    implicit class DataSourceMutableBuilder[Self <: DataSource] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCatalog(value: String): Self = StObject.set(x, "catalog", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCatalogUndefined: Self = StObject.set(x, "catalog", js.undefined)
      
      @scala.inline
      def setColumns(value: js.Array[DataSourceColumn]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
      
      @scala.inline
      def setColumnsVarargs(value: DataSourceColumn*): Self = StObject.set(x, "columns", js.Array(value :_*))
      
      @scala.inline
      def setCube(value: String): Self = StObject.set(x, "cube", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCubeUndefined: Self = StObject.set(x, "cube", js.undefined)
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setEnableAdvancedFilter(value: Boolean): Self = StObject.set(x, "enableAdvancedFilter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableAdvancedFilterUndefined: Self = StObject.set(x, "enableAdvancedFilter", js.undefined)
      
      @scala.inline
      def setFilters(value: js.Array[DataSourceFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      @scala.inline
      def setFiltersVarargs(value: DataSourceFilter*): Self = StObject.set(x, "filters", js.Array(value :_*))
      
      @scala.inline
      def setPagerOptions(value: DataSourcePagerOptions): Self = StObject.set(x, "pagerOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPagerOptionsUndefined: Self = StObject.set(x, "pagerOptions", js.undefined)
      
      @scala.inline
      def setProviderName(value: String): Self = StObject.set(x, "providerName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProviderNameUndefined: Self = StObject.set(x, "providerName", js.undefined)
      
      @scala.inline
      def setReportName(value: String): Self = StObject.set(x, "reportName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReportNameUndefined: Self = StObject.set(x, "reportName", js.undefined)
      
      @scala.inline
      def setRows(value: js.Array[DataSourceRow]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
      
      @scala.inline
      def setRowsVarargs(value: DataSourceRow*): Self = StObject.set(x, "rows", js.Array(value :_*))
      
      @scala.inline
      def setSourceInfo(value: String): Self = StObject.set(x, "sourceInfo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceInfoUndefined: Self = StObject.set(x, "sourceInfo", js.undefined)
      
      @scala.inline
      def setValues(value: js.Array[DataSourceValue]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
      
      @scala.inline
      def setValuesVarargs(value: DataSourceValue*): Self = StObject.set(x, "values", js.Array(value :_*))
    }
  }
  
  @js.native
  trait DataSourceColumn extends StObject {
    
    /** Allows you to filter the report by using advanced filtering (e.g., Microsoft Excel) option for the OLAP data source in client-mode.
      * @Default {[]}
      */
    var advancedFilter: js.UndefOr[js.Array[DataSourceColumnsAdvancedFilter]] = js.native
    
    /** Allows you to set the custom theme for column headers.
      */
    var cssClass: js.UndefOr[String] = js.native
    
    /** Allows you to set the delimiter for date type format in the formatString. This is applicable for the groupByDate of row/column headers.
      */
    var delimiter: js.UndefOr[String] = js.native
    
    /** Contains the list of members need to be drilled down by default in the field.
      * @Default {[]}
      */
    var drilledItems: js.UndefOr[js.Array[_]] = js.native
    
    /** Allows you to set the display caption for an item.
      */
    var fieldCaption: js.UndefOr[String] = js.native
    
    /** Allows you to bind the item by using its unique name as field name.
      */
    var fieldName: js.UndefOr[String] = js.native
    
    /** Applies the filter to field members.
      * @Default {null}
      */
    var filterItems: js.UndefOr[DataSourceColumnsFilterItems] = js.native
    
    /** Allows you to set the format for column headers.
      */
    var format: js.UndefOr[String] = js.native
    
    /** This property is set to display the formatted values with format types in the PivotGrid.
      */
    var formatString: js.UndefOr[String] = js.native
    
    /** Allows you to indicate whether the added item is a named set or not.
      * @Default {false}
      */
    var isNamedSets: js.UndefOr[Boolean] = js.native
    
    /** Shows/hides the sub-total of the field in PivotGrid.
      * @Default {true}
      */
    var showSubTotal: js.UndefOr[Boolean] = js.native
    
    /** Allows you to set the sorting order of members of the field.
      * @Default {ej.PivotAnalysis.SortOrder.Ascending}
      */
    var sortOrder: js.UndefOr[SortOrder | String] = js.native
  }
  object DataSourceColumn {
    
    @scala.inline
    def apply(): DataSourceColumn = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DataSourceColumn]
    }
    
    @scala.inline
    implicit class DataSourceColumnMutableBuilder[Self <: DataSourceColumn] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdvancedFilter(value: js.Array[DataSourceColumnsAdvancedFilter]): Self = StObject.set(x, "advancedFilter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAdvancedFilterUndefined: Self = StObject.set(x, "advancedFilter", js.undefined)
      
      @scala.inline
      def setAdvancedFilterVarargs(value: DataSourceColumnsAdvancedFilter*): Self = StObject.set(x, "advancedFilter", js.Array(value :_*))
      
      @scala.inline
      def setCssClass(value: String): Self = StObject.set(x, "cssClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCssClassUndefined: Self = StObject.set(x, "cssClass", js.undefined)
      
      @scala.inline
      def setDelimiter(value: String): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelimiterUndefined: Self = StObject.set(x, "delimiter", js.undefined)
      
      @scala.inline
      def setDrilledItems(value: js.Array[_]): Self = StObject.set(x, "drilledItems", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDrilledItemsUndefined: Self = StObject.set(x, "drilledItems", js.undefined)
      
      @scala.inline
      def setDrilledItemsVarargs(value: js.Any*): Self = StObject.set(x, "drilledItems", js.Array(value :_*))
      
      @scala.inline
      def setFieldCaption(value: String): Self = StObject.set(x, "fieldCaption", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldCaptionUndefined: Self = StObject.set(x, "fieldCaption", js.undefined)
      
      @scala.inline
      def setFieldName(value: String): Self = StObject.set(x, "fieldName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldNameUndefined: Self = StObject.set(x, "fieldName", js.undefined)
      
      @scala.inline
      def setFilterItems(value: DataSourceColumnsFilterItems): Self = StObject.set(x, "filterItems", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterItemsUndefined: Self = StObject.set(x, "filterItems", js.undefined)
      
      @scala.inline
      def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatString(value: String): Self = StObject.set(x, "formatString", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatStringUndefined: Self = StObject.set(x, "formatString", js.undefined)
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setIsNamedSets(value: Boolean): Self = StObject.set(x, "isNamedSets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsNamedSetsUndefined: Self = StObject.set(x, "isNamedSets", js.undefined)
      
      @scala.inline
      def setShowSubTotal(value: Boolean): Self = StObject.set(x, "showSubTotal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowSubTotalUndefined: Self = StObject.set(x, "showSubTotal", js.undefined)
      
      @scala.inline
      def setSortOrder(value: SortOrder | String): Self = StObject.set(x, "sortOrder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSortOrderUndefined: Self = StObject.set(x, "sortOrder", js.undefined)
    }
  }
  
  @js.native
  trait DataSourceColumnsAdvancedFilter extends StObject {
    
    /** Allows you to set the filtering type while performing the advanced filtering.
      */
    var advancedFilterType: js.UndefOr[String] = js.native
    
    /** Allows you to set the operator to perform the label filtering.
      * @Default {none}
      */
    var labelFilterOperator: js.UndefOr[String] = js.native
    
    /** In value filtering, this property contains the measure name to which the filter is applied.
      */
    var measure: js.UndefOr[String] = js.native
    
    /** Allows you to provide a level unique name to perform the advanced filtering.
      */
    var name: js.UndefOr[String] = js.native
    
    /** Allows you to set the operator to perform the value filtering.
      * @Default {none}
      */
    var valueFilterOperator: js.UndefOr[String] = js.native
    
    /** Allows you to hold filter operand values in the advanced filtering.
      */
    var values: js.UndefOr[js.Array[_]] = js.native
  }
  object DataSourceColumnsAdvancedFilter {
    
    @scala.inline
    def apply(): DataSourceColumnsAdvancedFilter = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DataSourceColumnsAdvancedFilter]
    }
    
    @scala.inline
    implicit class DataSourceColumnsAdvancedFilterMutableBuilder[Self <: DataSourceColumnsAdvancedFilter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdvancedFilterType(value: String): Self = StObject.set(x, "advancedFilterType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAdvancedFilterTypeUndefined: Self = StObject.set(x, "advancedFilterType", js.undefined)
      
      @scala.inline
      def setLabelFilterOperator(value: String): Self = StObject.set(x, "labelFilterOperator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelFilterOperatorUndefined: Self = StObject.set(x, "labelFilterOperator", js.undefined)
      
      @scala.inline
      def setMeasure(value: String): Self = StObject.set(x, "measure", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMeasureUndefined: Self = StObject.set(x, "measure", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setValueFilterOperator(value: String): Self = StObject.set(x, "valueFilterOperator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueFilterOperatorUndefined: Self = StObject.set(x, "valueFilterOperator", js.undefined)
      
      @scala.inline
      def setValues(value: js.Array[_]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
      
      @scala.inline
      def setValuesVarargs(value: js.Any*): Self = StObject.set(x, "values", js.Array(value :_*))
    }
  }
  
  @js.native
  trait DataSourceColumnsFilterItems extends StObject {
    
    /** Sets the type of filter to include/exclude the mentioned values.
      * @Default {ej.PivotAnalysis.FilterType.Exclude}
      */
    var filterType: js.UndefOr[FilterType | String] = js.native
    
    /** Contains the collection of items to be included/excluded among the field members.
      * @Default {[]}
      */
    var values: js.UndefOr[js.Array[_]] = js.native
  }
  object DataSourceColumnsFilterItems {
    
    @scala.inline
    def apply(): DataSourceColumnsFilterItems = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DataSourceColumnsFilterItems]
    }
    
    @scala.inline
    implicit class DataSourceColumnsFilterItemsMutableBuilder[Self <: DataSourceColumnsFilterItems] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFilterType(value: FilterType | String): Self = StObject.set(x, "filterType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterTypeUndefined: Self = StObject.set(x, "filterType", js.undefined)
      
      @scala.inline
      def setValues(value: js.Array[_]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
      
      @scala.inline
      def setValuesVarargs(value: js.Any*): Self = StObject.set(x, "values", js.Array(value :_*))
    }
  }
  
  @js.native
  trait DataSourceFilter extends StObject {
    
    /** Allows you to set the display name for the item.
      */
    var fieldCaption: js.UndefOr[String] = js.native
    
    /** Allows you to bind the item by using its unique name as field name.
      */
    var fieldName: js.UndefOr[String] = js.native
    
    /** Applies the filter to field members.
      * @Default {null}
      */
    var filterItems: js.UndefOr[DataSourceFiltersFilterItems] = js.native
  }
  object DataSourceFilter {
    
    @scala.inline
    def apply(): DataSourceFilter = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DataSourceFilter]
    }
    
    @scala.inline
    implicit class DataSourceFilterMutableBuilder[Self <: DataSourceFilter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFieldCaption(value: String): Self = StObject.set(x, "fieldCaption", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldCaptionUndefined: Self = StObject.set(x, "fieldCaption", js.undefined)
      
      @scala.inline
      def setFieldName(value: String): Self = StObject.set(x, "fieldName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldNameUndefined: Self = StObject.set(x, "fieldName", js.undefined)
      
      @scala.inline
      def setFilterItems(value: DataSourceFiltersFilterItems): Self = StObject.set(x, "filterItems", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterItemsUndefined: Self = StObject.set(x, "filterItems", js.undefined)
    }
  }
  
  @js.native
  trait DataSourceFiltersFilterItems extends StObject {
    
    /** Sets the type of filter to include/exclude the mentioned values.
      * @Default {ej.PivotAnalysis.FilterType.Exclude}
      */
    var filterType: js.UndefOr[FilterType | String] = js.native
    
    /** Contains the collection of items to be included/excluded among the field members.
      * @Default {[]}
      */
    var values: js.UndefOr[js.Array[_]] = js.native
  }
  object DataSourceFiltersFilterItems {
    
    @scala.inline
    def apply(): DataSourceFiltersFilterItems = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DataSourceFiltersFilterItems]
    }
    
    @scala.inline
    implicit class DataSourceFiltersFilterItemsMutableBuilder[Self <: DataSourceFiltersFilterItems] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFilterType(value: FilterType | String): Self = StObject.set(x, "filterType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterTypeUndefined: Self = StObject.set(x, "filterType", js.undefined)
      
      @scala.inline
      def setValues(value: js.Array[_]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
      
      @scala.inline
      def setValuesVarargs(value: js.Any*): Self = StObject.set(x, "values", js.Array(value :_*))
    }
  }
  
  @js.native
  trait DataSourcePagerOptions extends StObject {
    
    /** Allows to set the page number to be loaded in the categorical axis by default.
      * @Default {1}
      */
    var categoricalCurrentPage: js.UndefOr[Double] = js.native
    
    /** Allows to set the number of categorical columns to be displayed in each page on applying the paging.
      * @Default {0}
      */
    var categoricalPageSize: js.UndefOr[Double] = js.native
    
    /** Allows to set the page number to be loaded in the series axis by default.
      * @Default {1}
      */
    var seriesCurrentPage: js.UndefOr[Double] = js.native
    
    /** Allows to set the number of series rows to be displayed in each page on applying the paging.
      * @Default {0}
      */
    var seriesPageSize: js.UndefOr[Double] = js.native
  }
  object DataSourcePagerOptions {
    
    @scala.inline
    def apply(): DataSourcePagerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DataSourcePagerOptions]
    }
    
    @scala.inline
    implicit class DataSourcePagerOptionsMutableBuilder[Self <: DataSourcePagerOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCategoricalCurrentPage(value: Double): Self = StObject.set(x, "categoricalCurrentPage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCategoricalCurrentPageUndefined: Self = StObject.set(x, "categoricalCurrentPage", js.undefined)
      
      @scala.inline
      def setCategoricalPageSize(value: Double): Self = StObject.set(x, "categoricalPageSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCategoricalPageSizeUndefined: Self = StObject.set(x, "categoricalPageSize", js.undefined)
      
      @scala.inline
      def setSeriesCurrentPage(value: Double): Self = StObject.set(x, "seriesCurrentPage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeriesCurrentPageUndefined: Self = StObject.set(x, "seriesCurrentPage", js.undefined)
      
      @scala.inline
      def setSeriesPageSize(value: Double): Self = StObject.set(x, "seriesPageSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeriesPageSizeUndefined: Self = StObject.set(x, "seriesPageSize", js.undefined)
    }
  }
  
  @js.native
  trait DataSourceRow extends StObject {
    
    /** Allows you to filter the report by using the advanced filtering (e.g., Microsoft Excel) option for the OLAP data source in client-mode.
      * @Default {[]}
      */
    var advancedFilter: js.UndefOr[js.Array[DataSourceRowsAdvancedFilter]] = js.native
    
    /** Allows you to set the custom theme for row headers.
      */
    var cssClass: js.UndefOr[String] = js.native
    
    /** Allows you to set the delimiter for date type format in the formatString. This is applicable for the groupByDate in row/column headers.
      */
    var delimiter: js.UndefOr[String] = js.native
    
    /** Contains the list of members need to be drilled down by default in the field.
      * @Default {[]}
      */
    var drilledItems: js.UndefOr[js.Array[_]] = js.native
    
    /** Allows you to set the display caption for the item.
      */
    var fieldCaption: js.UndefOr[String] = js.native
    
    /** Allows you to bind the item by using its unique name as field name.
      */
    var fieldName: js.UndefOr[String] = js.native
    
    /** Applies the filter to field members.
      * @Default {null}
      */
    var filterItems: js.UndefOr[DataSourceRowsFilterItems] = js.native
    
    /** Allows you to set the format for row headers.
      */
    var format: js.UndefOr[String] = js.native
    
    /** This property is set to display the formatted values with format types in the PivotGrid.
      */
    var formatString: js.UndefOr[String] = js.native
    
    /** Allows you to indicate whether the added item is a named set or not.
      * @Default {false}
      */
    var isNamedSets: js.UndefOr[Boolean] = js.native
    
    /** Shows/hides the sub-total of the field.
      * @Default {true}
      */
    var showSubTotal: js.UndefOr[Boolean] = js.native
    
    /** Allows you to set the sorting order of members of the field.
      * @Default {ej.PivotAnalysis.SortOrder.Ascending}
      */
    var sortOrder: js.UndefOr[SortOrder | String] = js.native
  }
  object DataSourceRow {
    
    @scala.inline
    def apply(): DataSourceRow = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DataSourceRow]
    }
    
    @scala.inline
    implicit class DataSourceRowMutableBuilder[Self <: DataSourceRow] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdvancedFilter(value: js.Array[DataSourceRowsAdvancedFilter]): Self = StObject.set(x, "advancedFilter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAdvancedFilterUndefined: Self = StObject.set(x, "advancedFilter", js.undefined)
      
      @scala.inline
      def setAdvancedFilterVarargs(value: DataSourceRowsAdvancedFilter*): Self = StObject.set(x, "advancedFilter", js.Array(value :_*))
      
      @scala.inline
      def setCssClass(value: String): Self = StObject.set(x, "cssClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCssClassUndefined: Self = StObject.set(x, "cssClass", js.undefined)
      
      @scala.inline
      def setDelimiter(value: String): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelimiterUndefined: Self = StObject.set(x, "delimiter", js.undefined)
      
      @scala.inline
      def setDrilledItems(value: js.Array[_]): Self = StObject.set(x, "drilledItems", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDrilledItemsUndefined: Self = StObject.set(x, "drilledItems", js.undefined)
      
      @scala.inline
      def setDrilledItemsVarargs(value: js.Any*): Self = StObject.set(x, "drilledItems", js.Array(value :_*))
      
      @scala.inline
      def setFieldCaption(value: String): Self = StObject.set(x, "fieldCaption", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldCaptionUndefined: Self = StObject.set(x, "fieldCaption", js.undefined)
      
      @scala.inline
      def setFieldName(value: String): Self = StObject.set(x, "fieldName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldNameUndefined: Self = StObject.set(x, "fieldName", js.undefined)
      
      @scala.inline
      def setFilterItems(value: DataSourceRowsFilterItems): Self = StObject.set(x, "filterItems", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterItemsUndefined: Self = StObject.set(x, "filterItems", js.undefined)
      
      @scala.inline
      def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatString(value: String): Self = StObject.set(x, "formatString", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatStringUndefined: Self = StObject.set(x, "formatString", js.undefined)
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setIsNamedSets(value: Boolean): Self = StObject.set(x, "isNamedSets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsNamedSetsUndefined: Self = StObject.set(x, "isNamedSets", js.undefined)
      
      @scala.inline
      def setShowSubTotal(value: Boolean): Self = StObject.set(x, "showSubTotal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowSubTotalUndefined: Self = StObject.set(x, "showSubTotal", js.undefined)
      
      @scala.inline
      def setSortOrder(value: SortOrder | String): Self = StObject.set(x, "sortOrder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSortOrderUndefined: Self = StObject.set(x, "sortOrder", js.undefined)
    }
  }
  
  @js.native
  trait DataSourceRowsAdvancedFilter extends StObject {
    
    /** Allows you to set the filtering type while performing the advanced filtering.
      */
    var advancedFilterType: js.UndefOr[String] = js.native
    
    /** Allows you to set the operator to perform the label filtering.
      * @Default {none}
      */
    var labelFilterOperator: js.UndefOr[String] = js.native
    
    /** In value filtering, this property contains the measure name to which the filter is applied.
      */
    var measure: js.UndefOr[String] = js.native
    
    /** Allows you to provide the level unique name to perform the advanced filtering.
      */
    var name: js.UndefOr[String] = js.native
    
    /** Allows you to set the operator to perform the value filtering.
      * @Default {none}
      */
    var valueFilterOperator: js.UndefOr[String] = js.native
    
    /** Allows you to hold the filter operand values in the advanced filtering.
      */
    var values: js.UndefOr[js.Array[_]] = js.native
  }
  object DataSourceRowsAdvancedFilter {
    
    @scala.inline
    def apply(): DataSourceRowsAdvancedFilter = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DataSourceRowsAdvancedFilter]
    }
    
    @scala.inline
    implicit class DataSourceRowsAdvancedFilterMutableBuilder[Self <: DataSourceRowsAdvancedFilter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdvancedFilterType(value: String): Self = StObject.set(x, "advancedFilterType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAdvancedFilterTypeUndefined: Self = StObject.set(x, "advancedFilterType", js.undefined)
      
      @scala.inline
      def setLabelFilterOperator(value: String): Self = StObject.set(x, "labelFilterOperator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelFilterOperatorUndefined: Self = StObject.set(x, "labelFilterOperator", js.undefined)
      
      @scala.inline
      def setMeasure(value: String): Self = StObject.set(x, "measure", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMeasureUndefined: Self = StObject.set(x, "measure", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setValueFilterOperator(value: String): Self = StObject.set(x, "valueFilterOperator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueFilterOperatorUndefined: Self = StObject.set(x, "valueFilterOperator", js.undefined)
      
      @scala.inline
      def setValues(value: js.Array[_]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
      
      @scala.inline
      def setValuesVarargs(value: js.Any*): Self = StObject.set(x, "values", js.Array(value :_*))
    }
  }
  
  @js.native
  trait DataSourceRowsFilterItems extends StObject {
    
    /** Sets the type of filter to include/exclude the mentioned values.
      * @Default {ej.PivotAnalysis.FilterType.Exclude}
      */
    var filterType: js.UndefOr[FilterType | String] = js.native
    
    /** Contains the collection of items to be included/excluded among the field members.
      * @Default {[]}
      */
    var values: js.UndefOr[js.Array[_]] = js.native
  }
  object DataSourceRowsFilterItems {
    
    @scala.inline
    def apply(): DataSourceRowsFilterItems = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DataSourceRowsFilterItems]
    }
    
    @scala.inline
    implicit class DataSourceRowsFilterItemsMutableBuilder[Self <: DataSourceRowsFilterItems] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFilterType(value: FilterType | String): Self = StObject.set(x, "filterType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterTypeUndefined: Self = StObject.set(x, "filterType", js.undefined)
      
      @scala.inline
      def setValues(value: js.Array[_]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
      
      @scala.inline
      def setValuesVarargs(value: js.Any*): Self = StObject.set(x, "values", js.Array(value :_*))
    }
  }
  
  @js.native
  trait DataSourceValue extends StObject {
    
    /** Allows you to set the axis name to place measures items.
      * @Default {rows}
      */
    var axis: js.UndefOr[String] = js.native
    
    /** Allows to set the custom theme for values.
      */
    var cssClass: js.UndefOr[String] = js.native
    
    /** Allows you to set the display caption for the item in the relational datasource.
      */
    var fieldCaption: js.UndefOr[String] = js.native
    
    /** Allows you to bind the item by using its unique name as field name for the relational datasource.
      */
    var fieldName: js.UndefOr[String] = js.native
    
    /** Allows to set the format for values.
      */
    var format: js.UndefOr[String] = js.native
    
    /** This property is set to display the formatted values with format types in the PivotGrid.
      */
    var formatString: js.UndefOr[String] = js.native
    
    /** Allows to set the formula for calculation of values for calculated members in the relational datasource.
      */
    var formula: js.UndefOr[String] = js.native
    
    /** Indicates whether the field is a calculated field with the relational datasource or not.
      * @Default {false}
      */
    var isCalculatedField: js.UndefOr[Boolean] = js.native
    
    /** This holds the list of unique names of measures to bind them from the OLAP cube.
      * @Default {[]}
      */
    var measures: js.UndefOr[js.Array[DataSourceValuesMeasure]] = js.native
    
    /** Allows to set the type of PivotGrid summary calculation in the value field with the relational datasource.
      * @Default {ej.PivotAnalysis.SummaryType.Sum}
      */
    var summaryType: js.UndefOr[SummaryType | String] = js.native
  }
  object DataSourceValue {
    
    @scala.inline
    def apply(): DataSourceValue = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DataSourceValue]
    }
    
    @scala.inline
    implicit class DataSourceValueMutableBuilder[Self <: DataSourceValue] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAxis(value: String): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAxisUndefined: Self = StObject.set(x, "axis", js.undefined)
      
      @scala.inline
      def setCssClass(value: String): Self = StObject.set(x, "cssClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCssClassUndefined: Self = StObject.set(x, "cssClass", js.undefined)
      
      @scala.inline
      def setFieldCaption(value: String): Self = StObject.set(x, "fieldCaption", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldCaptionUndefined: Self = StObject.set(x, "fieldCaption", js.undefined)
      
      @scala.inline
      def setFieldName(value: String): Self = StObject.set(x, "fieldName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldNameUndefined: Self = StObject.set(x, "fieldName", js.undefined)
      
      @scala.inline
      def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatString(value: String): Self = StObject.set(x, "formatString", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatStringUndefined: Self = StObject.set(x, "formatString", js.undefined)
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setFormula(value: String): Self = StObject.set(x, "formula", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormulaUndefined: Self = StObject.set(x, "formula", js.undefined)
      
      @scala.inline
      def setIsCalculatedField(value: Boolean): Self = StObject.set(x, "isCalculatedField", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsCalculatedFieldUndefined: Self = StObject.set(x, "isCalculatedField", js.undefined)
      
      @scala.inline
      def setMeasures(value: js.Array[DataSourceValuesMeasure]): Self = StObject.set(x, "measures", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMeasuresUndefined: Self = StObject.set(x, "measures", js.undefined)
      
      @scala.inline
      def setMeasuresVarargs(value: DataSourceValuesMeasure*): Self = StObject.set(x, "measures", js.Array(value :_*))
      
      @scala.inline
      def setSummaryType(value: SummaryType | String): Self = StObject.set(x, "summaryType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSummaryTypeUndefined: Self = StObject.set(x, "summaryType", js.undefined)
    }
  }
  
  @js.native
  trait DataSourceValuesMeasure extends StObject {
    
    /** Allows you to bind the measure from the OLAP datasource by using its unique name as field name.
      */
    var fieldName: js.UndefOr[String] = js.native
  }
  object DataSourceValuesMeasure {
    
    @scala.inline
    def apply(): DataSourceValuesMeasure = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DataSourceValuesMeasure]
    }
    
    @scala.inline
    implicit class DataSourceValuesMeasureMutableBuilder[Self <: DataSourceValuesMeasure] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFieldName(value: String): Self = StObject.set(x, "fieldName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldNameUndefined: Self = StObject.set(x, "fieldName", js.undefined)
    }
  }
  
  @js.native
  trait DrillSuccessEventArgs extends StObject {
    
    /** returns the HTML element of the control.
      */
    var args: js.UndefOr[js.Any] = js.native
  }
  object DrillSuccessEventArgs {
    
    @scala.inline
    def apply(): DrillSuccessEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DrillSuccessEventArgs]
    }
    
    @scala.inline
    implicit class DrillSuccessEventArgsMutableBuilder[Self <: DrillSuccessEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArgs(value: js.Any): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
    }
  }
  
  @js.native
  trait DrillThroughEventArgs extends StObject {
    
    /** return the JSON records of the generated cells on drill-through operation.
      */
    var data: js.UndefOr[js.Any] = js.native
    
    /** returns the HTML element of PivotGrid control.
      */
    var element: js.UndefOr[js.Any] = js.native
  }
  object DrillThroughEventArgs {
    
    @scala.inline
    def apply(): DrillThroughEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DrillThroughEventArgs]
    }
    
    @scala.inline
    implicit class DrillThroughEventArgsMutableBuilder[Self <: DrillThroughEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setElement(value: js.Any): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    }
  }
  
  @js.native
  trait FrozenHeaderSettings extends StObject {
    
    /** Allows you to freeze the column headers alone when scrolling the vertical scroll bar.
      * @Default {false}
      */
    var enableFrozenColumnHeaders: js.UndefOr[Boolean] = js.native
    
    /** Allows you to freeze both row headers and column headers while scrolling.
      * @Default {false}
      */
    var enableFrozenHeaders: js.UndefOr[Boolean] = js.native
    
    /** Allows you to freeze the row headers alone when scrolling the horizontal scroll bar.
      * @Default {false}
      */
    var enableFrozenRowHeaders: js.UndefOr[Boolean] = js.native
    
    /** Allows you to set the size of the scrollbar (horizontal and vertical) that is visible in the PivotGrid.
      * @Default {18}
      */
    var scrollerSize: js.UndefOr[Double] = js.native
  }
  object FrozenHeaderSettings {
    
    @scala.inline
    def apply(): FrozenHeaderSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FrozenHeaderSettings]
    }
    
    @scala.inline
    implicit class FrozenHeaderSettingsMutableBuilder[Self <: FrozenHeaderSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnableFrozenColumnHeaders(value: Boolean): Self = StObject.set(x, "enableFrozenColumnHeaders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableFrozenColumnHeadersUndefined: Self = StObject.set(x, "enableFrozenColumnHeaders", js.undefined)
      
      @scala.inline
      def setEnableFrozenHeaders(value: Boolean): Self = StObject.set(x, "enableFrozenHeaders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableFrozenHeadersUndefined: Self = StObject.set(x, "enableFrozenHeaders", js.undefined)
      
      @scala.inline
      def setEnableFrozenRowHeaders(value: Boolean): Self = StObject.set(x, "enableFrozenRowHeaders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableFrozenRowHeadersUndefined: Self = StObject.set(x, "enableFrozenRowHeaders", js.undefined)
      
      @scala.inline
      def setScrollerSize(value: Double): Self = StObject.set(x, "scrollerSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollerSizeUndefined: Self = StObject.set(x, "scrollerSize", js.undefined)
    }
  }
  
  @js.native
  trait HeaderSettings extends StObject {
    
    /** Allows you to enable/disable the column header names in the PivotGrid control.
      * @Default {false}
      */
    var showColumnItems: js.UndefOr[Boolean] = js.native
    
    /** Allows you to enable/disable the row header names in the PivotGrid control.
      * @Default {false}
      */
    var showRowItems: js.UndefOr[Boolean] = js.native
  }
  object HeaderSettings {
    
    @scala.inline
    def apply(): HeaderSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HeaderSettings]
    }
    
    @scala.inline
    implicit class HeaderSettingsMutableBuilder[Self <: HeaderSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setShowColumnItems(value: Boolean): Self = StObject.set(x, "showColumnItems", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowColumnItemsUndefined: Self = StObject.set(x, "showColumnItems", js.undefined)
      
      @scala.inline
      def setShowRowItems(value: Boolean): Self = StObject.set(x, "showRowItems", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowRowItemsUndefined: Self = StObject.set(x, "showRowItems", js.undefined)
    }
  }
  
  @js.native
  trait HyperlinkSettings extends StObject {
    
    /** Allows you to enable/disable the hyperlink for the column header.
      * @Default {false}
      */
    var enableColumnHeaderHyperlink: js.UndefOr[Boolean] = js.native
    
    /** Allows you to enable/disable the hyperlink for the row header.
      * @Default {false}
      */
    var enableRowHeaderHyperlink: js.UndefOr[Boolean] = js.native
    
    /** Allows you to enable/disable the hyperlink for summary cells.
      * @Default {false}
      */
    var enableSummaryCellHyperlink: js.UndefOr[Boolean] = js.native
    
    /** Allows you to enable/disable the hyperlink for value cells.
      * @Default {false}
      */
    var enableValueCellHyperlink: js.UndefOr[Boolean] = js.native
  }
  object HyperlinkSettings {
    
    @scala.inline
    def apply(): HyperlinkSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HyperlinkSettings]
    }
    
    @scala.inline
    implicit class HyperlinkSettingsMutableBuilder[Self <: HyperlinkSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnableColumnHeaderHyperlink(value: Boolean): Self = StObject.set(x, "enableColumnHeaderHyperlink", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableColumnHeaderHyperlinkUndefined: Self = StObject.set(x, "enableColumnHeaderHyperlink", js.undefined)
      
      @scala.inline
      def setEnableRowHeaderHyperlink(value: Boolean): Self = StObject.set(x, "enableRowHeaderHyperlink", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableRowHeaderHyperlinkUndefined: Self = StObject.set(x, "enableRowHeaderHyperlink", js.undefined)
      
      @scala.inline
      def setEnableSummaryCellHyperlink(value: Boolean): Self = StObject.set(x, "enableSummaryCellHyperlink", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableSummaryCellHyperlinkUndefined: Self = StObject.set(x, "enableSummaryCellHyperlink", js.undefined)
      
      @scala.inline
      def setEnableValueCellHyperlink(value: Boolean): Self = StObject.set(x, "enableValueCellHyperlink", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableValueCellHyperlinkUndefined: Self = StObject.set(x, "enableValueCellHyperlink", js.undefined)
    }
  }
  
  @js.native
  trait LoadEventArgs extends StObject {
    
    /** returns the custom object bound with the control.
      */
    var customObject: js.UndefOr[js.Any] = js.native
    
    /** returns the HTML element of PivotGrid control.
      */
    var element: js.UndefOr[js.Any] = js.native
  }
  object LoadEventArgs {
    
    @scala.inline
    def apply(): LoadEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LoadEventArgs]
    }
    
    @scala.inline
    implicit class LoadEventArgsMutableBuilder[Self <: LoadEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCustomObject(value: js.Any): Self = StObject.set(x, "customObject", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomObjectUndefined: Self = StObject.set(x, "customObject", js.undefined)
      
      @scala.inline
      def setElement(value: js.Any): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    }
  }
  
  @js.native
  trait LoadReportEventArgs extends StObject {
    
    /** returns whether the control is bound with OLAP or Relational data source.
      */
    var dataModel: js.UndefOr[String] = js.native
    
    /** returns the PivotGrid object.
      */
    var targetControl: js.UndefOr[js.Any] = js.native
  }
  object LoadReportEventArgs {
    
    @scala.inline
    def apply(): LoadReportEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LoadReportEventArgs]
    }
    
    @scala.inline
    implicit class LoadReportEventArgsMutableBuilder[Self <: LoadReportEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDataModel(value: String): Self = StObject.set(x, "dataModel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataModelUndefined: Self = StObject.set(x, "dataModel", js.undefined)
      
      @scala.inline
      def setTargetControl(value: js.Any): Self = StObject.set(x, "targetControl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetControlUndefined: Self = StObject.set(x, "targetControl", js.undefined)
    }
  }
  
  @js.native
  trait Model extends StObject {
    
    /** Triggers when it reaches client-side after the AJAX request.
      */
    var afterServiceInvoke: js.UndefOr[js.Function1[/* e */ AfterServiceInvokeEventArgs, Unit]] = js.native
    
    /** Sets the mode for the PivotGrid widget to bind either OLAP or relational data source.
      * @Default {ej.Pivot.AnalysisMode.Pivot}
      */
    var analysisMode: js.UndefOr[AnalysisMode | String] = js.native
    
    /** Triggers before performing exporting in the pivot grid.
      */
    var beforeExport: js.UndefOr[js.Function1[/* e */ BeforeExportEventArgs, Unit]] = js.native
    
    /** Triggers before the pivot engine starts to populate.
      */
    var beforePivotEnginePopulate: js.UndefOr[js.Function1[/* e */ BeforePivotEnginePopulateEventArgs, Unit]] = js.native
    
    /** Triggers before any AJAX request is passed from the PivotGrid to service methods.
      */
    var beforeServiceInvoke: js.UndefOr[js.Function1[/* e */ BeforeServiceInvokeEventArgs, Unit]] = js.native
    
    /** Triggers when click action is performed over a value cell.
      */
    var cellClick: js.UndefOr[js.Function1[/* e */ CellClickEventArgs, Unit]] = js.native
    
    /** Triggers when right-click action is performed on a cell.
      */
    var cellContext: js.UndefOr[js.Function1[/* e */ CellContextEventArgs, Unit]] = js.native
    
    /** Triggers when double-click action is performed over a value cell.
      */
    var cellDoubleClick: js.UndefOr[js.Function1[/* e */ CellDoubleClickEventArgs, Unit]] = js.native
    
    /** Triggers before editing the cells.
      */
    var cellEdit: js.UndefOr[js.Function1[/* e */ CellEditEventArgs, Unit]] = js.native
    
    /** Triggers when a specific range of value cells is selected.
      */
    var cellSelection: js.UndefOr[js.Function1[/* e */ CellSelectionEventArgs, Unit]] = js.native
    
    /** Allows you to collapse specified members in each field by default.
      * @Default {null}
      */
    var collapsedMembers: js.UndefOr[js.Any] = js.native
    
    /** Triggers when the hyperlink of column header is clicked.
      */
    var columnHeaderHyperlinkClick: js.UndefOr[js.Function1[/* e */ ColumnHeaderHyperlinkClickEventArgs, Unit]] = js.native
    
    /** Specifies the CSS class to the PivotGrid for achieving the custom theme.
      * @Default {â€œâ€}
      */
    var cssClass: js.UndefOr[String] = js.native
    
    /** Object is utilized to pass additional information between the client-end and the service-end while operating the control in server mode.
      * @Default {null}
      */
    var customObject: js.UndefOr[js.Any] = js.native
    
    /** Initializes the data source for the PivotGrid widget, when it functions completely on client-side.
      * @Default {{}}
      */
    var dataSource: js.UndefOr[DataSource] = js.native
    
    /** Triggers after performing drill operation in the PivotGrid.
      */
    var drillSuccess: js.UndefOr[js.Function1[/* e */ DrillSuccessEventArgs, Unit]] = js.native
    
    /** Triggers while clicking &quot;OK&quot; in the drill-through dialog.
      */
    var drillThrough: js.UndefOr[js.Function1[/* e */ DrillThroughEventArgs, Unit]] = js.native
    
    /** Enables the advanced filtering options such as value filtering, label filtering, and sorting for each field in the server mode.
      * @Default {false}
      */
    var enableAdvancedFilter: js.UndefOr[Boolean] = js.native
    
    /** Allows you to get cell details in JSON format by clicking the value cell.
      * @Default {false}
      */
    var enableCellClick: js.UndefOr[Boolean] = js.native
    
    /** Allows you to access each cell by right-clicking the mouse.
      * @Default {false}
      */
    var enableCellContext: js.UndefOr[Boolean] = js.native
    
    /** Allows you to get cell details in JSON format by double-clicking the value cell.
      * @Default {false}
      */
    var enableCellDoubleClick: js.UndefOr[Boolean] = js.native
    
    /** Allows you to edit value cells for write-back support in the PivotGrid. This is applicable only for the server-mode.
      * @Default {false}
      */
    var enableCellEditing: js.UndefOr[Boolean] = js.native
    
    /** Enables the cell selection for a specific range of value cells.
      * @Default {false}
      */
    var enableCellSelection: js.UndefOr[Boolean] = js.native
    
    /** Collapses the pivot items along rows and columns by default. It works only for the relational data source.
      * @Default {false}
      */
    var enableCollapseByDefault: js.UndefOr[Boolean] = js.native
    
    /** Enables/disables the display of grand total for all columns.
      * @Default {true}
      */
    var enableColumnGrandTotal: js.UndefOr[Boolean] = js.native
    
    /** Allows you to adjust the width of columns dynamically within given widget size.
      * @Default {false}
      */
    var enableColumnResizing: js.UndefOr[Boolean] = js.native
    
    /** Allows you to export entire data instead of current page data, while paging option is enabled.
      * @Default {false}
      */
    var enableCompleteDataExport: js.UndefOr[Boolean] = js.native
    
    /** Allows you to format a specific set of cells based on the condition.
      * @Default {false}
      */
    var enableConditionalFormatting: js.UndefOr[Boolean] = js.native
    
    /** Allows you to enable/disable the context menu of pivot buttons in the PivotGrid.
      * @Default {false}
      */
    var enableContextMenu: js.UndefOr[Boolean] = js.native
    
    /** Allows you to refresh the control on-demand and not during every UI operation.
      * @Default {false}
      */
    var enableDeferUpdate: js.UndefOr[Boolean] = js.native
    
    /** Enables the Drill-Through feature which retrieves raw items that are used to create a specific cell in the PivotGrid.
      * @Default {false}
      */
    var enableDrillThrough: js.UndefOr[Boolean] = js.native
    
    /** Enables/disables the display of grand total for rows and columns.
      * @Default {true}
      */
    var enableGrandTotal: js.UndefOr[Boolean] = js.native
    
    /** Enables the display of GroupingBar allowing you to filter, sort, and remove fields obtained from the datasource.
      * @Default {false}
      */
    var enableGroupingBar: js.UndefOr[Boolean] = js.native
    
    /** Allows you to load the PivotGrid using the JSON data.
      * @Default {false}
      */
    var enableJSONRendering: js.UndefOr[Boolean] = js.native
    
    /** Enables/disables paging in the member editor for viewing the large count of members in pages.
      * @Default {false}
      */
    var enableMemberEditorPaging: js.UndefOr[Boolean] = js.native
    
    /** Enables/Disables sorting option in member editor dialog for the members of the respective field.
      * @Default {false}
      */
    var enableMemberEditorSorting: js.UndefOr[Boolean] = js.native
    
    /** Allows you to view the large amount of data by applying paging.
      * @Default {false}
      */
    var enablePaging: js.UndefOr[Boolean] = js.native
    
    /** Enables rendering of the PivotGrid widget along with the PivotTable field list which allows UI operations.
      * @Default {true}
      */
    var enablePivotFieldList: js.UndefOr[Boolean] = js.native
    
    /** Allows you to view the layout of PivotGrid from right to left.
      * @Default {false}
      */
    var enableRTL: js.UndefOr[Boolean] = js.native
    
    /** Enables the display of grand total for all rows.
      * @Default {true}
      */
    var enableRowGrandTotal: js.UndefOr[Boolean] = js.native
    
    /** Allows you to enable the ToolTip.
      * @Default {false}
      */
    var enableToolTip: js.UndefOr[Boolean] = js.native
    
    /** Allows you to enable the animation effects in the tooltip.
      * @Default {false}
      */
    var enableToolTipAnimation: js.UndefOr[Boolean] = js.native
    
    /** Allows you to view the large amount of data through virtual scrolling.
      * @Default {false}
      */
    var enableVirtualScrolling: js.UndefOr[Boolean] = js.native
    
    /** Allows you to enable &quot;withCredentials&quot; property inside XMLHttpRequest object for CORS(Cross-Origin Resource Sharing) request.
      * @Default {false}
      */
    var enableXHRCredentials: js.UndefOr[Boolean] = js.native
    
    /** Object that holds the settings of frozen headers.
      * @Default {{}}
      */
    var frozenHeaderSettings: js.UndefOr[FrozenHeaderSettings] = js.native
    
    /** Allows you to display the header name in the PivotGrid control.
      * @Default {{}}
      */
    var headerSettings: js.UndefOr[HeaderSettings] = js.native
    
    /** Allows you to configure the hyperlink settings of the PivotGrid control.
      * @Default {{}}
      */
    var hyperlinkSettings: js.UndefOr[HyperlinkSettings] = js.native
    
    /** Allows you to enable PivotGridâ€™s responsiveness in the browser layout.
      * @Default {false}
      */
    var isResponsive: js.UndefOr[Boolean] = js.native
    
    /** Contains the serialized JSON string which renders the PivotGrid.
      */
    var jsonRecords: js.UndefOr[String] = js.native
    
    /** Sets the summary layout for PivotGrid.Following are the ways in which summary can be positioned: normal summary (bottom), top summary, no summary, and excel-like summary.
      * @Default {ej.PivotGrid.Layout.Normal}
      */
    var layout: js.UndefOr[Layout | String] = js.native
    
    /** Triggers when the PivotGrid loading is initiated.
      */
    var load: js.UndefOr[js.Function1[/* e */ LoadEventArgs, Unit]] = js.native
    
    /** Triggers before loading a report from the database.
      */
    var loadReport: js.UndefOr[js.Function1[/* e */ LoadReportEventArgs, Unit]] = js.native
    
    /** Allows the user to set the localized language for the widget.
      * @Default {en-US}
      */
    var locale: js.UndefOr[String] = js.native
    
    /** Allows you to set the maximum number of nodes as well as child nodes to be displayed in the member editor.
      * @Default {1000}
      */
    var maxNodeLimitInMemberEditor: js.UndefOr[Double] = js.native
    
    /** Allows you to set the number of members to be displayed in each page of member editor on applying paging in it.
      * @Default {100}
      */
    var memberEditorPageSize: js.UndefOr[Double] = js.native
    
    /** Sets the mode for PivotGrid widget for binding the data source either in the server-side or client-side.
      * @Default {ej.Pivot.OperationalMode.ClientMode}
      */
    var operationalMode: js.UndefOr[OperationalMode | String] = js.native
    
    /** Connects the PivotSchemaDesigner with specified ID to the PivotGrid control.
      * @Default {â€œâ€}
      */
    var pivotTableFieldListID: js.UndefOr[String] = js.native
    
    /** Triggers when PivotGrid widget completes all operations at client-side after any AJAX request.
      */
    var renderComplete: js.UndefOr[js.Function1[/* e */ RenderCompleteEventArgs, Unit]] = js.native
    
    /** Triggers when any error occurred during the AJAX request.
      */
    var renderFailure: js.UndefOr[js.Function1[/* e */ RenderFailureEventArgs, Unit]] = js.native
    
    /** Triggers when the PivotGrid successfully reaches the client-side after any AJAX request.
      */
    var renderSuccess: js.UndefOr[js.Function1[/* e */ RenderSuccessEventArgs, Unit]] = js.native
    
    /** Allows you to fit the width of the column based on its maximum text width.
      * @Default {true}
      */
    var resizeColumnsToFit: js.UndefOr[Boolean] = js.native
    
    /** Triggers when the hyperlink of row header is clicked.
      */
    var rowHeaderHyperlinkClick: js.UndefOr[js.Function1[/* e */ RowHeaderHyperlinkClickEventArgs, Unit]] = js.native
    
    /** Triggers before saving the current report to the database.
      */
    var saveReport: js.UndefOr[js.Function1[/* e */ SaveReportEventArgs, Unit]] = js.native
    
    /** Allows you to set the custom name for the methods at service-end, communicated during AJAX post.
      * @Default {{}}
      */
    var serviceMethodSettings: js.UndefOr[ServiceMethodSettings] = js.native
    
    /** Allows you to show the appropriate unique name in the pivot button.
      * @Default {false}
      */
    var showUniqueNameOnPivotButton: js.UndefOr[Boolean] = js.native
    
    /** Triggers when the hyperlink of summary cell is clicked.
      */
    var summaryCellHyperlinkClick: js.UndefOr[js.Function1[/* e */ SummaryCellHyperlinkClickEventArgs, Unit]] = js.native
    
    /** Connects the service using the specified URL for any server updates.
      * @Default {â€œâ€}
      */
    var url: js.UndefOr[String] = js.native
    
    /** Triggers when the hyperlink of value cell is clicked.
      */
    var valueCellHyperlinkClick: js.UndefOr[js.Function1[/* e */ ValueCellHyperlinkClickEventArgs, Unit]] = js.native
    
    /** Holds the necessary properties for value sorting.
      * @Default {{}}
      */
    var valueSortSettings: js.UndefOr[ValueSortSettings] = js.native
  }
  object Model {
    
    @scala.inline
    def apply(): typingsSlinky.ejWebAll.ej.PivotGrid.Model = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsSlinky.ejWebAll.ej.PivotGrid.Model]
    }
    
    @scala.inline
    implicit class ModelMutableBuilder[Self <: typingsSlinky.ejWebAll.ej.PivotGrid.Model] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAfterServiceInvoke(value: /* e */ AfterServiceInvokeEventArgs => Unit): Self = StObject.set(x, "afterServiceInvoke", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAfterServiceInvokeUndefined: Self = StObject.set(x, "afterServiceInvoke", js.undefined)
      
      @scala.inline
      def setAnalysisMode(value: AnalysisMode | String): Self = StObject.set(x, "analysisMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnalysisModeUndefined: Self = StObject.set(x, "analysisMode", js.undefined)
      
      @scala.inline
      def setBeforeExport(value: /* e */ BeforeExportEventArgs => Unit): Self = StObject.set(x, "beforeExport", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBeforeExportUndefined: Self = StObject.set(x, "beforeExport", js.undefined)
      
      @scala.inline
      def setBeforePivotEnginePopulate(value: /* e */ BeforePivotEnginePopulateEventArgs => Unit): Self = StObject.set(x, "beforePivotEnginePopulate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBeforePivotEnginePopulateUndefined: Self = StObject.set(x, "beforePivotEnginePopulate", js.undefined)
      
      @scala.inline
      def setBeforeServiceInvoke(value: /* e */ BeforeServiceInvokeEventArgs => Unit): Self = StObject.set(x, "beforeServiceInvoke", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBeforeServiceInvokeUndefined: Self = StObject.set(x, "beforeServiceInvoke", js.undefined)
      
      @scala.inline
      def setCellClick(value: /* e */ CellClickEventArgs => Unit): Self = StObject.set(x, "cellClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCellClickUndefined: Self = StObject.set(x, "cellClick", js.undefined)
      
      @scala.inline
      def setCellContext(value: /* e */ CellContextEventArgs => Unit): Self = StObject.set(x, "cellContext", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCellContextUndefined: Self = StObject.set(x, "cellContext", js.undefined)
      
      @scala.inline
      def setCellDoubleClick(value: /* e */ CellDoubleClickEventArgs => Unit): Self = StObject.set(x, "cellDoubleClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCellDoubleClickUndefined: Self = StObject.set(x, "cellDoubleClick", js.undefined)
      
      @scala.inline
      def setCellEdit(value: /* e */ CellEditEventArgs => Unit): Self = StObject.set(x, "cellEdit", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCellEditUndefined: Self = StObject.set(x, "cellEdit", js.undefined)
      
      @scala.inline
      def setCellSelection(value: /* e */ CellSelectionEventArgs => Unit): Self = StObject.set(x, "cellSelection", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCellSelectionUndefined: Self = StObject.set(x, "cellSelection", js.undefined)
      
      @scala.inline
      def setCollapsedMembers(value: js.Any): Self = StObject.set(x, "collapsedMembers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCollapsedMembersUndefined: Self = StObject.set(x, "collapsedMembers", js.undefined)
      
      @scala.inline
      def setColumnHeaderHyperlinkClick(value: /* e */ ColumnHeaderHyperlinkClickEventArgs => Unit): Self = StObject.set(x, "columnHeaderHyperlinkClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setColumnHeaderHyperlinkClickUndefined: Self = StObject.set(x, "columnHeaderHyperlinkClick", js.undefined)
      
      @scala.inline
      def setCssClass(value: String): Self = StObject.set(x, "cssClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCssClassUndefined: Self = StObject.set(x, "cssClass", js.undefined)
      
      @scala.inline
      def setCustomObject(value: js.Any): Self = StObject.set(x, "customObject", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomObjectUndefined: Self = StObject.set(x, "customObject", js.undefined)
      
      @scala.inline
      def setDataSource(value: DataSource): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
      
      @scala.inline
      def setDrillSuccess(value: /* e */ DrillSuccessEventArgs => Unit): Self = StObject.set(x, "drillSuccess", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDrillSuccessUndefined: Self = StObject.set(x, "drillSuccess", js.undefined)
      
      @scala.inline
      def setDrillThrough(value: /* e */ DrillThroughEventArgs => Unit): Self = StObject.set(x, "drillThrough", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDrillThroughUndefined: Self = StObject.set(x, "drillThrough", js.undefined)
      
      @scala.inline
      def setEnableAdvancedFilter(value: Boolean): Self = StObject.set(x, "enableAdvancedFilter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableAdvancedFilterUndefined: Self = StObject.set(x, "enableAdvancedFilter", js.undefined)
      
      @scala.inline
      def setEnableCellClick(value: Boolean): Self = StObject.set(x, "enableCellClick", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableCellClickUndefined: Self = StObject.set(x, "enableCellClick", js.undefined)
      
      @scala.inline
      def setEnableCellContext(value: Boolean): Self = StObject.set(x, "enableCellContext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableCellContextUndefined: Self = StObject.set(x, "enableCellContext", js.undefined)
      
      @scala.inline
      def setEnableCellDoubleClick(value: Boolean): Self = StObject.set(x, "enableCellDoubleClick", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableCellDoubleClickUndefined: Self = StObject.set(x, "enableCellDoubleClick", js.undefined)
      
      @scala.inline
      def setEnableCellEditing(value: Boolean): Self = StObject.set(x, "enableCellEditing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableCellEditingUndefined: Self = StObject.set(x, "enableCellEditing", js.undefined)
      
      @scala.inline
      def setEnableCellSelection(value: Boolean): Self = StObject.set(x, "enableCellSelection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableCellSelectionUndefined: Self = StObject.set(x, "enableCellSelection", js.undefined)
      
      @scala.inline
      def setEnableCollapseByDefault(value: Boolean): Self = StObject.set(x, "enableCollapseByDefault", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableCollapseByDefaultUndefined: Self = StObject.set(x, "enableCollapseByDefault", js.undefined)
      
      @scala.inline
      def setEnableColumnGrandTotal(value: Boolean): Self = StObject.set(x, "enableColumnGrandTotal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableColumnGrandTotalUndefined: Self = StObject.set(x, "enableColumnGrandTotal", js.undefined)
      
      @scala.inline
      def setEnableColumnResizing(value: Boolean): Self = StObject.set(x, "enableColumnResizing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableColumnResizingUndefined: Self = StObject.set(x, "enableColumnResizing", js.undefined)
      
      @scala.inline
      def setEnableCompleteDataExport(value: Boolean): Self = StObject.set(x, "enableCompleteDataExport", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableCompleteDataExportUndefined: Self = StObject.set(x, "enableCompleteDataExport", js.undefined)
      
      @scala.inline
      def setEnableConditionalFormatting(value: Boolean): Self = StObject.set(x, "enableConditionalFormatting", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableConditionalFormattingUndefined: Self = StObject.set(x, "enableConditionalFormatting", js.undefined)
      
      @scala.inline
      def setEnableContextMenu(value: Boolean): Self = StObject.set(x, "enableContextMenu", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableContextMenuUndefined: Self = StObject.set(x, "enableContextMenu", js.undefined)
      
      @scala.inline
      def setEnableDeferUpdate(value: Boolean): Self = StObject.set(x, "enableDeferUpdate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableDeferUpdateUndefined: Self = StObject.set(x, "enableDeferUpdate", js.undefined)
      
      @scala.inline
      def setEnableDrillThrough(value: Boolean): Self = StObject.set(x, "enableDrillThrough", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableDrillThroughUndefined: Self = StObject.set(x, "enableDrillThrough", js.undefined)
      
      @scala.inline
      def setEnableGrandTotal(value: Boolean): Self = StObject.set(x, "enableGrandTotal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableGrandTotalUndefined: Self = StObject.set(x, "enableGrandTotal", js.undefined)
      
      @scala.inline
      def setEnableGroupingBar(value: Boolean): Self = StObject.set(x, "enableGroupingBar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableGroupingBarUndefined: Self = StObject.set(x, "enableGroupingBar", js.undefined)
      
      @scala.inline
      def setEnableJSONRendering(value: Boolean): Self = StObject.set(x, "enableJSONRendering", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableJSONRenderingUndefined: Self = StObject.set(x, "enableJSONRendering", js.undefined)
      
      @scala.inline
      def setEnableMemberEditorPaging(value: Boolean): Self = StObject.set(x, "enableMemberEditorPaging", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableMemberEditorPagingUndefined: Self = StObject.set(x, "enableMemberEditorPaging", js.undefined)
      
      @scala.inline
      def setEnableMemberEditorSorting(value: Boolean): Self = StObject.set(x, "enableMemberEditorSorting", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableMemberEditorSortingUndefined: Self = StObject.set(x, "enableMemberEditorSorting", js.undefined)
      
      @scala.inline
      def setEnablePaging(value: Boolean): Self = StObject.set(x, "enablePaging", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnablePagingUndefined: Self = StObject.set(x, "enablePaging", js.undefined)
      
      @scala.inline
      def setEnablePivotFieldList(value: Boolean): Self = StObject.set(x, "enablePivotFieldList", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnablePivotFieldListUndefined: Self = StObject.set(x, "enablePivotFieldList", js.undefined)
      
      @scala.inline
      def setEnableRTL(value: Boolean): Self = StObject.set(x, "enableRTL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableRTLUndefined: Self = StObject.set(x, "enableRTL", js.undefined)
      
      @scala.inline
      def setEnableRowGrandTotal(value: Boolean): Self = StObject.set(x, "enableRowGrandTotal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableRowGrandTotalUndefined: Self = StObject.set(x, "enableRowGrandTotal", js.undefined)
      
      @scala.inline
      def setEnableToolTip(value: Boolean): Self = StObject.set(x, "enableToolTip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableToolTipAnimation(value: Boolean): Self = StObject.set(x, "enableToolTipAnimation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableToolTipAnimationUndefined: Self = StObject.set(x, "enableToolTipAnimation", js.undefined)
      
      @scala.inline
      def setEnableToolTipUndefined: Self = StObject.set(x, "enableToolTip", js.undefined)
      
      @scala.inline
      def setEnableVirtualScrolling(value: Boolean): Self = StObject.set(x, "enableVirtualScrolling", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableVirtualScrollingUndefined: Self = StObject.set(x, "enableVirtualScrolling", js.undefined)
      
      @scala.inline
      def setEnableXHRCredentials(value: Boolean): Self = StObject.set(x, "enableXHRCredentials", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableXHRCredentialsUndefined: Self = StObject.set(x, "enableXHRCredentials", js.undefined)
      
      @scala.inline
      def setFrozenHeaderSettings(value: FrozenHeaderSettings): Self = StObject.set(x, "frozenHeaderSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFrozenHeaderSettingsUndefined: Self = StObject.set(x, "frozenHeaderSettings", js.undefined)
      
      @scala.inline
      def setHeaderSettings(value: HeaderSettings): Self = StObject.set(x, "headerSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderSettingsUndefined: Self = StObject.set(x, "headerSettings", js.undefined)
      
      @scala.inline
      def setHyperlinkSettings(value: HyperlinkSettings): Self = StObject.set(x, "hyperlinkSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHyperlinkSettingsUndefined: Self = StObject.set(x, "hyperlinkSettings", js.undefined)
      
      @scala.inline
      def setIsResponsive(value: Boolean): Self = StObject.set(x, "isResponsive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsResponsiveUndefined: Self = StObject.set(x, "isResponsive", js.undefined)
      
      @scala.inline
      def setJsonRecords(value: String): Self = StObject.set(x, "jsonRecords", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJsonRecordsUndefined: Self = StObject.set(x, "jsonRecords", js.undefined)
      
      @scala.inline
      def setLayout(value: Layout | String): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
      
      @scala.inline
      def setLoad(value: /* e */ LoadEventArgs => Unit): Self = StObject.set(x, "load", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLoadReport(value: /* e */ LoadReportEventArgs => Unit): Self = StObject.set(x, "loadReport", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLoadReportUndefined: Self = StObject.set(x, "loadReport", js.undefined)
      
      @scala.inline
      def setLoadUndefined: Self = StObject.set(x, "load", js.undefined)
      
      @scala.inline
      def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      @scala.inline
      def setMaxNodeLimitInMemberEditor(value: Double): Self = StObject.set(x, "maxNodeLimitInMemberEditor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxNodeLimitInMemberEditorUndefined: Self = StObject.set(x, "maxNodeLimitInMemberEditor", js.undefined)
      
      @scala.inline
      def setMemberEditorPageSize(value: Double): Self = StObject.set(x, "memberEditorPageSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMemberEditorPageSizeUndefined: Self = StObject.set(x, "memberEditorPageSize", js.undefined)
      
      @scala.inline
      def setOperationalMode(value: OperationalMode | String): Self = StObject.set(x, "operationalMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOperationalModeUndefined: Self = StObject.set(x, "operationalMode", js.undefined)
      
      @scala.inline
      def setPivotTableFieldListID(value: String): Self = StObject.set(x, "pivotTableFieldListID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPivotTableFieldListIDUndefined: Self = StObject.set(x, "pivotTableFieldListID", js.undefined)
      
      @scala.inline
      def setRenderComplete(value: /* e */ RenderCompleteEventArgs => Unit): Self = StObject.set(x, "renderComplete", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRenderCompleteUndefined: Self = StObject.set(x, "renderComplete", js.undefined)
      
      @scala.inline
      def setRenderFailure(value: /* e */ RenderFailureEventArgs => Unit): Self = StObject.set(x, "renderFailure", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRenderFailureUndefined: Self = StObject.set(x, "renderFailure", js.undefined)
      
      @scala.inline
      def setRenderSuccess(value: /* e */ RenderSuccessEventArgs => Unit): Self = StObject.set(x, "renderSuccess", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRenderSuccessUndefined: Self = StObject.set(x, "renderSuccess", js.undefined)
      
      @scala.inline
      def setResizeColumnsToFit(value: Boolean): Self = StObject.set(x, "resizeColumnsToFit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResizeColumnsToFitUndefined: Self = StObject.set(x, "resizeColumnsToFit", js.undefined)
      
      @scala.inline
      def setRowHeaderHyperlinkClick(value: /* e */ RowHeaderHyperlinkClickEventArgs => Unit): Self = StObject.set(x, "rowHeaderHyperlinkClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRowHeaderHyperlinkClickUndefined: Self = StObject.set(x, "rowHeaderHyperlinkClick", js.undefined)
      
      @scala.inline
      def setSaveReport(value: /* e */ SaveReportEventArgs => Unit): Self = StObject.set(x, "saveReport", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSaveReportUndefined: Self = StObject.set(x, "saveReport", js.undefined)
      
      @scala.inline
      def setServiceMethodSettings(value: ServiceMethodSettings): Self = StObject.set(x, "serviceMethodSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServiceMethodSettingsUndefined: Self = StObject.set(x, "serviceMethodSettings", js.undefined)
      
      @scala.inline
      def setShowUniqueNameOnPivotButton(value: Boolean): Self = StObject.set(x, "showUniqueNameOnPivotButton", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowUniqueNameOnPivotButtonUndefined: Self = StObject.set(x, "showUniqueNameOnPivotButton", js.undefined)
      
      @scala.inline
      def setSummaryCellHyperlinkClick(value: /* e */ SummaryCellHyperlinkClickEventArgs => Unit): Self = StObject.set(x, "summaryCellHyperlinkClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSummaryCellHyperlinkClickUndefined: Self = StObject.set(x, "summaryCellHyperlinkClick", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      
      @scala.inline
      def setValueCellHyperlinkClick(value: /* e */ ValueCellHyperlinkClickEventArgs => Unit): Self = StObject.set(x, "valueCellHyperlinkClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setValueCellHyperlinkClickUndefined: Self = StObject.set(x, "valueCellHyperlinkClick", js.undefined)
      
      @scala.inline
      def setValueSortSettings(value: ValueSortSettings): Self = StObject.set(x, "valueSortSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueSortSettingsUndefined: Self = StObject.set(x, "valueSortSettings", js.undefined)
    }
  }
  
  @js.native
  trait RenderCompleteEventArgs extends StObject {
    
    /** returns the current action of PivotGrid control.
      */
    var action: js.UndefOr[String] = js.native
    
    /** returns the custom object bound with the control.
      */
    var customObject: js.UndefOr[js.Any] = js.native
    
    /** returns the HTML element of PivotGrid control.
      */
    var element: js.UndefOr[js.Any] = js.native
  }
  object RenderCompleteEventArgs {
    
    @scala.inline
    def apply(): RenderCompleteEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RenderCompleteEventArgs]
    }
    
    @scala.inline
    implicit class RenderCompleteEventArgsMutableBuilder[Self <: RenderCompleteEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      @scala.inline
      def setCustomObject(value: js.Any): Self = StObject.set(x, "customObject", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomObjectUndefined: Self = StObject.set(x, "customObject", js.undefined)
      
      @scala.inline
      def setElement(value: js.Any): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    }
  }
  
  @js.native
  trait RenderFailureEventArgs extends StObject {
    
    /** returns the current action of PivotGrid control.
      */
    var action: js.UndefOr[String] = js.native
    
    /** returns the custom object bound with the control.
      */
    var customObject: js.UndefOr[js.Any] = js.native
    
    /** returns the HTML element of PivotGrid control.
      */
    var element: js.UndefOr[js.Any] = js.native
    
    /** returns the error message with error code.
      */
    var message: js.UndefOr[String] = js.native
  }
  object RenderFailureEventArgs {
    
    @scala.inline
    def apply(): RenderFailureEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RenderFailureEventArgs]
    }
    
    @scala.inline
    implicit class RenderFailureEventArgsMutableBuilder[Self <: RenderFailureEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      @scala.inline
      def setCustomObject(value: js.Any): Self = StObject.set(x, "customObject", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomObjectUndefined: Self = StObject.set(x, "customObject", js.undefined)
      
      @scala.inline
      def setElement(value: js.Any): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    }
  }
  
  @js.native
  trait RenderSuccessEventArgs extends StObject {
    
    /** returns the current action of PivotGrid control.
      */
    var action: js.UndefOr[String] = js.native
    
    /** returns the custom object bound with the control.
      */
    var customObject: js.UndefOr[js.Any] = js.native
    
    /** returns the HTML element of PivotGrid control.
      */
    var element: js.UndefOr[js.Any] = js.native
  }
  object RenderSuccessEventArgs {
    
    @scala.inline
    def apply(): RenderSuccessEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RenderSuccessEventArgs]
    }
    
    @scala.inline
    implicit class RenderSuccessEventArgsMutableBuilder[Self <: RenderSuccessEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      @scala.inline
      def setCustomObject(value: js.Any): Self = StObject.set(x, "customObject", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomObjectUndefined: Self = StObject.set(x, "customObject", js.undefined)
      
      @scala.inline
      def setElement(value: js.Any): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    }
  }
  
  @js.native
  trait RowHeaderHyperlinkClickEventArgs extends StObject {
    
    /** returns the information about the clicked cell
      */
    var args: js.UndefOr[js.Any] = js.native
    
    /** returns the custom object bound to the control.
      */
    var customObject: js.UndefOr[js.Any] = js.native
    
    /** returns the HTML element of the control.
      */
    var element: js.UndefOr[js.Any] = js.native
  }
  object RowHeaderHyperlinkClickEventArgs {
    
    @scala.inline
    def apply(): RowHeaderHyperlinkClickEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RowHeaderHyperlinkClickEventArgs]
    }
    
    @scala.inline
    implicit class RowHeaderHyperlinkClickEventArgsMutableBuilder[Self <: RowHeaderHyperlinkClickEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArgs(value: js.Any): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
      
      @scala.inline
      def setCustomObject(value: js.Any): Self = StObject.set(x, "customObject", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomObjectUndefined: Self = StObject.set(x, "customObject", js.undefined)
      
      @scala.inline
      def setElement(value: js.Any): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    }
  }
  
  @js.native
  trait SaveReportEventArgs extends StObject {
    
    /** returns the report to be stored in database.
      */
    var report: js.UndefOr[js.Any] = js.native
  }
  object SaveReportEventArgs {
    
    @scala.inline
    def apply(): SaveReportEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SaveReportEventArgs]
    }
    
    @scala.inline
    implicit class SaveReportEventArgsMutableBuilder[Self <: SaveReportEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setReport(value: js.Any): Self = StObject.set(x, "report", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReportUndefined: Self = StObject.set(x, "report", js.undefined)
    }
  }
  
  @js.native
  trait ServiceMethodSettings extends StObject {
    
    /** Allows you to set the custom name for the service method that is responsible for adding a calculated field to the report.
      * @Default {CalculatedField}
      */
    var calculatedField: js.UndefOr[String] = js.native
    
    /** Allows you to set the custom name for the service method that is responsible for editing the cells.
      * @Default {CellEditing}
      */
    var cellEditing: js.UndefOr[String] = js.native
    
    /** Allows you to set the custom name for the service method responsible for performing server-side actions based on defer update.
      * @Default {DeferUpdate}
      */
    var deferUpdate: js.UndefOr[String] = js.native
    
    /** Allows you to set the custom name for service method which is responsible for drill up/down operation in the PivotGrid.
      * @Default {DrillGrid}
      */
    var drillDown: js.UndefOr[String] = js.native
    
    /** Allows you to set the custom name for the service method that is responsible for performing drill through operation in the data table.
      * @Default {DrillThroughDataTable}
      */
    var drillThroughDataTable: js.UndefOr[String] = js.native
    
    /** Allows you to set the custom name for the service method that is responsible for performing the drill through operation.
      * @Default {DrillThroughHierarchies}
      */
    var drillThroughHierarchies: js.UndefOr[String] = js.native
    
    /** Allows you to set the custom name for the service method that is responsible for exporting.
      * @Default {Export}
      */
    var exportPivotGrid: js.UndefOr[String] = js.native
    
    /** Allows you to set the custom name for the service method that is responsible for getting values of the tree-view inside filter dialog.
      * @Default {FetchMembers}
      */
    var fetchMembers: js.UndefOr[String] = js.native
    
    /** Allows you to set the custom name for the service method that is responsible for filtering operation in the PivotGrid.
      * @Default {Filtering}
      */
    var filtering: js.UndefOr[String] = js.native
    
    /** Allows you to set the custom name for the service method that is responsible for initializing the PivotGrid.
      * @Default {InitializeGrid}
      */
    var initialize: js.UndefOr[String] = js.native
    
    /** Allows you to set the custom name for the service method that is responsible for loading a report from the database.
      * @Default {LoadReportFromDB}
      */
    var loadReport: js.UndefOr[String] = js.native
    
    /** Allows you to set the custom name for the service method that is responsible for expanding members in the member editor.
      * @Default {MemberExpanded}
      */
    var memberExpand: js.UndefOr[String] = js.native
    
    /** Allows you to set the custom name for the service method that is responsible for the server-side action when dropping a node from the field list.
      * @Default {NodeDropped}
      */
    var nodeDropped: js.UndefOr[String] = js.native
    
    /** Allows you to set the custom name for the service method that is responsible for server-side action when changing the checked state of a node in the field list.
      * @Default {NodeStateModified}
      */
    var nodeStateModified: js.UndefOr[String] = js.native
    
    /** Allows you to set the custom name for the service method that is responsible for performing paging operation in the PivotGrid.
      * @Default {Paging}
      */
    var paging: js.UndefOr[String] = js.native
    
    /** Allows you to set the custom name for the service method that is responsible for removing the pivot button from the GroupingBar/field list.
      * @Default {RemoveButton}
      */
    var removeButton: js.UndefOr[String] = js.native
    
    /** Allows you to set the custom name for the service method that is responsible for saving the current report to the database.
      * @Default {SaveReport}
      */
    var saveReport: js.UndefOr[String] = js.native
    
    /** Allows you to set the custom name for the service method that is responsible for sorting operation in the PivotGrid.
      * @Default {Sorting}
      */
    var sorting: js.UndefOr[String] = js.native
    
    /** Allows you to set the custom name for the service method that is responsible for performing value sorting operation in the PivotGrid.
      * @Default {ValueSorting}
      */
    var valueSorting: js.UndefOr[String] = js.native
    
    /** Allows you to set the custom name for the service method that is responsible for write-back operation in the OLAP Cube. This is applicable only in the server-side component.
      * @Default {WriteBack}
      */
    var writeBack: js.UndefOr[String] = js.native
  }
  object ServiceMethodSettings {
    
    @scala.inline
    def apply(): ServiceMethodSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ServiceMethodSettings]
    }
    
    @scala.inline
    implicit class ServiceMethodSettingsMutableBuilder[Self <: ServiceMethodSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCalculatedField(value: String): Self = StObject.set(x, "calculatedField", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCalculatedFieldUndefined: Self = StObject.set(x, "calculatedField", js.undefined)
      
      @scala.inline
      def setCellEditing(value: String): Self = StObject.set(x, "cellEditing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCellEditingUndefined: Self = StObject.set(x, "cellEditing", js.undefined)
      
      @scala.inline
      def setDeferUpdate(value: String): Self = StObject.set(x, "deferUpdate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeferUpdateUndefined: Self = StObject.set(x, "deferUpdate", js.undefined)
      
      @scala.inline
      def setDrillDown(value: String): Self = StObject.set(x, "drillDown", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDrillDownUndefined: Self = StObject.set(x, "drillDown", js.undefined)
      
      @scala.inline
      def setDrillThroughDataTable(value: String): Self = StObject.set(x, "drillThroughDataTable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDrillThroughDataTableUndefined: Self = StObject.set(x, "drillThroughDataTable", js.undefined)
      
      @scala.inline
      def setDrillThroughHierarchies(value: String): Self = StObject.set(x, "drillThroughHierarchies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDrillThroughHierarchiesUndefined: Self = StObject.set(x, "drillThroughHierarchies", js.undefined)
      
      @scala.inline
      def setExportPivotGrid(value: String): Self = StObject.set(x, "exportPivotGrid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExportPivotGridUndefined: Self = StObject.set(x, "exportPivotGrid", js.undefined)
      
      @scala.inline
      def setFetchMembers(value: String): Self = StObject.set(x, "fetchMembers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFetchMembersUndefined: Self = StObject.set(x, "fetchMembers", js.undefined)
      
      @scala.inline
      def setFiltering(value: String): Self = StObject.set(x, "filtering", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilteringUndefined: Self = StObject.set(x, "filtering", js.undefined)
      
      @scala.inline
      def setInitialize(value: String): Self = StObject.set(x, "initialize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitializeUndefined: Self = StObject.set(x, "initialize", js.undefined)
      
      @scala.inline
      def setLoadReport(value: String): Self = StObject.set(x, "loadReport", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadReportUndefined: Self = StObject.set(x, "loadReport", js.undefined)
      
      @scala.inline
      def setMemberExpand(value: String): Self = StObject.set(x, "memberExpand", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMemberExpandUndefined: Self = StObject.set(x, "memberExpand", js.undefined)
      
      @scala.inline
      def setNodeDropped(value: String): Self = StObject.set(x, "nodeDropped", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodeDroppedUndefined: Self = StObject.set(x, "nodeDropped", js.undefined)
      
      @scala.inline
      def setNodeStateModified(value: String): Self = StObject.set(x, "nodeStateModified", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodeStateModifiedUndefined: Self = StObject.set(x, "nodeStateModified", js.undefined)
      
      @scala.inline
      def setPaging(value: String): Self = StObject.set(x, "paging", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPagingUndefined: Self = StObject.set(x, "paging", js.undefined)
      
      @scala.inline
      def setRemoveButton(value: String): Self = StObject.set(x, "removeButton", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoveButtonUndefined: Self = StObject.set(x, "removeButton", js.undefined)
      
      @scala.inline
      def setSaveReport(value: String): Self = StObject.set(x, "saveReport", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSaveReportUndefined: Self = StObject.set(x, "saveReport", js.undefined)
      
      @scala.inline
      def setSorting(value: String): Self = StObject.set(x, "sorting", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSortingUndefined: Self = StObject.set(x, "sorting", js.undefined)
      
      @scala.inline
      def setValueSorting(value: String): Self = StObject.set(x, "valueSorting", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueSortingUndefined: Self = StObject.set(x, "valueSorting", js.undefined)
      
      @scala.inline
      def setWriteBack(value: String): Self = StObject.set(x, "writeBack", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWriteBackUndefined: Self = StObject.set(x, "writeBack", js.undefined)
    }
  }
  
  @js.native
  trait SummaryCellHyperlinkClickEventArgs extends StObject {
    
    /** returns the information about the clicked cell
      */
    var args: js.UndefOr[js.Any] = js.native
    
    /** returns the custom object bound to the control.
      */
    var customObject: js.UndefOr[js.Any] = js.native
    
    /** returns the HTML element of the control.
      */
    var element: js.UndefOr[js.Any] = js.native
  }
  object SummaryCellHyperlinkClickEventArgs {
    
    @scala.inline
    def apply(): SummaryCellHyperlinkClickEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SummaryCellHyperlinkClickEventArgs]
    }
    
    @scala.inline
    implicit class SummaryCellHyperlinkClickEventArgsMutableBuilder[Self <: SummaryCellHyperlinkClickEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArgs(value: js.Any): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
      
      @scala.inline
      def setCustomObject(value: js.Any): Self = StObject.set(x, "customObject", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomObjectUndefined: Self = StObject.set(x, "customObject", js.undefined)
      
      @scala.inline
      def setElement(value: js.Any): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    }
  }
  
  @js.native
  trait ValueCellHyperlinkClickEventArgs extends StObject {
    
    /** returns the information about the clicked cell
      */
    var args: js.UndefOr[js.Any] = js.native
    
    /** returns the custom object bound to the control.
      */
    var customObject: js.UndefOr[js.Any] = js.native
    
    /** returns the HTML element of the control.
      */
    var element: js.UndefOr[js.Any] = js.native
  }
  object ValueCellHyperlinkClickEventArgs {
    
    @scala.inline
    def apply(): ValueCellHyperlinkClickEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ValueCellHyperlinkClickEventArgs]
    }
    
    @scala.inline
    implicit class ValueCellHyperlinkClickEventArgsMutableBuilder[Self <: ValueCellHyperlinkClickEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArgs(value: js.Any): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
      
      @scala.inline
      def setCustomObject(value: js.Any): Self = StObject.set(x, "customObject", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomObjectUndefined: Self = StObject.set(x, "customObject", js.undefined)
      
      @scala.inline
      def setElement(value: js.Any): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    }
  }
  
  @js.native
  trait ValueSortSettings extends StObject {
    
    /** Allows you to set the string for separating column headers provided in the headerText property.
      */
    var headerDelimiters: js.UndefOr[String] = js.native
    
    /** Contains the header of the specific column to which value sorting is applied.
      */
    var headerText: js.UndefOr[String] = js.native
    
    /** Allows you to set the sorting order of values of the field.
      * @Default {ej.PivotAnalysis.SortOrder.Ascending}
      */
    var sortOrder: js.UndefOr[SortOrder | String] = js.native
  }
  object ValueSortSettings {
    
    @scala.inline
    def apply(): ValueSortSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ValueSortSettings]
    }
    
    @scala.inline
    implicit class ValueSortSettingsMutableBuilder[Self <: ValueSortSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeaderDelimiters(value: String): Self = StObject.set(x, "headerDelimiters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderDelimitersUndefined: Self = StObject.set(x, "headerDelimiters", js.undefined)
      
      @scala.inline
      def setHeaderText(value: String): Self = StObject.set(x, "headerText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderTextUndefined: Self = StObject.set(x, "headerText", js.undefined)
      
      @scala.inline
      def setSortOrder(value: SortOrder | String): Self = StObject.set(x, "sortOrder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSortOrderUndefined: Self = StObject.set(x, "sortOrder", js.undefined)
    }
  }
}
