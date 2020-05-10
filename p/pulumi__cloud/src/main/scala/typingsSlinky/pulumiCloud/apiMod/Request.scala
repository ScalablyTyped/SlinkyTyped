package typingsSlinky.pulumiCloud.apiMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Request extends js.Object {
  /**
    * The base url on which this http request was served.
    */
  var baseUrl: String = js.native
  /**
    * The body of the HTTP request.
    */
  var body: Buffer = js.native
  /**
    * The headers of the HTTP request.
    */
  var headers: StringDictionary[String | js.Array[String]] = js.native
  /**
    * The hostname of the request.
    */
  var hostname: String = js.native
  /**
    * The method of the HTTP request.
    */
  var method: String = js.native
  /**
    * The path parameters of the HTTP request. Each `{param}` in the matched
    * route is available as a property of this oject.
    */
  var params: StringDictionary[String] = js.native
  /**
    * The raw path from the HTTP request.
    */
  var path: String = js.native
  /**
    * The protocol of the request (e.g. HTTP/HTTPS).
    */
  var protocol: String = js.native
  /**
    * The query parameters parsed from the query string of the request URL.
    */
  var query: StringDictionary[String | js.Array[String]] = js.native
  /**
    * The headers of the HTTP request.
    */
  var rawHeaders: js.Array[String] = js.native
}

object Request {
  @scala.inline
  def apply(
    baseUrl: String,
    body: Buffer,
    headers: StringDictionary[String | js.Array[String]],
    hostname: String,
    method: String,
    params: StringDictionary[String],
    path: String,
    protocol: String,
    query: StringDictionary[String | js.Array[String]],
    rawHeaders: js.Array[String]
  ): Request = {
    val __obj = js.Dynamic.literal(baseUrl = baseUrl.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], hostname = hostname.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], rawHeaders = rawHeaders.asInstanceOf[js.Any])
    __obj.asInstanceOf[Request]
  }
  @scala.inline
  implicit class RequestOps[Self <: Request] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBaseUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBody(value: Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeaders(value: StringDictionary[String | js.Array[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHostname(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostname")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMethod(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParams(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("params")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProtocol(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protocol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQuery(value: StringDictionary[String | js.Array[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRawHeaders(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rawHeaders")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

