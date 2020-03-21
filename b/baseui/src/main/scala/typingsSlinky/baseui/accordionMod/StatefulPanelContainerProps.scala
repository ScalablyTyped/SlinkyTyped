package typingsSlinky.baseui.accordionMod

import slinky.core.TagMod
import typingsSlinky.baseui.AnonExpandedBoolean
import typingsSlinky.baseui.baseuiStrings.expand
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined baseui.baseui/accordion.SharedStatefulPanelContainerProps & {  children  :react.react.ReactNode} */
trait StatefulPanelContainerProps extends js.Object {
  var children: TagMod[Any]
  var initialState: js.UndefOr[PanelState] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* args */ AnonExpandedBoolean, _]] = js.undefined
  var stateReducer: js.UndefOr[StateReducer[PanelState]] = js.undefined
}

object StatefulPanelContainerProps {
  @scala.inline
  def apply(
    children: TagMod[Any],
    initialState: PanelState = null,
    onChange: /* args */ AnonExpandedBoolean => _ = null,
    stateReducer: (expand, PanelState, PanelState) => PanelState = null
  ): StatefulPanelContainerProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    if (initialState != null) __obj.updateDynamic("initialState")(initialState.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (stateReducer != null) __obj.updateDynamic("stateReducer")(js.Any.fromFunction3(stateReducer))
    __obj.asInstanceOf[StatefulPanelContainerProps]
  }
}

