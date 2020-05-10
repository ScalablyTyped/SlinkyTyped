package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgPercentEditor
  extends /**
	 * Option for JSONPDataSourceSettings
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Gets/Sets whether the editor value can become null.
  	 * If that option is disabled, and editor has no value, then value is set to 0 (or minValue/maxValue).
  	 *
  	 */
  var allowNullValue: js.UndefOr[Boolean] = js.native
  /**
  	 * Gets visibility of the spin, clear and drop-down button. That option can be set only on initialization. Combinations like 'dropdown,spin' or 'spin,clear' are supported too.Note! This option can not be set runtime.
  	 *
  	 *
  	 * Valid values:
  	 * "dropdown" A button to open/close the list is located on the right side of the editor.
  	 * "clear" A button to clear the value is located on the right side of the editor.
  	 * "spin" Spin buttons are located on the right side of the editor.
  	 */
  var buttonType: js.UndefOr[String] = js.native
  /**
  	 * Defines the range that editor's value can accept.This is achieved by setting the [minValue](ui.igPercentEditor#options:minValue) and [maxValue](ui.igPercentEditor#options:maxValue) editor's options, accordingly to the lowest and highest accepted values for the defined numeric mode.
  	 * The range for the specific type follows the numeric type standards, e.g. in .NET Framework  [floating-point](https://msdn.microsoft.com/en-us/library/9ahet949.aspx) types and [integral types](https://msdn.microsoft.com/en-us/library/exx3b86w.aspx).
  	 * In addition, the maximum value that can be set to [minDecimals](ui.igPercentEditor#options:minDecimals) and [maxDecimals](ui.igPercentEditor#options:maxDecimals) options can be 15, when editor is in 'double' mode and 7, when in 'float' mode.
  	 *
  	 *
  	 * Valid values:
  	 * "double" the Number object is used with the limits of a double and if the value is not set, then the null or Number.NaN is used depending on the option [allowNullValue](ui.igpercenteditor#options:allowNullValue). Note: that is used as default.
  	 * "float" the Number object is used with the limits of a float and if the value is not set, then the null or Number.NaN is used depending on the option [allowNullValue](ui.igpercenteditor#options:allowNullValue).
  	 * "long" the Number object is used with the limits of a signed long and if the value is not set, then the null or 0 is used depending on the option [allowNullValue](ui.igpercenteditor#options:allowNullValue).
  	 * "ulong" the Number object is used with the limits of an unsigned long and if the value is not set, then the null or 0 is used depending on the option [allowNullValue](ui.igpercenteditor#options:allowNullValue).
  	 * "int" the Number object is used with the limits of a signed int and if the value is not set, then the null or 0 is used depending on the option [allowNullValue](ui.igpercenteditor#options:allowNullValue).
  	 * "uint" the Number object is used with the limits of an unsigned int and if the value is not set, then the null or 0 is used depending on the option [allowNullValue](ui.igpercenteditor#options:allowNullValue).
  	 * "short" the Number object is used with the limits of a signed short and if the value is not set, then the null or 0 is used depending on the option [allowNullValue](ui.igpercenteditor#options:allowNullValue).
  	 * "ushort" the Number object is used with the limits of an unsigned short and if the value is not set, then the null or 0 is used depending on the option [allowNullValue](ui.igpercenteditor#options:allowNullValue).
  	 * "sbyte" the Number object is used with the limits of a signed byte and if the value is not set, then the null or 0 is used depending on the option [allowNullValue](ui.igpercenteditor#options:allowNullValue).
  	 * "byte" the Number object is used with the limits of an unsigned byte and if the value is not set, then the null or 0 is used depending on the option [allowNullValue](ui.igpercenteditor#options:allowNullValue).
  	 */
  var dataMode: js.UndefOr[String] = js.native
  /**
  	 * Gets/Sets the character, which is used as decimal separator.
  	 * Note: this option has priority over possible regional settings.
  	 * Note: Even if the default value is null - if internationalization file is provided and it contains default values for those properties the values are imlicitly set.
  	 * Note: This option's value should not be equal to the value of [groupSeparator](ui.igNumericEditor#options:groupSeparator) or [negativeSign](ui.igNumericEditor#options:negativeSign) options.
  	 *
  	 */
  var decimalSeparator: js.UndefOr[String] = js.native
  /**
  	 * Gets/Sets the disabled attribute for the input. If set to true the input is disabled, and all buttons and interactions are disabled. On submitting the form the editor belongs to, the value is not submitted.
  	 *
  	 */
  var disabled: js.UndefOr[Boolean] = js.native
  /**
  	 * Gets/Sets the factor which is used for the get and set of the "value" method.
  	 * On get the number (string) entered by the user is divided by that factor and on set the number (string) displayed in the editor is multiplied by that factor.
  	 * For example, if the factor is 100 and the "value" is set to 0.123, then the editor will show string "12.3".
  	 * Possible values: 1 or 100.
  	 * Note: this option has priority over possible regional settings.
  	 *
  	 */
  var displayFactor: js.UndefOr[Double] = js.native
  /**
  	 * Gets/Sets show/hide drop-down list animation duration in milliseconds.
  	 *
  	 */
  var dropDownAnimationDuration: js.UndefOr[Double] = js.native
  /**
  	 * Gets wheather the drop-down list element is attached to the body of the document, or to the editor container element.
  	 * If the option is set to false the editor will attach the drop-down list element to the editor container
  	 * If the option is set to true the editor will attach its drop-down list to as a child of the body.
  	 * Note! This option can not be set runtime.
  	 *
  	 */
  var dropDownAttachedToBody: js.UndefOr[Boolean] = js.native
  /**
  	 * Gets the ability to limit the editor to be used only as a dropdown list. When set to true the editor input is not editable.
  	 * Note! In case there are no list items - the editor will reamin readonly
  	 * Note! This option can not be set runtime.
  	 *
  	 */
  var dropDownOnReadOnly: js.UndefOr[Boolean] = js.native
  /**
  	 * Gets/Sets the drop-down list opening orientation when the list gets open. If the option is set to auto the editor has priority to open the drop-down list bottom. If the space is not enough it tries to open the list top. If the space is not enough in both directions then the list gets opened at the bottom of the editor.
  	 *
  	 *
  	 * Valid values:
  	 * "auto" If the option is set to auto the editor has priority to open the drop-down list bottom. If the space is not enough it tries to open the list top. If the space is not enough in both directions then the list gets opened at the bottom of the editor.
  	 * "bottom" The drop-down list is opened at the bottom of the editor.
  	 * "top" The drop-down list is opened at the top of the editor.
  	 */
  var dropDownOrientation: js.UndefOr[String] = js.native
  /**
  	 * Removed from numeric editor options
  	 */
  var excludeKeys: js.UndefOr[js.Any] = js.native
  /**
  	 * Gets/Sets the character, which is used as separator for groups (like thousands).
  	 * That option has effect only in display mode(no focus).
  	 * Note: This option has priority over possible regional settings.
  	 * Note: Even if the default value is null - if internationalization file is provided and it contains default values for those properties the values are imlicitly set.
  	 * Note: This option's value should not be equal to the value of [decimalSeparator](ui.igNumericEditor#options:decimalSeparator) or [negativeSign](ui.igNumericEditor#options:negativeSign) options.
  	 *
  	 */
  var groupSeparator: js.UndefOr[String] = js.native
  /**
  	 * (array of number objects) Gets/Sets the number of digits in the integer part of a number, which are divided into groups.
  	 * The "groupSeparator" is inserted between groups.
  	 * If the sum of all values in array is smaller than the length of integer part, then the last item in array is used for all following groups.
  	 * Count of groups starts from the decimal point (from right to left).
  	 * That option has effect only in display mode(no focus).
  	 * Note: The numbers in the array must be positive integers.
  	 * Note: This option has priority over possible regional settings.
  	 * Note: Even if the default value is null - if internationalization file is provided and it contains default values for those properties the values are imlicitly set.
  	 *
  	 */
  var groups: js.UndefOr[js.Array[_]] = js.native
  /**
  	 * Gets/Sets the height of the control.
  	 *
  	 *
  	 * Valid values:
  	 * "null" will fit the editor inside its parent container, if no other heights are defined.
  	 */
  var height: js.UndefOr[String | Double] = js.native
  /**
  	 * Removed from numeric editor options
  	 */
  var includeKeys: js.UndefOr[js.Any] = js.native
  /**
  	 * Gets/Sets the name attribute of the value input. This input is used to sent the value to the server. In case the target element is input and it has name attribute, but the developer has set the inputName option, so this option overwrites the value input and removes the attribute from the element.
  	 *
  	 */
  var inputName: js.UndefOr[String] = js.native
  /**
  	 * Gets/Sets if the editor should only allow values from the list of items. Enabling this also causes spin actions to cycle through list items instead.
  	 *
  	 */
  var isLimitedToListValues: js.UndefOr[Boolean] = js.native
  /**
  	 * Set/Get the locale language setting for the widget.
  	 *
  	 */
  var language: js.UndefOr[String] = js.native
  /**
  	 * Gets/Sets the hover/unhover animation duration of a drop-down list item.
  	 *
  	 */
  var listItemHoverDuration: js.UndefOr[Double] = js.native
  /**
  	 * Gets/Sets list of items which are used as a source for the drop-down list.
  	 * Items in the list can be of type number.
  	 *
  	 */
  var listItems: js.UndefOr[js.Array[_]] = js.native
  /**
  	 * Gets/Sets custom width of the drop-down list in pixels. If the value is equal to 0 or negative, then the width of editor is set as a drop-down width.
  	 *
  	 */
  var listWidth: js.UndefOr[Double] = js.native
  /**
  	 * Set/Get the locale setting for the widget.
  	 *
  	 */
  var locale: js.UndefOr[js.Any] = js.native
  /**
  	 * Gets/Sets the maximum number of decimal places supported by the editor.
  	 * Note: this option has priority over possible regional settings.
  	 * Note: In case of min decimals value higher than max decimals - max decimals are equaled to min decimals property.
  	 * Note: Even if the default value is null - if internationalization file is provided and it contains default values for those properties the values are imlicitly set.
  	 * Note: This option supports values between 0 and 15, when dataMode is 'double' (default) and values between 0 and 7 in 'float' mode.
  	 *
  	 */
  var maxDecimals: js.UndefOr[Double] = js.native
  /**
  	 * Removed from numeric editor options
  	 */
  var maxLength: js.UndefOr[js.Any] = js.native
  /**
  	 * Gets/Sets the maximum value which can be entered in the editor by the end user.
  	 *
  	 */
  var maxValue: js.UndefOr[Double] = js.native
  /**
  	 * Gets/Sets the minimum number of decimal places supported by the editor.
  	 * If number of digits in fractional part of number is less than the value of this option, then the "0" characters are used to fill missing digits.
  	 * Note: This option has priority over possible regional settings.
  	 * Note: In case of min decimals value higher than max decimals - max decimals are equaled to min decimals property.
  	 * Note: Even if the default value is null - if internationalization file is provided and it contains default values for those properties the values are imlicitly set.
  	 * Note: This option supports values between 0 and 15, when dataMode is 'double' (default) and values between 0 and 7 in 'float' mode.
  	 *
  	 */
  var minDecimals: js.UndefOr[Double] = js.native
  /**
  	 * Gets/Sets the minimum value which can be entered in the editor by the end user.
  	 *
  	 */
  var minValue: js.UndefOr[Double] = js.native
  /**
  	 * Gets/Sets the string, which is used as negative pattern. The "n" flag represents the value of number. The "-" and "()" flags are static part of pattern.
  	 * Note: This option has priority over possible regional settings.
  	 * Note: Even if the default value is null - if internationalization file is provided and it contains default values for those properties the values are imlicitly set.
  	 *
  	 */
  var negativePattern: js.UndefOr[String] = js.native
  /**
  	 * Gets/Sets the character, which is used as negative sign.
  	 * Note: This option has priority over possible regional settings.
  	 * Note: Even if the default value is null - if internationalization file is provided and it contains default values for those properties the values are imlicitly set.
  	 * Note: This option's value should not be equal to the value of [groupSeparator](ui.igNumericEditor#options:groupSeparator) or [decimalSeparator](ui.igNumericEditor#options:decimalSeparator) options.
  	 *
  	 */
  var negativeSign: js.UndefOr[String] = js.native
  /**
  	 * Gets/Sets the representation of null value. In case of default the value for the input is set to null, which makes the input to hold an empty string
  	 *
  	 */
  var nullValue: js.UndefOr[String | Double] = js.native
  /**
  	 * Gets/Sets the symbol, which is used in display (no focus) state.
  	 * Note: this option has priority over possible regional settings.
  	 *
  	 */
  var percentSymbol: js.UndefOr[String] = js.native
  /**
  	 * Gets/Sets the text which appears in the editor when it has no focus and the "value" is null or empty string.
  	 *
  	 */
  var placeHolder: js.UndefOr[String] = js.native
  /**
  	 * Gets/Sets the pattern for positive numeric values, which is used in display (no focus) state.
  	 * If you use the "en-US" culture the default value for "positivePattern" will be "n$" where the "$" flag represents the "numericSymbol" and the "n" flag represents the value of the number.
  	 * Note: this option has priority over possible regional settings.
  	 *
  	 */
  var positivePattern: js.UndefOr[String] = js.native
  /**
  	 * Gets/Sets if the editor should prevent form submition when enter key is pressed.
  	 *
  	 */
  var preventSubmitOnEnter: js.UndefOr[Boolean] = js.native
  /**
  	 * Gets/Sets the readonly attribute for the input. If set to true the input is readonly, and all buttons and interactions are disabled. On submitting the form the editor belongs to, the value is submitted.
  	 *
  	 */
  var readOnly: js.UndefOr[Boolean] = js.native
  /**
  	 * Set/Get the regional setting for the widget.
  	 *
  	 */
  var regional: js.UndefOr[String | js.Object] = js.native
  /**
  	 * Gets/Sets if the editor should revert it's value to the previously valid value in case the value on blur, or enter key is not valid. If the opiton is set to false, editor calls clear functionality.
  	 *
  	 */
  var revertIfNotValid: js.UndefOr[Boolean] = js.native
  /**
  	 * Gets/Sets whether the last decimal place will be rounded, when the maxDecimal option is defined and applied.
  	 * For example if the initial editor value is set to 123.4567, maxDecimals option is set to 3 and roundDecimals is enabled,
  	 * then editor will round the value and will display it as 123.457. If roundDecimals is disabled then editor value will be truncated to 123.456.
  	 *
  	 */
  var roundDecimals: js.UndefOr[Boolean] = js.native
  /**
  	 * Gets/Sets support for scientific format.
  	 * If that option is set, then numeric value appears as a string with possible E-power flag. In edit mode the "E" or "e" character can be entered as well.
  	 * Notes: The "+" character is not supported in edit mode.
  	 *
  	 *
  	 * Valid values:
  	 * "null" scientific format is disabled.
  	 * "E" scientific format is enabled and the "E" character is used.
  	 * "e" scientific format is enabled and the "e" character is used.
  	 * "E+" scientific format is enabled and the "E" character is used. The "E+" is used for positive values in display mode.
  	 * "e+" scientific format is enabled and the "e" character is used. The "e+" is used for positive values in display mode.
  	 */
  var scientificFormat: js.UndefOr[String] = js.native
  /**
  	 * Gets/Sets the action when the editor gets focused. The default value is selectAll.
  	 *
  	 *
  	 * Valid values:
  	 * "selectAll" Setting this option will select all the text into the editor when the edit mode gets enetered.
  	 * "atStart" Setting this option will move the cursor at the begining the text into the editor when the edit mode gets enetered.
  	 * "atEnd" Setting this option will move the cursor at the end the text into the editor when the edit mode gets enetered.
  	 * "browserDefault" Setting this option won't do any extra logic, but proceed with the browser default behavior.
  	 */
  var selectionOnFocus: js.UndefOr[String] = js.native
  /**
  	 * Gets/Sets the default delta-value which is used with "spin" [buttonType](ui.igpercenteditor#options:buttonType) or [spinUp](ui.igpercenteditor#methods:spinUp) and [spinDown](ui.igpercenteditor#methods:spinDown) methods to increment or decrement value in the editor. The value can not be negative. Non integer value is supported only for dataMode double and float.
  	 *
  	 */
  var spinDelta: js.UndefOr[Double] = js.native
  /**
  	 * Gets/Set the ability of the editor to automatically set value in the editor to the opposite side of the limit, when the spin action reaches minimum or maximum limit.
  	 * This applies to [minValue](ui.%%WidgetNameLowered%%#options:minValue) and [maxValue](ui.%%WidgetNameLowered%%#options:maxValue) or cycling through list items if [isLimitedToListValues](ui.%%WidgetNameLowered%%#options:isLimitedToListValues) is enabled.
  	 *
  	 */
  var spinWrapAround: js.UndefOr[Boolean] = js.native
  /**
  	 * Gets/Sets whether the onscreen keyboard (if available on device) should be shown when the dropdown button is clicked/tapped. This option prevents initial focus or removes it when the drop button is clicked/tapped.
  	 * Note: The option does not perform device detection so its behavior is always active if enabled.
  	 * Note: When drop down is opened the only way to close it will be using the drop down button.
  	 *
  	 */
  var suppressKeyboard: js.UndefOr[Boolean] = js.native
  /**
  	 * Disables/Enables default notifications for basic validation scenarios built in the editors such as required list selection, value wrapping around or spin limits.
  	 *
  	 */
  var suppressNotifications: js.UndefOr[Boolean] = js.native
  /**
  	 * Gets/Sets tabIndex attribute for the editor input.
  	 *
  	 */
  var tabIndex: js.UndefOr[Double] = js.native
  /**
  	 * Gets/Sets the horizontal alignment of the text in the editor.
  	 *
  	 *
  	 * Valid values:
  	 * "left" The text into the input gets aligned to the left.
  	 * "right" The text into the input gets aligned to the right.
  	 * "center" The text into the input gets aligned to the center.
  	 */
  var textAlign: js.UndefOr[String] = js.native
  var textMode: js.UndefOr[js.Any] = js.native
  /**
  	 * Removed from numeric editor options
  	 */
  var toLower: js.UndefOr[js.Any] = js.native
  /**
  	 * Removed from numeric editor options
  	 */
  var toUpper: js.UndefOr[js.Any] = js.native
  /**
  	 * Gets/Sets options supported by the [igValidator](ui.igvalidator#options) widget.
  	 * Note: Validation rules of [igValidator](ui.igvalidator#options), such as min and max value/length are applied separately triggering errors,
  	 * while the corresponding options of the editor prevent values violating the defined rules from being entered.
  	 *
  	 */
  var validatorOptions: js.UndefOr[js.Any] = js.native
  /**
  	 * Gets/Sets value in editor. The effect of setting/getting that option depends on type of editor and on dataMode options for every type of editor.
  	 *
  	 *
  	 */
  var value: js.UndefOr[js.Any] = js.native
  /**
  	 * Gets the number of the items to be shown at once when the drop-down list get opened.
  	 * Notes:
  	 * This option is overwritten if the number of list items is less than the set value. In that case the drop-down list displays all the items.
  	 * This option can not be set runtime.
  	 *
  	 */
  var visibleItemsCount: js.UndefOr[Double] = js.native
  /**
  	 * Gets/Sets the width of the control.
  	 *
  	 *
  	 * Valid values:
  	 * "null" will stretch to fit data, if no other widths are defined.
  	 */
  var width: js.UndefOr[String | Double] = js.native
}

