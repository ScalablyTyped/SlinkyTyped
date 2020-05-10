package typingsSlinky.awsSdk.snowballMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShippingDetails extends js.Object {
  /**
    * The Status and TrackingNumber values for a Snowball being returned to AWS for a particular job.
    */
  var InboundShipment: js.UndefOr[Shipment] = js.native
  /**
    * The Status and TrackingNumber values for a Snowball being delivered to the address that you specified for a particular job.
    */
  var OutboundShipment: js.UndefOr[Shipment] = js.native
  /**
    * The shipping speed for a particular job. This speed doesn't dictate how soon you'll get the Snowball from the job's creation date. This speed represents how quickly it moves to its destination while in transit. Regional shipping speeds are as follows:   In Australia, you have access to express shipping. Typically, Snowballs shipped express are delivered in about a day.   In the European Union (EU), you have access to express shipping. Typically, Snowballs shipped express are delivered in about a day. In addition, most countries in the EU have access to standard shipping, which typically takes less than a week, one way.   In India, Snowballs are delivered in one to seven days.   In the United States of America (US), you have access to one-day shipping and two-day shipping.  
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
  implicit class ShippingDetailsOps[Self <: ShippingDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInboundShipment(value: Shipment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InboundShipment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInboundShipment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InboundShipment")(js.undefined)
        ret
    }
    @scala.inline
    def withOutboundShipment(value: Shipment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutboundShipment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutboundShipment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutboundShipment")(js.undefined)
        ret
    }
    @scala.inline
    def withShippingOption(value: ShippingOption): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShippingOption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShippingOption: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShippingOption")(js.undefined)
        ret
    }
  }
  
}

