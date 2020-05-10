package typingsSlinky.passportInstagram.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StrategyOptionBase extends js.Object {
  var authorizationURL: js.UndefOr[String] = js.native
  var callbackURL: String = js.native
  var clientID: String = js.native
  var clientSecret: String = js.native
  var tokenURL: js.UndefOr[String] = js.native
}

object StrategyOptionBase {
  @scala.inline
  def apply(callbackURL: String, clientID: String, clientSecret: String): StrategyOptionBase = {
    val __obj = js.Dynamic.literal(callbackURL = callbackURL.asInstanceOf[js.Any], clientID = clientID.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any])
    __obj.asInstanceOf[StrategyOptionBase]
  }
  @scala.inline
  implicit class StrategyOptionBaseOps[Self <: StrategyOptionBase] (val x: Self) extends AnyVal {
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
  }
  
}

