package typingsSlinky.awsSdk.appstreamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccessEndpoint extends StObject {
  
  /**
    * The type of interface endpoint.
    */
  var EndpointType: AccessEndpointType = js.native
  
  /**
    * The identifier (ID) of the VPC in which the interface endpoint is used.
    */
  var VpceId: js.UndefOr[String] = js.native
}
object AccessEndpoint {
  
  @scala.inline
  def apply(EndpointType: AccessEndpointType): AccessEndpoint = {
    val __obj = js.Dynamic.literal(EndpointType = EndpointType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessEndpoint]
  }
  
  @scala.inline
  implicit class AccessEndpointMutableBuilder[Self <: AccessEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndpointType(value: AccessEndpointType): Self = StObject.set(x, "EndpointType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpceId(value: String): Self = StObject.set(x, "VpceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpceIdUndefined: Self = StObject.set(x, "VpceId", js.undefined)
  }
}
