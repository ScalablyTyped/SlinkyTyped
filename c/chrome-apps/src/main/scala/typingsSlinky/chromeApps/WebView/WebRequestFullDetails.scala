package typingsSlinky.chromeApps.WebView

import typingsSlinky.chromeApps.chrome.double
import typingsSlinky.chromeApps.chrome.integer
import typingsSlinky.chromeApps.chrome.webRequest.ResourceType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.chromeApps.WebView.ResourceRequest because Already inherited
- typingsSlinky.chromeApps.WebView.WebRequestDetails because Already inherited
- typingsSlinky.chromeApps.WebView.WebRequestBodyDetails because var conflicts: frameId, initiator, method, parentFrameId, requestId, tabId, timeStamp, `type`, url. Inlined requestBody */ @js.native
trait WebRequestFullDetails extends WebRequestHeadersDetails {
  
  /**
    * Contains the HTTP request body data. Only provided if extraInfoSpec contains 'requestBody'.
    * @since Chrome 23.
    */
  var requestBody: WebRequestBody = js.native
}
object WebRequestFullDetails {
  
  @scala.inline
  def apply(
    frameId: integer,
    method: String,
    parentFrameId: integer,
    requestBody: WebRequestBody,
    requestId: String,
    tabId: integer,
    timeStamp: double,
    `type`: ResourceType,
    url: String
  ): WebRequestFullDetails = {
    val __obj = js.Dynamic.literal(frameId = frameId.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], parentFrameId = parentFrameId.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any], tabId = tabId.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebRequestFullDetails]
  }
  
  @scala.inline
  implicit class WebRequestFullDetailsMutableBuilder[Self <: WebRequestFullDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRequestBody(value: WebRequestBody): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
  }
}
