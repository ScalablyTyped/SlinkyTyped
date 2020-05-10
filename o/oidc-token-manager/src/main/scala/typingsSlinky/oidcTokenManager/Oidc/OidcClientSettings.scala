package typingsSlinky.oidcTokenManager.Oidc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OidcClientSettings extends js.Object {
  var authority: js.UndefOr[String] = js.native
  var filter_protocol_claims: js.UndefOr[Boolean] = js.native
  var load_user_profile: js.UndefOr[Boolean] = js.native
  var request_state_key: js.UndefOr[String] = js.native
  var request_state_store: js.UndefOr[js.Any] = js.native
  var response_type: js.UndefOr[String] = js.native
}

object OidcClientSettings {
  @scala.inline
  def apply(): OidcClientSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OidcClientSettings]
  }
  @scala.inline
  implicit class OidcClientSettingsOps[Self <: OidcClientSettings] (val x: Self) extends AnyVal {
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
    def withFilter_protocol_claims(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter_protocol_claims")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilter_protocol_claims: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter_protocol_claims")(js.undefined)
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
    def withRequest_state_store(value: js.Any): Self = {
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
  }
  
}

