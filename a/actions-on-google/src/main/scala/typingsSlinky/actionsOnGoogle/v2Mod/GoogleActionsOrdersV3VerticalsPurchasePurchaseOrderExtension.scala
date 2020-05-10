package typingsSlinky.actionsOnGoogle.v2Mod

import typingsSlinky.actionsOnGoogle.commonMod.ApiClientObjectMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleActionsOrdersV3VerticalsPurchasePurchaseOrderExtension extends js.Object {
  /**
    * Optional: Errors because of which this order was rejected.
    */
  var errors: js.UndefOr[js.Array[GoogleActionsOrdersV3VerticalsPurchasePurchaseError]] = js.native
  /**
    * Any extra fields exchanged between merchant and google.
    */
  var extension: js.UndefOr[ApiClientObjectMap[_]] = js.native
  /**
    * Fulfillment info for the order.
    */
  var fulfillmentInfo: js.UndefOr[GoogleActionsOrdersV3VerticalsPurchasePurchaseFulfillmentInfo] = js.native
  /**
    * Location of the purchase (in-store / online)
    */
  var purchaseLocationType: js.UndefOr[GoogleActionsOrdersV3VerticalsPurchasePurchaseOrderExtensionPurchaseLocationType] = js.native
  /**
    * Return info for the order.
    */
  var returnsInfo: js.UndefOr[GoogleActionsOrdersV3VerticalsPurchasePurchaseReturnsInfo] = js.native
  /**
    * Required: Overall Status for the order.
    */
  var status: js.UndefOr[GoogleActionsOrdersV3VerticalsPurchasePurchaseOrderExtensionStatus] = js.native
  /**
    * Required: Type of purchase.
    */
  var `type`: js.UndefOr[GoogleActionsOrdersV3VerticalsPurchasePurchaseOrderExtensionType] = js.native
  /**
    * User visible label/string for the status.
    * Max allowed length is 50 chars.
    */
  var userVisibleStatusLabel: js.UndefOr[String] = js.native
}

object GoogleActionsOrdersV3VerticalsPurchasePurchaseOrderExtension {
  @scala.inline
  def apply(): GoogleActionsOrdersV3VerticalsPurchasePurchaseOrderExtension = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsOrdersV3VerticalsPurchasePurchaseOrderExtension]
  }
  @scala.inline
  implicit class GoogleActionsOrdersV3VerticalsPurchasePurchaseOrderExtensionOps[Self <: GoogleActionsOrdersV3VerticalsPurchasePurchaseOrderExtension] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withErrors(value: js.Array[GoogleActionsOrdersV3VerticalsPurchasePurchaseError]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errors")(js.undefined)
        ret
    }
    @scala.inline
    def withExtension(value: ApiClientObjectMap[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extension")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtension: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extension")(js.undefined)
        ret
    }
    @scala.inline
    def withFulfillmentInfo(value: GoogleActionsOrdersV3VerticalsPurchasePurchaseFulfillmentInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fulfillmentInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFulfillmentInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fulfillmentInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withPurchaseLocationType(value: GoogleActionsOrdersV3VerticalsPurchasePurchaseOrderExtensionPurchaseLocationType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("purchaseLocationType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPurchaseLocationType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("purchaseLocationType")(js.undefined)
        ret
    }
    @scala.inline
    def withReturnsInfo(value: GoogleActionsOrdersV3VerticalsPurchasePurchaseReturnsInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnsInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReturnsInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnsInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: GoogleActionsOrdersV3VerticalsPurchasePurchaseOrderExtensionStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: GoogleActionsOrdersV3VerticalsPurchasePurchaseOrderExtensionType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
    @scala.inline
    def withUserVisibleStatusLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userVisibleStatusLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserVisibleStatusLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userVisibleStatusLabel")(js.undefined)
        ret
    }
  }
  
}

