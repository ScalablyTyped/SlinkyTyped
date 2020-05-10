package typingsSlinky.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Identity-Aware Proxy
  */
@js.native
trait SchemaBackendServiceIAP extends js.Object {
  var enabled: js.UndefOr[Boolean] = js.native
  var oauth2ClientId: js.UndefOr[String] = js.native
  /**
    * [Input Only] OAuth client info required to generate client id to be used
    * for IAP.
    */
  var oauth2ClientInfo: js.UndefOr[SchemaBackendServiceIAPOAuth2ClientInfo] = js.native
  var oauth2ClientSecret: js.UndefOr[String] = js.native
  /**
    * [Output Only] SHA256 hash value for the field oauth2_client_secret above.
    */
  var oauth2ClientSecretSha256: js.UndefOr[String] = js.native
}

object SchemaBackendServiceIAP {
  @scala.inline
  def apply(): SchemaBackendServiceIAP = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBackendServiceIAP]
  }
  @scala.inline
  implicit class SchemaBackendServiceIAPOps[Self <: SchemaBackendServiceIAP] (val x: Self) extends AnyVal {
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
    def withOauth2ClientInfo(value: SchemaBackendServiceIAPOAuth2ClientInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oauth2ClientInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOauth2ClientInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oauth2ClientInfo")(js.undefined)
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

