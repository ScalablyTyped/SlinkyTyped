package typingsSlinky.ejWebAll.ej.PivotClient

import typingsSlinky.ejWebAll.ej.Pivot.AnalysisMode
import typingsSlinky.ejWebAll.ej.Pivot.OperationalMode
import typingsSlinky.ejWebAll.ej.PivotChart.ChartTypes
import typingsSlinky.ejWebAll.ej.PivotGrid.Layout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Model extends js.Object {
  /** Triggers when it reaches the client-side after any AJAX request.
    */
  var afterServiceInvoke: js.UndefOr[js.Function1[/* e */ AfterServiceInvokeEventArgs, Unit]] = js.native
  /** Sets the mode for the pivot client widget for binding the OLAP or relational data sources.
    * @Default {ej.Pivot.AnalysisMode.Pivot}
    */
  var analysisMode: js.UndefOr[AnalysisMode | String] = js.native
  /** Triggers before the chart label is rendered in the pivot chart.
    */
  var axesLabelRendering: js.UndefOr[js.Function1[/* e */ AxesLabelRenderingEventArgs, Unit]] = js.native
  /** Triggers before exporting the control.
    */
  var beforeExport: js.UndefOr[js.Function1[/* e */ BeforeExportEventArgs, Unit]] = js.native
  /** Triggers before any AJAX request is passed from the client-side to the service methods.
    */
  var beforeServiceInvoke: js.UndefOr[js.Function1[/* e */ BeforeServiceInvokeEventArgs, Unit]] = js.native
  /** Triggers when click action is performed over a grid value cell.
    */
  var cellClick: js.UndefOr[js.Function1[/* e */ CellClickEventArgs, Unit]] = js.native
  /** Triggers before rendering the pivot chart.
    */
  var chartLoad: js.UndefOr[js.Function1[/* e */ ChartLoadEventArgs, Unit]] = js.native
  /** Allows you to set the specific chart type for the pivot chart in the pivot client widget.
    * @Default {ej.PivotChart.ChartTypes.Column}
    */
  var chartType: js.UndefOr[ChartTypes | String] = js.native
  /** Allows you to set the content for exporting the pivot client widget.
    * @Default {ej.PivotClient.ClientExportMode.ChartAndGrid}
    */
  var clientExportMode: js.UndefOr[ClientExportMode | String] = js.native
  /** Allows you to hide the cube browser and the axis element builder of the pivot client while initiating the widget.
    * @Default {false}
    */
  var collapseCubeBrowserByDefault: js.UndefOr[Boolean] = js.native
  /** Specifies the CSS class to the pivot client for achieving the custom theme.
    * @Default {â€œâ€}
    */
  var cssClass: js.UndefOr[String] = js.native
  /** An object is utilized to pass the additional information between the client-end and the service-end when the control functions are present in the server-mode.
    * @Default {{}}
    */
  var customObject: js.UndefOr[js.Any] = js.native
  /** Initializes the data source for the pivot client widget, when it functions completely on the client-side.
    * @Default {{}}
    */
  var dataSource: js.UndefOr[DataSource] = js.native
  /** Allows you to customize the layout and appearance of the widget.
    * @Default {{}}
    */
  var displaySettings: js.UndefOr[DisplaySettings] = js.native
  /** Triggers while clicking the value cells in the pivot grid.
    */
  var drillThrough: js.UndefOr[js.Function1[/* e */ DrillThroughEventArgs, Unit]] = js.native
  /** Enables the advanced filtering options such as value filtering, label filtering, and sorting for each dimensions when binding the OLAP data in the server mode.
    * @Default {false}
    */
  var enableAdvancedFilter: js.UndefOr[Boolean] = js.native
  /** Allows you to get cell details in JSON format by clicking the value cell.
    * @Default {false}
    */
  var enableCellClick: js.UndefOr[Boolean] = js.native
  /** Allows you to get cell details in JSON format by double-clicking the value cell.
    * @Default {false}
    */
  var enableCellDoubleClick: js.UndefOr[Boolean] = js.native
  /** Allows you to export entire data instead of current page data, while paging option is enabled.
    * @Default {false}
    */
  var enableCompleteDataExport: js.UndefOr[Boolean] = js.native
  /** Allows you to refresh the control on-demand and not during the every UI operation.
    * @Default {false}
    */
  var enableDeferUpdate: js.UndefOr[Boolean] = js.native
  /** Enables the drill-through feature which retrieves the raw items that are used to create a specific cell in the pivot grid.
    * @Default {false}
    */
  var enableDrillThrough: js.UndefOr[Boolean] = js.native
  /** Allows you to view the KPI elements in tree-view of the pivot client's cube browser.
    * @Default {false}
    */
  var enableKPI: js.UndefOr[Boolean] = js.native
  /** Allows to save and load the reports in a customized way with the help of events.
    * @Default {false}
    */
  var enableLocalStorage: js.UndefOr[Boolean] = js.native
  /** Enables/disables the visibility of measure group selector drop-down in the cube browser.
    * @Default {false}
    */
  var enableMeasureGroups: js.UndefOr[Boolean] = js.native
  /** Enables/disables paging in the member editor for viewing the large count of members in the pages.
    * @Default {false}
    */
  var enableMemberEditorPaging: js.UndefOr[Boolean] = js.native
  /** Enables/Disables sorting option in member editor dialog for the members of the respective field.
    * @Default {false}
    */
  var enableMemberEditorSorting: js.UndefOr[Boolean] = js.native
  /** Allows you to enable the paging for both the pivot chart and the pivot grid components for viewing the large data.
    * @Default {false}
    */
  var enablePaging: js.UndefOr[Boolean] = js.native
  /** Allows you to include the pivot tree map component as one of the chart types.
    * @Default {false}
    */
  var enablePivotTreeMap: js.UndefOr[Boolean] = js.native
  /** Allows you to view the layout of the pivot client from right to left.
    * @Default {false}
    */
  var enableRTL: js.UndefOr[Boolean] = js.native
  /** Enables the splitter option for resizing the elements in the control.
    * @Default {false}
    */
  var enableSplitter: js.UndefOr[Boolean] = js.native
  /** Allows you to enable the virtual scrolling for both the pivot chart and pivot grid components for viewing the large data.
    * @Default {false}
    */
  var enableVirtualScrolling: js.UndefOr[Boolean] = js.native
  /** Allows you to enable &quot;withCredentials&quot; property inside XMLHttpRequest object for CORS(Cross-Origin Resource Sharing) request.
    * @Default {false}
    */
  var enableXHRCredentials: js.UndefOr[Boolean] = js.native
  /** Triggers before fetching the report collection from the storage.
    */
  var fetchReport: js.UndefOr[js.Function1[/* e */ FetchReportEventArgs, Unit]] = js.native
  /** Sets the summary layout for the pivot grid. Following are the ways in which the summary can be positioned: normal summary (bottom), top summary, no summary, and Microsoft Excel
    * summary.
    * @Default {ej.PivotGrid.Layout.Normal}
    */
  var gridLayout: js.UndefOr[Layout | String] = js.native
  /** Allows you to enable the pivot clientâ€™s responsiveness in the browser layout.
    * @Default {false}
    */
  var isResponsive: js.UndefOr[Boolean] = js.native
  /** Triggers while initiating the loading of the widget.
    */
  var load: js.UndefOr[js.Function1[/* e */ LoadEventArgs, Unit]] = js.native
  /** Triggers before loading the saved collection of reports.
    */
  var loadReport: js.UndefOr[js.Function1[/* e */ LoadReportEventArgs, Unit]] = js.native
  /** Allows you to set the localized language for the widget.
    * @Default {en-US}
    */
  var locale: js.UndefOr[String] = js.native
  /** Allows you to set the maximum number of nodes as well as child nodes to be displayed in the member editor.
    * @Default {1000}
    */
  var maxNodeLimitInMemberEditor: js.UndefOr[Double] = js.native
  /** Allows you to set the number of members to be displayed in each page of the member editor on applying the paging in it.
    * @Default {100}
    */
  var memberEditorPageSize: js.UndefOr[Double] = js.native
  /** Sets the mode for the pivot client widget to bind the data source in the server-side or the client-side.
    * @Default {ej.Pivot.OperationalMode.ClientMode}
    */
  var operationalMode: js.UndefOr[OperationalMode | String] = js.native
  /** Triggers when clicking on any chart series points in the pivot chart.
    */
  var pointRegionClick: js.UndefOr[js.Function1[/* e */ PointRegionClickEventArgs, Unit]] = js.native
  /** Triggers when the pivot client widget completes all operations at client-end after any AJAX request.
    */
  var renderComplete: js.UndefOr[js.Function1[/* e */ RenderCompleteEventArgs, Unit]] = js.native
  /** Triggers when any error is occurred during the AJAX request.
    */
  var renderFailure: js.UndefOr[js.Function1[/* e */ RenderFailureEventArgs, Unit]] = js.native
  /** Triggers when the pivot client is completely rendered.
    */
  var renderSuccess: js.UndefOr[js.Function1[/* e */ RenderSuccessEventArgs, Unit]] = js.native
  /** Triggers before saving the current collection of reports.
    */
  var saveReport: js.UndefOr[js.Function1[/* e */ SaveReportEventArgs, Unit]] = js.native
  /** Triggers before rendering the pivot schema designer.
    */
  var schemaLoad: js.UndefOr[js.Function1[/* e */ SchemaLoadEventArgs, Unit]] = js.native
  /** Allows you to set the custom name for methods at service-end, and it is communicated during the AJAX post.
    * @Default {{}}
    */
  var serviceMethodSettings: js.UndefOr[ServiceMethodSettings] = js.native
  /** Allows you to load the saved report collection from the database.
    * @Default {false}
    */
  var showReportCollection: js.UndefOr[Boolean] = js.native
  /** Allows you to show a unique name on the pivot button.
    * @Default {false}
    */
  var showUniqueNameOnPivotButton: js.UndefOr[Boolean] = js.native
  /** Options to customize the size of the pivot client control.
    * @Default {Example:}
    */
  var size: js.UndefOr[js.Any] = js.native
  /** Sets the title for the pivot client widget.
    */
  var title: js.UndefOr[String] = js.native
  /** Allows you to set the visibility of icons in the toolbar panel.
    * @Default {{}}
    */
  var toolbarIconSettings: js.UndefOr[ToolbarIconSettings] = js.native
  /** Triggers before rendering the pivot tree map.
    */
  var treeMapLoad: js.UndefOr[js.Function1[/* e */ TreeMapLoadEventArgs, Unit]] = js.native
  /** Connects the service using the specified URL for any server updates.
    */
  var url: js.UndefOr[String] = js.native
  /** Triggers when clicking any value cell in the pivot grid.
    */
  var valueCellHyperlinkClick: js.UndefOr[js.Function1[/* e */ ValueCellHyperlinkClickEventArgs, Unit]] = js.native
  /** Holds the necessary properties for value sorting.
    * @Default {{}}
    */
  var valueSortSettings: js.UndefOr[ValueSortSettings] = js.native
}

