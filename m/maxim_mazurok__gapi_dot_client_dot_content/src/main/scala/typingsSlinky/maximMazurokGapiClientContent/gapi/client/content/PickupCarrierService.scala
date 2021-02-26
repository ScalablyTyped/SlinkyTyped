package typingsSlinky.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PickupCarrierService extends StObject {
  
  /** The name of the pickup carrier (e.g., `"UPS"`). Required. */
  var carrierName: js.UndefOr[String] = js.native
  
  /** The name of the pickup service (e.g., `"Access point"`). Required. */
  var serviceName: js.UndefOr[String] = js.native
}
object PickupCarrierService {
  
  @scala.inline
  def apply(): PickupCarrierService = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickupCarrierService]
  }
  
  @scala.inline
  implicit class PickupCarrierServiceMutableBuilder[Self <: PickupCarrierService] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCarrierName(value: String): Self = StObject.set(x, "carrierName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCarrierNameUndefined: Self = StObject.set(x, "carrierName", js.undefined)
    
    @scala.inline
    def setServiceName(value: String): Self = StObject.set(x, "serviceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceNameUndefined: Self = StObject.set(x, "serviceName", js.undefined)
  }
}
