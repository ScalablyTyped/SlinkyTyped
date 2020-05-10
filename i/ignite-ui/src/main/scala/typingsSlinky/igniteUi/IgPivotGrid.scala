package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgPivotGrid
  extends /**
	 * Option for JSONPDataSourceSettings
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Enables sorting of the header cells in columns.
  	 *
  	 */
  var allowHeaderColumnsSorting: js.UndefOr[Boolean] = js.native
  /**
  	 * Enables sorting of the header cells in rows.
  	 *
  	 */
  var allowHeaderRowsSorting: js.UndefOr[Boolean] = js.native
  /**
  	 * Enables sorting of the value cells in columns.
  	 *
  	 */
  var allowSorting: js.UndefOr[Boolean] = js.native
  /**
  	 * The indentation for every level column when the compactColumnHeaders is set to true.
  	 *
  	 */
  var compactColumnHeaderIndentation: js.UndefOr[Double] = js.native
  /**
  	 * A boolean value indicating whether the column headers should be arranged for compact header layout i.e. each hierarchy is in a single row.
  	 *
  	 */
  var compactColumnHeaders: js.UndefOr[Boolean] = js.native
  /**
  	 * The indentation for every level row when the rowHeadersLayout is set to 'superCompact'.
  	 *
  	 */
  var compactRowHeaderIndentation: js.UndefOr[Double] = js.native
  /**
  	 * A boolean value indicating whether the row headers should be arranged for compact header layout i.e. each hierarchy is in a single column.
  	 *
  	 */
  var compactRowHeaders: js.UndefOr[Boolean] = js.native
  /**
  	 * A function that will be called to determine if an item can be moved in or dropped on an area of the pivot grid.
  	 *
  	 * paramType="string" The location where the item will be moved - igPivotGrid, igPivotDataSelector, filters, rows, columns or measures.
  	 * paramType="string" The type of the item - Hierarchy, Measure or MeasureList.
  	 * paramType="string" The unique name of the item.
  	 * returnType="bool"  The function must return true if the item should be accepted.
  	 */
  var customMoveValidation: js.UndefOr[js.Function] = js.native
  /**
  	 * An instance of $.ig.OlapXmlaDataSource or $.ig.OlapFlatDataSource.
  	 *
  	 */
  var dataSource: js.UndefOr[js.Any] = js.native
  /**
  	 * Fired after the data source has initialized.
  	 */
  var dataSourceInitialized: js.UndefOr[DataSourceInitializedEvent] = js.native
  /**
  	 * An object that will be used to create an instance of $.ig.OlapXmlaDataSource or $.ig.OlapFlatDataSource.
  	 * The provided value must contain an object with settings for one of the data source types - xmlaOptions or flatDataOptions.
  	 *
  	 */
  var dataSourceOptions: js.UndefOr[IgPivotGridDataSourceOptions] = js.native
  /**
  	 * Fired after the data source has updated.
  	 */
  var dataSourceUpdated: js.UndefOr[DataSourceUpdatedEvent] = js.native
  /**
  	 * Specifies the default sort behavior for the levels if no sort behavior is specified in an item from the levelSortDirections option.
  	 *
  	 * Valid values:
  	 * "system" Sorts the headers by a specified sort key.
  	 * "alphabetical" Sorts alphabetically the header captions.
  	 */
  var defaultLevelSortBehavior: js.UndefOr[String] = js.native
  /**
  	 * Specifies the width of the row headers.
  	 *
  	 */
  var defaultRowHeaderWidth: js.UndefOr[Double] = js.native
  /**
  	 * Setting deferUpdate to true will not apply changes to the data source until the updateGrid method is called.
  	 *
  	 */
  var deferUpdate: js.UndefOr[Boolean] = js.native
  /**
  	 * Disable the drag and drop for the columns drop area and the ability to use filtering and remove items from it.
  	 *
  	 */
  var disableColumnsDropArea: js.UndefOr[Boolean] = js.native
  /**
  	 * Disable the drag and drop for the filters drop area and the ability to use filtering and remove items from it.
  	 *
  	 */
  var disableFiltersDropArea: js.UndefOr[Boolean] = js.native
  /**
  	 * Disable the drag and drop for the measures drop area and the ability to use filtering and remove items from it.
  	 *
  	 */
  var disableMeasuresDropArea: js.UndefOr[Boolean] = js.native
  /**
  	 * Disable the drag and drop for the rows drop area and the ability to use filtering and remove items from it.
  	 *
  	 */
  var disableRowsDropArea: js.UndefOr[Boolean] = js.native
  /**
  	 * Fired on drag. Return false to cancel the drag.
  	 */
  var drag: js.UndefOr[DragEvent] = js.native
  /**
  	 * Settings for the drag and drop functionality of the igPivotGrid.
  	 *
  	 */
  var dragAndDropSettings: js.UndefOr[IgPivotGridDragAndDropSettings] = js.native
  /**
  	 * Fired on drag start. Return false to cancel the dragging.
  	 */
  var dragStart: js.UndefOr[DragStartEvent] = js.native
  /**
  	 * Fired on drag stop.
  	 */
  var dragStop: js.UndefOr[DragStopEvent] = js.native
  /**
  	 * Specifies the parent for the drop downs.
  	 */
  var dropDownParent: js.UndefOr[js.Any] = js.native
  /**
  	 * Fired after the filter members drop down closes.
  	 */
  var filterDropDownClosed: js.UndefOr[FilterDropDownClosedEvent] = js.native
  /**
  	 * Fired before the filter members drop down closes. Return false to cancel the closing.
  	 */
  var filterDropDownClosing: js.UndefOr[FilterDropDownClosingEvent] = js.native
  /**
  	 * Fired after the OK button in the filter members drop down is clicked. Return false to cancel the applying of the filters.
  	 */
  var filterDropDownOk: js.UndefOr[FilterDropDownOkEvent] = js.native
  /**
  	 * Fired after the filter members drop down opens.
  	 */
  var filterDropDownOpened: js.UndefOr[FilterDropDownOpenedEvent] = js.native
  /**
  	 * Fired before the filter members drop down opens. Return false to cancel the opening.
  	 */
  var filterDropDownOpening: js.UndefOr[FilterDropDownOpeningEvent] = js.native
  /**
  	 * Fired after the filter members are loaded.
  	 */
  var filterMembersLoaded: js.UndefOr[FilterMembersLoadedEvent] = js.native
  /**
  	 * Specifies the default sort direction for the levels if no sort direction is specified in an item from the levelSortDirections option.
  	 *
  	 */
  var firstLevelSortDirection: js.UndefOr[js.Any] = js.native
  /**
  	 * Specifies the default sort direction for the rows.
  	 *
  	 */
  var firstSortDirection: js.UndefOr[js.Any] = js.native
  /**
  	 * Options specific to the igGrid that will render the pivot grid view.
  	 *
  	 */
  var gridOptions: js.UndefOr[IgPivotGridGridOptions] = js.native
  /**
  	 * Fired after the sorting of the headers.
  	 */
  var headersSorted: js.UndefOr[HeadersSortedEvent] = js.native
  /**
  	 * Fired before the sorting of the headers. Return false to cancel the sorting.
  	 */
  var headersSorting: js.UndefOr[HeadersSortingEvent] = js.native
  /**
  	 * This is the total height of the grid.
  	 *
  	 *
  	 * Valid values:
  	 * "null" Will stretch vertically to fit data, if no other heights are defined
  	 */
  var height: js.UndefOr[String | Double] = js.native
  /**
  	 * Hide the columns drop area.
  	 *
  	 */
  var hideColumnsDropArea: js.UndefOr[Boolean] = js.native
  /**
  	 * Hide the filters drop area.
  	 *
  	 */
  var hideFiltersDropArea: js.UndefOr[Boolean] = js.native
  /**
  	 * Hide the measures drop area.
  	 *
  	 */
  var hideMeasuresDropArea: js.UndefOr[Boolean] = js.native
  /**
  	 * Hide the rows drop area.
  	 *
  	 */
  var hideRowsDropArea: js.UndefOr[Boolean] = js.native
  /**
  	 * A boolean value indicating whether a parent in the columns is in front of its children.
  	 * If set to true, the query set sorts members in a level in their natural order - child members immediately follow their parent members.
  	 * If set to false the query set sorts the members in a level using a post-natural order. In other words, child members precede their parents.
  	 *
  	 */
  var isParentInFrontForColumns: js.UndefOr[Boolean] = js.native
  /**
  	 * A boolean value indicating whether a parent in the rows is in front of its children.
  	 * If set to true, the query set sorts members in a level in their natural order - child members immediately follow their parent members.
  	 * If set to false the query set sorts the members in a level using a post-natural order. In other words, child members precede their parents.
  	 *
  	 */
  var isParentInFrontForRows: js.UndefOr[Boolean] = js.native
  /**
  	 * Set/Get the locale language setting for the widget.
  	 *
  	 */
  var language: js.UndefOr[String] = js.native
  /**
  	 * An array of level sort direction items, which predefine the sorted header cells.
  	 *
  	 */
  var levelSortDirections: js.UndefOr[js.Array[IgPivotGridLevelSortDirection]] = js.native
  /**
  	 * Set/Get the locale setting for the widget.
  	 *
  	 */
  var locale: js.UndefOr[js.Any] = js.native
  /**
  	 * Fired after a metadata item drop.
  	 */
  var metadataDropped: js.UndefOr[MetadataDroppedEvent] = js.native
  /**
  	 * Fired before a metadata item drop. Return false to cancel the drop.
  	 */
  var metadataDropping: js.UndefOr[MetadataDroppingEvent] = js.native
  /**
  	 * Fired after a metadata item is removed when the user clicks the close icon.
  	 */
  var metadataRemoved: js.UndefOr[MetadataRemovedEvent] = js.native
  /**
  	 * Fired before a metadata item is removed when the user clicks the close icon. Return false to cancel the removing.
  	 */
  var metadataRemoving: js.UndefOr[MetadataRemovingEvent] = js.native
  /**
  	 * Event fired after the headers have been rendered.
  	 */
  var pivotGridHeadersRendered: js.UndefOr[PivotGridHeadersRenderedEvent] = js.native
  /**
  	 * Event fired after the whole grid widget has been rendered (including headers, footers, etc.).
  	 */
  var pivotGridRendered: js.UndefOr[PivotGridRenderedEvent] = js.native
  /**
  	 * Set/Get the regional setting for the widget.
  	 *
  	 */
  var regional: js.UndefOr[String | js.Object] = js.native
  /**
  	 * Use it when you set rowHeadersLayout to "tree". This property will set a margin between the level's caption and the next level's (underlined text) caption.
  	 */
  var rowHeaderLinkGroupIndentation: js.UndefOr[Double] = js.native
  /**
  	 * A value indicating whether the layout that row headers should be arranged.standard Each hierarchy in the rows is displayed in a separate column. The child members of a member in the rows are displayed on its right.
  	 * superCompact Each hierarchy in the rows is displayed in a separate column. The child members of a member in the rows are displayed on above or below it (Depending on the isParentInFrontForRows setting).
  	 * tree All hierarchies in the rows are displayed in a tree-like structure in a single column (The column's width is dependent on the defaultRowHEaderWidth, which can be set to "null" to enable the built-in auto-sizing functionality).
  	 *
  	 *
  	 * Valid values:
  	 * "standard"
  	 * "superCompact"
  	 * "tree"
  	 */
  var rowHeadersLayout: js.UndefOr[js.Any] = js.native
  /**
  	 * Fired after the sorting of the columns.
  	 */
  var sorted: js.UndefOr[SortedEvent] = js.native
  /**
  	 * Fired before the sorting of the columns. Return false to cancel the sorting.
  	 */
  var sorting: js.UndefOr[SortingEvent] = js.native
  /**
  	 * The indentation for the neighboring hierarchy's level row when the rowHeaderLayout is set to 'tree'.
  	 */
  var treeRowHeaderIndentation: js.UndefOr[Double] = js.native
  /**
  	 * Fired after the collapse of the tuple member.
  	 */
  var tupleMemberCollapsed: js.UndefOr[TupleMemberCollapsedEvent] = js.native
  /**
  	 * Fired before the collapse of the tuple member. Return false to cancel the collapsing.
  	 */
  var tupleMemberCollapsing: js.UndefOr[TupleMemberCollapsingEvent] = js.native
  /**
  	 * Fired after the expand of the tuple member.
  	 */
  var tupleMemberExpanded: js.UndefOr[TupleMemberExpandedEvent] = js.native
  /**
  	 * Fired before the expand of the tuple member. Return false to cancel the expanding.
  	 */
  var tupleMemberExpanding: js.UndefOr[TupleMemberExpandingEvent] = js.native
  /**
  	 *
  	 *
  	 * Valid values:
  	 * "null" Will stretch to fit the data, if no other widths are defined.
  	 */
  var width: js.UndefOr[String | Double] = js.native
}

