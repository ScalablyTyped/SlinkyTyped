package typingsSlinky.reduxDashAuthDashWrapper

import typingsSlinky.reduxDashAuthDashWrapper.authWrapperMod.AuthWrapperConfig
import typingsSlinky.reduxDashAuthDashWrapper.authWrapperMod.InjectedAuthProps
import typingsSlinky.reduxDashAuthDashWrapper.connectedAuthWrapperMod.ConnectedAuthWrapperConfig
import typingsSlinky.reduxDashAuthDashWrapper.reduxDashAuthDashWrapperMod.AuthBaseConfig
import typingsSlinky.reduxDashAuthDashWrapper.reduxDashAuthDashWrapperMod.AuthWrapperDecorator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-auth-wrapper/connectedAuthWrapper", JSImport.Namespace)
@js.native
object connectedAuthWrapperMod extends js.Object {
  def default[OwnProps, State](config: ConnectedAuthWrapperConfig[OwnProps, State]): AuthWrapperDecorator[OwnProps with InjectedAuthProps] = js.native
  type ConnectedAuthWrapperConfig[OwnProps, State] = AuthWrapperConfig with (AuthBaseConfig[OwnProps, State])
}

