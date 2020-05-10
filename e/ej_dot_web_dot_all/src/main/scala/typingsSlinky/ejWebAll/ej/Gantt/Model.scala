package typingsSlinky.ejWebAll.ej.Gantt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Model extends js.Object {
  /** Triggered for every Gantt action before its starts.
    */
  var actionBegin: js.UndefOr[js.Function1[/* e */ ActionBeginEventArgs, Unit]] = js.native
  /** Triggered for every Gantt action success event.
    */
  var actionComplete: js.UndefOr[js.Function1[/* e */ ActionCompleteEventArgs, Unit]] = js.native
  /** Specifies the fields to be included in the add dialog in Gantt
    * @Default {[]}
    */
  var addDialogFields: js.UndefOr[js.Array[AddDialogField]] = js.native
  /** Enables or disables the ability to resize column.
    * @Default {false}
    */
  var allowColumnResize: js.UndefOr[Boolean] = js.native
  /** Enables or disables the ability to drag and drop the row interactively to reorder the rows
    * @Default {false}
    */
  var allowDragAndDrop: js.UndefOr[Boolean] = js.native
  /** Enables or Disables Gantt chart editing in Gantt
    * @Default {true}
    */
  var allowGanttChartEditing: js.UndefOr[Boolean] = js.native
  /** Enables or Disables Keyboard navigation in Gantt
    * @Default {true}
    */
  var allowKeyboardNavigation: js.UndefOr[Boolean] = js.native
  /** Specifies enabling or disabling multiple sorting for Gantt columns
    * @Default {false}
    */
  var allowMultiSorting: js.UndefOr[Boolean] = js.native
  /** Enables or disables the option for multiple exporting
    * @Default {false}
    */
  var allowMultipleExporting: js.UndefOr[Boolean] = js.native
  /** Enables or disables the interactive selection of a row.
    * @Default {true}
    */
  var allowSelection: js.UndefOr[Boolean] = js.native
  /** Enables or disables sorting. When enabled, we can sort the column by clicking on the column.
    * @Default {false}
    */
  var allowSorting: js.UndefOr[Boolean] = js.native
  /** Enables or disables the rendering of unscheduled tasks.
    * @Default {false}
    */
  var allowUnscheduledTask: js.UndefOr[Boolean] = js.native
  /** Specifies the baseline background color in Gantt
    * @Default {#fba41c}
    */
  var baselineColor: js.UndefOr[String] = js.native
  /** Specifies the mapping property path for baseline end date in datasource
    */
  var baselineEndDateMapping: js.UndefOr[String] = js.native
  /** Specifies the mapping property path for baseline start date of a task in datasource
    */
  var baselineStartDateMapping: js.UndefOr[String] = js.native
  /** Triggered while enter the edit mode in the TreeGrid cell
    */
  var beginEdit: js.UndefOr[js.Function1[/* e */ BeginEditEventArgs, Unit]] = js.native
  /** Triggered after selected a cell
    */
  var cellSelected: js.UndefOr[js.Function1[/* e */ CellSelectedEventArgs, Unit]] = js.native
  /** Triggered before selecting a cell
    */
  var cellSelecting: js.UndefOr[js.Function1[/* e */ CellSelectingEventArgs, Unit]] = js.native
  /** Specifies the template for cell tooltip
    * @Default {null}
    */
  var cellTooltipTemplate: js.UndefOr[String] = js.native
  /** Specifies the mapping property path for sub tasks in datasource
    */
  var childMapping: js.UndefOr[String] = js.native
  /** Triggered after collapsed the Gantt record
    */
  var collapsed: js.UndefOr[js.Function1[/* e */ CollapsedEventArgs, Unit]] = js.native
  /** Triggered while collapsing the Gantt record
    */
  var collapsing: js.UndefOr[js.Function1[/* e */ CollapsingEventArgs, Unit]] = js.native
  /** To Specify the column fields to be displayed in the dialog while inserting a column using column menu.
    * @Default {[]}
    */
  var columnDialogFields: js.UndefOr[js.Array[_]] = js.native
  /** Specifies the background of connector lines in Gantt
    */
  var connectorLineBackground: js.UndefOr[String] = js.native
  /** Specifies the width of the connector lines in Gantt
    * @Default {1}
    */
  var connectorlineWidth: js.UndefOr[Double] = js.native
  /** Triggered while Context Menu is rendered in Gantt control
    */
  var contextMenuOpen: js.UndefOr[js.Function1[/* e */ ContextMenuOpenEventArgs, Unit]] = js.native
  /** Triggered when Gantt is rendered completely.
    */
  var create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, Unit]] = js.native
  /** Specify the CSS class for Gantt to achieve custom theme.
    */
  var cssClass: js.UndefOr[String] = js.native
  /** Collection of data or hierarchical data to represent in Gantt
    * @Default {null}
    */
  var dataSource: js.UndefOr[js.Array[_]] = js.native
  /** Specifies the dateFormat for Gantt , given format is displayed in tooltip , Grid .
    * @Default {MM/dd/yyyy}
    */
  var dateFormat: js.UndefOr[String] = js.native
  /** Specifies the customized working time for tasks in Gantt
    * @Default {[{ from: 08:00 AM, to: 12:00 PM , background:   }, { from: 01:00 PM, to: 05:00 PM , background:  }]}
    */
  var dayWorkingTime: js.UndefOr[js.Array[_]] = js.native
  /** Option for customizing the drag tooltip while reordering the rows.
    */
  var dragTooltip: js.UndefOr[DragTooltip] = js.native
  /** Specifies the mapping property path for duration of a task in datasource
    */
  var durationMapping: js.UndefOr[String] = js.native
  /** Specifies the duration unit for each tasks whether days or hours or minutes
    * @Default {ej.Gantt.DurationUnit.Day}
    */
  var durationUnit: js.UndefOr[DurationUnit | String] = js.native
  /** Specifies the mapping property path for task duration unit in datasource
    */
  var durationUnitMapping: js.UndefOr[String] = js.native
  /** Specifies the fields to be included in the edit dialog in Gantt
    * @Default {[]}
    */
  var editDialogFields: js.UndefOr[js.Array[EditDialogField]] = js.native
  /** Specifies the editSettings options in Gantt.
    */
  var editSettings: js.UndefOr[EditSettings] = js.native
  /** Enables or Disables enableAltRow row effect in Gantt
    * @Default {true}
    */
  var enableAltRow: js.UndefOr[Boolean] = js.native
  /** Enables or disables the collapse all records when loading the Gantt.
    * @Default {false}
    */
  var enableCollapseAll: js.UndefOr[Boolean] = js.native
  /** Enables or disables the contextmenu for Gantt , when enabled contextmenu appears on right clicking Gantt
    * @Default {false}
    */
  var enableContextMenu: js.UndefOr[Boolean] = js.native
  /** Enable or disable predecessor validation. When it is true, all the task's start and end dates are aligned based on its predecessors start and end dates.
    * @Default {true}
    */
  var enablePredecessorValidation: js.UndefOr[Boolean] = js.native
  /** Indicates whether we can edit the progress of a task interactively in Gantt.
    * @Default {true}
    */
  var enableProgressBarResizing: js.UndefOr[Boolean] = js.native
  /** Enables or disables the option for dynamically updating the Gantt size on window resizing
    * @Default {false}
    */
  var enableResize: js.UndefOr[Boolean] = js.native
  /** Enables or disables serial number column for Gantt. When enabled, the records will be number sequenced.
    * @Default {false}
    */
  var enableSerialNumber: js.UndefOr[Boolean] = js.native
  /** Enables or disables tooltip while editing (dragging/resizing) the taskbar.
    * @Default {true}
    */
  var enableTaskbarDragTooltip: js.UndefOr[Boolean] = js.native
  /** Enables or disables tooltip for taskbar.
    * @Default {true}
    */
  var enableTaskbarTooltip: js.UndefOr[Boolean] = js.native
  /** Enables/Disables virtualization for rendering Gantt items.
    * @Default {false}
    */
  var enableVirtualization: js.UndefOr[Boolean] = js.native
  /** Enables/disables work breakdown structure column.
    * @Default {false}
    */
  var enableWBS: js.UndefOr[Boolean] = js.native
  /** Enables/disables WBS predecessor column.
    * @Default {false}
    */
  var enableWBSPredecessor: js.UndefOr[Boolean] = js.native
  /** Specifies the mapping property path for end Date of a task in datasource
    */
  var endDateMapping: js.UndefOr[String] = js.native
  /** Triggered after save the modified cellValue in Gantt.
    */
  var endEdit: js.UndefOr[js.Function1[/* e */ EndEditEventArgs, Unit]] = js.native
  /** Specifies the mapping property path for the expand status of a record in data source.
    */
  var expandStateMapping: js.UndefOr[String] = js.native
  /** Triggered after expand the record
    */
  var expanded: js.UndefOr[js.Function1[/* e */ ExpandedEventArgs, Unit]] = js.native
  /** Triggered while expanding the Gantt record
    */
  var expanding: js.UndefOr[js.Function1[/* e */ ExpandingEventArgs, Unit]] = js.native
  /** Options for filtering and customizing filter actions.
    */
  var filterSettings: js.UndefOr[FilterSettings] = js.native
  /** Specifies the data collection for grouping the resources in resource allocation view in Gantt.
    * @Default {[]}
    */
  var groupCollection: js.UndefOr[js.Array[_]] = js.native
  /** Default Value
    */
  var groupIdMapping: js.UndefOr[String] = js.native
  /** Default Value
    */
  var groupNameMapping: js.UndefOr[String] = js.native
  /** Specifies whether to highlight the non working time in Gantt.
    * @Default {false}
    */
  var highlightNonWorkingTime: js.UndefOr[Boolean] = js.native
  /** Specifies whether to highlight the weekends in Gantt .
    * @Default {true}
    */
  var highlightWeekends: js.UndefOr[Boolean] = js.native
  /** Collection of holidays with date, background and label information to be displayed in Gantt.
    * @Default {[]}
    */
  var holidays: js.UndefOr[js.Array[Holiday]] = js.native
  /** Specifies whether to include weekends while calculating the duration of a task.
    * @Default {true}
    */
  var includeWeekend: js.UndefOr[Boolean] = js.native
  /** Enables or disables the responsiveness of Gantt
    * @Default {false}
    */
  var isResponsive: js.UndefOr[Boolean] = js.native
  /** Specifies the data source field name to be displayed as left task label
    */
  var leftTaskLabelMapping: js.UndefOr[String] = js.native
  /** Specifies the template for left task label
    */
  var leftTaskLabelTemplate: js.UndefOr[String] = js.native
  /** Triggered while Gantt is loaded
    */
  var load: js.UndefOr[js.Function1[/* e */ LoadEventArgs, Unit]] = js.native
  /** Specify the locale for Gantt
    * @Default {en-US}
    */
  var locale: js.UndefOr[String] = js.native
  /** Specifies the mapping property path for milestone in datasource
    */
  var milestoneMapping: js.UndefOr[String] = js.native
  /** To Specify the JsRender script Id to customize the mile stone with our preference
    */
  var milestoneTemplate: js.UndefOr[String] = js.native
  /** Specifies the background color for non working time in Gantt.
    */
  var nonWorkingBackground: js.UndefOr[String] = js.native
  /** Specifies the mapping property path for the task description in datasource
    */
  var notesMapping: js.UndefOr[String] = js.native
  /** Specifies the background of parent progressbar in Gantt
    */
  var parentProgressbarBackground: js.UndefOr[String] = js.native
  /** Specifies the mapping property path for parent task Id in self reference datasource
    */
  var parentTaskIdMapping: js.UndefOr[String] = js.native
  /** Specifies the background of parent taskbar in Gantt
    */
  var parentTaskbarBackground: js.UndefOr[String] = js.native
  /** Specifies the template for parent taskbar
    */
  var parentTaskbarTemplate: js.UndefOr[String] = js.native
  /** Specifies the mapping property path for predecessors of a task in datasource
    */
  var predecessorMapping: js.UndefOr[String] = js.native
  /** Specifies the JsRender template id or template script for predecessor tooltip on mouse action.
    */
  var predecessorTooltipTemplate: js.UndefOr[String] = js.native
  /** Specifies the mapping property path for progress percentage of a task in datasource
    */
  var progressMapping: js.UndefOr[String] = js.native
  /** Specifies the background of progressbar in Gantt
    */
  var progressbarBackground: js.UndefOr[String] = js.native
  /** Specified the height of the progressbar in taskbar
    * @Default {100}
    */
  var progressbarHeight: js.UndefOr[Double] = js.native
  /** Specifies the template for tooltip on resizing progressbar
    * @Default {null}
    */
  var progressbarTooltipTemplate: js.UndefOr[String] = js.native
  /** Specifies the template ID for customized tooltip for progressbar editing in Gantt
    * @Default {null}
    */
  var progressbarTooltipTemplateId: js.UndefOr[String] = js.native
  /** It receives query to retrieve data from the table (query is same as SQL).
    * @Default {null}
    */
  var query: js.UndefOr[js.Any] = js.native
  /** Triggered while rendering each cell in the TreeGrid
    */
  var queryCellInfo: js.UndefOr[js.Function1[/* e */ QueryCellInfoEventArgs, Unit]] = js.native
  /** Triggered while rendering each taskbar in the Gantt
    */
  var queryTaskbarInfo: js.UndefOr[js.Function1[/* e */ QueryTaskbarInfoEventArgs, Unit]] = js.native
  /** Enables or disables Gantt to read-only mode
    * @Default {false}
    */
  var readOnly: js.UndefOr[Boolean] = js.native
  /** Enables or Disables rendering baselines in Gantt , when enabled baseline is rendered in Gantt
    * @Default {false}
    */
  var renderBaseline: js.UndefOr[Boolean] = js.native
  /** Default Value
    */
  var resourceCollectionMapping: js.UndefOr[String] = js.native
  /** Specifies the mapping property name for resource ID in resource Collection in Gantt
    */
  var resourceIdMapping: js.UndefOr[String] = js.native
  /** Specifies the mapping property path for resources of a task in datasource
    */
  var resourceInfoMapping: js.UndefOr[String] = js.native
  /** Specifies the mapping property path for resource name of a task in Gantt
    */
  var resourceNameMapping: js.UndefOr[String] = js.native
  /** Specifies the mapping property path for resource's percent effort involved in a task in datasource
    */
  var resourceUnitMapping: js.UndefOr[String] = js.native
  /** Collection of data regarding resources involved in entire project
    * @Default {[]}
    */
  var resources: js.UndefOr[js.Array[_]] = js.native
  /** Specifies the data source field name to be displayed as right task label
    */
  var rightTaskLabelMapping: js.UndefOr[String] = js.native
  /** Specifies the template for right task label
    */
  var rightTaskLabelTemplate: js.UndefOr[String] = js.native
  /** Specifies whether rounding off the day working time edits
    * @Default {true}
    */
  var roundOffDayworkingTime: js.UndefOr[Boolean] = js.native
  /** Triggered while rendering each row
    */
  var rowDataBound: js.UndefOr[js.Function1[/* e */ RowDataBoundEventArgs, Unit]] = js.native
  /** Triggered while dragging a row in Gantt control
    */
  var rowDrag: js.UndefOr[js.Function1[/* e */ RowDragEventArgs, Unit]] = js.native
  /** Triggered while start to drag row in Gantt control
    */
  var rowDragStart: js.UndefOr[js.Function1[/* e */ RowDragStartEventArgs, Unit]] = js.native
  /** Triggered while drop a row in Gantt control
    */
  var rowDragStop: js.UndefOr[js.Function1[/* e */ RowDragStopEventArgs, Unit]] = js.native
  /** Specifies the height of a single row in Gantt. Also, we need to set same height in the CSS style with class name e-rowcell.
    * @Default {30}
    */
  var rowHeight: js.UndefOr[Double] = js.native
  /** Triggered after the row is selected.
    */
  var rowSelected: js.UndefOr[js.Function1[/* e */ RowSelectedEventArgs, Unit]] = js.native
  /** Triggered before the row is going to be selected.
    */
  var rowSelecting: js.UndefOr[js.Function1[/* e */ RowSelectingEventArgs, Unit]] = js.native
  /** Specifies end date of the Gantt schedule. By default, end date will be rounded to its next Saturday.
    * @Default {null}
    */
  var scheduleEndDate: js.UndefOr[String] = js.native
  /** Specifies the options for customizing schedule header.
    */
  var scheduleHeaderSettings: js.UndefOr[ScheduleHeaderSettings] = js.native
  /** Specifies start date of the Gantt schedule. By default, start date will be rounded to its previous Sunday.
    * @Default {null}
    */
  var scheduleStartDate: js.UndefOr[String] = js.native
  /** Specifies the selected cell information on rendering Gantt.
    */
  var selectedCellIndexes: js.UndefOr[js.Array[SelectedCellIndex]] = js.native
  /** Specifies the selected row Index in Gantt , the row with given index will highlighted
    * @Default {-1}
    */
  var selectedRowIndex: js.UndefOr[Double] = js.native
  /** Specifies the type of selection whether to select row or cell.
    * @Default {ej.Gantt.SelectionMode.Row}
    */
  var selectionMode: js.UndefOr[SelectionMode | String] = js.native
  /** Specifies the row selection type.
    * @Default {ej.Gantt.SelectionType.Single}
    */
  var selectionType: js.UndefOr[SelectionType | String] = js.native
  /** Enables or disables the column chooser.
    * @Default {false}
    */
  var showColumnChooser: js.UndefOr[Boolean] = js.native
  /** Enables/disables the options for inserting , deleting and renaming  columns.
    * @Default {false}
    */
  var showColumnOptions: js.UndefOr[Boolean] = js.native
  /** Specifies the template for cell tooltip
    * @Default {true}
    */
  var showGridCellTooltip: js.UndefOr[Boolean] = js.native
  /** Specifies whether to show grid cell tooltip over expander cell alone.
    * @Default {true}
    */
  var showGridExpandCellTooltip: js.UndefOr[Boolean] = js.native
  /** Specifies whether display task progress inside taskbar.
    * @Default {true}
    */
  var showProgressStatus: js.UndefOr[Boolean] = js.native
  /** Specifies whether to display resource names for a task beside taskbar.
    * @Default {true}
    */
  var showResourceNames: js.UndefOr[Boolean] = js.native
  /** Specifies whether to display task name beside task bar.
    * @Default {true}
    */
  var showTaskNames: js.UndefOr[Boolean] = js.native
  /** Specifies the size option of Gantt control.
    */
  var sizeSettings: js.UndefOr[SizeSettings] = js.native
  /** Specifies the sorting options for Gantt.
    */
  var sortSettings: js.UndefOr[SortSettings] = js.native
  /** Specifies splitter position in Gantt.
    * @Default {null}
    */
  var splitterPosition: js.UndefOr[String] = js.native
  /** Triggered after splitter resizing action in Gantt
    */
  var splitterResized: js.UndefOr[js.Function1[/* e */ SplitterResizedEventArgs, Unit]] = js.native
  /** Option to configure the splitter position.
    */
  var splitterSettings: js.UndefOr[SplitterSettings] = js.native
  /** Specifies the mapping property path for start date of a task in datasource
    */
  var startDateMapping: js.UndefOr[String] = js.native
  /** Specifies the options for striplines
    * @Default {[]}
    */
  var stripLines: js.UndefOr[js.Array[StripLine]] = js.native
  /** Default Value
    */
  var taskCollectionMapping: js.UndefOr[String] = js.native
  /** Specifies the mapping property path for task Id in datasource
    */
  var taskIdMapping: js.UndefOr[String] = js.native
  /** Specifies the mapping property path for task name in datasource
    */
  var taskNameMapping: js.UndefOr[String] = js.native
  /** Specifies the task scheduling mode for a project and this will be set to all the tasks available in the project
    * @Default {ej.Gantt.TaskSchedulingMode.Auto}
    */
  var taskSchedulingMode: js.UndefOr[TaskSchedulingMode | String] = js.native
  /** Specifies the mapping property path for the task scheduling mode for a task in datasource
    * @Default {auto}
    */
  var taskSchedulingModeMapping: js.UndefOr[String] = js.native
  /** Specifies the nature of a task for calculating the work,  and it can fixed duration, fixed work and fixed resource unit
    * @Default {ej.Gantt.TaskType.FixedUnit}
    */
  var taskType: js.UndefOr[TaskType | String] = js.native
  /** Specifies the background of the taskbar in Gantt
    */
  var taskbarBackground: js.UndefOr[String] = js.native
  /** Triggered when taskbar item is clicked in Gantt.
    */
  var taskbarClick: js.UndefOr[js.Function1[/* e */ TaskbarClickEventArgs, Unit]] = js.native
  /** Triggered after completing the editing operation in taskbar
    */
  var taskbarEdited: js.UndefOr[js.Function1[/* e */ TaskbarEditedEventArgs, Unit]] = js.native
  /** Triggered while editing the Gantt chart (dragging, resizing the taskbar )
    */
  var taskbarEditing: js.UndefOr[js.Function1[/* e */ TaskbarEditingEventArgs, Unit]] = js.native
  /** Specifies the template script for customized tooltip for taskbar editing in Gantt
    */
  var taskbarEditingTooltipTemplate: js.UndefOr[String] = js.native
  /** Specifies the template Id for customized tooltip for taskbar editing in Gantt
    */
  var taskbarEditingTooltipTemplateId: js.UndefOr[String] = js.native
  /** Specifies the height of taskBar in Gantt.
    * @Default {20}
    */
  var taskbarHeight: js.UndefOr[Double] = js.native
  /** To Specify the JsRender script Id to customize the task bar with our preference
    */
  var taskbarTemplate: js.UndefOr[String] = js.native
  /** Specifies the template for tooltip on mouse action on taskbars
    */
  var taskbarTooltipTemplate: js.UndefOr[String] = js.native
  /** Specifies the template id for tooltip on mouse action on taskbars
    */
  var taskbarTooltipTemplateId: js.UndefOr[String] = js.native
  /** Triggered when toolbar item is clicked in Gantt.
    */
  var toolbarClick: js.UndefOr[js.Function1[/* e */ ToolbarClickEventArgs, Unit]] = js.native
  /** Specifies the toolbarSettings options.
    */
  var toolbarSettings: js.UndefOr[ToolbarSettings] = js.native
  /** Specifies the tree expander column in Gantt
    * @Default {0}
    */
  var treeColumnIndex: js.UndefOr[Double] = js.native
  /** Enables or disables the schedule date validation while connecting a manually scheduled task with predecessor
    * @Default {false}
    */
  var validateManualTasksOnLinking: js.UndefOr[Boolean] = js.native
  /** Specifies the view type for a project in the Gantt.
    * @Default {ej.Gantt.ViewType.ProjectView}
    */
  var viewType: js.UndefOr[ViewType | String] = js.native
  /** Specifies the weekendBackground color in Gantt
    * @Default {#F2F2F2}
    */
  var weekendBackground: js.UndefOr[String] = js.native
  /** Specifies the mapping property path for the work field of a task in the data source. When it is mapped the end date and duration for a task will be calculated automatically.
    */
  var workMapping: js.UndefOr[String] = js.native
  /** Specifies the unit for the work involved in a task and it can be day, hour or minute
    * @Default {ej.Gantt.WorkUnit.Hour}
    */
  var workUnit: js.UndefOr[WorkUnit | String] = js.native
  /** Gets or sets the working days of a week in a project.
    * @Default {[Monday,Tuesday,Wednesday,Thursday,Friday]}
    */
  var workWeek: js.UndefOr[js.Array[_]] = js.native
  /** Specifies the working time schedule of day
    * @Default {ej.Gantt.workingTimeScale.TimeScale8Hours}
    */
  var workingTimeScale: js.UndefOr[typingsSlinky.ejWebAll.ej.Gantt.workingTimeScale | String] = js.native
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
    def withActionBegin(value: /* e */ ActionBeginEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionBegin")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutActionBegin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionBegin")(js.undefined)
        ret
    }
    @scala.inline
    def withActionComplete(value: /* e */ ActionCompleteEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionComplete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutActionComplete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionComplete")(js.undefined)
        ret
    }
    @scala.inline
    def withAddDialogFields(value: js.Array[AddDialogField]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addDialogFields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddDialogFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addDialogFields")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowColumnResize(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowColumnResize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowColumnResize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowColumnResize")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowDragAndDrop(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowDragAndDrop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowDragAndDrop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowDragAndDrop")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowGanttChartEditing(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowGanttChartEditing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowGanttChartEditing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowGanttChartEditing")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowKeyboardNavigation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowKeyboardNavigation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowKeyboardNavigation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowKeyboardNavigation")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowMultiSorting(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowMultiSorting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowMultiSorting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowMultiSorting")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowMultipleExporting(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowMultipleExporting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowMultipleExporting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowMultipleExporting")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowSelection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowSelection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowSelection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowSelection")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowSorting(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowSorting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowSorting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowSorting")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowUnscheduledTask(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowUnscheduledTask")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowUnscheduledTask: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowUnscheduledTask")(js.undefined)
        ret
    }
    @scala.inline
    def withBaselineColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baselineColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaselineColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baselineColor")(js.undefined)
        ret
    }
    @scala.inline
    def withBaselineEndDateMapping(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baselineEndDateMapping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaselineEndDateMapping: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baselineEndDateMapping")(js.undefined)
        ret
    }
    @scala.inline
    def withBaselineStartDateMapping(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baselineStartDateMapping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaselineStartDateMapping: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baselineStartDateMapping")(js.undefined)
        ret
    }
    @scala.inline
    def withBeginEdit(value: /* e */ BeginEditEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beginEdit")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBeginEdit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beginEdit")(js.undefined)
        ret
    }
    @scala.inline
    def withCellSelected(value: /* e */ CellSelectedEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellSelected")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCellSelected: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellSelected")(js.undefined)
        ret
    }
    @scala.inline
    def withCellSelecting(value: /* e */ CellSelectingEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellSelecting")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCellSelecting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellSelecting")(js.undefined)
        ret
    }
    @scala.inline
    def withCellTooltipTemplate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellTooltipTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCellTooltipTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellTooltipTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withChildMapping(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childMapping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildMapping: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childMapping")(js.undefined)
        ret
    }
    @scala.inline
    def withCollapsed(value: /* e */ CollapsedEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapsed")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCollapsed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapsed")(js.undefined)
        ret
    }
    @scala.inline
    def withCollapsing(value: /* e */ CollapsingEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapsing")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCollapsing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapsing")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnDialogFields(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnDialogFields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnDialogFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnDialogFields")(js.undefined)
        ret
    }
    @scala.inline
    def withConnectorLineBackground(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectorLineBackground")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectorLineBackground: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectorLineBackground")(js.undefined)
        ret
    }
    @scala.inline
    def withConnectorlineWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectorlineWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectorlineWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectorlineWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withContextMenuOpen(value: /* e */ ContextMenuOpenEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextMenuOpen")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutContextMenuOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextMenuOpen")(js.undefined)
        ret
    }
    @scala.inline
    def withCreate(value: /* e */ CreateEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCreate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.undefined)
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
    def withDataSource(value: js.Array[_]): Self = {
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
    def withDateFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDateFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withDayWorkingTime(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dayWorkingTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDayWorkingTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dayWorkingTime")(js.undefined)
        ret
    }
    @scala.inline
    def withDragTooltip(value: DragTooltip): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragTooltip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDragTooltip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragTooltip")(js.undefined)
        ret
    }
    @scala.inline
    def withDurationMapping(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("durationMapping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDurationMapping: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("durationMapping")(js.undefined)
        ret
    }
    @scala.inline
    def withDurationUnit(value: DurationUnit | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("durationUnit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDurationUnit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("durationUnit")(js.undefined)
        ret
    }
    @scala.inline
    def withDurationUnitMapping(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("durationUnitMapping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDurationUnitMapping: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("durationUnitMapping")(js.undefined)
        ret
    }
    @scala.inline
    def withEditDialogFields(value: js.Array[EditDialogField]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editDialogFields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEditDialogFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editDialogFields")(js.undefined)
        ret
    }
    @scala.inline
    def withEditSettings(value: EditSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEditSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableAltRow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableAltRow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableAltRow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableAltRow")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableCollapseAll(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableCollapseAll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableCollapseAll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableCollapseAll")(js.undefined)
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
    def withEnablePredecessorValidation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enablePredecessorValidation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnablePredecessorValidation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enablePredecessorValidation")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableProgressBarResizing(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableProgressBarResizing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableProgressBarResizing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableProgressBarResizing")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableResize(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableResize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableResize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableResize")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableSerialNumber(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableSerialNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableSerialNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableSerialNumber")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableTaskbarDragTooltip(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableTaskbarDragTooltip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableTaskbarDragTooltip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableTaskbarDragTooltip")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableTaskbarTooltip(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableTaskbarTooltip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableTaskbarTooltip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableTaskbarTooltip")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableVirtualization(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableVirtualization")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableVirtualization: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableVirtualization")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableWBS(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableWBS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableWBS: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableWBS")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableWBSPredecessor(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableWBSPredecessor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableWBSPredecessor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableWBSPredecessor")(js.undefined)
        ret
    }
    @scala.inline
    def withEndDateMapping(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endDateMapping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndDateMapping: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endDateMapping")(js.undefined)
        ret
    }
    @scala.inline
    def withEndEdit(value: /* e */ EndEditEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endEdit")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutEndEdit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endEdit")(js.undefined)
        ret
    }
    @scala.inline
    def withExpandStateMapping(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandStateMapping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpandStateMapping: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandStateMapping")(js.undefined)
        ret
    }
    @scala.inline
    def withExpanded(value: /* e */ ExpandedEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expanded")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutExpanded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expanded")(js.undefined)
        ret
    }
    @scala.inline
    def withExpanding(value: /* e */ ExpandingEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expanding")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutExpanding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expanding")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterSettings(value: FilterSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupCollection(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupCollection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupCollection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupCollection")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupIdMapping(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupIdMapping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupIdMapping: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupIdMapping")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupNameMapping(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupNameMapping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupNameMapping: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupNameMapping")(js.undefined)
        ret
    }
    @scala.inline
    def withHighlightNonWorkingTime(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightNonWorkingTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHighlightNonWorkingTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightNonWorkingTime")(js.undefined)
        ret
    }
    @scala.inline
    def withHighlightWeekends(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightWeekends")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHighlightWeekends: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightWeekends")(js.undefined)
        ret
    }
    @scala.inline
    def withHolidays(value: js.Array[Holiday]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("holidays")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHolidays: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("holidays")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeWeekend(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeWeekend")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeWeekend: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeWeekend")(js.undefined)
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
    def withLeftTaskLabelMapping(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftTaskLabelMapping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeftTaskLabelMapping: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftTaskLabelMapping")(js.undefined)
        ret
    }
    @scala.inline
    def withLeftTaskLabelTemplate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftTaskLabelTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeftTaskLabelTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftTaskLabelTemplate")(js.undefined)
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
    def withMilestoneMapping(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("milestoneMapping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMilestoneMapping: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("milestoneMapping")(js.undefined)
        ret
    }
    @scala.inline
    def withMilestoneTemplate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("milestoneTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMilestoneTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("milestoneTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withNonWorkingBackground(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonWorkingBackground")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNonWorkingBackground: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonWorkingBackground")(js.undefined)
        ret
    }
    @scala.inline
    def withNotesMapping(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notesMapping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotesMapping: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notesMapping")(js.undefined)
        ret
    }
    @scala.inline
    def withParentProgressbarBackground(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentProgressbarBackground")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParentProgressbarBackground: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentProgressbarBackground")(js.undefined)
        ret
    }
    @scala.inline
    def withParentTaskIdMapping(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentTaskIdMapping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParentTaskIdMapping: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentTaskIdMapping")(js.undefined)
        ret
    }
    @scala.inline
    def withParentTaskbarBackground(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentTaskbarBackground")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParentTaskbarBackground: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentTaskbarBackground")(js.undefined)
        ret
    }
    @scala.inline
    def withParentTaskbarTemplate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentTaskbarTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParentTaskbarTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentTaskbarTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withPredecessorMapping(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("predecessorMapping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPredecessorMapping: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("predecessorMapping")(js.undefined)
        ret
    }
    @scala.inline
    def withPredecessorTooltipTemplate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("predecessorTooltipTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPredecessorTooltipTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("predecessorTooltipTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withProgressMapping(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressMapping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProgressMapping: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressMapping")(js.undefined)
        ret
    }
    @scala.inline
    def withProgressbarBackground(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressbarBackground")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProgressbarBackground: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressbarBackground")(js.undefined)
        ret
    }
    @scala.inline
    def withProgressbarHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressbarHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProgressbarHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressbarHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withProgressbarTooltipTemplate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressbarTooltipTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProgressbarTooltipTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressbarTooltipTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withProgressbarTooltipTemplateId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressbarTooltipTemplateId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProgressbarTooltipTemplateId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressbarTooltipTemplateId")(js.undefined)
        ret
    }
    @scala.inline
    def withQuery(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuery: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(js.undefined)
        ret
    }
    @scala.inline
    def withQueryCellInfo(value: /* e */ QueryCellInfoEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryCellInfo")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutQueryCellInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryCellInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withQueryTaskbarInfo(value: /* e */ QueryTaskbarInfoEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryTaskbarInfo")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutQueryTaskbarInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryTaskbarInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withReadOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReadOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderBaseline(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderBaseline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenderBaseline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderBaseline")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceCollectionMapping(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceCollectionMapping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceCollectionMapping: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceCollectionMapping")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceIdMapping(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceIdMapping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceIdMapping: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceIdMapping")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceInfoMapping(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceInfoMapping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceInfoMapping: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceInfoMapping")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceNameMapping(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceNameMapping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceNameMapping: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceNameMapping")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceUnitMapping(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceUnitMapping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceUnitMapping: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceUnitMapping")(js.undefined)
        ret
    }
    @scala.inline
    def withResources(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resources")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResources: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resources")(js.undefined)
        ret
    }
    @scala.inline
    def withRightTaskLabelMapping(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightTaskLabelMapping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRightTaskLabelMapping: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightTaskLabelMapping")(js.undefined)
        ret
    }
    @scala.inline
    def withRightTaskLabelTemplate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightTaskLabelTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRightTaskLabelTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightTaskLabelTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withRoundOffDayworkingTime(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roundOffDayworkingTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoundOffDayworkingTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roundOffDayworkingTime")(js.undefined)
        ret
    }
    @scala.inline
    def withRowDataBound(value: /* e */ RowDataBoundEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowDataBound")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRowDataBound: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowDataBound")(js.undefined)
        ret
    }
    @scala.inline
    def withRowDrag(value: /* e */ RowDragEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowDrag")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRowDrag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowDrag")(js.undefined)
        ret
    }
    @scala.inline
    def withRowDragStart(value: /* e */ RowDragStartEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowDragStart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRowDragStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowDragStart")(js.undefined)
        ret
    }
    @scala.inline
    def withRowDragStop(value: /* e */ RowDragStopEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowDragStop")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRowDragStop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowDragStop")(js.undefined)
        ret
    }
    @scala.inline
    def withRowHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withRowSelected(value: /* e */ RowSelectedEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowSelected")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRowSelected: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowSelected")(js.undefined)
        ret
    }
    @scala.inline
    def withRowSelecting(value: /* e */ RowSelectingEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowSelecting")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRowSelecting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowSelecting")(js.undefined)
        ret
    }
    @scala.inline
    def withScheduleEndDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scheduleEndDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScheduleEndDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scheduleEndDate")(js.undefined)
        ret
    }
    @scala.inline
    def withScheduleHeaderSettings(value: ScheduleHeaderSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scheduleHeaderSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScheduleHeaderSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scheduleHeaderSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withScheduleStartDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scheduleStartDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScheduleStartDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scheduleStartDate")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedCellIndexes(value: js.Array[SelectedCellIndex]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedCellIndexes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedCellIndexes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedCellIndexes")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedRowIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedRowIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedRowIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedRowIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectionMode(value: SelectionMode | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectionMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionMode")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectionType(value: SelectionType | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectionType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionType")(js.undefined)
        ret
    }
    @scala.inline
    def withShowColumnChooser(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showColumnChooser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowColumnChooser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showColumnChooser")(js.undefined)
        ret
    }
    @scala.inline
    def withShowColumnOptions(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showColumnOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowColumnOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showColumnOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withShowGridCellTooltip(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showGridCellTooltip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowGridCellTooltip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showGridCellTooltip")(js.undefined)
        ret
    }
    @scala.inline
    def withShowGridExpandCellTooltip(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showGridExpandCellTooltip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowGridExpandCellTooltip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showGridExpandCellTooltip")(js.undefined)
        ret
    }
    @scala.inline
    def withShowProgressStatus(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showProgressStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowProgressStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showProgressStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withShowResourceNames(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showResourceNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowResourceNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showResourceNames")(js.undefined)
        ret
    }
    @scala.inline
    def withShowTaskNames(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showTaskNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowTaskNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showTaskNames")(js.undefined)
        ret
    }
    @scala.inline
    def withSizeSettings(value: SizeSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizeSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSizeSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizeSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withSortSettings(value: SortSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withSplitterPosition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("splitterPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSplitterPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("splitterPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withSplitterResized(value: /* e */ SplitterResizedEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("splitterResized")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSplitterResized: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("splitterResized")(js.undefined)
        ret
    }
    @scala.inline
    def withSplitterSettings(value: SplitterSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("splitterSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSplitterSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("splitterSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withStartDateMapping(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startDateMapping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartDateMapping: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startDateMapping")(js.undefined)
        ret
    }
    @scala.inline
    def withStripLines(value: js.Array[StripLine]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stripLines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStripLines: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stripLines")(js.undefined)
        ret
    }
    @scala.inline
    def withTaskCollectionMapping(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskCollectionMapping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTaskCollectionMapping: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskCollectionMapping")(js.undefined)
        ret
    }
    @scala.inline
    def withTaskIdMapping(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskIdMapping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTaskIdMapping: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskIdMapping")(js.undefined)
        ret
    }
    @scala.inline
    def withTaskNameMapping(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskNameMapping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTaskNameMapping: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskNameMapping")(js.undefined)
        ret
    }
    @scala.inline
    def withTaskSchedulingMode(value: TaskSchedulingMode | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskSchedulingMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTaskSchedulingMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskSchedulingMode")(js.undefined)
        ret
    }
    @scala.inline
    def withTaskSchedulingModeMapping(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskSchedulingModeMapping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTaskSchedulingModeMapping: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskSchedulingModeMapping")(js.undefined)
        ret
    }
    @scala.inline
    def withTaskType(value: TaskType | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTaskType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskType")(js.undefined)
        ret
    }
    @scala.inline
    def withTaskbarBackground(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskbarBackground")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTaskbarBackground: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskbarBackground")(js.undefined)
        ret
    }
    @scala.inline
    def withTaskbarClick(value: /* e */ TaskbarClickEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskbarClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutTaskbarClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskbarClick")(js.undefined)
        ret
    }
    @scala.inline
    def withTaskbarEdited(value: /* e */ TaskbarEditedEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskbarEdited")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutTaskbarEdited: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskbarEdited")(js.undefined)
        ret
    }
    @scala.inline
    def withTaskbarEditing(value: /* e */ TaskbarEditingEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskbarEditing")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutTaskbarEditing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskbarEditing")(js.undefined)
        ret
    }
    @scala.inline
    def withTaskbarEditingTooltipTemplate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskbarEditingTooltipTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTaskbarEditingTooltipTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskbarEditingTooltipTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withTaskbarEditingTooltipTemplateId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskbarEditingTooltipTemplateId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTaskbarEditingTooltipTemplateId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskbarEditingTooltipTemplateId")(js.undefined)
        ret
    }
    @scala.inline
    def withTaskbarHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskbarHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTaskbarHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskbarHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withTaskbarTemplate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskbarTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTaskbarTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskbarTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withTaskbarTooltipTemplate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskbarTooltipTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTaskbarTooltipTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskbarTooltipTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withTaskbarTooltipTemplateId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskbarTooltipTemplateId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTaskbarTooltipTemplateId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskbarTooltipTemplateId")(js.undefined)
        ret
    }
    @scala.inline
    def withToolbarClick(value: /* e */ ToolbarClickEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbarClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutToolbarClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbarClick")(js.undefined)
        ret
    }
    @scala.inline
    def withToolbarSettings(value: ToolbarSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbarSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToolbarSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbarSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withTreeColumnIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("treeColumnIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTreeColumnIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("treeColumnIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withValidateManualTasksOnLinking(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validateManualTasksOnLinking")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidateManualTasksOnLinking: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validateManualTasksOnLinking")(js.undefined)
        ret
    }
    @scala.inline
    def withViewType(value: ViewType | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutViewType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewType")(js.undefined)
        ret
    }
    @scala.inline
    def withWeekendBackground(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weekendBackground")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWeekendBackground: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weekendBackground")(js.undefined)
        ret
    }
    @scala.inline
    def withWorkMapping(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workMapping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkMapping: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workMapping")(js.undefined)
        ret
    }
    @scala.inline
    def withWorkUnit(value: WorkUnit | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workUnit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkUnit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workUnit")(js.undefined)
        ret
    }
    @scala.inline
    def withWorkWeek(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workWeek")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkWeek: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workWeek")(js.undefined)
        ret
    }
    @scala.inline
    def withWorkingTimeScale(value: workingTimeScale | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workingTimeScale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkingTimeScale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workingTimeScale")(js.undefined)
        ret
    }
  }
  
}

