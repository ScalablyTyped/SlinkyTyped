package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgMaskEditor
  extends /**
	 * Option for JSONPDataSourceSettings
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Gets/Sets whether the editor value can become null.
  	 * If that option is false, and editor has no value, then value is set to an empty string.
  	 *
  	 */
  var allowNullValue: js.UndefOr[Boolean] = js.native
  /**
  	 * Gets visibility of the clear button. That option can be set only on initialization.
  	 *
  	 *
  	 * Valid values:
  	 * "clear" A button to clear the value is located on the right side of the editor.
  	 */
  var buttonType: js.UndefOr[String] = js.native
  /**
  	 * It affects the value of the control (value method/option and submitted in forms). It defines what the value should contain from text, unfilled prompts and literals. The default is allText and when used value method/option returns the text entered, all prompts (positions) and literals.
  	 *
  	 *
  	 * Valid values:
  	 * "rawText" only entered text. All unfilled prompts (positions) and literals are ignored (removed).
  	 * "rawTextWithRequiredPrompts" only entered text and required prompts (positions). All optional unfilled prompts and literals are ignored (removed)
  	 * "rawTextWithAllPrompts" only entered text and prompts (positions). All literals are ignored (removed).
  	 * "rawTextWithLiterals" only entered text and literals. All unfilled prompts are ignored (removed).
  	 * "rawTextWithRequiredPromptsAndLiterals" only entered text, required prompts (positions) and literals. All optional unfilled prompts are ignored (removed).
  	 * "allText" entered text, all prompts (positions) and literals. Note: that is used as default.
  	 */
  var dataMode: js.UndefOr[String] = js.native
  /**
  	 * Gets/Sets the disabled attribute for the input. If set to true the input is disabled, and all buttons and interactions are disabled. On submitting the form the editor belongs to, the value is not submitted.
  	 *
  	 */
  var disabled: js.UndefOr[Boolean] = js.native
  /**
  	 * This option is inherited from a parent widget and it's not applicable for igMaskEditor
  	 */
  var dropDownAnimationDuration: js.UndefOr[Double] = js.native
  /**
  	 * This option is inherited from a parent widget and it's not applicable for igMaskEditor
  	 */
  var dropDownAttachedToBody: js.UndefOr[Boolean] = js.native
  var dropDownItemSelected: js.UndefOr[DropDownItemSelectedEvent] = js.native
  var dropDownItemSelecting: js.UndefOr[DropDownItemSelectingEvent] = js.native
  var dropDownListClosed: js.UndefOr[DropDownListClosedEvent] = js.native
  var dropDownListClosing: js.UndefOr[DropDownListClosingEvent] = js.native
  var dropDownListOpened: js.UndefOr[DropDownListOpenedEvent] = js.native
  var dropDownListOpening: js.UndefOr[DropDownListOpeningEvent] = js.native
  /**
  	 * This option is inherited from a parent widget and it's not applicable for igMaskEditor
  	 */
  var dropDownOnReadOnly: js.UndefOr[Boolean] = js.native
  /**
  	 * This option is inherited from a parent widget and it's not applicable for igMaskEditor
  	 */
  var dropDownOrientation: js.UndefOr[String] = js.native
  /**
  	 * Gets/Sets character which is used as replacement of not-filled required position in mask when application calls get for the [value](ui.igmaskeditor#methods:value) methods.
  	 *
  	 */
  var emptyChar: js.UndefOr[String] = js.native
  /**
  	 * Gets ability to prevent entering specific characters from keyboard or on paste.
  	 * Notes:
  	 * If a character is specified in "includeKeys" option also, then "excludeKeys" has priority.
  	 * Note! This option can not be se runtime.
  	 *
  	 */
  var excludeKeys: js.UndefOr[String] = js.native
  /**
  	 * Gets/Sets the height of the control.
  	 *
  	 *
  	 * Valid values:
  	 * "null" will fit the editor inside its parent container, if no other heights are defined.
  	 */
  var height: js.UndefOr[String | Double] = js.native
  /**
  	 * Gets ability to enter only specific characters in input-field from keyboard and on paste.
  	 * Notes:
  	 * If "excludeKeys" option contains same characters as this option, then "excludeKeys" has priority.
  	 * Note! This option can not be se runtime.
  	 *
  	 */
  var includeKeys: js.UndefOr[String] = js.native
  /**
  	 * Gets input mask. Mask may include filter-flags and literal characters.
  	 * Literal characters are part of mask which cannot be modified by end user. In order to use a filter-flag as a literal character, the escape "\\" character should be used.
  	 * Default is "CCCCCCCCCC"
  	 * Note: optional flags/entries affect the value returned by get of the [value](ui.igmaskeditor#methods:value) methods.
  	 * List of filter-flags:
  	 * C: any keyboard character. Entry is optional.
  	 * &: any keyboard character. Entry is required.
  	 * a: letter or digit character. Entry is optional.
  	 * A: letter or digit character. Entry is required.
  	 * ?: letter character. Entry is optional.
  	 * L: letter character. Entry is required.
  	 * 9: digit character. Entry is optional.
  	 * 0: digit character. Entry is required.
  	 * #: digit character or "+" or "_". Entry is optional with replacement by [emptyChar](ui.igmaskeditor#options:emptyChar) or by [padChar](ui.igmaskeditor#options:padChar).
  	 * >: all letters to the right are converted to the upper case. In order to disable conversion, the ">" flag should be used again.
  	 * <: all letters to the right are converted to the lower case. In order to disable conversion, the "<" flag should be used again.
  	 * Note! This option can not be set runtime.
  	 *
  	 */
  var inputMask: js.UndefOr[String] = js.native
  /**
  	 * Gets/Sets the name attribute of the value input. This input is used to sent the value to the server. In case the target element is input and it has name attribute, but the developer has set the inputName option, so this option overwrites the value input and removes the attribute from the element.
  	 *
  	 */
  var inputName: js.UndefOr[String] = js.native
  /**
  	 * Sets the ability to allow values only set into the list items. This validation is done only when the editor is blured, or enter key is pressed
  	 */
  var isLimitedToListValues: js.UndefOr[Boolean] = js.native
  /**
  	 * Set/Get the locale language setting for the widget.
  	 *
  	 */
  var language: js.UndefOr[String] = js.native
  /**
  	 * Sets the hover/unhover animation duration.
  	 */
  var listItemHoverDuration: js.UndefOr[Double] = js.native
  /**
  	 * Sets gets list of items which are used for drop-down list.
  	 * Items in list can be strings, numbers or objects. The items are directly rendered without casting, or manipulating them.
  	 */
  var listItems: js.UndefOr[js.Array[_]] = js.native
  /**
  	 * Sets gets custom width of drop-down list in pixels. If value is equal to 0 or negative, then the width of editor is used.
  	 */
  var listWidth: js.UndefOr[Double] = js.native
  /**
  	 * Set/Get the locale setting for the widget.
  	 *
  	 */
  var locale: js.UndefOr[js.Any] = js.native
  /**
  	 * This option is inherited from a parent widget and it's not applicable for igMaskEditor
  	 */
  var maxLength: js.UndefOr[js.Any] = js.native
  /**
  	 * Gets/Sets the representation of null value. In case of default the value for the input is set to null, which makes the input to hold an empty string
  	 *
  	 */
  var nullValue: js.UndefOr[String | Double] = js.native
  /**
  	 * Gets/Sets character which is used as replacement of not-filled required position in mask when editor is in display mode (not focused).
  	 *
  	 */
  var padChar: js.UndefOr[String] = js.native
  /**
  	 * Gets/Sets the text which appears in the editor when it has no focus and the "value" is null or empty string.
  	 *
  	 */
  var placeHolder: js.UndefOr[String] = js.native
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
  	 * Gets/Sets the ability of the editor to automatically change the hoverd item into the opened dropdown list to its oposide side.
  	 */
  var spinWrapAround: js.UndefOr[Boolean] = js.native
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
  /**
  	 * Fired after the editor's text has been changed. It can be raised when keyUp event occurs,
  	 * when the clear button is clicked or when an item from a list is selected.
  	 */
  var textChanged: js.UndefOr[TextChangedEvent] = js.native
  var textMode: js.UndefOr[js.Any] = js.native
  /**
  	 * Gets/Sets the ability to convert the input characters to lower case (true) or keeps the characters as they are (false). The option has effect only while keyboard entries and paste.
  	 * Note! When the option is set at runtime the editor is not changing the current value.
  	 *
  	 */
  var toLower: js.UndefOr[Boolean] = js.native
  /**
  	 * Gets/Sets the ability to convert the input characters to upper case (true) or keeps the characters as they are (false). The option has effect only while keyboard entries and paste.
  	 * Note! When the option is set at runtime the editor is not changing the current value.
  	 *
  	 */
  var toUpper: js.UndefOr[Boolean] = js.native
  /**
  	 * Gets character which is used as prompt in edit mode for available entry position.
  	 *
  	 */
  var unfilledCharsPrompt: js.UndefOr[String] = js.native
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
  	 */
  var value: js.UndefOr[js.Any] = js.native
  /**
  	 * Gets/Sets how many items should be shown at once.
  	 * Notes:
  	 * That option is overwritten if the number of list items is less than the value. In that case the height of the dropdown is adjusted to the number of items.
  	 * Note! This option can not be set runtime.
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

object IgMaskEditor {
  @scala.inline
  def apply(): IgMaskEditor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgMaskEditor]
  }
  @scala.inline
  implicit class IgMaskEditorOps[Self <: IgMaskEditor] (val x: Self) extends AnyVal {
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
    def withDropDownItemSelected(value: (/* event */ Event, /* ui */ DropDownItemSelectedEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropDownItemSelected")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutDropDownItemSelected: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropDownItemSelected")(js.undefined)
        ret
    }
    @scala.inline
    def withDropDownItemSelecting(value: (/* event */ Event, /* ui */ DropDownItemSelectingEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropDownItemSelecting")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutDropDownItemSelecting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropDownItemSelecting")(js.undefined)
        ret
    }
    @scala.inline
    def withDropDownListClosed(value: (/* event */ Event, /* ui */ DropDownListClosedEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropDownListClosed")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutDropDownListClosed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropDownListClosed")(js.undefined)
        ret
    }
    @scala.inline
    def withDropDownListClosing(value: (/* event */ Event, /* ui */ DropDownListClosingEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropDownListClosing")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutDropDownListClosing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropDownListClosing")(js.undefined)
        ret
    }
    @scala.inline
    def withDropDownListOpened(value: (/* event */ Event, /* ui */ DropDownListOpenedEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropDownListOpened")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutDropDownListOpened: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropDownListOpened")(js.undefined)
        ret
    }
    @scala.inline
    def withDropDownListOpening(value: (/* event */ Event, /* ui */ DropDownListOpeningEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropDownListOpening")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutDropDownListOpening: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropDownListOpening")(js.undefined)
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
    def withEmptyChar(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emptyChar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmptyChar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emptyChar")(js.undefined)
        ret
    }
    @scala.inline
    def withExcludeKeys(value: String): Self = {
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
    def withIncludeKeys(value: String): Self = {
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
    def withInputMask(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputMask")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputMask: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputMask")(js.undefined)
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
    def withPadChar(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padChar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPadChar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padChar")(js.undefined)
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
    def withTextChanged(value: (/* event */ Event, /* ui */ TextChangedEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textChanged")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutTextChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textChanged")(js.undefined)
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
    def withToLower(value: Boolean): Self = {
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
    def withToUpper(value: Boolean): Self = {
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
    def withUnfilledCharsPrompt(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unfilledCharsPrompt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnfilledCharsPrompt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unfilledCharsPrompt")(js.undefined)
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

