package typingsSlinky.ouibounce

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCookieDomain extends js.Object {
  var cookieDomain: js.UndefOr[String] = js.native
  var cookieExpire: js.UndefOr[Double] = js.native
  var cookieName: js.UndefOr[String] = js.native
  var sitewide: js.UndefOr[Boolean] = js.native
}

object AnonCookieDomain {
  @scala.inline
  def apply(): AnonCookieDomain = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonCookieDomain]
  }
  @scala.inline
  implicit class AnonCookieDomainOps[Self <: AnonCookieDomain] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCookieDomain(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cookieDomain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCookieDomain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cookieDomain")(js.undefined)
        ret
    }
    @scala.inline
    def withCookieExpire(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cookieExpire")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCookieExpire: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cookieExpire")(js.undefined)
        ret
    }
    @scala.inline
    def withCookieName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cookieName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCookieName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cookieName")(js.undefined)
        ret
    }
    @scala.inline
    def withSitewide(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sitewide")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSitewide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sitewide")(js.undefined)
        ret
    }
  }
  
}

