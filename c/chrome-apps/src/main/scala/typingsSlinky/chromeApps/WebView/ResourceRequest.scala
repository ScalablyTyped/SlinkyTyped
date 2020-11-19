package typingsSlinky.chromeApps.WebView

import typingsSlinky.chromeApps.chrome.double
import typingsSlinky.chromeApps.chrome.integer
import typingsSlinky.chromeApps.chrome.webRequest.ResourceType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResourceRequest extends js.Object {
  
  /** The value 0 indicates that the request happens in the main frame; a positive value indicates the ID of a subframe in which the request happens. If the document of a (sub-)frame is loaded (type is main_frame or sub_frame), frameId indicates the ID of this frame, not the ID of the outer frame. Frame IDs are unique within a tab. */
  var frameId: integer = js.native
  
  /** The origin where the request was initiated. This does not change through redirects. If this is an opaque origin, the string 'null' will be used.
    * @since Chrome 63.
    */
  var initiator: js.UndefOr[String] = js.native
  
  /** ID of frame that wraps the frame which sent the request. Set to -1 if no parent frame exists. */
  var parentFrameId: integer = js.native
  
  /** The ID of the request. Request IDs are unique within a browser session. As a result, they could be used to relate different events of the same request. */
  var requestId: String = js.native
  
  /** The ID of the tab in which the request takes place. Set to -1 if the request isn't related to a tab. */
  var tabId: integer = js.native
  
  /** The time when this signal is triggered, in milliseconds since the epoch. */
  var timeStamp: double = js.native
  
  /**
    * How the requested resource will be used.
    */
  var `type`: ResourceType = js.native
  
  var url: String = js.native
}
object ResourceRequest {
  
  @scala.inline
  def apply(
    frameId: integer,
    parentFrameId: integer,
    requestId: String,
    tabId: integer,
    timeStamp: double,
    `type`: ResourceType,
    url: String
  ): ResourceRequest = {
    val __obj = js.Dynamic.literal(frameId = frameId.asInstanceOf[js.Any], parentFrameId = parentFrameId.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any], tabId = tabId.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceRequest]
  }
  
  @scala.inline
  implicit class ResourceRequestOps[Self <: ResourceRequest] (val x: Self) extends AnyVal {
    
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
    def setFrameId(value: integer): Self = this.set("frameId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentFrameId(value: integer): Self = this.set("parentFrameId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestId(value: String): Self = this.set("requestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabId(value: integer): Self = this.set("tabId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeStamp(value: double): Self = this.set("timeStamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: ResourceType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitiator(value: String): Self = this.set("initiator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitiator: Self = this.set("initiator", js.undefined)
  }
}