object IgPercentEditor {
  @scala.inline
  def apply(): IgPercentEditor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgPercentEditor]
  }
  @scala.inline
  implicit class IgPercentEditorOps[Self <: IgPercentEditor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowNullValue(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowNullValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowNullValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowNullValue")(js.undefined)
        ret
    }
    @scala.inline
    def withButtonType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButtonType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonType")(js.undefined)
        ret
    }
    @scala.inline
    def withDataMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataMode")(js.undefined)
        ret
    }
    @scala.inline
    def withDecimalSeparator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decimalSeparator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDecimalSeparator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decimalSeparator")(js.undefined)
        ret
    }
    @scala.inline
    def withDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayFactor(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayFactor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayFactor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayFactor")(js.undefined)
        ret
    }
    @scala.inline
    def withDropDownAnimationDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropDownAnimationDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDropDownAnimationDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropDownAnimationDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withDropDownAttachedToBody(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropDownAttachedToBody")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDropDownAttachedToBody: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropDownAttachedToBody")(js.undefined)
        ret
    }
    @scala.inline
    def withDropDownOnReadOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropDownOnReadOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDropDownOnReadOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropDownOnReadOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withDropDownOrientation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropDownOrientation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDropDownOrientation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropDownOrientation")(js.undefined)
        ret
    }
    @scala.inline
    def withExcludeKeys(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludeKeys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExcludeKeys: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludeKeys")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupSeparator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupSeparator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupSeparator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupSeparator")(js.undefined)
        ret
    }
    @scala.inline
    def withGroups(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groups")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeKeys(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeKeys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeKeys: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeKeys")(js.undefined)
        ret
    }
    @scala.inline
    def withInputName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputName")(js.undefined)
        ret
    }
    @scala.inline
    def withIsLimitedToListValues(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLimitedToListValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsLimitedToListValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLimitedToListValues")(js.undefined)
        ret
    }
    @scala.inline
    def withLanguage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLanguage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(js.undefined)
        ret
    }
    @scala.inline
    def withListItemHoverDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listItemHoverDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutListItemHoverDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listItemHoverDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withListItems(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutListItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listItems")(js.undefined)
        ret
    }
    @scala.inline
    def withListWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutListWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withLocale(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxDecimals(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDecimals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxDecimals: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDecimals")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxLength(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxLength")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxValue")(js.undefined)
        ret
    }
    @scala.inline
    def withMinDecimals(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minDecimals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinDecimals: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minDecimals")(js.undefined)
        ret
    }
    @scala.inline
    def withMinValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minValue")(js.undefined)
        ret
    }
    @scala.inline
    def withNegativePattern(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("negativePattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNegativePattern: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("negativePattern")(js.undefined)
        ret
    }
    @scala.inline
    def withNegativeSign(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("negativeSign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNegativeSign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("negativeSign")(js.undefined)
        ret
    }
    @scala.inline
    def withNullValue(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nullValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNullValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nullValue")(js.undefined)
        ret
    }
    @scala.inline
    def withPercentSymbol(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("percentSymbol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPercentSymbol: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("percentSymbol")(js.undefined)
        ret
    }
    @scala.inline
    def withPlaceHolder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeHolder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlaceHolder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeHolder")(js.undefined)
        ret
    }
    @scala.inline
    def withPositivePattern(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positivePattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPositivePattern: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positivePattern")(js.undefined)
        ret
    }
    @scala.inline
    def withPreventSubmitOnEnter(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventSubmitOnEnter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreventSubmitOnEnter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventSubmitOnEnter")(js.undefined)
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
    def withRegional(value: String | js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regional")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegional: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regional")(js.undefined)
        ret
    }
    @scala.inline
    def withRevertIfNotValid(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revertIfNotValid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRevertIfNotValid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revertIfNotValid")(js.undefined)
        ret
    }
    @scala.inline
    def withRoundDecimals(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roundDecimals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoundDecimals: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roundDecimals")(js.undefined)
        ret
    }
    @scala.inline
    def withScientificFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scientificFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScientificFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scientificFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectionOnFocus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionOnFocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectionOnFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionOnFocus")(js.undefined)
        ret
    }
    @scala.inline
    def withSpinDelta(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spinDelta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpinDelta: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spinDelta")(js.undefined)
        ret
    }
    @scala.inline
    def withSpinWrapAround(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spinWrapAround")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpinWrapAround: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spinWrapAround")(js.undefined)
        ret
    }
    @scala.inline
    def withSuppressKeyboard(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressKeyboard")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuppressKeyboard: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressKeyboard")(js.undefined)
        ret
    }
    @scala.inline
    def withSuppressNotifications(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressNotifications")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuppressNotifications: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressNotifications")(js.undefined)
        ret
    }
    @scala.inline
    def withTabIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTabIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withTextAlign(value: String): Self = {
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
    def withTextMode(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textMode")(js.undefined)
        ret
    }
    @scala.inline
    def withToLower(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toLower")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToLower: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toLower")(js.undefined)
        ret
    }
    @scala.inline
    def withToUpper(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toUpper")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToUpper: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toUpper")(js.undefined)
        ret
    }
    @scala.inline
    def withValidatorOptions(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validatorOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidatorOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validatorOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
    @scala.inline
    def withVisibleItemsCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibleItemsCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisibleItemsCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibleItemsCount")(js.undefined)
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

