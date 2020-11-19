package typingsSlinky.devtoolsProtocol.mod.Protocol.Network

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebSocketFrameSentEvent extends js.Object {
  
  /**
    * Request identifier.
    */
  var requestId: RequestId = js.native
  
  /**
    * WebSocket response data.
    */
  var response: WebSocketFrame = js.native
  
  /**
    * Timestamp.
    */
  var timestamp: MonotonicTime = js.native
}
object WebSocketFrameSentEvent {
  
  @scala.inline
  def apply(requestId: RequestId, response: WebSocketFrame, timestamp: MonotonicTime): WebSocketFrameSentEvent = {
    val __obj = js.Dynamic.literal(requestId = requestId.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebSocketFrameSentEvent]
  }
  
  @scala.inline
  implicit class WebSocketFrameSentEventOps[Self <: WebSocketFrameSentEvent] (val x: Self) extends AnyVal {
    
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
    def setRequestId(value: RequestId): Self = this.set("requestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: WebSocketFrame): Self = this.set("response", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: MonotonicTime): Self = this.set("timestamp", value.asInstanceOf[js.Any])
  }
}
