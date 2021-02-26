package typingsSlinky.awsSdk.servicediscoveryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetServiceResponse extends StObject {
  
  /**
    * A complex type that contains information about the service.
    */
  var Service: js.UndefOr[typingsSlinky.awsSdk.servicediscoveryMod.Service] = js.native
}
object GetServiceResponse {
  
  @scala.inline
  def apply(): GetServiceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetServiceResponse]
  }
  
  @scala.inline
  implicit class GetServiceResponseMutableBuilder[Self <: GetServiceResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setService(value: Service): Self = StObject.set(x, "Service", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceUndefined: Self = StObject.set(x, "Service", js.undefined)
  }
}
