package typingsSlinky.cswAasJs

import slinky.core.facade.ReactElement
import typingsSlinky.cswAasJs.authContextMod.AuthContextType
import typingsSlinky.cswAasJs.authContextProviderMod.AuthContextProps
import typingsSlinky.cswAasJs.checkLoginMod.CheckLoginProps
import typingsSlinky.cswAasJs.clientRoleMod.ClientRoleProps
import typingsSlinky.cswAasJs.realmRoleMod.RealmRoleProps
import typingsSlinky.react.mod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("csw-aas-js", "AuthContext")
  @js.native
  val AuthContext: Context[AuthContextType] = js.native
  
  @JSImport("csw-aas-js", "AuthContextProvider")
  @js.native
  def AuthContextProvider(props: AuthContextProps): ReactElement = js.native
  
  @JSImport("csw-aas-js", "CheckLogin")
  @js.native
  def CheckLogin(hasChildrenError: CheckLoginProps): ReactElement = js.native
  
  @JSImport("csw-aas-js", "ClientRole")
  @js.native
  def ClientRole(hasClientRoleClientChildrenError: ClientRoleProps): ReactElement = js.native
  
  /**
    * React component which renders Login button.
    */
  @JSImport("csw-aas-js", "Login")
  @js.native
  def Login(): ReactElement = js.native
  
  /**
    * React component which renders Logout button.
    */
  @JSImport("csw-aas-js", "Logout")
  @js.native
  def Logout(): ReactElement = js.native
  
  @JSImport("csw-aas-js", "RealmRole")
  @js.native
  def RealmRole(hasRealmRoleChildrenError: RealmRoleProps): ReactElement = js.native
}
