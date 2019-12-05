package typingsSlinky.baseui.paginationMod

import slinky.core.TagMod
import typingsSlinky.baseui.Anon_NextPage
import typingsSlinky.baseui.baseuiStrings.change_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StatefulContainerProps extends js.Object {
  var children: TagMod[Any]
  var initialState: js.UndefOr[State] = js.undefined
  var numPages: Double
  var onPageChange: js.UndefOr[js.Function1[/* args */ Anon_NextPage, _]] = js.undefined
  var stateReducer: js.UndefOr[StateReducer] = js.undefined
}

object StatefulContainerProps {
  @scala.inline
  def apply(
    children: TagMod[Any],
    numPages: Double,
    initialState: State = null,
    onPageChange: /* args */ Anon_NextPage => _ = null,
    stateReducer: (change_, /* changes */ State, /* currentState */ State) => State = null
  ): StatefulContainerProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], numPages = numPages.asInstanceOf[js.Any])
    if (initialState != null) __obj.updateDynamic("initialState")(initialState.asInstanceOf[js.Any])
    if (onPageChange != null) __obj.updateDynamic("onPageChange")(js.Any.fromFunction1(onPageChange))
    if (stateReducer != null) __obj.updateDynamic("stateReducer")(js.Any.fromFunction3(stateReducer))
    __obj.asInstanceOf[StatefulContainerProps]
  }
}

