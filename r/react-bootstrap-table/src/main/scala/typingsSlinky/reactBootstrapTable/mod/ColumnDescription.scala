package typingsSlinky.reactBootstrapTable.mod

import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColumnDescription[TRow /* <: js.Object */] extends js.Object {
  /**
  	 * Column text alignment setting
  	 * Comes from TableHeader.dataAlign property.
  	 */
  var align: DataAlignType = js.native
  /**
  	 * Custom attributes (e.g. {'data-attr': 'test'}) to be applied to cells in this column.
  	 * Comes from TableHeader.tdAttr property.
  	 */
  var attrs: CustomAttrs = js.native
  /**
  	 * Custom className setting for this column.
  	 * Comes from TableHeader.columnClassName property.
  	 */
  var className: String | (js.Function4[
    /* cell */ js.Any, 
    /* row */ TRow, 
    /* rowIndex */ Double, 
    /* columnIndex */ Double, 
    String
  ]) = js.native
  /**
  	 * Custom title to display for this column.
  	 * Comes from TableHeader.columnTitle property.
  	 */
  var columnTitle: Boolean = js.native
  /**
  	 * Custom editor settings to use when editing the data in this column.
  	 * Comes from TableHeader.customEditor property.
  	 */
  var customEditor: CustomEditor[TRow, _] = js.native
  /**
  	 * Custom attributes (e.g. {'data-attr': 'test'}) to use for cells that are being edited in this column.
  	 * Comes from TableHeader.editTdAttr property.
  	 */
  var editAttrs: CustomAttrs = js.native
  /**
  	 * Custom className setting for this column when a cell in the column is being edited.
  	 * Comes from TableHeader.editColumnClassName property.
  	 */
  var editClassName: String | (js.Function2[/* cell */ js.Any, /* row */ TRow, String]) = js.native
  /**
  	 * Setting for whether the data in this column can be edited.
  	 * Comes from TableHeader.editable property.
  	 */
  var editable: Boolean | (Editable[TRow, _]) | (js.Function4[
    /* cell */ js.Any, 
    /* row */ TRow, 
    /* rowIndex */ Double, 
    /* columnIndex */ Double, 
    Boolean | String | EditValidatorObject
  ]) = js.native
  /**
  	 * Flag to indicate whether this column is expandable.
  	 * Comes from TableHeader.expandable property.
  	 */
  var expandable: Boolean = js.native
  /**
  	 * Flag to indicate whether this column should be included in a CSV export.
  	 * Comes from TableHeader.export property.
  	 */
  var export: Boolean = js.native
  /**
  	 * Whether data should be filtered based on the formatted value, or the raw data value.
  	 * Comes from TableHeader.filterFormatted property.
  	 */
  var filterFormatted: Boolean = js.native
  /**
  	 * The formatExtraData setting for the column.
  	 * Comes from TableHeader.formatExtraData property.
  	 */
  var formatExtraData: js.Any = js.native
  /**
  	 * Flag to indicate whether this column should be visible or not.
  	 * Comes from TableHeader.hidden property.
  	 */
  var hidden: Boolean = js.native
  /**
  	 * Flag to indicate whether this column should be hidden on the insert modal.
  	 * Comes from TableHeader.hiddenOnInsert property.
  	 */
  var hiddenOnInsert: Boolean = js.native
  /**
  	 * Custom className setting for this column when a cell in the column contains invalid data.
  	 * Comes from TableHeader.invalidEditColumnClassName property.
  	 */
  var invalidEditColumnClassName: String | (js.Function2[/* cell */ js.Any, /* row */ TRow, String]) = js.native
  /**
  	 * Name of the column.
  	 * Comes from TableHeader.dataField property.
  	 */
  var name: /* keyof TRow */ String = js.native
  /**
  	 * Flag to indicate whether the data in this column should be included in a search.
  	 * Comes from TableHeader.searchable property.
  	 */
  var searchable: Boolean = js.native
  /**
  	 * Column sorting setting. If true, the column can be used to sort the data.
  	 * Comes from TableHeader.dataSort property.
  	 */
  var sort: Boolean = js.native
  /**
  	 * Extra data to be provided to the search function for this column.
  	 * Comes from TableHeader.sortFuncExtraData property.
  	 */
  var sortFuncExtraData: js.Any = js.native
  /**
  	 * CSS style properties to use for cells in this column.
  	 * Comes from TableHeader.tdStyle property.
  	 */
  var style: CSSProperties = js.native
  /**
  	 * Custom header value/component/children to use for this column.
  	 * Comes from TableHeader.headerText || TableHeader.children properties.
  	 */
  var text: String | Double | Boolean | ReactElement = js.native
  /**
  	 * Width setting for this column.
  	 * Comes from TableHeader.width property.
  	 */
  var width: String = js.native
  /**
  	 * Filter function for the column.
  	 * Comes from TableHeader.filterValue property.
  	 */
  def filterValue(cell: js.Any, row: TRow): js.Any = js.native
  /**
  	 * Column data format function.
  	 * Comes from TableHeader.dataFormat property.
  	 */
  def format(cell: js.Any, row: TRow, formatExtraData: js.Any, rowIndex: Double): String | ReactElement = js.native
  /**
  	 * Custom sort function to use for this column.
  	 * Comes from TableHeader.sortFunc property.
  	 */
  def sortFunc(a: TRow, b: TRow, order: SortOrder, sortField: /* keyof TRow */ String, extraData: js.Any): Double = js.native
}

