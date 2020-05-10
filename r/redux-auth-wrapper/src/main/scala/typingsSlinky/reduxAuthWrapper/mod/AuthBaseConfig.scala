package typingsSlinky.reduxAuthWrapper.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuthBaseConfig[OwnProps, State] extends AuthConfig {
  var authenticatedSelector: StateSelector[State, OwnProps, Boolean] = js.native
  var authenticatingSelector: js.UndefOr[StateSelector[State, OwnProps, Boolean]] = js.native
}

object AuthBaseConfig {
  @scala.inline
  def apply[OwnProps, State](authenticatedSelector: (State, OwnProps) => Boolean): AuthBaseConfig[OwnProps, State] = {
    val __obj = js.Dynamic.literal(authenticatedSelector = js.Any.fromFunction2(authenticatedSelector))
    __obj.asInstanceOf[AuthBaseConfig[OwnProps, State]]
  }
  @scala.inline
  implicit class AuthBaseConfigOps[Self[ownprops, state] <: AuthBaseConfig[ownprops, state], OwnProps, State] (val x: Self[OwnProps, State]) extends AnyVal {
    @scala.inline
    def duplicate: Self[OwnProps, State] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[OwnProps, State]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[OwnProps, State]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[OwnProps, State]) with Other]
    @scala.inline
    def withAuthenticatedSelector(value: (State, OwnProps) => Boolean): Self[OwnProps, State] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authenticatedSelector")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withAuthenticatingSelector(value: (State, OwnProps) => Boolean): Self[OwnProps, State] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authenticatingSelector")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutAuthenticatingSelector: Self[OwnProps, State] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authenticatingSelector")(js.undefined)
        ret
    }
  }
  
}

