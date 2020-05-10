package typingsSlinky.materialUiLab.useAutocompleteUseAutocompleteMod

import typingsSlinky.materialUiLab.materialUiLabBooleans.`false`
import typingsSlinky.materialUiLab.materialUiLabBooleans.`true`
import typingsSlinky.materialUiLab.materialUiLabStrings.mouse
import typingsSlinky.materialUiLab.materialUiLabStrings.touch
import typingsSlinky.react.mod.ChangeEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UseAutocompleteCommonProps[T] extends js.Object {
  /**
    * If `true`, the portion of the selected suggestion that has not been typed by the user,
    * known as the completion string, appears inline after the input cursor in the textbox.
    * The inline completion string is visually highlighted and has a selected state.
    */
  var autoComplete: js.UndefOr[Boolean] = js.native
  /**
    * If `true`, the first option is automatically highlighted.
    */
  var autoHighlight: js.UndefOr[Boolean] = js.native
  /**
    * If `true`, the selected option becomes the value of the input
    * when the Autocomplete loses focus unless the user chooses
    * a different option or changes the character string in the input.
    */
  var autoSelect: js.UndefOr[Boolean] = js.native
  /**
    * Control if the input should be blurred when an option is selected:
    *
    * - `false` the input is not blurred.
    * - `true` the input is always blurred.
    * - `touch` the input is blurred after a touch event.
    * - `mouse` the input is blurred after a mouse event.
    */
  var blurOnSelect: js.UndefOr[touch | mouse | `true` | `false`] = js.native
  /**
    * If `true`, clear all values when the user presses escape and the popup is closed.
    */
  var clearOnEscape: js.UndefOr[Boolean] = js.native
  /**
    * The component name that is using this hook. Used for warnings.
    */
  var componentName: js.UndefOr[String] = js.native
  /**
    * If `true`, the popup will ignore the blur event if the input is filled.
    * You can inspect the popup markup with your browser tools.
    * Consider this option when you need to customize the component.
    */
  var debug: js.UndefOr[Boolean] = js.native
  /**
    * If `true`, the input can't be cleared.
    */
  var disableClearable: js.UndefOr[Boolean] = js.native
  /**
    * If `true`, the popup won't close when a value is selected.
    */
  var disableCloseOnSelect: js.UndefOr[Boolean] = js.native
  /**
    * If `true`, the list box in the popup will not wrap focus.
    */
  var disableListWrap: js.UndefOr[Boolean] = js.native
  /**
    * A filter function that determines the options that are eligible.
    *
    * @param {T[]} options The options to render.
    * @param {object} state The state of the component.
    * @returns {T[]}
    */
  var filterOptions: js.UndefOr[
    js.Function2[/* options */ js.Array[T], /* state */ FilterOptionsState[T], js.Array[T]]
  ] = js.native
  /**
    * If `true`, hide the selected options from the list box.
    */
  var filterSelectedOptions: js.UndefOr[Boolean] = js.native
  /**
    * If `true`, the Autocomplete is free solo, meaning that the user input is not bound to provided options.
    */
  var freeSolo: js.UndefOr[Boolean] = js.native
  /**
    * Used to determine the disabled state for a given option.
    */
  var getOptionDisabled: js.UndefOr[js.Function1[/* option */ T, Boolean]] = js.native
  /**
    * Used to determine the string value for a given option.
    * It's used to fill the input (and the list box options if `renderOption` is not provided).
    */
  var getOptionLabel: js.UndefOr[js.Function1[/* option */ T, String]] = js.native
  /**
    * Used to determine if an option is selected.
    * Uses strict equality by default.
    */
  var getOptionSelected: js.UndefOr[js.Function2[/* option */ T, /* value */ T, Boolean]] = js.native
  /**
    * If provided, the options will be grouped under the returned string.
    * The groupBy value is also used as the text for group headings when `renderGroup` is not provided.
    *
    * @param {T} options The option to group.
    * @returns {string}
    */
  var groupBy: js.UndefOr[js.Function1[/* option */ T, String]] = js.native
  /**
    * This prop is used to help implement the accessibility logic.
    * If you don't provide this prop. It falls back to a randomly generated id.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * If `true`, the highlight can move to the input.
    */
  var includeInputInList: js.UndefOr[Boolean] = js.native
  /**
    * The input value.
    */
  var inputValue: js.UndefOr[String] = js.native
  /**
    * Callback fired when the popup requests to be closed.
    * Use in controlled mode (see open).
    *
    * @param {object} event The event source of the callback.
    * @param {string} reason Can be: `"toggleInput"`, `"escape"`, `"select-option"`, `"blur"`.
    */
  var onClose: js.UndefOr[
    js.Function2[/* event */ ChangeEvent[js.Object], /* reason */ AutocompleteCloseReason, Unit]
  ] = js.native
  /**
    * Callback fired when the input value changes.
    *
    * @param {object} event The event source of the callback.
    * @param {string} value The new value of the text input.
    * @param {string} reason Can be: `"input"` (user input), `"reset"` (programmatic change), `"clear"`.
    */
  var onInputChange: js.UndefOr[
    js.Function3[
      /* event */ ChangeEvent[js.Object], 
      /* value */ String, 
      /* reason */ AutocompleteInputChangeReason, 
      Unit
    ]
  ] = js.native
  /**
    * Callback fired when the popup requests to be opened.
    * Use in controlled mode (see open).
    *
    * @param {object} event The event source of the callback.
    */
  var onOpen: js.UndefOr[js.Function1[/* event */ ChangeEvent[js.Object], Unit]] = js.native
  /**
    * Control the popup` open state.
    */
  var open: js.UndefOr[Boolean] = js.native
  /**
    * If `true`, the popup will open on input focus.
    */
  var openOnFocus: js.UndefOr[Boolean] = js.native
  /**
    * Array of options.
    */
  var options: js.Array[T] = js.native
  /**
    * If `true`, the input's text will be selected on focus.
    * It helps the user clear the selected value.
    */
  var selectOnFocus: js.UndefOr[Boolean] = js.native
}

