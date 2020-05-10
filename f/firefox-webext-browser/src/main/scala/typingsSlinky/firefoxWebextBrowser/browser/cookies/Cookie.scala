package typingsSlinky.firefoxWebextBrowser.browser.cookies

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents information about an HTTP cookie. */
@js.native
trait Cookie extends js.Object {
  /** The domain of the cookie (e.g. "www.google.com", "example.com"). */
  var domain: String = js.native
  /**
    * The expiration date of the cookie as the number of seconds since the UNIX epoch. Not provided for session
    * cookies.
    */
  var expirationDate: js.UndefOr[Double] = js.native
  /** The first-party domain of the cookie. */
  var firstPartyDomain: String = js.native
  /**
    * True if the cookie is a host-only cookie (i.e. a request's host must exactly match the domain of the cookie).
    */
  var hostOnly: Boolean = js.native
  /** True if the cookie is marked as HttpOnly (i.e. the cookie is inaccessible to client-side scripts). */
  var httpOnly: Boolean = js.native
  /** The name of the cookie. */
  var name: String = js.native
  /** The path of the cookie. */
  var path: String = js.native
  /** The cookie's same-site status (i.e. whether the cookie is sent with cross-site requests). */
  var sameSite: SameSiteStatus = js.native
  /**
    * True if the cookie is marked as Secure (i.e. its scope is limited to secure channels, typically HTTPS).
    */
  var secure: Boolean = js.native
  /** True if the cookie is a session cookie, as opposed to a persistent cookie with an expiration date. */
  var session: Boolean = js.native
  /** The ID of the cookie store containing this cookie, as provided in getAllCookieStores(). */
  var storeId: String = js.native
  /** The value of the cookie. */
  var value: String = js.native
}

object Cookie {
  @scala.inline
  def apply(
    domain: String,
    firstPartyDomain: String,
    hostOnly: Boolean,
    httpOnly: Boolean,
    name: String,
    path: String,
    sameSite: SameSiteStatus,
    secure: Boolean,
    session: Boolean,
    storeId: String,
    value: String
  ): Cookie = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], firstPartyDomain = firstPartyDomain.asInstanceOf[js.Any], hostOnly = hostOnly.asInstanceOf[js.Any], httpOnly = httpOnly.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], sameSite = sameSite.asInstanceOf[js.Any], secure = secure.asInstanceOf[js.Any], session = session.asInstanceOf[js.Any], storeId = storeId.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cookie]
  }
  @scala.inline
  implicit class CookieOps[Self <: Cookie] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDomain(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFirstPartyDomain(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstPartyDomain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHostOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHttpOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSameSite(value: SameSiteStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sameSite")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSecure(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secure")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSession(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("session")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStoreId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storeId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpirationDate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expirationDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpirationDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expirationDate")(js.undefined)
        ret
    }
  }
  
}

