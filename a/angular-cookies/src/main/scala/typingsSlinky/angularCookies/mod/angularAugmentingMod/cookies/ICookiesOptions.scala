package typingsSlinky.angularCookies.mod.angularAugmentingMod.cookies

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Cookies options
  * see https://docs.angularjs.org/api/ngCookies/provider/$cookiesProvider#defaults
  */
@js.native
trait ICookiesOptions extends js.Object {
  /**
    * The cookie will be available only for this domain and its sub-domains.
    * For obvious security reasons the user agent will not accept the cookie if the
    * current domain is not a sub domain or equals to the requested domain.
    */
  var domain: js.UndefOr[String] = js.native
  /**
    * String of the form "Wdy, DD Mon YYYY HH:MM:SS GMT" or a Date object
    * indicating the exact date/time this cookie will expire.
    */
  var expires: js.UndefOr[String | js.Date] = js.native
  /**
    * The cookie will be available only for this path and its sub-paths.
    * By default, this would be the URL that appears in your base tag.
    */
  var path: js.UndefOr[String] = js.native
  /**
    * The cookie will be available only in secured connection.
    */
  var secure: js.UndefOr[Boolean] = js.native
}

object ICookiesOptions {
  @scala.inline
  def apply(): ICookiesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICookiesOptions]
  }
  @scala.inline
  implicit class ICookiesOptionsOps[Self <: ICookiesOptions] (val x: Self) extends AnyVal {
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
    def withExpires(value: String | js.Date): Self = {
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

