package typingsSlinky.awsSdk.cognitoidentityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetOpenIdTokenResponse extends js.Object {
  /**
    * A unique identifier in the format REGION:GUID. Note that the IdentityId returned may not match the one passed on input.
    */
  var IdentityId: js.UndefOr[typingsSlinky.awsSdk.cognitoidentityMod.IdentityId] = js.native
  /**
    * An OpenID token, valid for 10 minutes.
    */
  var Token: js.UndefOr[OIDCToken] = js.native
}

object GetOpenIdTokenResponse {
  @scala.inline
  def apply(): GetOpenIdTokenResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetOpenIdTokenResponse]
  }
  @scala.inline
  implicit class GetOpenIdTokenResponseOps[Self <: GetOpenIdTokenResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIdentityId(value: IdentityId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IdentityId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIdentityId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IdentityId")(js.undefined)
        ret
    }
    @scala.inline
    def withToken(value: OIDCToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Token")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Token")(js.undefined)
        ret
    }
  }
  
}

