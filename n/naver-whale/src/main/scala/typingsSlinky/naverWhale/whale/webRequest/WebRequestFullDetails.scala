package typingsSlinky.naverWhale.whale.webRequest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.chrome.chrome.webRequest.ResourceRequest because Already inherited
- typingsSlinky.chrome.chrome.webRequest.WebRequestDetails because Already inherited
- typingsSlinky.chrome.chrome.webRequest.WebRequestBodyDetails because var conflicts: frameId, initiator, method, parentFrameId, requestId, tabId, timeStamp, `type`, url. Inlined requestBody */ @js.native
trait WebRequestFullDetails
  extends typingsSlinky.chrome.chrome.webRequest.WebRequestHeadersDetails {
  
  /**
    * Contains the HTTP request body data. Only provided if extraInfoSpec contains 'requestBody'.
    * @since Chrome 23.
    */
  var requestBody: typingsSlinky.chrome.chrome.webRequest.WebRequestBody = js.native
}
object WebRequestFullDetails {
  
  @scala.inline
  def apply(
    frameId: Double,
    method: String,
    parentFrameId: Double,
    requestBody: typingsSlinky.chrome.chrome.webRequest.WebRequestBody,
    requestId: String,
    tabId: Double,
    timeStamp: Double,
    `type`: typingsSlinky.chrome.chrome.webRequest.ResourceType,
    url: String
  ): WebRequestFullDetails = {
    val __obj = js.Dynamic.literal(frameId = frameId.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], parentFrameId = parentFrameId.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any], tabId = tabId.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebRequestFullDetails]
  }
  
  @scala.inline
  implicit class WebRequestFullDetailsMutableBuilder[Self <: WebRequestFullDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRequestBody(value: typingsSlinky.chrome.chrome.webRequest.WebRequestBody): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
  }
}
