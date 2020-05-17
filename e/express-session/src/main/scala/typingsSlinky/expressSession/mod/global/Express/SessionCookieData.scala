package typingsSlinky.expressSession.mod.global.Express

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SessionCookieData extends js.Object {
  var domain: js.UndefOr[String] = js.native
  var expires: js.Date | Boolean = js.native
  var httpOnly: Boolean = js.native
  var maxAge: Double | Null = js.native
  var originalMaxAge: Double = js.native
  var path: String = js.native
  var sameSite: js.UndefOr[Boolean | String] = js.native
  var secure: js.UndefOr[Boolean] = js.native
}

object SessionCookieData {
  @scala.inline
  def apply(expires: js.Date | Boolean, httpOnly: Boolean, originalMaxAge: Double, path: String): SessionCookieData = {
    val __obj = js.Dynamic.literal(expires = expires.asInstanceOf[js.Any], httpOnly = httpOnly.asInstanceOf[js.Any], originalMaxAge = originalMaxAge.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[SessionCookieData]
  }
  @scala.inline
  implicit class SessionCookieDataOps[Self <: SessionCookieData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExpiresDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expires")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpires(value: js.Date | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expires")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHttpOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOriginalMaxAge(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalMaxAge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDomain(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDomain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domain")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxAge(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxAge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxAgeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxAge")(null)
        ret
    }
    @scala.inline
    def withSameSite(value: Boolean | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sameSite")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSameSite: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sameSite")(js.undefined)
        ret
    }
    @scala.inline
    def withSecure(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secure")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecure: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secure")(js.undefined)
        ret
    }
  }
  
}

