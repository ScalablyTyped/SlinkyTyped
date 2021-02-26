package typingsSlinky.devtoolsProtocol.mod.Protocol.DOM

import typingsSlinky.devtoolsProtocol.mod.Protocol.Page.FrameId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetFrameOwnerRequest extends StObject {
  
  var frameId: FrameId = js.native
}
object GetFrameOwnerRequest {
  
  @scala.inline
  def apply(frameId: FrameId): GetFrameOwnerRequest = {
    val __obj = js.Dynamic.literal(frameId = frameId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFrameOwnerRequest]
  }
  
  @scala.inline
  implicit class GetFrameOwnerRequestMutableBuilder[Self <: GetFrameOwnerRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFrameId(value: FrameId): Self = StObject.set(x, "frameId", value.asInstanceOf[js.Any])
  }
}
