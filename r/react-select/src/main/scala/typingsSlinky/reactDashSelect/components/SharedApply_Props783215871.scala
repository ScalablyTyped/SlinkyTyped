package typingsSlinky.reactDashSelect.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.HTMLElement
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ExternalPropsWriterProvider
import slinky.core.SyntheticEvent
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashSelect.Anon_Count
import typingsSlinky.reactDashSelect.Anon_InputValue
import typingsSlinky.reactDashSelect.srcComponentsMod.SelectComponentsConfig
import typingsSlinky.reactDashSelect.srcSelectMod.FormatOptionLabelMeta
import typingsSlinky.reactDashSelect.srcStylesMod.StylesConfig
import typingsSlinky.reactDashSelect.srcThemeMod.ThemeConfig
import typingsSlinky.reactDashSelect.srcTypesMod.ActionMeta
import typingsSlinky.reactDashSelect.srcTypesMod.GroupType
import typingsSlinky.reactDashSelect.srcTypesMod.GroupedOptionsType
import typingsSlinky.reactDashSelect.srcTypesMod.InputActionMeta
import typingsSlinky.reactDashSelect.srcTypesMod.MenuPlacement
import typingsSlinky.reactDashSelect.srcTypesMod.MenuPosition
import typingsSlinky.reactDashSelect.srcTypesMod.OptionTypeBase
import typingsSlinky.reactDashSelect.srcTypesMod.OptionsType
import typingsSlinky.reactDashSelect.srcTypesMod.ValueType
import typingsSlinky.std.EventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

abstract class SharedApply_Props783215871[ComponentRef <: js.Object] (implicit pw: ExternalPropsWriterProvider)
  extends ExternalComponentWithAttributesWithRefType[tag.type, ComponentRef] {
  /* The following DOM/SVG props were specified: autoFocus, className, defaultValue, id, name, onBlur, onFocus, onKeyDown, value */
  def apply[OptionType /* <: OptionTypeBase */](
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
    defaultInputValue: String = null,
    defaultMenuIsOpen: js.UndefOr[Boolean] = js.undefined,
    delimiter: String = null,
    escapeClearsValue: js.UndefOr[Boolean] = js.undefined,
    filterOption: (/* option */ typingsSlinky.reactDashSelect.srcFiltersMod.Option, /* rawInput */ String) => Boolean = null,
    formatGroupLabel: /* group */ GroupType[OptionType] => TagMod[Any] = null,
    formatOptionLabel: (OptionType, /* labelMeta */ FormatOptionLabelMeta[OptionType]) => TagMod[Any] = null,
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
    loadingMessage: /* obj */ Anon_InputValue => String | Null = null,
    maxMenuHeight: Int | Double = null,
    menuIsOpen: js.UndefOr[Boolean] = js.undefined,
    menuPlacement: MenuPlacement = null,
    menuPortalTarget: HTMLElement = null,
    menuPosition: MenuPosition = null,
    menuShouldBlockScroll: js.UndefOr[Boolean] = js.undefined,
    menuShouldScrollIntoView: js.UndefOr[Boolean] = js.undefined,
    minMenuHeight: Int | Double = null,
    noOptionsMessage: /* obj */ Anon_InputValue => String | Null = null,
    onChange: (/* value */ ValueType[OptionType], /* action */ ActionMeta) => Unit = null,
    onInputChange: (/* newValue */ String, /* actionMeta */ InputActionMeta) => Unit = null,
    onMenuClose: () => Unit = null,
    onMenuOpen: () => Unit = null,
    onMenuScrollToBottom: /* event */ SyntheticEvent[Event, HTMLElement] => Unit = null,
    onMenuScrollToTop: /* event */ SyntheticEvent[Event, HTMLElement] => Unit = null,
    openMenuOnClick: js.UndefOr[Boolean] = js.undefined,
    openMenuOnFocus: js.UndefOr[Boolean] = js.undefined,
    options: GroupedOptionsType[OptionType] | OptionsType[OptionType] = null,
    pageSize: Int | Double = null,
    placeholder: TagMod[Any] = null,
    screenReaderStatus: /* obj */ Anon_Count => String = null,
    styles: StylesConfig = null,
    tabIndex: String = null,
    tabSelectsValue: js.UndefOr[Boolean] = js.undefined,
    theme: ThemeConfig = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, ComponentRef] = {
    val __obj = js.Dynamic.literal()
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
    if (defaultInputValue != null) __obj.updateDynamic("defaultInputValue")(defaultInputValue.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultMenuIsOpen)) __obj.updateDynamic("defaultMenuIsOpen")(defaultMenuIsOpen.asInstanceOf[js.Any])
    if (delimiter != null) __obj.updateDynamic("delimiter")(delimiter.asInstanceOf[js.Any])
    if (!js.isUndefined(escapeClearsValue)) __obj.updateDynamic("escapeClearsValue")(escapeClearsValue.asInstanceOf[js.Any])
    if (filterOption != null) __obj.updateDynamic("filterOption")(js.Any.fromFunction2(filterOption))
    if (formatGroupLabel != null) __obj.updateDynamic("formatGroupLabel")(js.Any.fromFunction1(formatGroupLabel))
    if (formatOptionLabel != null) __obj.updateDynamic("formatOptionLabel")(js.Any.fromFunction2(formatOptionLabel))
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
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2(onChange))
    if (onInputChange != null) __obj.updateDynamic("onInputChange")(js.Any.fromFunction2(onInputChange))
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
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props]).asInstanceOf[slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, ComponentRef]]
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, ComponentRef] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, ComponentRef](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = typingsSlinky.reactDashSelect.srcSelectMod.Props[js.Any]
}

