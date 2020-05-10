package typingsSlinky.arangodb.oauth2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OAuth2Options extends js.Object {
  var activeUserEndpoint: js.UndefOr[String] = js.native
  var authEndpoint: String = js.native
  var clientId: String = js.native
  var clientSecret: String = js.native
  var refreshEndpoint: js.UndefOr[String] = js.native
  var tokenEndpoint: String = js.native
}

object OAuth2Options {
  @scala.inline
  def apply(authEndpoint: String, clientId: String, clientSecret: String, tokenEndpoint: String): OAuth2Options = {
    val __obj = js.Dynamic.literal(authEndpoint = authEndpoint.asInstanceOf[js.Any], clientId = clientId.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any], tokenEndpoint = tokenEndpoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[OAuth2Options]
  }
  @scala.inline
  implicit class OAuth2OptionsOps[Self <: OAuth2Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthEndpoint(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authEndpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClientId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClientSecret(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientSecret")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTokenEndpoint(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tokenEndpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActiveUserEndpoint(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeUserEndpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActiveUserEndpoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeUserEndpoint")(js.undefined)
        ret
    }
    @scala.inline
    def withRefreshEndpoint(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refreshEndpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRefreshEndpoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refreshEndpoint")(js.undefined)
        ret
    }
  }
  
}

