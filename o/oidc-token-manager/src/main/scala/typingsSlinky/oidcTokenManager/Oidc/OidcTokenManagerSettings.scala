package typingsSlinky.oidcTokenManager.Oidc

import org.scalajs.dom.raw.Storage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OidcTokenManagerSettings extends js.Object {
  var authority: js.UndefOr[String] = js.native
  var authorization_endpoint: js.UndefOr[String] = js.native
  var client_id: js.UndefOr[String] = js.native
  var end_session_endpoint: js.UndefOr[String] = js.native
  var jwks: js.UndefOr[js.Any] = js.native
  var jwks_uri: js.UndefOr[String] = js.native
  var load_user_profile: js.UndefOr[Boolean] = js.native
  var metadata: js.UndefOr[js.Any] = js.native
  var persist: js.UndefOr[Boolean] = js.native
  var persistKey: js.UndefOr[String] = js.native
  var popup_redirect_uri: js.UndefOr[String] = js.native
  var post_logout_redirect_uri: js.UndefOr[String] = js.native
  var redirect_uri: js.UndefOr[String] = js.native
  var request_state_key: js.UndefOr[String] = js.native
  var request_state_store: js.UndefOr[Storage] = js.native
  var response_type: js.UndefOr[String] = js.native
  var scope: js.UndefOr[String] = js.native
  var silent_redirect_uri: js.UndefOr[String] = js.native
  var silent_renew: js.UndefOr[Boolean] = js.native
  var store: js.UndefOr[Storage] = js.native
  var userinfo_endpoint: js.UndefOr[String] = js.native
}

object OidcTokenManagerSettings {
  @scala.inline
  def apply(): OidcTokenManagerSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OidcTokenManagerSettings]
  }
  @scala.inline
  implicit class OidcTokenManagerSettingsOps[Self <: OidcTokenManagerSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthority(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authority")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthority: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authority")(js.undefined)
        ret
    }
    @scala.inline
    def withAuthorization_endpoint(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorization_endpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthorization_endpoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorization_endpoint")(js.undefined)
        ret
    }
    @scala.inline
    def withClient_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClient_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_id")(js.undefined)
        ret
    }
    @scala.inline
    def withEnd_session_endpoint(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end_session_endpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnd_session_endpoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end_session_endpoint")(js.undefined)
        ret
    }
    @scala.inline
    def withJwks(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jwks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJwks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jwks")(js.undefined)
        ret
    }
    @scala.inline
    def withJwks_uri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jwks_uri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJwks_uri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jwks_uri")(js.undefined)
        ret
    }
    @scala.inline
    def withLoad_user_profile(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("load_user_profile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoad_user_profile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("load_user_profile")(js.undefined)
        ret
    }
    @scala.inline
    def withMetadata(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(js.undefined)
        ret
    }
    @scala.inline
    def withPersist(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persist")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPersist: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persist")(js.undefined)
        ret
    }
    @scala.inline
    def withPersistKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persistKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPersistKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persistKey")(js.undefined)
        ret
    }
    @scala.inline
    def withPopup_redirect_uri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popup_redirect_uri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPopup_redirect_uri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popup_redirect_uri")(js.undefined)
        ret
    }
    @scala.inline
    def withPost_logout_redirect_uri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("post_logout_redirect_uri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPost_logout_redirect_uri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("post_logout_redirect_uri")(js.undefined)
        ret
    }
    @scala.inline
    def withRedirect_uri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redirect_uri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRedirect_uri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redirect_uri")(js.undefined)
        ret
    }
    @scala.inline
    def withRequest_state_key(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("request_state_key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequest_state_key: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("request_state_key")(js.undefined)
        ret
    }
    @scala.inline
    def withRequest_state_store(value: Storage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("request_state_store")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequest_state_store: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("request_state_store")(js.undefined)
        ret
    }
    @scala.inline
    def withResponse_type(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("response_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponse_type: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("response_type")(js.undefined)
        ret
    }
    @scala.inline
    def withScope(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScope: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope")(js.undefined)
        ret
    }
    @scala.inline
    def withSilent_redirect_uri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("silent_redirect_uri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSilent_redirect_uri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("silent_redirect_uri")(js.undefined)
        ret
    }
    @scala.inline
    def withSilent_renew(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("silent_renew")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSilent_renew: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("silent_renew")(js.undefined)
        ret
    }
    @scala.inline
    def withStore(value: Storage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("store")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("store")(js.undefined)
        ret
    }
    @scala.inline
    def withUserinfo_endpoint(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userinfo_endpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserinfo_endpoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userinfo_endpoint")(js.undefined)
        ret
    }
  }
  
}

