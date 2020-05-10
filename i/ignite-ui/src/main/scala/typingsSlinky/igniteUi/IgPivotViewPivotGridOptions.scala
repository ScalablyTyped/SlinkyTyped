package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgPivotViewPivotGridOptions
  extends /**
	 * Option for JSONPDataSourceSettings
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Enables sorting of the header cells in columns.
  	 */
  var allowHeaderColumnsSorting: js.UndefOr[Boolean] = js.native
  /**
  	 * Enables sorting of the header cells in rows.
  	 */
  var allowHeaderRowsSorting: js.UndefOr[Boolean] = js.native
  /**
  	 * Enables sorting of the value cells in columns.
  	 */
  var allowSorting: js.UndefOr[Boolean] = js.native
  /**
  	 * The indentation for every level column when the compactColumnHeaders is set to true.
  	 */
  var compactColumnHeaderIndentation: js.UndefOr[Double] = js.native
  /**
  	 * A boolean value indicating wheter the column headers should be arranged for compact header layout – each hieararchy is in a single row.
  	 */
  var compactColumnHeaders: js.UndefOr[Boolean] = js.native
  /**
  	 * The indentation for every level row when the rowHeadersLayout is set to 'compact'.
  	 */
  var compactRowHeaderIndentation: js.UndefOr[Double] = js.native
  /**
  	 * A function that will be called to determine if an item can be moved in or dropped on an area of the pivot grid.
  	 * paramType="string" The location where the item will be moved - igPivotGrid, igPivotDataSelector, filters, rows, columns or measures.
  	 * paramType="string" The type of the item - Hierarchy, Measure or MeasureList.
  	 * paramType="string" The unique name of the item.
  	 * returnType="bool"  The function must return true if the item should be accepted.
  	 */
  var customMoveValidation: js.UndefOr[js.Function] = js.native
  /**
  	 * Typle="number" Specifies the width of the row headers.
  	 */
  var defaultRowHeaderWidth: js.UndefOr[Double] = js.native
  /**
  	 * Disable the drag and drop for the columns drop area and the ability to use filtering and remove items from it.
  	 */
  var disableColumnsDropArea: js.UndefOr[Boolean] = js.native
  /**
  	 * Disable the drag and drop for the filters drop area and the ability to use filtering and remove items from it.
  	 */
  var disableFiltersDropArea: js.UndefOr[Boolean] = js.native
  /**
  	 * Disable the drag and drop for the measures drop area and the ability to use filtering and remove items from it.
  	 */
  var disableMeasuresDropArea: js.UndefOr[Boolean] = js.native
  /**
  	 * Disable the drag and drop for the rows drop area and the ability to use filtering and remove items from it.
  	 */
  var disableRowsDropArea: js.UndefOr[Boolean] = js.native
  /**
  	 * Settings for the drag and drop functionality of the igPivotDataSelector.
  	 */
  var dragAndDropSettings: js.UndefOr[IgPivotViewPivotGridOptionsDragAndDropSettings] = js.native
  /**
  	 * Specifies the parent for the drop downs.
  	 */
  var dropDownParent: js.UndefOr[js.Any] = js.native
  /**
  	 * Spefies the default sort direction for the levels if no sort direction is specified in an item from the levelSortDirections option.
  	 */
  var firstLevelSortDirection: js.UndefOr[js.Any] = js.native
  /**
  	 * Spefies the default sort direction for the rows.
  	 */
  var firstSortDirection: js.UndefOr[js.Any] = js.native
  /**
  	 * Options specific to the igGrid that will render the pivot grid view.
  	 */
  var gridOptions: js.UndefOr[IgPivotViewPivotGridOptionsGridOptions] = js.native
  /**
  	 * Hide the columns drop area.
  	 */
  var hideColumnsDropArea: js.UndefOr[Boolean] = js.native
  /**
  	 * Hide the filters drop area.
  	 */
  var hideFiltersDropArea: js.UndefOr[Boolean] = js.native
  /**
  	 * Hide the measures drop area.
  	 */
  var hideMeasuresDropArea: js.UndefOr[Boolean] = js.native
  /**
  	 * Hide the rows drop area.
  	 */
  var hideRowsDropArea: js.UndefOr[Boolean] = js.native
  /**
  	 * A boolean value indicating whether a parent in the columns is in front of its children.
  	 * If set to true, the query set sorts members in a level in their natural order - child members immediately follow their parent members.
  	 * If set to false the query set sorts the members in a level using a post-natural order. In other words, child members precede their parents.
  	 */
  var isParentInFrontForColumns: js.UndefOr[Boolean] = js.native
  /**
  	 * A boolean value indicating whether a parent in the rows is in front of its children.
  	 * If set to true, the query set sorts members in a level in their natural order - child members immediately follow their parent members.
  	 * If set to false the query set sorts the members in a level using a post-natural order. In other words, child members precede their parents.
  	 */
  var isParentInFrontForRows: js.UndefOr[Boolean] = js.native
  /**
  	 * An array of level sort direction items, which predefine the sorted header cells.
  	 */
  var levelSortDirections: js.UndefOr[js.Array[IgPivotViewPivotGridOptionsLevelSortDirection]] = js.native
  /**
  	 * A value indicating wheter the layout that row headers should be arranged. For compact header layout – each hieararchy is in a single column.
  	 */
  var rowHeadersLayout: js.UndefOr[js.Any] = js.native
}

object IgPivotViewPivotGridOptions {
  @scala.inline
  def apply(): IgPivotViewPivotGridOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgPivotViewPivotGridOptions]
  }
  @scala.inline
  implicit class IgPivotViewPivotGridOptionsOps[Self <: IgPivotViewPivotGridOptions] (val x: Self) extends AnyVal {
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
    def withDragAndDropSettings(value: IgPivotViewPivotGridOptionsDragAndDropSettings): Self = {
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
    def withGridOptions(value: IgPivotViewPivotGridOptionsGridOptions): Self = {
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
    def withLevelSortDirections(value: js.Array[IgPivotViewPivotGridOptionsLevelSortDirection]): Self = {
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
  }
  
}

