package typingsSlinky.auth0Js.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RenewAuthOptions extends js.Object {
  /**
    * identifier of the resource server who will consume the access token issued after Auth
    */
  var audience: js.UndefOr[String] = js.native
  /**
    * your Auth0 client identifier obtained when creating the client in the Auth0 Dashboard
    */
  var clientID: js.UndefOr[String] = js.native
  /**
    * your Auth0 domain
    */
  var domain: js.UndefOr[String] = js.native
  /**
    * value used to mitigate replay attacks when using Implicit Grant.
    * {@link https://auth0.com/docs/api-auth/tutorials/nonce}
    */
  var nonce: js.UndefOr[String] = js.native
  /**
    * identifier data type to look for in postMessage event data, where events are initiated
    * from silent callback urls, before accepting a message event is the event expected.
    * A value of false means any postMessage event will trigger a callback.
    */
  var postMessageDataType: js.UndefOr[String] = js.native
  /**
    * origin of redirectUri to expect postMessage response from.
    * Defaults to the origin of the receiving window. Only used if usePostMessage is truthy.
    */
  var postMessageOrigin: js.UndefOr[String] = js.native
  /**
    * url that the Auth0 will redirect after Auth with the Authorization Response
    */
  var redirectUri: js.UndefOr[String] = js.native
  /**
    * how the Auth response is encoded and redirected back to the client.
    * Supported values are `query`, `fragment` and `form_post`.
    * The `query` value is only supported when `responseType` is `code`.
    * {@link https://openid.net/specs/oauth-v2-multiple-response-types-1_0.html#ResponseModes}
    */
  var responseMode: js.UndefOr[String] = js.native
  /**
    * type of the response used by OAuth 2.0 flow. It can be any space separated
    * list of the values `code`, `token`, `id_token`.
    * {@link https://openid.net/specs/oauth-v2-multiple-response-types-1_0}
    */
  var responseType: js.UndefOr[String] = js.native
  /**
    * scopes to be requested during Auth. e.g. `openid email`
    */
  var scope: js.UndefOr[String] = js.native
  /**
    * value used to mitigate XSRF attacks.
    * {@link https://auth0.com/docs/protocols/oauth2/oauth-state}
    */
  var state: js.UndefOr[String] = js.native
  /**
    * value in milliseconds used to timeout when the `/authorize` call is failing
    * as part of the silent authentication with postmessage enabled due to a configuration.
    */
  var timeout: js.UndefOr[Double] = js.native
  /**
    * use postMessage to comunicate between the silent callback and the SPA.
    * When false the SDK will attempt to parse the url hash should ignore the url hash
    * and no extra behaviour is needed
    * @default false
    */
  var usePostMessage: js.UndefOr[Boolean] = js.native
}

object RenewAuthOptions {
  @scala.inline
  def apply(): RenewAuthOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RenewAuthOptions]
  }
  @scala.inline
  implicit class RenewAuthOptionsOps[Self <: RenewAuthOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withClientID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientID: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientID")(js.undefined)
        ret
    }
    @scala.inline
    def withDomain(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDomain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domain")(js.undefined)
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
    def withPostMessageDataType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postMessageDataType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPostMessageDataType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postMessageDataType")(js.undefined)
        ret
    }
    @scala.inline
    def withPostMessageOrigin(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postMessageOrigin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPostMessageOrigin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postMessageOrigin")(js.undefined)
        ret
    }
    @scala.inline
    def withRedirectUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redirectUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRedirectUri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redirectUri")(js.undefined)
        ret
    }
    @scala.inline
    def withResponseMode(value: String): Self = {
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
    def withResponseType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponseType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseType")(js.undefined)
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
    @scala.inline
    def withTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(js.undefined)
        ret
    }
    @scala.inline
    def withUsePostMessage(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usePostMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsePostMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usePostMessage")(js.undefined)
        ret
    }
  }
  
}

