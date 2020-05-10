package typingsSlinky.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleActionsV2Entitlement extends js.Object {
  /**
    * Only present for in-app purchase and in-app subs.
    */
  var inAppDetails: js.UndefOr[GoogleActionsV2SignedData] = js.native
  /**
    * Product sku. Package name for paid app, suffix of Finsky docid for
    * in-app purchase and in-app subscription.
    * Match getSku() in Play InApp Billing API.
    */
  var sku: js.UndefOr[String] = js.native
  var skuType: js.UndefOr[GoogleActionsV2EntitlementSkuType] = js.native
}

object GoogleActionsV2Entitlement {
  @scala.inline
  def apply(): GoogleActionsV2Entitlement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2Entitlement]
  }
  @scala.inline
  implicit class GoogleActionsV2EntitlementOps[Self <: GoogleActionsV2Entitlement] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInAppDetails(value: GoogleActionsV2SignedData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inAppDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInAppDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inAppDetails")(js.undefined)
        ret
    }
    @scala.inline
    def withSku(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sku")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSku: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sku")(js.undefined)
        ret
    }
    @scala.inline
    def withSkuType(value: GoogleActionsV2EntitlementSkuType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skuType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkuType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skuType")(js.undefined)
        ret
    }
  }
  
}

