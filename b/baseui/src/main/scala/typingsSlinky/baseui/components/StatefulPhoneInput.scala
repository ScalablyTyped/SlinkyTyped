package typingsSlinky.baseui.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.HTMLInputElement
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.SyntheticEvent
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.baseui.phoneDashInputMod.PhoneInputOverrides
import typingsSlinky.baseui.phoneDashInputMod.State
import typingsSlinky.baseui.phoneDashInputMod.StateChange
import typingsSlinky.baseui.phoneDashInputMod.StatefulPhoneInputProps
import typingsSlinky.baseui.selectMod.OnChangeParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object StatefulPhoneInput
  extends ExternalComponentWithAttributesWithRefType[tag.type, js.Object] {
  @JSImport("baseui/phone-input", "StatefulPhoneInput")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    `aria-label`: String = null,
    initialState: State = null,
    mapIsoToLabel: /* iso */ String => String = null,
    onCountryChange: /* event */ OnChangeParams => _ = null,
    onTextChange: /* event */ SyntheticEvent[Event, HTMLInputElement] => _ = null,
    overrides: PhoneInputOverrides = null,
    stateReducer: (/* type */ StateChange, /* nextState */ State, /* currentState */ State) => State = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, js.Object] = {
    val __obj = js.Dynamic.literal()
    if (`aria-label` != null) __obj.updateDynamic("aria-label")(`aria-label`.asInstanceOf[js.Any])
    if (initialState != null) __obj.updateDynamic("initialState")(initialState.asInstanceOf[js.Any])
    if (mapIsoToLabel != null) __obj.updateDynamic("mapIsoToLabel")(js.Any.fromFunction1(mapIsoToLabel))
    if (onCountryChange != null) __obj.updateDynamic("onCountryChange")(js.Any.fromFunction1(onCountryChange))
    if (onTextChange != null) __obj.updateDynamic("onTextChange")(js.Any.fromFunction1(onTextChange))
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    if (stateReducer != null) __obj.updateDynamic("stateReducer")(js.Any.fromFunction3(stateReducer))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, js.Object] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, js.Object](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = StatefulPhoneInputProps
}

