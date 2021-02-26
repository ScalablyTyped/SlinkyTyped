package typingsSlinky.devtoolsProtocol.mod.Protocol.DOM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetNodeStackTracesEnabledRequest extends StObject {
  
  /**
    * Enable or disable.
    */
  var enable: Boolean = js.native
}
object SetNodeStackTracesEnabledRequest {
  
  @scala.inline
  def apply(enable: Boolean): SetNodeStackTracesEnabledRequest = {
    val __obj = js.Dynamic.literal(enable = enable.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetNodeStackTracesEnabledRequest]
  }
  
  @scala.inline
  implicit class SetNodeStackTracesEnabledRequestMutableBuilder[Self <: SetNodeStackTracesEnabledRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnable(value: Boolean): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
  }
}
