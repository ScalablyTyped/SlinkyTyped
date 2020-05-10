package typingsSlinky.chromeApps.chrome.webViewRequest

import typingsSlinky.chromeApps.chrome.double
import typingsSlinky.chromeApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A filter of a cookie in HTTP Responses. */
@js.native
trait FilterResponseCookie extends js.Object {
  /**
    * Inclusive lower bound on the cookie lifetime (specified in seconds after current time).
    * Only cookies whose expiration date-time is set to 'now + ageLowerBound' or later fulfill
    * this criterion. Session cookies do not meet the criterion of this filter. The cookie
    * lifetime is calculated from either 'max-age' or 'expires' cookie attributes. If both
    * are specified, 'max-age' is used to calculate the cookie lifetime.
    */
  var ageLowerBound: js.UndefOr[integer] = js.native
  /**
    * Inclusive upper bound on the cookie lifetime (specified in seconds after current time).
    * Only cookies whose expiration date-time is in the interval [now, now + ageUpperBound]
    * fulfill this criterion. Session cookies and cookies whose expiration date-time is
    * in the past do not meet the criterion of this filter. The cookie lifetime is calculated
    * from either 'max-age' or 'expires' cookie attributes. If both are specified, 'max-age'
    * is used to calculate the cookie lifetime.
    */
  var ageUpperBound: js.UndefOr[integer] = js.native
  /** Value of the Domain cookie attribute. */
  var domain: js.UndefOr[String] = js.native
  /** Value of the Expires cookie attribute. */
  var expires: js.UndefOr[String] = js.native
  /** Existence of the HttpOnly cookie attribute */
  var httpOnly: js.UndefOr[String] = js.native
  /** Value of the Max-Age cookie attribute */
  var maxAge: js.UndefOr[double] = js.native
  /** Name of a cookie. */
  var name: js.UndefOr[String] = js.native
  /** Value of the Path cookie attribute. */
  var path: js.UndefOr[String] = js.native
  /** Existence of the Secure cookie attribute. */
  var secure: js.UndefOr[String] = js.native
  /**
    * Filters session cookies.
    * Session cookies have no lifetime specified in any of 'max-age' or 'expires' attributes.
    */
  var sessionCookie: js.UndefOr[Boolean] = js.native
  /** Value of a cookie, may be padded in double-quotes. */
  var value: js.UndefOr[String] = js.native
}

object FilterResponseCookie {
  @scala.inline
  def apply(): FilterResponseCookie = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilterResponseCookie]
  }
  @scala.inline
  implicit class FilterResponseCookieOps[Self <: FilterResponseCookie] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAgeLowerBound(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ageLowerBound")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAgeLowerBound: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ageLowerBound")(js.undefined)
        ret
    }
    @scala.inline
    def withAgeUpperBound(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ageUpperBound")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAgeUpperBound: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ageUpperBound")(js.undefined)
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
    def withExpires(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expires")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpires: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expires")(js.undefined)
        ret
    }
    @scala.inline
    def withHttpOnly(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHttpOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxAge(value: double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxAge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxAge: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxAge")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(js.undefined)
        ret
    }
    @scala.inline
    def withSecure(value: String): Self = {
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
    @scala.inline
    def withSessionCookie(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionCookie")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSessionCookie: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionCookie")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
  }
  
}

