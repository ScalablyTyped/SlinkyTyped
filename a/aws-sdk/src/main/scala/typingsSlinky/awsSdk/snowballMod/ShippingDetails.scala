package typingsSlinky.awsSdk.snowballMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShippingDetails extends StObject {
  
  /**
    * The Status and TrackingNumber values for a Snow device being returned to AWS for a particular job.
    */
  var InboundShipment: js.UndefOr[Shipment] = js.native
  
  /**
    * The Status and TrackingNumber values for a Snow device being delivered to the address that you specified for a particular job.
    */
  var OutboundShipment: js.UndefOr[Shipment] = js.native
  
  /**
    * The shipping speed for a particular job. This speed doesn't dictate how soon you'll get the Snow device from the job's creation date. This speed represents how quickly it moves to its destination while in transit. Regional shipping speeds are as follows:   In Australia, you have access to express shipping. Typically, Snow devices shipped express are delivered in about a day.   In the European Union (EU), you have access to express shipping. Typically, Snow devices shipped express are delivered in about a day. In addition, most countries in the EU have access to standard shipping, which typically takes less than a week, one way.   In India, Snow device are delivered in one to seven days.   In the United States of America (US), you have access to one-day shipping and two-day shipping.  
    */
  var ShippingOption: js.UndefOr[typingsSlinky.awsSdk.snowballMod.ShippingOption] = js.native
}
object ShippingDetails {
  
  @scala.inline
  def apply(): ShippingDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShippingDetails]
  }
  
  @scala.inline
  implicit class ShippingDetailsMutableBuilder[Self <: ShippingDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInboundShipment(value: Shipment): Self = StObject.set(x, "InboundShipment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInboundShipmentUndefined: Self = StObject.set(x, "InboundShipment", js.undefined)
    
    @scala.inline
    def setOutboundShipment(value: Shipment): Self = StObject.set(x, "OutboundShipment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutboundShipmentUndefined: Self = StObject.set(x, "OutboundShipment", js.undefined)
    
    @scala.inline
    def setShippingOption(value: ShippingOption): Self = StObject.set(x, "ShippingOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShippingOptionUndefined: Self = StObject.set(x, "ShippingOption", js.undefined)
  }
}
