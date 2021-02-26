package typingsSlinky.awsSdk.appmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VirtualGatewaySpec extends StObject {
  
  /**
    * A reference to an object that represents the defaults for backends.
    */
  var backendDefaults: js.UndefOr[VirtualGatewayBackendDefaults] = js.native
  
  /**
    * The listeners that the mesh endpoint is expected to receive inbound traffic from. You can specify one listener.
    */
  var listeners: VirtualGatewayListeners = js.native
  
  var logging: js.UndefOr[VirtualGatewayLogging] = js.native
}
object VirtualGatewaySpec {
  
  @scala.inline
  def apply(listeners: VirtualGatewayListeners): VirtualGatewaySpec = {
    val __obj = js.Dynamic.literal(listeners = listeners.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualGatewaySpec]
  }
  
  @scala.inline
  implicit class VirtualGatewaySpecMutableBuilder[Self <: VirtualGatewaySpec] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackendDefaults(value: VirtualGatewayBackendDefaults): Self = StObject.set(x, "backendDefaults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackendDefaultsUndefined: Self = StObject.set(x, "backendDefaults", js.undefined)
    
    @scala.inline
    def setListeners(value: VirtualGatewayListeners): Self = StObject.set(x, "listeners", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListenersVarargs(value: VirtualGatewayListener*): Self = StObject.set(x, "listeners", js.Array(value :_*))
    
    @scala.inline
    def setLogging(value: VirtualGatewayLogging): Self = StObject.set(x, "logging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoggingUndefined: Self = StObject.set(x, "logging", js.undefined)
  }
}
