package typingsSlinky.passportNaver.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StrategyOption extends js.Object {
  var authType: js.UndefOr[String] = js.native
  var authorizationURL: js.UndefOr[String] = js.native
  var callbackURL: String = js.native
  var clientID: String = js.native
  var clientSecret: String = js.native
  var profileURL: js.UndefOr[String] = js.native
  var svcType: js.UndefOr[Double] = js.native
  var tokenURL: js.UndefOr[String] = js.native
}

object StrategyOption {
  @scala.inline
  def apply(callbackURL: String, clientID: String, clientSecret: String): StrategyOption = {
    val __obj = js.Dynamic.literal(callbackURL = callbackURL.asInstanceOf[js.Any], clientID = clientID.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any])
    __obj.asInstanceOf[StrategyOption]
  }
  @scala.inline
  implicit class StrategyOptionOps[Self <: StrategyOption] (val x: Self) extends AnyVal {
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
    def withClientID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClientSecret(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientSecret")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAuthType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authType")(js.undefined)
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
    def withProfileURL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profileURL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProfileURL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profileURL")(js.undefined)
        ret
    }
    @scala.inline
    def withSvcType(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("svcType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSvcType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("svcType")(js.undefined)
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
  }
  
}

