package typingsSlinky.jsCookie.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.jsCookie.jsCookieStrings.Lax
import typingsSlinky.jsCookie.jsCookieStrings.None
import typingsSlinky.jsCookie.jsCookieStrings.Strict
import typingsSlinky.jsCookie.jsCookieStrings.lax_
import typingsSlinky.jsCookie.jsCookieStrings.none_
import typingsSlinky.jsCookie.jsCookieStrings.strict_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CookieAttributes
  extends /**
  * An attribute which will be serialized, conformably to RFC 6265
  * section 5.2.
  */
/* property */ StringDictionary[js.Any] {
  /**
    * Define the domain where the cookie is available. Defaults to
    * the domain of the page where the cookie was created.
    */
  var domain: js.UndefOr[String] = js.native
  /**
    * Define when the cookie will be removed. Value can be a Number
    * which will be interpreted as days from time of creation or a
    * Date instance. If omitted, the cookie becomes a session cookie.
    */
  var expires: js.UndefOr[Double | js.Date] = js.native
  /**
    * Define the path where the cookie is available. Defaults to '/'
    */
  var path: js.UndefOr[String] = js.native
  /**
    * Asserts that a cookie must not be sent with cross-origin requests,
    * providing some protection against cross-site request forgery
    * attacks (CSRF)
    */
  var sameSite: js.UndefOr[strict_ | Strict | lax_ | Lax | none_ | None] = js.native
  /**
    * A Boolean indicating if the cookie transmission requires a
    * secure protocol (https). Defaults to false.
    */
  var secure: js.UndefOr[Boolean] = js.native
}

object CookieAttributes {
  @scala.inline
  def apply(): CookieAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CookieAttributes]
  }
  @scala.inline
  implicit class CookieAttributesOps[Self <: CookieAttributes] (val x: Self) extends AnyVal {
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
    def withoutDomain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domain")(js.undefined)
        ret
    }
    @scala.inline
    def withExpiresDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expires")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpires(value: Double | js.Date): Self = {
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
    def withSameSite(value: strict_ | Strict | lax_ | Lax | none_ | None): Self = {
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

