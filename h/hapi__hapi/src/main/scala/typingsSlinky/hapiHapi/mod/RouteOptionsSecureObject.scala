package typingsSlinky.hapiHapi.mod

import typingsSlinky.hapiHapi.AnonIncludeSubDomains
import typingsSlinky.hapiHapi.AnonRule
import typingsSlinky.hapiHapi.hapiHapiBooleans.`false`
import typingsSlinky.hapiHapi.hapiHapiBooleans.`true`
import typingsSlinky.hapiHapi.hapiHapiStrings.deny
import typingsSlinky.hapiHapi.hapiHapiStrings.sameorigin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RouteOptionsSecureObject extends js.Object {
  /**
    * hsts - controls the 'Strict-Transport-Security' header
    */
  var hsts: js.UndefOr[Boolean | Double | AnonIncludeSubDomains] = js.native
  /**
    * boolean controlling the 'X-Download-Options' header for Internet Explorer, preventing downloads from executing in your context. Defaults to true setting the header to 'noopen'.
    */
  var noOpen: js.UndefOr[Boolean] = js.native
  /**
    * boolean controlling the 'X-Content-Type-Options' header. Defaults to true setting the header to its only and default option, 'nosniff'.
    */
  var noSniff: js.UndefOr[Boolean] = js.native
  /**
    * Controls the `Referrer-Policy` header, which has the following possible values.
    * @default false Header will not be send.
    */
  var referrer: js.UndefOr[`false` | ReferrerPolicy] = js.native
  /**
    * controls the 'X-Frame-Options' header
    */
  var xframe: js.UndefOr[`true` | deny | sameorigin | AnonRule] = js.native
  /**
    * boolean that controls the 'X-XSS-PROTECTION' header for Internet Explorer. Defaults to true which sets the header to equal '1; mode=block'.
    * Note: this setting can create a security vulnerability in versions of Internet Exploere below 8, as well as unpatched versions of IE8. See here and here for more information. If you actively
    * support old versions of IE, it may be wise to explicitly set this flag to false.
    */
  var xss: Boolean = js.native
}

object RouteOptionsSecureObject {
  @scala.inline
  def apply(xss: Boolean): RouteOptionsSecureObject = {
    val __obj = js.Dynamic.literal(xss = xss.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteOptionsSecureObject]
  }
  @scala.inline
  implicit class RouteOptionsSecureObjectOps[Self <: RouteOptionsSecureObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withXss(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xss")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHsts(value: Boolean | Double | AnonIncludeSubDomains): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hsts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHsts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hsts")(js.undefined)
        ret
    }
    @scala.inline
    def withNoOpen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noOpen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noOpen")(js.undefined)
        ret
    }
    @scala.inline
    def withNoSniff(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noSniff")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoSniff: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noSniff")(js.undefined)
        ret
    }
    @scala.inline
    def withReferrer(value: `false` | ReferrerPolicy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referrer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReferrer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referrer")(js.undefined)
        ret
    }
    @scala.inline
    def withXframe(value: `true` | deny | sameorigin | AnonRule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xframe")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXframe: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xframe")(js.undefined)
        ret
    }
  }
  
}

