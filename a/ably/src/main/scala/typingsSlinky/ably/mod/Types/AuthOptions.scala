package typingsSlinky.ably.mod.Types

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuthOptions extends js.Object {
  /**
  		 * A function which is called when a new token is required.
  		 * The role of the callback is to either generate a signed TokenRequest which may then be submitted automatically
  		 * by the library to the Ably REST API requestToken; or to provide a valid token in as a TokenDetails object.
  		 **/
  var authCallback: js.UndefOr[
    js.Function2[
      /* data */ TokenParams, 
      /* callback */ js.Function2[
        /* error */ ErrorInfo | String, 
        /* tokenRequestOrDetails */ TokenDetails | TokenRequest | String, 
        Unit
      ], 
      Unit
    ]
  ] = js.native
  var authHeaders: js.UndefOr[StringDictionary[String]] = js.native
  var authMethod: js.UndefOr[HTTPMethods] = js.native
  var authParams: js.UndefOr[StringDictionary[String]] = js.native
  /**
  		 * A URL that the library may use to obtain a token string (in plain text format), or a signed TokenRequest or TokenDetails (in JSON format).
  		 **/
  var authUrl: js.UndefOr[String] = js.native
  /**
  		 * Optional clientId that can be used to specify the identity for this client. In most cases
  		 * it is preferable to instead specift a clientId in the token issued to this client.
  		 */
  var clientId: js.UndefOr[String] = js.native
  var key: js.UndefOr[String] = js.native
  var queryTime: js.UndefOr[Boolean] = js.native
  var token: js.UndefOr[TokenDetails | String] = js.native
  var tokenDetails: js.UndefOr[TokenDetails] = js.native
  var useTokenAuth: js.UndefOr[Boolean] = js.native
}

object AuthOptions {
  @scala.inline
  def apply(): AuthOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthOptions]
  }
  @scala.inline
  implicit class AuthOptionsOps[Self <: AuthOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthCallback(
      value: (/* data */ TokenParams, /* callback */ js.Function2[
          /* error */ ErrorInfo | String, 
          /* tokenRequestOrDetails */ TokenDetails | TokenRequest | String, 
          Unit
        ]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authCallback")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutAuthCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authCallback")(js.undefined)
        ret
    }
    @scala.inline
    def withAuthHeaders(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authHeaders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authHeaders")(js.undefined)
        ret
    }
    @scala.inline
    def withAuthMethod(value: HTTPMethods): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authMethod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authMethod")(js.undefined)
        ret
    }
    @scala.inline
    def withAuthParams(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authParams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authParams")(js.undefined)
        ret
    }
    @scala.inline
    def withAuthUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authUrl")(js.undefined)
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
    def withKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(js.undefined)
        ret
    }
    @scala.inline
    def withQueryTime(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQueryTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryTime")(js.undefined)
        ret
    }
    @scala.inline
    def withToken(value: TokenDetails | String): Self = {
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
    def withTokenDetails(value: TokenDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tokenDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTokenDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tokenDetails")(js.undefined)
        ret
    }
    @scala.inline
    def withUseTokenAuth(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useTokenAuth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseTokenAuth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useTokenAuth")(js.undefined)
        ret
    }
  }
  
}

