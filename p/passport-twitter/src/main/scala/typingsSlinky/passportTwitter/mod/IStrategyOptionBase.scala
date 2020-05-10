package typingsSlinky.passportTwitter.mod

import typingsSlinky.passportTwitter.passportTwitterBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IStrategyOptionBase extends js.Object {
  var accessTokenURL: js.UndefOr[String] = js.native
  var callbackURL: String = js.native
  var consumerKey: String = js.native
  var consumerSecret: String = js.native
  var includeEmail: js.UndefOr[`true`] = js.native
  var reguestTokenURL: js.UndefOr[String] = js.native
  var sessionKey: js.UndefOr[String] = js.native
  var skipExtendedUserProfile: js.UndefOr[Boolean] = js.native
  var userAuthorizationURL: js.UndefOr[String] = js.native
  var userProfileURL: js.UndefOr[String] = js.native
}

object IStrategyOptionBase {
  @scala.inline
  def apply(callbackURL: String, consumerKey: String, consumerSecret: String): IStrategyOptionBase = {
    val __obj = js.Dynamic.literal(callbackURL = callbackURL.asInstanceOf[js.Any], consumerKey = consumerKey.asInstanceOf[js.Any], consumerSecret = consumerSecret.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStrategyOptionBase]
  }
  @scala.inline
  implicit class IStrategyOptionBaseOps[Self <: IStrategyOptionBase] (val x: Self) extends AnyVal {
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
    def withIncludeEmail(value: `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeEmail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeEmail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeEmail")(js.undefined)
        ret
    }
    @scala.inline
    def withReguestTokenURL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reguestTokenURL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReguestTokenURL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reguestTokenURL")(js.undefined)
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
    def withSkipExtendedUserProfile(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipExtendedUserProfile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkipExtendedUserProfile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipExtendedUserProfile")(js.undefined)
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
    @scala.inline
    def withUserProfileURL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userProfileURL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserProfileURL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userProfileURL")(js.undefined)
        ret
    }
  }
  
}

