package typingsSlinky.pulumiAws.inputMod.appmesh

import typingsSlinky.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VirtualGatewaySpec extends StObject {
  
  /**
    * The defaults for backends.
    */
  var backendDefaults: js.UndefOr[Input[VirtualGatewaySpecBackendDefaults]] = js.native
  
  /**
    * The listeners that the mesh endpoint is expected to receive inbound traffic from. You can specify one listener.
    */
  var listener: Input[VirtualGatewaySpecListener] = js.native
  
  /**
    * The inbound and outbound access logging information for the virtual gateway.
    */
  var logging: js.UndefOr[Input[VirtualGatewaySpecLogging]] = js.native
}
object VirtualGatewaySpec {
  
  @scala.inline
  def apply(listener: Input[VirtualGatewaySpecListener]): VirtualGatewaySpec = {
    val __obj = js.Dynamic.literal(listener = listener.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualGatewaySpec]
  }
  
  @scala.inline
  implicit class VirtualGatewaySpecMutableBuilder[Self <: VirtualGatewaySpec] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackendDefaults(value: Input[VirtualGatewaySpecBackendDefaults]): Self = StObject.set(x, "backendDefaults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackendDefaultsUndefined: Self = StObject.set(x, "backendDefaults", js.undefined)
    
    @scala.inline
    def setListener(value: Input[VirtualGatewaySpecListener]): Self = StObject.set(x, "listener", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogging(value: Input[VirtualGatewaySpecLogging]): Self = StObject.set(x, "logging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoggingUndefined: Self = StObject.set(x, "logging", js.undefined)
  }
}
