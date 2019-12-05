package typingsSlinky.baseui

import slinky.core.TagMod
import typingsSlinky.baseui.baseuiStrings.close
import typingsSlinky.baseui.baseuiStrings.open
import typingsSlinky.baseui.popoverMod.State
import typingsSlinky.baseui.popoverMod.StateReducer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ArgsChildren extends js.Object {
  var children: js.UndefOr[TagMod[Any]] = js.undefined
  var content: js.UndefOr[TagMod[Any] | (js.Function1[/* args */ Anon_Close, TagMod[Any]])] = js.undefined
  var dismissOnClickOutside: js.UndefOr[Boolean] = js.undefined
  var dismissOnEsc: js.UndefOr[Boolean] = js.undefined
  var initialState: js.UndefOr[State] = js.undefined
  var onClose: js.UndefOr[js.Function0[_]] = js.undefined
  var onOpen: js.UndefOr[js.Function0[_]] = js.undefined
  var stateReducer: js.UndefOr[StateReducer] = js.undefined
}

object Anon_ArgsChildren {
  @scala.inline
  def apply(
    children: TagMod[Any] = null,
    content: TagMod[Any] | (js.Function1[/* args */ Anon_Close, TagMod[Any]]) = null,
    dismissOnClickOutside: js.UndefOr[Boolean] = js.undefined,
    dismissOnEsc: js.UndefOr[Boolean] = js.undefined,
    initialState: State = null,
    onClose: () => _ = null,
    onOpen: () => _ = null,
    stateReducer: (/* stateChangeType */ open | close, /* nextState */ State, /* currentState */ State) => State = null
  ): Anon_ArgsChildren = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (!js.isUndefined(dismissOnClickOutside)) __obj.updateDynamic("dismissOnClickOutside")(dismissOnClickOutside.asInstanceOf[js.Any])
    if (!js.isUndefined(dismissOnEsc)) __obj.updateDynamic("dismissOnEsc")(dismissOnEsc.asInstanceOf[js.Any])
    if (initialState != null) __obj.updateDynamic("initialState")(initialState.asInstanceOf[js.Any])
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction0(onClose))
    if (onOpen != null) __obj.updateDynamic("onOpen")(js.Any.fromFunction0(onOpen))
    if (stateReducer != null) __obj.updateDynamic("stateReducer")(js.Any.fromFunction3(stateReducer))
    __obj.asInstanceOf[Anon_ArgsChildren]
  }
}

