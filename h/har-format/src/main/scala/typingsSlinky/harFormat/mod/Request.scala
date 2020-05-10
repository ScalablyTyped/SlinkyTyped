package typingsSlinky.harFormat.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Request extends js.Object {
  /**
    * Size of the request body (POST data payload) in bytes.
    *
    * Set to `-1` if the info is not available.
    */
  var bodySize: Double = js.native
  /**  A comment provided by the user or the application */
  var comment: js.UndefOr[String] = js.native
  /** List of cookie objects. */
  var cookies: js.Array[Cookie] = js.native
  /** List of header objects. */
  var headers: js.Array[Header] = js.native
  /**
    * Total number of bytes from the start of the HTTP request message until
    * (and including) the double CRLF before the body.
    *
    * Set to `-1` if the info is not available.
    */
  var headersSize: Double = js.native
  /** Request HTTP Version. */
  var httpVersion: String = js.native
  /** Request method (`GET`, `POST`, ...). */
  var method: String = js.native
  /** Posted data info. */
  var postData: js.UndefOr[PostData] = js.native
  /** List of query parameter objects. */
  var queryString: js.Array[QueryString] = js.native
  /** Absolute URL of the request (fragments are not included). */
  var url: String = js.native
}

object Request {
  @scala.inline
  def apply(
    bodySize: Double,
    cookies: js.Array[Cookie],
    headers: js.Array[Header],
    headersSize: Double,
    httpVersion: String,
    method: String,
    queryString: js.Array[QueryString],
    url: String
  ): Request = {
    val __obj = js.Dynamic.literal(bodySize = bodySize.asInstanceOf[js.Any], cookies = cookies.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], headersSize = headersSize.asInstanceOf[js.Any], httpVersion = httpVersion.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], queryString = queryString.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Request]
  }
  @scala.inline
  implicit class RequestOps[Self <: Request] (val x: Self) extends AnyVal {
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
    def withMethod(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQueryString(value: js.Array[QueryString]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
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
    @scala.inline
    def withPostData(value: PostData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPostData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postData")(js.undefined)
        ret
    }
  }
  
}

