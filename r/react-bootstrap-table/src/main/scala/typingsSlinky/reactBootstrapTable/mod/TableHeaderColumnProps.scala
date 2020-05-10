package typingsSlinky.reactBootstrapTable.mod

import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.Props
import typingsSlinky.reactBootstrapTable.AnonGetElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableHeaderColumnProps extends Props[TableHeaderColumn] {
  /**
  	 * It only work for enabling insertRow and be assign on rowKey column. If true, the value of rowkey will be
  	 * generated automatically after a row insertion. If a function given, you can customize the value by yourself and
  	 * remember to return the value for the cell from the function.
  	 */
  var autoValue: js.UndefOr[Boolean | js.Function0[_]] = js.native
  /**
  	 * Allow user to render a custom sort caret. You should give a function and should return a JSX.
  	 * This function takes two arguments: order and fieldName.
  	 *   `direction`: the current sort order.
  	 *   `fieldName`: the dataField name of the field currently being sorted.
  	 */
  var caretRender: js.UndefOr[
    js.Function2[/* direction */ SortOrder | Null, /* fieldName */ String, String | ReactElement]
  ] = js.native
  /**
  	 * Add custom css class on table header column, this attribute only accept String or Function.
  	 * If Function, it takes four arguments: cell, row, rowIndex, columnIndex.
  	 * In addition, this function should return a String which is the class name you want to add on.
  	 */
  var className: js.UndefOr[
    String | (js.Function4[
      /* cell */ js.Any, 
      /* row */ js.Any, 
      /* rowIndex */ Double, 
      /* columnIndex */ Double, 
      String
    ])
  ] = js.native
  /**
  	 * Indicates how many columns this column takes.
  	 * Default: 1
  	 */
  var colSpan: js.UndefOr[Double] = js.native
  /**
  	 * Add custom css class on table body column, this attribute only accept String or Function.
  	 * If Function, it taking four arguments: cell, row, rowIndex, columnIndex.
  	 * In addition, this function should return a String which is the class name you want to add on.
  	 */
  var columnClassName: js.UndefOr[
    String | (js.Function4[
      /* cell */ js.Any, 
      /* row */ js.Any, 
      /* rowIndex */ Double, 
      /* columnIndex */ Double, 
      String
    ])
  ] = js.native
  /**
  	 * Show the title on each column in the data section of the table.
  	 * @see https://github.com/AllenFang/react-bootstrap-table/blob/master/examples/js/column/column-title-table.js
  	 */
  var columnTitle: js.UndefOr[
    Boolean | String | (js.Function4[
      /* cell */ js.Any, 
      /* row */ js.Any, 
      /* rowIndex */ Double, 
      /* colIndex */ Double, 
      String
    ])
  ] = js.native
  /**
  	 * Specify the field type to use when exporting this column to CSV. Available types are 'number' and 'string'.
  	 * Defaults to 'string'.
  	 */
  var csvFieldType: js.UndefOr[CSVFieldType] = js.native
  /**
  	 * Customize the cell content when exporting to a CSV file. This function takes two argument: cell, row.
  	 */
  var csvFormat: js.UndefOr[js.Function2[/* cell */ js.Any, /* row */ js.Any, String]] = js.native
  /**
  	 * It's usually used with csvFormat, and it's same as formatExtraData.
  	 * You can give any additional data you want to be passed to the csvFormat function.
  	 */
  var csvFormatExtraData: js.UndefOr[js.Any] = js.native
  /**
  	 * Customize the column header text for the column when exporting to a CSV file.
  	 */
  var csvHeader: js.UndefOr[String] = js.native
  /**
  	 * Give an Object like following to able to customize your own editing component.
  	 * This Object should contain these two property:
  	 *   getElement(REQUIRED): Accept a callback function and take two arguments: onUpdate and props.
  	 *   customEditorParameters: Additional data for custom cell edit component.
  	 */
  var customEditor: js.UndefOr[CustomEditor[_, _]] = js.native
  /**
  	 * Custom insert editor element. This is a function to generate a custom edit element to display in the InsertModal
  	 * form. The function takes five arguments: column, attr, editorClass, ignoreEditable, defaultValue.
  	 *   `column`: column information given to the insert modal.
  	 *   `attr`: EditableAttrs from the TableHeader.editable object options.
  	 *   `editorClass`: className to apply to the editor component.
  	 *   `ignoreEditable`: boolean flag indicating whether editable fields should be ignored in the insert modal
  	 *   `defaultValue`: the default value to use for this cell.
  	 * The function should return either a JSX element for the field, or false to default back to the standard edit
  	 * element.
  	 */
  var customInsertEditor: js.UndefOr[AnonGetElement] = js.native
  /**
  	 * Set the text alignment in the column, possible values are 'left', 'center', 'right', 'start' and 'end'.
  	 */
  var dataAlign: js.UndefOr[DataAlignType] = js.native
  /**
  	 * The field of data you want to show on column. This is used throughout react-bootstrap-table as the column field
  	 * name.
  	 */
  var dataField: js.UndefOr[String] = js.native
  /**
  	 * To customize the column. This callback function should return a String or a React Component.
  	 * In addition, this function taking four argument: cell, row, formatExtraData, rowIdx.
  	 * The formatExtraData will be the value which you assign it on <TableHeaderColumn>
  	 */
  var dataFormat: js.UndefOr[
    js.Function4[
      /* cell */ js.Any, 
      /* row */ js.Any, 
      /* formatExtraData */ js.Any, 
      /* rowIndex */ Double, 
      String | ReactElement
    ]
  ] = js.native
  /**
  	 * True to enable table sorting on this column. Default is disabled.
  	 */
  var dataSort: js.UndefOr[Boolean] = js.native
  /**
  	 * Support specifying that the column should start sorting with the 'asc' option.
  	 */
  var defaultASC: js.UndefOr[Boolean] = js.native
  /**
  	 * Add custom css class on editing cell, if assign a callback function, you are supposed to return a String for class name
  	 */
  var editColumnClassName: js.UndefOr[String | (js.Function2[/* cell */ js.Any, /* row */ js.Any, String])] = js.native
  /**
  	 * Specify custom tdAttrs to use for a cell that is being edited within this column.
  	 */
  var editTdAttr: js.UndefOr[CustomAttrs] = js.native
  /**
  	 * boolean: Add True to set column editable, false is non-editable.
  	 * function: You have ability to control the editable level on cell instead of column level. For this
  	 * callback function, you are supposed to be return a bool value to decide this cell editable or not
  	 * This callback accepts four arguments: cell, row, rowIndex, columnIndex.
  	 * object: @see Editable interface.
  	 */
  var editable: js.UndefOr[
    Boolean | (Editable[_, _]) | (js.Function4[
      /* cell */ js.Any, 
      /* row */ js.Any, 
      /* rowIndex */ Double, 
      /* columnIndex */ Double, 
      Boolean | String | EditValidatorObject
    ])
  ] = js.native
  /**
  	 * Usually used with Options.expandBy.
  	 * You can assign which columns will trigger a row expansion or not.
  	 * If false, clicking on a row inside this column will not cause the row to expand.
  	 */
  var expandable: js.UndefOr[Boolean] = js.native
  /**
  	 * Used to specify whether a column will be exported to csv.
  	 *
  	 * If true, the column will be included in the export. This is usually used with hidden columns, as those are not
  	 * exported by default.
  	 *
  	 * If false, the column will be excluded from the csv export.
  	 */
  var export: js.UndefOr[Boolean] = js.native
  /**
  	 * To Enable a column filter within header column.
  	 * This feature support a lots of filter types and conditions.
  	 */
  var filter: js.UndefOr[Filter] = js.native
  /**
  	 * When true, the column will filter using the value returned by the column's formatter.
  	 * When false (default), the column will filter using the pre-formatted value.
  	 */
  var filterFormatted: js.UndefOr[Boolean] = js.native
  /**
  	 * Return the value you want to be filtered on that column.
  	 * It's useful if your column data is an object.
  	 * @example: (cell, row) => cell.fieldOne;
  	 * @see: https://github.com/AllenFang/react-bootstrap-table/blob/master/examples/js/manipulation/search-format-table.js
  	 */
  var filterValue: js.UndefOr[js.Function2[/* cell */ js.Any, /* row */ js.Any, _]] = js.native
  /**
  	 * It's useful with dataFormat, you can give any data you want to be passed to the formatter.
  	 */
  var formatExtraData: js.UndefOr[js.Any] = js.native
  /**
  	 * Alignment of text in the column header.
  	 * Tip: If you don't set the headerAlign, it will default to the setting for dataAlign.
  	 */
  var headerAlign: js.UndefOr[DataAlignType] = js.native
  /**
  	 * If the children of TableHeaderColumn is a JSX or Object, we prefer to add this prop to describe this column with
  	 * a pure text(String). It will be used on the placeholder or tips in the filter, search field or insert field etc.
  	 */
  var headerText: js.UndefOr[String] = js.native
  /**
  	 * Show the title on each column in the header section of the table, default is true.
  	 */
  var headerTitle: js.UndefOr[Boolean] = js.native
  /**
  	 * Set to true to hide the column. Default is false. Often used to hide rowKey columns that are required to
  	 * identify a row but that do not need to be visible.
  	 */
  var hidden: js.UndefOr[Boolean] = js.native
  /**
  	 * Set this to true to hide this column on insert modal. Default is false.
  	 *
  	 * This is often used together with autoValue for auto-generated columns like row keys.
  	 */
  var hiddenOnInsert: js.UndefOr[Boolean] = js.native
  /**
  	 * Add custom css class for invalid editing cell, if assign a callback function, you are supposed to return a String for class name
  	 */
  var invalidEditColumnClassName: js.UndefOr[String | (js.Function2[/* cell */ js.Any, /* row */ js.Any, String])] = js.native
  /**
  	 * Use isKey to tell table which column is unique. This is same as the keyField in <BootstrapTable>
  	 * Tips: You need choose one configuration to set key field: isKey or the keyField in <BootstrapTable>
  	 */
  var isKey: js.UndefOr[Boolean] = js.native
  /**
  	 * This is always used together with rowSpan and colSpan, to create multi-row/multi-column headers.
  	 * Row is the header row on which this header column present.
  	 */
  var row: js.UndefOr[Double] = js.native
  /**
  	 * Indicates how many rows this column takes.
  	 * Default: 1
  	 */
  var rowSpan: js.UndefOr[Double] = js.native
  /**
  	 * False to disable search functionality on column, default is true.
  	 */
  var searchable: js.UndefOr[Boolean] = js.native
  /**
  	 * Give a custom callback function for data sorting.
  	 * This function takes five arguments: a, b, order, sortField, extraData
  	 * The extraData value is the data from the sortFuncExtraData.
  	 */
  var sortFunc: js.UndefOr[
    js.Function5[
      /* a */ js.Object, 
      /* b */ js.Object, 
      /* order */ SortOrder, 
      /* keyof object */ /* sortField */ String, 
      /* extraData */ js.Any, 
      Double
    ]
  ] = js.native
  /**
  	 * Extra data for the custom sort function. If defined, this data will be passed as fifth argument in sortFunc.
  	 */
  var sortFuncExtraData: js.UndefOr[js.Any] = js.native
  /**
  	 * Set the column class name for the actively filtered column. Can be either a string, or a function that takes two
  	 * parameters: order and dataField.
  	 *   `order`: current sort order for the column.
  	 *   `dataField`: current column's dataField.
  	 * This allows you to specify a different className depending on whether the current dataField is being sorted 'asc'
  	 * or 'desc'.
  	 * @see https://github.com/AllenFang/react-bootstrap-table/blob/master/examples/js/sort/sort-style-table.js#L36-L37
  	 */
  var sortHeaderColumnClassName: js.UndefOr[String | (js.Function2[/* order */ SortOrder, /* dataField */ String, String])] = js.native
  /**
  	 * Allow you to add your custom attributes on TD element.
  	 * Example: tdAttr={ { 'data-attr': 'test' } }
  	 */
  var tdAttr: js.UndefOr[CustomAttrs] = js.native
  /**
  	 * Allow you to add your custom style object on TD element. Accepts either a CSS Properties object, or
  	 * a function that takes 4 arguments and returns a CSS Properties object. These arguments are:
  	 *   `cell`: The current cell value
  	 *   `row`: The current row data
  	 *   `rowIndex`: Index number for the current row data in the input data array.
  	 *   `columnIndex`: Index number for the current column that the cell is in.
  	 */
  var tdStyle: js.UndefOr[
    CSSProperties | (js.Function4[
      /* cell */ js.Any, 
      /* row */ js.Any, 
      /* rowIndex */ Double, 
      /* columnIndex */ Double, 
      CSSProperties
    ])
  ] = js.native
  /**
  	 * Allow you to add your custom style object on TH element.
  	 */
  var thStyle: js.UndefOr[CSSProperties] = js.native
  /**
  	 * Set the column width, including the units. e.g. '10%' or '150px'
  	 */
  var width: js.UndefOr[String] = js.native
}

