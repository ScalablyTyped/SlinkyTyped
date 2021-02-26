package typingsSlinky.devtoolsProtocol.mod.Protocol.Overlay

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetShowLayoutShiftRegionsRequest extends StObject {
  
  /**
    * True for showing layout shift regions
    */
  var result: Boolean = js.native
}
object SetShowLayoutShiftRegionsRequest {
  
  @scala.inline
  def apply(result: Boolean): SetShowLayoutShiftRegionsRequest = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetShowLayoutShiftRegionsRequest]
  }
  
  @scala.inline
  implicit class SetShowLayoutShiftRegionsRequestMutableBuilder[Self <: SetShowLayoutShiftRegionsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResult(value: Boolean): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
  }
}
