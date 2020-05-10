package typingsSlinky.passportGoogleOauth20.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StrategyOptionsBase extends OAuth2StrategyOptionsWithoutRequiredURLs {
  var authorizationURL: js.UndefOr[String] = js.native
  var tokenURL: js.UndefOr[String] = js.native
  var userProfileURL: js.UndefOr[String] = js.native
}

object StrategyOptionsBase {
  @scala.inline
  def apply(clientID: String, clientSecret: String): StrategyOptionsBase = {
    val __obj = js.Dynamic.literal(clientID = clientID.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any])
    __obj.asInstanceOf[StrategyOptionsBase]
  }
  @scala.inline
  implicit class StrategyOptionsBaseOps[Self <: StrategyOptionsBase] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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

