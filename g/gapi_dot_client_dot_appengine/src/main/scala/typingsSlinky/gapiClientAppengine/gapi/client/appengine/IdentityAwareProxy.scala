package typingsSlinky.gapiClientAppengine.gapi.client.appengine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IdentityAwareProxy extends js.Object {
  /**
    * Whether the serving infrastructure will authenticate and authorize all incoming requests.If true, the oauth2_client_id and oauth2_client_secret fields
    * must be non-empty.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /** OAuth2 client ID to use for the authentication flow. */
  var oauth2ClientId: js.UndefOr[String] = js.native
  /**
    * OAuth2 client secret to use for the authentication flow.For security reasons, this value cannot be retrieved via the API. Instead, the SHA-256 hash of
    * the value is returned in the oauth2_client_secret_sha256 field.@InputOnly
    */
  var oauth2ClientSecret: js.UndefOr[String] = js.native
  /** Hex-encoded SHA-256 hash of the client secret.@OutputOnly */
  var oauth2ClientSecretSha256: js.UndefOr[String] = js.native
}

object IdentityAwareProxy {
  @scala.inline
  def apply(): IdentityAwareProxy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IdentityAwareProxy]
  }
  @scala.inline
  implicit class IdentityAwareProxyOps[Self <: IdentityAwareProxy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withOauth2ClientId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oauth2ClientId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOauth2ClientId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oauth2ClientId")(js.undefined)
        ret
    }
    @scala.inline
    def withOauth2ClientSecret(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oauth2ClientSecret")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOauth2ClientSecret: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oauth2ClientSecret")(js.undefined)
        ret
    }
    @scala.inline
    def withOauth2ClientSecretSha256(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oauth2ClientSecretSha256")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOauth2ClientSecretSha256: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oauth2ClientSecretSha256")(js.undefined)
        ret
    }
  }
  
}

