package typingsSlinky.baseui.phoneInputMod

import org.scalajs.dom.raw.HTMLInputElement
import slinky.core.SyntheticEvent
import slinky.core.TagMod
import typingsSlinky.baseui.selectMod.OnChangeParams
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StatefulPhoneInputContainerProps extends js.Object {
  var `aria-label`: js.UndefOr[String] = js.undefined
  var children: js.UndefOr[TagMod[Any]] = js.undefined
  var initialState: js.UndefOr[State] = js.undefined
  var mapIsoToLabel: js.UndefOr[js.Function1[/* iso */ String, String]] = js.undefined
  var onCountryChange: js.UndefOr[js.Function1[/* event */ OnChangeParams, _]] = js.undefined
  var onTextChange: js.UndefOr[js.Function1[/* event */ SyntheticEvent[Event_, HTMLInputElement], _]] = js.undefined
  var overrides: js.UndefOr[PhoneInputOverrides] = js.undefined
  var stateReducer: js.UndefOr[StateReducer] = js.undefined
}

object StatefulPhoneInputContainerProps {
  @scala.inline
  def apply(
    `aria-label`: String = null,
    children: TagMod[Any] = null,
    initialState: State = null,
    mapIsoToLabel: /* iso */ String => String = null,
    onCountryChange: /* event */ OnChangeParams => _ = null,
    onTextChange: /* event */ SyntheticEvent[Event_, HTMLInputElement] => _ = null,
    overrides: PhoneInputOverrides = null,
    stateReducer: (/* type */ StateChange, /* nextState */ State, /* currentState */ State) => State = null
  ): StatefulPhoneInputContainerProps = {
    val __obj = js.Dynamic.literal()
    if (`aria-label` != null) __obj.updateDynamic("aria-label")(`aria-label`.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (initialState != null) __obj.updateDynamic("initialState")(initialState.asInstanceOf[js.Any])
    if (mapIsoToLabel != null) __obj.updateDynamic("mapIsoToLabel")(js.Any.fromFunction1(mapIsoToLabel))
    if (onCountryChange != null) __obj.updateDynamic("onCountryChange")(js.Any.fromFunction1(onCountryChange))
    if (onTextChange != null) __obj.updateDynamic("onTextChange")(js.Any.fromFunction1(onTextChange))
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    if (stateReducer != null) __obj.updateDynamic("stateReducer")(js.Any.fromFunction3(stateReducer))
    __obj.asInstanceOf[StatefulPhoneInputContainerProps]
  }
}

