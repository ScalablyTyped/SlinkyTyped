package typingsSlinky.cswDashAasDashJs

import typingsSlinky.cswDashAasDashJs.distComponentsAuthenticationCheckLoginMod.CheckLoginProps
import typingsSlinky.cswDashAasDashJs.distComponentsAuthorizationClientRoleMod.ClientRoleProps
import typingsSlinky.cswDashAasDashJs.distComponentsAuthorizationRealmRoleMod.RealmRoleProps
import typingsSlinky.cswDashAasDashJs.distComponentsContextAuthContextMod.AuthContextType
import typingsSlinky.cswDashAasDashJs.distComponentsContextAuthContextProviderMod.AuthContextProps
import typingsSlinky.react.reactMod.Context
import typingsSlinky.react.reactMod._Global_.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("csw-aas-js", JSImport.Namespace)
@js.native
object cswDashAasDashJsMod extends js.Object {
  val AuthContext: Context[AuthContextType] = js.native
  def AuthContextProvider(props: AuthContextProps): Element = js.native
  def CheckLogin(hasChildrenError: CheckLoginProps): Element = js.native
  def ClientRole(hasClientRoleClientChildrenError: ClientRoleProps): Element = js.native
  /**
    * React component which renders Login button.
    */
  def Login(): Element = js.native
  /**
    * React component which renders Logout button.
    */
  def Logout(): Element = js.native
  def RealmRole(hasRealmRoleChildrenError: RealmRoleProps): Element = js.native
}

