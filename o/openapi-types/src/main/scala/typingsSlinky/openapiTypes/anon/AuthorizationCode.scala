package typingsSlinky.openapiTypes.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuthorizationCode extends js.Object {
  var authorizationCode: js.UndefOr[Scopes] = js.native
  var clientCredentials: js.UndefOr[RefreshUrl] = js.native
  var `implicit`: js.UndefOr[AuthorizationUrl] = js.native
  var password: js.UndefOr[RefreshUrl] = js.native
}

object AuthorizationCode {
  @scala.inline
  def apply(): AuthorizationCode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthorizationCode]
  }
  @scala.inline
  implicit class AuthorizationCodeOps[Self <: AuthorizationCode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthorizationCode(value: Scopes): Self = {
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
    def withClientCredentials(value: RefreshUrl): Self = {
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
    def withImplicit(value: AuthorizationUrl): Self = {
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
    def withPassword(value: RefreshUrl): Self = {
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

