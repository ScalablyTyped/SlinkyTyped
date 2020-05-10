package typingsSlinky.ibmCloudSdkCore.baseServiceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserOptions extends js.Object {
  var apikey: js.UndefOr[String] = js.native
  var disable_ssl_verification: js.UndefOr[Boolean] = js.native
  var headers: js.UndefOr[HeaderOptions] = js.native
  var iam_access_token: js.UndefOr[String] = js.native
  var iam_apikey: js.UndefOr[String] = js.native
  var iam_url: js.UndefOr[String] = js.native
  var password: js.UndefOr[String] = js.native
  var token: js.UndefOr[String] = js.native
  var url: js.UndefOr[String] = js.native
  var use_unauthenticated: js.UndefOr[Boolean] = js.native
  var username: js.UndefOr[String] = js.native
  var version: js.UndefOr[String] = js.native
}

object UserOptions {
  @scala.inline
  def apply(): UserOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserOptions]
  }
  @scala.inline
  implicit class UserOptionsOps[Self <: UserOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApikey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apikey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApikey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apikey")(js.undefined)
        ret
    }
    @scala.inline
    def withDisable_ssl_verification(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disable_ssl_verification")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisable_ssl_verification: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disable_ssl_verification")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaders(value: HeaderOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(js.undefined)
        ret
    }
    @scala.inline
    def withIam_access_token(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iam_access_token")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIam_access_token: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iam_access_token")(js.undefined)
        ret
    }
    @scala.inline
    def withIam_apikey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iam_apikey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIam_apikey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iam_apikey")(js.undefined)
        ret
    }
    @scala.inline
    def withIam_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iam_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIam_url: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iam_url")(js.undefined)
        ret
    }
    @scala.inline
    def withPassword(value: String): Self = {
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
    @scala.inline
    def withToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("token")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("token")(js.undefined)
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.undefined)
        ret
    }
    @scala.inline
    def withUse_unauthenticated(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("use_unauthenticated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUse_unauthenticated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("use_unauthenticated")(js.undefined)
        ret
    }
    @scala.inline
    def withUsername(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("username")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsername: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("username")(js.undefined)
        ret
    }
    @scala.inline
    def withVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(js.undefined)
        ret
    }
  }
  
}

