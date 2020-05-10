package typingsSlinky.ngGrid.ngGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGridOptions extends js.Object {
  /** Callback for when you want to validate something after selection. */
  var afterSelectionChange: js.UndefOr[
    js.Function2[/* rowItem */ js.UndefOr[IRow], /* event */ js.UndefOr[js.Any], Unit]
  ] = js.native
  /** Define an aggregate template to customize the rows when grouped. See github wiki for more details. */
  var aggregateTemplate: js.UndefOr[String] = js.native
  /** Callback if you want to inspect something before selection,
    return false if you want to cancel the selection. return true otherwise.
    If you need to wait for an async call to proceed with selection you can
    use rowItem.changeSelection(event) method after returning false initially.
    Note: when shift+ Selecting multiple items in the grid this will only get called
    once and the rowItem will be an array of items that are queued to be selected. */
  var beforeSelectionChange: js.UndefOr[
    js.Function2[/* rowItem */ js.UndefOr[IRow], /* event */ js.UndefOr[js.Any], Boolean]
  ] = js.native
  /** checkbox templates. */
  var checkboxCellTemplate: js.UndefOr[String] = js.native
  /** checkbox templates. */
  var checkboxHeaderTemplate: js.UndefOr[String] = js.native
  /** definitions of columns as an array [], if not defined columns are auto-generated. See github wiki for more details. */
  var columnDefs: js.UndefOr[js.Array[IColumnDef]] = js.native
  /** Data being displayed in the grid. This can be either a string of object ID or object reference.
    Using string is preferred, as this turns on change tracking in ng-grid
    */
  var data: js.UndefOr[js.Any] = js.native
  /** Data updated callback, fires every time the data is modified from outside the grid. */
  var dataUpdated: js.UndefOr[js.Function] = js.native
  /** Enables cell editing. */
  var enableCellEdit: js.UndefOr[Boolean] = js.native
  /** Enables cell selection. */
  var enableCellSelection: js.UndefOr[Boolean] = js.native
  /** Enable or disable HEAVY column virtualization. This turns off selection checkboxes and column pinning and is designed for spreadsheet-like data. */
  var enableColumnHeavyVirt: js.UndefOr[Boolean] = js.native
  /** Enable or disable reordering of columns */
  var enableColumnReordering: js.UndefOr[Boolean] = js.native
  /** Enable or disable resizing of columns */
  var enableColumnResize: js.UndefOr[Boolean] = js.native
  /** Enables or disables text highlighting in grid by adding the "unselectable" class (See CSS file) */
  var enableHighlighting: js.UndefOr[Boolean] = js.native
  /** Enables the server-side paging feature */
  var enablePaging: js.UndefOr[Boolean] = js.native
  /** Enable column pinning */
  var enablePinning: js.UndefOr[Boolean] = js.native
  /** Enable drag and drop row reordering. Only works in HTML5 compliant browsers. */
  var enableRowReordering: js.UndefOr[Boolean] = js.native
  /** To be able to have selectable rows in grid. */
  var enableRowSelection: js.UndefOr[Boolean] = js.native
  /** Enables or disables sorting in grid. */
  var enableSorting: js.UndefOr[Boolean] = js.native
  /**  string list of properties to exclude when auto-generating columns. */
  var excludeProperties: js.UndefOr[js.Any] = js.native
  /** filterOptions -
    filterText: The text bound to the built-in search box.
    useExternalFilter: Bypass internal filtering if you want to roll your own filtering mechanism but want to use builtin search box.
    */
  var filterOptions: js.UndefOr[IFilterOptions] = js.native
  /** Defining the height of the footer in pixels. */
  var footerRowHeight: js.UndefOr[Double] = js.native
  /** Initial fields to group data by. Array of field names, not displayName. */
  var groups: js.UndefOr[js.Array[String]] = js.native
  /** The height of the header row in pixels. */
  var headerRowHeight: js.UndefOr[Double] = js.native
  /** Define a header row template for further customization. See github wiki for more details. */
  var headerRowTemplate: js.UndefOr[String] = js.native
  /** i18n language support. choose from the installed or included languages, en, fr, sp, etc...*/
  var i18n: js.UndefOr[String] = js.native
  /** Enables the use of jquery UI reaggable/droppable plugin. requires jqueryUI to work if enabled.
    Useful if you want drag + drop but your users insist on crappy browsers. */
  var jqueryUIDraggable: js.UndefOr[Boolean] = js.native
  /** Enable the use jqueryUIThemes */
  var jqueryUITheme: js.UndefOr[Boolean] = js.native
  /** Prevent unselections when in single selection mode. */
  var keepLastSelected: js.UndefOr[Boolean] = js.native
  /** Maintains the column widths while resizing.
    Defaults to true when using *'s or undefined widths. Can be ovverriden by setting to false. */
  var maintainColumnRatios: js.UndefOr[Boolean] = js.native
  /** Set this to false if you only want one item selected at a time */
  var multiSelect: js.UndefOr[Boolean] = js.native
  /**  pagingOptions - */
  var pagingOptions: js.UndefOr[IPagingOptions] = js.native
  /** Array of plugin functions to register in ng-grid */
  var pinSelectionCheckbox: js.UndefOr[Boolean] = js.native
  /** Array of plugin functions to register in ng-grid */
  var plugins: js.UndefOr[js.Array[_]] = js.native
  /** Row height of rows in grid. */
  var rowHeight: js.UndefOr[Double] = js.native
  /** Define a row template to customize output. See github wiki for more details. */
  var rowTemplate: js.UndefOr[String] = js.native
  /** Select deselect an item by index. */
  var selectItem: js.UndefOr[js.Function2[/* idx */ Double, /* state */ Boolean, _]] = js.native
  /** Disable row selections by clicking on the row and only when the checkbox is clicked. */
  var selectWithCheckboxOnly: js.UndefOr[Boolean] = js.native
  /** all of the items selected in the grid. In single select mode there will only be one item in the array. */
  var selectedItems: js.UndefOr[js.Array[_]] = js.native
  /** Enables menu to choose which columns to display and group by.
    If both showColumnMenu and showFilter are false the menu button will not display.*/
  var showColumnMenu: js.UndefOr[Boolean] = js.native
  /** Enables display of the filterbox in the column menu.
    If both showColumnMenu and showFilter are false the menu button will not display.*/
  var showFilter: js.UndefOr[Boolean] = js.native
  /** Show or hide the footer alltogether the footer is enabled by default */
  var showFooter: js.UndefOr[Boolean] = js.native
  /** Show the dropzone for drag and drop grouping */
  var showGroupPanel: js.UndefOr[Boolean] = js.native
  /** Row selection check boxes appear as the first column. */
  var showSelectionCheckbox: js.UndefOr[Boolean] = js.native
  /** Define a sortInfo object to specify a default sorting state.
    You can also observe this variable to utilize server-side sorting (see useExternalSorting).
    Syntax is sortinfo: { fields: ['fieldName1',' fieldName2'], direction: 'ASC'/'asc' || 'desc'/'DESC'}*/
  var sortInfo: js.UndefOr[js.Any] = js.native
  /** Set the tab index of the Vieport. */
  var tabIndex: js.UndefOr[Double] = js.native
  /** Prevents the internal sorting from executing.
    The sortInfo object will be updated with the sorting information so you can handle sorting (see sortInfo)*/
  var useExternalSorting: js.UndefOr[Boolean] = js.native
  /** the threshold in rows to force virtualization on  */
  var virtualizationThreshold: js.UndefOr[Double] = js.native
}

