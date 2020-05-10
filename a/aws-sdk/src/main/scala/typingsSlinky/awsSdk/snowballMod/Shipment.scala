package typingsSlinky.awsSdk.snowballMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Shipment extends js.Object {
  /**
    * Status information for a shipment.
    */
  var Status: js.UndefOr[String] = js.native
  /**
    * The tracking number for this job. Using this tracking number with your region's carrier's website, you can track a Snowball as the carrier transports it. For India, the carrier is Amazon Logistics. For all other regions, UPS is the carrier.
    */
  var TrackingNumber: js.UndefOr[String] = js.native
}

object Shipment {
  @scala.inline
  def apply(): Shipment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Shipment]
  }
  @scala.inline
  implicit class ShipmentOps[Self <: Shipment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(js.undefined)
        ret
    }
    @scala.inline
    def withTrackingNumber(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TrackingNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrackingNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TrackingNumber")(js.undefined)
        ret
    }
  }
  
}

