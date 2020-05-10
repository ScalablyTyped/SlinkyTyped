package typingsSlinky.kiiCloudSdk

import typingsSlinky.kiiCloudSdk.KiiCloud.KiiSocialConnectOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonOauthtoken extends KiiSocialConnectOptions {
  var oauth_token: String = js.native
  var oauth_token_secret: String = js.native
}

object AnonOauthtoken {
  @scala.inline
  def apply(oauth_token: String, oauth_token_secret: String): AnonOauthtoken = {
    val __obj = js.Dynamic.literal(oauth_token = oauth_token.asInstanceOf[js.Any], oauth_token_secret = oauth_token_secret.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOauthtoken]
  }
  @scala.inline
  implicit class AnonOauthtokenOps[Self <: AnonOauthtoken] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOauth_token(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oauth_token")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOauth_token_secret(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oauth_token_secret")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

