package typingsSlinky.firebaseAdmin.admin.auth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The request interface for updating an OIDC Auth provider. This is used
  * when updating an OIDC provider's configuration via
  * {@link https://firebase.google.com/docs/reference/admin/node/admin.auth.Auth#updateProviderConfig `updateProviderConfig()`}.
  */
@js.native
trait OIDCUpdateAuthProviderRequest extends UpdateAuthProviderRequest {
  /**
    * The OIDC provider's updated client ID. If not provided, the existing
    * configuration's value is not modified.
    */
  var clientId: js.UndefOr[String] = js.native
  /**
    * The OIDC provider's updated display name. If not provided, the existing
    * configuration's value is not modified.
    */
  var displayName: js.UndefOr[String] = js.native
  /**
    * Whether the OIDC provider is enabled or not. If not provided, the existing
    * configuration's setting is not modified.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /**
    * The OIDC provider's updated issuer. If not provided, the existing
    * configuration's value is not modified.
    */
  var issuer: js.UndefOr[String] = js.native
}

object OIDCUpdateAuthProviderRequest {
  @scala.inline
  def apply(): OIDCUpdateAuthProviderRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OIDCUpdateAuthProviderRequest]
  }
  @scala.inline
  implicit class OIDCUpdateAuthProviderRequestOps[Self <: OIDCUpdateAuthProviderRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClientId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientId")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(js.undefined)
        ret
    }
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(js.undefined)
        ret
    }
    @scala.inline
    def withIssuer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("issuer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIssuer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("issuer")(js.undefined)
        ret
    }
  }
  
}