object UseAutocompleteCommonProps {
  @scala.inline
  def apply[T](options: js.Array[T]): UseAutocompleteCommonProps[T] = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseAutocompleteCommonProps[T]]
  }
  @scala.inline
  implicit class UseAutocompleteCommonPropsOps[Self[t] <: UseAutocompleteCommonProps[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withOptions(value: js.Array[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAutoComplete(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoComplete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoComplete: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoComplete")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoHighlight(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoHighlight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoHighlight: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoHighlight")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoSelect(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoSelect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoSelect: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoSelect")(js.undefined)
        ret
    }
    @scala.inline
    def withBlurOnSelect(value: touch | mouse | `true` | `false`): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blurOnSelect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlurOnSelect: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blurOnSelect")(js.undefined)
        ret
    }
    @scala.inline
    def withClearOnEscape(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearOnEscape")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClearOnEscape: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearOnEscape")(js.undefined)
        ret
    }
    @scala.inline
    def withComponentName(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComponentName: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentName")(js.undefined)
        ret
    }
    @scala.inline
    def withDebug(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDebug: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableClearable(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableClearable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableClearable: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableClearable")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableCloseOnSelect(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableCloseOnSelect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableCloseOnSelect: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableCloseOnSelect")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableListWrap(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableListWrap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableListWrap: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableListWrap")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterOptions(value: (/* options */ js.Array[T], /* state */ FilterOptionsState[T]) => js.Array[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterOptions")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutFilterOptions: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterSelectedOptions(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterSelectedOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterSelectedOptions: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterSelectedOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withFreeSolo(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("freeSolo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFreeSolo: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("freeSolo")(js.undefined)
        ret
    }
    @scala.inline
    def withGetOptionDisabled(value: /* option */ T => Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOptionDisabled")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetOptionDisabled: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOptionDisabled")(js.undefined)
        ret
    }
    @scala.inline
    def withGetOptionLabel(value: /* option */ T => String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOptionLabel")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetOptionLabel: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOptionLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withGetOptionSelected(value: (/* option */ T, /* value */ T) => Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOptionSelected")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutGetOptionSelected: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOptionSelected")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupBy(value: /* option */ T => String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupBy")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGroupBy: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupBy")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeInputInList(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeInputInList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeInputInList: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeInputInList")(js.undefined)
        ret
    }
    @scala.inline
    def withInputValue(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputValue: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputValue")(js.undefined)
        ret
    }
    @scala.inline
    def withOnClose(value: (/* event */ ChangeEvent[js.Object], /* reason */ AutocompleteCloseReason) => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClose")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnClose: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClose")(js.undefined)
        ret
    }
    @scala.inline
    def withOnInputChange(
      value: (/* event */ ChangeEvent[js.Object], /* value */ String, /* reason */ AutocompleteInputChangeReason) => Unit
    ): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onInputChange")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnInputChange: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onInputChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnOpen(value: /* event */ ChangeEvent[js.Object] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOpen")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnOpen: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOpen")(js.undefined)
        ret
    }
    @scala.inline
    def withOpen(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("open")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpen: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("open")(js.undefined)
        ret
    }
    @scala.inline
    def withOpenOnFocus(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openOnFocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpenOnFocus: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openOnFocus")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectOnFocus(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectOnFocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectOnFocus: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectOnFocus")(js.undefined)
        ret
    }
  }
  
}

