package typingsSlinky.awsSdk.appmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VirtualGatewayClientPolicy extends StObject {
  
  /**
    * A reference to an object that represents a Transport Layer Security (TLS) client policy.
    */
  var tls: js.UndefOr[VirtualGatewayClientPolicyTls] = js.native
}
object VirtualGatewayClientPolicy {
  
  @scala.inline
  def apply(): VirtualGatewayClientPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VirtualGatewayClientPolicy]
  }
  
  @scala.inline
  implicit class VirtualGatewayClientPolicyMutableBuilder[Self <: VirtualGatewayClientPolicy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTls(value: VirtualGatewayClientPolicyTls): Self = StObject.set(x, "tls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTlsUndefined: Self = StObject.set(x, "tls", js.undefined)
  }
}
