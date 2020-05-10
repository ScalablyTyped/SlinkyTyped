package typingsSlinky.keycloakJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeycloakTokenParsed extends js.Object {
  var exp: js.UndefOr[Double] = js.native
  var iat: js.UndefOr[Double] = js.native
  var nonce: js.UndefOr[String] = js.native
  var realm_access: js.UndefOr[KeycloakRoles] = js.native
  var resource_access: js.UndefOr[KeycloakResourceAccess] = js.native
  var session_state: js.UndefOr[String] = js.native
  var sub: js.UndefOr[String] = js.native
}

object KeycloakTokenParsed {
  @scala.inline
  def apply(): KeycloakTokenParsed = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeycloakTokenParsed]
  }
  @scala.inline
  implicit class KeycloakTokenParsedOps[Self <: KeycloakTokenParsed] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExp(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exp")(js.undefined)
        ret
    }
    @scala.inline
    def withIat(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iat")(js.undefined)
        ret
    }
    @scala.inline
    def withNonce(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonce")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNonce: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonce")(js.undefined)
        ret
    }
    @scala.inline
    def withRealm_access(value: KeycloakRoles): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("realm_access")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRealm_access: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("realm_access")(js.undefined)
        ret
    }
    @scala.inline
    def withResource_access(value: KeycloakResourceAccess): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resource_access")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResource_access: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resource_access")(js.undefined)
        ret
    }
    @scala.inline
    def withSession_state(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("session_state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSession_state: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("session_state")(js.undefined)
        ret
    }
    @scala.inline
    def withSub(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sub")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSub: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sub")(js.undefined)
        ret
    }
  }
  
}