object TableHeaderColumnProps {
  @scala.inline
  def apply(): TableHeaderColumnProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableHeaderColumnProps]
  }
  @scala.inline
  implicit class TableHeaderColumnPropsOps[Self <: TableHeaderColumnProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoValueFunction0(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoValue")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withAutoValue(value: Boolean | js.Function0[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoValue")(js.undefined)
        ret
    }
    @scala.inline
    def withCaretRender(value: (/* direction */ SortOrder | Null, /* fieldName */ String) => String | ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caretRender")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutCaretRender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caretRender")(js.undefined)
        ret
    }
    @scala.inline
    def withClassNameFunction4(
      value: (/* cell */ js.Any, /* row */ js.Any, /* rowIndex */ Double, /* columnIndex */ Double) => String
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withClassName(
      value: String | (js.Function4[
          /* cell */ js.Any, 
          /* row */ js.Any, 
          /* rowIndex */ Double, 
          /* columnIndex */ Double, 
          String
        ])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
    @scala.inline
    def withColSpan(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colSpan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColSpan: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colSpan")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnClassNameFunction4(
      value: (/* cell */ js.Any, /* row */ js.Any, /* rowIndex */ Double, /* columnIndex */ Double) => String
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnClassName")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withColumnClassName(
      value: String | (js.Function4[
          /* cell */ js.Any, 
          /* row */ js.Any, 
          /* rowIndex */ Double, 
          /* columnIndex */ Double, 
          String
        ])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnTitleFunction4(
      value: (/* cell */ js.Any, /* row */ js.Any, /* rowIndex */ Double, /* colIndex */ Double) => String
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnTitle")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withColumnTitle(
      value: Boolean | String | (js.Function4[
          /* cell */ js.Any, 
          /* row */ js.Any, 
          /* rowIndex */ Double, 
          /* colIndex */ Double, 
          String
        ])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnTitle")(js.undefined)
        ret
    }
    @scala.inline
    def withCsvFieldType(value: CSVFieldType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("csvFieldType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCsvFieldType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("csvFieldType")(js.undefined)
        ret
    }
    @scala.inline
    def withCsvFormat(value: (/* cell */ js.Any, /* row */ js.Any) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("csvFormat")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutCsvFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("csvFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withCsvFormatExtraData(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("csvFormatExtraData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCsvFormatExtraData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("csvFormatExtraData")(js.undefined)
        ret
    }
    @scala.inline
    def withCsvHeader(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("csvHeader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCsvHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("csvHeader")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomEditor(value: CustomEditor[_, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customEditor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomEditor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customEditor")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomInsertEditor(value: AnonGetElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customInsertEditor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomInsertEditor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customInsertEditor")(js.undefined)
        ret
    }
    @scala.inline
    def withDataAlign(value: DataAlignType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataAlign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataAlign")(js.undefined)
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
    def withDataFormat(
      value: (/* cell */ js.Any, /* row */ js.Any, /* formatExtraData */ js.Any, /* rowIndex */ Double) => String | ReactElement
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataFormat")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutDataFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withDataSort(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataSort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSort")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultASC(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultASC")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultASC: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultASC")(js.undefined)
        ret
    }
    @scala.inline
    def withEditColumnClassNameFunction2(value: (/* cell */ js.Any, /* row */ js.Any) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editColumnClassName")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withEditColumnClassName(value: String | (js.Function2[/* cell */ js.Any, /* row */ js.Any, String])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editColumnClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEditColumnClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editColumnClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withEditTdAttr(value: CustomAttrs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editTdAttr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEditTdAttr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editTdAttr")(js.undefined)
        ret
    }
    @scala.inline
    def withEditableFunction4(
      value: (/* cell */ js.Any, /* row */ js.Any, /* rowIndex */ Double, /* columnIndex */ Double) => Boolean | String | EditValidatorObject
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editable")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withEditable(
      value: Boolean | (Editable[_, _]) | (js.Function4[
          /* cell */ js.Any, 
          /* row */ js.Any, 
          /* rowIndex */ Double, 
          /* columnIndex */ Double, 
          Boolean | String | EditValidatorObject
        ])
    ): Self = {
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
    def withExpandable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpandable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandable")(js.undefined)
        ret
    }
    @scala.inline
    def withExport(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("export")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("export")(js.undefined)
        ret
    }
    @scala.inline
    def withFilter(value: Filter): Self = {
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
    def withFilterFormatted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterFormatted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterFormatted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterFormatted")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterValue(value: (/* cell */ js.Any, /* row */ js.Any) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterValue")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutFilterValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterValue")(js.undefined)
        ret
    }
    @scala.inline
    def withFormatExtraData(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatExtraData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormatExtraData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatExtraData")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderAlign(value: DataAlignType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerAlign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerAlign")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerText")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderTitle(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerTitle")(js.undefined)
        ret
    }
    @scala.inline
    def withHidden(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHidden: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hidden")(js.undefined)
        ret
    }
    @scala.inline
    def withHiddenOnInsert(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hiddenOnInsert")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHiddenOnInsert: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hiddenOnInsert")(js.undefined)
        ret
    }
    @scala.inline
    def withInvalidEditColumnClassNameFunction2(value: (/* cell */ js.Any, /* row */ js.Any) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invalidEditColumnClassName")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withInvalidEditColumnClassName(value: String | (js.Function2[/* cell */ js.Any, /* row */ js.Any, String])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invalidEditColumnClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInvalidEditColumnClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invalidEditColumnClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withIsKey(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isKey")(js.undefined)
        ret
    }
    @scala.inline
    def withRow(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("row")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("row")(js.undefined)
        ret
    }
    @scala.inline
    def withRowSpan(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowSpan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowSpan: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowSpan")(js.undefined)
        ret
    }
    @scala.inline
    def withSearchable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearchable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchable")(js.undefined)
        ret
    }
    @scala.inline
    def withSortFunc(
      value: (/* a */ js.Object, /* b */ js.Object, /* order */ SortOrder, /* keyof object */ /* sortField */ String, /* extraData */ js.Any) => Double
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortFunc")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withoutSortFunc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortFunc")(js.undefined)
        ret
    }
    @scala.inline
    def withSortFuncExtraData(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortFuncExtraData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortFuncExtraData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortFuncExtraData")(js.undefined)
        ret
    }
    @scala.inline
    def withSortHeaderColumnClassNameFunction2(value: (/* order */ SortOrder, /* dataField */ String) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortHeaderColumnClassName")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSortHeaderColumnClassName(value: String | (js.Function2[/* order */ SortOrder, /* dataField */ String, String])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortHeaderColumnClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortHeaderColumnClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortHeaderColumnClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withTdAttr(value: CustomAttrs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tdAttr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTdAttr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tdAttr")(js.undefined)
        ret
    }
    @scala.inline
    def withTdStyleFunction4(
      value: (/* cell */ js.Any, /* row */ js.Any, /* rowIndex */ Double, /* columnIndex */ Double) => CSSProperties
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tdStyle")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withTdStyle(
      value: CSSProperties | (js.Function4[
          /* cell */ js.Any, 
          /* row */ js.Any, 
          /* rowIndex */ Double, 
          /* columnIndex */ Double, 
          CSSProperties
        ])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tdStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTdStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tdStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withThStyle(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: String): Self = {
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

