package typingsSlinky.reactSelect.selectMod

import org.scalajs.dom.raw.HTMLElement
import slinky.core.SyntheticEvent
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.SyntheticFocusEvent
import slinky.web.SyntheticKeyboardEvent
import typingsSlinky.reactSelect.AnonCount
import typingsSlinky.reactSelect.AnonInputValue
import typingsSlinky.reactSelect.componentsMod.SelectComponentsConfig
import typingsSlinky.reactSelect.filtersMod.Option
import typingsSlinky.reactSelect.stylesMod.StylesConfig
import typingsSlinky.reactSelect.themeMod.ThemeConfig
import typingsSlinky.reactSelect.typesMod.ActionMeta
import typingsSlinky.reactSelect.typesMod.FocusEventHandler
import typingsSlinky.reactSelect.typesMod.GroupType
import typingsSlinky.reactSelect.typesMod.GroupedOptionsType
import typingsSlinky.reactSelect.typesMod.InputActionMeta
import typingsSlinky.reactSelect.typesMod.KeyboardEventHandler
import typingsSlinky.reactSelect.typesMod.MenuPlacement
import typingsSlinky.reactSelect.typesMod.MenuPosition
import typingsSlinky.reactSelect.typesMod.OptionTypeBase
import typingsSlinky.reactSelect.typesMod.OptionsType
import typingsSlinky.reactSelect.typesMod.Theme
import typingsSlinky.reactSelect.typesMod.ValueType
import typingsSlinky.std.EventListener
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ key in string ]: any} */ @js.native
trait Props[OptionType /* <: OptionTypeBase */] extends js.Object {
  /* Aria label (for assistive tech) */
  var `aria-label`: js.UndefOr[String] = js.native
  /* HTML ID of an element that should be used as the label (for assistive tech) */
  var `aria-labelledby`: js.UndefOr[String] = js.native
  /* Focus the control when it is mounted */
  var autoFocus: js.UndefOr[Boolean] = js.native
  /* Remove the currently focused option when the user presses backspace */
  var backspaceRemovesValue: js.UndefOr[Boolean] = js.native
  /* Remove focus from the input when the user selects an option (handy for dismissing the keyboard on touch devices) */
  var blurInputOnSelect: js.UndefOr[Boolean] = js.native
  /* When the user reaches the top/bottom of the menu, prevent scroll on the scroll-parent  */
  var captureMenuScroll: js.UndefOr[Boolean] = js.native
  /* className attribute applied to the outer component */
  var className: js.UndefOr[String] = js.native
  /* classNamePrefix attribute used as a base for inner component classNames */
  var classNamePrefix: js.UndefOr[String | Null] = js.native
  /*
    If `true`, close the select menu when the user scrolls the document/body.
    If a function, takes a standard javascript `ScrollEvent` you return a boolean:
    `true` => The menu closes
    `false` => The menu stays open
    This is useful when you have a scrollable modal and want to portal the menu out,
    but want to avoid graphical issues.
    */
  var closeMenuOnScroll: js.UndefOr[Boolean | EventListener] = js.native
  /* Close the select menu when the user selects an option */
  var closeMenuOnSelect: js.UndefOr[Boolean] = js.native
  /*
    This complex object includes all the compositional components that are used
    in `react-select`. If you wish to overwrite a component, pass in an object
    with the appropriate namespace.
    If you only wish to restyle a component, we recommend using the `styles` prop
    instead. For a list of the components that can be passed in, and the shape
    that will be passed to them, see [the components docs](/api#components)
    */
  var components: js.UndefOr[SelectComponentsConfig[OptionType]] = js.native
  /* Whether the value of the select, e.g. SingleValue, should be displayed in the control. */
  var controlShouldRenderValue: js.UndefOr[Boolean] = js.native
  var defaultInputValue: js.UndefOr[String] = js.native
  var defaultMenuIsOpen: js.UndefOr[Boolean] = js.native
  var defaultValue: js.UndefOr[ValueType[OptionType]] = js.native
  /* Delimiter used to join multiple values into a single HTML Input value */
  var delimiter: js.UndefOr[String] = js.native
  /* Clear all values when the user presses escape AND the menu is closed */
  var escapeClearsValue: js.UndefOr[Boolean] = js.native
  /* Custom method to filter whether an option should be displayed in the menu */
  var filterOption: js.UndefOr[(js.Function2[/* option */ Option, /* rawInput */ String, Boolean]) | Null] = js.native
  /* Formats group labels in the menu as React components */
  var formatGroupLabel: js.UndefOr[typingsSlinky.reactSelect.builtinsMod.formatGroupLabel[OptionType]] = js.native
  /* Formats option labels in the menu and control as React components */
  var formatOptionLabel: js.UndefOr[
    js.Function2[
      /* option */ OptionType, 
      /* labelMeta */ FormatOptionLabelMeta[OptionType], 
      TagMod[Any]
    ]
  ] = js.native
  /* Resolves option data to a string to be displayed as the label by components */
  var getOptionLabel: js.UndefOr[typingsSlinky.reactSelect.builtinsMod.getOptionLabel[OptionType]] = js.native
  /* Resolves option data to a string to compare options and specify value attributes */
  var getOptionValue: js.UndefOr[typingsSlinky.reactSelect.builtinsMod.getOptionValue[OptionType]] = js.native
  /* Hide the selected option from the menu */
  var hideSelectedOptions: js.UndefOr[Boolean] = js.native
  /* The id to set on the SelectContainer component. */
  var id: js.UndefOr[String] = js.native
  /* The id of the search input */
  var inputId: js.UndefOr[String] = js.native
  /* The value of the search input */
  var inputValue: js.UndefOr[String] = js.native
  /* Define an id prefix for the select components e.g. {your-id}-value */
  var instanceId: js.UndefOr[Double | String] = js.native
  /* Is the select value clearable */
  var isClearable: js.UndefOr[Boolean] = js.native
  /* Is the select disabled */
  var isDisabled: js.UndefOr[Boolean] = js.native
  /* Is the select in a state of loading (async) */
  var isLoading: js.UndefOr[Boolean] = js.native
  /* Support multiple selected options */
  var isMulti: js.UndefOr[Boolean] = js.native
  /* Override the built-in logic to detect whether an option is disabled */
  var isOptionDisabled: js.UndefOr[
    js.Function2[/* option */ OptionType, /* options */ OptionsType[OptionType], Boolean]
  ] = js.native
  /* Override the built-in logic to detect whether an option is selected */
  var isOptionSelected: js.UndefOr[
    js.Function2[/* option */ OptionType, /* options */ OptionsType[OptionType], Boolean]
  ] = js.native
  /* Is the select direction right-to-left */
  var isRtl: js.UndefOr[Boolean] = js.native
  /* Whether to enable search functionality */
  var isSearchable: js.UndefOr[Boolean] = js.native
  /* Async: Text to display when loading options */
  var loadingMessage: js.UndefOr[js.Function1[/* obj */ AnonInputValue, String | Null]] = js.native
  /* Maximum height of the menu before scrolling */
  var maxMenuHeight: js.UndefOr[Double] = js.native
  /* Whether the menu is open */
  var menuIsOpen: js.UndefOr[Boolean] = js.native
  /* Default placement of the menu in relation to the control. 'auto' will flip
    when there isn't enough space below the control. */
  var menuPlacement: js.UndefOr[MenuPlacement] = js.native
  /* Whether the menu should use a portal, and where it should attach */
  var menuPortalTarget: js.UndefOr[HTMLElement | Null] = js.native
  /* The CSS position value of the menu, when "fixed" extra layout management is required */
  var menuPosition: js.UndefOr[MenuPosition] = js.native
  /* Whether to block scroll events when the menu is open */
  var menuShouldBlockScroll: js.UndefOr[Boolean] = js.native
  /* Whether the menu should be scrolled into view when it opens */
  var menuShouldScrollIntoView: js.UndefOr[Boolean] = js.native
  /* Minimum height of the menu before flipping */
  var minMenuHeight: js.UndefOr[Double] = js.native
  /* Name of the HTML Input (optional - without this, no input will be rendered) */
  var name: js.UndefOr[String] = js.native
  /* Text to display when there are no options */
  var noOptionsMessage: js.UndefOr[js.Function1[/* obj */ AnonInputValue, String | Null]] = js.native
  /* Handle blur events on the control */
  var onBlur: js.UndefOr[FocusEventHandler] = js.native
  /* Handle change events on the select */
  var onChange: js.UndefOr[
    js.Function2[/* value */ ValueType[OptionType], /* action */ ActionMeta[OptionType], Unit]
  ] = js.native
  /* Handle focus events on the control */
  var onFocus: js.UndefOr[FocusEventHandler] = js.native
  /* Handle change events on the input */
  var onInputChange: js.UndefOr[js.Function2[/* newValue */ String, /* actionMeta */ InputActionMeta, Unit]] = js.native
  /* Handle key down events on the select */
  var onKeyDown: js.UndefOr[KeyboardEventHandler] = js.native
  /* Handle the menu closing */
  var onMenuClose: js.UndefOr[js.Function0[Unit]] = js.native
  /* Handle the menu opening */
  var onMenuOpen: js.UndefOr[js.Function0[Unit]] = js.native
  /* Fired when the user scrolls to the bottom of the menu */
  var onMenuScrollToBottom: js.UndefOr[js.Function1[/* event */ SyntheticEvent[Event_, HTMLElement], Unit]] = js.native
  /* Fired when the user scrolls to the top of the menu */
  var onMenuScrollToTop: js.UndefOr[js.Function1[/* event */ SyntheticEvent[Event_, HTMLElement], Unit]] = js.native
  /* Allows control of whether the menu is opened when the Select is clicked */
  var openMenuOnClick: js.UndefOr[Boolean] = js.native
  /* Allows control of whether the menu is opened when the Select is focused */
  var openMenuOnFocus: js.UndefOr[Boolean] = js.native
  /* Array of options that populate the select menu */
  var options: js.UndefOr[GroupedOptionsType[OptionType] | OptionsType[OptionType]] = js.native
  /* Number of options to jump in menu when page{up|down} keys are used */
  var pageSize: js.UndefOr[Double] = js.native
  /* Placeholder text for the select value */
  var placeholder: js.UndefOr[TagMod[Any]] = js.native
  /* Status to relay to screen readers */
  var screenReaderStatus: js.UndefOr[js.Function1[/* obj */ AnonCount, String]] = js.native
  /* Style modifier methods */
  var styles: js.UndefOr[StylesConfig] = js.native
  /* Sets the tabIndex attribute on the input */
  var tabIndex: js.UndefOr[String | Null] = js.native
  /* Select the currently focused option when the user presses tab */
  var tabSelectsValue: js.UndefOr[Boolean] = js.native
  /* Theme modifier method */
  var theme: js.UndefOr[ThemeConfig] = js.native
  /* The value of the select; reflected by the selected option */
  var value: js.UndefOr[ValueType[OptionType]] = js.native
}

