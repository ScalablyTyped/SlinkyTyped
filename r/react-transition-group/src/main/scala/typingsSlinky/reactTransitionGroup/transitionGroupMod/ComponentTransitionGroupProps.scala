package typingsSlinky.reactTransitionGroup.transitionGroupMod

import slinky.core.ReactComponentClass
import typingsSlinky.reactTransitionGroup.transitionMod.TransitionActions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComponentTransitionGroupProps[T /* <: ReactComponentClass[_] */] extends TransitionActions {
  var component: T
}

object ComponentTransitionGroupProps {
  @scala.inline
  def apply[T /* <: ReactComponentClass[_] */](
    component: T,
    appear: js.UndefOr[Boolean] = js.undefined,
    enter: js.UndefOr[Boolean] = js.undefined,
    exit: js.UndefOr[Boolean] = js.undefined
  ): ComponentTransitionGroupProps[T] = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
    if (!js.isUndefined(appear)) __obj.updateDynamic("appear")(appear.asInstanceOf[js.Any])
    if (!js.isUndefined(enter)) __obj.updateDynamic("enter")(enter.asInstanceOf[js.Any])
    if (!js.isUndefined(exit)) __obj.updateDynamic("exit")(exit.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentTransitionGroupProps[T]]
  }
}

