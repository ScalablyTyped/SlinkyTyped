package typingsSlinky.cookie.mod

import typingsSlinky.cookie.cookieStrings.lax
import typingsSlinky.cookie.cookieStrings.none
import typingsSlinky.cookie.cookieStrings.strict
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CookieSerializeOptions extends js.Object {
  /**
    * Specifies the value for the Domain Set-Cookie attribute. By default, no
    * domain is set, and most clients will consider the cookie to apply to only
    * the current domain.
    */
  var domain: js.UndefOr[String] = js.native
  /**
    * Specifies a function that will be used to encode a cookie's value. Since
    * value of a cookie has a limited character set (and must be a simple
    * string), this function can be used to encode a value into a string suited
    * for a cookie's value.
    *
    * The default function is the global `encodeURIComponent`, which will
    * encode a JavaScript string into UTF-8 byte sequences and then URL-encode
    * any that fall outside of the cookie range.
    */
  var encode: js.UndefOr[js.Function1[/* val */ String, String]] = js.native
  /**
    * Specifies the `Date` object to be the value for the `Expires`
    * `Set-Cookie` attribute. By default, no expiration is set, and most
    * clients will consider this a "non-persistent cookie" and will delete it
    * on a condition like exiting a web browser application.
    *
    * *Note* the cookie storage model specification states that if both
    * `expires` and `maxAge` are set, then `maxAge` takes precedence, but it is
    * possible not all clients by obey this, so if both are set, they should
    * point to the same date and time.
    */
  var expires: js.UndefOr[js.Date] = js.native
  /**
    * Specifies the boolean value for the `HttpOnly` `Set-Cookie` attribute.
    * When truthy, the `HttpOnly` attribute is set, otherwise it is not. By
    * default, the `HttpOnly` attribute is not set.
    *
    * *Note* be careful when setting this to true, as compliant clients will
    * not allow client-side JavaScript to see the cookie in `document.cookie`.
    */
  var httpOnly: js.UndefOr[Boolean] = js.native
  /**
    * Specifies the number (in seconds) to be the value for the `Max-Age`
    * `Set-Cookie` attribute. The given number will be converted to an integer
    * by rounding down. By default, no maximum age is set.
    *
    * *Note* the cookie storage model specification states that if both
    * `expires` and `maxAge` are set, then `maxAge` takes precedence, but it is
    * possible not all clients by obey this, so if both are set, they should
    * point to the same date and time.
    */
  var maxAge: js.UndefOr[Double] = js.native
  /**
    * Specifies the value for the `Path` `Set-Cookie` attribute. By default,
    * the path is considered the "default path".
    */
  var path: js.UndefOr[String] = js.native
  /**
    * Specifies the boolean or string to be the value for the `SameSite`
    * `Set-Cookie` attribute.
    *
    * - `true` will set the `SameSite` attribute to `Strict` for strict same
    * site enforcement.
    * - `false` will not set the `SameSite` attribute.
    * - `'lax'` will set the `SameSite` attribute to Lax for lax same site
    * enforcement.
    * - `'strict'` will set the `SameSite` attribute to Strict for strict same
    * site enforcement.
    *  - `'none'` will set the SameSite attribute to None for an explicit
    *  cross-site cookie.
    */
  var sameSite: js.UndefOr[Boolean | lax | strict | none] = js.native
  /**
    * Specifies the boolean value for the `Secure` `Set-Cookie` attribute. When
    * truthy, the `Secure` attribute is set, otherwise it is not. By default,
    * the `Secure` attribute is not set.
    *
    * *Note* be careful when setting this to `true`, as compliant clients will
    * not send the cookie back to the server in the future if the browser does
    * not have an HTTPS connection.
    */
  var secure: js.UndefOr[Boolean] = js.native
}

object CookieSerializeOptions {
  @scala.inline
  def apply(): CookieSerializeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CookieSerializeOptions]
  }
  @scala.inline
  implicit class CookieSerializeOptionsOps[Self <: CookieSerializeOptions] (val x: Self) extends AnyVal {
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
    def withEncode(value: /* val */ String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encode")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutEncode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encode")(js.undefined)
        ret
    }
    @scala.inline
    def withExpires(value: js.Date): Self = {
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
    def withHttpOnly(value: Boolean): Self = {
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
    def withMaxAge(value: Double): Self = {
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
    def withSameSite(value: Boolean | lax | strict | none): Self = {
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

