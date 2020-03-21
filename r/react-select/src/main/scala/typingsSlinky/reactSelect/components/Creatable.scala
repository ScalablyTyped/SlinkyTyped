package typingsSlinky.reactSelect.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.SyntheticEvent
import slinky.core.TagMod
import slinky.web.SyntheticFocusEvent
import slinky.web.SyntheticKeyboardEvent
import slinky.web.html.`*`.tag
import typingsSlinky.reactSelect.AnonCount
import typingsSlinky.reactSelect.AnonInputValue
import typingsSlinky.reactSelect.componentsMod.SelectComponentsConfig
import typingsSlinky.reactSelect.creatableMod.default
import typingsSlinky.reactSelect.reactSelectStrings.first
import typingsSlinky.reactSelect.reactSelectStrings.last
import typingsSlinky.reactSelect.selectMod.FormatOptionLabelMeta
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
import typingsSlinky.reactSelect.typesMod.ValueType
import typingsSlinky.std.EventListener
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Creatable
  extends ExternalComponentWithAttributesWithRefType[tag.type, default[js.Any]] {
  @JSImport("react-select/creatable", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: autoFocus, className, id, name */
  def apply[OptionType /* <: OptionTypeBase */](
    allowCreateWhileLoading: js.UndefOr[Boolean] = js.undefined,
    `aria-label`: String = null,
    `aria-labelledby`: String = null,
    backspaceRemovesValue: js.UndefOr[Boolean] = js.undefined,
    blurInputOnSelect: js.UndefOr[Boolean] = js.undefined,
    captureMenuScroll: js.UndefOr[Boolean] = js.undefined,
    classNamePrefix: String = null,
    closeMenuOnScroll: Boolean | EventListener = null,
    closeMenuOnSelect: js.UndefOr[Boolean] = js.undefined,
    components: SelectComponentsConfig[OptionType] = null,
    controlShouldRenderValue: js.UndefOr[Boolean] = js.undefined,
    createOptionPosition: first | last = null,
    defaultInputValue: String = null,
    defaultMenuIsOpen: js.UndefOr[Boolean] = js.undefined,
    defaultValue: ValueType[OptionType] = null,
    delimiter: String = null,
    escapeClearsValue: js.UndefOr[Boolean] = js.undefined,
    filterOption: (/* option */ typingsSlinky.reactSelect.filtersMod.Option, /* rawInput */ String) => Boolean = null,
    formatCreateLabel: /* inputValue */ String => TagMod[Any] = null,
    formatGroupLabel: /* group */ GroupType[OptionType] => TagMod[Any] = null,
    formatOptionLabel: (OptionType, /* labelMeta */ FormatOptionLabelMeta[OptionType]) => TagMod[Any] = null,
    getNewOptionData: (/* inputValue */ String, /* optionLabel */ TagMod[Any]) => OptionType = null,
    getOptionLabel: OptionType => String = null,
    getOptionValue: OptionType => String = null,
    hideSelectedOptions: js.UndefOr[Boolean] = js.undefined,
    inputId: String = null,
    inputValue: String = null,
    instanceId: Double | String = null,
    isClearable: js.UndefOr[Boolean] = js.undefined,
    isDisabled: js.UndefOr[Boolean] = js.undefined,
    isLoading: js.UndefOr[Boolean] = js.undefined,
    isMulti: js.UndefOr[Boolean] = js.undefined,
    isOptionDisabled: (OptionType, /* options */ OptionsType[OptionType]) => Boolean = null,
    isOptionSelected: (OptionType, /* options */ OptionsType[OptionType]) => Boolean = null,
    isRtl: js.UndefOr[Boolean] = js.undefined,
    isSearchable: js.UndefOr[Boolean] = js.undefined,
    isValidNewOption: (/* inputValue */ String, /* value */ ValueType[OptionType], /* options */ OptionsType[OptionType]) => Boolean = null,
    loadingMessage: /* obj */ AnonInputValue => String | Null = null,
    maxMenuHeight: Int | Double = null,
    menuIsOpen: js.UndefOr[Boolean] = js.undefined,
    menuPlacement: MenuPlacement = null,
    menuPortalTarget: HTMLElement = null,
    menuPosition: MenuPosition = null,
    menuShouldBlockScroll: js.UndefOr[Boolean] = js.undefined,
    menuShouldScrollIntoView: js.UndefOr[Boolean] = js.undefined,
    minMenuHeight: Int | Double = null,
    noOptionsMessage: /* obj */ AnonInputValue => String | Null = null,
    onBlur: /* event */ SyntheticFocusEvent[HTMLElement] => Unit = null,
    onChange: (/* value */ ValueType[OptionType], /* action */ ActionMeta) => Unit = null,
    onCreateOption: /* inputValue */ String => Unit = null,
    onFocus: /* event */ SyntheticFocusEvent[HTMLElement] => Unit = null,
    onInputChange: (/* newValue */ String, /* actionMeta */ InputActionMeta) => Unit = null,
    onKeyDown: /* event */ SyntheticKeyboardEvent[HTMLElement] => Unit = null,
    onMenuClose: () => Unit = null,
    onMenuOpen: () => Unit = null,
    onMenuScrollToBottom: /* event */ SyntheticEvent[Event_, HTMLElement] => Unit = null,
    onMenuScrollToTop: /* event */ SyntheticEvent[Event_, HTMLElement] => Unit = null,
    openMenuOnClick: js.UndefOr[Boolean] = js.undefined,
    openMenuOnFocus: js.UndefOr[Boolean] = js.undefined,
    options: GroupedOptionsType[OptionType] | OptionsType[OptionType] = null,
    pageSize: Int | Double = null,
    placeholder: TagMod[Any] = null,
    screenReaderStatus: /* obj */ AnonCount => String = null,
    styles: StylesConfig = null,
    tabIndex: String = null,
    tabSelectsValue: js.UndefOr[Boolean] = js.undefined,
    theme: ThemeConfig = null,
    value: ValueType[OptionType] = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default[js.Any]] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowCreateWhileLoading)) __obj.updateDynamic("allowCreateWhileLoading")(allowCreateWhileLoading.asInstanceOf[js.Any])
    if (`aria-label` != null) __obj.updateDynamic("aria-label")(`aria-label`.asInstanceOf[js.Any])
    if (`aria-labelledby` != null) __obj.updateDynamic("aria-labelledby")(`aria-labelledby`.asInstanceOf[js.Any])
    if (!js.isUndefined(backspaceRemovesValue)) __obj.updateDynamic("backspaceRemovesValue")(backspaceRemovesValue.asInstanceOf[js.Any])
    if (!js.isUndefined(blurInputOnSelect)) __obj.updateDynamic("blurInputOnSelect")(blurInputOnSelect.asInstanceOf[js.Any])
    if (!js.isUndefined(captureMenuScroll)) __obj.updateDynamic("captureMenuScroll")(captureMenuScroll.asInstanceOf[js.Any])
    if (classNamePrefix != null) __obj.updateDynamic("classNamePrefix")(classNamePrefix.asInstanceOf[js.Any])
    if (closeMenuOnScroll != null) __obj.updateDynamic("closeMenuOnScroll")(closeMenuOnScroll.asInstanceOf[js.Any])
    if (!js.isUndefined(closeMenuOnSelect)) __obj.updateDynamic("closeMenuOnSelect")(closeMenuOnSelect.asInstanceOf[js.Any])
    if (components != null) __obj.updateDynamic("components")(components.asInstanceOf[js.Any])
    if (!js.isUndefined(controlShouldRenderValue)) __obj.updateDynamic("controlShouldRenderValue")(controlShouldRenderValue.asInstanceOf[js.Any])
    if (createOptionPosition != null) __obj.updateDynamic("createOptionPosition")(createOptionPosition.asInstanceOf[js.Any])
    if (defaultInputValue != null) __obj.updateDynamic("defaultInputValue")(defaultInputValue.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultMenuIsOpen)) __obj.updateDynamic("defaultMenuIsOpen")(defaultMenuIsOpen.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (delimiter != null) __obj.updateDynamic("delimiter")(delimiter.asInstanceOf[js.Any])
    if (!js.isUndefined(escapeClearsValue)) __obj.updateDynamic("escapeClearsValue")(escapeClearsValue.asInstanceOf[js.Any])
    if (filterOption != null) __obj.updateDynamic("filterOption")(js.Any.fromFunction2(filterOption))
    if (formatCreateLabel != null) __obj.updateDynamic("formatCreateLabel")(js.Any.fromFunction1(formatCreateLabel))
    if (formatGroupLabel != null) __obj.updateDynamic("formatGroupLabel")(js.Any.fromFunction1(formatGroupLabel))
    if (formatOptionLabel != null) __obj.updateDynamic("formatOptionLabel")(js.Any.fromFunction2(formatOptionLabel))
    if (getNewOptionData != null) __obj.updateDynamic("getNewOptionData")(js.Any.fromFunction2(getNewOptionData))
    if (getOptionLabel != null) __obj.updateDynamic("getOptionLabel")(js.Any.fromFunction1(getOptionLabel))
    if (getOptionValue != null) __obj.updateDynamic("getOptionValue")(js.Any.fromFunction1(getOptionValue))
    if (!js.isUndefined(hideSelectedOptions)) __obj.updateDynamic("hideSelectedOptions")(hideSelectedOptions.asInstanceOf[js.Any])
    if (inputId != null) __obj.updateDynamic("inputId")(inputId.asInstanceOf[js.Any])
    if (inputValue != null) __obj.updateDynamic("inputValue")(inputValue.asInstanceOf[js.Any])
    if (instanceId != null) __obj.updateDynamic("instanceId")(instanceId.asInstanceOf[js.Any])
    if (!js.isUndefined(isClearable)) __obj.updateDynamic("isClearable")(isClearable.asInstanceOf[js.Any])
    if (!js.isUndefined(isDisabled)) __obj.updateDynamic("isDisabled")(isDisabled.asInstanceOf[js.Any])
    if (!js.isUndefined(isLoading)) __obj.updateDynamic("isLoading")(isLoading.asInstanceOf[js.Any])
    if (!js.isUndefined(isMulti)) __obj.updateDynamic("isMulti")(isMulti.asInstanceOf[js.Any])
    if (isOptionDisabled != null) __obj.updateDynamic("isOptionDisabled")(js.Any.fromFunction2(isOptionDisabled))
    if (isOptionSelected != null) __obj.updateDynamic("isOptionSelected")(js.Any.fromFunction2(isOptionSelected))
    if (!js.isUndefined(isRtl)) __obj.updateDynamic("isRtl")(isRtl.asInstanceOf[js.Any])
    if (!js.isUndefined(isSearchable)) __obj.updateDynamic("isSearchable")(isSearchable.asInstanceOf[js.Any])
    if (isValidNewOption != null) __obj.updateDynamic("isValidNewOption")(js.Any.fromFunction3(isValidNewOption))
    if (loadingMessage != null) __obj.updateDynamic("loadingMessage")(js.Any.fromFunction1(loadingMessage))
    if (maxMenuHeight != null) __obj.updateDynamic("maxMenuHeight")(maxMenuHeight.asInstanceOf[js.Any])
    if (!js.isUndefined(menuIsOpen)) __obj.updateDynamic("menuIsOpen")(menuIsOpen.asInstanceOf[js.Any])
    if (menuPlacement != null) __obj.updateDynamic("menuPlacement")(menuPlacement.asInstanceOf[js.Any])
    if (menuPortalTarget != null) __obj.updateDynamic("menuPortalTarget")(menuPortalTarget.asInstanceOf[js.Any])
    if (menuPosition != null) __obj.updateDynamic("menuPosition")(menuPosition.asInstanceOf[js.Any])
    if (!js.isUndefined(menuShouldBlockScroll)) __obj.updateDynamic("menuShouldBlockScroll")(menuShouldBlockScroll.asInstanceOf[js.Any])
    if (!js.isUndefined(menuShouldScrollIntoView)) __obj.updateDynamic("menuShouldScrollIntoView")(menuShouldScrollIntoView.asInstanceOf[js.Any])
    if (minMenuHeight != null) __obj.updateDynamic("minMenuHeight")(minMenuHeight.asInstanceOf[js.Any])
    if (noOptionsMessage != null) __obj.updateDynamic("noOptionsMessage")(js.Any.fromFunction1(noOptionsMessage))
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1(onBlur))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2(onChange))
    if (onCreateOption != null) __obj.updateDynamic("onCreateOption")(js.Any.fromFunction1(onCreateOption))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1(onFocus))
    if (onInputChange != null) __obj.updateDynamic("onInputChange")(js.Any.fromFunction2(onInputChange))
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(js.Any.fromFunction1(onKeyDown))
    if (onMenuClose != null) __obj.updateDynamic("onMenuClose")(js.Any.fromFunction0(onMenuClose))
    if (onMenuOpen != null) __obj.updateDynamic("onMenuOpen")(js.Any.fromFunction0(onMenuOpen))
    if (onMenuScrollToBottom != null) __obj.updateDynamic("onMenuScrollToBottom")(js.Any.fromFunction1(onMenuScrollToBottom))
    if (onMenuScrollToTop != null) __obj.updateDynamic("onMenuScrollToTop")(js.Any.fromFunction1(onMenuScrollToTop))
    if (!js.isUndefined(openMenuOnClick)) __obj.updateDynamic("openMenuOnClick")(openMenuOnClick.asInstanceOf[js.Any])
    if (!js.isUndefined(openMenuOnFocus)) __obj.updateDynamic("openMenuOnFocus")(openMenuOnFocus.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (pageSize != null) __obj.updateDynamic("pageSize")(pageSize.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (screenReaderStatus != null) __obj.updateDynamic("screenReaderStatus")(js.Any.fromFunction1(screenReaderStatus))
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(tabSelectsValue)) __obj.updateDynamic("tabSelectsValue")(tabSelectsValue.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props]).asInstanceOf[slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.reactSelect.creatableMod.default[js.Any]]]
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, default[js.Any]] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.reactSelect.creatableMod.default[js.Any]](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = typingsSlinky.reactSelect.srcCreatableMod.Props[js.Any]
}

