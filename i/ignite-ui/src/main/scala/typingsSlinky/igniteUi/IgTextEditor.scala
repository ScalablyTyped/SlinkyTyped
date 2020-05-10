package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgTextEditor
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
  	 * Fired when the input field of the editor loses focus.
  	 */
  var blur: js.UndefOr[BlurEvent] = js.native
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
  	 * Gets/Sets the disabled attribute for the input. If set to true the input is disabled, and all buttons and interactions are disabled. On submitting the form the editor belongs to, the value is not submitted.
  	 *
  	 */
  var disabled: js.UndefOr[Boolean] = js.native
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
  	 * Fired after an item in the drop down list is selected.
  	 */
  var dropDownItemSelected: js.UndefOr[DropDownItemSelectedEvent] = js.native
  /**
  	 * Fired when an item in the drop down list is being selected.
  	 */
  var dropDownItemSelecting: js.UndefOr[DropDownItemSelectingEvent] = js.native
  /**
  	 * Fired after the drop down is closed.
  	 */
  var dropDownListClosed: js.UndefOr[DropDownListClosedEvent] = js.native
  /**
  	 * Fired when the drop down is closing.
  	 */
  var dropDownListClosing: js.UndefOr[DropDownListClosingEvent] = js.native
  /**
  	 * Fired after the drop down is opened.
  	 */
  var dropDownListOpened: js.UndefOr[DropDownListOpenedEvent] = js.native
  /**
  	 * Fired when the drop down is opening.
  	 */
  var dropDownListOpening: js.UndefOr[DropDownListOpeningEvent] = js.native
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
  	 * Gets/Sets the ability of the editor to prevent entering specific characters from the keyboard or on paste.
  	 * Notes:
  	 * If both "excludeKeys" and "includeKeys" options are used, then "excludeKeys" has priority and includeKeys options is not respected.
  	 * The option is case sensitive! If the option is set runtime it's not applied on the current value.
  	 *
  	 */
  var excludeKeys: js.UndefOr[String] = js.native
  /**
  	 * Fired when the input field of the editor gets focus.
  	 */
  var focus: js.UndefOr[IgFocusEvent] = js.native
  /**
  	 * Gets/Sets the height of the control.
  	 *
  	 *
  	 * Valid values:
  	 * "null" will fit the editor inside its parent container, if no other heights are defined.
  	 */
  var height: js.UndefOr[String | Double] = js.native
  /**
  	 * Gets/Sets the ability of the editor to allow entering only specific characters in the input-field from the keyboard and on paste.
  	 * Notes:
  	 * If both "excludeKeys" and "includeKeys" options are used, then "excludeKeys" has priority and includeKeys options is not respected.
  	 * The option is case sensitive! If the option is set runtime it's not applied on the current value.
  	 *
  	 */
  var includeKeys: js.UndefOr[String] = js.native
  /**
  	 * Gets/Sets the name attribute of the value input. This input is used to sent the value to the server. In case the target element is input and it has name attribute, but the developer has set the inputName option, so this option overwrites the value input and removes the attribute from the element.
  	 *
  	 */
  var inputName: js.UndefOr[String] = js.native
  /**
  	 * Gets/Sets if the editor should only allow values from the list of items. Matching is case-insensitive.
  	 *
  	 */
  var isLimitedToListValues: js.UndefOr[Boolean] = js.native
  /**
  	 * Fired on keydown event.
  	 * Return false in order to cancel key action.
  	 */
  var keydown: js.UndefOr[KeydownEvent] = js.native
  /**
  	 * Fired on keypress event.
  	 * Return false in order to cancel key action.
  	 */
  var keypress: js.UndefOr[KeypressEvent] = js.native
  /**
  	 * Fired on keyup event.
  	 */
  var keyup: js.UndefOr[KeyupEvent] = js.native
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
  	 * Items in the list can be of type string.
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
  	 * Gets/Sets the maximum length of a text which can be entered by the user.
  	 * Negative values or 0 disables that behavior. If set at runtime the editor doesn't apply the option to the cuurent value.
  	 *
  	 */
  var maxLength: js.UndefOr[Double] = js.native
  /**
  	 * Fired on mousedown event.
  	 */
  var mousedown: js.UndefOr[MousedownEvent] = js.native
  /**
  	 * Fired on mousemove at any part of editor including the drop-down list.
  	 */
  var mousemove: js.UndefOr[MousemoveEvent] = js.native
  /**
  	 * Fired on mouseleave at any part of editor including the drop-down list.
  	 */
  var mouseout: js.UndefOr[MouseoutEvent] = js.native
  /**
  	 * Fired on mouseover at any part of editor including the drop-down list.
  	 */
  var mouseover: js.UndefOr[MouseoverEvent] = js.native
  /**
  	 * Fired on mouseup event.
  	 */
  var mouseup: js.UndefOr[MouseupEvent] = js.native
  /**
  	 * Gets/Sets the representation of null value. In case of default the value for the input is set to null, which makes the input to hold an empty string
  	 *
  	 */
  var nullValue: js.UndefOr[String | Double] = js.native
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
  	 * Fired after rendering of the editor has finished.
  	 */
  var rendered: js.UndefOr[RenderedEvent] = js.native
  /**
  	 * Fired before rendering of the editor has finished.
  	 */
  var rendering: js.UndefOr[RenderingEvent] = js.native
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
  	 * Gets/Sets the ability of the editor to automatically move the dropdown list selection item from one end to the opposite side. When the last item is reached and spin down is performed, the first item gets selected and vice versa. This option has no effect there is no drop-down list.
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
  /**
  	 * Fired after the editor's text has been changed. It can be raised when keyUp event occurs,
  	 * when the clear button is clicked or when an item from a list is selected.
  	 */
  var textChanged: js.UndefOr[TextChangedEvent] = js.native
  /**
  	 * Gets the text mode of the editor such as: single-line text editor, password editor or multiline editor. That option has effect only on initialization. If based element (selector) is TEXTAREA, then it is used as input-field.
  	 *
  	 *
  	 * Valid values:
  	 * "text" Single line text editor based on INPUT element is created.
  	 * "password" Editor based on INPUT element with type password is created.
  	 * "multiline" Multiline editor based on TEXTAREA element is created.
  	 */
  var textMode: js.UndefOr[String] = js.native
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
  	 * Fired after the editor value is changed. It can be raised after loosing focus or on spin events.
  	 */
  var valueChanged: js.UndefOr[ValueChangedEvent] = js.native
  /**
  	 * Fired before changing the editor's value.
  	 * Return false in order to cancel change.
  	 * It can be raised after loosing focus or on spin events.
  	 */
  var valueChanging: js.UndefOr[ValueChangingEvent] = js.native
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