object Props {
  @scala.inline
  def apply[OptionType](): Props[OptionType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Props[OptionType]]
  }
  @scala.inline
  implicit class PropsOps[Self[optiontype] <: Props[optiontype], OptionType] (val x: Self[OptionType]) extends AnyVal {
    @scala.inline
    def duplicate: Self[OptionType] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[OptionType]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[OptionType] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[OptionType] with Other]
    @scala.inline
    def `withAria-label`(value: String): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-label`: Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-label")(js.undefined)
        ret
    }
    @scala.inline
    def `withAria-labelledby`(value: String): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-labelledby")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-labelledby`: Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-labelledby")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoFocus(value: Boolean): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoFocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoFocus: Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoFocus")(js.undefined)
        ret
    }
    @scala.inline
    def withBackspaceRemovesValue(value: Boolean): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backspaceRemovesValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackspaceRemovesValue: Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backspaceRemovesValue")(js.undefined)
        ret
    }
    @scala.inline
    def withBlurInputOnSelect(value: Boolean): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blurInputOnSelect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlurInputOnSelect: Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blurInputOnSelect")(js.undefined)
        ret
    }
    @scala.inline
    def withCaptureMenuScroll(value: Boolean): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("captureMenuScroll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCaptureMenuScroll: Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("captureMenuScroll")(js.undefined)
        ret
    }
    @scala.inline
    def withClassName(value: String): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
    @scala.inline
    def withClassNamePrefix(value: String): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classNamePrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassNamePrefix: Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classNamePrefix")(js.undefined)
        ret
    }
    @scala.inline
    def withClassNamePrefixNull: Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classNamePrefix")(null)
        ret
    }
    @scala.inline
    def withCloseMenuOnScrollFunction1(value: /* evt */ Event_ => Unit): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeMenuOnScroll")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCloseMenuOnScroll(value: Boolean | EventListener): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeMenuOnScroll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloseMenuOnScroll: Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeMenuOnScroll")(js.undefined)
        ret
    }
    @scala.inline
    def withCloseMenuOnSelect(value: Boolean): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeMenuOnSelect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloseMenuOnSelect: Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeMenuOnSelect")(js.undefined)
        ret
    }
    @scala.inline
    def withComponents(value: SelectComponentsConfig[OptionType]): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("components")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComponents: Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("components")(js.undefined)
        ret
    }
    @scala.inline
    def withControlShouldRenderValue(value: Boolean): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controlShouldRenderValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutControlShouldRenderValue: Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controlShouldRenderValue")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultInputValue(value: String): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultInputValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultInputValue: Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultInputValue")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultMenuIsOpen(value: Boolean): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultMenuIsOpen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultMenuIsOpen: Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultMenuIsOpen")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultValue(value: ValueType[OptionType]): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultValue: Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValue")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultValueNull: Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValue")(null)
        ret
    }
    @scala.inline
    def withDelimiter(value: String): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delimiter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelimiter: Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delimiter")(js.undefined)
        ret
    }
    @scala.inline
    def withEscapeClearsValue(value: Boolean): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("escapeClearsValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEscapeClearsValue: Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("escapeClearsValue")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterOption(value: (/* option */ Option, /* rawInput */ String) => Boolean): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterOption")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutFilterOption: Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterOption")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterOptionNull: Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterOption")(null)
        ret
    }
    @scala.inline
    def withFormatGroupLabel(value: /* group */ GroupType[OptionType] => TagMod[Any]): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatGroupLabel")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutFormatGroupLabel: Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatGroupLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withFormatOptionLabel(value: (/* option */ OptionType, /* labelMeta */ FormatOptionLabelMeta[OptionType]) => TagMod[Any]): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatOptionLabel")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutFormatOptionLabel: Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatOptionLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withGetOptionLabel(value: OptionType => String): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOptionLabel")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetOptionLabel: Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOptionLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withGetOptionValue(value: OptionType => String): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOptionValue")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetOptionValue: Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOptionValue")(js.undefined)
        ret
    }
    @scala.inline
    def withHideSelectedOptions(value: Boolean): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideSelectedOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideSelectedOptions: Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideSelectedOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withInputId(value: String): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputId: Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputId")(js.undefined)
        ret
    }
    @scala.inline
    def withInputValue(value: String): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputValue: Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputValue")(js.undefined)
        ret
    }
    @scala.inline
    def withInstanceId(value: Double | String): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceId: Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceId")(js.undefined)
        ret
    }
    @scala.inline
    def withIsClearable(value: Boolean): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isClearable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsClearable: Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isClearable")(js.undefined)
        ret
    }
    @scala.inline
    def withIsDisabled(value: Boolean): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDisabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsDisabled: Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDisabled")(js.undefined)
        ret
    }
    @scala.inline
    def withIsLoading(value: Boolean): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLoading")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsLoading: Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLoading")(js.undefined)
        ret
    }
    @scala.inline
    def withIsMulti(value: Boolean): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMulti")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsMulti: Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMulti")(js.undefined)
        ret
    }
    @scala.inline
    def withIsOptionDisabled(value: (/* option */ OptionType, /* options */ OptionsType[OptionType]) => Boolean): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOptionDisabled")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutIsOptionDisabled: Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOptionDisabled")(js.undefined)
        ret
    }
    @scala.inline
    def withIsOptionSelected(value: (/* option */ OptionType, /* options */ OptionsType[OptionType]) => Boolean): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOptionSelected")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutIsOptionSelected: Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOptionSelected")(js.undefined)
        ret
    }
    @scala.inline
    def withIsRtl(value: Boolean): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRtl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsRtl: Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRtl")(js.undefined)
        ret
    }
    @scala.inline
    def withIsSearchable(value: Boolean): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSearchable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsSearchable: Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSearchable")(js.undefined)
        ret
    }
    @scala.inline
    def withLoadingMessage(value: /* obj */ AnonInputValue => String | Null): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadingMessage")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutLoadingMessage: Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadingMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxMenuHeight(value: Double): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxMenuHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxMenuHeight: Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxMenuHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withMenuIsOpen(value: Boolean): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuIsOpen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMenuIsOpen: Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuIsOpen")(js.undefined)
        ret
    }
    @scala.inline
    def withMenuPlacement(value: MenuPlacement): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuPlacement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMenuPlacement: Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuPlacement")(js.undefined)
        ret
    }
    @scala.inline
    def withMenuPortalTarget(value: HTMLElement): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuPortalTarget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMenuPortalTarget: Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuPortalTarget")(js.undefined)
        ret
    }
    @scala.inline
    def withMenuPortalTargetNull: Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuPortalTarget")(null)
        ret
    }
    @scala.inline
    def withMenuPosition(value: MenuPosition): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMenuPosition: Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withMenuShouldBlockScroll(value: Boolean): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuShouldBlockScroll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMenuShouldBlockScroll: Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuShouldBlockScroll")(js.undefined)
        ret
    }
    @scala.inline
    def withMenuShouldScrollIntoView(value: Boolean): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuShouldScrollIntoView")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMenuShouldScrollIntoView: Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuShouldScrollIntoView")(js.undefined)
        ret
    }
    @scala.inline
    def withMinMenuHeight(value: Double): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minMenuHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinMenuHeight: Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minMenuHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withNoOptionsMessage(value: /* obj */ AnonInputValue => String | Null): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noOptionsMessage")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutNoOptionsMessage: Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noOptionsMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withOnBlur(value: /* event */ SyntheticFocusEvent[HTMLElement] => Unit): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBlur")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnBlur: Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBlur")(js.undefined)
        ret
    }
    @scala.inline
    def withOnChange(value: (/* value */ ValueType[OptionType], /* action */ ActionMeta[OptionType]) => Unit): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnChange: Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnFocus(value: /* event */ SyntheticFocusEvent[HTMLElement] => Unit): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFocus")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnFocus: Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFocus")(js.undefined)
        ret
    }
    @scala.inline
    def withOnInputChange(value: (/* newValue */ String, /* actionMeta */ InputActionMeta) => Unit): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onInputChange")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnInputChange: Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onInputChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnKeyDown(value: /* event */ SyntheticKeyboardEvent[HTMLElement] => Unit): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeyDown")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnKeyDown: Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeyDown")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMenuClose(value: () => Unit): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMenuClose")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnMenuClose: Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMenuClose")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMenuOpen(value: () => Unit): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMenuOpen")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnMenuOpen: Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMenuOpen")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMenuScrollToBottom(value: /* event */ SyntheticEvent[Event_, HTMLElement] => Unit): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMenuScrollToBottom")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMenuScrollToBottom: Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMenuScrollToBottom")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMenuScrollToTop(value: /* event */ SyntheticEvent[Event_, HTMLElement] => Unit): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMenuScrollToTop")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMenuScrollToTop: Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMenuScrollToTop")(js.undefined)
        ret
    }
    @scala.inline
    def withOpenMenuOnClick(value: Boolean): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openMenuOnClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpenMenuOnClick: Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openMenuOnClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOpenMenuOnFocus(value: Boolean): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openMenuOnFocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpenMenuOnFocus: Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openMenuOnFocus")(js.undefined)
        ret
    }
    @scala.inline
    def withOptions(value: GroupedOptionsType[OptionType] | OptionsType[OptionType]): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptions: Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(js.undefined)
        ret
    }
    @scala.inline
    def withPageSize(value: Double): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageSize: Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageSize")(js.undefined)
        ret
    }
    @scala.inline
    def withPlaceholderReactElement(value: ReactElement): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlaceholder(value: TagMod[Any]): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlaceholder: Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(js.undefined)
        ret
    }
    @scala.inline
    def withScreenReaderStatus(value: /* obj */ AnonCount => String): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screenReaderStatus")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutScreenReaderStatus: Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screenReaderStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withStyles(value: StylesConfig): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyles: Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(js.undefined)
        ret
    }
    @scala.inline
    def withTabIndex(value: String): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTabIndex: Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withTabIndexNull: Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabIndex")(null)
        ret
    }
    @scala.inline
    def withTabSelectsValue(value: Boolean): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabSelectsValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTabSelectsValue: Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabSelectsValue")(js.undefined)
        ret
    }
    @scala.inline
    def withThemeFunction1(value: /* theme */ Theme => Theme): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTheme(value: ThemeConfig): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTheme: Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: ValueType[OptionType]): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
    @scala.inline
    def withValueNull: Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(null)
        ret
    }
  }
  
}

