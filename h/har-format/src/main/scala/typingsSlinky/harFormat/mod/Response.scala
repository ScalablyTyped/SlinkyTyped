package typingsSlinky.harFormat.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Response extends js.Object {
  /** _non-standard_  */
  var _transferSize: js.UndefOr[Double | Null] = js.native
  /**
    * Size of the received response body in bytes.
    *
    * - Set to zero in case of responses coming from the cache (`304`).
    * - Set to `-1` if the info is not available.
    */
  var bodySize: Double = js.native
  /**  A comment provided by the user or the application */
  var comment: js.UndefOr[String] = js.native
  /** Details about the response body. */
  var content: Content = js.native
  /** List of cookie objects. */
  var cookies: js.Array[Cookie] = js.native
  /** List of header objects. */
  var headers: js.Array[Header] = js.native
  /**
    * Total number of bytes from the start of the HTTP response message until
    * (and including) the double CRLF before the body.
    *
    * Set to `-1` if the info is not available.
    *
    * _The size of received response-headers is computed only from headers
    * that are really received from the server. Additional headers appended by
    * the browser are not included in this number, but they appear in the list
    * of header objects._
    */
  var headersSize: Double = js.native
  /** Response HTTP Version. */
  var httpVersion: String = js.native
  /** Redirection target URL from the Location response header. */
  var redirectURL: String = js.native
  /** Response status. */
  var status: Double = js.native
  /** Response status description. */
  var statusText: String = js.native
}

object Response {
  @scala.inline
  def apply(
    bodySize: Double,
    content: Content,
    cookies: js.Array[Cookie],
    headers: js.Array[Header],
    headersSize: Double,
    httpVersion: String,
    redirectURL: String,
    status: Double,
    statusText: String
  ): Response = {
    val __obj = js.Dynamic.literal(bodySize = bodySize.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], cookies = cookies.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], headersSize = headersSize.asInstanceOf[js.Any], httpVersion = httpVersion.asInstanceOf[js.Any], redirectURL = redirectURL.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusText = statusText.asInstanceOf[js.Any])
    __obj.asInstanceOf[Response]
  }
  @scala.inline
  implicit class ResponseOps[Self <: Response] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBodySize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodySize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContent(value: Content): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCookies(value: js.Array[Cookie]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cookies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeaders(value: js.Array[Header]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeadersSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headersSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHttpVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRedirectURL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redirectURL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatusText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_transferSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_transferSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_transferSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_transferSize")(js.undefined)
        ret
    }
    @scala.inline
    def with_transferSizeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_transferSize")(null)
        ret
    }
    @scala.inline
    def withComment(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comment")(js.undefined)
        ret
    }
  }
  
}