object Model {
  @scala.inline
  def apply(): Model = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Model]
  }
  @scala.inline
  implicit class ModelOps[Self <: Model] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAfterServiceInvoke(value: /* e */ AfterServiceInvokeEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterServiceInvoke")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAfterServiceInvoke: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterServiceInvoke")(js.undefined)
        ret
    }
    @scala.inline
    def withAnalysisMode(value: AnalysisMode | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("analysisMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnalysisMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("analysisMode")(js.undefined)
        ret
    }
    @scala.inline
    def withAxesLabelRendering(value: /* e */ AxesLabelRenderingEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axesLabelRendering")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAxesLabelRendering: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axesLabelRendering")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeExport(value: /* e */ BeforeExportEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeExport")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBeforeExport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeExport")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeServiceInvoke(value: /* e */ BeforeServiceInvokeEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeServiceInvoke")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBeforeServiceInvoke: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeServiceInvoke")(js.undefined)
        ret
    }
    @scala.inline
    def withCellClick(value: /* e */ CellClickEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCellClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellClick")(js.undefined)
        ret
    }
    @scala.inline
    def withChartLoad(value: /* e */ ChartLoadEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chartLoad")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutChartLoad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chartLoad")(js.undefined)
        ret
    }
    @scala.inline
    def withChartType(value: ChartTypes | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chartType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChartType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chartType")(js.undefined)
        ret
    }
    @scala.inline
    def withClientExportMode(value: ClientExportMode | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientExportMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientExportMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientExportMode")(js.undefined)
        ret
    }
    @scala.inline
    def withCollapseCubeBrowserByDefault(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapseCubeBrowserByDefault")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollapseCubeBrowserByDefault: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapseCubeBrowserByDefault")(js.undefined)
        ret
    }
    @scala.inline
    def withCssClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCssClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssClass")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomObject(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customObject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomObject: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customObject")(js.undefined)
        ret
    }
    @scala.inline
    def withDataSource(value: DataSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSource")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplaySettings(value: DisplaySettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displaySettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplaySettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displaySettings")(js.undefined)
        ret
    }
    @scala.inline
    def withDrillThrough(value: /* e */ DrillThroughEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drillThrough")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDrillThrough: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drillThrough")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableAdvancedFilter(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableAdvancedFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableAdvancedFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableAdvancedFilter")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableCellClick(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableCellClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableCellClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableCellClick")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableCellDoubleClick(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableCellDoubleClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableCellDoubleClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableCellDoubleClick")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableCompleteDataExport(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableCompleteDataExport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableCompleteDataExport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableCompleteDataExport")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableDeferUpdate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableDeferUpdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableDeferUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableDeferUpdate")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableDrillThrough(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableDrillThrough")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableDrillThrough: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableDrillThrough")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableKPI(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableKPI")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableKPI: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableKPI")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableLocalStorage(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableLocalStorage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableLocalStorage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableLocalStorage")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableMeasureGroups(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableMeasureGroups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableMeasureGroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableMeasureGroups")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableMemberEditorPaging(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableMemberEditorPaging")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableMemberEditorPaging: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableMemberEditorPaging")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableMemberEditorSorting(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableMemberEditorSorting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableMemberEditorSorting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableMemberEditorSorting")(js.undefined)
        ret
    }
    @scala.inline
    def withEnablePaging(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enablePaging")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnablePaging: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enablePaging")(js.undefined)
        ret
    }
    @scala.inline
    def withEnablePivotTreeMap(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enablePivotTreeMap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnablePivotTreeMap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enablePivotTreeMap")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableRTL(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableRTL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableRTL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableRTL")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableSplitter(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableSplitter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableSplitter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableSplitter")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableVirtualScrolling(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableVirtualScrolling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableVirtualScrolling: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableVirtualScrolling")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableXHRCredentials(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableXHRCredentials")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableXHRCredentials: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableXHRCredentials")(js.undefined)
        ret
    }
    @scala.inline
    def withFetchReport(value: /* e */ FetchReportEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetchReport")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutFetchReport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetchReport")(js.undefined)
        ret
    }
    @scala.inline
    def withGridLayout(value: Layout | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridLayout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGridLayout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridLayout")(js.undefined)
        ret
    }
    @scala.inline
    def withIsResponsive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isResponsive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsResponsive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isResponsive")(js.undefined)
        ret
    }
    @scala.inline
    def withLoad(value: /* e */ LoadEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("load")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutLoad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("load")(js.undefined)
        ret
    }
    @scala.inline
    def withLoadReport(value: /* e */ LoadReportEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadReport")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutLoadReport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadReport")(js.undefined)
        ret
    }
    @scala.inline
    def withLocale(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxNodeLimitInMemberEditor(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxNodeLimitInMemberEditor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxNodeLimitInMemberEditor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxNodeLimitInMemberEditor")(js.undefined)
        ret
    }
    @scala.inline
    def withMemberEditorPageSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("memberEditorPageSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMemberEditorPageSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("memberEditorPageSize")(js.undefined)
        ret
    }
    @scala.inline
    def withOperationalMode(value: OperationalMode | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operationalMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOperationalMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operationalMode")(js.undefined)
        ret
    }
    @scala.inline
    def withPointRegionClick(value: /* e */ PointRegionClickEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointRegionClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutPointRegionClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointRegionClick")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderComplete(value: /* e */ RenderCompleteEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderComplete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRenderComplete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderComplete")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderFailure(value: /* e */ RenderFailureEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderFailure")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRenderFailure: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderFailure")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderSuccess(value: /* e */ RenderSuccessEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderSuccess")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRenderSuccess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderSuccess")(js.undefined)
        ret
    }
    @scala.inline
    def withSaveReport(value: /* e */ SaveReportEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saveReport")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSaveReport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saveReport")(js.undefined)
        ret
    }
    @scala.inline
    def withSchemaLoad(value: /* e */ SchemaLoadEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schemaLoad")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSchemaLoad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schemaLoad")(js.undefined)
        ret
    }
    @scala.inline
    def withServiceMethodSettings(value: ServiceMethodSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceMethodSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceMethodSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceMethodSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withShowReportCollection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showReportCollection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowReportCollection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showReportCollection")(js.undefined)
        ret
    }
    @scala.inline
    def withShowUniqueNameOnPivotButton(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showUniqueNameOnPivotButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowUniqueNameOnPivotButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showUniqueNameOnPivotButton")(js.undefined)
        ret
    }
    @scala.inline
    def withSize(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
    @scala.inline
    def withToolbarIconSettings(value: ToolbarIconSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbarIconSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToolbarIconSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbarIconSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withTreeMapLoad(value: /* e */ TreeMapLoadEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("treeMapLoad")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutTreeMapLoad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("treeMapLoad")(js.undefined)
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.undefined)
        ret
    }
    @scala.inline
    def withValueCellHyperlinkClick(value: /* e */ ValueCellHyperlinkClickEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueCellHyperlinkClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutValueCellHyperlinkClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueCellHyperlinkClick")(js.undefined)
        ret
    }
    @scala.inline
    def withValueSortSettings(value: ValueSortSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueSortSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueSortSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueSortSettings")(js.undefined)
        ret
    }
  }
  
}

