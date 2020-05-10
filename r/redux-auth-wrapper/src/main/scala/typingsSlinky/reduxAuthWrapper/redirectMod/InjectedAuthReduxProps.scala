package typingsSlinky.reduxAuthWrapper.redirectMod

import typingsSlinky.reduxAuthWrapper.authWrapperMod.InjectedAuthProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InjectedAuthReduxProps extends InjectedAuthProps {
  var redirectPath: String = js.native
}

object InjectedAuthReduxProps {
  @scala.inline
  def apply(isAuthenticated: Boolean, isAuthenticating: Boolean, redirectPath: String): InjectedAuthReduxProps = {
    val __obj = js.Dynamic.literal(isAuthenticated = isAuthenticated.asInstanceOf[js.Any], isAuthenticating = isAuthenticating.asInstanceOf[js.Any], redirectPath = redirectPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[InjectedAuthReduxProps]
  }
  @scala.inline
  implicit class InjectedAuthReduxPropsOps[Self <: InjectedAuthReduxProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRedirectPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redirectPath")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

