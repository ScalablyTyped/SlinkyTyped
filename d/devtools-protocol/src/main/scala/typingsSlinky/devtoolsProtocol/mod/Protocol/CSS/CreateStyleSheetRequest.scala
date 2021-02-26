package typingsSlinky.devtoolsProtocol.mod.Protocol.CSS

import typingsSlinky.devtoolsProtocol.mod.Protocol.Page.FrameId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateStyleSheetRequest extends StObject {
  
  /**
    * Identifier of the frame where "via-inspector" stylesheet should be created.
    */
  var frameId: FrameId = js.native
}
object CreateStyleSheetRequest {
  
  @scala.inline
  def apply(frameId: FrameId): CreateStyleSheetRequest = {
    val __obj = js.Dynamic.literal(frameId = frameId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateStyleSheetRequest]
  }
  
  @scala.inline
  implicit class CreateStyleSheetRequestMutableBuilder[Self <: CreateStyleSheetRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFrameId(value: FrameId): Self = StObject.set(x, "frameId", value.asInstanceOf[js.Any])
  }
}