object IGridOptions {
  @scala.inline
  def apply(): IGridOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGridOptions]
  }
  @scala.inline
  implicit class IGridOptionsOps[Self <: IGridOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAfterSelectionChange(value: (/* rowItem */ js.UndefOr[IRow], /* event */ js.UndefOr[js.Any]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterSelectionChange")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutAfterSelectionChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterSelectionChange")(js.undefined)
        ret
    }
    @scala.inline
    def withAggregateTemplate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aggregateTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAggregateTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aggregateTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeSelectionChange(value: (/* rowItem */ js.UndefOr[IRow], /* event */ js.UndefOr[js.Any]) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeSelectionChange")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutBeforeSelectionChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeSelectionChange")(js.undefined)
        ret
    }
    @scala.inline
    def withCheckboxCellTemplate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkboxCellTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCheckboxCellTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkboxCellTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withCheckboxHeaderTemplate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkboxHeaderTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCheckboxHeaderTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkboxHeaderTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnDefs(value: js.Array[IColumnDef]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnDefs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnDefs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnDefs")(js.undefined)
        ret
    }
    @scala.inline
    def withData(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withDataUpdated(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataUpdated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataUpdated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataUpdated")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableCellEdit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableCellEdit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableCellEdit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableCellEdit")(js.undefined)
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
    def withEnableColumnHeavyVirt(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableColumnHeavyVirt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableColumnHeavyVirt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableColumnHeavyVirt")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableColumnReordering(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableColumnReordering")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableColumnReordering: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableColumnReordering")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableColumnResize(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableColumnResize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableColumnResize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableColumnResize")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableHighlighting(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableHighlighting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableHighlighting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableHighlighting")(js.undefined)
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
    def withEnablePinning(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enablePinning")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnablePinning: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enablePinning")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableRowReordering(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableRowReordering")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableRowReordering: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableRowReordering")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableRowSelection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableRowSelection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableRowSelection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableRowSelection")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableSorting(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableSorting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableSorting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableSorting")(js.undefined)
        ret
    }
    @scala.inline
    def withExcludeProperties(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludeProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExcludeProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludeProperties")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterOptions(value: IFilterOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withFooterRowHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footerRowHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFooterRowHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footerRowHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withGroups(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groups")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderRowHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerRowHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderRowHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerRowHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderRowTemplate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerRowTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderRowTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerRowTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withI18n(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("i18n")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutI18n: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("i18n")(js.undefined)
        ret
    }
    @scala.inline
    def withJqueryUIDraggable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jqueryUIDraggable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJqueryUIDraggable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jqueryUIDraggable")(js.undefined)
        ret
    }
    @scala.inline
    def withJqueryUITheme(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jqueryUITheme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJqueryUITheme: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jqueryUITheme")(js.undefined)
        ret
    }
    @scala.inline
    def withKeepLastSelected(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepLastSelected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeepLastSelected: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepLastSelected")(js.undefined)
        ret
    }
    @scala.inline
    def withMaintainColumnRatios(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maintainColumnRatios")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaintainColumnRatios: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maintainColumnRatios")(js.undefined)
        ret
    }
    @scala.inline
    def withMultiSelect(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiSelect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultiSelect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiSelect")(js.undefined)
        ret
    }
    @scala.inline
    def withPagingOptions(value: IPagingOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pagingOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPagingOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pagingOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withPinSelectionCheckbox(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pinSelectionCheckbox")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPinSelectionCheckbox: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pinSelectionCheckbox")(js.undefined)
        ret
    }
    @scala.inline
    def withPlugins(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlugins: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugins")(js.undefined)
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
    def withRowTemplate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectItem(value: (/* idx */ Double, /* state */ Boolean) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectItem")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutSelectItem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectItem")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectWithCheckboxOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectWithCheckboxOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectWithCheckboxOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectWithCheckboxOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedItems(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedItems")(js.undefined)
        ret
    }
    @scala.inline
    def withShowColumnMenu(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showColumnMenu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowColumnMenu: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showColumnMenu")(js.undefined)
        ret
    }
    @scala.inline
    def withShowFilter(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showFilter")(js.undefined)
        ret
    }
    @scala.inline
    def withShowFooter(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showFooter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowFooter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showFooter")(js.undefined)
        ret
    }
    @scala.inline
    def withShowGroupPanel(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showGroupPanel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowGroupPanel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showGroupPanel")(js.undefined)
        ret
    }
    @scala.inline
    def withShowSelectionCheckbox(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showSelectionCheckbox")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowSelectionCheckbox: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showSelectionCheckbox")(js.undefined)
        ret
    }
    @scala.inline
    def withSortInfo(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withTabIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTabIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withUseExternalSorting(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useExternalSorting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseExternalSorting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useExternalSorting")(js.undefined)
        ret
    }
    @scala.inline
    def withVirtualizationThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualizationThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVirtualizationThreshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualizationThreshold")(js.undefined)
        ret
    }
  }
  
}

