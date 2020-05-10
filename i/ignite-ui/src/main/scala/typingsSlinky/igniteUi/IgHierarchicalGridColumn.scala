package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgHierarchicalGridColumn
  extends /**
	 * Option for JSONPDataSourceSettings
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Specifies the colSpan of the cell in a Multi-Row Layout configuration. colSpan 0 is not supported and will be changed to 1 by the grid. [Here you can find more about the Multi-Row Layout feature](http://www.igniteui.com/help/iggrid-multirowlayout)
  	 *
  	 */
  var colSpan: js.UndefOr[Double] = js.native
  /**
  	 * Space-separated list of CSS classes to be applied on the data cells of this column. The class is not applied if the column has a column [template](ui.ighierarchicalgrid#options:columns.template) defined, which contains full <td> definition in the template.
  	 *
  	 */
  var columnCssClass: js.UndefOr[String] = js.native
  /**
  	 * Specifies the column index of the cell in a Multi-Row Layout configuration. All columns must have this property set for the multi-row-layout mode to be enabled. [Here you can find more about the Multi-Row Layout feature](http://www.igniteui.com/help/iggrid-multirowlayout)
  	 *
  	 */
  var columnIndex: js.UndefOr[Double] = js.native
  /**
  	 * Data type of the column cell values: string, number, bool, date, object.
  	 *
  	 *
  	 * Valid values:
  	 * "string" The data inside the column is of type string
  	 * "number" The data inside the column is of type number
  	 * "boolean" The data inside the column is of type boolean
  	 * "date" The data inside the column is of type date
  	 * "object" The data inside the column is of type object
  	 */
  var dataType: js.UndefOr[String] = js.native
  /**
  	 * Determines the way in which dates will be displayed in the grid for this column.
  	 *
  	 *
  	 * Valid values:
  	 * "local" The dates for this column will be rendered in the client's local timezone.
  	 * "utc" The dates for this column will be rendered in their UTC representation.
  	 */
  var dateDisplayType: js.UndefOr[String] = js.native
  /**
  	 * Gets/Sets the type of formatting for cells of the column. Default value is null. Checkout [Formatting Dates, Numbers and Strings](http://www.igniteui.com/help/formatting-dates-numbers-and-strings) for details on the valid formatting specifiers.
  	 *
  	 * If dataType is "date", then supported formats are following: "date", "dateLong", "dateTime", "time", "timeLong", "MM/dd/yyyy", "MMM-d, yy, h:mm:ss tt", "dddd d MMM", etc.
  	 * If dataType is "number", then supported numeric formats are following: "number", "currency", "percent", "int", "double", "0.00", "#.0####", "0", "#.#######", etc.
  	 * The value of "double" will be similar to "number", but with unlimited maximum number of decimal places.
  	 * The format patterns and rules for numbers and dates are defined in $.ig.regional.defaults object.
  	 * If dataType is "string" or not set, then format is rendered as it is with replacement of possible "{0}" flag by value in cell. Example, if format is set to "Name: {0}" and value in cell is "Bob", then value will appear as "Name: Bob"
  	 * If value is set to "checkbox", then checkboxes are used regardless of renderCheckboxes option of the grid. That has effect only when dataType option of column is set to "bool".
  	 */
  var format: js.UndefOr[String] = js.native
  /**
  	 * Reference to a function (string or function) which will be used for formatting the cell values. The function should accept a value and return the new formatted value. [Here column formatting is explained in details](http://www.igniteui.com/help/iggrid-columns-and-layout#column-formatting)
  	 *
  	 *
  	 * Valid values:
  	 * "string" The name of the function which will be used for formatting the cell values.
  	 * "function" Function which will be used for formatting the cell values. The function should accept a value and return the new formatted value.
  	 */
  var formatter: js.UndefOr[String | js.Function] = js.native
  /**
  	 * A reference to or the name of a JavaScript function, which will calculate the value of the current cell based on other cell values in the same row. Used with [unbound columns](ui.ighierarchicalgrid#options:columns.unbound).
  	 *
  	 *
  	 * Valid values:
  	 * "string" The name of the JavaScript function.
  	 * "function" Reference to the JavaScript function.
  	 */
  var formula: js.UndefOr[String | js.Function] = js.native
  /**
  	 * Array of child column definitions. If the column has the property group than the grid has multi column headers.
  	 *
  	 */
  var group: js.UndefOr[js.Array[_]] = js.native
  /**
  	 * Options used to configure collapsible column [groups](ui.ighierarchicalgrid#options:columns.group).
  	 *
  	 */
  var groupOptions: js.UndefOr[IgHierarchicalGridColumnGroupOptions] = js.native
  /**
  	 * Space-separated list of CSS classes to be applied on the header cell of this column.
  	 *
  	 */
  var headerCssClass: js.UndefOr[String] = js.native
  /**
  	 * Header text for the specified column.
  	 *
  	 */
  var headerText: js.UndefOr[String] = js.native
  /**
  	 * Initial visibility of the column. A column can be hidden without the Hiding feature being enabled but there will be no UI for unhiding it. Columns can be defined as hidden in the options of the Hiding feature as well and those definitions take precedence.
  	 *
  	 */
  var hidden: js.UndefOr[Boolean] = js.native
  /**
  	 * The property in the data source to which the column is bound. Also used to identify the column by, and find specific columns with API methods such as [columnByKey](ui.ighierarchicalgrid#methods:columnByKey).
  	 *
  	 */
  var key: js.UndefOr[String] = js.native
  /**
  	 * This option is applicable only for columns with [dataType](ui.ighierarchicalgrid#options:columns.dataType) of object. Reference to a function, or the name of the function, that will be used for complex data extraction from the data records, whose return value will be used for all data operations associated with this column and will be displayed as cell value. [Here you can find more examples of how to setup a column mapper](http://www.igniteui.com/help/iggrid-columns-and-layout#defining-mapper)
  	 *
  	 *
  	 * Valid values:
  	 * "string" The name of the mapper function.
  	 * "function" Reference to the mapper function.
  	 */
  var mapper: js.UndefOr[String | js.Function] = js.native
  /**
  	 * Specifies the navigation index of the cell for the TAB sequence when the cells are in edit mode in a Multi-Row Layout grid. Has no effect otherwise. [Here you can find more about the Multi-Row Layout feature](http://www.igniteui.com/help/iggrid-multirowlayout)
  	 *
  	 */
  var navigationIndex: js.UndefOr[Double] = js.native
  /**
  	 * Specifies the row index of the cell in a Multi-Row Layout configuration. All columns must have this property set for the multi-row-layout mode to be enabled. [Here you can find more about the Multi-Row Layout feature](http://www.igniteui.com/help/iggrid-multirowlayout)
  	 *
  	 */
  var rowIndex: js.UndefOr[Double] = js.native
  /**
  	 * Specifies the rowSpan of the cell in a Multi-Row Layout configuration. rowSpan 0 is not supported and will be changed to 1 by the grid. [Here you can find more about the Multi-Row Layout feature](http://www.igniteui.com/help/iggrid-multirowlayout). If multi-row-layout is not used but multi-column-header is set then this option is used to adjust span of header cell.
  	 *
  	 */
  var rowSpan: js.UndefOr[Double] = js.native
  /**
  	 * This option has been deprecated as of the June 2016 service release.
  	 * Adjust span of multi column header cell. Use option rowSpan.
  	 */
  var rowspan: js.UndefOr[Double] = js.native
  /**
  	 * Sets a template for an individual column. the contents of the template should be the HTML markup that goes inside the table cell, or the entire table cell markup. [Here's an example of creating a basic column template](http://www.igniteui.com/help/creating-a-basic-column-template-in-the-iggrid)
  	 *
  	 */
  var template: js.UndefOr[String] = js.native
  /**
  	 * Sets whether column data is derived from the datasource. If set to true, then the cells in this column are not bound to the data source. The data in this column is populated using [formula](ui.ighierarchicalgrid#options:columns.formula), or using [unboundValues](ui.ighierarchicalgrid#options:columns.unboundValues), or through the [setUnboundValues](ui.ighierarchicalgrid#methods:setUnboundValues) API method. [Here's an overview of the unbound columns feature](http://www.igniteui.com/help/iggrid-unboundcolumns-overview)
  	 *
  	 */
  var unbound: js.UndefOr[Boolean] = js.native
  /**
  	 * Array of values which will be populated in the column cells at initialization, if the column is [unbound](ui.ighierarchicalgrid#options:columns.unbound).
  	 *
  	 */
  var unboundValues: js.UndefOr[js.Array[_]] = js.native
  /**
  	 * Width of the column in pixels or percentage. Can also be set as '*', in which case the width auto-size based on the content of the column cells (including the header text).If width is not defined and [defaultColumnWidth](ui.ighierarchicalgrid#options:defaultColumnWidth) is set, it is assumed for all columns.
  	 *
  	 *
  	 * Valid values:
  	 * "string" The column width can be set in pixels (px), percentage (%) or as '*' in order to auto-size based on the cells and header content.
  	 * "number" The column width can be set as a number
  	 */
  var width: js.UndefOr[String | Double] = js.native
}

