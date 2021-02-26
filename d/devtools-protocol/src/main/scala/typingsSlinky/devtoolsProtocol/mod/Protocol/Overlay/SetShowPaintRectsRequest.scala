package typingsSlinky.devtoolsProtocol.mod.Protocol.Overlay

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetShowPaintRectsRequest extends StObject {
  
  /**
    * True for showing paint rectangles
    */
  var result: Boolean = js.native
}
object SetShowPaintRectsRequest {
  
  @scala.inline
  def apply(result: Boolean): SetShowPaintRectsRequest = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetShowPaintRectsRequest]
  }
  
  @scala.inline
  implicit class SetShowPaintRectsRequestMutableBuilder[Self <: SetShowPaintRectsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResult(value: Boolean): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
  }
}
