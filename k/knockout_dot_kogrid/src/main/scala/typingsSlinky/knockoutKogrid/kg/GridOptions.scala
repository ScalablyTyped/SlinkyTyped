package typingsSlinky.knockoutKogrid.kg

import typingsSlinky.jquery.JQueryGenericPromise
import typingsSlinky.knockout.KnockoutObservable
import typingsSlinky.knockout.KnockoutObservableArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GridOptions[EntityType] extends js.Object {
  /** Callback for when you want to validate something after selection. */
  var afterSelectionChange: js.UndefOr[js.Function1[/* row */ Row[EntityType], Unit]] = js.native
  /** Callback if you want to inspect something before selection,
    return false if you want to cancel the selection. return true otherwise.
    If you need to wait for an async call to proceed with selection you can
    use rowItem.changeSelection(event) method after returning false initially.
    Note: when shift+ Selecting multiple items in the grid this will only get called
    once and the rowItem will be an array of items that are queued to be selected. */
  var beforeSelectionChange: js.UndefOr[js.Function1[/* row */ Row[EntityType], Boolean]] = js.native
  /** To be able to have selectable rows in grid. */
  var canSelectRows: js.UndefOr[Boolean] = js.native
  /** definitions of columns as an array [], if not defined columns are auto-generated. See github wiki for more details. */
  var columnDefs: js.UndefOr[js.Array[ColumnDef] | KnockoutObservable[js.Array[ColumnDef]]] = js.native
  /** Column width of columns in grid. */
  var columnWidth: js.UndefOr[Double] = js.native
  /** Data being displayed in the grid. Each item in the array is mapped to a row being displayed. */
  var data: js.UndefOr[KnockoutObservableArray[EntityType]] = js.native
  /** Row selection check boxes appear as the first column. */
  var displaySelectionCheckbox: Boolean = js.native
  /** Enable or disable resizing of columns */
  var enableColumnResize: js.UndefOr[Boolean] = js.native
  /** Enables the server-side paging feature */
  var enablePaging: js.UndefOr[Boolean] = js.native
  /** Enable drag and drop row reordering. Only works in HTML5 compliant browsers. */
  var enableRowReordering: js.UndefOr[Boolean] = js.native
  /** Enables or disables sorting in grid. */
  var enableSorting: js.UndefOr[Boolean] = js.native
  /** filterOptions -
    filterText: The text bound to the built-in search box.
    useExternalFilter: Bypass internal filtering if you want to roll your own filtering mechanism but want to use builtin search box.
    */
  var filterOptions: js.UndefOr[FilterOptions] = js.native
  /** Defining the height of the footer in pixels. */
  var footerRowHeight: js.UndefOr[Double] = js.native
  /** Show or hide the footer alltogether the footer is enabled by default */
  var footerVisible: js.UndefOr[Boolean] = js.native
  /** Initial fields to group data by. Array of field names, not displayName. */
  var groups: js.UndefOr[js.Array[String]] = js.native
  /** The height of the header row in pixels. */
  var headerRowHeight: js.UndefOr[Double] = js.native
  /** Define a header row template for further customization. See github wiki for more details. */
  var headerRowTemplate: js.UndefOr[String | JQueryGenericPromise[String]] = js.native
  /** Enables the use of jquery UI reaggable/droppable plugin. requires jqueryUI to work if enabled.
    Useful if you want drag + drop but your users insist on crappy browsers. */
  var jqueryUIDraggable: js.UndefOr[Boolean] = js.native
  /** Enable the use jqueryUIThemes */
  var jqueryUITheme: js.UndefOr[Boolean] = js.native
  /** Prevent unselections when in single selection mode. */
  var keepLastSelected: js.UndefOr[Boolean] = js.native
  /** Maintains the column widths while resizing.
    Defaults to true when using *'s or undefined widths. Can be ovverriden by setting to false. */
  var maintainColumnRatios: js.UndefOr[js.Any] = js.native
  /** Set this to false if you only want one item selected at a time */
  var multiSelect: js.UndefOr[Boolean] = js.native
  /**  pagingOptions - */
  var pagingOptions: js.UndefOr[PagingOptions] = js.native
  /** Array of plugin functions to register in ng-grid */
  var plugins: js.UndefOr[js.Array[Plugin[EntityType]]] = js.native
  /** Row height of rows in grid. */
  var rowHeight: js.UndefOr[Double] = js.native
  /** Define a row template to customize output. See github wiki for more details. */
  var rowTemplate: js.UndefOr[String | JQueryGenericPromise[String]] = js.native
  /** Defines the binding to select all at once */
  var selectAllState: js.UndefOr[KnockoutObservable[Boolean]] = js.native
  /** Disable row selections by clicking on the row and only when the checkbox is clicked. */
  var selectWithCheckboxOnly: js.UndefOr[Boolean] = js.native
  /** all of the items selected in the grid. In single select mode there will only be one item in the array. */
  var selectedItems: js.UndefOr[KnockoutObservableArray[_]] = js.native
  /** Enables menu to choose which columns to display and group by.
    If both showColumnMenu and showFilter are false the menu button will not display.*/
  var showColumnMenu: js.UndefOr[Boolean] = js.native
  /** Enables display of the filterbox in the column menu.
    If both showColumnMenu and showFilter are false the menu button will not display.*/
  var showFilter: js.UndefOr[Boolean] = js.native
  /** Show the dropzone for drag and drop grouping */
  var showGroupPanel: js.UndefOr[Boolean] = js.native
  /** Define a sortInfo object to specify a default sorting state.
    You can also observe this variable to utilize server-side sorting (see useExternalSorting).
    Syntax is sortinfo: { fields: ['fieldName1',' fieldName2'], direction: 'ASC'/'asc' || 'desc'/'DESC'}*/
  var sortInfo: js.UndefOr[SortInfo | KnockoutObservable[SortInfo]] = js.native
  /** Set the tab index of the Vieport. */
  var tabIndex: js.UndefOr[Double] = js.native
  /** Prevents the internal sorting from executing.
    The sortInfo object will be updated with the sorting information so you can handle sorting (see sortInfo)*/
  var useExternalSorting: js.UndefOr[Boolean] = js.native
}

