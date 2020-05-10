package typingsSlinky.ejWebAll.ej.Grid

import typingsSlinky.ejWebAll.ej.TextAlign
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Column extends js.Object {
  /** Gets or sets a value that indicates whether to enable editing behavior for particular column.
    * @Default {true}
    */
  var allowEditing: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value that indicates whether to enable dynamic filtering behavior for particular column.
    * @Default {true}
    */
  var allowFiltering: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value that indicates whether to enable dynamic grouping behavior for particular column.
    * @Default {true}
    */
  var allowGrouping: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value that indicates whether to enable dynamic resizable for particular column.
    * @Default {true}
    */
  var allowResizing: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value that indicates whether to enable dynamic sorting behavior for particular column.
    * @Default {true}
    */
  var allowSorting: js.UndefOr[Boolean] = js.native
  /** Sets the clip mode for Grid cell as ellipsis or clipped content(both header and content)
    * @Default {ej.Grid.ClipMode.Clip}
    */
  var clipMode: js.UndefOr[ClipMode | String] = js.native
  /** Gets or sets an object that indicates to define a command column in the grid.
    * @Default {[]}
    */
  var commands: js.UndefOr[js.Array[ColumnsCommand]] = js.native
  /** Gets or sets a value that indicates to provide custom CSS for an individual column.
    */
  var cssClass: js.UndefOr[String] = js.native
  /** Gets or sets a value that indicates the attribute values to the td element of a particular column
    */
  var customAttributes: js.UndefOr[js.Any] = js.native
  /** Gets or sets a value that indicates to bind the external datasource to the particular column when column editType as dropdownedit and also it is used to bind the datasource to the
    * foreign key column while editing the grid. //Where data is array of JSON objects of text and value for the drop-down and array of JSON objects for foreign key column.
    * @Default {null}
    */
  var dataSource: js.UndefOr[js.Any] = js.native
  /** Gets or sets a value that indicates to display the specified default value while adding a new record to the grid
    */
  var defaultValue: js.UndefOr[String | Double | Boolean | js.Date] = js.native
  /** Gets or sets a value that indicates to render the grid content and header with an HTML elements
    * @Default {false}
    */
  var disableHtmlEncode: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value that indicates to display a column value as checkbox or string
    * @Default {true}
    */
  var displayAsCheckbox: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value that indicates to customize ejNumericTextbox of an editable column. See editingType
    */
  var editParams: js.UndefOr[js.Any] = js.native
  /** Gets or sets a template that displays a custom editor used to edit column values. See editTemplate
    * @Default {null}
    */
  var editTemplate: js.UndefOr[js.Any] = js.native
  /** Gets or sets a value that indicates to render the element(based on edit type) for editing the grid record. See editingType
    * @Default {ej.Grid.EditingType.String}
    */
  var editType: js.UndefOr[EditingType | String] = js.native
  /** Gets or sets a value that indicates to groups the column based on its column format.
    * @Default {false}
    */
  var enableGroupByFormat: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value that indicates to display the columns in the grid mapping with column name of the dataSource.
    */
  var field: js.UndefOr[String] = js.native
  /** Gets or sets a template that customize the filter control from default . See filterBarTemplate
    * @Default {null}
    */
  var filterBarTemplate: js.UndefOr[js.Any] = js.native
  /** Gets or sets a value that indicates to render the excel or menu filter dialog to the grid columns. See filterType
    * @Default {null}
    */
  var filterType: js.UndefOr[FilterType | String] = js.native
  /** Gets or sets a value that indicates to define foreign key field name of the grid datasource.
    * @Default {null}
    */
  var foreignKeyField: js.UndefOr[String] = js.native
  /** Gets or sets a value that indicates to bind the field which is in foreign column datasource based on the foreignKeyField
    * @Default {null}
    */
  var foreignKeyValue: js.UndefOr[String] = js.native
  /** Gets or sets a value that indicates the format for the text applied on the column
    */
  var format: js.UndefOr[String] = js.native
  /** Gets or sets a value that indicates to add the template within the header element of the particular column.
    * @Default {null}
    */
  var headerTemplateID: js.UndefOr[String] = js.native
  /** Gets or sets a value that indicates to display the title of that particular column.
    */
  var headerText: js.UndefOr[String] = js.native
  /** This defines the text alignment of a particular column header cell value. See headerTextAlign
    * @Default {null}
    */
  var headerTextAlign: js.UndefOr[TextAlign | String] = js.native
  /** It accepts the string value and shows the tooltip for the Grid column header.
    * @Default {null}
    */
  var headerTooltip: js.UndefOr[String] = js.native
  /** You can use this property to freeze selected columns in grid at the time of scrolling.
    * @Default {false}
    */
  var isFrozen: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value that indicates the column has an identity in the database.
    * @Default {false}
    */
  var isIdentity: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value that indicates the column is act as a primary key(read-only) of the grid. The editing is performed based on the primary key column
    * @Default {false}
    */
  var isPrimaryKey: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value that indicates the order of Column that are to be hidden or visible when Grid element is in responsive mode and could not occupy all columns.
    * @Default {-1}
    */
  var priority: js.UndefOr[Double] = js.native
  /** Used to hide the particular column in column chooser by giving value as false.
    * @Default {true}
    */
  var showInColumnChooser: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value that indicates whether to enables column template for a particular column.
    * @Default {false}
    */
  var template: js.UndefOr[Boolean | String] = js.native
  /** Gets or sets a value that indicates to align the text within the column. See textAlign
    * @Default {ej.TextAlign.Left}
    */
  var textAlign: js.UndefOr[TextAlign | String] = js.native
  /** Sets the template for Tooltip in Grid Columns(both header and content)
    */
  var tooltip: js.UndefOr[String] = js.native
  /** Gets or sets a value that indicates to specify the data type of the specified columns.
    */
  var `type`: js.UndefOr[String] = js.native
  /** Gets or sets a value that indicates to define constraints for saving data to the database.
    */
  var validationRules: js.UndefOr[js.Any] = js.native
  /** Gets or sets a value that indicates whether this column is visible in the grid.
    * @Default {true}
    */
  var visible: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value that indicates to define the width for a particular column in the grid.
    */
  var width: js.UndefOr[Double] = js.native
}

