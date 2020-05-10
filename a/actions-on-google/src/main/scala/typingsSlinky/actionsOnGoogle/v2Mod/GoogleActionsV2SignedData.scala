package typingsSlinky.actionsOnGoogle.v2Mod

import typingsSlinky.actionsOnGoogle.commonMod.ApiClientObjectMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleActionsV2SignedData extends js.Object {
  /**
    * Matches IN_APP_DATA_SIGNATURE from getPurchases() method in Play InApp
    * Billing API.
    */
  var inAppDataSignature: js.UndefOr[String] = js.native
  /**
    * Match INAPP_PURCHASE_DATA
    * from getPurchases() method. Contains all inapp purchase data in JSON format
    * See details in table 6 of
    * https://developer.android.com/google/play/billing/billing_reference.html.
    */
  var inAppPurchaseData: js.UndefOr[ApiClientObjectMap[_]] = js.native
}

object GoogleActionsV2SignedData {
  @scala.inline
  def apply(): GoogleActionsV2SignedData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2SignedData]
  }
  @scala.inline
  implicit class GoogleActionsV2SignedDataOps[Self <: GoogleActionsV2SignedData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInAppDataSignature(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inAppDataSignature")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInAppDataSignature: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inAppDataSignature")(js.undefined)
        ret
    }
    @scala.inline
    def withInAppPurchaseData(value: ApiClientObjectMap[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inAppPurchaseData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInAppPurchaseData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inAppPurchaseData")(js.undefined)
        ret
    }
  }
  
}