object GridOptions {
  @scala.inline
  def apply[EntityType](displaySelectionCheckbox: Boolean): GridOptions[EntityType] = {
    val __obj = js.Dynamic.literal(displaySelectionCheckbox = displaySelectionCheckbox.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridOptions[EntityType]]
  }
  @scala.inline
  implicit class GridOptionsOps[Self[entitytype] <: GridOptions[entitytype], EntityType] (val x: Self[EntityType]) extends AnyVal {
    @scala.inline
    def duplicate: Self[EntityType] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[EntityType]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[EntityType] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[EntityType] with Other]
    @scala.inline
    def withDisplaySelectionCheckbox(value: Boolean): Self[EntityType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displaySelectionCheckbox")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAfterSelectionChange(value: /* row */ Row[EntityType] => Unit): Self[EntityType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterSelectionChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAfterSelectionChange: Self[EntityType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterSelectionChange")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeSelectionChange(value: /* row */ Row[EntityType] => Boolean): Self[EntityType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeSelectionChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBeforeSelectionChange: Self[EntityType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeSelectionChange")(js.undefined)
        ret
    }
    @scala.inline
    def withCanSelectRows(value: Boolean): Self[EntityType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canSelectRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCanSelectRows: Self[EntityType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canSelectRows")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnDefs(value: js.Array[ColumnDef] | KnockoutObservable[js.Array[ColumnDef]]): Self[EntityType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnDefs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnDefs: Self[EntityType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnDefs")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnWidth(value: Double): Self[EntityType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnWidth: Self[EntityType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withData(value: KnockoutObservableArray[EntityType]): Self[EntityType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self[EntityType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableColumnResize(value: Boolean): Self[EntityType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableColumnResize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableColumnResize: Self[EntityType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableColumnResize")(js.undefined)
        ret
    }
    @scala.inline
    def withEnablePaging(value: Boolean): Self[EntityType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enablePaging")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnablePaging: Self[EntityType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enablePaging")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableRowReordering(value: Boolean): Self[EntityType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableRowReordering")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableRowReordering: Self[EntityType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableRowReordering")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableSorting(value: Boolean): Self[EntityType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableSorting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableSorting: Self[EntityType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableSorting")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterOptions(value: FilterOptions): Self[EntityType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterOptions: Self[EntityType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withFooterRowHeight(value: Double): Self[EntityType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footerRowHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFooterRowHeight: Self[EntityType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footerRowHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withFooterVisible(value: Boolean): Self[EntityType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footerVisible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFooterVisible: Self[EntityType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footerVisible")(js.undefined)
        ret
    }
    @scala.inline
    def withGroups(value: js.Array[String]): Self[EntityType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroups: Self[EntityType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groups")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderRowHeight(value: Double): Self[EntityType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerRowHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderRowHeight: Self[EntityType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerRowHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderRowTemplate(value: String | JQueryGenericPromise[String]): Self[EntityType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerRowTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderRowTemplate: Self[EntityType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerRowTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withJqueryUIDraggable(value: Boolean): Self[EntityType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jqueryUIDraggable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJqueryUIDraggable: Self[EntityType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jqueryUIDraggable")(js.undefined)
        ret
    }
    @scala.inline
    def withJqueryUITheme(value: Boolean): Self[EntityType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jqueryUITheme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJqueryUITheme: Self[EntityType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jqueryUITheme")(js.undefined)
        ret
    }
    @scala.inline
    def withKeepLastSelected(value: Boolean): Self[EntityType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepLastSelected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeepLastSelected: Self[EntityType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepLastSelected")(js.undefined)
        ret
    }
    @scala.inline
    def withMaintainColumnRatios(value: js.Any): Self[EntityType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maintainColumnRatios")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaintainColumnRatios: Self[EntityType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maintainColumnRatios")(js.undefined)
        ret
    }
    @scala.inline
    def withMultiSelect(value: Boolean): Self[EntityType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiSelect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultiSelect: Self[EntityType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiSelect")(js.undefined)
        ret
    }
    @scala.inline
    def withPagingOptions(value: PagingOptions): Self[EntityType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pagingOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPagingOptions: Self[EntityType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pagingOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withPlugins(value: js.Array[Plugin[EntityType]]): Self[EntityType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlugins: Self[EntityType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugins")(js.undefined)
        ret
    }
    @scala.inline
    def withRowHeight(value: Double): Self[EntityType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowHeight: Self[EntityType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withRowTemplate(value: String | JQueryGenericPromise[String]): Self[EntityType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowTemplate: Self[EntityType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectAllState(value: KnockoutObservable[Boolean]): Self[EntityType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectAllState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectAllState: Self[EntityType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectAllState")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectWithCheckboxOnly(value: Boolean): Self[EntityType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectWithCheckboxOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectWithCheckboxOnly: Self[EntityType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectWithCheckboxOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedItems(value: KnockoutObservableArray[_]): Self[EntityType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedItems: Self[EntityType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedItems")(js.undefined)
        ret
    }
    @scala.inline
    def withShowColumnMenu(value: Boolean): Self[EntityType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showColumnMenu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowColumnMenu: Self[EntityType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showColumnMenu")(js.undefined)
        ret
    }
    @scala.inline
    def withShowFilter(value: Boolean): Self[EntityType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowFilter: Self[EntityType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showFilter")(js.undefined)
        ret
    }
    @scala.inline
    def withShowGroupPanel(value: Boolean): Self[EntityType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showGroupPanel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowGroupPanel: Self[EntityType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showGroupPanel")(js.undefined)
        ret
    }
    @scala.inline
    def withSortInfo(value: SortInfo | KnockoutObservable[SortInfo]): Self[EntityType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortInfo: Self[EntityType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withTabIndex(value: Double): Self[EntityType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTabIndex: Self[EntityType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withUseExternalSorting(value: Boolean): Self[EntityType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useExternalSorting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseExternalSorting: Self[EntityType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useExternalSorting")(js.undefined)
        ret
    }
  }
  
}

