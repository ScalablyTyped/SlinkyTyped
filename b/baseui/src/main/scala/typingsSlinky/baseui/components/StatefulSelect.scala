package typingsSlinky.baseui.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.EventTarget
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.HTMLInputElement
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.SyntheticEvent
import slinky.core.TagMod
import slinky.web.SyntheticFocusEvent
import slinky.web.html.input.tag
import typingsSlinky.baseui.AnonLabelKey
import typingsSlinky.baseui.AnonOption
import typingsSlinky.baseui.AnonOptionOption
import typingsSlinky.baseui.baseuiStrings.compact
import typingsSlinky.baseui.baseuiStrings.default_
import typingsSlinky.baseui.baseuiStrings.large_
import typingsSlinky.baseui.baseuiStrings.search
import typingsSlinky.baseui.baseuiStrings.select
import typingsSlinky.baseui.selectMod.OnChangeParams
import typingsSlinky.baseui.selectMod.OptionsT
import typingsSlinky.baseui.selectMod.SelectOverrides
import typingsSlinky.baseui.selectMod.State
import typingsSlinky.baseui.selectMod.StatefulSelectProps
import typingsSlinky.baseui.selectMod.Value
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object StatefulSelect
  extends ExternalComponentWithAttributesWithRefType[tag.type, js.Object] {
  @JSImport("baseui/select", "StatefulSelect")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: autoFocus, disabled, id, required */
  def apply(
    `aria-describedby`: String = null,
    `aria-label`: String = null,
    `aria-labelledby`: String = null,
    backspaceRemoves: js.UndefOr[Boolean] = js.undefined,
    clearable: js.UndefOr[Boolean] = js.undefined,
    closeOnSelect: js.UndefOr[Boolean] = js.undefined,
    creatable: js.UndefOr[Boolean] = js.undefined,
    deleteRemoves: js.UndefOr[Boolean] = js.undefined,
    error: js.UndefOr[Boolean] = js.undefined,
    escapeClearsValue: js.UndefOr[Boolean] = js.undefined,
    filterOptions: (/* options */ Value, /* filterValue */ String, /* excludeOptions */ js.UndefOr[Value], /* newProps */ js.UndefOr[AnonLabelKey]) => Value = null,
    filterOutSelected: js.UndefOr[Boolean] = js.undefined,
    getOptionLabel: /* args */ AnonOption => TagMod[Any] = null,
    getValueLabel: /* args */ AnonOptionOption => TagMod[Any] = null,
    initialState: State = null,
    isLoading: js.UndefOr[Boolean] = js.undefined,
    labelKey: String = null,
    maxDropdownHeight: String = null,
    mountNode: HTMLElement = null,
    multi: js.UndefOr[Boolean] = js.undefined,
    noResultsMsg: TagMod[Any] = null,
    onBlur: /* e */ Event_ => _ = null,
    onBlurResetsInput: js.UndefOr[Boolean] = js.undefined,
    onChange: /* params */ OnChangeParams => _ = null,
    onClose: () => _ = null,
    onCloseResetsInput: js.UndefOr[Boolean] = js.undefined,
    onFocus: SyntheticFocusEvent[HTMLElement] => Unit = null,
    onInputChange: SyntheticEvent[EventTarget with HTMLInputElement, Event_] => Unit = null,
    onOpen: () => _ = null,
    onSelectResetsInput: js.UndefOr[Boolean] = js.undefined,
    openOnClick: js.UndefOr[Boolean] = js.undefined,
    options: OptionsT = null,
    overrides: SelectOverrides = null,
    placeholder: TagMod[Any] = null,
    positive: js.UndefOr[Boolean] = js.undefined,
    searchable: js.UndefOr[Boolean] = js.undefined,
    size: default_ | compact | large_ = null,
    startOpen: js.UndefOr[Boolean] = js.undefined,
    stateReducer: (/* stateType */ String, /* nextState */ State, /* currentState */ State) => State = null,
    `type`: select | search = null,
    value: Value = null,
    valueKey: String = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, js.Object] = {
    val __obj = js.Dynamic.literal()
    if (`aria-describedby` != null) __obj.updateDynamic("aria-describedby")(`aria-describedby`.asInstanceOf[js.Any])
    if (`aria-label` != null) __obj.updateDynamic("aria-label")(`aria-label`.asInstanceOf[js.Any])
    if (`aria-labelledby` != null) __obj.updateDynamic("aria-labelledby")(`aria-labelledby`.asInstanceOf[js.Any])
    if (!js.isUndefined(backspaceRemoves)) __obj.updateDynamic("backspaceRemoves")(backspaceRemoves.asInstanceOf[js.Any])
    if (!js.isUndefined(clearable)) __obj.updateDynamic("clearable")(clearable.asInstanceOf[js.Any])
    if (!js.isUndefined(closeOnSelect)) __obj.updateDynamic("closeOnSelect")(closeOnSelect.asInstanceOf[js.Any])
    if (!js.isUndefined(creatable)) __obj.updateDynamic("creatable")(creatable.asInstanceOf[js.Any])
    if (!js.isUndefined(deleteRemoves)) __obj.updateDynamic("deleteRemoves")(deleteRemoves.asInstanceOf[js.Any])
    if (!js.isUndefined(error)) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (!js.isUndefined(escapeClearsValue)) __obj.updateDynamic("escapeClearsValue")(escapeClearsValue.asInstanceOf[js.Any])
    if (filterOptions != null) __obj.updateDynamic("filterOptions")(js.Any.fromFunction4(filterOptions))
    if (!js.isUndefined(filterOutSelected)) __obj.updateDynamic("filterOutSelected")(filterOutSelected.asInstanceOf[js.Any])
    if (getOptionLabel != null) __obj.updateDynamic("getOptionLabel")(js.Any.fromFunction1(getOptionLabel))
    if (getValueLabel != null) __obj.updateDynamic("getValueLabel")(js.Any.fromFunction1(getValueLabel))
    if (initialState != null) __obj.updateDynamic("initialState")(initialState.asInstanceOf[js.Any])
    if (!js.isUndefined(isLoading)) __obj.updateDynamic("isLoading")(isLoading.asInstanceOf[js.Any])
    if (labelKey != null) __obj.updateDynamic("labelKey")(labelKey.asInstanceOf[js.Any])
    if (maxDropdownHeight != null) __obj.updateDynamic("maxDropdownHeight")(maxDropdownHeight.asInstanceOf[js.Any])
    if (mountNode != null) __obj.updateDynamic("mountNode")(mountNode.asInstanceOf[js.Any])
    if (!js.isUndefined(multi)) __obj.updateDynamic("multi")(multi.asInstanceOf[js.Any])
    if (noResultsMsg != null) __obj.updateDynamic("noResultsMsg")(noResultsMsg.asInstanceOf[js.Any])
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1(onBlur))
    if (!js.isUndefined(onBlurResetsInput)) __obj.updateDynamic("onBlurResetsInput")(onBlurResetsInput.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction0(onClose))
    if (!js.isUndefined(onCloseResetsInput)) __obj.updateDynamic("onCloseResetsInput")(onCloseResetsInput.asInstanceOf[js.Any])
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1(onFocus))
    if (onInputChange != null) __obj.updateDynamic("onInputChange")(js.Any.fromFunction1(onInputChange))
    if (onOpen != null) __obj.updateDynamic("onOpen")(js.Any.fromFunction0(onOpen))
    if (!js.isUndefined(onSelectResetsInput)) __obj.updateDynamic("onSelectResetsInput")(onSelectResetsInput.asInstanceOf[js.Any])
    if (!js.isUndefined(openOnClick)) __obj.updateDynamic("openOnClick")(openOnClick.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (!js.isUndefined(positive)) __obj.updateDynamic("positive")(positive.asInstanceOf[js.Any])
    if (!js.isUndefined(searchable)) __obj.updateDynamic("searchable")(searchable.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (!js.isUndefined(startOpen)) __obj.updateDynamic("startOpen")(startOpen.asInstanceOf[js.Any])
    if (stateReducer != null) __obj.updateDynamic("stateReducer")(js.Any.fromFunction3(stateReducer))
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (valueKey != null) __obj.updateDynamic("valueKey")(valueKey.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, js.Object] = new slinky.core.BuildingComponent[slinky.web.html.input.tag.type, js.Object](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = StatefulSelectProps
}

