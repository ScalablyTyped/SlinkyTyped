package typingsSlinky.npmRegistryFetch.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<npm-registry-fetch.npm-registry-fetch.AuthOptions> */
@js.native
trait PartialAuthOptions extends js.Object {
  var _auth: js.UndefOr[String] = js.native
  var _authToken: js.UndefOr[String] = js.native
  var _password: js.UndefOr[String] = js.native
  var `always-auth`: js.UndefOr[Boolean] = js.native
  var alwaysAuth: js.UndefOr[Boolean] = js.native
  var email: js.UndefOr[String] = js.native
  var otp: js.UndefOr[Double | String] = js.native
  var password: js.UndefOr[String] = js.native
  var token: js.UndefOr[String] = js.native
  var username: js.UndefOr[String] = js.native
}

object PartialAuthOptions {
  @scala.inline
  def apply(): PartialAuthOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialAuthOptions]
  }
  @scala.inline
  implicit class PartialAuthOptionsOps[Self <: PartialAuthOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_auth(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_auth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_auth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_auth")(js.undefined)
        ret
    }
    @scala.inline
    def with_authToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_authToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_authToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_authToken")(js.undefined)
        ret
    }
    @scala.inline
    def with_password(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_password")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_password: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_password")(js.undefined)
        ret
    }
    @scala.inline
    def `withAlways-auth`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("always-auth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAlways-auth`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("always-auth")(js.undefined)
        ret
    }
    @scala.inline
    def withAlwaysAuth(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alwaysAuth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlwaysAuth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alwaysAuth")(js.undefined)
        ret
    }
    @scala.inline
    def withEmail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email")(js.undefined)
        ret
    }
    @scala.inline
    def withOtp(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("otp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOtp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("otp")(js.undefined)
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
  }
  
}

