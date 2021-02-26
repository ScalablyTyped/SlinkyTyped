package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    * Sets the ability to allow values only set into the list items. This validation is done only when the editor is blurred, or enter key is pressed
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
    * Gets/Sets if the editor should prevent form submit when enter key is pressed.
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
    * Gets/Sets if the editor should revert it's value to the previously valid value in case the value on blur, or enter key is not valid. If the option is set to false, editor calls clear functionality.
    *
    */
  var revertIfNotValid: js.UndefOr[Boolean] = js.native
  
  /**
    * Gets/Sets the action when the editor gets focused. The default value is selectAll.
    *
    *
    * Valid values:
    * "selectAll" Setting this option will select all the text into the editor when the edit mode gets entered.
    * "atStart" Setting this option will move the cursor at the beginning the text into the editor when the edit mode gets entered.
    * "atEnd" Setting this option will move the cursor at the end the text into the editor when the edit mode gets entered.
    * "browserDefault" Setting this option won't do any extra logic, but proceed with the browser default behavior.
    */
  var selectionOnFocus: js.UndefOr[String] = js.native
  
  /**
    * Gets/Sets the ability of the editor to automatically change the hovered item into the opened dropdown list to its opposite side.
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
  implicit class IgMaskEditorMutableBuilder[Self <: IgMaskEditor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowNullValue(value: Boolean): Self = StObject.set(x, "allowNullValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowNullValueUndefined: Self = StObject.set(x, "allowNullValue", js.undefined)
    
    @scala.inline
    def setButtonType(value: String): Self = StObject.set(x, "buttonType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonTypeUndefined: Self = StObject.set(x, "buttonType", js.undefined)
    
    @scala.inline
    def setDataMode(value: String): Self = StObject.set(x, "dataMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataModeUndefined: Self = StObject.set(x, "dataMode", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    @scala.inline
    def setDropDownAnimationDuration(value: Double): Self = StObject.set(x, "dropDownAnimationDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDropDownAnimationDurationUndefined: Self = StObject.set(x, "dropDownAnimationDuration", js.undefined)
    
    @scala.inline
    def setDropDownAttachedToBody(value: Boolean): Self = StObject.set(x, "dropDownAttachedToBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDropDownAttachedToBodyUndefined: Self = StObject.set(x, "dropDownAttachedToBody", js.undefined)
    
    @scala.inline
    def setDropDownItemSelected(value: (/* event */ Event, /* ui */ DropDownItemSelectedEventUIParam) => Unit): Self = StObject.set(x, "dropDownItemSelected", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDropDownItemSelectedUndefined: Self = StObject.set(x, "dropDownItemSelected", js.undefined)
    
    @scala.inline
    def setDropDownItemSelecting(value: (/* event */ Event, /* ui */ DropDownItemSelectingEventUIParam) => Unit): Self = StObject.set(x, "dropDownItemSelecting", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDropDownItemSelectingUndefined: Self = StObject.set(x, "dropDownItemSelecting", js.undefined)
    
    @scala.inline
    def setDropDownListClosed(value: (/* event */ Event, /* ui */ DropDownListClosedEventUIParam) => Unit): Self = StObject.set(x, "dropDownListClosed", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDropDownListClosedUndefined: Self = StObject.set(x, "dropDownListClosed", js.undefined)
    
    @scala.inline
    def setDropDownListClosing(value: (/* event */ Event, /* ui */ DropDownListClosingEventUIParam) => Unit): Self = StObject.set(x, "dropDownListClosing", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDropDownListClosingUndefined: Self = StObject.set(x, "dropDownListClosing", js.undefined)
    
    @scala.inline
    def setDropDownListOpened(value: (/* event */ Event, /* ui */ DropDownListOpenedEventUIParam) => Unit): Self = StObject.set(x, "dropDownListOpened", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDropDownListOpenedUndefined: Self = StObject.set(x, "dropDownListOpened", js.undefined)
    
    @scala.inline
    def setDropDownListOpening(value: (/* event */ Event, /* ui */ DropDownListOpeningEventUIParam) => Unit): Self = StObject.set(x, "dropDownListOpening", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDropDownListOpeningUndefined: Self = StObject.set(x, "dropDownListOpening", js.undefined)
    
    @scala.inline
    def setDropDownOnReadOnly(value: Boolean): Self = StObject.set(x, "dropDownOnReadOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDropDownOnReadOnlyUndefined: Self = StObject.set(x, "dropDownOnReadOnly", js.undefined)
    
    @scala.inline
    def setDropDownOrientation(value: String): Self = StObject.set(x, "dropDownOrientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDropDownOrientationUndefined: Self = StObject.set(x, "dropDownOrientation", js.undefined)
    
    @scala.inline
    def setEmptyChar(value: String): Self = StObject.set(x, "emptyChar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmptyCharUndefined: Self = StObject.set(x, "emptyChar", js.undefined)
    
    @scala.inline
    def setExcludeKeys(value: String): Self = StObject.set(x, "excludeKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludeKeysUndefined: Self = StObject.set(x, "excludeKeys", js.undefined)
    
    @scala.inline
    def setHeight(value: String | Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setIncludeKeys(value: String): Self = StObject.set(x, "includeKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeKeysUndefined: Self = StObject.set(x, "includeKeys", js.undefined)
    
    @scala.inline
    def setInputMask(value: String): Self = StObject.set(x, "inputMask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputMaskUndefined: Self = StObject.set(x, "inputMask", js.undefined)
    
    @scala.inline
    def setInputName(value: String): Self = StObject.set(x, "inputName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputNameUndefined: Self = StObject.set(x, "inputName", js.undefined)
    
    @scala.inline
    def setIsLimitedToListValues(value: Boolean): Self = StObject.set(x, "isLimitedToListValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsLimitedToListValuesUndefined: Self = StObject.set(x, "isLimitedToListValues", js.undefined)
    
    @scala.inline
    def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    @scala.inline
    def setListItemHoverDuration(value: Double): Self = StObject.set(x, "listItemHoverDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListItemHoverDurationUndefined: Self = StObject.set(x, "listItemHoverDuration", js.undefined)
    
    @scala.inline
    def setListItems(value: js.Array[_]): Self = StObject.set(x, "listItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListItemsUndefined: Self = StObject.set(x, "listItems", js.undefined)
    
    @scala.inline
    def setListItemsVarargs(value: js.Any*): Self = StObject.set(x, "listItems", js.Array(value :_*))
    
    @scala.inline
    def setListWidth(value: Double): Self = StObject.set(x, "listWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListWidthUndefined: Self = StObject.set(x, "listWidth", js.undefined)
    
    @scala.inline
    def setLocale(value: js.Any): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    @scala.inline
    def setMaxLength(value: js.Any): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
    
    @scala.inline
    def setNullValue(value: String | Double): Self = StObject.set(x, "nullValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNullValueUndefined: Self = StObject.set(x, "nullValue", js.undefined)
    
    @scala.inline
    def setPadChar(value: String): Self = StObject.set(x, "padChar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPadCharUndefined: Self = StObject.set(x, "padChar", js.undefined)
    
    @scala.inline
    def setPlaceHolder(value: String): Self = StObject.set(x, "placeHolder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaceHolderUndefined: Self = StObject.set(x, "placeHolder", js.undefined)
    
    @scala.inline
    def setPreventSubmitOnEnter(value: Boolean): Self = StObject.set(x, "preventSubmitOnEnter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreventSubmitOnEnterUndefined: Self = StObject.set(x, "preventSubmitOnEnter", js.undefined)
    
    @scala.inline
    def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
    
    @scala.inline
    def setRegional(value: String | js.Object): Self = StObject.set(x, "regional", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionalUndefined: Self = StObject.set(x, "regional", js.undefined)
    
    @scala.inline
    def setRevertIfNotValid(value: Boolean): Self = StObject.set(x, "revertIfNotValid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevertIfNotValidUndefined: Self = StObject.set(x, "revertIfNotValid", js.undefined)
    
    @scala.inline
    def setSelectionOnFocus(value: String): Self = StObject.set(x, "selectionOnFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectionOnFocusUndefined: Self = StObject.set(x, "selectionOnFocus", js.undefined)
    
    @scala.inline
    def setSpinWrapAround(value: Boolean): Self = StObject.set(x, "spinWrapAround", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpinWrapAroundUndefined: Self = StObject.set(x, "spinWrapAround", js.undefined)
    
    @scala.inline
    def setSuppressKeyboard(value: Boolean): Self = StObject.set(x, "suppressKeyboard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuppressKeyboardUndefined: Self = StObject.set(x, "suppressKeyboard", js.undefined)
    
    @scala.inline
    def setSuppressNotifications(value: Boolean): Self = StObject.set(x, "suppressNotifications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuppressNotificationsUndefined: Self = StObject.set(x, "suppressNotifications", js.undefined)
    
    @scala.inline
    def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
    
    @scala.inline
    def setTextAlign(value: String): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextAlignUndefined: Self = StObject.set(x, "textAlign", js.undefined)
    
    @scala.inline
    def setTextChanged(value: (/* event */ Event, /* ui */ TextChangedEventUIParam) => Unit): Self = StObject.set(x, "textChanged", js.Any.fromFunction2(value))
    
    @scala.inline
    def setTextChangedUndefined: Self = StObject.set(x, "textChanged", js.undefined)
    
    @scala.inline
    def setTextMode(value: js.Any): Self = StObject.set(x, "textMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextModeUndefined: Self = StObject.set(x, "textMode", js.undefined)
    
    @scala.inline
    def setToLower(value: Boolean): Self = StObject.set(x, "toLower", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToLowerUndefined: Self = StObject.set(x, "toLower", js.undefined)
    
    @scala.inline
    def setToUpper(value: Boolean): Self = StObject.set(x, "toUpper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToUpperUndefined: Self = StObject.set(x, "toUpper", js.undefined)
    
    @scala.inline
    def setUnfilledCharsPrompt(value: String): Self = StObject.set(x, "unfilledCharsPrompt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnfilledCharsPromptUndefined: Self = StObject.set(x, "unfilledCharsPrompt", js.undefined)
    
    @scala.inline
    def setValidatorOptions(value: js.Any): Self = StObject.set(x, "validatorOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidatorOptionsUndefined: Self = StObject.set(x, "validatorOptions", js.undefined)
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    @scala.inline
    def setVisibleItemsCount(value: Double): Self = StObject.set(x, "visibleItemsCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleItemsCountUndefined: Self = StObject.set(x, "visibleItemsCount", js.undefined)
    
    @scala.inline
    def setWidth(value: String | Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