object IgHierarchicalGridColumn {
  @scala.inline
  def apply(): IgHierarchicalGridColumn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgHierarchicalGridColumn]
  }
  @scala.inline
  implicit class IgHierarchicalGridColumnOps[Self <: IgHierarchicalGridColumn] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withColumnCssClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnCssClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnCssClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnCssClass")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withDataType(value: String): Self = {
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
    def withDateDisplayType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateDisplayType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDateDisplayType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateDisplayType")(js.undefined)
        ret
    }
    @scala.inline
    def withFormat(value: String): Self = {
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
    def withFormatter(value: String | js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormatter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatter")(js.undefined)
        ret
    }
    @scala.inline
    def withFormula(value: String | js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formula")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormula: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formula")(js.undefined)
        ret
    }
    @scala.inline
    def withGroup(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("group")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("group")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupOptions(value: IgHierarchicalGridColumnGroupOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderCssClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerCssClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderCssClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerCssClass")(js.undefined)
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
    def withKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(js.undefined)
        ret
    }
    @scala.inline
    def withMapper(value: String | js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapper")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMapper: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapper")(js.undefined)
        ret
    }
    @scala.inline
    def withNavigationIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigationIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNavigationIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigationIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withRowIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowIndex")(js.undefined)
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
    def withUnbound(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unbound")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnbound: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unbound")(js.undefined)
        ret
    }
    @scala.inline
    def withUnboundValues(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unboundValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnboundValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unboundValues")(js.undefined)
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

