package typingsSlinky.cswAasJs.authMod

import typingsSlinky.keycloakJs.mod.KeycloakError
import typingsSlinky.keycloakJs.mod.KeycloakInstance
import typingsSlinky.keycloakJs.mod.KeycloakPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuthenticateResult extends js.Object {
  var authenticated: KeycloakPromise[Boolean, KeycloakError] = js.native
  var keycloak: KeycloakInstance[js.UndefOr[scala.Nothing]] = js.native
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
  @scala.inline
  implicit class AuthenticateResultOps[Self <: AuthenticateResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthenticated(value: KeycloakPromise[Boolean, KeycloakError]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authenticated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeycloak(value: KeycloakInstance[js.UndefOr[scala.Nothing]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keycloak")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

