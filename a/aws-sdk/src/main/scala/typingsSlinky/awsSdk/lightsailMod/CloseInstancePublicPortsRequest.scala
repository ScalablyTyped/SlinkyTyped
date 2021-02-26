package typingsSlinky.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CloseInstancePublicPortsRequest extends StObject {
  
  /**
    * The name of the instance for which to close ports.
    */
  var instanceName: ResourceName = js.native
  
  /**
    * An object to describe the ports to close for the specified instance.
    */
  var portInfo: PortInfo = js.native
}
object CloseInstancePublicPortsRequest {
  
  @scala.inline
  def apply(instanceName: ResourceName, portInfo: PortInfo): CloseInstancePublicPortsRequest = {
    val __obj = js.Dynamic.literal(instanceName = instanceName.asInstanceOf[js.Any], portInfo = portInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloseInstancePublicPortsRequest]
  }
  
  @scala.inline
  implicit class CloseInstancePublicPortsRequestMutableBuilder[Self <: CloseInstancePublicPortsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstanceName(value: ResourceName): Self = StObject.set(x, "instanceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortInfo(value: PortInfo): Self = StObject.set(x, "portInfo", value.asInstanceOf[js.Any])
  }
}
