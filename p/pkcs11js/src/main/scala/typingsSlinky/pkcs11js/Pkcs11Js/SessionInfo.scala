package typingsSlinky.pkcs11js.Pkcs11Js

import typingsSlinky.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SessionInfo extends StObject {
  
  var deviceError: Double = js.native
  
  var flags: Double = js.native
  
  var slotID: Buffer = js.native
  
  var state: Double = js.native
}
object SessionInfo {
  
  @scala.inline
  def apply(deviceError: Double, flags: Double, slotID: Buffer, state: Double): SessionInfo = {
    val __obj = js.Dynamic.literal(deviceError = deviceError.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], slotID = slotID.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[SessionInfo]
  }
  
  @scala.inline
  implicit class SessionInfoMutableBuilder[Self <: SessionInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeviceError(value: Double): Self = StObject.set(x, "deviceError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlags(value: Double): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlotID(value: Buffer): Self = StObject.set(x, "slotID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: Double): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
