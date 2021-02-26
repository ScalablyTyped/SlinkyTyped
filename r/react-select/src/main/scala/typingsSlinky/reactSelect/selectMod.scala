package typingsSlinky.reactSelect

import org.scalablytyped.runtime.TopLevel
import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.HTMLInputElement
import org.scalajs.dom.raw.TouchEvent
import slinky.core.SyntheticEvent
import slinky.core.facade.ReactElement
import slinky.web.SyntheticFocusEvent
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import slinky.web.SyntheticTouchEvent
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.Ref
import typingsSlinky.reactSelect.anon.ClearValue
import typingsSlinky.reactSelect.anon.Context
import typingsSlinky.reactSelect.anon.Count
import typingsSlinky.reactSelect.anon.InputValue
import typingsSlinky.reactSelect.componentsMod.PlaceholderOrValue
import typingsSlinky.reactSelect.componentsMod.SelectComponents
import typingsSlinky.reactSelect.componentsMod.SelectComponentsConfig
import typingsSlinky.reactSelect.filtersMod.Option
import typingsSlinky.reactSelect.reactSelectStrings.first
import typingsSlinky.reactSelect.reactSelectStrings.group
import typingsSlinky.reactSelect.reactSelectStrings.input
import typingsSlinky.reactSelect.reactSelectStrings.last
import typingsSlinky.reactSelect.reactSelectStrings.listbox
import typingsSlinky.reactSelect.reactSelectStrings.next
import typingsSlinky.reactSelect.reactSelectStrings.option
import typingsSlinky.reactSelect.reactSelectStrings.previous
import typingsSlinky.reactSelect.stylesMod.StylesConfig
import typingsSlinky.reactSelect.themeMod.ThemeConfig
import typingsSlinky.reactSelect.typesMod.ActionMeta
import typingsSlinky.reactSelect.typesMod.ActionTypes
import typingsSlinky.reactSelect.typesMod.FocusDirection
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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object selectMod {
  
  @JSImport("react-select/src/Select", JSImport.Default)
  @js.native
  class default[OptionType /* <: OptionTypeBase */] () extends Select[OptionType]
  /* static members */
  object default {
    
    @JSImport("react-select/src/Select", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-select/src/Select", "default.defaultProps")
    @js.native
    def defaultProps: Props[js.Any] = js.native
    @scala.inline
    def defaultProps_=(x: Props[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-select/src/Select", "defaultProps")
  @js.native
  val defaultProps: Props[js.Any] = js.native
  
  type ElRef = Ref[js.Any]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.reactSelect.reactSelectStrings.menu
    - typingsSlinky.reactSelect.reactSelectStrings.value
  */
  trait FormatOptionLabelContext extends StObject
  object FormatOptionLabelContext {
    
    @scala.inline
    def menu: typingsSlinky.reactSelect.reactSelectStrings.menu = "menu".asInstanceOf[typingsSlinky.reactSelect.reactSelectStrings.menu]
    
    @scala.inline
    def value: typingsSlinky.reactSelect.reactSelectStrings.value = "value".asInstanceOf[typingsSlinky.reactSelect.reactSelectStrings.value]
  }
  
  @js.native
  trait FormatOptionLabelMeta[OptionType /* <: OptionTypeBase */] extends StObject {
    
    var context: FormatOptionLabelContext = js.native
    
    var inputValue: String = js.native
    
    var selectValue: ValueType[OptionType] = js.native
  }
  object FormatOptionLabelMeta {
    
    @scala.inline
    def apply[OptionType /* <: OptionTypeBase */](context: FormatOptionLabelContext, inputValue: String): FormatOptionLabelMeta[OptionType] = {
      val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], inputValue = inputValue.asInstanceOf[js.Any])
      __obj.asInstanceOf[FormatOptionLabelMeta[OptionType]]
    }
    
    @scala.inline
    implicit class FormatOptionLabelMetaMutableBuilder[Self <: FormatOptionLabelMeta[_], OptionType /* <: OptionTypeBase */] (val x: Self with FormatOptionLabelMeta[OptionType]) extends AnyVal {
      
      @scala.inline
      def setContext(value: FormatOptionLabelContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputValue(value: String): Self = StObject.set(x, "inputValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectValue(value: ValueType[OptionType]): Self = StObject.set(x, "selectValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectValueNull: Self = StObject.set(x, "selectValue", null)
      
      @scala.inline
      def setSelectValueUndefined: Self = StObject.set(x, "selectValue", js.undefined)
      
      @scala.inline
      def setSelectValueVarargs(value: OptionType*): Self = StObject.set(x, "selectValue", js.Array(value :_*))
    }
  }
  
  @js.native
  trait MenuOptions[OptionType /* <: OptionTypeBase */] extends StObject {
    
    var focusable: js.Array[OptionType] = js.native
    
    var render: js.Array[OptionType] = js.native
  }
  object MenuOptions {
    
    @scala.inline
    def apply[OptionType /* <: OptionTypeBase */](focusable: js.Array[OptionType], render: js.Array[OptionType]): MenuOptions[OptionType] = {
      val __obj = js.Dynamic.literal(focusable = focusable.asInstanceOf[js.Any], render = render.asInstanceOf[js.Any])
      __obj.asInstanceOf[MenuOptions[OptionType]]
    }
    
    @scala.inline
    implicit class MenuOptionsMutableBuilder[Self <: MenuOptions[_], OptionType /* <: OptionTypeBase */] (val x: Self with MenuOptions[OptionType]) extends AnyVal {
      
      @scala.inline
      def setFocusable(value: js.Array[OptionType]): Self = StObject.set(x, "focusable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocusableVarargs(value: OptionType*): Self = StObject.set(x, "focusable", js.Array(value :_*))
      
      @scala.inline
      def setRender(value: js.Array[OptionType]): Self = StObject.set(x, "render", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenderVarargs(value: OptionType*): Self = StObject.set(x, "render", js.Array(value :_*))
    }
  }
  
  type MouseOrTouchEvent = SyntheticMouseEvent[HTMLElement] | SyntheticTouchEvent[HTMLElement]
  
  @js.native
  trait NamedProps[OptionType /* <: OptionTypeBase */] extends StObject {
    
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
          ReactElement
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
    var loadingMessage: js.UndefOr[js.Function1[/* obj */ InputValue, String | Null]] = js.native
    
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
    var noOptionsMessage: js.UndefOr[js.Function1[/* obj */ InputValue, String | Null]] = js.native
    
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
    var onMenuScrollToBottom: js.UndefOr[js.Function1[/* event */ SyntheticEvent[Event, HTMLElement], Unit]] = js.native
    
    /* Fired when the user scrolls to the top of the menu */
    var onMenuScrollToTop: js.UndefOr[js.Function1[/* event */ SyntheticEvent[Event, HTMLElement], Unit]] = js.native
    
    /* Allows control of whether the menu is opened when the Select is clicked */
    var openMenuOnClick: js.UndefOr[Boolean] = js.native
    
    /* Allows control of whether the menu is opened when the Select is focused */
    var openMenuOnFocus: js.UndefOr[Boolean] = js.native
    
    /* Array of options that populate the select menu */
    var options: js.UndefOr[GroupedOptionsType[OptionType] | OptionsType[OptionType]] = js.native
    
    /* Number of options to jump in menu when page{up|down} keys are used */
    var pageSize: js.UndefOr[Double] = js.native
    
    /* Placeholder text for the select value */
    var placeholder: js.UndefOr[ReactElement] = js.native
    
    /* Status to relay to screen readers */
    var screenReaderStatus: js.UndefOr[js.Function1[/* obj */ Count, String]] = js.native
    
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
  object NamedProps {
    
    @scala.inline
    def apply[OptionType /* <: OptionTypeBase */](): NamedProps[OptionType] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NamedProps[OptionType]]
    }
    
    @scala.inline
    implicit class NamedPropsMutableBuilder[Self <: NamedProps[_], OptionType /* <: OptionTypeBase */] (val x: Self with NamedProps[OptionType]) extends AnyVal {
      
      @scala.inline
      def `setAria-label`(value: String): Self = StObject.set(x, "aria-label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-labelUndefined`: Self = StObject.set(x, "aria-label", js.undefined)
      
      @scala.inline
      def `setAria-labelledby`(value: String): Self = StObject.set(x, "aria-labelledby", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-labelledbyUndefined`: Self = StObject.set(x, "aria-labelledby", js.undefined)
      
      @scala.inline
      def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      @scala.inline
      def setBackspaceRemovesValue(value: Boolean): Self = StObject.set(x, "backspaceRemovesValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackspaceRemovesValueUndefined: Self = StObject.set(x, "backspaceRemovesValue", js.undefined)
      
      @scala.inline
      def setBlurInputOnSelect(value: Boolean): Self = StObject.set(x, "blurInputOnSelect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlurInputOnSelectUndefined: Self = StObject.set(x, "blurInputOnSelect", js.undefined)
      
      @scala.inline
      def setCaptureMenuScroll(value: Boolean): Self = StObject.set(x, "captureMenuScroll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaptureMenuScrollUndefined: Self = StObject.set(x, "captureMenuScroll", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNamePrefix(value: String): Self = StObject.set(x, "classNamePrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNamePrefixNull: Self = StObject.set(x, "classNamePrefix", null)
      
      @scala.inline
      def setClassNamePrefixUndefined: Self = StObject.set(x, "classNamePrefix", js.undefined)
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setCloseMenuOnScroll(value: Boolean | EventListener): Self = StObject.set(x, "closeMenuOnScroll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseMenuOnScrollFunction1(value: /* evt */ Event => Unit): Self = StObject.set(x, "closeMenuOnScroll", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCloseMenuOnScrollUndefined: Self = StObject.set(x, "closeMenuOnScroll", js.undefined)
      
      @scala.inline
      def setCloseMenuOnSelect(value: Boolean): Self = StObject.set(x, "closeMenuOnSelect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseMenuOnSelectUndefined: Self = StObject.set(x, "closeMenuOnSelect", js.undefined)
      
      @scala.inline
      def setComponents(value: SelectComponentsConfig[OptionType]): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentsUndefined: Self = StObject.set(x, "components", js.undefined)
      
      @scala.inline
      def setControlShouldRenderValue(value: Boolean): Self = StObject.set(x, "controlShouldRenderValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setControlShouldRenderValueUndefined: Self = StObject.set(x, "controlShouldRenderValue", js.undefined)
      
      @scala.inline
      def setDefaultInputValue(value: String): Self = StObject.set(x, "defaultInputValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultInputValueUndefined: Self = StObject.set(x, "defaultInputValue", js.undefined)
      
      @scala.inline
      def setDefaultMenuIsOpen(value: Boolean): Self = StObject.set(x, "defaultMenuIsOpen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultMenuIsOpenUndefined: Self = StObject.set(x, "defaultMenuIsOpen", js.undefined)
      
      @scala.inline
      def setDefaultValue(value: ValueType[OptionType]): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultValueNull: Self = StObject.set(x, "defaultValue", null)
      
      @scala.inline
      def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      @scala.inline
      def setDefaultValueVarargs(value: OptionType*): Self = StObject.set(x, "defaultValue", js.Array(value :_*))
      
      @scala.inline
      def setDelimiter(value: String): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelimiterUndefined: Self = StObject.set(x, "delimiter", js.undefined)
      
      @scala.inline
      def setEscapeClearsValue(value: Boolean): Self = StObject.set(x, "escapeClearsValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEscapeClearsValueUndefined: Self = StObject.set(x, "escapeClearsValue", js.undefined)
      
      @scala.inline
      def setFilterOption(value: (/* option */ Option, /* rawInput */ String) => Boolean): Self = StObject.set(x, "filterOption", js.Any.fromFunction2(value))
      
      @scala.inline
      def setFilterOptionNull: Self = StObject.set(x, "filterOption", null)
      
      @scala.inline
      def setFilterOptionUndefined: Self = StObject.set(x, "filterOption", js.undefined)
      
      @scala.inline
      def setFormatGroupLabel(value: /* group */ GroupType[OptionType] => ReactElement): Self = StObject.set(x, "formatGroupLabel", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFormatGroupLabelUndefined: Self = StObject.set(x, "formatGroupLabel", js.undefined)
      
      @scala.inline
      def setFormatOptionLabel(
        value: (/* option */ OptionType, /* labelMeta */ FormatOptionLabelMeta[OptionType]) => ReactElement
      ): Self = StObject.set(x, "formatOptionLabel", js.Any.fromFunction2(value))
      
      @scala.inline
      def setFormatOptionLabelUndefined: Self = StObject.set(x, "formatOptionLabel", js.undefined)
      
      @scala.inline
      def setGetOptionLabel(value: OptionType => String): Self = StObject.set(x, "getOptionLabel", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetOptionLabelUndefined: Self = StObject.set(x, "getOptionLabel", js.undefined)
      
      @scala.inline
      def setGetOptionValue(value: OptionType => String): Self = StObject.set(x, "getOptionValue", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetOptionValueUndefined: Self = StObject.set(x, "getOptionValue", js.undefined)
      
      @scala.inline
      def setHideSelectedOptions(value: Boolean): Self = StObject.set(x, "hideSelectedOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideSelectedOptionsUndefined: Self = StObject.set(x, "hideSelectedOptions", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setInputId(value: String): Self = StObject.set(x, "inputId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputIdUndefined: Self = StObject.set(x, "inputId", js.undefined)
      
      @scala.inline
      def setInputValue(value: String): Self = StObject.set(x, "inputValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputValueUndefined: Self = StObject.set(x, "inputValue", js.undefined)
      
      @scala.inline
      def setInstanceId(value: Double | String): Self = StObject.set(x, "instanceId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstanceIdUndefined: Self = StObject.set(x, "instanceId", js.undefined)
      
      @scala.inline
      def setIsClearable(value: Boolean): Self = StObject.set(x, "isClearable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsClearableUndefined: Self = StObject.set(x, "isClearable", js.undefined)
      
      @scala.inline
      def setIsDisabled(value: Boolean): Self = StObject.set(x, "isDisabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsDisabledUndefined: Self = StObject.set(x, "isDisabled", js.undefined)
      
      @scala.inline
      def setIsLoading(value: Boolean): Self = StObject.set(x, "isLoading", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsLoadingUndefined: Self = StObject.set(x, "isLoading", js.undefined)
      
      @scala.inline
      def setIsMulti(value: Boolean): Self = StObject.set(x, "isMulti", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsMultiUndefined: Self = StObject.set(x, "isMulti", js.undefined)
      
      @scala.inline
      def setIsOptionDisabled(value: (/* option */ OptionType, /* options */ OptionsType[OptionType]) => Boolean): Self = StObject.set(x, "isOptionDisabled", js.Any.fromFunction2(value))
      
      @scala.inline
      def setIsOptionDisabledUndefined: Self = StObject.set(x, "isOptionDisabled", js.undefined)
      
      @scala.inline
      def setIsOptionSelected(value: (/* option */ OptionType, /* options */ OptionsType[OptionType]) => Boolean): Self = StObject.set(x, "isOptionSelected", js.Any.fromFunction2(value))
      
      @scala.inline
      def setIsOptionSelectedUndefined: Self = StObject.set(x, "isOptionSelected", js.undefined)
      
      @scala.inline
      def setIsRtl(value: Boolean): Self = StObject.set(x, "isRtl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsRtlUndefined: Self = StObject.set(x, "isRtl", js.undefined)
      
      @scala.inline
      def setIsSearchable(value: Boolean): Self = StObject.set(x, "isSearchable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsSearchableUndefined: Self = StObject.set(x, "isSearchable", js.undefined)
      
      @scala.inline
      def setLoadingMessage(value: /* obj */ InputValue => String | Null): Self = StObject.set(x, "loadingMessage", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLoadingMessageUndefined: Self = StObject.set(x, "loadingMessage", js.undefined)
      
      @scala.inline
      def setMaxMenuHeight(value: Double): Self = StObject.set(x, "maxMenuHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxMenuHeightUndefined: Self = StObject.set(x, "maxMenuHeight", js.undefined)
      
      @scala.inline
      def setMenuIsOpen(value: Boolean): Self = StObject.set(x, "menuIsOpen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMenuIsOpenUndefined: Self = StObject.set(x, "menuIsOpen", js.undefined)
      
      @scala.inline
      def setMenuPlacement(value: MenuPlacement): Self = StObject.set(x, "menuPlacement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMenuPlacementUndefined: Self = StObject.set(x, "menuPlacement", js.undefined)
      
      @scala.inline
      def setMenuPortalTarget(value: HTMLElement): Self = StObject.set(x, "menuPortalTarget", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMenuPortalTargetNull: Self = StObject.set(x, "menuPortalTarget", null)
      
      @scala.inline
      def setMenuPortalTargetUndefined: Self = StObject.set(x, "menuPortalTarget", js.undefined)
      
      @scala.inline
      def setMenuPosition(value: MenuPosition): Self = StObject.set(x, "menuPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMenuPositionUndefined: Self = StObject.set(x, "menuPosition", js.undefined)
      
      @scala.inline
      def setMenuShouldBlockScroll(value: Boolean): Self = StObject.set(x, "menuShouldBlockScroll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMenuShouldBlockScrollUndefined: Self = StObject.set(x, "menuShouldBlockScroll", js.undefined)
      
      @scala.inline
      def setMenuShouldScrollIntoView(value: Boolean): Self = StObject.set(x, "menuShouldScrollIntoView", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMenuShouldScrollIntoViewUndefined: Self = StObject.set(x, "menuShouldScrollIntoView", js.undefined)
      
      @scala.inline
      def setMinMenuHeight(value: Double): Self = StObject.set(x, "minMenuHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinMenuHeightUndefined: Self = StObject.set(x, "minMenuHeight", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setNoOptionsMessage(value: /* obj */ InputValue => String | Null): Self = StObject.set(x, "noOptionsMessage", js.Any.fromFunction1(value))
      
      @scala.inline
      def setNoOptionsMessageUndefined: Self = StObject.set(x, "noOptionsMessage", js.undefined)
      
      @scala.inline
      def setOnBlur(value: /* event */ SyntheticFocusEvent[HTMLElement] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      @scala.inline
      def setOnChange(value: (/* value */ ValueType[OptionType], /* action */ ActionMeta[OptionType]) => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOnFocus(value: /* event */ SyntheticFocusEvent[HTMLElement] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      @scala.inline
      def setOnInputChange(value: (/* newValue */ String, /* actionMeta */ InputActionMeta) => Unit): Self = StObject.set(x, "onInputChange", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnInputChangeUndefined: Self = StObject.set(x, "onInputChange", js.undefined)
      
      @scala.inline
      def setOnKeyDown(value: /* event */ SyntheticKeyboardEvent[HTMLElement] => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
      
      @scala.inline
      def setOnMenuClose(value: () => Unit): Self = StObject.set(x, "onMenuClose", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnMenuCloseUndefined: Self = StObject.set(x, "onMenuClose", js.undefined)
      
      @scala.inline
      def setOnMenuOpen(value: () => Unit): Self = StObject.set(x, "onMenuOpen", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnMenuOpenUndefined: Self = StObject.set(x, "onMenuOpen", js.undefined)
      
      @scala.inline
      def setOnMenuScrollToBottom(value: /* event */ SyntheticEvent[Event, HTMLElement] => Unit): Self = StObject.set(x, "onMenuScrollToBottom", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMenuScrollToBottomUndefined: Self = StObject.set(x, "onMenuScrollToBottom", js.undefined)
      
      @scala.inline
      def setOnMenuScrollToTop(value: /* event */ SyntheticEvent[Event, HTMLElement] => Unit): Self = StObject.set(x, "onMenuScrollToTop", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMenuScrollToTopUndefined: Self = StObject.set(x, "onMenuScrollToTop", js.undefined)
      
      @scala.inline
      def setOpenMenuOnClick(value: Boolean): Self = StObject.set(x, "openMenuOnClick", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenMenuOnClickUndefined: Self = StObject.set(x, "openMenuOnClick", js.undefined)
      
      @scala.inline
      def setOpenMenuOnFocus(value: Boolean): Self = StObject.set(x, "openMenuOnFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenMenuOnFocusUndefined: Self = StObject.set(x, "openMenuOnFocus", js.undefined)
      
      @scala.inline
      def setOptions(value: GroupedOptionsType[OptionType] | OptionsType[OptionType]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      @scala.inline
      def setOptionsVarargs(value: (GroupType[OptionType] | OptionType)*): Self = StObject.set(x, "options", js.Array(value :_*))
      
      @scala.inline
      def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      @scala.inline
      def setPlaceholder(value: ReactElement): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceholderReactElement(value: ReactElement): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      @scala.inline
      def setScreenReaderStatus(value: /* obj */ Count => String): Self = StObject.set(x, "screenReaderStatus", js.Any.fromFunction1(value))
      
      @scala.inline
      def setScreenReaderStatusUndefined: Self = StObject.set(x, "screenReaderStatus", js.undefined)
      
      @scala.inline
      def setStyles(value: StylesConfig): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      @scala.inline
      def setTabIndex(value: String): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabIndexNull: Self = StObject.set(x, "tabIndex", null)
      
      @scala.inline
      def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
      
      @scala.inline
      def setTabSelectsValue(value: Boolean): Self = StObject.set(x, "tabSelectsValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabSelectsValueUndefined: Self = StObject.set(x, "tabSelectsValue", js.undefined)
      
      @scala.inline
      def setTheme(value: ThemeConfig): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeFunction1(value: /* theme */ Theme => Theme): Self = StObject.set(x, "theme", js.Any.fromFunction1(value))
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      @scala.inline
      def setValue(value: ValueType[OptionType]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueNull: Self = StObject.set(x, "value", null)
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      @scala.inline
      def setValueVarargs(value: OptionType*): Self = StObject.set(x, "value", js.Array(value :_*))
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ key in string ]: any} */ @js.native
  trait Props[OptionType /* <: OptionTypeBase */] extends NamedProps[OptionType]
  object Props {
    
    @scala.inline
    def apply[OptionType /* <: OptionTypeBase */](): Props[OptionType] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Props[OptionType]]
    }
  }
  
  @js.native
  trait Select[OptionType /* <: OptionTypeBase */]
    extends Component[Props[OptionType], State[OptionType], js.Any] {
    
    def announceAriaLiveContext(props: typingsSlinky.reactSelect.anon.Event): Unit = js.native
    
    // ==============================
    // Helpers
    // ==============================
    def announceAriaLiveSelection(props: Context): Unit = js.native
    
    // Misc. Instance Properties
    // ------------------------------
    var blockOptionHover: Boolean = js.native
    
    def blur(): Unit = js.native
    
    def blurInput(): Unit = js.native
    
    // ==============================
    // Menu Options
    // ==============================
    def buildMenuOptions(props: Props[OptionType], selectValue: OptionsType[OptionType]): MenuOptions[OptionType] = js.native
    
    // Lifecycle
    // ------------------------------
    def cacheComponents(components: SelectComponents[OptionType]): Unit = js.native
    
    var clearFocusValueOnUpdate: Boolean = js.native
    
    def clearValue(): Unit = js.native
    
    var commonProps: js.Any = js.native
    
    // TODO
    var components: SelectComponents[OptionType] = js.native
    
    // ==============================
    // Renderers
    // ==============================
    def constructAriaLiveMessage(): String = js.native
    
    // Refs
    // ------------------------------
    var controlRef: ElRef = js.native
    
    def countOptions(): Double = js.native
    
    def filterOption(option: js.Object, inputValue: String): Boolean = js.native
    
    // aliased for consumers
    def focus(): Unit = js.native
    
    // ==============================
    // Methods
    // ==============================
    def focusInput(): Unit = js.native
    
    def focusOption(direction: FocusDirection): Unit = js.native
    
    @JSName("focusValue")
    def focusValue_next(direction: next): Unit = js.native
    @JSName("focusValue")
    def focusValue_previous(direction: previous): Unit = js.native
    
    var focusedOptionRef: ElRef = js.native
    
    var formatGroupLabel: typingsSlinky.reactSelect.builtinsMod.formatGroupLabel[OptionType] = js.native
    
    def formatOptionLabel(data: OptionType, context: FormatOptionLabelContext): ReactElement = js.native
    
    def getActiveDescendentId(): js.Any = js.native
    
    // ==============================
    // Getters
    // ==============================
    def getCommonProps(): ClearValue[OptionType] = js.native
    
    def getControlRef(ref: HTMLElement): Unit = js.native
    
    @JSName("getElementId")
    def getElementId_group(element: group): String = js.native
    @JSName("getElementId")
    def getElementId_input(element: input): String = js.native
    @JSName("getElementId")
    def getElementId_listbox(element: listbox): String = js.native
    @JSName("getElementId")
    def getElementId_option(element: option): String = js.native
    
    def getFocusedOptionRef(ref: HTMLElement): Unit = js.native
    
    def getInputRef(ref: HTMLElement): Unit = js.native
    
    def getMenuListRef(ref: HTMLElement): Unit = js.native
    
    def getNextFocusedOption(options: OptionsType[OptionType]): OptionType = js.native
    
    def getNextFocusedValue(nextSelectValue: OptionsType[OptionType]): OptionType = js.native
    
    var getOptionLabel: typingsSlinky.reactSelect.builtinsMod.getOptionLabel[OptionType] = js.native
    
    var getOptionValue: typingsSlinky.reactSelect.builtinsMod.getOptionValue[OptionType] = js.native
    
    def getStyles(key: String, props: js.Object): js.Object = js.native
    
    // ==============================
    // Focus Handlers
    // ==============================
    def handleInputChange(event: SyntheticKeyboardEvent[HTMLInputElement]): Unit = js.native
    
    var hasGroups: Boolean = js.native
    
    def hasOptions(): Boolean = js.native
    
    def hasValue(): Boolean = js.native
    
    var initialTouchX: Double = js.native
    
    var initialTouchY: Double = js.native
    
    var inputIsHiddenAfterUpdate: Boolean | Null = js.native
    
    var inputRef: ElRef = js.native
    
    var instancePrefix: String = js.native
    
    def isClearable(): Boolean = js.native
    
    def isOptionDisabled(option: OptionType, selectValue: OptionsType[OptionType]): Boolean = js.native
    
    def isOptionSelected(option: OptionType, selectValue: OptionsType[OptionType]): Boolean = js.native
    
    var menuListRef: ElRef = js.native
    
    def onClearIndicatorMouseDown(event: MouseOrTouchEvent): Unit = js.native
    
    def onClearIndicatorTouchEnd(event: SyntheticTouchEvent[HTMLElement]): Unit = js.native
    
    def onCompositionEnd(): Unit = js.native
    
    def onCompositionStart(): Unit = js.native
    
    def onControlMouseDown(event: MouseOrTouchEvent): Unit = js.native
    
    def onControlTouchEnd(event: SyntheticTouchEvent[HTMLElement]): Unit = js.native
    
    def onDropdownIndicatorMouseDown(event: MouseOrTouchEvent): Unit = js.native
    
    def onDropdownIndicatorTouchEnd(event: SyntheticTouchEvent[HTMLElement]): Unit = js.native
    
    def onInputBlur(event: SyntheticFocusEvent[HTMLInputElement]): Unit = js.native
    
    def onInputChange(newValue: String, actionMeta: InputActionMeta): Unit = js.native
    
    def onInputFocus(event: SyntheticFocusEvent[HTMLInputElement]): Unit = js.native
    
    // ==============================
    // Keyboard Handlers
    // ==============================
    def onKeyDown(event: SyntheticKeyboardEvent[HTMLElement]): Unit = js.native
    
    def onMenuClose(): Unit = js.native
    
    // ==============================
    // Mouse Handlers
    // ==============================
    def onMenuMouseDown(event: SyntheticMouseEvent[HTMLElement]): Unit = js.native
    
    def onMenuMouseMove(event: SyntheticMouseEvent[HTMLElement]): Unit = js.native
    
    // ==============================
    // Consumer Handlers
    // ==============================
    def onMenuOpen(): Unit = js.native
    
    def onOptionHover(focusedOption: OptionType): Unit = js.native
    
    def onScroll(event: Event): Unit = js.native
    
    def onTouchEnd(event: TouchEvent): Unit = js.native
    
    def onTouchMove(event: TouchEvent): Unit = js.native
    
    def onTouchStart(event: TouchEvent): Unit = js.native
    
    var openAfterFocus: Boolean = js.native
    
    @JSName("openMenu")
    def openMenu_first(focusOption: first): Unit = js.native
    @JSName("openMenu")
    def openMenu_last(focusOption: last): Unit = js.native
    
    def popValue(): Unit = js.native
    
    def removeValue(removedValue: OptionType): Unit = js.native
    
    def renderClearIndicator(): ReactElement = js.native
    
    def renderDropdownIndicator(): ReactElement = js.native
    
    def renderFormField(): ReactElement = js.native
    
    def renderIndicatorSeparator(): ReactElement = js.native
    
    def renderInput(): ReactElement = js.native
    
    def renderLiveRegion(): ReactElement = js.native
    
    def renderLoadingIndicator(): ReactElement = js.native
    
    def renderMenu(): ReactElement = js.native
    
    def renderPlaceholderOrValue(): PlaceholderOrValue[OptionType] | Null = js.native
    
    var scrollToFocusedOptionOnUpdate: Boolean = js.native
    
    def selectOption(newValue: OptionType): Unit = js.native
    
    def setValue(newValue: ValueType[OptionType], action: ActionTypes): Unit = js.native
    def setValue(newValue: ValueType[OptionType], action: ActionTypes, option: OptionType): Unit = js.native
    
    def shouldHideSelectedOptions(): Boolean = js.native
    
    // ==============================
    // Composition Handlers
    // ==============================
    def startListeningComposition(): Unit = js.native
    
    // ==============================
    // Touch Handlers
    // ==============================
    def startListeningToTouch(): Unit = js.native
    
    def stopListeningComposition(): Unit = js.native
    
    def stopListeningToTouch(): Unit = js.native
    
    var userIsDragging: Boolean | Null = js.native
  }
  
  type SelectComponentsProps = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in string ]: any}
    */ typingsSlinky.reactSelect.reactSelectStrings.SelectComponentsProps with TopLevel[js.Any]
  
  @js.native
  trait State[OptionType /* <: OptionTypeBase */] extends StObject {
    
    var ariaLiveContext: String = js.native
    
    var ariaLiveSelection: String = js.native
    
    var focusedOption: OptionType | Null = js.native
    
    var focusedValue: OptionType | Null = js.native
    
    var inputIsHidden: Boolean = js.native
    
    var isComposing: Boolean = js.native
    
    var isFocused: Boolean = js.native
    
    var menuOptions: MenuOptions[OptionType] = js.native
    
    var selectValue: OptionsType[OptionType] = js.native
  }
  object State {
    
    @scala.inline
    def apply[OptionType /* <: OptionTypeBase */](
      ariaLiveContext: String,
      ariaLiveSelection: String,
      inputIsHidden: Boolean,
      isComposing: Boolean,
      isFocused: Boolean,
      menuOptions: MenuOptions[OptionType],
      selectValue: OptionsType[OptionType]
    ): State[OptionType] = {
      val __obj = js.Dynamic.literal(ariaLiveContext = ariaLiveContext.asInstanceOf[js.Any], ariaLiveSelection = ariaLiveSelection.asInstanceOf[js.Any], inputIsHidden = inputIsHidden.asInstanceOf[js.Any], isComposing = isComposing.asInstanceOf[js.Any], isFocused = isFocused.asInstanceOf[js.Any], menuOptions = menuOptions.asInstanceOf[js.Any], selectValue = selectValue.asInstanceOf[js.Any])
      __obj.asInstanceOf[State[OptionType]]
    }
    
    @scala.inline
    implicit class StateMutableBuilder[Self <: State[_], OptionType /* <: OptionTypeBase */] (val x: Self with State[OptionType]) extends AnyVal {
      
      @scala.inline
      def setAriaLiveContext(value: String): Self = StObject.set(x, "ariaLiveContext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAriaLiveSelection(value: String): Self = StObject.set(x, "ariaLiveSelection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocusedOption(value: OptionType): Self = StObject.set(x, "focusedOption", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocusedOptionNull: Self = StObject.set(x, "focusedOption", null)
      
      @scala.inline
      def setFocusedValue(value: OptionType): Self = StObject.set(x, "focusedValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocusedValueNull: Self = StObject.set(x, "focusedValue", null)
      
      @scala.inline
      def setInputIsHidden(value: Boolean): Self = StObject.set(x, "inputIsHidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsComposing(value: Boolean): Self = StObject.set(x, "isComposing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsFocused(value: Boolean): Self = StObject.set(x, "isFocused", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMenuOptions(value: MenuOptions[OptionType]): Self = StObject.set(x, "menuOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectValue(value: OptionsType[OptionType]): Self = StObject.set(x, "selectValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectValueVarargs(value: OptionType*): Self = StObject.set(x, "selectValue", js.Array(value :_*))
    }
  }
}
