package typingsSlinky.googleapis.monitoringV3Mod.monitoringV3

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information involved in an HTTP/HTTPS uptime check request.
  */
@js.native
trait SchemaHttpCheck extends js.Object {
  /**
    * The authentication information. Optional when creating an HTTP check;
    * defaults to empty.
    */
  var authInfo: js.UndefOr[SchemaBasicAuthentication] = js.native
  /**
    * The list of headers to send as part of the uptime check request. If two
    * headers have the same key and different values, they should be entered as
    * a single header, with the value being a comma-separated list of all the
    * desired values as described at
    * https://www.w3.org/Protocols/rfc2616/rfc2616.txt (page 31). Entering two
    * separate headers with the same key in a Create call will cause the first
    * to be overwritten by the second. The maximum number of headers allowed is
    * 100.
    */
  var headers: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * Boolean specifiying whether to encrypt the header information. Encryption
    * should be specified for any headers related to authentication that you do
    * not wish to be seen when retrieving the configuration. The server will be
    * responsible for encrypting the headers. On Get/List calls, if
    * mask_headers is set to True then the headers will be obscured with
    * ******.
    */
  var maskHeaders: js.UndefOr[Boolean] = js.native
  /**
    * The path to the page to run the check against. Will be combined with the
    * host (specified within the MonitoredResource) and port to construct the
    * full URL. Optional (defaults to &quot;/&quot;). If the provided path does
    * not begin with &quot;/&quot;, it will be prepended automatically.
    */
  var path: js.UndefOr[String] = js.native
  /**
    * The port to the page to run the check against. Will be combined with host
    * (specified within the MonitoredResource) and path to construct the full
    * URL. Optional (defaults to 80 without SSL, or 443 with SSL).
    */
  var port: js.UndefOr[Double] = js.native
  /**
    * If true, use HTTPS instead of HTTP to run the check.
    */
  var useSsl: js.UndefOr[Boolean] = js.native
}

object SchemaHttpCheck {
  @scala.inline
  def apply(): SchemaHttpCheck = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHttpCheck]
  }
  @scala.inline
  implicit class SchemaHttpCheckOps[Self <: SchemaHttpCheck] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthInfo(value: SchemaBasicAuthentication): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaders(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(js.undefined)
        ret
    }
    @scala.inline
    def withMaskHeaders(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maskHeaders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaskHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maskHeaders")(js.undefined)
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
    def withPort(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(js.undefined)
        ret
    }
    @scala.inline
    def withUseSsl(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useSsl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseSsl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useSsl")(js.undefined)
        ret
    }
  }
  
}

