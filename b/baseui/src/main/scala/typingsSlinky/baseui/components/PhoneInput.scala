package typingsSlinky.baseui.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.HTMLInputElement
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.SyntheticEvent
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.baseui.baseuiStrings.compact
import typingsSlinky.baseui.baseuiStrings.default_
import typingsSlinky.baseui.baseuiStrings.large_
import typingsSlinky.baseui.phoneDashInputMod.Country
import typingsSlinky.baseui.phoneDashInputMod.PhoneInputOverrides
import typingsSlinky.baseui.phoneDashInputMod.PhoneInputProps
import typingsSlinky.baseui.selectMod.OnChangeParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object PhoneInput
  extends ExternalComponentWithAttributesWithRefType[tag.type, js.Object] {
  @JSImport("baseui/phone-input", "PhoneInput")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    `aria-label`: String = null,
    country: Country = null,
    mapIsoToLabel: /* iso */ String => String = null,
    maxDropdownHeight: String = null,
    maxDropdownWidth: String = null,
    onCountryChange: /* event */ OnChangeParams => _ = null,
    onTextChange: /* event */ SyntheticEvent[Event, HTMLInputElement] => _ = null,
    overrides: PhoneInputOverrides = null,
    size: default_ | compact | large_ = null,
    text: String = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, js.Object] = {
    val __obj = js.Dynamic.literal()
    if (`aria-label` != null) __obj.updateDynamic("aria-label")(`aria-label`.asInstanceOf[js.Any])
    if (country != null) __obj.updateDynamic("country")(country.asInstanceOf[js.Any])
    if (mapIsoToLabel != null) __obj.updateDynamic("mapIsoToLabel")(js.Any.fromFunction1(mapIsoToLabel))
    if (maxDropdownHeight != null) __obj.updateDynamic("maxDropdownHeight")(maxDropdownHeight.asInstanceOf[js.Any])
    if (maxDropdownWidth != null) __obj.updateDynamic("maxDropdownWidth")(maxDropdownWidth.asInstanceOf[js.Any])
    if (onCountryChange != null) __obj.updateDynamic("onCountryChange")(js.Any.fromFunction1(onCountryChange))
    if (onTextChange != null) __obj.updateDynamic("onTextChange")(js.Any.fromFunction1(onTextChange))
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, js.Object] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, js.Object](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = PhoneInputProps
}

