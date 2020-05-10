package typingsSlinky.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleActionsOrdersV3VerticalsPurchasePickupInfo extends js.Object {
  /**
    * Details specific to the curbside information. If pickup_type is not
    * \"CURBSIDE\", this field would be ignored.
    */
  var curbsideInfo: js.UndefOr[GoogleActionsOrdersV3VerticalsPurchasePickupInfoCurbsideInfo] = js.native
  /**
    * Pick up method, such as INSTORE, CURBSIDE etc.
    */
  var pickupType: js.UndefOr[GoogleActionsOrdersV3VerticalsPurchasePickupInfoPickupType] = js.native
}

object GoogleActionsOrdersV3VerticalsPurchasePickupInfo {
  @scala.inline
  def apply(): GoogleActionsOrdersV3VerticalsPurchasePickupInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsOrdersV3VerticalsPurchasePickupInfo]
  }
  @scala.inline
  implicit class GoogleActionsOrdersV3VerticalsPurchasePickupInfoOps[Self <: GoogleActionsOrdersV3VerticalsPurchasePickupInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurbsideInfo(value: GoogleActionsOrdersV3VerticalsPurchasePickupInfoCurbsideInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("curbsideInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurbsideInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("curbsideInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withPickupType(value: GoogleActionsOrdersV3VerticalsPurchasePickupInfoPickupType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pickupType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPickupType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pickupType")(js.undefined)
        ret
    }
  }
  
}

