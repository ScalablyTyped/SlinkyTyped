package typingsSlinky.reduxAuthWrapper.redirectMod

import typingsSlinky.history.mod.Location
import typingsSlinky.history.mod.LocationState
import typingsSlinky.redux.mod.Action
import typingsSlinky.reduxAuthWrapper.mod.AuthBaseConfig
import typingsSlinky.reduxAuthWrapper.mod.StateSelector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConnectedRouterRedirectConfig[OwnProps, State] extends AuthBaseConfig[OwnProps, State] {
  var allowRedirectBack: js.UndefOr[Boolean | (StateSelector[State, OwnProps, Boolean])] = js.native
  var redirectAction: js.UndefOr[js.Function1[/* location */ Location[LocationState], Action[_]]] = js.native
  var redirectPath: String | (StateSelector[State, OwnProps, String]) = js.native
  var redirectQueryParamName: js.UndefOr[String] = js.native
}

object ConnectedRouterRedirectConfig {
  @scala.inline
  def apply[OwnProps, State](
    authenticatedSelector: (State, OwnProps) => Boolean,
    redirectPath: String | (StateSelector[State, OwnProps, String])
  ): ConnectedRouterRedirectConfig[OwnProps, State] = {
    val __obj = js.Dynamic.literal(authenticatedSelector = js.Any.fromFunction2(authenticatedSelector), redirectPath = redirectPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectedRouterRedirectConfig[OwnProps, State]]
  }
  @scala.inline
  implicit class ConnectedRouterRedirectConfigOps[Self[ownprops, state] <: ConnectedRouterRedirectConfig[ownprops, state], OwnProps, State] (val x: Self[OwnProps, State]) extends AnyVal {
    @scala.inline
    def duplicate: Self[OwnProps, State] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[OwnProps, State]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[OwnProps, State]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[OwnProps, State]) with Other]
    @scala.inline
    def withRedirectPathFunction2(value: (State, OwnProps) => String): Self[OwnProps, State] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redirectPath")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withRedirectPath(value: String | (StateSelector[State, OwnProps, String])): Self[OwnProps, State] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redirectPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAllowRedirectBackFunction2(value: (State, OwnProps) => Boolean): Self[OwnProps, State] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowRedirectBack")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withAllowRedirectBack(value: Boolean | (StateSelector[State, OwnProps, Boolean])): Self[OwnProps, State] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowRedirectBack")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowRedirectBack: Self[OwnProps, State] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowRedirectBack")(js.undefined)
        ret
    }
    @scala.inline
    def withRedirectAction(value: /* location */ Location[LocationState] => Action[_]): Self[OwnProps, State] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redirectAction")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRedirectAction: Self[OwnProps, State] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redirectAction")(js.undefined)
        ret
    }
    @scala.inline
    def withRedirectQueryParamName(value: String): Self[OwnProps, State] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redirectQueryParamName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRedirectQueryParamName: Self[OwnProps, State] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redirectQueryParamName")(js.undefined)
        ret
    }
  }
  
}

