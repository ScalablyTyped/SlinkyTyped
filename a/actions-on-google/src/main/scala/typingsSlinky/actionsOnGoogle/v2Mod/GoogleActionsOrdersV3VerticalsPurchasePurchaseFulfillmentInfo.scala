package typingsSlinky.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleActionsOrdersV3VerticalsPurchasePurchaseFulfillmentInfo extends js.Object {
  /**
    * A window if a time-range is specified or ETA if single time specified.
    * Expected delivery or pickup time.
    */
  var expectedFulfillmentTime: js.UndefOr[GoogleActionsOrdersV3Time] = js.native
  /**
    * A window if a time-range is specified or ETA if single time specified.
    * Expected time to prepare the food. Single-time preferred.
    */
  var expectedPreparationTime: js.UndefOr[GoogleActionsOrdersV3Time] = js.native
  /**
    * Time at which this fulfillment option expires.
    */
  var expireTime: js.UndefOr[String] = js.native
  /**
    * User contact for this fulfillment.
    */
  var fulfillmentContact: js.UndefOr[GoogleActionsOrdersV3UserInfo] = js.native
  /**
    * Required: The type of fulfillment.
    */
  var fulfillmentType: js.UndefOr[GoogleActionsOrdersV3VerticalsPurchasePurchaseFulfillmentInfoFulfillmentType] = js.native
  /**
    * Unique identifier for this service option.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Pickup or delivery location.
    */
  var location: js.UndefOr[GoogleActionsV2Location] = js.native
  /**
    * Additional information regarding how order would be picked. This field
    * would only be applicable when fulfillment type is PICKUP.
    */
  var pickupInfo: js.UndefOr[GoogleActionsOrdersV3VerticalsPurchasePickupInfo] = js.native
  /**
    * Cost of this option.
    */
  var price: js.UndefOr[GoogleActionsOrdersV3PriceAttribute] = js.native
  /**
    * Name of the shipping method selected by the user.
    */
  var shippingMethodName: js.UndefOr[String] = js.native
  /**
    * StoreCode of the location.
    * Example: Walmart is the merchant and store_code is the walmart store
    * where fulfillment happened.
    * https://support.google.com/business/answer/3370250?hl=en&ref_topic=4596653.
    */
  var storeCode: js.UndefOr[String] = js.native
}

object GoogleActionsOrdersV3VerticalsPurchasePurchaseFulfillmentInfo {
  @scala.inline
  def apply(): GoogleActionsOrdersV3VerticalsPurchasePurchaseFulfillmentInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsOrdersV3VerticalsPurchasePurchaseFulfillmentInfo]
  }
  @scala.inline
  implicit class GoogleActionsOrdersV3VerticalsPurchasePurchaseFulfillmentInfoOps[Self <: GoogleActionsOrdersV3VerticalsPurchasePurchaseFulfillmentInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExpectedFulfillmentTime(value: GoogleActionsOrdersV3Time): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expectedFulfillmentTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpectedFulfillmentTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expectedFulfillmentTime")(js.undefined)
        ret
    }
    @scala.inline
    def withExpectedPreparationTime(value: GoogleActionsOrdersV3Time): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expectedPreparationTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpectedPreparationTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expectedPreparationTime")(js.undefined)
        ret
    }
    @scala.inline
    def withExpireTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expireTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpireTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expireTime")(js.undefined)
        ret
    }
    @scala.inline
    def withFulfillmentContact(value: GoogleActionsOrdersV3UserInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fulfillmentContact")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFulfillmentContact: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fulfillmentContact")(js.undefined)
        ret
    }
    @scala.inline
    def withFulfillmentType(value: GoogleActionsOrdersV3VerticalsPurchasePurchaseFulfillmentInfoFulfillmentType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fulfillmentType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFulfillmentType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fulfillmentType")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withLocation(value: GoogleActionsV2Location): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(js.undefined)
        ret
    }
    @scala.inline
    def withPickupInfo(value: GoogleActionsOrdersV3VerticalsPurchasePickupInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pickupInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPickupInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pickupInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withPrice(value: GoogleActionsOrdersV3PriceAttribute): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("price")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrice: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("price")(js.undefined)
        ret
    }
    @scala.inline
    def withShippingMethodName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shippingMethodName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShippingMethodName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shippingMethodName")(js.undefined)
        ret
    }
    @scala.inline
    def withStoreCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storeCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStoreCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storeCode")(js.undefined)
        ret
    }
  }
  
}

