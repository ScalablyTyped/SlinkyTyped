package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgGridFilteringColumnSetting
  extends /**
	 * Option for JSONPDataSourceSettings
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Enables/disables filtering for the column.
  	 *
  	 */
  var allowFiltering: js.UndefOr[Boolean] = js.native
  /**
  	 * Identifies the grid column by index. Either key or index must be set in every column setting.
  	 *
  	 */
  var columnIndex: js.UndefOr[Double] = js.native
  /**
  	 * Identifies the grid column by key. Either key or index must be set in every column setting.
  	 *
  	 */
  var columnKey: js.UndefOr[String] = js.native
  /**
  	 * Initial filtering condition for the column.
  	 *
  	 *
  	 * Valid values:
  	 * "empty"
  	 * "notEmpty"
  	 * "null"
  	 * "notNull"
  	 * "equals"
  	 * "doesNotEqual"
  	 * "startsWith"
  	 * "contains"
  	 * "doesNotContain"
  	 * "endsWith"
  	 * "greaterThan"
  	 * "lessThan"
  	 * "greaterThanOrEqualTo"
  	 * "lessThanOrEqualTo"
  	 * "true"
  	 * "false"
  	 * "on"
  	 * "notOn"
  	 * "before"
  	 * "after"
  	 * "today"
  	 * "yesterday"
  	 * "thisMonth"
  	 * "lastMonth"
  	 * "nextMonth"
  	 * "thisYear"
  	 * "nextYear"
  	 * "lastYear"
  	 * "at"
  	 * "notAt"
  	 * "atBefore"
  	 * "atAfter"
  	 */
  var condition: js.UndefOr[String | Boolean] = js.native
  /**
  	 * An array of strings that determine which [conditions](ui.iggridfiltering#options:columnSettings.condition) to display for this column.
  	 *
  	 */
  var conditionList: js.UndefOr[js.Array[_]] = js.native
  /**
  	 * An object used to specify custom filtering conditions as objects for this column.
  	 *
  	 * labelText  The label as it will appear in the column's condition dropdown.
  	 * expressionText  The text to display in the editor when requireExpr is false.
  	 * requireExpr  If this condition requires the user to input a filtering expression.
  	 * filterImgIcon  Class applied to the dropdown item when in simple mode.
  	 * filterFunc  The custom comparing filter function. Signature: function (value, expression, dataType, ignoreCase, preciseDateFormat).
  	 */
  var customConditions: js.UndefOr[js.Any] = js.native
  /**
  	 * Initial filtering expressions - if set they will be applied on initialization together with the preset [condition](ui.iggridfiltering#options:columnSettings.condition).
  	 *
  	 */
  var defaultExpressions: js.UndefOr[IgGridFilteringColumnSettingDefaultExpressions] = js.native
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
}

object IgGridFilteringColumnSetting {
  @scala.inline
  def apply(): IgGridFilteringColumnSetting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgGridFilteringColumnSetting]
  }
  @scala.inline
  implicit class IgGridFilteringColumnSettingOps[Self <: IgGridFilteringColumnSetting] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withCondition(value: String | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("condition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCondition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("condition")(js.undefined)
        ret
    }
    @scala.inline
    def withConditionList(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conditionList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConditionList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conditionList")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomConditions(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customConditions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomConditions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customConditions")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultExpressions(value: IgGridFilteringColumnSettingDefaultExpressions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultExpressions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultExpressions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultExpressions")(js.undefined)
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
  }
  
}

