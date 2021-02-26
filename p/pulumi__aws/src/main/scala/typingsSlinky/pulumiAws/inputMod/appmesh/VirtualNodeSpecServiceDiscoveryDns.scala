package typingsSlinky.pulumiAws.inputMod.appmesh

import typingsSlinky.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VirtualNodeSpecServiceDiscoveryDns extends StObject {
  
  /**
    * The DNS host name for your virtual node.
    */
  var hostname: Input[String] = js.native
}
object VirtualNodeSpecServiceDiscoveryDns {
  
  @scala.inline
  def apply(hostname: Input[String]): VirtualNodeSpecServiceDiscoveryDns = {
    val __obj = js.Dynamic.literal(hostname = hostname.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualNodeSpecServiceDiscoveryDns]
  }
  
  @scala.inline
  implicit class VirtualNodeSpecServiceDiscoveryDnsMutableBuilder[Self <: VirtualNodeSpecServiceDiscoveryDns] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHostname(value: Input[String]): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
  }
}
