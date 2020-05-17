package typingsSlinky.auth0Js.anon

import typingsSlinky.auth0Js.auth0JsStrings.form_post
import typingsSlinky.auth0Js.auth0JsStrings.fragment
import typingsSlinky.auth0Js.auth0JsStrings.query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Audience extends js.Object {
  /** identifier of the resource server who will consume the access token issued after Auth */
  var audience: js.UndefOr[String] = js.native
  /** your Auth0 client identifier obtained when creating the client in the Auth0 Dashboard */
  var clientId: js.UndefOr[String] = js.native
  /**
    * identity provider whose login page will be displayed in the popup.
    * If omitted the hosted login page is used.
    * {@link https://auth0.com/docs/identityproviders}
    */
  var connection: js.UndefOr[String] = js.native
  /** your Auth0 domain */
  var domain: String = js.native
  /**
    * value used to mitigate replay attacks when using Implicit Grant.
    * {@link https://auth0.com/docs/api-auth/tutorials/nonce}
    */
  var nonce: js.UndefOr[String] = js.native
  /** determines if Auth0 should render the relay page or not and the caller is responsible of handling the response. */
  var owp: js.UndefOr[Boolean] = js.native
  /** url that the Auth0 will redirect after Auth with the Authorization Response */
  var redirectUri: String = js.native
  /**
    * how the Auth response is encoded and redirected back to the client.
    * {@link https://openid.net/specs/oauth-v2-multiple-response-types-1_0.html#ResponseModes}
    */
  var responseMode: js.UndefOr[query | fragment | form_post] = js.native
  /**
    * type of the response used by OAuth 2.0 flow.
    * It can be any space separated list of the values `code`, `token`, `id_token`.
    * {@link https://openid.net/specs/oauth-v2-multiple-response-types-1_0}
    */
  var responseType: String = js.native
  /** scopes to be requested during Auth. e.g. `openid email` */
  var scope: js.UndefOr[String] = js.native
  /**
    * value used to mitigate XSRF attacks.
    * {@link https://auth0.com/docs/protocols/oauth2/oauth-state}
    */
  var state: js.UndefOr[String] = js.native
}

object Audience {
  @scala.inline
  def apply(domain: String, redirectUri: String, responseType: String): Audience = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], redirectUri = redirectUri.asInstanceOf[js.Any], responseType = responseType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Audience]
  }
  @scala.inline
  implicit class AudienceOps[Self <: Audience] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDomain(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRedirectUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redirectUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResponseType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAudience(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audience")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAudience: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audience")(js.undefined)
        ret
    }
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
    def withConnection(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connection")(js.undefined)
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
    def withOwp(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOwp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owp")(js.undefined)
        ret
    }
    @scala.inline
    def withResponseMode(value: query | fragment | form_post): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponseMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseMode")(js.undefined)
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
    def withState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(js.undefined)
        ret
    }
  }
  
}

