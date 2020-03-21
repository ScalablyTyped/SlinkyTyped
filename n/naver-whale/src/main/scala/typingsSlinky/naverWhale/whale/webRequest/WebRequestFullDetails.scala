package typingsSlinky.naverWhale.whale.webRequest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typingsSlinky.chrome.chrome.webRequest.ResourceRequest because Already inherited
- typingsSlinky.chrome.chrome.webRequest.WebRequestDetails because Already inherited
- typingsSlinky.chrome.chrome.webRequest.WebRequestBodyDetails because var conflicts: frameId, initiator, method, parentFrameId, requestId, tabId, timeStamp, `type`, url. Inlined requestBody */ trait WebRequestFullDetails
  extends typingsSlinky.chrome.chrome.webRequest.WebRequestHeadersDetails {
  /**
    * Contains the HTTP request body data. Only provided if extraInfoSpec contains 'requestBody'.
    * @since Chrome 23.
    */
  var requestBody: typingsSlinky.chrome.chrome.webRequest.WebRequestBody
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
    url: String,
    initiator: String = null,
    requestHeaders: js.Array[typingsSlinky.chrome.chrome.webRequest.HttpHeader] = null
  ): WebRequestFullDetails = {
    val __obj = js.Dynamic.literal(frameId = frameId.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], parentFrameId = parentFrameId.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any], tabId = tabId.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (initiator != null) __obj.updateDynamic("initiator")(initiator.asInstanceOf[js.Any])
    if (requestHeaders != null) __obj.updateDynamic("requestHeaders")(requestHeaders.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebRequestFullDetails]
  }
}

