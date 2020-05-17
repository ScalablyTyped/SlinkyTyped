package typingsSlinky.jqgrid

import typingsSlinky.jqgrid.anon.ColModel
import typingsSlinky.jqgrid.jqgridStrings.actions
import typingsSlinky.jqgrid.jqgridStrings.center
import typingsSlinky.jqgrid.jqgridStrings.checkbox
import typingsSlinky.jqgrid.jqgridStrings.currency
import typingsSlinky.jqgrid.jqgridStrings.date
import typingsSlinky.jqgrid.jqgridStrings.email
import typingsSlinky.jqgrid.jqgridStrings.integer
import typingsSlinky.jqgrid.jqgridStrings.left
import typingsSlinky.jqgrid.jqgridStrings.link
import typingsSlinky.jqgrid.jqgridStrings.number
import typingsSlinky.jqgrid.jqgridStrings.right
import typingsSlinky.jqgrid.jqgridStrings.select
import typingsSlinky.jqgrid.jqgridStrings.showlink
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// http://www.trirand.com/jqgridwiki/doku.php?id=wiki:colmodel_options
@js.native
trait JQueryJqGridColumn extends js.Object {
  /**
    * Defines the alignment of the cell in the Body layer, not in header cell. Possible values: left, center, right
    */
  var align: js.UndefOr[left | center | right] = js.native
  /**
    * This function add attributes to the cell during the creation of the data - i.e dynamically.
    * By example all valid attributes for the table cell can be used or a style attribute with different properties.
    * @param rowId the id of the row
    * @param val the value which will be added in the cell
    * @param rowObject  the raw object of the data row - i.e if datatype is json - array, if datatype is xml xml node.
    * @param cm all the properties of this column listed in the colModel
    * @param rdata the data row which will be inserted in the row. This parameter is array of type name:value, where name is the name in colModel
    * @returns {} 
    */
  var cellattr: js.UndefOr[
    js.Function5[
      /* rowId */ js.Any, 
      /* val */ js.Any, 
      /* rowObject */ js.Any, 
      /* cm */ js.Any, 
      /* rdata */ js.Any, 
      String
    ]
  ] = js.native
  /**
    * This option allow to add classes to the column. If more than one class will be used a space should be set.
    * By example classes:'class1 class2' will set a class1 and class2 to every cell on that column.
    * In the grid css there is a predefined class ui-ellipsis which allow to attach ellipsis to a particular row.
    * Also this will work in FireFox too.
    */
  var classes: js.UndefOr[String] = js.native
  /**
    * Governs format of sorttype:date (when datetype is set to local) and editrules {date:true} fields.
    * Determines the expected date format for that column. Uses a PHP-like date formatting. Currently "/", "-", and "." are supported as date separators. Valid formats are:
    *  y,Y,yyyy for four digits year
    *  YY, yy for two digits year
    *  m,mm for months
    *  d,dd for days.
    */
  var datefmt: js.UndefOr[String] = js.native
  /**
    * Defines if the field is editable. This option is used in cell, inline and form modules.
    */
  var editable: js.UndefOr[Boolean] = js.native
  /**
    * The predefined types (string) or custom function name that controls the format of this field
    * @param cellvalue is the value to be formatted
    * @param options is an object containing the following element: rowId - is the id of the row colModel is the object of the properties for this column getted from colModel array of jqGrid
    * @param rowObject  is a row data represented in the format determined from datatype option. If we have datatype: xml/xmlstring - the rowObject is xml node,provided according to the rules from xmlReader If we have datatype: json/jsonstring - the rowObject is array, provided according to the rules from jsonReader
    * @returns {} the formatted value
    */
  var formatter: js.UndefOr[
    integer | number | currency | date | email | link | showlink | checkbox | select | actions | (js.Function3[/* cellvalue */ js.Any, /* options */ ColModel, /* rowObject */ js.Any, _])
  ] = js.native
  /**
    * Defines if this column is hidden at initialization.
    */
  var hidden: js.UndefOr[Boolean] = js.native
  /**
    * Set the index name when sorting. Passed as sidx parameter.
    */
  var index: js.UndefOr[String] = js.native
  /**
    * Overwrite the id (defined in readers) from server. Can be set as id for the unique row id. Only one column can have this property.
    * This option have higher priority as those from the readers.
    * If there are more than one key set the grid finds the first one and the second is ignored.
    */
  var key: js.UndefOr[Boolean] = js.native
  /**
    * When colNames array is empty, defines the heading for this column.
    * If both the colNames array and this setting are empty, the heading for this column comes from the name property.
    */
  var label: js.UndefOr[String] = js.native
  /**
    * Set the unique name in the grid for the column.
    * This property is required.
    * As well as other words used as property/event names, the reserved words (which cannot be used for names) include subgrid, cb and rn.
    */
  var name: String = js.native
  /**
    * When used in search modules, disables or enables searching on that column
    */
  var search: js.UndefOr[Boolean] = js.native
  /**
    * Defines is this can be sorted
    */
  var sortable: js.UndefOr[Boolean] = js.native
  /**
    * Set the initial width of the column, in pixels. This value currently can not be set as percentage
    */
  var width: js.UndefOr[Double] = js.native
}

object JQueryJqGridColumn {
  @scala.inline
  def apply(name: String): JQueryJqGridColumn = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQueryJqGridColumn]
  }
  @scala.inline
  implicit class JQueryJqGridColumnOps[Self <: JQueryJqGridColumn] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAlign(value: left | center | right): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("align")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("align")(js.undefined)
        ret
    }
    @scala.inline
    def withCellattr(
      value: (/* rowId */ js.Any, /* val */ js.Any, /* rowObject */ js.Any, /* cm */ js.Any, /* rdata */ js.Any) => String
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellattr")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withoutCellattr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellattr")(js.undefined)
        ret
    }
    @scala.inline
    def withClasses(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClasses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classes")(js.undefined)
        ret
    }
    @scala.inline
    def withDatefmt(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datefmt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDatefmt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datefmt")(js.undefined)
        ret
    }
    @scala.inline
    def withEditable(value: Boolean): Self = {
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
    def withFormatterFunction3(value: (/* cellvalue */ js.Any, /* options */ ColModel, /* rowObject */ js.Any) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatter")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withFormatter(
      value: integer | number | currency | date | email | link | showlink | checkbox | select | actions | (js.Function3[/* cellvalue */ js.Any, /* options */ ColModel, /* rowObject */ js.Any, _])
    ): Self = {
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
    def withIndex(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(js.undefined)
        ret
    }
    @scala.inline
    def withKey(value: Boolean): Self = {
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
    def withLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(js.undefined)
        ret
    }
    @scala.inline
    def withSearch(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("search")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("search")(js.undefined)
        ret
    }
    @scala.inline
    def withSortable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortable")(js.undefined)
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

