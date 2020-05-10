package typingsSlinky.openapiTypes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAuthorizationCode extends js.Object {
  var authorizationCode: js.UndefOr[AnonScopes] = js.native
  var clientCredentials: js.UndefOr[AnonRefreshUrl] = js.native
  var `implicit`: js.UndefOr[AnonAuthorizationUrl] = js.native
  var password: js.UndefOr[AnonRefreshUrl] = js.native
}

object AnonAuthorizationCode {
  @scala.inline
  def apply(): AnonAuthorizationCode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonAuthorizationCode]
  }
  @scala.inline
  implicit class AnonAuthorizationCodeOps[Self <: AnonAuthorizationCode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthorizationCode(value: AnonScopes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorizationCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthorizationCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorizationCode")(js.undefined)
        ret
    }
    @scala.inline
    def withClientCredentials(value: AnonRefreshUrl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientCredentials")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientCredentials: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientCredentials")(js.undefined)
        ret
    }
    @scala.inline
    def withImplicit(value: AnonAuthorizationUrl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("implicit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImplicit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("implicit")(js.undefined)
        ret
    }
    @scala.inline
    def withPassword(value: AnonRefreshUrl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("password")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPassword: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("password")(js.undefined)
        ret
    }
  }
  
}

