package typingsSlinky.keycloakJs.keycloakAuthzMod

import typingsSlinky.keycloakJs.anon.Rptendpoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeycloakAuthorizationInstance extends js.Object {
  
  /**
    * This method enables client applications to better integrate with resource servers protected by a Keycloak
    * policy enforcer using UMA protocol.
    *
    * The authorization request must be provided with a ticket.
    *
    * @param authorizationRequest An AuthorizationRequest instance with a valid permission ticket set.
    * @returns A promise to set functions to be invoked on grant, deny or error.
    */
  def authorize(authorizationRequest: AuthorizationRequest): KeycloakAuthorizationPromise = js.native
  
  var config: Rptendpoint = js.native
  
  /**
  		 * Obtains all entitlements from a Keycloak server based on a given resourceServerId.
    *
    * @param resourceServerId The id (client id) of the resource server to obtain permissions from.
    * @param authorizationRequest An AuthorizationRequest instance.
    * @returns A promise to set functions to be invoked on grant, deny or error.
  		 */
  def entitlement(resourceServerId: String): KeycloakAuthorizationPromise = js.native
  def entitlement(resourceServerId: String, authorizationRequest: AuthorizationRequest): KeycloakAuthorizationPromise = js.native
  
  def init(): Unit = js.native
  
  var rpt: js.Any = js.native
}
