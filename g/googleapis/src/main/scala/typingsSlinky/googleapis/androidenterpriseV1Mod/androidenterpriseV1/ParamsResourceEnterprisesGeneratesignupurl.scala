package typingsSlinky.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceEnterprisesGeneratesignupurl extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The callback URL to which the Admin will be redirected after successfully
    * creating an enterprise. Before redirecting there the system will add a
    * single query parameter to this URL named "enterpriseToken" which will
    * contain an opaque token to be used for the CompleteSignup request. Beware
    * that this means that the URL will be parsed, the parameter added and then
    * a new URL formatted, i.e. there may be some minor formatting changes and,
    * more importantly, the URL must be well-formed so that it can be parsed.
    */
  var callbackUrl: js.UndefOr[String] = js.native
}

object ParamsResourceEnterprisesGeneratesignupurl {
  @scala.inline
  def apply(): ParamsResourceEnterprisesGeneratesignupurl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceEnterprisesGeneratesignupurl]
  }
  @scala.inline
  implicit class ParamsResourceEnterprisesGeneratesignupurlOps[Self <: ParamsResourceEnterprisesGeneratesignupurl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auth")(js.undefined)
        ret
    }
    @scala.inline
    def withCallbackUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callbackUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCallbackUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callbackUrl")(js.undefined)
        ret
    }
  }
  
}

