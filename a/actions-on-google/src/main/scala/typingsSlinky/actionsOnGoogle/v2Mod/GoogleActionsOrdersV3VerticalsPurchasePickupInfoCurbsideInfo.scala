package typingsSlinky.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleActionsOrdersV3VerticalsPurchasePickupInfoCurbsideInfo extends js.Object {
  /**
    * Partners need additional information to facilitate curbside pickup
    * orders. Depending upon what fulfillment type is chosen, corresponding
    * details would be collected from the user.
    */
  var curbsideFulfillmentType: js.UndefOr[
    GoogleActionsOrdersV3VerticalsPurchasePickupInfoCurbsideInfoCurbsideFulfillmentType
  ] = js.native
  /**
    * Vehicle details of the user placing the order.
    */
  var userVehicle: js.UndefOr[GoogleActionsOrdersV3VerticalsCommonVehicle] = js.native
}

object GoogleActionsOrdersV3VerticalsPurchasePickupInfoCurbsideInfo {
  @scala.inline
  def apply(): GoogleActionsOrdersV3VerticalsPurchasePickupInfoCurbsideInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsOrdersV3VerticalsPurchasePickupInfoCurbsideInfo]
  }
  @scala.inline
  implicit class GoogleActionsOrdersV3VerticalsPurchasePickupInfoCurbsideInfoOps[Self <: GoogleActionsOrdersV3VerticalsPurchasePickupInfoCurbsideInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurbsideFulfillmentType(value: GoogleActionsOrdersV3VerticalsPurchasePickupInfoCurbsideInfoCurbsideFulfillmentType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("curbsideFulfillmentType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurbsideFulfillmentType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("curbsideFulfillmentType")(js.undefined)
        ret
    }
    @scala.inline
    def withUserVehicle(value: GoogleActionsOrdersV3VerticalsCommonVehicle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userVehicle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserVehicle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userVehicle")(js.undefined)
        ret
    }
  }
  
}

