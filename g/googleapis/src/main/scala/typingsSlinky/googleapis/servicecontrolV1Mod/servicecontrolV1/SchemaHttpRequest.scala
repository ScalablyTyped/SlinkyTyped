package typingsSlinky.googleapis.servicecontrolV1Mod.servicecontrolV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A common proto for logging HTTP requests. Only contains semantics defined
  * by the HTTP specification. Product-specific logging information MUST be
  * defined in a separate message.
  */
@js.native
trait SchemaHttpRequest extends js.Object {
  /**
    * The number of HTTP response bytes inserted into cache. Set only when a
    * cache fill was attempted.
    */
  var cacheFillBytes: js.UndefOr[String] = js.native
  /**
    * Whether or not an entity was served from cache (with or without
    * validation).
    */
  var cacheHit: js.UndefOr[Boolean] = js.native
  /**
    * Whether or not a cache lookup was attempted.
    */
  var cacheLookup: js.UndefOr[Boolean] = js.native
  /**
    * Whether or not the response was validated with the origin server before
    * being served from cache. This field is only meaningful if `cache_hit` is
    * True.
    */
  var cacheValidatedWithOriginServer: js.UndefOr[Boolean] = js.native
  /**
    * The request processing latency on the server, from the time the request
    * was received until the response was sent.
    */
  var latency: js.UndefOr[String] = js.native
  /**
    * Protocol used for the request. Examples: &quot;HTTP/1.1&quot;,
    * &quot;HTTP/2&quot;, &quot;websocket&quot;
    */
  var protocol: js.UndefOr[String] = js.native
  /**
    * The referer URL of the request, as defined in [HTTP/1.1 Header Field
    * Definitions](http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html).
    */
  var referer: js.UndefOr[String] = js.native
  /**
    * The IP address (IPv4 or IPv6) of the client that issued the HTTP request.
    * Examples: `&quot;192.168.1.1&quot;`,
    * `&quot;FE80::0202:B3FF:FE1E:8329&quot;`.
    */
  var remoteIp: js.UndefOr[String] = js.native
  /**
    * The request method. Examples: `&quot;GET&quot;`, `&quot;HEAD&quot;`,
    * `&quot;PUT&quot;`, `&quot;POST&quot;`.
    */
  var requestMethod: js.UndefOr[String] = js.native
  /**
    * The size of the HTTP request message in bytes, including the request
    * headers and the request body.
    */
  var requestSize: js.UndefOr[String] = js.native
  /**
    * The scheme (http, https), the host name, the path, and the query portion
    * of the URL that was requested. Example:
    * `&quot;http://example.com/some/info?color=red&quot;`.
    */
  var requestUrl: js.UndefOr[String] = js.native
  /**
    * The size of the HTTP response message sent back to the client, in bytes,
    * including the response headers and the response body.
    */
  var responseSize: js.UndefOr[String] = js.native
  /**
    * The IP address (IPv4 or IPv6) of the origin server that the request was
    * sent to.
    */
  var serverIp: js.UndefOr[String] = js.native
  /**
    * The response code indicating the status of the response. Examples: 200,
    * 404.
    */
  var status: js.UndefOr[Double] = js.native
  /**
    * The user agent sent by the client. Example: `&quot;Mozilla/4.0
    * (compatible; MSIE 6.0; Windows 98; Q312461; .NET CLR 1.0.3705)&quot;`.
    */
  var userAgent: js.UndefOr[String] = js.native
}

object SchemaHttpRequest {
  @scala.inline
  def apply(): SchemaHttpRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHttpRequest]
  }
  @scala.inline
  implicit class SchemaHttpRequestOps[Self <: SchemaHttpRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCacheFillBytes(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheFillBytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCacheFillBytes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheFillBytes")(js.undefined)
        ret
    }
    @scala.inline
    def withCacheHit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheHit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCacheHit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheHit")(js.undefined)
        ret
    }
    @scala.inline
    def withCacheLookup(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheLookup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCacheLookup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheLookup")(js.undefined)
        ret
    }
    @scala.inline
    def withCacheValidatedWithOriginServer(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheValidatedWithOriginServer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCacheValidatedWithOriginServer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheValidatedWithOriginServer")(js.undefined)
        ret
    }
    @scala.inline
    def withLatency(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLatency: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latency")(js.undefined)
        ret
    }
    @scala.inline
    def withProtocol(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protocol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProtocol: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protocol")(js.undefined)
        ret
    }
    @scala.inline
    def withReferer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReferer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referer")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoteIp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remoteIp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoteIp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remoteIp")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestMethod(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestMethod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestMethod")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestSize(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestSize")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withResponseSize(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponseSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseSize")(js.undefined)
        ret
    }
    @scala.inline
    def withServerIp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverIp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServerIp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverIp")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
    @scala.inline
    def withUserAgent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userAgent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserAgent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userAgent")(js.undefined)
        ret
    }
  }
  
}

