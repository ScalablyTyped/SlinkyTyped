package typingsSlinky.ejWebAll.ej.TreeGrid

import typingsSlinky.ejWebAll.ej.TextAlign
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Column extends js.Object {
  /** Enables/disables cell selection.
    * @Default {false}
    */
  var allowCellSelection: js.UndefOr[Boolean] = js.native
  /** Enables or disables the ability to edit a row or cell.
    * @Default {false}
    */
  var allowEditing: js.UndefOr[Boolean] = js.native
  /** Enables or disables the ability to filter the rows based on this column.
    * @Default {false}
    */
  var allowFiltering: js.UndefOr[Boolean] = js.native
  /** Enables the blanks option in ejDropDownList mapped in TreeGrid column
    * @Default {true}
    */
  var allowFilteringBlankContent: js.UndefOr[Boolean] = js.native
  /** Enables or disables the ability to freeze/unfreeze the columns
    * @Default {false}
    */
  var allowFreezing: js.UndefOr[Boolean] = js.native
  /** Enables or disables the ability to sort the rows based on this column/field.
    * @Default {false}
    */
  var allowSorting: js.UndefOr[Boolean] = js.native
  /** Specifies the template ID or the template string of the AngularJS script element to enable column template for a column.
    */
  var angularTemplate: js.UndefOr[String] = js.native
  /** Sets the clip mode for TreeGrid cell as ellipsis or clipped content(both header and content)
    * @Default {ej.TreeGrid.ClipMode.Clip}
    */
  var clipMode: js.UndefOr[ClipMode | String] = js.native
  /** Gets or sets an object to define a command column in TreeGrid.
    * @Default {[]}
    */
  var commands: js.UndefOr[js.Array[ColumnsCommand]] = js.native
  /** Gets or sets a value that indicates to display a column value as checkbox or string
    * @Default {false}
    */
  var displayAsCheckbox: js.UndefOr[Boolean] = js.native
  /** To bind the dropdown data for TreeGrid column mapped with ejDropDownList
    */
  var dropdownData: js.UndefOr[String] = js.native
  /** To customize the ej controls defined in TreeGrid column with their native property.
    */
  var editParams: js.UndefOr[js.Any] = js.native
  /** Gets or sets a template that displays a custom editor for editing the column values.
    * @Default {null}
    */
  var editTemplate: js.UndefOr[js.Any] = js.native
  /** Specifies the edit type of the column.
    * @Default {ej.TreeGrid.EditingType.String}
    */
  var editType: js.UndefOr[EditingType | String] = js.native
  /** Specifies the name of the field from the dataSource to bind with this column.
    */
  var field: js.UndefOr[String] = js.native
  /** Specifies the type of the editor control to be used to filter the rows.
    * @Default {ej.TreeGrid.EditingType.String}
    */
  var filterEditType: js.UndefOr[EditingType | String] = js.native
  /** Gets or sets a value to render either excel or menu filtering in TreeGrid column filtering.
    * @Default {null}
    */
  var filterType: js.UndefOr[FilterType | String] = js.native
  /** Specifies the display format of a column
    * @Default {null}
    */
  var format: js.UndefOr[js.Any] = js.native
  /** Specifies the header template value for the column header
    */
  var headerTemplateID: js.UndefOr[String] = js.native
  /** Header text of the column.
    * @Default {null}
    */
  var headerText: js.UndefOr[String] = js.native
  /** Specifies the alignment of the column header text
    * @Default {ej.TextAlign.Left}
    */
  var headerTextAlign: js.UndefOr[TextAlign | String] = js.native
  /** Sets the tooltip template for the column header
    * @Default {null}
    */
  var headerTooltip: js.UndefOr[String] = js.native
  /** Specifies whether the column is frozen
    * @Default {false}
    */
  var isFrozen: js.UndefOr[Boolean] = js.native
  /** Specifies whether the column is a template column
    * @Default {false}
    */
  var isTemplateColumn: js.UndefOr[Boolean] = js.native
  /** Gets or sets the priority value of the column. It is used to show/hide TreeGrid columns in responsive mode.
    * @Default {-1}
    */
  var priority: js.UndefOr[Double] = js.native
  /** Enables or disables the checkbox visibility in a column for checkbox selection.
    * @Default {false}
    */
  var showCheckbox: js.UndefOr[Boolean] = js.native
  /** We can include or exclude particular column from column visibility list in column menu.
    * @Default {true}
    */
  var showInColumnChooser: js.UndefOr[Boolean] = js.native
  /** Specifies the template string of the script element to enable column template for a column.
    */
  var template: js.UndefOr[String] = js.native
  /** Specifies the template ID of the script element to enable column template for a column.
    */
  var templateID: js.UndefOr[String] = js.native
  /** Specifies the text alignment for the column
    * @Default {ej.TextAlign.Left}
    */
  var textAlign: js.UndefOr[TextAlign | String] = js.native
  /** Sets the tooltip template for the specific column.
    * @Default {null}
    */
  var tooltip: js.UndefOr[String] = js.native
  /** specifies the conditions for saving data to the database while adding or editing the fields.
    */
  var validationRules: js.UndefOr[js.Any] = js.native
  /** Controls the visibility of the column.
    * @Default {true}
    */
  var visible: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value for TreeGrid column width
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
    def withAllowCellSelection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowCellSelection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowCellSelection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowCellSelection")(js.undefined)
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
    def withAllowFilteringBlankContent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowFilteringBlankContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowFilteringBlankContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowFilteringBlankContent")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowFreezing(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowFreezing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowFreezing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowFreezing")(js.undefined)
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
    def withAngularTemplate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("angularTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAngularTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("angularTemplate")(js.undefined)
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
    def withDropdownData(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropdownData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDropdownData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropdownData")(js.undefined)
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
    def withFilterEditType(value: EditingType | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterEditType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterEditType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterEditType")(js.undefined)
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
    def withFormat(value: js.Any): Self = {
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
    def withIsTemplateColumn(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isTemplateColumn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsTemplateColumn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isTemplateColumn")(js.undefined)
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
    def withShowCheckbox(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showCheckbox")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowCheckbox: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showCheckbox")(js.undefined)
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
    def withTemplateID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templateID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemplateID: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templateID")(js.undefined)
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

