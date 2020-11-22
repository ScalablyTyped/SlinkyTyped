package typingsSlinky.reactSelect.components

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.HTMLElement
import slinky.core.SyntheticEvent
import slinky.core.facade.ReactElement
import slinky.web.SyntheticFocusEvent
import slinky.web.SyntheticKeyboardEvent
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactSelect.anon.Count
import typingsSlinky.reactSelect.anon.InputValue
import typingsSlinky.reactSelect.componentsMod.SelectComponentsConfig
import typingsSlinky.reactSelect.creatableMod.default
import typingsSlinky.reactSelect.reactSelectStrings.first
import typingsSlinky.reactSelect.reactSelectStrings.last
import typingsSlinky.reactSelect.selectMod.FormatOptionLabelMeta
import typingsSlinky.reactSelect.srcCreatableMod.Props
import typingsSlinky.reactSelect.stylesMod.StylesConfig
import typingsSlinky.reactSelect.themeMod.ThemeConfig
import typingsSlinky.reactSelect.typesMod.ActionMeta
import typingsSlinky.reactSelect.typesMod.GroupType
import typingsSlinky.reactSelect.typesMod.GroupedOptionsType
import typingsSlinky.reactSelect.typesMod.InputActionMeta
import typingsSlinky.reactSelect.typesMod.MenuPlacement
import typingsSlinky.reactSelect.typesMod.MenuPosition
import typingsSlinky.reactSelect.typesMod.OptionTypeBase
import typingsSlinky.reactSelect.typesMod.OptionsType
import typingsSlinky.reactSelect.typesMod.Theme
import typingsSlinky.reactSelect.typesMod.ValueType
import typingsSlinky.std.EventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Creatable {
  
  @JSImport("react-select/creatable", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder[OptionType /* <: OptionTypeBase */] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default[OptionType]] {
    
    @scala.inline
    def allowCreateWhileLoading(value: Boolean): this.type = set("allowCreateWhileLoading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-label`(value: String): this.type = set("aria-label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-labelledby`(value: String): this.type = set("aria-labelledby", value.asInstanceOf[js.Any])
    
    @scala.inline
    def autoFocus(value: Boolean): this.type = set("autoFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def backspaceRemovesValue(value: Boolean): this.type = set("backspaceRemovesValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def blurInputOnSelect(value: Boolean): this.type = set("blurInputOnSelect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def captureMenuScroll(value: Boolean): this.type = set("captureMenuScroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def classNamePrefix(value: String): this.type = set("classNamePrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def classNamePrefixNull: this.type = set("classNamePrefix", null)
    
    @scala.inline
    def closeMenuOnScrollFunction1(value: /* evt */ Event => Unit): this.type = set("closeMenuOnScroll", js.Any.fromFunction1(value))
    
    @scala.inline
    def closeMenuOnScroll(value: Boolean | EventListener): this.type = set("closeMenuOnScroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def closeMenuOnSelect(value: Boolean): this.type = set("closeMenuOnSelect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def components(value: SelectComponentsConfig[OptionType]): this.type = set("components", value.asInstanceOf[js.Any])
    
    @scala.inline
    def controlShouldRenderValue(value: Boolean): this.type = set("controlShouldRenderValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def createOptionPosition(value: first | last): this.type = set("createOptionPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def defaultInputValue(value: String): this.type = set("defaultInputValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def defaultMenuIsOpen(value: Boolean): this.type = set("defaultMenuIsOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def defaultValueVarargs(value: OptionType*): this.type = set("defaultValue", js.Array(value :_*))
    
    @scala.inline
    def defaultValue(value: ValueType[OptionType]): this.type = set("defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def defaultValueNull: this.type = set("defaultValue", null)
    
    @scala.inline
    def delimiter(value: String): this.type = set("delimiter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def escapeClearsValue(value: Boolean): this.type = set("escapeClearsValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def filterOption(
      value: (/* option */ typingsSlinky.reactSelect.filtersMod.Option, /* rawInput */ String) => Boolean
    ): this.type = set("filterOption", js.Any.fromFunction2(value))
    
    @scala.inline
    def filterOptionNull: this.type = set("filterOption", null)
    
    @scala.inline
    def formatCreateLabel(value: /* inputValue */ String => ReactElement): this.type = set("formatCreateLabel", js.Any.fromFunction1(value))
    
    @scala.inline
    def formatGroupLabel(value: /* group */ GroupType[OptionType] => ReactElement): this.type = set("formatGroupLabel", js.Any.fromFunction1(value))
    
    @scala.inline
    def formatOptionLabel(value: (OptionType, /* labelMeta */ FormatOptionLabelMeta[OptionType]) => ReactElement): this.type = set("formatOptionLabel", js.Any.fromFunction2(value))
    
    @scala.inline
    def getNewOptionData(value: (/* inputValue */ String, /* optionLabel */ ReactElement) => OptionType): this.type = set("getNewOptionData", js.Any.fromFunction2(value))
    
    @scala.inline
    def getOptionLabel(value: OptionType => String): this.type = set("getOptionLabel", js.Any.fromFunction1(value))
    
    @scala.inline
    def getOptionValue(value: OptionType => String): this.type = set("getOptionValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def hideSelectedOptions(value: Boolean): this.type = set("hideSelectedOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def inputId(value: String): this.type = set("inputId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def inputValue(value: String): this.type = set("inputValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def instanceId(value: Double | String): this.type = set("instanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def isClearable(value: Boolean): this.type = set("isClearable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def isDisabled(value: Boolean): this.type = set("isDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def isLoading(value: Boolean): this.type = set("isLoading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def isMulti(value: Boolean): this.type = set("isMulti", value.asInstanceOf[js.Any])
    
    @scala.inline
    def isOptionDisabled(value: (OptionType, /* options */ OptionsType[OptionType]) => Boolean): this.type = set("isOptionDisabled", js.Any.fromFunction2(value))
    
    @scala.inline
    def isOptionSelected(value: (OptionType, /* options */ OptionsType[OptionType]) => Boolean): this.type = set("isOptionSelected", js.Any.fromFunction2(value))
    
    @scala.inline
    def isRtl(value: Boolean): this.type = set("isRtl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def isSearchable(value: Boolean): this.type = set("isSearchable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def isValidNewOption(
      value: (/* inputValue */ String, /* value */ ValueType[OptionType], /* options */ OptionsType[OptionType] | GroupedOptionsType[OptionType]) => Boolean
    ): this.type = set("isValidNewOption", js.Any.fromFunction3(value))
    
    @scala.inline
    def loadingMessage(value: /* obj */ InputValue => String | Null): this.type = set("loadingMessage", js.Any.fromFunction1(value))
    
    @scala.inline
    def maxMenuHeight(value: Double): this.type = set("maxMenuHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def menuIsOpen(value: Boolean): this.type = set("menuIsOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def menuPlacement(value: MenuPlacement): this.type = set("menuPlacement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def menuPortalTarget(value: HTMLElement): this.type = set("menuPortalTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def menuPortalTargetNull: this.type = set("menuPortalTarget", null)
    
    @scala.inline
    def menuPosition(value: MenuPosition): this.type = set("menuPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def menuShouldBlockScroll(value: Boolean): this.type = set("menuShouldBlockScroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def menuShouldScrollIntoView(value: Boolean): this.type = set("menuShouldScrollIntoView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def minMenuHeight(value: Double): this.type = set("minMenuHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def noOptionsMessage(value: /* obj */ InputValue => String | Null): this.type = set("noOptionsMessage", js.Any.fromFunction1(value))
    
    @scala.inline
    def onBlur(value: /* event */ SyntheticFocusEvent[HTMLElement] => Unit): this.type = set("onBlur", js.Any.fromFunction1(value))
    
    @scala.inline
    def onChange(value: (/* value */ ValueType[OptionType], /* action */ ActionMeta[OptionType]) => Unit): this.type = set("onChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def onCreateOption(value: /* inputValue */ String => Unit): this.type = set("onCreateOption", js.Any.fromFunction1(value))
    
    @scala.inline
    def onFocus(value: /* event */ SyntheticFocusEvent[HTMLElement] => Unit): this.type = set("onFocus", js.Any.fromFunction1(value))
    
    @scala.inline
    def onInputChange(value: (/* newValue */ String, /* actionMeta */ InputActionMeta) => Unit): this.type = set("onInputChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def onKeyDown(value: /* event */ SyntheticKeyboardEvent[HTMLElement] => Unit): this.type = set("onKeyDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMenuClose(value: () => Unit): this.type = set("onMenuClose", js.Any.fromFunction0(value))
    
    @scala.inline
    def onMenuOpen(value: () => Unit): this.type = set("onMenuOpen", js.Any.fromFunction0(value))
    
    @scala.inline
    def onMenuScrollToBottom(value: /* event */ SyntheticEvent[Event, HTMLElement] => Unit): this.type = set("onMenuScrollToBottom", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMenuScrollToTop(value: /* event */ SyntheticEvent[Event, HTMLElement] => Unit): this.type = set("onMenuScrollToTop", js.Any.fromFunction1(value))
    
    @scala.inline
    def openMenuOnClick(value: Boolean): this.type = set("openMenuOnClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def openMenuOnFocus(value: Boolean): this.type = set("openMenuOnFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def optionsVarargs(value: (GroupType[OptionType] | OptionType)*): this.type = set("options", js.Array(value :_*))
    
    @scala.inline
    def options(value: GroupedOptionsType[OptionType] | OptionsType[OptionType]): this.type = set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def pageSize(value: Double): this.type = set("pageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def placeholderReactElement(value: ReactElement): this.type = set("placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def placeholder(value: ReactElement): this.type = set("placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def screenReaderStatus(value: /* obj */ Count => String): this.type = set("screenReaderStatus", js.Any.fromFunction1(value))
    
    @scala.inline
    def styles(value: StylesConfig): this.type = set("styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tabIndex(value: String): this.type = set("tabIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tabIndexNull: this.type = set("tabIndex", null)
    
    @scala.inline
    def tabSelectsValue(value: Boolean): this.type = set("tabSelectsValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def themeFunction1(value: /* theme */ Theme => Theme): this.type = set("theme", js.Any.fromFunction1(value))
    
    @scala.inline
    def theme(value: ThemeConfig): this.type = set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def valueVarargs(value: OptionType*): this.type = set("value", js.Array(value :_*))
    
    @scala.inline
    def value(value: ValueType[OptionType]): this.type = set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def valueNull: this.type = set("value", null)
  }
  
  def withProps[OptionType /* <: OptionTypeBase */](p: Props[OptionType]): Builder[OptionType] = new Builder[OptionType](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply[OptionType /* <: OptionTypeBase */](): Builder[OptionType] = {
    val __props = js.Dynamic.literal()
    new Builder[OptionType](js.Array(this.component, __props.asInstanceOf[Props[OptionType]]))
  }
  
  implicit def make[OptionType /* <: OptionTypeBase */](companion: Creatable.type): Builder[OptionType] = new Builder[OptionType](js.Array(this.component, js.Dictionary.empty))()
}
