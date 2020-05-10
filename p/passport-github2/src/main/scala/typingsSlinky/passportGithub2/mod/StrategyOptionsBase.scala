package typingsSlinky.passportGithub2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StrategyOptionsBase extends OAuth2StrategyOptionsWithoutRequiredURLs {
  var authorizationURL: js.UndefOr[String] = js.native
  @JSName("callbackURL")
  var callbackURL_StrategyOptionsBase: String = js.native
  @JSName("scope")
  var scope_StrategyOptionsBase: js.UndefOr[js.Array[String]] = js.native
  @JSName("state")
  var state_StrategyOptionsBase: js.UndefOr[String] = js.native
  var tokenURL: js.UndefOr[String] = js.native
  var userAgent: js.UndefOr[String] = js.native
  var userEmailURL: js.UndefOr[String] = js.native
  var userProfileURL: js.UndefOr[String] = js.native
}

object StrategyOptionsBase {
  @scala.inline
  def apply(callbackURL: String, clientID: String, clientSecret: String): StrategyOptionsBase = {
    val __obj = js.Dynamic.literal(callbackURL = callbackURL.asInstanceOf[js.Any], clientID = clientID.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any])
    __obj.asInstanceOf[StrategyOptionsBase]
  }
  @scala.inline
  implicit class StrategyOptionsBaseOps[Self <: StrategyOptionsBase] (val x: Self) extends AnyVal {
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
    def withAuthorizationURL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorizationURL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthorizationURL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorizationURL")(js.undefined)
        ret
    }
    @scala.inline
    def withScope(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScope: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(js.undefined)
        ret
    }
    @scala.inline
    def withTokenURL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tokenURL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTokenURL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tokenURL")(js.undefined)
        ret
    }
    @scala.inline
    def withUserAgent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userAgent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserAgent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userAgent")(js.undefined)
        ret
    }
    @scala.inline
    def withUserEmailURL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userEmailURL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserEmailURL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userEmailURL")(js.undefined)
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

