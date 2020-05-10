package typingsSlinky.googleAppsScript.GoogleAppsScript.URLFetch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait URLFetchRequestOptions extends js.Object {
  /**
    * the content type (defaults to 'application/x-www-form-urlencoded'). Another example of content
    * type is 'application/xml; charset=utf-8'.
    */
  var contentType: js.UndefOr[String] = js.native
  /**
    * if this is set to false, reserved characters in the URL will not be escaped (default: true)
    */
  var escaping: js.UndefOr[Boolean] = js.native
  /**
    * if this is set to false, the fetch not automatically follow HTTP redirects; it will return
    * the original HTTP response. The default is true.
    */
  var followRedirects: js.UndefOr[Boolean] = js.native
  /**
    * a JavaScript key/value map of HTTP headers for the request
    */
  var headers: js.UndefOr[HttpHeaders] = js.native
  /**
    * the HTTP method for the request: get, delete, patch, post, or put. The default is get.
    */
  var method: js.UndefOr[HttpMethod] = js.native
  /**
    * if this is set to true, the fetch will not throw an exception if the response code indicates
    * failure, and will instead return the HTTPResponse (default: false)
    */
  var muteHttpExceptions: js.UndefOr[Boolean] = js.native
  /**
    * the payload (e.g. POST body) for the request. Certain HTTP methods (e.g. GET) do not accept a
    * payload. It can be a string, a byte array, or a JavaScript object. A JavaScript object will be
    * interpretted as a map of form field names to values, where the values can be either strings or blobs.
    */
  var payload: js.UndefOr[Payload] = js.native
  /**
    * Deprecated. This instructs fetch to resolve the specified URL within the intranet linked to your
    * domain through (deprecated) SDC
    */
  var useIntranet: js.UndefOr[Boolean] = js.native
  /**
    * if this is set to false, the fetch will ignore any invalid certificates for HTTPS requests.
    * The default is true.
    */
  var validateHttpsCertificates: js.UndefOr[Boolean] = js.native
}

object URLFetchRequestOptions {
  @scala.inline
  def apply(): URLFetchRequestOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[URLFetchRequestOptions]
  }
  @scala.inline
  implicit class URLFetchRequestOptionsOps[Self <: URLFetchRequestOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContentType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentType")(js.undefined)
        ret
    }
    @scala.inline
    def withEscaping(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("escaping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEscaping: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("escaping")(js.undefined)
        ret
    }
    @scala.inline
    def withFollowRedirects(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("followRedirects")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFollowRedirects: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("followRedirects")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaders(value: HttpHeaders): Self = {
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
    def withMethod(value: HttpMethod): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(js.undefined)
        ret
    }
    @scala.inline
    def withMuteHttpExceptions(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("muteHttpExceptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMuteHttpExceptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("muteHttpExceptions")(js.undefined)
        ret
    }
    @scala.inline
    def withPayload(value: Payload): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPayload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payload")(js.undefined)
        ret
    }
    @scala.inline
    def withUseIntranet(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useIntranet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseIntranet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useIntranet")(js.undefined)
        ret
    }
    @scala.inline
    def withValidateHttpsCertificates(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validateHttpsCertificates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidateHttpsCertificates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validateHttpsCertificates")(js.undefined)
        ret
    }
  }
  
}

