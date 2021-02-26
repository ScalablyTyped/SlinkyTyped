package typingsSlinky.awsSdk.networkfirewallMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PortRange extends StObject {
  
  /**
    * The lower limit of the port range. This must be less than or equal to the ToPort specification. 
    */
  var FromPort: PortRangeBound = js.native
  
  /**
    * The upper limit of the port range. This must be greater than or equal to the FromPort specification. 
    */
  var ToPort: PortRangeBound = js.native
}
object PortRange {
  
  @scala.inline
  def apply(FromPort: PortRangeBound, ToPort: PortRangeBound): PortRange = {
    val __obj = js.Dynamic.literal(FromPort = FromPort.asInstanceOf[js.Any], ToPort = ToPort.asInstanceOf[js.Any])
    __obj.asInstanceOf[PortRange]
  }
  
  @scala.inline
  implicit class PortRangeMutableBuilder[Self <: PortRange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFromPort(value: PortRangeBound): Self = StObject.set(x, "FromPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToPort(value: PortRangeBound): Self = StObject.set(x, "ToPort", value.asInstanceOf[js.Any])
  }
}
