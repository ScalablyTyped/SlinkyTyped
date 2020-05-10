package typingsSlinky.firefoxWebextBrowser

import typingsSlinky.firefoxWebextBrowser.browser.webRequest.HttpHeaders
import typingsSlinky.firefoxWebextBrowser.browser.webRequest.ResourceType
import typingsSlinky.firefoxWebextBrowser.browser.webRequest.UrlClassification
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonChallenger extends js.Object {
  /** The server requesting authentication. */
  var challenger: AnonHost = js.native
  /** The cookie store ID of the contextual identity. */
  var cookieStoreId: js.UndefOr[String] = js.native
  /** URL of the page into which the requested resource will be loaded. */
  var documentUrl: js.UndefOr[String] = js.native
  /**
    * The value 0 indicates that the request happens in the main frame; a positive value indicates the ID of a
    * subframe in which the request happens. If the document of a (sub-)frame is loaded (`type` is `main_frame` or
    * `sub_frame`), `frameId` indicates the ID of this frame, not the ID of the outer frame. Frame IDs are unique
    * within a tab.
    */
  var frameId: Double = js.native
  /** True for private browsing requests. */
  var incognito: js.UndefOr[Boolean] = js.native
  /** True for Proxy-Authenticate, false for WWW-Authenticate. */
  var isProxy: Boolean = js.native
  /** Standard HTTP method. */
  var method: String = js.native
  /** URL of the resource that triggered this request. */
  var originUrl: js.UndefOr[String] = js.native
  /** ID of frame that wraps the frame which sent the request. Set to -1 if no parent frame exists. */
  var parentFrameId: Double = js.native
  /** The authentication realm provided by the server, if there is one. */
  var realm: js.UndefOr[String] = js.native
  /**
    * The ID of the request. Request IDs are unique within a browser session. As a result, they could be used to
    * relate different events of the same request.
    */
  var requestId: String = js.native
  /** The HTTP response headers that were received along with this response. */
  var responseHeaders: js.UndefOr[HttpHeaders] = js.native
  /** The authentication scheme, e.g. Basic or Digest. */
  var scheme: String = js.native
  /** Standard HTTP status code returned by the server. */
  var statusCode: Double = js.native
  /**
    * HTTP status line of the response or the 'HTTP/0.9 200 OK' string for HTTP/0.9 responses (i.e., responses
    * that lack a status line) or an empty string if there are no headers.
    */
  var statusLine: String = js.native
  /** The ID of the tab in which the request takes place. Set to -1 if the request isn't related to a tab. */
  var tabId: Double = js.native
  /** The time when this signal is triggered, in milliseconds since the epoch. */
  var timeStamp: Double = js.native
  /** How the requested resource will be used. */
  var `type`: ResourceType = js.native
  var url: String = js.native
  /** Tracking classification if the request has been classified. */
  var urlClassification: js.UndefOr[UrlClassification] = js.native
}

object AnonChallenger {
  @scala.inline
  def apply(
    challenger: AnonHost,
    frameId: Double,
    isProxy: Boolean,
    method: String,
    parentFrameId: Double,
    requestId: String,
    scheme: String,
    statusCode: Double,
    statusLine: String,
    tabId: Double,
    timeStamp: Double,
    `type`: ResourceType,
    url: String
  ): AnonChallenger = {
    val __obj = js.Dynamic.literal(challenger = challenger.asInstanceOf[js.Any], frameId = frameId.asInstanceOf[js.Any], isProxy = isProxy.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], parentFrameId = parentFrameId.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any], scheme = scheme.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any], statusLine = statusLine.asInstanceOf[js.Any], tabId = tabId.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonChallenger]
  }
  @scala.inline
  implicit class AnonChallengerOps[Self <: AnonChallenger] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChallenger(value: AnonHost): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("challenger")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFrameId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frameId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsProxy(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isProxy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMethod(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParentFrameId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentFrameId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequestId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScheme(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scheme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatusCode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatusLine(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTabId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimeStamp(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeStamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: ResourceType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCookieStoreId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cookieStoreId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCookieStoreId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cookieStoreId")(js.undefined)
        ret
    }
    @scala.inline
    def withDocumentUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDocumentUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withIncognito(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("incognito")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncognito: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("incognito")(js.undefined)
        ret
    }
    @scala.inline
    def withOriginUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOriginUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withRealm(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("realm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRealm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("realm")(js.undefined)
        ret
    }
    @scala.inline
    def withResponseHeaders(value: HttpHeaders): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseHeaders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponseHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseHeaders")(js.undefined)
        ret
    }
    @scala.inline
    def withUrlClassification(value: UrlClassification): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("urlClassification")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrlClassification: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("urlClassification")(js.undefined)
        ret
    }
  }
  
}

