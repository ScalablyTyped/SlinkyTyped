package typingsSlinky.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClientVpnEndpointAttributeStatus extends StObject {
  
  /**
    * The status code.
    */
  var Code: js.UndefOr[ClientVpnEndpointAttributeStatusCode] = js.native
  
  /**
    * The status message.
    */
  var Message: js.UndefOr[String] = js.native
}
object ClientVpnEndpointAttributeStatus {
  
  @scala.inline
  def apply(): ClientVpnEndpointAttributeStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientVpnEndpointAttributeStatus]
  }
  
  @scala.inline
  implicit class ClientVpnEndpointAttributeStatusMutableBuilder[Self <: ClientVpnEndpointAttributeStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: ClientVpnEndpointAttributeStatusCode): Self = StObject.set(x, "Code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeUndefined: Self = StObject.set(x, "Code", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
  }
}
