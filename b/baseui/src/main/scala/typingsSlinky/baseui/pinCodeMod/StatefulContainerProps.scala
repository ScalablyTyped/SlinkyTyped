package typingsSlinky.baseui.pinCodeMod

import slinky.core.TagMod
import typingsSlinky.baseui.anon.Values
import typingsSlinky.baseui.baseuiStrings.change_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StatefulContainerProps extends js.Object {
  var children: js.UndefOr[TagMod[Any]] = js.undefined
  var initialState: js.UndefOr[State] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* args */ Values, Unit]] = js.undefined
  var stateReducer: js.UndefOr[js.Function3[change_, /* nextState */ State, /* currentState */ State, State]] = js.undefined
}

object StatefulContainerProps {
  @scala.inline
  def apply(
    children: TagMod[Any] = null,
    initialState: State = null,
    onChange: /* args */ Values => Unit = null,
    stateReducer: (change_, /* nextState */ State, /* currentState */ State) => State = null
  ): StatefulContainerProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (initialState != null) __obj.updateDynamic("initialState")(initialState.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (stateReducer != null) __obj.updateDynamic("stateReducer")(js.Any.fromFunction3(stateReducer))
    __obj.asInstanceOf[StatefulContainerProps]
  }
}