object Column {
  @scala.inline
  def apply(): Column = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Column]
  }
  @scala.inline
  implicit class ColumnOps[Self <: Column] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withAllowGrouping(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowGrouping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowGrouping: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowGrouping")(js.undefined)
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
    def withClipMode(value: ClipMode | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clipMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClipMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clipMode")(js.undefined)
        ret
    }
    @scala.inline
    def withCommands(value: js.Array[ColumnsCommand]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commands")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCommands: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commands")(js.undefined)
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
    def withCustomAttributes(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customAttributes")(js.undefined)
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
    def withDefaultValueDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultValue(value: String | Double | Boolean | js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValue")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableHtmlEncode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableHtmlEncode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableHtmlEncode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableHtmlEncode")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayAsCheckbox(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayAsCheckbox")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayAsCheckbox: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayAsCheckbox")(js.undefined)
        ret
    }
    @scala.inline
    def withEditParams(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editParams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEditParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editParams")(js.undefined)
        ret
    }
    @scala.inline
    def withEditTemplate(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEditTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withEditType(value: EditingType | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEditType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editType")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableGroupByFormat(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableGroupByFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableGroupByFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableGroupByFormat")(js.undefined)
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
    def withFilterBarTemplate(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterBarTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterBarTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterBarTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterType(value: FilterType | String): Self = {
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
    def withForeignKeyField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("foreignKeyField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForeignKeyField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("foreignKeyField")(js.undefined)
        ret
    }
    @scala.inline
    def withForeignKeyValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("foreignKeyValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForeignKeyValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("foreignKeyValue")(js.undefined)
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
    def withHeaderTemplateID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerTemplateID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderTemplateID: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerTemplateID")(js.undefined)
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
    def withHeaderTextAlign(value: TextAlign | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerTextAlign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderTextAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerTextAlign")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderTooltip(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerTooltip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderTooltip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerTooltip")(js.undefined)
        ret
    }
    @scala.inline
    def withIsFrozen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFrozen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsFrozen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFrozen")(js.undefined)
        ret
    }
    @scala.inline
    def withIsIdentity(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isIdentity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsIdentity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isIdentity")(js.undefined)
        ret
    }
    @scala.inline
    def withIsPrimaryKey(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPrimaryKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsPrimaryKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPrimaryKey")(js.undefined)
        ret
    }
    @scala.inline
    def withPriority(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priority")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPriority: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priority")(js.undefined)
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
    def withTemplate(value: Boolean | String): Self = {
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
    def withTextAlign(value: TextAlign | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textAlign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textAlign")(js.undefined)
        ret
    }
    @scala.inline
    def withTooltip(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTooltip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltip")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
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
    def withValidationRules(value: js.Any): Self = {
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

