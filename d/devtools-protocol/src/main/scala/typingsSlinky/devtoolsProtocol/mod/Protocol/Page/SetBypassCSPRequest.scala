package typingsSlinky.devtoolsProtocol.mod.Protocol.Page

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetBypassCSPRequest extends StObject {
  
  /**
    * Whether to bypass page CSP.
    */
  var enabled: Boolean = js.native
}
object SetBypassCSPRequest {
  
  @scala.inline
  def apply(enabled: Boolean): SetBypassCSPRequest = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetBypassCSPRequest]
  }
  
  @scala.inline
  implicit class SetBypassCSPRequestMutableBuilder[Self <: SetBypassCSPRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
  }
}
