package typingsSlinky.ejWebAll.ej.PivotGrid

import typingsSlinky.ejWebAll.ej.Pivot.AnalysisMode
import typingsSlinky.ejWebAll.ej.Pivot.OperationalMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Model extends js.Object {
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
    def withBeforePivotEnginePopulate(value: /* e */ BeforePivotEnginePopulateEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforePivotEnginePopulate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBeforePivotEnginePopulate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforePivotEnginePopulate")(js.undefined)
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
    def withCellContext(value: /* e */ CellContextEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellContext")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCellContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellContext")(js.undefined)
        ret
    }
    @scala.inline
    def withCellDoubleClick(value: /* e */ CellDoubleClickEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellDoubleClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCellDoubleClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellDoubleClick")(js.undefined)
        ret
    }
    @scala.inline
    def withCellEdit(value: /* e */ CellEditEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellEdit")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCellEdit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellEdit")(js.undefined)
        ret
    }
    @scala.inline
    def withCellSelection(value: /* e */ CellSelectionEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellSelection")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCellSelection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellSelection")(js.undefined)
        ret
    }
    @scala.inline
    def withCollapsedMembers(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapsedMembers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollapsedMembers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapsedMembers")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnHeaderHyperlinkClick(value: /* e */ ColumnHeaderHyperlinkClickEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnHeaderHyperlinkClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutColumnHeaderHyperlinkClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnHeaderHyperlinkClick")(js.undefined)
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
    def withDrillSuccess(value: /* e */ DrillSuccessEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drillSuccess")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDrillSuccess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drillSuccess")(js.undefined)
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
    def withEnableCellContext(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableCellContext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableCellContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableCellContext")(js.undefined)
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
    def withEnableCellEditing(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableCellEditing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableCellEditing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableCellEditing")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableCellSelection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableCellSelection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableCellSelection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableCellSelection")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableCollapseByDefault(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableCollapseByDefault")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableCollapseByDefault: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableCollapseByDefault")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableColumnGrandTotal(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableColumnGrandTotal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableColumnGrandTotal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableColumnGrandTotal")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableColumnResizing(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableColumnResizing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableColumnResizing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableColumnResizing")(js.undefined)
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
    def withEnableConditionalFormatting(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableConditionalFormatting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableConditionalFormatting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableConditionalFormatting")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableContextMenu(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableContextMenu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableContextMenu: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableContextMenu")(js.undefined)
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
    def withEnableGrandTotal(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableGrandTotal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableGrandTotal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableGrandTotal")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableGroupingBar(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableGroupingBar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableGroupingBar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableGroupingBar")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableJSONRendering(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableJSONRendering")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableJSONRendering: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableJSONRendering")(js.undefined)
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
    def withEnablePivotFieldList(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enablePivotFieldList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnablePivotFieldList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enablePivotFieldList")(js.undefined)
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
    def withEnableRowGrandTotal(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableRowGrandTotal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableRowGrandTotal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableRowGrandTotal")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableToolTip(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableToolTip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableToolTip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableToolTip")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableToolTipAnimation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableToolTipAnimation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableToolTipAnimation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableToolTipAnimation")(js.undefined)
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
    def withFrozenHeaderSettings(value: FrozenHeaderSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frozenHeaderSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrozenHeaderSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frozenHeaderSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderSettings(value: HeaderSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withHyperlinkSettings(value: HyperlinkSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hyperlinkSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHyperlinkSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hyperlinkSettings")(js.undefined)
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
    def withJsonRecords(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jsonRecords")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJsonRecords: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jsonRecords")(js.undefined)
        ret
    }
    @scala.inline
    def withLayout(value: Layout | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layout")(js.undefined)
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
    def withPivotTableFieldListID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pivotTableFieldListID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPivotTableFieldListID: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pivotTableFieldListID")(js.undefined)
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
    def withResizeColumnsToFit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizeColumnsToFit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResizeColumnsToFit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizeColumnsToFit")(js.undefined)
        ret
    }
    @scala.inline
    def withRowHeaderHyperlinkClick(value: /* e */ RowHeaderHyperlinkClickEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowHeaderHyperlinkClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRowHeaderHyperlinkClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowHeaderHyperlinkClick")(js.undefined)
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
    def withSummaryCellHyperlinkClick(value: /* e */ SummaryCellHyperlinkClickEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("summaryCellHyperlinkClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSummaryCellHyperlinkClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("summaryCellHyperlinkClick")(js.undefined)
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

