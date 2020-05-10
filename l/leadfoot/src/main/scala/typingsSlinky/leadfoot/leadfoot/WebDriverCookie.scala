package typingsSlinky.leadfoot.leadfoot

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * An object that describes an HTTP cookie.
	 */
@js.native
trait WebDriverCookie extends js.Object {
  /**
  		 * The registered domain for the cookie.
  		 */
  var domain: String = js.native
  /**
  		 * The expiration date of the cookie.
  		 */
  var expiry: js.Date = js.native
  /**
  		 * True if the cookie should be inaccessible to client-side scripting.
  		 */
  var httpOnly: Boolean = js.native
  /**
  		 * The name of the cookie.
  		 */
  var name: String = js.native
  /**
  		 * The registered path for the cookie.
  		 */
  var path: String = js.native
  /**
  		 * True if the cookie should only be transmitted over HTTPS.
  		 */
  var secure: Boolean = js.native
  /**
  		 * The value of the cookie.
  		 */
  var value: String = js.native
}

object WebDriverCookie {
  @scala.inline
  def apply(
    domain: String,
    expiry: js.Date,
    httpOnly: Boolean,
    name: String,
    path: String,
    secure: Boolean,
    value: String
  ): WebDriverCookie = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], expiry = expiry.asInstanceOf[js.Any], httpOnly = httpOnly.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], secure = secure.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebDriverCookie]
  }
  @scala.inline
  implicit class WebDriverCookieOps[Self <: WebDriverCookie] (val x: Self) extends AnyVal {
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
    def withExpiry(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expiry")(value.asInstanceOf[js.Any])
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
    def withSecure(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secure")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

