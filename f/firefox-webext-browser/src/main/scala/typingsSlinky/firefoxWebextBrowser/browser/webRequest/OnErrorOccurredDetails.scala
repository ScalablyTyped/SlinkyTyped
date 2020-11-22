package typingsSlinky.firefoxWebextBrowser.browser.webRequest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnErrorOccurredDetails extends js.Object {
  
  /** The cookie store ID of the contextual identity. */
  var cookieStoreId: js.UndefOr[String] = js.native
  
  /** URL of the page into which the requested resource will be loaded. */
  var documentUrl: js.UndefOr[String] = js.native
  
  /**
    * The error description. This string is _not_ guaranteed to remain backwards compatible between releases. You must not parse and act based upon its content.
    */
  var error: String = js.native
  
  /**
    * The value 0 indicates that the request happens in the main frame; a positive value indicates the ID of a subframe in which the request happens. If the document of a (sub-)frame is loaded (`type` is `main_frame` or `sub_frame`), `frameId` indicates the ID of this frame, not the ID of the outer frame. Frame IDs are unique within a tab.
    */
  var frameId: Double = js.native
  
  /** Indicates if this response was fetched from disk cache. */
  var fromCache: Boolean = js.native
  
  /** True for private browsing requests. */
  var incognito: js.UndefOr[Boolean] = js.native
  
  /**
    * The server IP address that the request was actually sent to. Note that it may be a literal IPv6 address.
    */
  var ip: js.UndefOr[String] = js.native
  
  /** Standard HTTP method. */
  var method: String = js.native
  
  /** URL of the resource that triggered this request. */
  var originUrl: js.UndefOr[String] = js.native
  
  /** ID of frame that wraps the frame which sent the request. Set to -1 if no parent frame exists. */
  var parentFrameId: Double = js.native
  
  /**
    * The ID of the request. Request IDs are unique within a browser session. As a result, they could be used to relate different events of the same request.
    */
  var requestId: String = js.native
  
  /** The ID of the tab in which the request takes place. Set to -1 if the request isn't related to a tab. */
  var tabId: Double = js.native
  
  /** Indicates if this request and its content window hierarchy is third party. */
  var thirdParty: Boolean = js.native
  
  /** The time when this signal is triggered, in milliseconds since the epoch. */
  var timeStamp: Double = js.native
  
  /** How the requested resource will be used. */
  var `type`: ResourceType = js.native
  
  var url: String = js.native
  
  /** Tracking classification if the request has been classified. */
  var urlClassification: js.UndefOr[UrlClassification] = js.native
}
object OnErrorOccurredDetails {
  
  @scala.inline
  def apply(
    error: String,
    frameId: Double,
    fromCache: Boolean,
    method: String,
    parentFrameId: Double,
    requestId: String,
    tabId: Double,
    thirdParty: Boolean,
    timeStamp: Double,
    `type`: ResourceType,
    url: String
  ): OnErrorOccurredDetails = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], frameId = frameId.asInstanceOf[js.Any], fromCache = fromCache.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], parentFrameId = parentFrameId.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any], tabId = tabId.asInstanceOf[js.Any], thirdParty = thirdParty.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnErrorOccurredDetails]
  }
  
  @scala.inline
  implicit class OnErrorOccurredDetailsOps[Self <: OnErrorOccurredDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setError(value: String): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrameId(value: Double): Self = this.set("frameId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromCache(value: Boolean): Self = this.set("fromCache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentFrameId(value: Double): Self = this.set("parentFrameId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestId(value: String): Self = this.set("requestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabId(value: Double): Self = this.set("tabId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThirdParty(value: Boolean): Self = this.set("thirdParty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeStamp(value: Double): Self = this.set("timeStamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: ResourceType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCookieStoreId(value: String): Self = this.set("cookieStoreId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCookieStoreId: Self = this.set("cookieStoreId", js.undefined)
    
    @scala.inline
    def setDocumentUrl(value: String): Self = this.set("documentUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocumentUrl: Self = this.set("documentUrl", js.undefined)
    
    @scala.inline
    def setIncognito(value: Boolean): Self = this.set("incognito", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncognito: Self = this.set("incognito", js.undefined)
    
    @scala.inline
    def setIp(value: String): Self = this.set("ip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIp: Self = this.set("ip", js.undefined)
    
    @scala.inline
    def setOriginUrl(value: String): Self = this.set("originUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOriginUrl: Self = this.set("originUrl", js.undefined)
    
    @scala.inline
    def setUrlClassification(value: UrlClassification): Self = this.set("urlClassification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrlClassification: Self = this.set("urlClassification", js.undefined)
  }
}
