package typingsSlinky.pulumiAws.inputMod.networkfirewall

import typingsSlinky.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FirewallSubnetMapping extends StObject {
  
  /**
    * The unique identifier for the subnet.
    */
  var subnetId: Input[String] = js.native
}
object FirewallSubnetMapping {
  
  @scala.inline
  def apply(subnetId: Input[String]): FirewallSubnetMapping = {
    val __obj = js.Dynamic.literal(subnetId = subnetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirewallSubnetMapping]
  }
  
  @scala.inline
  implicit class FirewallSubnetMappingMutableBuilder[Self <: FirewallSubnetMapping] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSubnetId(value: Input[String]): Self = StObject.set(x, "subnetId", value.asInstanceOf[js.Any])
  }
}
