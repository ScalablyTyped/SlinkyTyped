package typingsSlinky.cswAasJs

import slinky.core.facade.ReactElement
import typingsSlinky.cswAasJs.authContextMod.AuthContextType
import typingsSlinky.cswAasJs.authContextProviderMod.AuthContextProps
import typingsSlinky.cswAasJs.checkLoginMod.CheckLoginProps
import typingsSlinky.cswAasJs.clientRoleMod.ClientRoleProps
import typingsSlinky.cswAasJs.realmRoleMod.RealmRoleProps
import typingsSlinky.react.mod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("csw-aas-js", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  val AuthContext: Context[AuthContextType] = js.native
  
  def AuthContextProvider(props: AuthContextProps): ReactElement = js.native
  
  def CheckLogin(hasChildrenError: CheckLoginProps): ReactElement = js.native
  
  def ClientRole(hasClientRoleClientChildrenError: ClientRoleProps): ReactElement = js.native
  
  /**
    * React component which renders Login button.
    */
  def Login(): ReactElement = js.native
  
  /**
    * React component which renders Logout button.
    */
  def Logout(): ReactElement = js.native
  
  def RealmRole(hasRealmRoleChildrenError: RealmRoleProps): ReactElement = js.native
}
