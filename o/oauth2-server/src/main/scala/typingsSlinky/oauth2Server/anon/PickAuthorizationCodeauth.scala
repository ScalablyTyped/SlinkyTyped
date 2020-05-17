package typingsSlinky.oauth2Server.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<oauth2-server.oauth2-server.AuthorizationCode, 'authorizationCode' | 'expiresAt' | 'redirectUri' | 'scope'> */
@js.native
trait PickAuthorizationCodeauth extends js.Object {
  var authorizationCode: String = js.native
  var expiresAt: js.Date = js.native
  var redirectUri: String = js.native
  var scope: js.UndefOr[String | js.Array[String]] = js.native
}

object PickAuthorizationCodeauth {
  @scala.inline
  def apply(authorizationCode: String, expiresAt: js.Date, redirectUri: String): PickAuthorizationCodeauth = {
    val __obj = js.Dynamic.literal(authorizationCode = authorizationCode.asInstanceOf[js.Any], expiresAt = expiresAt.asInstanceOf[js.Any], redirectUri = redirectUri.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickAuthorizationCodeauth]
  }
  @scala.inline
  implicit class PickAuthorizationCodeauthOps[Self <: PickAuthorizationCodeauth] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthorizationCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorizationCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpiresAt(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expiresAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRedirectUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redirectUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScope(value: String | js.Array[String]): Self = {
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
  }
  
}

