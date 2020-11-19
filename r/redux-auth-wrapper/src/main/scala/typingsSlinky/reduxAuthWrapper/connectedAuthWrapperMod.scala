package typingsSlinky.reduxAuthWrapper

import typingsSlinky.reduxAuthWrapper.authWrapperMod.AuthWrapperConfig
import typingsSlinky.reduxAuthWrapper.authWrapperMod.InjectedAuthProps
import typingsSlinky.reduxAuthWrapper.mod.AuthBaseConfig
import typingsSlinky.reduxAuthWrapper.mod.AuthWrapperDecorator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("redux-auth-wrapper/connectedAuthWrapper", JSImport.Namespace)
@js.native
object connectedAuthWrapperMod extends js.Object {
  
  def default[OwnProps, State](config: ConnectedAuthWrapperConfig[OwnProps, State]): AuthWrapperDecorator[OwnProps with InjectedAuthProps] = js.native
  
  type ConnectedAuthWrapperConfig[OwnProps, State] = AuthWrapperConfig with (AuthBaseConfig[OwnProps, State])
}
