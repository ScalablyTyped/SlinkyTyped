package typingsSlinky.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleActionsOrdersV3VerticalsPurchasePurchaseError extends js.Object {
  /**
    * Available quantity now. Applicable in case of AVAILABILITY_CHANGED.
    */
  var availableQuantity: js.UndefOr[Double] = js.native
  /**
    * Additional error description.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Entity Id that corresponds to the error. Example this can correspond to
    * LineItemId / ItemOptionId.
    */
  var entityId: js.UndefOr[String] = js.native
  /**
    * Required: This represents the granular reason why an order gets rejected by
    * the merchant.
    */
  var `type`: js.UndefOr[GoogleActionsOrdersV3VerticalsPurchasePurchaseErrorType] = js.native
  /**
    * Relevant in case of PRICE_CHANGED / INCORRECT_PRICE error type.
    */
  var updatedPrice: js.UndefOr[GoogleActionsOrdersV3PriceAttribute] = js.native
}

object GoogleActionsOrdersV3VerticalsPurchasePurchaseError {
  @scala.inline
  def apply(): GoogleActionsOrdersV3VerticalsPurchasePurchaseError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsOrdersV3VerticalsPurchasePurchaseError]
  }
  @scala.inline
  implicit class GoogleActionsOrdersV3VerticalsPurchasePurchaseErrorOps[Self <: GoogleActionsOrdersV3VerticalsPurchasePurchaseError] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAvailableQuantity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("availableQuantity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAvailableQuantity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("availableQuantity")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withEntityId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entityId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEntityId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entityId")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: GoogleActionsOrdersV3VerticalsPurchasePurchaseErrorType): Self = {
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
    def withUpdatedPrice(value: GoogleActionsOrdersV3PriceAttribute): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updatedPrice")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdatedPrice: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updatedPrice")(js.undefined)
        ret
    }
  }
  
}

