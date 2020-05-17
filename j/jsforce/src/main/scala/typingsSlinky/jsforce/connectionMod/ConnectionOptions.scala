package typingsSlinky.jsforce.connectionMod

import typingsSlinky.jsforce.anon.PartialPartialOAuth2Optio
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConnectionOptions extends PartialOAuth2Options {
  var accessToken: js.UndefOr[String] = js.native
  var callOptions: js.UndefOr[js.Object] = js.native
  var instanceUrl: js.UndefOr[String] = js.native
  var logLevel: js.UndefOr[String] = js.native
  var maxRequest: js.UndefOr[Double] = js.native
  var oauth2: js.UndefOr[PartialPartialOAuth2Optio] = js.native
  var proxyUrl: js.UndefOr[String] = js.native
  var refreshFn: js.UndefOr[
    js.Function2[/* conn */ Connection, /* callback */ Callback[UserInfo], js.Promise[UserInfo]]
  ] = js.native
  var refreshToken: js.UndefOr[String] = js.native
  var serverUrl: js.UndefOr[String] = js.native
  var sessionId: js.UndefOr[String] = js.native
  var signedRequest: js.UndefOr[String | js.Object] = js.native
  var version: js.UndefOr[String] = js.native
}

object ConnectionOptions {
  @scala.inline
  def apply(): ConnectionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectionOptions]
  }
  @scala.inline
  implicit class ConnectionOptionsOps[Self <: ConnectionOptions] (val x: Self) extends AnyVal {
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
    def withCallOptions(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCallOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withInstanceUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withLogLevel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxRequest(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxRequest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxRequest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxRequest")(js.undefined)
        ret
    }
    @scala.inline
    def withOauth2(value: PartialPartialOAuth2Optio): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oauth2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOauth2: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oauth2")(js.undefined)
        ret
    }
    @scala.inline
    def withProxyUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxyUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProxyUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxyUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withRefreshFn(value: (/* conn */ Connection, /* callback */ Callback[UserInfo]) => js.Promise[UserInfo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refreshFn")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutRefreshFn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refreshFn")(js.undefined)
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
    def withServerUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServerUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withSessionId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSessionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionId")(js.undefined)
        ret
    }
    @scala.inline
    def withSignedRequest(value: String | js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signedRequest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSignedRequest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signedRequest")(js.undefined)
        ret
    }
    @scala.inline
    def withVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(js.undefined)
        ret
    }
  }
  
}

