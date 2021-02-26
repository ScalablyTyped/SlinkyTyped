package typingsSlinky.devtoolsProtocol.mod.Protocol.Overlay

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetShowFPSCounterRequest extends StObject {
  
  /**
    * True for showing the FPS counter
    */
  var show: Boolean = js.native
}
object SetShowFPSCounterRequest {
  
  @scala.inline
  def apply(show: Boolean): SetShowFPSCounterRequest = {
    val __obj = js.Dynamic.literal(show = show.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetShowFPSCounterRequest]
  }
  
  @scala.inline
  implicit class SetShowFPSCounterRequestMutableBuilder[Self <: SetShowFPSCounterRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
  }
}