object IgPivotGrid {
  @scala.inline
  def apply(): IgPivotGrid = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgPivotGrid]
  }
  @scala.inline
  implicit class IgPivotGridOps[Self <: IgPivotGrid] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowHeaderColumnsSorting(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowHeaderColumnsSorting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowHeaderColumnsSorting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowHeaderColumnsSorting")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowHeaderRowsSorting(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowHeaderRowsSorting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowHeaderRowsSorting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowHeaderRowsSorting")(js.undefined)
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
    def withCompactColumnHeaderIndentation(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compactColumnHeaderIndentation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompactColumnHeaderIndentation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compactColumnHeaderIndentation")(js.undefined)
        ret
    }
    @scala.inline
    def withCompactColumnHeaders(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compactColumnHeaders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompactColumnHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compactColumnHeaders")(js.undefined)
        ret
    }
    @scala.inline
    def withCompactRowHeaderIndentation(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compactRowHeaderIndentation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompactRowHeaderIndentation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compactRowHeaderIndentation")(js.undefined)
        ret
    }
    @scala.inline
    def withCompactRowHeaders(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compactRowHeaders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompactRowHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compactRowHeaders")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomMoveValidation(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customMoveValidation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomMoveValidation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customMoveValidation")(js.undefined)
        ret
    }
    @scala.inline
    def withDataSource(value: js.Any): Self = {
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
    def withDataSourceInitialized(value: (/* event */ Event_, /* ui */ DataSourceInitializedEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSourceInitialized")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutDataSourceInitialized: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSourceInitialized")(js.undefined)
        ret
    }
    @scala.inline
    def withDataSourceOptions(value: IgPivotGridDataSourceOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSourceOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataSourceOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSourceOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withDataSourceUpdated(value: (/* event */ Event_, /* ui */ DataSourceUpdatedEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSourceUpdated")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutDataSourceUpdated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSourceUpdated")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultLevelSortBehavior(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultLevelSortBehavior")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultLevelSortBehavior: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultLevelSortBehavior")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultRowHeaderWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultRowHeaderWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultRowHeaderWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultRowHeaderWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withDeferUpdate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deferUpdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeferUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deferUpdate")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableColumnsDropArea(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableColumnsDropArea")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableColumnsDropArea: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableColumnsDropArea")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableFiltersDropArea(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableFiltersDropArea")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableFiltersDropArea: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableFiltersDropArea")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableMeasuresDropArea(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableMeasuresDropArea")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableMeasuresDropArea: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableMeasuresDropArea")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableRowsDropArea(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableRowsDropArea")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableRowsDropArea: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableRowsDropArea")(js.undefined)
        ret
    }
    @scala.inline
    def withDrag(value: (/* event */ Event_, /* ui */ DragEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drag")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutDrag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drag")(js.undefined)
        ret
    }
    @scala.inline
    def withDragAndDropSettings(value: IgPivotGridDragAndDropSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragAndDropSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDragAndDropSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragAndDropSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withDragStart(value: (/* event */ Event_, /* ui */ DragStartEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragStart")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutDragStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragStart")(js.undefined)
        ret
    }
    @scala.inline
    def withDragStop(value: (/* event */ Event_, /* ui */ DragStopEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragStop")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutDragStop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragStop")(js.undefined)
        ret
    }
    @scala.inline
    def withDropDownParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropDownParent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDropDownParent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropDownParent")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterDropDownClosed(value: (/* event */ Event_, /* ui */ FilterDropDownClosedEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterDropDownClosed")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutFilterDropDownClosed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterDropDownClosed")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterDropDownClosing(value: (/* event */ Event_, /* ui */ FilterDropDownClosingEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterDropDownClosing")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutFilterDropDownClosing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterDropDownClosing")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterDropDownOk(value: (/* event */ Event_, /* ui */ FilterDropDownOkEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterDropDownOk")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutFilterDropDownOk: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterDropDownOk")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterDropDownOpened(value: (/* event */ Event_, /* ui */ FilterDropDownOpenedEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterDropDownOpened")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutFilterDropDownOpened: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterDropDownOpened")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterDropDownOpening(value: (/* event */ Event_, /* ui */ FilterDropDownOpeningEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterDropDownOpening")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutFilterDropDownOpening: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterDropDownOpening")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterMembersLoaded(value: (/* event */ Event_, /* ui */ FilterMembersLoadedEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterMembersLoaded")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutFilterMembersLoaded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterMembersLoaded")(js.undefined)
        ret
    }
    @scala.inline
    def withFirstLevelSortDirection(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstLevelSortDirection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFirstLevelSortDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstLevelSortDirection")(js.undefined)
        ret
    }
    @scala.inline
    def withFirstSortDirection(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstSortDirection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFirstSortDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstSortDirection")(js.undefined)
        ret
    }
    @scala.inline
    def withGridOptions(value: IgPivotGridGridOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGridOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withHeadersSorted(value: (/* event */ Event_, /* ui */ HeadersSortedEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headersSorted")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutHeadersSorted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headersSorted")(js.undefined)
        ret
    }
    @scala.inline
    def withHeadersSorting(value: (/* event */ Event_, /* ui */ HeadersSortingEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headersSorting")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutHeadersSorting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headersSorting")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withHideColumnsDropArea(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideColumnsDropArea")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideColumnsDropArea: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideColumnsDropArea")(js.undefined)
        ret
    }
    @scala.inline
    def withHideFiltersDropArea(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideFiltersDropArea")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideFiltersDropArea: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideFiltersDropArea")(js.undefined)
        ret
    }
    @scala.inline
    def withHideMeasuresDropArea(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideMeasuresDropArea")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideMeasuresDropArea: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideMeasuresDropArea")(js.undefined)
        ret
    }
    @scala.inline
    def withHideRowsDropArea(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideRowsDropArea")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideRowsDropArea: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideRowsDropArea")(js.undefined)
        ret
    }
    @scala.inline
    def withIsParentInFrontForColumns(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isParentInFrontForColumns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsParentInFrontForColumns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isParentInFrontForColumns")(js.undefined)
        ret
    }
    @scala.inline
    def withIsParentInFrontForRows(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isParentInFrontForRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsParentInFrontForRows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isParentInFrontForRows")(js.undefined)
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
    def withLevelSortDirections(value: js.Array[IgPivotGridLevelSortDirection]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("levelSortDirections")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLevelSortDirections: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("levelSortDirections")(js.undefined)
        ret
    }
    @scala.inline
    def withLocale(value: js.Any): Self = {
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
    def withMetadataDropped(value: (/* event */ Event_, /* ui */ MetadataDroppedEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadataDropped")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutMetadataDropped: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadataDropped")(js.undefined)
        ret
    }
    @scala.inline
    def withMetadataDropping(value: (/* event */ Event_, /* ui */ MetadataDroppingEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadataDropping")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutMetadataDropping: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadataDropping")(js.undefined)
        ret
    }
    @scala.inline
    def withMetadataRemoved(value: (/* event */ Event_, /* ui */ MetadataRemovedEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadataRemoved")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutMetadataRemoved: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadataRemoved")(js.undefined)
        ret
    }
    @scala.inline
    def withMetadataRemoving(value: (/* event */ Event_, /* ui */ MetadataRemovingEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadataRemoving")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutMetadataRemoving: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadataRemoving")(js.undefined)
        ret
    }
    @scala.inline
    def withPivotGridHeadersRendered(value: (/* event */ Event_, /* ui */ PivotGridHeadersRenderedEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pivotGridHeadersRendered")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutPivotGridHeadersRendered: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pivotGridHeadersRendered")(js.undefined)
        ret
    }
    @scala.inline
    def withPivotGridRendered(value: (/* event */ Event_, /* ui */ PivotGridRenderedEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pivotGridRendered")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutPivotGridRendered: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pivotGridRendered")(js.undefined)
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
    def withRowHeaderLinkGroupIndentation(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowHeaderLinkGroupIndentation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowHeaderLinkGroupIndentation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowHeaderLinkGroupIndentation")(js.undefined)
        ret
    }
    @scala.inline
    def withRowHeadersLayout(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowHeadersLayout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowHeadersLayout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowHeadersLayout")(js.undefined)
        ret
    }
    @scala.inline
    def withSorted(value: (/* event */ Event_, /* ui */ SortedEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sorted")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutSorted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sorted")(js.undefined)
        ret
    }
    @scala.inline
    def withSorting(value: (/* event */ Event_, /* ui */ SortingEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sorting")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutSorting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sorting")(js.undefined)
        ret
    }
    @scala.inline
    def withTreeRowHeaderIndentation(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("treeRowHeaderIndentation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTreeRowHeaderIndentation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("treeRowHeaderIndentation")(js.undefined)
        ret
    }
    @scala.inline
    def withTupleMemberCollapsed(value: (/* event */ Event_, /* ui */ TupleMemberCollapsedEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tupleMemberCollapsed")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutTupleMemberCollapsed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tupleMemberCollapsed")(js.undefined)
        ret
    }
    @scala.inline
    def withTupleMemberCollapsing(value: (/* event */ Event_, /* ui */ TupleMemberCollapsingEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tupleMemberCollapsing")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutTupleMemberCollapsing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tupleMemberCollapsing")(js.undefined)
        ret
    }
    @scala.inline
    def withTupleMemberExpanded(value: (/* event */ Event_, /* ui */ TupleMemberExpandedEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tupleMemberExpanded")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutTupleMemberExpanded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tupleMemberExpanded")(js.undefined)
        ret
    }
    @scala.inline
    def withTupleMemberExpanding(value: (/* event */ Event_, /* ui */ TupleMemberExpandingEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tupleMemberExpanding")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutTupleMemberExpanding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tupleMemberExpanding")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}

