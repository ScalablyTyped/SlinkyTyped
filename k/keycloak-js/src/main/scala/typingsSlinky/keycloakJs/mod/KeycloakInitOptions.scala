package typingsSlinky.keycloakJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeycloakInitOptions extends js.Object {
  /**
  		 * Allows to use different adapter:
  		 * 
  		 * - {string} default - using browser api for redirects
  		 * - {string} cordova - using cordova plugins 
  		 * - {function} - allows to provide custom function as adapter.
  		 */
  var adapter: js.UndefOr[KeycloakAdapterName] = js.native
  /**
  		 * Set to enable/disable monitoring login state.
  		 * @default true
  		 */
  var checkLoginIframe: js.UndefOr[Boolean] = js.native
  /**
  		 * Set the interval to check login state (in seconds).
  		 * @default 5
  		 */
  var checkLoginIframeInterval: js.UndefOr[Double] = js.native
  /**
  		 * Set the OpenID Connect flow.
  		 * @default standard
  		 */
  var flow: js.UndefOr[KeycloakFlow] = js.native
  /**
  		 * Set an initial value for the id token (only together with `token` or
  		 * `refreshToken`).
  		 */
  var idToken: js.UndefOr[String] = js.native
  /**
  		 * Specifies an action to do on load.
  		 */
  var onLoad: js.UndefOr[KeycloakOnLoad] = js.native
  /**
  		 * Configures the Proof Key for Code Exchange (PKCE) method to use.
  		 * The currently allowed method is 'S256'.
  		 * If not configured, PKCE will not be used.
  		 */
  var pkceMethod: js.UndefOr[KeycloakPkceMethod] = js.native
  /**
  		 * Set the promise type. If set to `'native'` all methods returning a promise
  		 * will return a native JavaScript promise. If not set will return
  		 * Keycloak specific promise objects.
  		 */
  var promiseType: js.UndefOr[KeycloakPromiseType] = js.native
  /**
  		 * Specifies a default uri to redirect to after login or logout.
  		 * This is currently supported for adapter 'cordova-native' and 'default'
  		 */
  var redirectUri: js.UndefOr[String] = js.native
  /**
  		 * Set an initial value for the refresh token.
  		 */
  var refreshToken: js.UndefOr[String] = js.native
  /**
  		 * Set the OpenID Connect response mode to send to Keycloak upon login.
  		 * @default fragment After successful authentication Keycloak will redirect
  		 *                   to JavaScript application with OpenID Connect parameters
  		 *                   added in URL fragment. This is generally safer and
  		 *                   recommended over query.
  		 */
  var responseMode: js.UndefOr[KeycloakResponseMode] = js.native
  /**
  		 * Set an initial value for skew between local time and Keycloak server in
  		 * seconds (only together with `token` or `refreshToken`).
  		 */
  var timeSkew: js.UndefOr[Double] = js.native
  /**
  		 * Set an initial value for the token.
  		 */
  var token: js.UndefOr[String] = js.native
  /**
  		 * @private Undocumented.
  		 */
  var useNonce: js.UndefOr[Boolean] = js.native
}

object KeycloakInitOptions {
  @scala.inline
  def apply(): KeycloakInitOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeycloakInitOptions]
  }
  @scala.inline
  implicit class KeycloakInitOptionsOps[Self <: KeycloakInitOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdapter(value: KeycloakAdapterName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adapter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdapter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adapter")(js.undefined)
        ret
    }
    @scala.inline
    def withCheckLoginIframe(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkLoginIframe")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCheckLoginIframe: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkLoginIframe")(js.undefined)
        ret
    }
    @scala.inline
    def withCheckLoginIframeInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkLoginIframeInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCheckLoginIframeInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkLoginIframeInterval")(js.undefined)
        ret
    }
    @scala.inline
    def withFlow(value: KeycloakFlow): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flow")(js.undefined)
        ret
    }
    @scala.inline
    def withIdToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIdToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idToken")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLoad(value: KeycloakOnLoad): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoad")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnLoad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoad")(js.undefined)
        ret
    }
    @scala.inline
    def withPkceMethod(value: KeycloakPkceMethod): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pkceMethod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPkceMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pkceMethod")(js.undefined)
        ret
    }
    @scala.inline
    def withPromiseType(value: KeycloakPromiseType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("promiseType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPromiseType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("promiseType")(js.undefined)
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
    def withRefreshToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refreshToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRefreshToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refreshToken")(js.undefined)
        ret
    }
    @scala.inline
    def withResponseMode(value: KeycloakResponseMode): Self = {
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
    def withTimeSkew(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeSkew")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeSkew: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeSkew")(js.undefined)
        ret
    }
    @scala.inline
    def withToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("token")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("token")(js.undefined)
        ret
    }
    @scala.inline
    def withUseNonce(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useNonce")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseNonce: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useNonce")(js.undefined)
        ret
    }
  }
  
}

