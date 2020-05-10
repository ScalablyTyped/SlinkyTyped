package typingsSlinky.jwtExpress.mod

import typingsSlinky.express.mod.CookieOptions
import typingsSlinky.jsonwebtoken.mod.SignOptions
import typingsSlinky.jsonwebtoken.mod.VerifyOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JWTExpressOptions extends js.Object {
  /**
    * The name of the cookie (default: 'jwt-express')
    */
  var cookie: js.UndefOr[String] = js.native
  /**
    * Options to use when storing the cookie (default: {httpOnly: true})
    */
  var cookieOptions: js.UndefOr[CookieOptions] = js.native
  /**
    * If true, will use cookies, otherwise will use the Authorization header (default: true)
    */
  var cookies: js.UndefOr[Boolean] = js.native
  /**
    * Indicates if the JWT should be refreshed and stored every request (default: true)
    */
  var refresh: js.UndefOr[Boolean] = js.native
  /**
    * The property of req to populate (default: 'jwt')
    */
  var reqProperty: js.UndefOr[String] = js.native
  /**
    * jwt.revoke() will call this function (default: function(jwt) {})
    */
  var revoke: js.UndefOr[js.Function1[/* jwt */ JWT, Unit]] = js.native
  /**
    * Options to use when signing the JWT (default: {})
    */
  var signOptions: js.UndefOr[SignOptions] = js.native
  /**
    * Milliseconds when the jwt will go stale (default: 900000 (15 minutes))
    */
  var stales: js.UndefOr[Double] = js.native
  /**
    * Additional verification. Must return a boolean (default: function(jwt) {return true})
    */
  var verify: js.UndefOr[js.Function1[/* jwt */ JWT, Boolean]] = js.native
  /**
    * Options to use when verifying the JWT (default: {})
    */
  var verifyOptions: js.UndefOr[VerifyOptions] = js.native
}

object JWTExpressOptions {
  @scala.inline
  def apply(): JWTExpressOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JWTExpressOptions]
  }
  @scala.inline
  implicit class JWTExpressOptionsOps[Self <: JWTExpressOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCookie(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cookie")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCookie: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cookie")(js.undefined)
        ret
    }
    @scala.inline
    def withCookieOptions(value: CookieOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cookieOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCookieOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cookieOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withCookies(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cookies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCookies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cookies")(js.undefined)
        ret
    }
    @scala.inline
    def withRefresh(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refresh")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRefresh: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refresh")(js.undefined)
        ret
    }
    @scala.inline
    def withReqProperty(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reqProperty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReqProperty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reqProperty")(js.undefined)
        ret
    }
    @scala.inline
    def withRevoke(value: /* jwt */ JWT => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revoke")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRevoke: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revoke")(js.undefined)
        ret
    }
    @scala.inline
    def withSignOptions(value: SignOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSignOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withStales(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stales")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStales: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stales")(js.undefined)
        ret
    }
    @scala.inline
    def withVerify(value: /* jwt */ JWT => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verify")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutVerify: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verify")(js.undefined)
        ret
    }
    @scala.inline
    def withVerifyOptions(value: VerifyOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verifyOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerifyOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verifyOptions")(js.undefined)
        ret
    }
  }
  
}

