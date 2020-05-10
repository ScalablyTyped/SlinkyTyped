package typingsSlinky.passportGoogleOauth.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IOAuthStrategyOption extends js.Object {
  var accessTokenURL: js.UndefOr[String] = js.native
  var callbackURL: String = js.native
  var consumerKey: String = js.native
  var consumerSecret: String = js.native
  var requestTokenURL: js.UndefOr[String] = js.native
  var sessionKey: js.UndefOr[String] = js.native
  var userAuthorizationURL: js.UndefOr[String] = js.native
}

object IOAuthStrategyOption {
  @scala.inline
  def apply(callbackURL: String, consumerKey: String, consumerSecret: String): IOAuthStrategyOption = {
    val __obj = js.Dynamic.literal(callbackURL = callbackURL.asInstanceOf[js.Any], consumerKey = consumerKey.asInstanceOf[js.Any], consumerSecret = consumerSecret.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOAuthStrategyOption]
  }
  @scala.inline
  implicit class IOAuthStrategyOptionOps[Self <: IOAuthStrategyOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCallbackURL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callbackURL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConsumerKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("consumerKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConsumerSecret(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("consumerSecret")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAccessTokenURL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessTokenURL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccessTokenURL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessTokenURL")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestTokenURL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestTokenURL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestTokenURL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestTokenURL")(js.undefined)
        ret
    }
    @scala.inline
    def withSessionKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSessionKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionKey")(js.undefined)
        ret
    }
    @scala.inline
    def withUserAuthorizationURL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userAuthorizationURL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserAuthorizationURL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userAuthorizationURL")(js.undefined)
        ret
    }
  }
  
}

