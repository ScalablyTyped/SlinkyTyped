package typingsSlinky.reduxAuthWrapper.authWrapperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InjectedAuthProps extends js.Object {
  var isAuthenticated: Boolean = js.native
  var isAuthenticating: Boolean = js.native
}

object InjectedAuthProps {
  @scala.inline
  def apply(isAuthenticated: Boolean, isAuthenticating: Boolean): InjectedAuthProps = {
    val __obj = js.Dynamic.literal(isAuthenticated = isAuthenticated.asInstanceOf[js.Any], isAuthenticating = isAuthenticating.asInstanceOf[js.Any])
    __obj.asInstanceOf[InjectedAuthProps]
  }
  @scala.inline
  implicit class InjectedAuthPropsOps[Self <: InjectedAuthProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsAuthenticated(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAuthenticated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsAuthenticating(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAuthenticating")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