object ColumnDescription {
  @scala.inline
  def apply[TRow](
    align: DataAlignType,
    attrs: CustomAttrs,
    className: String | (js.Function4[
      /* cell */ js.Any, 
      /* row */ TRow, 
      /* rowIndex */ Double, 
      /* columnIndex */ Double, 
      String
    ]),
    columnTitle: Boolean,
    customEditor: CustomEditor[TRow, _],
    editAttrs: CustomAttrs,
    editClassName: String | (js.Function2[/* cell */ js.Any, /* row */ TRow, String]),
    editable: Boolean | (Editable[TRow, _]) | (js.Function4[
      /* cell */ js.Any, 
      /* row */ TRow, 
      /* rowIndex */ Double, 
      /* columnIndex */ Double, 
      Boolean | String | EditValidatorObject
    ]),
    expandable: Boolean,
    export: Boolean,
    filterFormatted: Boolean,
    filterValue: (js.Any, TRow) => js.Any,
    format: (js.Any, TRow, js.Any, Double) => String | ReactElement,
    formatExtraData: js.Any,
    hidden: Boolean,
    hiddenOnInsert: Boolean,
    invalidEditColumnClassName: String | (js.Function2[/* cell */ js.Any, /* row */ TRow, String]),
    name: /* keyof TRow */ String,
    searchable: Boolean,
    sort: Boolean,
    sortFunc: (TRow, TRow, SortOrder, /* keyof TRow */ String, js.Any) => Double,
    sortFuncExtraData: js.Any,
    style: CSSProperties,
    text: String | Double | Boolean | ReactElement,
    width: String
  ): ColumnDescription[TRow] = {
    val __obj = js.Dynamic.literal(align = align.asInstanceOf[js.Any], attrs = attrs.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], columnTitle = columnTitle.asInstanceOf[js.Any], customEditor = customEditor.asInstanceOf[js.Any], editAttrs = editAttrs.asInstanceOf[js.Any], editClassName = editClassName.asInstanceOf[js.Any], editable = editable.asInstanceOf[js.Any], expandable = expandable.asInstanceOf[js.Any], export = export.asInstanceOf[js.Any], filterFormatted = filterFormatted.asInstanceOf[js.Any], filterValue = js.Any.fromFunction2(filterValue), format = js.Any.fromFunction4(format), formatExtraData = formatExtraData.asInstanceOf[js.Any], hidden = hidden.asInstanceOf[js.Any], hiddenOnInsert = hiddenOnInsert.asInstanceOf[js.Any], invalidEditColumnClassName = invalidEditColumnClassName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], searchable = searchable.asInstanceOf[js.Any], sort = sort.asInstanceOf[js.Any], sortFunc = js.Any.fromFunction5(sortFunc), sortFuncExtraData = sortFuncExtraData.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnDescription[TRow]]
  }
  @scala.inline
  implicit class ColumnDescriptionOps[Self[trow] <: ColumnDescription[trow], TRow] (val x: Self[TRow]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TRow] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TRow]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TRow] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TRow] with Other]
    @scala.inline
    def withAlign(value: DataAlignType): Self[TRow] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("align")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAttrs(value: CustomAttrs): Self[TRow] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attrs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClassNameFunction4(
      value: (/* cell */ js.Any, /* row */ TRow, /* rowIndex */ Double, /* columnIndex */ Double) => String
    ): Self[TRow] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withClassName(
      value: String | (js.Function4[
          /* cell */ js.Any, 
          /* row */ TRow, 
          /* rowIndex */ Double, 
          /* columnIndex */ Double, 
          String
        ])
    ): Self[TRow] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColumnTitle(value: Boolean): Self[TRow] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCustomEditor(value: CustomEditor[TRow, _]): Self[TRow] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customEditor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEditAttrs(value: CustomAttrs): Self[TRow] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editAttrs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEditClassNameFunction2(value: (/* cell */ js.Any, /* row */ TRow) => String): Self[TRow] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editClassName")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withEditClassName(value: String | (js.Function2[/* cell */ js.Any, /* row */ TRow, String])): Self[TRow] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEditableFunction4(
      value: (/* cell */ js.Any, /* row */ TRow, /* rowIndex */ Double, /* columnIndex */ Double) => Boolean | String | EditValidatorObject
    ): Self[TRow] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editable")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withEditable(
      value: Boolean | (Editable[TRow, _]) | (js.Function4[
          /* cell */ js.Any, 
          /* row */ TRow, 
          /* rowIndex */ Double, 
          /* columnIndex */ Double, 
          Boolean | String | EditValidatorObject
        ])
    ): Self[TRow] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpandable(value: Boolean): Self[TRow] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExport(value: Boolean): Self[TRow] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("export")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilterFormatted(value: Boolean): Self[TRow] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterFormatted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilterValue(value: (js.Any, TRow) => js.Any): Self[TRow] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterValue")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withFormat(value: (js.Any, TRow, js.Any, Double) => String | ReactElement): Self[TRow] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withFormatExtraData(value: js.Any): Self[TRow] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatExtraData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHidden(value: Boolean): Self[TRow] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHiddenOnInsert(value: Boolean): Self[TRow] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hiddenOnInsert")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInvalidEditColumnClassNameFunction2(value: (/* cell */ js.Any, /* row */ TRow) => String): Self[TRow] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invalidEditColumnClassName")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withInvalidEditColumnClassName(value: String | (js.Function2[/* cell */ js.Any, /* row */ TRow, String])): Self[TRow] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invalidEditColumnClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: /* keyof TRow */ String): Self[TRow] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSearchable(value: Boolean): Self[TRow] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSort(value: Boolean): Self[TRow] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSortFunc(value: (TRow, TRow, SortOrder, /* keyof TRow */ String, js.Any) => Double): Self[TRow] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortFunc")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withSortFuncExtraData(value: js.Any): Self[TRow] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortFuncExtraData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStyle(value: CSSProperties): Self[TRow] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTextReactElement(value: ReactElement): Self[TRow] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withText(value: String | Double | Boolean | ReactElement): Self[TRow] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidth(value: String): Self[TRow] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

