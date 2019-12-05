package typingsSlinky.baseui

import slinky.core.TagMod
import typingsSlinky.baseui.dndDashListMod.State
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ChildrenInitialState extends js.Object {
  var children: TagMod[Any]
  var initialState: js.UndefOr[State] = js.undefined
}

object Anon_ChildrenInitialState {
  @scala.inline
  def apply(children: TagMod[Any], initialState: State = null): Anon_ChildrenInitialState = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    if (initialState != null) __obj.updateDynamic("initialState")(initialState.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ChildrenInitialState]
  }
}

