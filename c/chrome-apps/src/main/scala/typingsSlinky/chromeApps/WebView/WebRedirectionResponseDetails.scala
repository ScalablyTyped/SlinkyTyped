package typingsSlinky.chromeApps.WebView

import typingsSlinky.chromeApps.chrome.double
import typingsSlinky.chromeApps.chrome.integer
import typingsSlinky.chromeApps.chrome.webRequest.ResourceType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebRedirectionResponseDetails extends WebResponseCacheDetails {
  
  /** The new URL. */
  var redirectUrl: String = js.native
}
object WebRedirectionResponseDetails {
  
  @scala.inline
  def apply(
    frameId: integer,
    fromCache: Boolean,
    method: String,
    parentFrameId: integer,
    redirectUrl: String,
    requestId: String,
    statusCode: integer,
    statusLine: String,
    tabId: integer,
    timeStamp: double,
    `type`: ResourceType,
    url: String
  ): WebRedirectionResponseDetails = {
    val __obj = js.Dynamic.literal(frameId = frameId.asInstanceOf[js.Any], fromCache = fromCache.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], parentFrameId = parentFrameId.asInstanceOf[js.Any], redirectUrl = redirectUrl.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any], statusLine = statusLine.asInstanceOf[js.Any], tabId = tabId.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebRedirectionResponseDetails]
  }
  
  @scala.inline
  implicit class WebRedirectionResponseDetailsOps[Self <: WebRedirectionResponseDetails] (val x: Self) extends AnyVal {
    
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
    def setRedirectUrl(value: String): Self = this.set("redirectUrl", value.asInstanceOf[js.Any])
  }
}
