package typingsSlinky.devextreme.mod.DevExpress.ui

import typingsSlinky.devextreme.anon.AllowClearing
import typingsSlinky.devextreme.anon.GroupInterval
import typingsSlinky.devextreme.anon.SearchMode
import typingsSlinky.devextreme.devextremeStrings.Equalssign
import typingsSlinky.devextreme.devextremeStrings.Greaterthansign
import typingsSlinky.devextreme.devextremeStrings.GreaterthansignEqualssign
import typingsSlinky.devextreme.devextremeStrings.Lessthansign
import typingsSlinky.devextreme.devextremeStrings.LessthansignEqualssign
import typingsSlinky.devextreme.devextremeStrings.LessthansignGreaterthansign
import typingsSlinky.devextreme.devextremeStrings.`object`
import typingsSlinky.devextreme.devextremeStrings.asc
import typingsSlinky.devextreme.devextremeStrings.between
import typingsSlinky.devextreme.devextremeStrings.boolean_
import typingsSlinky.devextreme.devextremeStrings.center
import typingsSlinky.devextreme.devextremeStrings.contains
import typingsSlinky.devextreme.devextremeStrings.date
import typingsSlinky.devextreme.devextremeStrings.datetime
import typingsSlinky.devextreme.devextremeStrings.desc
import typingsSlinky.devextreme.devextremeStrings.endswith
import typingsSlinky.devextreme.devextremeStrings.exclude
import typingsSlinky.devextreme.devextremeStrings.include
import typingsSlinky.devextreme.devextremeStrings.left
import typingsSlinky.devextreme.devextremeStrings.notcontains
import typingsSlinky.devextreme.devextremeStrings.number
import typingsSlinky.devextreme.devextremeStrings.right
import typingsSlinky.devextreme.devextremeStrings.startswith
import typingsSlinky.devextreme.devextremeStrings.string_
import typingsSlinky.devextreme.mod.global.JQueryPromise
import typingsSlinky.devextreme.mod.global.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GridBaseColumn extends js.Object {
  /** Aligns the content of the column. */
  var alignment: js.UndefOr[center | left | right] = js.native
  /** Specifies whether a user can edit values in the column at runtime. By default, inherits the value of the editing.allowUpdating option. */
  var allowEditing: js.UndefOr[Boolean] = js.native
  /** Specifies whether data can be filtered by this column. Applies only if filterRow.visible is true. */
  var allowFiltering: js.UndefOr[Boolean] = js.native
  /** Specifies whether a user can fix the column at runtime. Applies only if columnFixing.enabled is true. */
  var allowFixing: js.UndefOr[Boolean] = js.native
  /** Specifies whether the header filter can be used to filter data by this column. Applies only if headerFilter.visible is true. By default, inherits the value of the allowFiltering option. */
  var allowHeaderFiltering: js.UndefOr[Boolean] = js.native
  /** Specifies whether a user can hide the column using the column chooser at runtime. Applies only if columnChooser.enabled is true. */
  var allowHiding: js.UndefOr[Boolean] = js.native
  /** Specifies whether this column can be used in column reordering at runtime. Applies only if allowColumnReordering is true. */
  var allowReordering: js.UndefOr[Boolean] = js.native
  /** Specifies whether a user can resize the column at runtime. Applies only if allowColumnResizing is true. */
  var allowResizing: js.UndefOr[Boolean] = js.native
  /** Specifies whether this column can be searched. Applies only if searchPanel.visible is true. Inherits the value of the allowFiltering option by default. */
  var allowSearch: js.UndefOr[Boolean] = js.native
  /** Specifies whether a user can sort rows by this column at runtime. Applies only if sorting.mode differs from "none". */
  var allowSorting: js.UndefOr[Boolean] = js.native
  /** Calculates custom cell values. Use this function to create an unbound data column. */
  var calculateCellValue: js.UndefOr[js.Function1[/* rowData */ js.Any, _]] = js.native
  /** Calculates custom display values for column cells. Requires specifying the dataField or calculateCellValue option. Used in lookup optimization. */
  var calculateDisplayValue: js.UndefOr[String | (js.Function1[/* rowData */ js.Any, _])] = js.native
  /** Specifies the column's custom filtering rules. */
  var calculateFilterExpression: js.UndefOr[
    js.Function3[
      /* filterValue */ js.Any, 
      /* selectedFilterOperation */ String, 
      /* target */ String, 
      String | js.Array[_] | js.Function
    ]
  ] = js.native
  /** Calculates custom values to be used in sorting. */
  var calculateSortValue: js.UndefOr[String | (js.Function1[/* rowData */ js.Any, _])] = js.native
  /** Specifies a caption for the column. */
  var caption: js.UndefOr[String] = js.native
  /** Specifies a CSS class to be applied to the column. */
  var cssClass: js.UndefOr[String] = js.native
  /** Customizes the text displayed in column cells. */
  var customizeText: js.UndefOr[js.Function1[/* cellInfo */ GroupInterval, String]] = js.native
  /** Binds the column to a field of the dataSource. */
  var dataField: js.UndefOr[String] = js.native
  /** Casts column values to a specific data type. */
  var dataType: js.UndefOr[string_ | number | date | boolean_ | `object` | datetime] = js.native
  /** Configures the default widget used for editing and filtering in the filter row. */
  var editorOptions: js.UndefOr[js.Any] = js.native
  /** Specifies whether HTML tags are displayed as plain text or applied to the values of the column. */
  var encodeHtml: js.UndefOr[Boolean] = js.native
  /** In a boolean column, replaces all false items with a specified text. Applies only if showEditorAlways option is false. */
  var falseText: js.UndefOr[String] = js.native
  /** Specifies a set of available filter operations. Applies only if filterRow.visible and allowFiltering are true. */
  var filterOperations: js.UndefOr[
    js.Array[
      Equalssign | LessthansignGreaterthansign | Lessthansign | LessthansignEqualssign | Greaterthansign | GreaterthansignEqualssign | notcontains | contains | startswith | endswith | between
    ]
  ] = js.native
  /** Specifies whether a user changes the current filter by including (selecting) or excluding (clearing the selection of) values. Applies only if headerFilter.visible and allowHeaderFiltering are true. */
  var filterType: js.UndefOr[exclude | include] = js.native
  /** Specifies the column's filter value displayed in the filter row. */
  var filterValue: js.UndefOr[js.Any] = js.native
  /** Specifies values selected in the column's header filter. */
  var filterValues: js.UndefOr[js.Array[_]] = js.native
  /** Fixes the column. */
  var fixed: js.UndefOr[Boolean] = js.native
  /** Specifies the widget's edge to which the column is fixed. Applies only if columns[].fixed is true. */
  var fixedPosition: js.UndefOr[left | right] = js.native
  /** Configures the form item that the column produces in the editing state. Applies only if editing.mode is "form" or "popup". */
  var formItem: js.UndefOr[dxFormSimpleItem] = js.native
  /** Formats a value before it is displayed in a column cell. */
  var format: js.UndefOr[typingsSlinky.devextreme.mod.DevExpress.ui.format] = js.native
  /** Specifies data settings for the header filter. */
  var headerFilter: js.UndefOr[SearchMode] = js.native
  /** Specifies the order in which columns are hidden when the widget adapts to the screen or container size. Ignored if allowColumnResizing is true and columnResizingMode is "widget". */
  var hidingPriority: js.UndefOr[Double] = js.native
  /** Specifies whether the column bands other columns or not. */
  var isBand: js.UndefOr[Boolean] = js.native
  /** Specifies options of a lookup column. */
  var lookup: js.UndefOr[AllowClearing] = js.native
  /** Specifies the minimum width of the column. */
  var minWidth: js.UndefOr[Double] = js.native
  /** Specifies the identifier of the column. */
  var name: js.UndefOr[String] = js.native
  /** Specifies the band column that owns the current column. Accepts the index of the band column in the columns array. */
  var ownerBand: js.UndefOr[Double] = js.native
  /** Specifies whether to render the column after other columns and elements. Use if column cells have a complex template. Requires the width option specified. */
  var renderAsync: js.UndefOr[Boolean] = js.native
  /** Specifies the column's filter operation displayed in the filter row. */
  var selectedFilterOperation: js.UndefOr[
    Lessthansign | LessthansignEqualssign | LessthansignGreaterthansign | Equalssign | Greaterthansign | GreaterthansignEqualssign | between | contains | endswith | notcontains | startswith
  ] = js.native
  /** Specifies a function to be invoked after the user has edited a cell value, but before it will be saved in the data source. */
  var setCellValue: js.UndefOr[
    js.Function3[
      /* newData */ js.Any, 
      /* value */ js.Any, 
      /* currentRowData */ js.Any, 
      Unit | Promise[Unit] | JQueryPromise[Unit]
    ]
  ] = js.native
  /** Specifies whether the column displays its values using editors. */
  var showEditorAlways: js.UndefOr[Boolean] = js.native
  /** Specifies whether the column chooser can contain the column header. */
  var showInColumnChooser: js.UndefOr[Boolean] = js.native
  /** Specifies the index according to which columns participate in sorting. */
  var sortIndex: js.UndefOr[Double] = js.native
  /** Specifies the sort order of column values. */
  var sortOrder: js.UndefOr[asc | desc] = js.native
  /** Specifies a custom comparison function for sorting. Applies only when sorting is performed on the client. */
  var sortingMethod: js.UndefOr[js.Function2[/* value1 */ js.Any, /* value2 */ js.Any, Double]] = js.native
  /** In a boolean column, replaces all true items with a specified text. Applies only if showEditorAlways option is false. */
  var trueText: js.UndefOr[String] = js.native
  /** Specifies validation rules to be checked when cell values are updated. */
  var validationRules: js.UndefOr[
    js.Array[
      RequiredRule | NumericRule | RangeRule | StringLengthRule | CustomRule | CompareRule | PatternRule | EmailRule | AsyncRule
    ]
  ] = js.native
  /** Specifies whether the column is visible, that is, occupies space in the table. */
  var visible: js.UndefOr[Boolean] = js.native
  /** Specifies the position of the column regarding other columns in the resulting widget. */
  var visibleIndex: js.UndefOr[Double] = js.native
  /** Specifies the column's width in pixels or as a percentage. Ignored if it is less than minWidth. */
  var width: js.UndefOr[Double | String] = js.native
}

