package typingsSlinky.devtoolsProtocol.mod.Protocol.Page

import typingsSlinky.devtoolsProtocol.mod.Protocol.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScreencastFrameAckRequest extends js.Object {
  
  /**
    * Frame number.
    */
  var sessionId: integer = js.native
}
object ScreencastFrameAckRequest {
  
  @scala.inline
  def apply(sessionId: integer): ScreencastFrameAckRequest = {
    val __obj = js.Dynamic.literal(sessionId = sessionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScreencastFrameAckRequest]
  }
  
  @scala.inline
  implicit class ScreencastFrameAckRequestOps[Self <: ScreencastFrameAckRequest] (val x: Self) extends AnyVal {
    
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
    def setSessionId(value: integer): Self = this.set("sessionId", value.asInstanceOf[js.Any])
  }
}
