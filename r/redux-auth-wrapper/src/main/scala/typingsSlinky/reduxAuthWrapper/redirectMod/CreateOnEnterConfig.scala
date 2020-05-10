package typingsSlinky.reduxAuthWrapper.redirectMod

import typingsSlinky.reduxAuthWrapper.mod.AuthConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateOnEnterConfig[State] extends AuthConfig {
  var allowRedirectBack: js.UndefOr[Boolean | (StateMutateSelector[State, Boolean])] = js.native
  var authenticatedSelector: StateMutateSelector[State, Boolean] = js.native
  var authenticatingSelector: js.UndefOr[StateMutateSelector[State, Boolean]] = js.native
  var redirectPath: String | (StateMutateSelector[State, String]) = js.native
  var redirectQueryParamName: js.UndefOr[String] = js.native
}

object CreateOnEnterConfig {
  @scala.inline
  def apply[State](
    authenticatedSelector: (State, State) => Boolean,
    redirectPath: String | (StateMutateSelector[State, String])
  ): CreateOnEnterConfig[State] = {
    val __obj = js.Dynamic.literal(authenticatedSelector = js.Any.fromFunction2(authenticatedSelector), redirectPath = redirectPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateOnEnterConfig[State]]
  }
  @scala.inline
  implicit class CreateOnEnterConfigOps[Self[state] <: CreateOnEnterConfig[state], State] (val x: Self[State]) extends AnyVal {
    @scala.inline
    def duplicate: Self[State] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[State]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[State] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[State] with Other]
    @scala.inline
    def withAuthenticatedSelector(value: (State, State) => Boolean): Self[State] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authenticatedSelector")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withRedirectPathFunction2(value: (State, State) => String): Self[State] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redirectPath")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withRedirectPath(value: String | (StateMutateSelector[State, String])): Self[State] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redirectPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAllowRedirectBackFunction2(value: (State, State) => Boolean): Self[State] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowRedirectBack")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withAllowRedirectBack(value: Boolean | (StateMutateSelector[State, Boolean])): Self[State] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowRedirectBack")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowRedirectBack: Self[State] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowRedirectBack")(js.undefined)
        ret
    }
    @scala.inline
    def withAuthenticatingSelector(value: (State, State) => Boolean): Self[State] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authenticatingSelector")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutAuthenticatingSelector: Self[State] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authenticatingSelector")(js.undefined)
        ret
    }
    @scala.inline
    def withRedirectQueryParamName(value: String): Self[State] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redirectQueryParamName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRedirectQueryParamName: Self[State] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redirectQueryParamName")(js.undefined)
        ret
    }
  }
  
}

