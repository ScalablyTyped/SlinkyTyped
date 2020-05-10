package typingsSlinky.arangodb.oauth1Mod

import typingsSlinky.arangodb.arangodbStrings.PLAINTEXT
import typingsSlinky.arangodb.arangodbStrings.`HMAC-SHA1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OAuth1Options extends js.Object {
  var accessTokenEndpoint: String = js.native
  var activeUserEndpoint: js.UndefOr[String] = js.native
  var authEndpoint: String = js.native
  var clientId: String = js.native
  var clientSecret: String = js.native
  var requestTokenEndpoint: String = js.native
  var signatureMethod: js.UndefOr[`HMAC-SHA1` | PLAINTEXT] = js.native
}

object OAuth1Options {
  @scala.inline
  def apply(
    accessTokenEndpoint: String,
    authEndpoint: String,
    clientId: String,
    clientSecret: String,
    requestTokenEndpoint: String
  ): OAuth1Options = {
    val __obj = js.Dynamic.literal(accessTokenEndpoint = accessTokenEndpoint.asInstanceOf[js.Any], authEndpoint = authEndpoint.asInstanceOf[js.Any], clientId = clientId.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any], requestTokenEndpoint = requestTokenEndpoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[OAuth1Options]
  }
  @scala.inline
  implicit class OAuth1OptionsOps[Self <: OAuth1Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccessTokenEndpoint(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessTokenEndpoint")(value.asInstanceOf[js.Any])
        ret
    }
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
    def withRequestTokenEndpoint(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestTokenEndpoint")(value.asInstanceOf[js.Any])
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
    def withSignatureMethod(value: `HMAC-SHA1` | PLAINTEXT): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signatureMethod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSignatureMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signatureMethod")(js.undefined)
        ret
    }
  }
  
}

