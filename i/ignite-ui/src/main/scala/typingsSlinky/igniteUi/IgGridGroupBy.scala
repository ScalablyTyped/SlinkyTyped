package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgGridGroupBy
  extends /**
	 * Option for JSONPDataSourceSettings
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Specifies the collapse indicator tooltip for grouped rows. Use option [locale.collapseTooltip](ui.iggridgroupby#options:locale.collapseTooltip).
  	 */
  var collapseTooltip: js.UndefOr[String] = js.native
  /**
  	 * Configures individual column settings.
  	 *
  	 */
  var columnSettings: js.UndefOr[IgGridGroupByColumnSettings] = js.native
  /**
  	 * default sort order - ascending or descending
  	 *
  	 *
  	 * Valid values:
  	 * "asc" The group is sorted in ascending order.
  	 * "desc" The group is sorted in descending order.
  	 */
  var defaultSortingDirection: js.UndefOr[String] = js.native
  /**
  	 * Name of the dialog widget to be used. It should inherit from $.ui.igGridModalDialog. Checkout the [Extending igGrid Modal Dialog](http://www.igniteui.com/help/extending-iggrid-modal-dialog) topic for details.
  	 *
  	 */
  var dialogWidget: js.UndefOr[String] = js.native
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Specifies caption for the hyperlink which opens the GroupBy Dialog. Use option [locale.emptyGroupByAreaContentSelectColumnsCaption](ui.iggridgroupby#options:locale.emptyGroupByAreaContentSelectColumnsCaption).
  	 */
  var emptyGroupByAreaContentSelectColumnsCaption: js.UndefOr[String] = js.native
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Specifies the expand indicator tooltip for grouped rows. Use option [locale.expandTooltip](ui.iggridgroupby#options:locale.expandTooltip).
  	 */
  var expandTooltip: js.UndefOr[String] = js.native
  /**
  	 * Specifies if grouped rows will have an expander image that will allow end users to expand and collapse them. This option can be set only at initialization.
  	 *
  	 */
  var expansionIndicatorVisibility: js.UndefOr[Boolean] = js.native
  /**
  	 * Sets the place in the grid where the GroupBy area will be
  	 *
  	 *
  	 * Valid values:
  	 * "top" the GroupBy area will be rendered above the grid headers
  	 * "hidden" the GroupBy area will not be rendered
  	 * "bottom" the GroupBy area will be rendered below the grid footer (and above the pager, if any)
  	 */
  var groupByAreaVisibility: js.UndefOr[String] = js.native
  /**
  	 * Controls containment behavior for the GroupBy Dialog.
  	 *
  	 *
  	 * Valid values:
  	 * "owner" The GroupBy Dialog will be draggable only in the grid area
  	 * "window" The GroupBy Dialog will be draggable in the whole window area
  	 */
  var groupByDialogContainment: js.UndefOr[String] = js.native
  /**
  	 * By default, the column width for the header is taken. If this is specified it's used for all headers.
  	 *
  	 */
  var groupByLabelWidth: js.UndefOr[Double] = js.native
  /**
  	 * URL param name which specifies a GroupBy [expression](ig.datasource#options:settings.sorting.expressions). When groupByUrlKey, [groupByUrlKeyAscValue](ui.iggridgroupby#options:groupByUrlKeyAscValue) and [groupByUrlKeyDescValue](ui.iggridgroupby#options:groupByUrlKeyDescValue) are set the request looks like: ?<groupByUrlKey>(<columnKey>)=<groupByUrlKeyAscValue/groupByUrlKeyDescValue> (Example: ?groupby(col1)=asc). Otherwise the OData conventions for sorting params are used.
  	 *
  	 */
  var groupByUrlKey: js.UndefOr[String] = js.native
  /**
  	 * URL param value denoting ascending grouping. When [groupByUrlKey](ui.iggridgroupby#options:groupByUrlKey), groupByUrlKeyAscValue and [groupByUrlKeyDescValue](ui.iggridgroupby#options:groupByUrlKeyDescValue) are set the request looks like: ?<groupByUrlKey>(<columnKey>)=<groupByUrlKeyAscValue/groupByUrlKeyDescValue> (Example: ?groupby(col1)=asc). Otherwise the OData conventions for sorting params are used.
  	 *
  	 */
  var groupByUrlKeyAscValue: js.UndefOr[String] = js.native
  /**
  	 * URL param value denoting descending grouping. When [groupByUrlKey](ui.iggridgroupby#options:groupByUrlKey), [groupByUrlKeyAscValue](ui.iggridgroupby#options:groupByUrlKeyAscValue) and groupByUrlKeyDescValue are set the request looks like: ?<groupByUrlKey>(<columnKey>)=<groupByUrlKeyAscValue/groupByUrlKeyDescValue> (Example: ?groupby(col1)=asc). Otherwise the OData conventions for sorting params are used.
  	 *
  	 */
  var groupByUrlKeyDescValue: js.UndefOr[String] = js.native
  /**
  	 * Specifies default summaries that will appear when grouping by a column on the bottom of each group as a row.This option has a lower priority than the groupSummaries defined under columnSettings for each column.
  	 * All default summaries are defined under $.ig.util.defaultSummaryMethods
  	 *
  	 */
  var groupSummaries: js.UndefOr[js.Any] = js.native
  /**
  	 * Specifies the groupSummaries postion inside each group.
  	 *
  	 *
  	 * Valid values:
  	 * "top" One summary row will be displayed at the top for each group
  	 * "bottom"  One summary row will be displayed at the bottom for each group
  	 * "both" Two summary rows will be be display for each group. One on the top and one on the bottom.
  	 */
  var groupSummariesPosition: js.UndefOr[String] = js.native
  /**
  	 * Returns the list of currently grouped columns. The option is read-only and cannot be set at initialization or at runtime.
  	 *
  	 */
  var groupedColumns: js.UndefOr[js.Array[IgGridGroupByGroupedColumn]] = js.native
  /**
  	 * Event which is fired when the groupedColumns collection has changed. This event is fired also when group/ungroup from GroupBy modal dialog but key, layout and grid are not set
  	 */
  var groupedColumnsChanged: js.UndefOr[GroupedColumnsChangedEvent] = js.native
  /**
  	 * Event which is fired when the grouped columns collection is about to change. This event is fired even when button OK is clicked from the modal dialog(after event modalDialogButtonApplyClick is fired)
  	 */
  var groupedColumnsChanging: js.UndefOr[GroupedColumnsChangingEvent] = js.native
  /**
  	 * Template for the grouped row's text. Variables available for the template are ${key}, ${val} and ${count}.
  	 *
  	 */
  var groupedRowTextTemplate: js.UndefOr[String] = js.native
  /**
  	 * Specifies the indentation for a grouped row. If several columns are grouped, the total indentation will grow
  	 *
  	 */
  var indentation: js.UndefOr[Double] = js.native
  /**
  	 * Enables/disables feature inheritance for the child layouts. NOTE: It only applies for igHierarchicalGrid.
  	 */
  var inherit: js.UndefOr[Boolean] = js.native
  /**
  	 * Specifies if after grouping, the grouped rows will be initially expanded or collapsed.
  	 *
  	 */
  var initialExpand: js.UndefOr[Boolean] = js.native
  /**
  	 * Specifies the opacity of the drag markup, while a column header is being dragged. The value must be between 0 and 1.
  	 *
  	 */
  var labelDragHelperOpacity: js.UndefOr[Double] = js.native
  /**
  	 * Set/Get the locale language setting for the widget.
  	 *
  	 */
  var language: js.UndefOr[String] = js.native
  var locale: js.UndefOr[IgGridGroupByLocale] = js.native
  /**
  	 * Specifies time in milliseconds for animation duration to show/hide modal dialog
  	 *
  	 */
  var modalDialogAnimationDuration: js.UndefOr[Double] = js.native
  /**
  	 * Event fired when the button is Apply is clicked.
  	 */
  var modalDialogButtonApplyClick: js.UndefOr[ModalDialogButtonApplyClickEvent] = js.native
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Specifies text of button which cancel changes in the GroupBy Dialog. Use option [locale.modalDialogButtonApplyText](ui.iggridgroupby#options:locale.modalDialogButtonApplyText).
  	 */
  var modalDialogButtonApplyText: js.UndefOr[String] = js.native
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Specifies text of button which cancel changes in the GroupBy Dialog. Use option [locale.modalDialogButtonCancelText](ui.iggridgroupby#options:locale.modalDialogButtonCancelText).
  	 */
  var modalDialogButtonCancelText: js.UndefOr[String] = js.native
  /**
  	 * Event fired when reset button is clicked.
  	 */
  var modalDialogButtonResetClick: js.UndefOr[ModalDialogButtonResetClickEvent] = js.native
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Specifies caption for each ascending sorted column in GroupBy Dialog. Use option [locale.modalDialogCaptionButtonAsc](ui.iggridgroupby#options:locale.modalDialogCaptionButtonAsc).
  	 */
  var modalDialogCaptionButtonAsc: js.UndefOr[String] = js.native
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Specifies caption for each descending sorted column in GroupBy Dialog. Use option [locale.modalDialogCaptionButtonDesc](ui.iggridgroupby#options:locale.modalDialogCaptionButtonDesc).
  	 */
  var modalDialogCaptionButtonDesc: js.UndefOr[String] = js.native
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Specifies caption button ungroup in GroupBy Dialog. Use option [locale.modalDialogCaptionButtonUngroup](ui.iggridgroupby#options:locale.modalDialogCaptionButtonUngroup).
  	 */
  var modalDialogCaptionButtonUngroup: js.UndefOr[String] = js.native
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Specifies caption text for the GroupBy Dialog. Use option [locale.modalDialogCaptionText](ui.iggridgroupby#options:locale.modalDialogCaptionText).
  	 */
  var modalDialogCaptionText: js.UndefOr[String] = js.native
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Specifies label for "Clear all" button in the GroupBy Dialog. Use option [locale.modalDialogClearAllButtonLabel](ui.iggridgroupby#options:locale.modalDialogClearAllButtonLabel).
  	 */
  var modalDialogClearAllButtonLabel: js.UndefOr[String] = js.native
  /**
  	 * Event fired after the modal dialog has been closed.
  	 */
  var modalDialogClosed: js.UndefOr[ModalDialogClosedEvent] = js.native
  /**
  	 * Event fired before the modal dialog is closed.
  	 */
  var modalDialogClosing: js.UndefOr[ModalDialogClosingEvent] = js.native
  /**
  	 * Event fired after the contents of the modal dialog are rendered.
  	 */
  var modalDialogContentsRendered: js.UndefOr[ModalDialogContentsRenderedEvent] = js.native
  /**
  	 * Event fired before the contents of the modal dialog are rendered.
  	 */
  var modalDialogContentsRendering: js.UndefOr[ModalDialogContentsRenderingEvent] = js.native
  /**
  	 * Specifies width of layouts dropdown in the GroupBy Dialog
  	 *
  	 */
  var modalDialogDropDownAreaWidth: js.UndefOr[Double] = js.native
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Specifies caption of layouts dropdown button in the GroupBy Dialog. Use option [locale.modalDialogDropDownButtonCaption](ui.iggridgroupby#options:locale.modalDialogDropDownButtonCaption).
  	 */
  var modalDialogDropDownButtonCaption: js.UndefOr[String] = js.native
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Specifies label for layouts dropdown in the GroupBy Dialog.  Use option [locale.modalDialogDropDownLabel](ui.iggridgroupby#options:locale.modalDialogDropDownLabel).
  	 */
  var modalDialogDropDownLabel: js.UndefOr[String] = js.native
  /**
  	 * Specifies width of layouts dropdown in the GroupBy Dialog
  	 *
  	 */
  var modalDialogDropDownWidth: js.UndefOr[Double] = js.native
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Specifies the text of GroupBy button in the GroupBy Dialog. Use option [locale.modalDialogGroupByButtonText](ui.iggridgroupby#options:locale.modalDialogGroupByButtonText).
  	 */
  var modalDialogGroupByButtonText: js.UndefOr[String] = js.native
  /**
  	 * Enables/disables immediate column grouping/ungrouping. When false operation is delayed until after "Apply" button is clicked by the user.
  	 *
  	 */
  var modalDialogGroupByOnClick: js.UndefOr[Boolean] = js.native
  /**
  	 * Event fired when column in modal dialog is clicked to be grouped.
  	 */
  var modalDialogGroupColumn: js.UndefOr[ModalDialogGroupColumnEvent] = js.native
  /**
  	 * Event fired when column in modal dialog is clicked to be grouped.
  	 */
  var modalDialogGroupingColumn: js.UndefOr[ModalDialogGroupingColumnEvent] = js.native
  /**
  	 * Specifies height of the GroupBy Dialog
  	 *
  	 *
  	 * Valid values:
  	 * "string" The dialog height can be set in pixels (px) or percentage (%). Example values: "800px", "800" (defaults to pixels), "100%".
  	 * "number" The dialog height can be set in pixels as a number. Example values: 800, 700.
  	 */
  var modalDialogHeight: js.UndefOr[String | Double] = js.native
  /**
  	 * Event fired every time the GroupBy Dialog changes its position.
  	 */
  var modalDialogMoving: js.UndefOr[ModalDialogMovingEvent] = js.native
  /**
  	 * Event fired after the modal dialog is already opened.
  	 */
  var modalDialogOpened: js.UndefOr[ModalDialogOpenedEvent] = js.native
  /**
  	 * Event fired before the modal dialog is opened.
  	 */
  var modalDialogOpening: js.UndefOr[ModalDialogOpeningEvent] = js.native
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Specifies caption of layouts dropdown button in the GroupBy Dialog. Use option [locale.modalDialogRootLevelHierarchicalGrid](ui.iggridgroupby#options:locale.modalDialogRootLevelHierarchicalGrid).
  	 */
  var modalDialogRootLevelHierarchicalGrid: js.UndefOr[String] = js.native
  /**
  	 * Event fired when column in modal dialog is sorted.
  	 */
  var modalDialogSortGroupedColumn: js.UndefOr[ModalDialogSortGroupedColumnEvent] = js.native
  /**
  	 * Event fired when column in modal dialog is clicked to be ungrouped.
  	 */
  var modalDialogUngroupColumn: js.UndefOr[ModalDialogUngroupColumnEvent] = js.native
  /**
  	 * Event fired when column in modal dialog is clicked to be ungrouped.
  	 */
  var modalDialogUngroupingColumn: js.UndefOr[ModalDialogUngroupingColumnEvent] = js.native
  /**
  	 * Specifies width of the GroupBy Dialog
  	 *
  	 *
  	 * Valid values:
  	 * "string" The dialog width can be set in pixels (px) or percentage (%). Example values: "800px", "800" (defaults to pixels), "100%".
  	 * "number" The dialog width can be set in pixels as a number. Example values: 800, 700.
  	 */
  var modalDialogWidth: js.UndefOr[String | Double] = js.native
  /**
  	 * Specifies when paging is applied and there is at least one grouped column which records should be included in page processing.
  	 *
  	 *
  	 * Valid values:
  	 * "allRecords" All records are included in page processing - data records and group-by metadata records
  	 * "dataRecordsOnly" Only data records are included in page processing(metadata group-by records are ignored)
  	 */
  var pagingMode: js.UndefOr[String] = js.native
  /**
  	 * Enables / disables GroupBy persistence between states. Checkout the [GroupBy Persistence](http://www.igniteui.com/help/iggrid-groupby-overview#groupBy-persistence) topic for details.
  	 *
  	 */
  var persist: js.UndefOr[Boolean] = js.native
  /**
  	 * Set/Get the regional setting for the widget.
  	 *
  	 */
  var regional: js.UndefOr[String | js.Object] = js.native
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Specifies the tooltip for the remove button. Use option [locale.removeButtonTooltip](ui.iggridgroupby#options:locale.removeButtonTooltip).
  	 */
  var removeButtonTooltip: js.UndefOr[String] = js.native
  /**
  	 * Specifies a key to get group by data from the remote response.
  	 *
  	 */
  var resultResponseKey: js.UndefOr[String] = js.native
  /**
  	 * Specifies the settings for GroupBy summaries.
  	 *
  	 */
  var summarySettings: js.UndefOr[IgGridGroupBySummarySettings] = js.native
  /**
  	 * Specifies whether the GroupBy operation takes place locally on client-side or remotely on server-side.
  	 *
  	 *
  	 * Valid values:
  	 * "local" Execute the GroupBy operation locally on client-side.
  	 * "remote" Execute the GroupBy operation by a request to the server.
  	 */
  var `type`: js.UndefOr[String] = js.native
  /**
  	 * Format grouped column using the formatter set in [igGrid.columns.formatter](ui.iggrid#options:columns.formatter) or [igGrid.columns.format](ui.iggrid#options:columns.format).
  	 *
  	 */
  var useGridColumnFormatter: js.UndefOr[Boolean] = js.native
}

object IgGridGroupBy {
  @scala.inline
  def apply(): IgGridGroupBy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgGridGroupBy]
  }
  @scala.inline
  implicit class IgGridGroupByOps[Self <: IgGridGroupBy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCollapseTooltip(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapseTooltip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollapseTooltip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapseTooltip")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnSettings(value: IgGridGroupByColumnSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultSortingDirection(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultSortingDirection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultSortingDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultSortingDirection")(js.undefined)
        ret
    }
    @scala.inline
    def withDialogWidget(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialogWidget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDialogWidget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialogWidget")(js.undefined)
        ret
    }
    @scala.inline
    def withEmptyGroupByAreaContentSelectColumnsCaption(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emptyGroupByAreaContentSelectColumnsCaption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmptyGroupByAreaContentSelectColumnsCaption: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emptyGroupByAreaContentSelectColumnsCaption")(js.undefined)
        ret
    }
    @scala.inline
    def withExpandTooltip(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandTooltip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpandTooltip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandTooltip")(js.undefined)
        ret
    }
    @scala.inline
    def withExpansionIndicatorVisibility(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expansionIndicatorVisibility")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpansionIndicatorVisibility: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expansionIndicatorVisibility")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupByAreaVisibility(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupByAreaVisibility")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupByAreaVisibility: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupByAreaVisibility")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupByDialogContainment(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupByDialogContainment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupByDialogContainment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupByDialogContainment")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupByLabelWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupByLabelWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupByLabelWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupByLabelWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupByUrlKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupByUrlKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupByUrlKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupByUrlKey")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupByUrlKeyAscValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupByUrlKeyAscValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupByUrlKeyAscValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupByUrlKeyAscValue")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupByUrlKeyDescValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupByUrlKeyDescValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupByUrlKeyDescValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupByUrlKeyDescValue")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupSummaries(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupSummaries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupSummaries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupSummaries")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupSummariesPosition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupSummariesPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupSummariesPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupSummariesPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupedColumns(value: js.Array[IgGridGroupByGroupedColumn]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupedColumns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupedColumns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupedColumns")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupedColumnsChanged(value: (/* event */ Event_, /* ui */ GroupedColumnsChangedEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupedColumnsChanged")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutGroupedColumnsChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupedColumnsChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupedColumnsChanging(value: (/* event */ Event_, /* ui */ GroupedColumnsChangingEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupedColumnsChanging")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutGroupedColumnsChanging: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupedColumnsChanging")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupedRowTextTemplate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupedRowTextTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupedRowTextTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupedRowTextTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withIndentation(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indentation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndentation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indentation")(js.undefined)
        ret
    }
    @scala.inline
    def withInherit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inherit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInherit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inherit")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialExpand(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialExpand")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialExpand: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialExpand")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelDragHelperOpacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelDragHelperOpacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelDragHelperOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelDragHelperOpacity")(js.undefined)
        ret
    }
    @scala.inline
    def withLanguage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLanguage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(js.undefined)
        ret
    }
    @scala.inline
    def withLocale(value: IgGridGroupByLocale): Self = {
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
    def withModalDialogAnimationDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modalDialogAnimationDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModalDialogAnimationDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modalDialogAnimationDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withModalDialogButtonApplyClick(value: (/* event */ Event_, /* ui */ ModalDialogButtonApplyClickEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modalDialogButtonApplyClick")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutModalDialogButtonApplyClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modalDialogButtonApplyClick")(js.undefined)
        ret
    }
    @scala.inline
    def withModalDialogButtonApplyText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modalDialogButtonApplyText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModalDialogButtonApplyText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modalDialogButtonApplyText")(js.undefined)
        ret
    }
    @scala.inline
    def withModalDialogButtonCancelText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modalDialogButtonCancelText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModalDialogButtonCancelText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modalDialogButtonCancelText")(js.undefined)
        ret
    }
    @scala.inline
    def withModalDialogButtonResetClick(value: (/* event */ Event_, /* ui */ ModalDialogButtonResetClickEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modalDialogButtonResetClick")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutModalDialogButtonResetClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modalDialogButtonResetClick")(js.undefined)
        ret
    }
    @scala.inline
    def withModalDialogCaptionButtonAsc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modalDialogCaptionButtonAsc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModalDialogCaptionButtonAsc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modalDialogCaptionButtonAsc")(js.undefined)
        ret
    }
    @scala.inline
    def withModalDialogCaptionButtonDesc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modalDialogCaptionButtonDesc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModalDialogCaptionButtonDesc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modalDialogCaptionButtonDesc")(js.undefined)
        ret
    }
    @scala.inline
    def withModalDialogCaptionButtonUngroup(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modalDialogCaptionButtonUngroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModalDialogCaptionButtonUngroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modalDialogCaptionButtonUngroup")(js.undefined)
        ret
    }
    @scala.inline
    def withModalDialogCaptionText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modalDialogCaptionText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModalDialogCaptionText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modalDialogCaptionText")(js.undefined)
        ret
    }
    @scala.inline
    def withModalDialogClearAllButtonLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modalDialogClearAllButtonLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModalDialogClearAllButtonLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modalDialogClearAllButtonLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withModalDialogClosed(value: (/* event */ Event_, /* ui */ ModalDialogClosedEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modalDialogClosed")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutModalDialogClosed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modalDialogClosed")(js.undefined)
        ret
    }
    @scala.inline
    def withModalDialogClosing(value: (/* event */ Event_, /* ui */ ModalDialogClosingEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modalDialogClosing")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutModalDialogClosing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modalDialogClosing")(js.undefined)
        ret
    }
    @scala.inline
    def withModalDialogContentsRendered(value: (/* event */ Event_, /* ui */ ModalDialogContentsRenderedEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modalDialogContentsRendered")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutModalDialogContentsRendered: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modalDialogContentsRendered")(js.undefined)
        ret
    }
    @scala.inline
    def withModalDialogContentsRendering(value: (/* event */ Event_, /* ui */ ModalDialogContentsRenderingEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modalDialogContentsRendering")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutModalDialogContentsRendering: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modalDialogContentsRendering")(js.undefined)
        ret
    }
    @scala.inline
    def withModalDialogDropDownAreaWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modalDialogDropDownAreaWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModalDialogDropDownAreaWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modalDialogDropDownAreaWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withModalDialogDropDownButtonCaption(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modalDialogDropDownButtonCaption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModalDialogDropDownButtonCaption: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modalDialogDropDownButtonCaption")(js.undefined)
        ret
    }
    @scala.inline
    def withModalDialogDropDownLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modalDialogDropDownLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModalDialogDropDownLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modalDialogDropDownLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withModalDialogDropDownWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modalDialogDropDownWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModalDialogDropDownWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modalDialogDropDownWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withModalDialogGroupByButtonText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modalDialogGroupByButtonText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModalDialogGroupByButtonText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modalDialogGroupByButtonText")(js.undefined)
        ret
    }
    @scala.inline
    def withModalDialogGroupByOnClick(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modalDialogGroupByOnClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModalDialogGroupByOnClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modalDialogGroupByOnClick")(js.undefined)
        ret
    }
    @scala.inline
    def withModalDialogGroupColumn(value: (/* event */ Event_, /* ui */ ModalDialogGroupColumnEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modalDialogGroupColumn")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutModalDialogGroupColumn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modalDialogGroupColumn")(js.undefined)
        ret
    }
    @scala.inline
    def withModalDialogGroupingColumn(value: (/* event */ Event_, /* ui */ ModalDialogGroupingColumnEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modalDialogGroupingColumn")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutModalDialogGroupingColumn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modalDialogGroupingColumn")(js.undefined)
        ret
    }
    @scala.inline
    def withModalDialogHeight(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modalDialogHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModalDialogHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modalDialogHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withModalDialogMoving(value: (/* event */ Event_, /* ui */ ModalDialogMovingEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modalDialogMoving")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutModalDialogMoving: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modalDialogMoving")(js.undefined)
        ret
    }
    @scala.inline
    def withModalDialogOpened(value: (/* event */ Event_, /* ui */ ModalDialogOpenedEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modalDialogOpened")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutModalDialogOpened: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modalDialogOpened")(js.undefined)
        ret
    }
    @scala.inline
    def withModalDialogOpening(value: (/* event */ Event_, /* ui */ ModalDialogOpeningEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modalDialogOpening")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutModalDialogOpening: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modalDialogOpening")(js.undefined)
        ret
    }
    @scala.inline
    def withModalDialogRootLevelHierarchicalGrid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modalDialogRootLevelHierarchicalGrid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModalDialogRootLevelHierarchicalGrid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modalDialogRootLevelHierarchicalGrid")(js.undefined)
        ret
    }
    @scala.inline
    def withModalDialogSortGroupedColumn(value: (/* event */ Event_, /* ui */ ModalDialogSortGroupedColumnEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modalDialogSortGroupedColumn")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutModalDialogSortGroupedColumn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modalDialogSortGroupedColumn")(js.undefined)
        ret
    }
    @scala.inline
    def withModalDialogUngroupColumn(value: (/* event */ Event_, /* ui */ ModalDialogUngroupColumnEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modalDialogUngroupColumn")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutModalDialogUngroupColumn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modalDialogUngroupColumn")(js.undefined)
        ret
    }
    @scala.inline
    def withModalDialogUngroupingColumn(value: (/* event */ Event_, /* ui */ ModalDialogUngroupingColumnEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modalDialogUngroupingColumn")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutModalDialogUngroupingColumn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modalDialogUngroupingColumn")(js.undefined)
        ret
    }
    @scala.inline
    def withModalDialogWidth(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modalDialogWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModalDialogWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modalDialogWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withPagingMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pagingMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPagingMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pagingMode")(js.undefined)
        ret
    }
    @scala.inline
    def withPersist(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persist")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPersist: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persist")(js.undefined)
        ret
    }
    @scala.inline
    def withRegional(value: String | js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regional")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegional: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regional")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveButtonTooltip(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeButtonTooltip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoveButtonTooltip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeButtonTooltip")(js.undefined)
        ret
    }
    @scala.inline
    def withResultResponseKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resultResponseKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResultResponseKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resultResponseKey")(js.undefined)
        ret
    }
    @scala.inline
    def withSummarySettings(value: IgGridGroupBySummarySettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("summarySettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSummarySettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("summarySettings")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
    @scala.inline
    def withUseGridColumnFormatter(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useGridColumnFormatter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseGridColumnFormatter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useGridColumnFormatter")(js.undefined)
        ret
    }
  }
  
}

