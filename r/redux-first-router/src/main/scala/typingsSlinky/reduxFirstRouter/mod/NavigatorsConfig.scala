package typingsSlinky.reduxFirstRouter.mod

import typingsSlinky.redux.mod.AnyAction
import typingsSlinky.redux.mod.Store
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavigatorsConfig[TKeys, TState] extends js.Object {
  var navigators: Navigators[TState] = js.native
  def actionToNavigation(
    navigators: Navigators[TState],
     // TODO check this
  action: js.Object,
    navigationAction: Nullable[NavigationAction],
    route: Nullable[Route[TKeys, TState]]
  ): js.Object = js.native
  def navigationToAction(
    navigators: Navigators[TState],
    store: Store[TState, AnyAction],
    routesMap: RoutesMap[TKeys, TState],
    action: js.Object
  ): typingsSlinky.reduxFirstRouter.anon.Action = js.native
  def patchNavigators(navigators: Navigators[TState]): Unit = js.native
}

object NavigatorsConfig {
  @scala.inline
  def apply[TKeys, TState](
    actionToNavigation: (Navigators[TState], js.Object, Nullable[NavigationAction], Nullable[Route[TKeys, TState]]) => js.Object,
    navigationToAction: (Navigators[TState], Store[TState, AnyAction], RoutesMap[TKeys, TState], js.Object) => typingsSlinky.reduxFirstRouter.anon.Action,
    navigators: Navigators[TState],
    patchNavigators: Navigators[TState] => Unit
  ): NavigatorsConfig[TKeys, TState] = {
    val __obj = js.Dynamic.literal(actionToNavigation = js.Any.fromFunction4(actionToNavigation), navigationToAction = js.Any.fromFunction4(navigationToAction), navigators = navigators.asInstanceOf[js.Any], patchNavigators = js.Any.fromFunction1(patchNavigators))
    __obj.asInstanceOf[NavigatorsConfig[TKeys, TState]]
  }
  @scala.inline
  implicit class NavigatorsConfigOps[Self[tkeys, tstate] <: NavigatorsConfig[tkeys, tstate], TKeys, TState] (val x: Self[TKeys, TState]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TKeys, TState] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TKeys, TState]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[TKeys, TState]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[TKeys, TState]) with Other]
    @scala.inline
    def withActionToNavigation(
      value: (Navigators[TState], js.Object, Nullable[NavigationAction], Nullable[Route[TKeys, TState]]) => js.Object
    ): Self[TKeys, TState] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionToNavigation")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withNavigationToAction(
      value: (Navigators[TState], Store[TState, AnyAction], RoutesMap[TKeys, TState], js.Object) => typingsSlinky.reduxFirstRouter.anon.Action
    ): Self[TKeys, TState] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigationToAction")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withNavigators(value: Navigators[TState]): Self[TKeys, TState] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigators")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPatchNavigators(value: Navigators[TState] => Unit): Self[TKeys, TState] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patchNavigators")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

