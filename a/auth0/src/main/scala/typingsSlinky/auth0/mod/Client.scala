package typingsSlinky.auth0.mod

import typingsSlinky.auth0.anon.Alg
import typingsSlinky.auth0.anon.Cert
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Client extends js.Object {
  var addons: js.UndefOr[js.Any] = js.native
  var allowed_clients: js.UndefOr[js.Array[String]] = js.native
  var allowed_logout_urls: js.UndefOr[js.Array[String]] = js.native
  var allowed_origins: js.UndefOr[js.Array[String]] = js.native
  /**
    * The type of application this client represents.
    */
  var app_type: js.UndefOr[String] = js.native
  /**
    * The URLs that Auth0 can use to as a callback for the client.
    */
  var callbacks: js.UndefOr[js.Array[String]] = js.native
  var client_aliases: js.UndefOr[js.Array[String]] = js.native
  /**
    * The id of the client.
    */
  var client_id: js.UndefOr[String] = js.native
  var client_metadata: js.UndefOr[js.Any] = js.native
  /**
    * The client secret, it must not be public.
    */
  var client_secret: js.UndefOr[String] = js.native
  /**
    * `true` if this client can be used to make cross-origin authentication requests, `false` otherwise (default: `false`)
    */
  var cross_origin_auth: js.UndefOr[Boolean] = js.native
  /**
    * Url fo the location in your site where the cross origin verification takes place for the cross-origin auth flow when performing Auth in your own domain instead of Auth0 hosted login page.
    */
  var cross_origin_loc: js.UndefOr[String] = js.native
  var custom_login_page: js.UndefOr[String] = js.native
  /**
    * `true` if the custom login page is to be used, `false` otherwise. (default: `true`)
    */
  var custom_login_page_on: js.UndefOr[Boolean] = js.native
  var custom_login_page_preview: js.UndefOr[String] = js.native
  /**
    * Free text description of the purpose of the Client. (Max character length: `140`).
    */
  var description: js.UndefOr[String] = js.native
  var encryption_key: js.UndefOr[Cert] = js.native
  var form_template: js.UndefOr[String] = js.native
  /**
    * A set of grant types that the client is authorized to use
    */
  var grant_types: js.UndefOr[js.Array[Grant]] = js.native
  /**
    * Whether this client a first party client or not.
    */
  var is_first_party: js.UndefOr[Boolean] = js.native
  var jwt_configuration: js.UndefOr[Alg] = js.native
  /**
    * The URL of the client logo (recommended size: 150x150).
    */
  var logo_uri: js.UndefOr[String] = js.native
  var mobile: js.UndefOr[js.Any] = js.native
  /**
    * The name of the client.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Whether this client will conform to strict OIDC specifications.
    */
  var oidc_conformant: js.UndefOr[Boolean] = js.native
  /**
    * Client signing keys.
    */
  var signing_keys: js.UndefOr[js.Array[String]] = js.native
  var sso: js.UndefOr[Boolean] = js.native
  /**
    * `true` to disable Single Sign On, `false` otherwise (default: `false`)
    */
  var sso_disabled: js.UndefOr[Boolean] = js.native
  /**
    * Defines the requested authentication method for the token endpoint. Possible values are 'none' (public client without a client secret), 'client_secret_post' (client uses HTTP POST parameters) or 'client_secret_basic' (client uses HTTP Basic) ['none' or 'client_secret_post' or 'client_secret_basic']
    */
  var token_endpoint_auth_method: js.UndefOr[String] = js.native
  var web_origins: js.UndefOr[js.Array[String]] = js.native
}

object Client {
  @scala.inline
  def apply(): Client = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Client]
  }
  @scala.inline
  implicit class ClientOps[Self <: Client] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddons(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddons: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addons")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowed_clients(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowed_clients")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowed_clients: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowed_clients")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowed_logout_urls(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowed_logout_urls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowed_logout_urls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowed_logout_urls")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowed_origins(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowed_origins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowed_origins: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowed_origins")(js.undefined)
        ret
    }
    @scala.inline
    def withApp_type(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("app_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApp_type: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("app_type")(js.undefined)
        ret
    }
    @scala.inline
    def withCallbacks(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callbacks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCallbacks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callbacks")(js.undefined)
        ret
    }
    @scala.inline
    def withClient_aliases(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_aliases")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClient_aliases: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_aliases")(js.undefined)
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
    def withClient_metadata(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClient_metadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_metadata")(js.undefined)
        ret
    }
    @scala.inline
    def withClient_secret(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_secret")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClient_secret: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_secret")(js.undefined)
        ret
    }
    @scala.inline
    def withCross_origin_auth(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cross_origin_auth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCross_origin_auth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cross_origin_auth")(js.undefined)
        ret
    }
    @scala.inline
    def withCross_origin_loc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cross_origin_loc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCross_origin_loc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cross_origin_loc")(js.undefined)
        ret
    }
    @scala.inline
    def withCustom_login_page(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("custom_login_page")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustom_login_page: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("custom_login_page")(js.undefined)
        ret
    }
    @scala.inline
    def withCustom_login_page_on(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("custom_login_page_on")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustom_login_page_on: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("custom_login_page_on")(js.undefined)
        ret
    }
    @scala.inline
    def withCustom_login_page_preview(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("custom_login_page_preview")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustom_login_page_preview: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("custom_login_page_preview")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withEncryption_key(value: Cert): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encryption_key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncryption_key: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encryption_key")(js.undefined)
        ret
    }
    @scala.inline
    def withForm_template(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("form_template")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForm_template: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("form_template")(js.undefined)
        ret
    }
    @scala.inline
    def withGrant_types(value: js.Array[Grant]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grant_types")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGrant_types: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grant_types")(js.undefined)
        ret
    }
    @scala.inline
    def withIs_first_party(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_first_party")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIs_first_party: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_first_party")(js.undefined)
        ret
    }
    @scala.inline
    def withJwt_configuration(value: Alg): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jwt_configuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJwt_configuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jwt_configuration")(js.undefined)
        ret
    }
    @scala.inline
    def withLogo_uri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logo_uri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogo_uri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logo_uri")(js.undefined)
        ret
    }
    @scala.inline
    def withMobile(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mobile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMobile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mobile")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withOidc_conformant(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oidc_conformant")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOidc_conformant: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oidc_conformant")(js.undefined)
        ret
    }
    @scala.inline
    def withSigning_keys(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signing_keys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSigning_keys: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signing_keys")(js.undefined)
        ret
    }
    @scala.inline
    def withSso(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sso")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSso: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sso")(js.undefined)
        ret
    }
    @scala.inline
    def withSso_disabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sso_disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSso_disabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sso_disabled")(js.undefined)
        ret
    }
    @scala.inline
    def withToken_endpoint_auth_method(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("token_endpoint_auth_method")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToken_endpoint_auth_method: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("token_endpoint_auth_method")(js.undefined)
        ret
    }
    @scala.inline
    def withWeb_origins(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("web_origins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWeb_origins: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("web_origins")(js.undefined)
        ret
    }
  }
  
}

