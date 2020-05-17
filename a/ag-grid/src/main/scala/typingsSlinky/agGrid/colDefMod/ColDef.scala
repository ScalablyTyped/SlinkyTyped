package typingsSlinky.agGrid.colDefMod

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.agGrid.anon.InstantiableAny
import typingsSlinky.agGrid.anon.InstantiableICellEditorComp
import typingsSlinky.agGrid.anon.InstantiableICellRendererComp
import typingsSlinky.agGrid.anon.InstantiableIFilterComp
import typingsSlinky.agGrid.anon.InstantiableIFloatingFilterComp
import typingsSlinky.agGrid.columnMod.Column
import typingsSlinky.agGrid.componentResolverMod.ComponentHolder
import typingsSlinky.agGrid.componentResolverMod.DynamicComponentDef
import typingsSlinky.agGrid.componentResolverMod.DynamicComponentParams
import typingsSlinky.agGrid.eventsMod.CellClickedEvent
import typingsSlinky.agGrid.eventsMod.CellContextMenuEvent
import typingsSlinky.agGrid.eventsMod.CellDoubleClickedEvent
import typingsSlinky.agGrid.iCellRendererMod.ICellRendererFunc
import typingsSlinky.agGrid.rowNodeMod.RowNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColDef
  extends AbstractColDef
     with ComponentHolder {
  /** Name of function to use for aggregation. One of [sum,min,max,first,last] or a function. */
  var aggFunc: js.UndefOr[String | IAggFunc] = js.native
  /** Agg funcs allowed on this column. If missing, all installed agg funcs are allowed.
    * Can be eg ['sum','avg']. This will restrict what the GUI allows to select only.*/
  var allowedAggFuncs: js.UndefOr[js.Array[String]] = js.native
  /** True if this column should stretch rows height to fit contents */
  var autoHeight: js.UndefOr[Boolean] = js.native
  /** Class to use for the cell. Can be string, array of strings, or function. */
  var cellClass: js.UndefOr[
    String | js.Array[String] | (js.Function1[/* cellClassParams */ CellClassParams, String | js.Array[String]])
  ] = js.native
  /** Rules for applying css classes */
  var cellClassRules: js.UndefOr[StringDictionary[js.Function | String]] = js.native
  /** Cell editor */
  var cellEditor: js.UndefOr[InstantiableICellEditorComp | String] = js.native
  var cellEditorFramework: js.UndefOr[js.Any] = js.native
  var cellEditorParams: js.UndefOr[js.Any] = js.native
  var cellEditorSelector: js.UndefOr[js.Function1[/* params */ DynamicComponentParams, DynamicComponentDef]] = js.native
  /** A function for rendering a cell. */
  var cellRenderer: js.UndefOr[InstantiableICellRendererComp | ICellRendererFunc | String] = js.native
  var cellRendererFramework: js.UndefOr[js.Any] = js.native
  var cellRendererParams: js.UndefOr[js.Any] = js.native
  var cellRendererSelector: js.UndefOr[js.Function1[/* params */ DynamicComponentParams, DynamicComponentDef]] = js.native
  /** An object of css values. Or a function returning an object of css values. */
  var cellStyle: js.UndefOr[js.Object | (js.Function1[/* params */ js.Any, js.Object])] = js.native
  /** Set to true to render a selection checkbox in the column. */
  var checkboxSelection: js.UndefOr[Boolean | (js.Function1[/* params */ js.Any, Boolean])] = js.native
  /** The unique ID to give the column. This is optional. If missing, the ID will default to the field.
    *  If both field and colId are missing, a unique ID will be generated.
    *  This ID is used to identify the column in the API for sorting, filtering etc. */
  var colId: js.UndefOr[String] = js.native
  var colSpan: js.UndefOr[js.Function1[/* params */ ColSpanParams, Double]] = js.native
  /** Comparator function for custom sorting. */
  var comparator: js.UndefOr[
    js.Function5[
      /* valueA */ js.Any, 
      /* valueB */ js.Any, 
      /* nodeA */ js.UndefOr[RowNode], 
      /* nodeB */ js.UndefOr[RowNode], 
      /* isInverted */ js.UndefOr[Boolean], 
      Double
    ]
  ] = js.native
  /** Set to true if this col is editable, otherwise false. Can also be a function to have different rows editable. */
  var editable: js.UndefOr[Boolean | IsColumnFunc] = js.native
  /** If true, grid will flash cell after cell is refreshed */
  var enableCellChangeFlash: js.UndefOr[Boolean] = js.native
  /** If true, GUI will allow adding this columns as a pivot */
  var enablePivot: js.UndefOr[Boolean] = js.native
  /** If true, GUI will allow adding this columns as a row group */
  var enableRowGroup: js.UndefOr[Boolean] = js.native
  /** If true, GUI will allow adding this columns as a value */
  var enableValue: js.UndefOr[Boolean] = js.native
  /** Comparator for values, used by renderer to know if values have changed. Cells who's values have not changed don't get refreshed. */
  @JSName("equals")
  var equals_FColDef: js.UndefOr[js.Function2[/* valueA */ js.Any, /* valueB */ js.Any, Boolean]] = js.native
  /** The field of the row to get the cells data from */
  var field: js.UndefOr[String] = js.native
  /** one of the built in filter names: [set, number, text], or a filter function*/
  var filter: js.UndefOr[String | InstantiableIFilterComp] = js.native
  var filterFramework: js.UndefOr[js.Any] = js.native
  /** The filter params are specific to each filter! */
  var filterParams: js.UndefOr[js.Any] = js.native
  /** Expression or function to get the cells value for filtering. */
  var filterValueGetter: js.UndefOr[(js.Function1[/* params */ ValueGetterParams, _]) | String] = js.native
  /** The custom header component to be used for rendering the floating filter. If none specified the default ag-Grid is used**/
  var floatingFilterComponent: js.UndefOr[InstantiableIFloatingFilterComp] = js.native
  var floatingFilterComponentFramework: js.UndefOr[InstantiableAny] = js.native
  var floatingFilterComponentParams: js.UndefOr[js.Any] = js.native
  /** To create the quick filter text for this column, if toString is not good enough on the value. */
  var getQuickFilterText: js.UndefOr[js.Function1[/* params */ GetQuickFilterTextParams, String]] = js.native
  /** If true, a 'select all' checkbox will be put into the header */
  var headerCheckboxSelection: js.UndefOr[Boolean | (js.Function1[/* params */ js.Any, Boolean])] = js.native
  /** If true, the header checkbox selection will work on filtered items*/
  var headerCheckboxSelectionFilteredOnly: js.UndefOr[Boolean] = js.native
  /** The custom header component to be used for rendering the component header. If none specified the default ag-Grid is used**/
  var headerComponent: js.UndefOr[String | InstantiableAny] = js.native
  /** The custom header component to be used for rendering the component header in the hosting framework (ie: React/Angular). If none specified the default ag-Grid is used**/
  var headerComponentFramework: js.UndefOr[InstantiableAny] = js.native
  /** The custom header component parameters**/
  var headerComponentParams: js.UndefOr[js.Any] = js.native
  /** Set to true for this column to be hidden. Naturally you might think, it would make more sense to call this field 'visible' and mark it false to hide,
    *  however we want all default values to be false and we want columns to be visible by default. */
  var hide: js.UndefOr[Boolean] = js.native
  /** Icons for this column. Leave blank to use default. */
  var icons: js.UndefOr[StringDictionary[String]] = js.native
  /** Function to return the key for a value - use this if the value is an object (not a primitive type) and you
    * want to a) group by this field or b) use set filter on this field. */
  var keyCreator: js.UndefOr[js.Function] = js.native
  /** Set to true to block the user pinning the column, the column can only be pinned via definitions or API */
  var lockPinned: js.UndefOr[Boolean] = js.native
  /** Set to true to make sure this column is always first. Other columns, if movable, cannot move before this column. */
  var lockPosition: js.UndefOr[Boolean] = js.native
  /** Set to true to block the user showing / hiding the column, the column can only be shown / hidden via definitions or API */
  var lockVisible: js.UndefOr[Boolean] = js.native
  /** Max width, in pixels, of the cell */
  var maxWidth: js.UndefOr[Double] = js.native
  /** The menu tabs to show, and in which order, the valid values for this property are:
    * filterMenuTab, generalMenuTab, columnsMenuTab **/
  var menuTabs: js.UndefOr[js.Array[String]] = js.native
  /** Min width, in pixels, of the cell */
  var minWidth: js.UndefOr[Double] = js.native
  /** Callbacks for editing. See editing section for further details.
    * Return true if the update was successful, or false if not.
    * If false, then skips the UI refresh and no events are emitted.
    * Return false if the values are the same (ie no update). */
  var newValueHandler: js.UndefOr[js.Function1[/* params */ js.Any, Boolean]] = js.native
  /** Function callback, gets called when a cell is clicked. */
  var onCellClicked: js.UndefOr[js.Function1[/* event */ CellClickedEvent, Unit]] = js.native
  /** Function callback, gets called when a cell is right clicked. */
  var onCellContextMenu: js.UndefOr[js.Function1[/* event */ CellContextMenuEvent, Unit]] = js.native
  /** Function callback, gets called when a cell is double clicked. */
  var onCellDoubleClicked: js.UndefOr[js.Function1[/* event */ CellDoubleClickedEvent, Unit]] = js.native
  /** Callbacks for editing.See editing section for further details. */
  var onCellValueChanged: js.UndefOr[js.Function] = js.native
  /** Whether this column is pinned or not. */
  var pinned: js.UndefOr[Boolean | String] = js.native
  /** A function for rendering a pinned row cell. */
  var pinnedRowCellRenderer: js.UndefOr[InstantiableICellRendererComp | ICellRendererFunc | String] = js.native
  var pinnedRowCellRendererFramework: js.UndefOr[js.Any] = js.native
  var pinnedRowCellRendererParams: js.UndefOr[js.Any] = js.native
  /** A function to format a pinned row value, should return a string. Not used for CSV export or copy to clipboard, only for UI cell rendering. */
  var pinnedRowValueFormatter: js.UndefOr[js.Function1[/* params */ ValueFormatterParams, String]] = js.native
  var pivot: js.UndefOr[Boolean] = js.native
  /** Comparator for ordering the pivot columns */
  var pivotComparator: js.UndefOr[js.Function2[/* valueA */ String, /* valueB */ String, Double]] = js.native
  /** To pivot by this column by default, either provide an index (eg pivotIndex=1), or set pivot=true. */
  var pivotIndex: js.UndefOr[Double] = js.native
  /** Never set this, it is used internally by grid when doing in-grid pivoting */
  var pivotTotalColumnIds: js.UndefOr[js.Array[String]] = js.native
  /** Never set this, it is used internally by grid when doing in-grid pivoting */
  var pivotValueColumn: js.UndefOr[Column] = js.native
  var refData: js.UndefOr[StringDictionary[String]] = js.native
  var rowDrag: js.UndefOr[Boolean | (js.Function1[/* params */ js.Any, Boolean])] = js.native
  var rowGroup: js.UndefOr[Boolean] = js.native
  /** To group by this column by default, either provide an index (eg rowGroupIndex=1), or set rowGroup=true. */
  var rowGroupIndex: js.UndefOr[Double] = js.native
  var rowSpan: js.UndefOr[js.Function1[/* params */ RowSpanParams, Double]] = js.native
  /** Set to true to have the grid place the values for the group into the cell, or put the name of a grouped column to just show that group. */
  var showRowGroup: js.UndefOr[String | Boolean] = js.native
  /** If true, this cell will be in editing mode after first click. */
  var singleClickEdit: js.UndefOr[Boolean] = js.native
  /** If sorting by default, set it here. Set to 'asc' or 'desc' */
  var sort: js.UndefOr[String] = js.native
  /** If sorting more than one column by default, the milliseconds when this column was sorted, so we know what order to sort the columns in. */
  var sortedAt: js.UndefOr[Double] = js.native
  /** The sort order, provide an array with any of the following in any order ['asc','desc',null] */
  var sortingOrder: js.UndefOr[js.Array[String]] = js.native
  /** Set to true if you do not want this column to be auto-resizable by double clicking it's edge. */
  var suppressAutoSize: js.UndefOr[Boolean] = js.native
  /** Set to true to not flash this column for value changes */
  var suppressCellFlash: js.UndefOr[Boolean] = js.native
  /** Set to true to not allow filter on this column */
  var suppressFilter: js.UndefOr[Boolean] = js.native
  var suppressKeyboardEvent: js.UndefOr[js.Function1[/* params */ SuppressKeyboardEventParams, Boolean]] = js.native
  /** Set to true if no menu should be shown for this column header. */
  var suppressMenu: js.UndefOr[Boolean] = js.native
  /** Set to true to not allow moving this column via dragging it's header */
  var suppressMovable: js.UndefOr[Boolean] = js.native
  /** Set to tru if this col should not be navigable with the tab key. Can also be a function to have different rows editable. */
  var suppressNavigable: js.UndefOr[Boolean | IsColumnFunc] = js.native
  /** Set to true if this col should not be allowed take new values from teh clipboard . */
  var suppressPaste: js.UndefOr[Boolean | IsColumnFunc] = js.native
  /** Set to true if you do not want this column to be resizable by dragging it's edge. */
  var suppressResize: js.UndefOr[Boolean] = js.native
  /** Set to true if you want this columns width to be fixed during 'size to fit' operation. */
  var suppressSizeToFit: js.UndefOr[Boolean] = js.native
  /** Set to true if no sorting should be done for this column. */
  var suppressSorting: js.UndefOr[Boolean] = js.native
  /** Cell template to use for cell. Useful for AngularJS cells. */
  var template: js.UndefOr[String] = js.native
  /** Cell template URL to load template from to use for cell. Useful for AngularJS cells. */
  var templateUrl: js.UndefOr[String] = js.native
  /** The function used to calculate the tooltip of the object, tooltipField takes precedence*/
  var tooltip: js.UndefOr[js.Function1[/* params */ TooltipParams, String]] = js.native
  /** The field where we get the tooltip on the object */
  var tooltipField: js.UndefOr[String] = js.native
  /**
    * A comma separated string or array of strings containing ColumnType keys which can be used as a template for a column.
    * This helps to reduce duplication of properties when you have a lot of common column properties.
    */
  var `type`: js.UndefOr[String | js.Array[String]] = js.native
  /** Set to true if you want the unsorted icon to be shown when no sort is applied to this column. */
  var unSortIcon: js.UndefOr[Boolean] = js.native
  /** A function to format a value, should return a string. Not used for CSV export or copy to clipboard, only for UI cell rendering. */
  var valueFormatter: js.UndefOr[js.Function1[/* params */ ValueFormatterParams, String]] = js.native
  /** Expression or function to get the cells value. */
  var valueGetter: js.UndefOr[(js.Function1[/* params */ ValueGetterParams, _]) | String] = js.native
  /** Gets called after editing, converts the value in the cell. */
  var valueParser: js.UndefOr[js.Function1[/* params */ ValueParserParams, _ | String]] = js.native
  /** If not using a field, then this puts the value into the cell */
  var valueSetter: js.UndefOr[(js.Function1[/* params */ ValueSetterParams, Boolean]) | String] = js.native
  /** Initial width, in pixels, of the cell */
  var width: js.UndefOr[Double] = js.native
}

