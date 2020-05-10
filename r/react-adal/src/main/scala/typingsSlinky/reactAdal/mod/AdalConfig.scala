package typingsSlinky.reactAdal.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.reactAdal.reactAdalStrings.localStorage
import typingsSlinky.reactAdal.reactAdalStrings.sessionStorage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdalConfig extends js.Object {
  /**
    * Array of keywords or URIs. Adal will not attach a token to outgoing requests that have these keywords or URIs.
    */
  var anonymousEndpoints: js.UndefOr[js.Array[String]] = js.native
  /**
    * Sets browser storage to either 'localStorage' or sessionStorage'. Defaults to `sessionStorage`.
    */
  var cacheLocation: js.UndefOr[localStorage | sessionStorage] = js.native
  /**
    * Callback to be invoked when a token is acquired.
    */
  var callback: js.UndefOr[TokenCallback] = js.native
  /**
    * Client ID assigned to your app by Azure Active Directory.
    */
  var clientId: String = js.native
  /**
    * Unique identifier used to map the request with the response. Defaults to RFC4122 version 4 guid (128 bits).
    */
  var correlationId: js.UndefOr[String] = js.native
  /**
    * User defined function of handling the navigation to Azure AD authorization endpoint in case of login.
    */
  var displayCall: js.UndefOr[js.Function1[/* url */ String, Unit]] = js.native
  /**
    * Array of keywords or URIs. Adal will attach a token to outgoing requests that have these keywords or URIs.
    */
  var endpoints: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * If the cached token is about to be expired in the expireOffsetSeconds (in seconds), Adal will renew the token instead of using the cached token. Defaults to 300 seconds.
    */
  var expireOffsetSeconds: js.UndefOr[Double] = js.native
  /**
    * Query parameters to add to the authentication request.
    */
  var extraQueryParameter: js.UndefOr[String] = js.native
  /**
    * Azure Active Directory instance. Defaults to `https://login.microsoftonline.com/`.
    */
  var instance: js.UndefOr[String] = js.native
  /**
    * The number of milliseconds of inactivity before a token renewal response from AAD should be considered timed out. Defaults to 6 seconds.
    */
  var loadFrameTimeout: js.UndefOr[Double] = js.native
  /**
    * Set this to redirect the user to a custom login page.
    */
  var localLoginUrl: js.UndefOr[String] = js.native
  /**
    * Set this to redirect the user to a custom logout page.
    */
  var logOutUri: js.UndefOr[String] = js.native
  /**
    * Set this to the resource to request on login. Defaults to `clientId`.
    */
  var loginResource: js.UndefOr[String] = js.native
  /**
    * Redirects to start page after login. Defaults to `true`.
    */
  var navigateToLoginRequestUrl: js.UndefOr[Boolean] = js.native
  /**
    * Set this to true to enable login in a popup winodow instead of a full redirect. Defaults to `false`.
    */
  var popUp: js.UndefOr[Boolean] = js.native
  /**
    * Redirects the user to postLogoutRedirectUri after logout. Defaults to `redirectUri`.
    */
  var postLogoutRedirectUri: js.UndefOr[String] = js.native
  /**
    * Endpoint at which you expect to receive tokens.Defaults to `window.location.href`.
    */
  var redirectUri: js.UndefOr[String] = js.native
  /**
    * Your target tenant. Defaults to `common`.
    */
  var tenant: js.UndefOr[String] = js.native
}

object AdalConfig {
  @scala.inline
  def apply(clientId: String): AdalConfig = {
    val __obj = js.Dynamic.literal(clientId = clientId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdalConfig]
  }
  @scala.inline
  implicit class AdalConfigOps[Self <: AdalConfig] (val x: Self) extends AnyVal {
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
    def withAnonymousEndpoints(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anonymousEndpoints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnonymousEndpoints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anonymousEndpoints")(js.undefined)
        ret
    }
    @scala.inline
    def withCacheLocation(value: localStorage | sessionStorage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCacheLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheLocation")(js.undefined)
        ret
    }
    @scala.inline
    def withCallback(value: (/* errorDesc */ String | Null, /* token */ String | Null, /* error */ js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callback")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callback")(js.undefined)
        ret
    }
    @scala.inline
    def withCorrelationId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("correlationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCorrelationId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("correlationId")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayCall(value: /* url */ String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayCall")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDisplayCall: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayCall")(js.undefined)
        ret
    }
    @scala.inline
    def withEndpoints(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endpoints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndpoints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endpoints")(js.undefined)
        ret
    }
    @scala.inline
    def withExpireOffsetSeconds(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expireOffsetSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpireOffsetSeconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expireOffsetSeconds")(js.undefined)
        ret
    }
    @scala.inline
    def withExtraQueryParameter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extraQueryParameter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtraQueryParameter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extraQueryParameter")(js.undefined)
        ret
    }
    @scala.inline
    def withInstance(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instance")(js.undefined)
        ret
    }
    @scala.inline
    def withLoadFrameTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadFrameTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoadFrameTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadFrameTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withLocalLoginUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localLoginUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocalLoginUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localLoginUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withLogOutUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logOutUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogOutUri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logOutUri")(js.undefined)
        ret
    }
    @scala.inline
    def withLoginResource(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loginResource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoginResource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loginResource")(js.undefined)
        ret
    }
    @scala.inline
    def withNavigateToLoginRequestUrl(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigateToLoginRequestUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNavigateToLoginRequestUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigateToLoginRequestUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withPopUp(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popUp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPopUp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popUp")(js.undefined)
        ret
    }
    @scala.inline
    def withPostLogoutRedirectUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postLogoutRedirectUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPostLogoutRedirectUri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postLogoutRedirectUri")(js.undefined)
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
    def withTenant(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tenant")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTenant: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tenant")(js.undefined)
        ret
    }
  }
  
}

