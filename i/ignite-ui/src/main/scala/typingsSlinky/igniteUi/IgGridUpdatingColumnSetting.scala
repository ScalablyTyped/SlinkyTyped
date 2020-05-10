package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgGridUpdatingColumnSetting
  extends /**
	 * Option for JSONPDataSourceSettings
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Identifies the grid column by key.
  	 *
  	 */
  var columnKey: js.UndefOr[String] = js.native
  /**
  	 * Specifies the default value for the column when adding new rows. When in edit mode for adding a row the value will be pre-filled in the column's editor (if the column is not read-only). The value should be of the type specified for the column in the grid's [columns](ui.iggrid#options:columns) collection.
  	 *
  	 */
  var defaultValue: js.UndefOr[js.Any] = js.native
  /**
  	 * Specifies options to initialize the corresponding editor with.
  	 *
  	 */
  var editorOptions: js.UndefOr[js.Any] = js.native
  /**
  	 * Specifies а custom editor provider instance. More information about editor providers can be found [here](http://www.igniteui.com/help/implementing-custom-editor-provider) and [here](http://www.igniteui.com/help/working-with-combo-editor-provider).
  	 * It should either extend $.ig.EditorProvider or have definitions for the following methods:
  	 * $.ig.EditorProvider = $.ig.EditorProvider|| $.ig.EditorProvider.extend({
  	 * createEditor: function (callbacks, key, editorOptions, tabIndex, format, element) {},
  	 * attachErrorEvents: function (errorShowing, errorShown, errorHidden) {},
  	 * getEditor: function () {},
  	 * refreshValue: function () {},
  	 * getValue: function () {},
  	 * setValue: function (val) {},
  	 * setSize: function (width, height) {},
  	 * setFocus: function () {},
  	 * removeFromParent: function () {},
  	 * destroy: function () {},
  	 * validator: function () {},
  	 * validate: function (noLabel) {},
  	 * isValid: function () {}
  	 * });
  	 *
  	 */
  var editorProvider: js.UndefOr[js.Any] = js.native
  /**
  	 * Specifies the type of editor to use for the column.
  	 *
  	 *
  	 * Valid values:
  	 * "text" An igTextEditor will be created
  	 * "mask" An igMaskEditor will be created
  	 * "date" An igDateEditor will be created
  	 * "datepicker" An igDatePicker will be created
  	 * "timepicker" An igTimePikcer will be created
  	 * "numeric" An igNumericEditor will be created
  	 * "checkbox" An igCheckboxEditor will be created
  	 * "currency" An igCurrencyEditor will be created
  	 * "percent" An igPercentEditor will be created
  	 * "combo" An igCombo editor is created. Both the JS and CSS files used by ui.igCombo should be available.
  	 * "rating" An igRating editor is created. Both the JS and CSS files used by ui.igRating should be available.
  	 */
  var editorType: js.UndefOr[String] = js.native
  /**
  	 * Specifies if the column is read-only. In 'cell' and 'row' [editMode](ui.iggridupdating#options:editMode) no editor will be created for read-only columns. In 'dialog' mode enabling [showReadonlyEditors](ui.iggridupdating#options:rowEditDialogOptions.showReadonlyEditors) will display disabled editors for such columns.
  	 *
  	 */
  var readOnly: js.UndefOr[Boolean] = js.native
  /**
  	 * Specifies if the end-user will be allowed to leave the editor's value empty during edit mode or not.
  	 *
  	 */
  var required: js.UndefOr[Boolean] = js.native
  /**
  	 * Specifies if the column's value should be validated or not. The validation is done based on the rules of the corresponding editor.
  	 *
  	 */
  var validation: js.UndefOr[Boolean] = js.native
}

object IgGridUpdatingColumnSetting {
  @scala.inline
  def apply(): IgGridUpdatingColumnSetting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgGridUpdatingColumnSetting]
  }
  @scala.inline
  implicit class IgGridUpdatingColumnSettingOps[Self <: IgGridUpdatingColumnSetting] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumnKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnKey")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultValue(value: js.Any): Self = {
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
    def withEditorProvider(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editorProvider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEditorProvider: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editorProvider")(js.undefined)
        ret
    }
    @scala.inline
    def withEditorType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editorType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEditorType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editorType")(js.undefined)
        ret
    }
    @scala.inline
    def withReadOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReadOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withRequired(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("required")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequired: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("required")(js.undefined)
        ret
    }
    @scala.inline
    def withValidation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validation")(js.undefined)
        ret
    }
  }
  
}