object GridBaseColumn {
  @scala.inline
  def apply(): GridBaseColumn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridBaseColumn]
  }
  @scala.inline
  implicit class GridBaseColumnOps[Self <: GridBaseColumn] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlignment(value: center | left | right): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlignment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignment")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowEditing(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowEditing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowEditing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowEditing")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowFiltering(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowFiltering")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowFiltering: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowFiltering")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowFixing(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowFixing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowFixing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowFixing")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowHeaderFiltering(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowHeaderFiltering")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowHeaderFiltering: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowHeaderFiltering")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowHiding(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowHiding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowHiding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowHiding")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowReordering(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowReordering")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowReordering: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowReordering")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowResizing(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowResizing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowResizing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowResizing")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowSearch(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowSearch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowSearch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowSearch")(js.undefined)
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
    def withCalculateCellValue(value: /* rowData */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calculateCellValue")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCalculateCellValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calculateCellValue")(js.undefined)
        ret
    }
    @scala.inline
    def withCalculateDisplayValueFunction1(value: /* rowData */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calculateDisplayValue")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCalculateDisplayValue(value: String | (js.Function1[/* rowData */ js.Any, _])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calculateDisplayValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCalculateDisplayValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calculateDisplayValue")(js.undefined)
        ret
    }
    @scala.inline
    def withCalculateFilterExpression(
      value: (/* filterValue */ js.Any, /* selectedFilterOperation */ String, /* target */ String) => String | js.Array[_] | js.Function
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calculateFilterExpression")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutCalculateFilterExpression: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calculateFilterExpression")(js.undefined)
        ret
    }
    @scala.inline
    def withCalculateSortValueFunction1(value: /* rowData */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calculateSortValue")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCalculateSortValue(value: String | (js.Function1[/* rowData */ js.Any, _])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calculateSortValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCalculateSortValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calculateSortValue")(js.undefined)
        ret
    }
    @scala.inline
    def withCaption(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCaption: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caption")(js.undefined)
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
    def withCustomizeText(value: /* cellInfo */ GroupInterval => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customizeText")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCustomizeText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customizeText")(js.undefined)
        ret
    }
    @scala.inline
    def withDataField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataField")(js.undefined)
        ret
    }
    @scala.inline
    def withDataType(value: string_ | number | date | boolean_ | `object` | datetime): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataType")(js.undefined)
        ret
    }
    @scala.inline
    def withEditorOptions(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editorOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEditorOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editorOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withEncodeHtml(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encodeHtml")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncodeHtml: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encodeHtml")(js.undefined)
        ret
    }
    @scala.inline
    def withFalseText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("falseText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFalseText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("falseText")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterOperations(
      value: js.Array[
          Equalssign | LessthansignGreaterthansign | Lessthansign | LessthansignEqualssign | Greaterthansign | GreaterthansignEqualssign | notcontains | contains | startswith | endswith | between
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterOperations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterOperations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterOperations")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterType(value: exclude | include): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterType")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterValue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterValue")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterValues(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterValues")(js.undefined)
        ret
    }
    @scala.inline
    def withFixed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFixed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixed")(js.undefined)
        ret
    }
    @scala.inline
    def withFixedPosition(value: left | right): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixedPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFixedPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixedPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withFormItem(value: dxFormSimpleItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormItem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formItem")(js.undefined)
        ret
    }
    @scala.inline
    def withFormatFunction1(value: /* value */ Double | js.Date => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFormat(value: format): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderFilter(value: SearchMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerFilter")(js.undefined)
        ret
    }
    @scala.inline
    def withHidingPriority(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hidingPriority")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHidingPriority: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hidingPriority")(js.undefined)
        ret
    }
    @scala.inline
    def withIsBand(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isBand")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsBand: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isBand")(js.undefined)
        ret
    }
    @scala.inline
    def withLookup(value: AllowClearing): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lookup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLookup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lookup")(js.undefined)
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
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withOwnerBand(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ownerBand")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOwnerBand: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ownerBand")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderAsync(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderAsync")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenderAsync: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderAsync")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedFilterOperation(
      value: Lessthansign | LessthansignEqualssign | LessthansignGreaterthansign | Equalssign | Greaterthansign | GreaterthansignEqualssign | between | contains | endswith | notcontains | startswith
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedFilterOperation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedFilterOperation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedFilterOperation")(js.undefined)
        ret
    }
    @scala.inline
    def withSetCellValue(
      value: (/* newData */ js.Any, /* value */ js.Any, /* currentRowData */ js.Any) => Unit | Promise[Unit] | JQueryPromise[Unit]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setCellValue")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutSetCellValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setCellValue")(js.undefined)
        ret
    }
    @scala.inline
    def withShowEditorAlways(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showEditorAlways")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowEditorAlways: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showEditorAlways")(js.undefined)
        ret
    }
    @scala.inline
    def withShowInColumnChooser(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showInColumnChooser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowInColumnChooser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showInColumnChooser")(js.undefined)
        ret
    }
    @scala.inline
    def withSortIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withSortOrder(value: asc | desc): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortOrder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortOrder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortOrder")(js.undefined)
        ret
    }
    @scala.inline
    def withSortingMethod(value: (/* value1 */ js.Any, /* value2 */ js.Any) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortingMethod")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutSortingMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortingMethod")(js.undefined)
        ret
    }
    @scala.inline
    def withTrueText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trueText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrueText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trueText")(js.undefined)
        ret
    }
    @scala.inline
    def withValidationRules(
      value: js.Array[
          RequiredRule | NumericRule | RangeRule | StringLengthRule | CustomRule | CompareRule | PatternRule | EmailRule | AsyncRule
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validationRules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidationRules: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validationRules")(js.undefined)
        ret
    }
    @scala.inline
    def withVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(js.undefined)
        ret
    }
    @scala.inline
    def withVisibleIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibleIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisibleIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibleIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Double | String): Self = {
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

