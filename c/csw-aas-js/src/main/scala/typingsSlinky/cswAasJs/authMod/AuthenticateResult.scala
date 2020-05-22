package typingsSlinky.cswAasJs.authMod

import typingsSlinky.keycloakJs.mod.KeycloakError
import typingsSlinky.keycloakJs.mod.KeycloakInstance
import typingsSlinky.keycloakJs.mod.KeycloakPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthenticateResult extends js.Object {
  var authenticated: KeycloakPromise[Boolean, KeycloakError]
  var keycloak: KeycloakInstance[js.UndefOr[scala.Nothing]]
}

object AuthenticateResult {
  @scala.inline
  def apply(
    authenticated: KeycloakPromise[Boolean, KeycloakError],
    keycloak: KeycloakInstance[js.UndefOr[scala.Nothing]]
  ): AuthenticateResult = {
    val __obj = js.Dynamic.literal(authenticated = authenticated.asInstanceOf[js.Any], keycloak = keycloak.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthenticateResult]
  }
}

