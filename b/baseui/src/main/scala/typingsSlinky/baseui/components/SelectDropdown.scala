package typingsSlinky.baseui.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.baseui.Anon_EventItem
import typingsSlinky.baseui.Anon_OptionOptionState
import typingsSlinky.baseui.baseuiStrings.compact
import typingsSlinky.baseui.baseuiStrings.default_
import typingsSlinky.baseui.baseuiStrings.large_
import typingsSlinky.baseui.baseuiStrings.search
import typingsSlinky.baseui.baseuiStrings.select
import typingsSlinky.baseui.selectMod.DropdownOverrides
import typingsSlinky.baseui.selectMod.DropdownProps
import typingsSlinky.baseui.selectMod.Value
import typingsSlinky.react.reactMod.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object SelectDropdown
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.baseui.selectMod.SelectDropdown] {
  @JSImport("baseui/select", "SelectDropdown")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: required */
  def apply(
    error: js.UndefOr[Boolean] = js.undefined,
    getOptionLabel: /* args */ Anon_OptionOptionState => TagMod[Any] = null,
    innerRef: Ref[_] = null,
    isLoading: js.UndefOr[Boolean] = js.undefined,
    labelKey: String = null,
    maxDropdownHeight: String = null,
    multi: js.UndefOr[Boolean] = js.undefined,
    noResultsMsg: TagMod[Any] = null,
    onItemSelect: /* args */ Anon_EventItem => js.Any = null,
    options: Value = null,
    overrides: DropdownOverrides = null,
    searchable: js.UndefOr[Boolean] = js.undefined,
    size: default_ | compact | large_ = null,
    `type`: select | search = null,
    value: Value = null,
    valueKey: String = null,
    width: Int | Double = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.baseui.selectMod.SelectDropdown] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(error)) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (getOptionLabel != null) __obj.updateDynamic("getOptionLabel")(js.Any.fromFunction1(getOptionLabel))
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (!js.isUndefined(isLoading)) __obj.updateDynamic("isLoading")(isLoading.asInstanceOf[js.Any])
    if (labelKey != null) __obj.updateDynamic("labelKey")(labelKey.asInstanceOf[js.Any])
    if (maxDropdownHeight != null) __obj.updateDynamic("maxDropdownHeight")(maxDropdownHeight.asInstanceOf[js.Any])
    if (!js.isUndefined(multi)) __obj.updateDynamic("multi")(multi.asInstanceOf[js.Any])
    if (noResultsMsg != null) __obj.updateDynamic("noResultsMsg")(noResultsMsg.asInstanceOf[js.Any])
    if (onItemSelect != null) __obj.updateDynamic("onItemSelect")(js.Any.fromFunction1(onItemSelect))
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    if (!js.isUndefined(searchable)) __obj.updateDynamic("searchable")(searchable.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (valueKey != null) __obj.updateDynamic("valueKey")(valueKey.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.baseui.selectMod.SelectDropdown] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.baseui.selectMod.SelectDropdown](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = DropdownProps
}