object IgTextEditor {
  @scala.inline
  def apply(): IgTextEditor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgTextEditor]
  }
  @scala.inline
  implicit class IgTextEditorOps[Self <: IgTextEditor] (val x: Self) extends AnyVal {
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
    def withBlur(value: (/* event */ Event_, /* ui */ BlurEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blur")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutBlur: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blur")(js.undefined)
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
    def withDropDownItemSelected(value: (/* event */ Event_, /* ui */ DropDownItemSelectedEventUIParam) => Unit): Self = {
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
    def withDropDownItemSelecting(value: (/* event */ Event_, /* ui */ DropDownItemSelectingEventUIParam) => Unit): Self = {
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
    def withDropDownListClosed(value: (/* event */ Event_, /* ui */ DropDownListClosedEventUIParam) => Unit): Self = {
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
    def withDropDownListClosing(value: (/* event */ Event_, /* ui */ DropDownListClosingEventUIParam) => Unit): Self = {
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
    def withDropDownListOpened(value: (/* event */ Event_, /* ui */ DropDownListOpenedEventUIParam) => Unit): Self = {
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
    def withDropDownListOpening(value: (/* event */ Event_, /* ui */ DropDownListOpeningEventUIParam) => Unit): Self = {
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
    def withFocus(value: (/* event */ Event_, /* ui */ IgFocusEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focus")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focus")(js.undefined)
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
    def withKeydown(value: (/* event */ Event_, /* ui */ KeydownEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keydown")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutKeydown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keydown")(js.undefined)
        ret
    }
    @scala.inline
    def withKeypress(value: (/* event */ Event_, /* ui */ KeypressEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keypress")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutKeypress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keypress")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyup(value: (/* event */ Event_, /* ui */ KeyupEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyup")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutKeyup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyup")(js.undefined)
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
    def withMaxLength(value: Double): Self = {
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
    def withMousedown(value: (/* event */ Event_, /* ui */ MousedownEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mousedown")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutMousedown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mousedown")(js.undefined)
        ret
    }
    @scala.inline
    def withMousemove(value: (/* event */ Event_, /* ui */ MousemoveEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mousemove")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutMousemove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mousemove")(js.undefined)
        ret
    }
    @scala.inline
    def withMouseout(value: (/* event */ Event_, /* ui */ MouseoutEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseout")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutMouseout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseout")(js.undefined)
        ret
    }
    @scala.inline
    def withMouseover(value: (/* event */ Event_, /* ui */ MouseoverEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseover")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutMouseover: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseover")(js.undefined)
        ret
    }
    @scala.inline
    def withMouseup(value: (/* event */ Event_, /* ui */ MouseupEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseup")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutMouseup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseup")(js.undefined)
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
    def withRendered(value: (/* event */ Event_, /* ui */ RenderedEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rendered")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutRendered: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rendered")(js.undefined)
        ret
    }
    @scala.inline
    def withRendering(value: (/* event */ Event_, /* ui */ RenderingEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rendering")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutRendering: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rendering")(js.undefined)
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
    def withTextChanged(value: (/* event */ Event_, /* ui */ TextChangedEventUIParam) => Unit): Self = {
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
    def withTextMode(value: String): Self = {
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
    def withValueChanged(value: (/* event */ Event_, /* ui */ ValueChangedEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueChanged")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutValueChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withValueChanging(value: (/* event */ Event_, /* ui */ ValueChangingEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueChanging")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutValueChanging: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueChanging")(js.undefined)
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

