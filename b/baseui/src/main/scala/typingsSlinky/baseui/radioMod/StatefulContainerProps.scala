package typingsSlinky.baseui.radioMod

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.HTMLInputElement
import slinky.core.SyntheticEvent
import slinky.core.TagMod
import typingsSlinky.react.reactMod.ChangeEvent
import typingsSlinky.react.reactMod.ChangeEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StatefulContainerProps extends js.Object {
  var autoFocus: js.UndefOr[Boolean] = js.undefined
  var children: js.UndefOr[TagMod[Any]] = js.undefined
  var initialState: js.UndefOr[State] = js.undefined
  var onChange: js.UndefOr[ChangeEventHandler[HTMLInputElement]] = js.undefined
  var overrides: js.UndefOr[RadioOverrides with RadioGroupOverrides] = js.undefined
  var stateReducer: StateReducer
}

object StatefulContainerProps {
  @scala.inline
  def apply(
    stateReducer: (/* stateType */ String, /* nextState */ State, /* currentState */ State, /* event */ SyntheticEvent[Event, HTMLInputElement]) => State,
    autoFocus: js.UndefOr[Boolean] = js.undefined,
    children: TagMod[Any] = null,
    initialState: State = null,
    onChange: ChangeEvent[HTMLInputElement] => Unit = null,
    overrides: RadioOverrides with RadioGroupOverrides = null
  ): StatefulContainerProps = {
    val __obj = js.Dynamic.literal(stateReducer = js.Any.fromFunction4(stateReducer))
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (initialState != null) __obj.updateDynamic("initialState")(initialState.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatefulContainerProps]
  }
}

