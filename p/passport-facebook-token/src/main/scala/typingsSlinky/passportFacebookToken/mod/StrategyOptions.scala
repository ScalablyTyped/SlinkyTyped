package typingsSlinky.passportFacebookToken.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StrategyOptions extends js.Object {
  var authorizationURL: js.UndefOr[String] = js.native
  var clientID: String = js.native
  var clientSecret: String = js.native
  var enableProof: js.UndefOr[Boolean] = js.native
  var fbGraphVersion: js.UndefOr[String] = js.native
  var profileFields: js.UndefOr[js.Array[String]] = js.native
  var scopeSeparator: js.UndefOr[String] = js.native
  var tokenURL: js.UndefOr[String] = js.native
}

object StrategyOptions {
  @scala.inline
  def apply(clientID: String, clientSecret: String): StrategyOptions = {
    val __obj = js.Dynamic.literal(clientID = clientID.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any])
    __obj.asInstanceOf[StrategyOptions]
  }
  @scala.inline
  implicit class StrategyOptionsOps[Self <: StrategyOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withEnableProof(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableProof")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableProof: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableProof")(js.undefined)
        ret
    }
    @scala.inline
    def withFbGraphVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fbGraphVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFbGraphVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fbGraphVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withProfileFields(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profileFields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProfileFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profileFields")(js.undefined)
        ret
    }
    @scala.inline
    def withScopeSeparator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scopeSeparator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScopeSeparator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scopeSeparator")(js.undefined)
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

