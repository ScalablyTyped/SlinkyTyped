package typingsSlinky.naverWhale.whale.webRequest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebResponseHeadersDetails
  extends typingsSlinky.chrome.chrome.webRequest.WebResponseDetails {
  
  var method: String = js.native
  
  /** Optional. The HTTP response headers that have been received with this response. */
  var responseHeaders: js.UndefOr[js.Array[typingsSlinky.chrome.chrome.webRequest.HttpHeader]] = js.native
}
object WebResponseHeadersDetails {
  
  @scala.inline
  def apply(
    frameId: Double,
    method: String,
    parentFrameId: Double,
    requestId: String,
    statusCode: Double,
    statusLine: String,
    tabId: Double,
    timeStamp: Double,
    `type`: typingsSlinky.chrome.chrome.webRequest.ResourceType,
    url: String
  ): WebResponseHeadersDetails = {
    val __obj = js.Dynamic.literal(frameId = frameId.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], parentFrameId = parentFrameId.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any], statusLine = statusLine.asInstanceOf[js.Any], tabId = tabId.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebResponseHeadersDetails]
  }
  
  @scala.inline
  implicit class WebResponseHeadersDetailsOps[Self <: WebResponseHeadersDetails] (val x: Self) extends AnyVal {
    
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
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseHeadersVarargs(value: typingsSlinky.chrome.chrome.webRequest.HttpHeader*): Self = this.set("responseHeaders", js.Array(value :_*))
    
    @scala.inline
    def setResponseHeaders(value: js.Array[typingsSlinky.chrome.chrome.webRequest.HttpHeader]): Self = this.set("responseHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponseHeaders: Self = this.set("responseHeaders", js.undefined)
  }
}
