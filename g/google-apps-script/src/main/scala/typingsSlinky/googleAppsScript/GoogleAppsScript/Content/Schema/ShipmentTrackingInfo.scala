package typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShipmentTrackingInfo extends js.Object {
  var carrier: js.UndefOr[String] = js.native
  var trackingNumber: js.UndefOr[String] = js.native
}

object ShipmentTrackingInfo {
  @scala.inline
  def apply(): ShipmentTrackingInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShipmentTrackingInfo]
  }
  @scala.inline
  implicit class ShipmentTrackingInfoOps[Self <: ShipmentTrackingInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCarrier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("carrier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCarrier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("carrier")(js.undefined)
        ret
    }
    @scala.inline
    def withTrackingNumber(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackingNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrackingNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackingNumber")(js.undefined)
        ret
    }
  }
  
}

