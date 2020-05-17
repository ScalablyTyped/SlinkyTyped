package typingsSlinky.nodemailer.xoauth2Mod

import typingsSlinky.nodemailer.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /** An existing valid accessToken */
  var accessToken: js.UndefOr[String] = js.native
  /** Endpoint for token generation, defaults to 'https://accounts.google.com/o/oauth2/token' */
  var accessUrl: js.UndefOr[String] = js.native
  /** Client ID value */
  var clientId: js.UndefOr[String] = js.native
  /** Client secret value */
  var clientSecret: js.UndefOr[String] = js.native
  /** Optional Access Token expire time in ms */
  var expires: js.UndefOr[ms] = js.native
  /** Private key for JSW */
  var privateKey: js.UndefOr[String | Key] = js.native
  /** Function to run when a new access token is required */
  var provisionCallback: js.UndefOr[
    js.Function3[
      /* user */ String, 
      /* renew */ Boolean, 
      /* callback */ js.Function3[/* err */ js.Error | Null, /* accessToken */ String, /* expires */ Double, Unit], 
      Unit
    ]
  ] = js.native
  /** Refresh token for an user */
  var refreshToken: js.UndefOr[String] = js.native
  var serviceClient: js.UndefOr[String] = js.native
  /** Optional TTL for Access Token in seconds */
  var timeout: js.UndefOr[s] = js.native
  /** User e-mail address */
  var user: js.UndefOr[String] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccessToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccessToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessToken")(js.undefined)
        ret
    }
    @scala.inline
    def withAccessUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccessUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessUrl")(js.undefined)
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
    def withClientSecret(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientSecret")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientSecret: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientSecret")(js.undefined)
        ret
    }
    @scala.inline
    def withExpires(value: ms): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expires")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpires: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expires")(js.undefined)
        ret
    }
    @scala.inline
    def withPrivateKey(value: String | Key): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privateKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrivateKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privateKey")(js.undefined)
        ret
    }
    @scala.inline
    def withProvisionCallback(
      value: (/* user */ String, /* renew */ Boolean, /* callback */ js.Function3[/* err */ js.Error | Null, /* accessToken */ String, /* expires */ Double, Unit]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provisionCallback")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutProvisionCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provisionCallback")(js.undefined)
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
    def withServiceClient(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceClient")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceClient: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceClient")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeout(value: s): Self = {
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
    def withUser(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user")(js.undefined)
        ret
    }
  }
  
}

