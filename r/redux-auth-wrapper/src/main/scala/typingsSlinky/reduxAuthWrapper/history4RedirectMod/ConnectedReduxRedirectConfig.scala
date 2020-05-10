package typingsSlinky.reduxAuthWrapper.history4RedirectMod

import typingsSlinky.history.mod.Location
import typingsSlinky.history.mod.LocationState
import typingsSlinky.redux.mod.Action
import typingsSlinky.reduxAuthWrapper.mod.StateSelector
import typingsSlinky.reduxAuthWrapper.redirectMod.ConnectedRouterRedirectConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConnectedReduxRedirectConfig[OwnProps, State] extends ConnectedRouterRedirectConfig[OwnProps, State] {
  @JSName("redirectAction")
  def redirectAction_MConnectedReduxRedirectConfig(location: Location[LocationState]): Action[_] = js.native
}

object ConnectedReduxRedirectConfig {
  @scala.inline
  def apply[OwnProps, State](
    authenticatedSelector: (State, OwnProps) => Boolean,
    redirectAction: Location[LocationState] => Action[_],
    redirectPath: String | (StateSelector[State, OwnProps, String])
  ): ConnectedReduxRedirectConfig[OwnProps, State] = {
    val __obj = js.Dynamic.literal(authenticatedSelector = js.Any.fromFunction2(authenticatedSelector), redirectAction = js.Any.fromFunction1(redirectAction), redirectPath = redirectPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectedReduxRedirectConfig[OwnProps, State]]
  }
  @scala.inline
  implicit class ConnectedReduxRedirectConfigOps[Self[ownprops, state] <: ConnectedReduxRedirectConfig[ownprops, state], OwnProps, State] (val x: Self[OwnProps, State]) extends AnyVal {
    @scala.inline
    def duplicate: Self[OwnProps, State] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[OwnProps, State]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[OwnProps, State]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[OwnProps, State]) with Other]
    @scala.inline
    def withRedirectAction(value: Location[LocationState] => Action[_]): Self[OwnProps, State] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redirectAction")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

