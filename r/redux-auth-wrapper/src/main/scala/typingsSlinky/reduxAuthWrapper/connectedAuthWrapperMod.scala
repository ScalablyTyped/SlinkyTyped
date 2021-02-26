package typingsSlinky.reduxAuthWrapper

import typingsSlinky.reduxAuthWrapper.authWrapperMod.AuthWrapperConfig
import typingsSlinky.reduxAuthWrapper.authWrapperMod.InjectedAuthProps
import typingsSlinky.reduxAuthWrapper.mod.AuthBaseConfig
import typingsSlinky.reduxAuthWrapper.mod.AuthWrapperDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object connectedAuthWrapperMod {
  
  @JSImport("redux-auth-wrapper/connectedAuthWrapper", JSImport.Default)
  @js.native
  def default[OwnProps, State](config: ConnectedAuthWrapperConfig[OwnProps, State]): AuthWrapperDecorator[OwnProps with InjectedAuthProps] = js.native
  
  type ConnectedAuthWrapperConfig[OwnProps, State] = AuthWrapperConfig with (AuthBaseConfig[OwnProps, State])
}
