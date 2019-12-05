package typingsSlinky.baseui.datepickerMod

import slinky.core.TagMod
import typingsSlinky.baseui.Anon_Date
import typingsSlinky.baseui.baseuiStrings.change_
import typingsSlinky.baseui.baseuiStrings.mouseLeave
import typingsSlinky.baseui.baseuiStrings.mouseOver
import typingsSlinky.baseui.baseuiStrings.moveDown
import typingsSlinky.baseui.baseuiStrings.moveLeft
import typingsSlinky.baseui.baseuiStrings.moveRight
import typingsSlinky.baseui.baseuiStrings.moveUp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StatefulContainerProps[T] extends js.Object {
  var children: js.UndefOr[js.Function1[/* args */ T, TagMod[Any]]] = js.undefined
  var initialState: js.UndefOr[ContainerState] = js.undefined
  var onChange: js.UndefOr[typingsSlinky.baseui.datepickerMod.onChange] = js.undefined
  var range: js.UndefOr[Boolean] = js.undefined
  var stateReducer: js.UndefOr[StateReducer] = js.undefined
}

object StatefulContainerProps {
  @scala.inline
  def apply[T](
    children: /* args */ T => TagMod[Any] = null,
    initialState: ContainerState = null,
    onChange: /* args */ Anon_Date => js.Any = null,
    range: js.UndefOr[Boolean] = js.undefined,
    stateReducer: (/* stateType */ moveUp | mouseOver | moveLeft | moveRight | change_ | mouseLeave | moveDown, /* nextState */ ContainerState, /* currentState */ ContainerState) => ContainerState = null
  ): StatefulContainerProps[T] = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(js.Any.fromFunction1(children))
    if (initialState != null) __obj.updateDynamic("initialState")(initialState.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (!js.isUndefined(range)) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (stateReducer != null) __obj.updateDynamic("stateReducer")(js.Any.fromFunction3(stateReducer))
    __obj.asInstanceOf[StatefulContainerProps[T]]
  }
}