object ColDef {
  @scala.inline
  def apply(): ColDef = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColDef]
  }
  @scala.inline
  implicit class ColDefOps[Self <: ColDef] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAggFuncFunction1(value: /* input */ js.Array[js.Any] => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aggFunc")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAggFunc(value: String | IAggFunc): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aggFunc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAggFunc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aggFunc")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowedAggFuncs(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedAggFuncs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowedAggFuncs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedAggFuncs")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoHeight(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withCellClassFunction1(value: /* cellClassParams */ CellClassParams => String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellClass")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCellClass(
      value: String | js.Array[String] | (js.Function1[/* cellClassParams */ CellClassParams, String | js.Array[String]])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCellClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellClass")(js.undefined)
        ret
    }
    @scala.inline
    def withCellClassRules(value: StringDictionary[js.Function | String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellClassRules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCellClassRules: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellClassRules")(js.undefined)
        ret
    }
    @scala.inline
    def withCellEditor(value: InstantiableICellEditorComp | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellEditor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCellEditor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellEditor")(js.undefined)
        ret
    }
    @scala.inline
    def withCellEditorFramework(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellEditorFramework")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCellEditorFramework: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellEditorFramework")(js.undefined)
        ret
    }
    @scala.inline
    def withCellEditorParams(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellEditorParams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCellEditorParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellEditorParams")(js.undefined)
        ret
    }
    @scala.inline
    def withCellEditorSelector(value: /* params */ DynamicComponentParams => DynamicComponentDef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellEditorSelector")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCellEditorSelector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellEditorSelector")(js.undefined)
        ret
    }
    @scala.inline
    def withCellRendererFunction1(value: /* params */ js.Any => HTMLElement | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellRenderer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCellRenderer(value: InstantiableICellRendererComp | ICellRendererFunc | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellRenderer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCellRenderer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellRenderer")(js.undefined)
        ret
    }
    @scala.inline
    def withCellRendererFramework(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellRendererFramework")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCellRendererFramework: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellRendererFramework")(js.undefined)
        ret
    }
    @scala.inline
    def withCellRendererParams(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellRendererParams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCellRendererParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellRendererParams")(js.undefined)
        ret
    }
    @scala.inline
    def withCellRendererSelector(value: /* params */ DynamicComponentParams => DynamicComponentDef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellRendererSelector")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCellRendererSelector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellRendererSelector")(js.undefined)
        ret
    }
    @scala.inline
    def withCellStyleFunction1(value: /* params */ js.Any => js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellStyle")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCellStyle(value: js.Object | (js.Function1[/* params */ js.Any, js.Object])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCellStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withCheckboxSelectionFunction1(value: /* params */ js.Any => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkboxSelection")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCheckboxSelection(value: Boolean | (js.Function1[/* params */ js.Any, Boolean])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkboxSelection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCheckboxSelection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkboxSelection")(js.undefined)
        ret
    }
    @scala.inline
    def withColId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colId")(js.undefined)
        ret
    }
    @scala.inline
    def withColSpan(value: /* params */ ColSpanParams => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colSpan")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutColSpan: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colSpan")(js.undefined)
        ret
    }
    @scala.inline
    def withComparator(
      value: (/* valueA */ js.Any, /* valueB */ js.Any, /* nodeA */ js.UndefOr[RowNode], /* nodeB */ js.UndefOr[RowNode], /* isInverted */ js.UndefOr[Boolean]) => Double
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comparator")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withoutComparator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comparator")(js.undefined)
        ret
    }
    @scala.inline
    def withEditableFunction1(value: /* params */ IsColumnFuncParams => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editable")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEditable(value: Boolean | IsColumnFunc): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEditable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editable")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableCellChangeFlash(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableCellChangeFlash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableCellChangeFlash: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableCellChangeFlash")(js.undefined)
        ret
    }
    @scala.inline
    def withEnablePivot(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enablePivot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnablePivot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enablePivot")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableRowGroup(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableRowGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableRowGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableRowGroup")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableValue(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableValue")(js.undefined)
        ret
    }
    @scala.inline
    def withEquals(value: (/* valueA */ js.Any, /* valueB */ js.Any) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("equals")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutEquals: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("equals")(js.undefined)
        ret
    }
    @scala.inline
    def withField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("field")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("field")(js.undefined)
        ret
    }
    @scala.inline
    def withFilter(value: String | InstantiableIFilterComp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterFramework(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterFramework")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterFramework: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterFramework")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterParams(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterParams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterParams")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterValueGetterFunction1(value: /* params */ ValueGetterParams => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterValueGetter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFilterValueGetter(value: (js.Function1[/* params */ ValueGetterParams, _]) | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterValueGetter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterValueGetter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterValueGetter")(js.undefined)
        ret
    }
    @scala.inline
    def withFloatingFilterComponent(value: InstantiableIFloatingFilterComp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floatingFilterComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFloatingFilterComponent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floatingFilterComponent")(js.undefined)
        ret
    }
    @scala.inline
    def withFloatingFilterComponentFramework(value: InstantiableAny): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floatingFilterComponentFramework")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFloatingFilterComponentFramework: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floatingFilterComponentFramework")(js.undefined)
        ret
    }
    @scala.inline
    def withFloatingFilterComponentParams(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floatingFilterComponentParams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFloatingFilterComponentParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floatingFilterComponentParams")(js.undefined)
        ret
    }
    @scala.inline
    def withGetQuickFilterText(value: /* params */ GetQuickFilterTextParams => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getQuickFilterText")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetQuickFilterText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getQuickFilterText")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderCheckboxSelectionFunction1(value: /* params */ js.Any => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerCheckboxSelection")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHeaderCheckboxSelection(value: Boolean | (js.Function1[/* params */ js.Any, Boolean])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerCheckboxSelection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderCheckboxSelection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerCheckboxSelection")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderCheckboxSelectionFilteredOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerCheckboxSelectionFilteredOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderCheckboxSelectionFilteredOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerCheckboxSelectionFilteredOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderComponent(value: String | InstantiableAny): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderComponent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerComponent")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderComponentFramework(value: InstantiableAny): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerComponentFramework")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderComponentFramework: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerComponentFramework")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderComponentParams(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerComponentParams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderComponentParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerComponentParams")(js.undefined)
        ret
    }
    @scala.inline
    def withHide(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hide")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hide")(js.undefined)
        ret
    }
    @scala.inline
    def withIcons(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIcons: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icons")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyCreator(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyCreator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyCreator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyCreator")(js.undefined)
        ret
    }
    @scala.inline
    def withLockPinned(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lockPinned")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLockPinned: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lockPinned")(js.undefined)
        ret
    }
    @scala.inline
    def withLockPosition(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lockPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLockPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lockPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withLockVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lockVisible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLockVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lockVisible")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withMenuTabs(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuTabs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMenuTabs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuTabs")(js.undefined)
        ret
    }
    @scala.inline
    def withMinWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withNewValueHandler(value: /* params */ js.Any => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newValueHandler")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutNewValueHandler: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newValueHandler")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCellClicked(value: /* event */ CellClickedEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCellClicked")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnCellClicked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCellClicked")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCellContextMenu(value: /* event */ CellContextMenuEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCellContextMenu")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnCellContextMenu: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCellContextMenu")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCellDoubleClicked(value: /* event */ CellDoubleClickedEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCellDoubleClicked")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnCellDoubleClicked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCellDoubleClicked")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCellValueChanged(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCellValueChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnCellValueChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCellValueChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withPinned(value: Boolean | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pinned")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPinned: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pinned")(js.undefined)
        ret
    }
    @scala.inline
    def withPinnedRowCellRendererFunction1(value: /* params */ js.Any => HTMLElement | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pinnedRowCellRenderer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPinnedRowCellRenderer(value: InstantiableICellRendererComp | ICellRendererFunc | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pinnedRowCellRenderer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPinnedRowCellRenderer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pinnedRowCellRenderer")(js.undefined)
        ret
    }
    @scala.inline
    def withPinnedRowCellRendererFramework(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pinnedRowCellRendererFramework")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPinnedRowCellRendererFramework: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pinnedRowCellRendererFramework")(js.undefined)
        ret
    }
    @scala.inline
    def withPinnedRowCellRendererParams(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pinnedRowCellRendererParams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPinnedRowCellRendererParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pinnedRowCellRendererParams")(js.undefined)
        ret
    }
    @scala.inline
    def withPinnedRowValueFormatter(value: /* params */ ValueFormatterParams => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pinnedRowValueFormatter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutPinnedRowValueFormatter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pinnedRowValueFormatter")(js.undefined)
        ret
    }
    @scala.inline
    def withPivot(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pivot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPivot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pivot")(js.undefined)
        ret
    }
    @scala.inline
    def withPivotComparator(value: (/* valueA */ String, /* valueB */ String) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pivotComparator")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutPivotComparator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pivotComparator")(js.undefined)
        ret
    }
    @scala.inline
    def withPivotIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pivotIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPivotIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pivotIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withPivotTotalColumnIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pivotTotalColumnIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPivotTotalColumnIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pivotTotalColumnIds")(js.undefined)
        ret
    }
    @scala.inline
    def withPivotValueColumn(value: Column): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pivotValueColumn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPivotValueColumn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pivotValueColumn")(js.undefined)
        ret
    }
    @scala.inline
    def withRefData(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRefData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refData")(js.undefined)
        ret
    }
    @scala.inline
    def withRowDragFunction1(value: /* params */ js.Any => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowDrag")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRowDrag(value: Boolean | (js.Function1[/* params */ js.Any, Boolean])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowDrag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowDrag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowDrag")(js.undefined)
        ret
    }
    @scala.inline
    def withRowGroup(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowGroup")(js.undefined)
        ret
    }
    @scala.inline
    def withRowGroupIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowGroupIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowGroupIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowGroupIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withRowSpan(value: /* params */ RowSpanParams => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowSpan")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRowSpan: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowSpan")(js.undefined)
        ret
    }
    @scala.inline
    def withShowRowGroup(value: String | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showRowGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowRowGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showRowGroup")(js.undefined)
        ret
    }
    @scala.inline
    def withSingleClickEdit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("singleClickEdit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSingleClickEdit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("singleClickEdit")(js.undefined)
        ret
    }
    @scala.inline
    def withSort(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sort")(js.undefined)
        ret
    }
    @scala.inline
    def withSortedAt(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortedAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortedAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortedAt")(js.undefined)
        ret
    }
    @scala.inline
    def withSortingOrder(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortingOrder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortingOrder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortingOrder")(js.undefined)
        ret
    }
    @scala.inline
    def withSuppressAutoSize(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressAutoSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuppressAutoSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressAutoSize")(js.undefined)
        ret
    }
    @scala.inline
    def withSuppressCellFlash(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressCellFlash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuppressCellFlash: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressCellFlash")(js.undefined)
        ret
    }
    @scala.inline
    def withSuppressFilter(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuppressFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressFilter")(js.undefined)
        ret
    }
    @scala.inline
    def withSuppressKeyboardEvent(value: /* params */ SuppressKeyboardEventParams => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressKeyboardEvent")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSuppressKeyboardEvent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressKeyboardEvent")(js.undefined)
        ret
    }
    @scala.inline
    def withSuppressMenu(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressMenu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuppressMenu: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressMenu")(js.undefined)
        ret
    }
    @scala.inline
    def withSuppressMovable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressMovable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuppressMovable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressMovable")(js.undefined)
        ret
    }
    @scala.inline
    def withSuppressNavigableFunction1(value: /* params */ IsColumnFuncParams => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressNavigable")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSuppressNavigable(value: Boolean | IsColumnFunc): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressNavigable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuppressNavigable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressNavigable")(js.undefined)
        ret
    }
    @scala.inline
    def withSuppressPasteFunction1(value: /* params */ IsColumnFuncParams => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressPaste")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSuppressPaste(value: Boolean | IsColumnFunc): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressPaste")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuppressPaste: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressPaste")(js.undefined)
        ret
    }
    @scala.inline
    def withSuppressResize(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressResize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuppressResize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressResize")(js.undefined)
        ret
    }
    @scala.inline
    def withSuppressSizeToFit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressSizeToFit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuppressSizeToFit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressSizeToFit")(js.undefined)
        ret
    }
    @scala.inline
    def withSuppressSorting(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressSorting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuppressSorting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressSorting")(js.undefined)
        ret
    }
    @scala.inline
    def withTemplate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(js.undefined)
        ret
    }
    @scala.inline
    def withTemplateUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templateUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemplateUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templateUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withTooltip(value: /* params */ TooltipParams => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltip")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutTooltip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltip")(js.undefined)
        ret
    }
    @scala.inline
    def withTooltipField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTooltipField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipField")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String | js.Array[String]): Self = {
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
    def withUnSortIcon(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unSortIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnSortIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unSortIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withValueFormatter(value: /* params */ ValueFormatterParams => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueFormatter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutValueFormatter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueFormatter")(js.undefined)
        ret
    }
    @scala.inline
    def withValueGetterFunction1(value: /* params */ ValueGetterParams => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueGetter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withValueGetter(value: (js.Function1[/* params */ ValueGetterParams, _]) | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueGetter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueGetter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueGetter")(js.undefined)
        ret
    }
    @scala.inline
    def withValueParser(value: /* params */ ValueParserParams => _ | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueParser")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutValueParser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueParser")(js.undefined)
        ret
    }
    @scala.inline
    def withValueSetterFunction1(value: /* params */ ValueSetterParams => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueSetter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withValueSetter(value: (js.Function1[/* params */ ValueSetterParams, Boolean]) | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueSetter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueSetter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueSetter")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
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

