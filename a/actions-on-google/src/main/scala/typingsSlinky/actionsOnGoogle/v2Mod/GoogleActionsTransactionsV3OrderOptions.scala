package typingsSlinky.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleActionsTransactionsV3OrderOptions extends js.Object {
  /**
    * If true, delivery address is required for the associated order.
    */
  var requestDeliveryAddress: js.UndefOr[Boolean] = js.native
  /**
    * The app can request user info by setting this field.
    * If set, the corresponding field will show up in ProposedOrderCard for
    * user's confirmation.
    */
  var userInfoOptions: js.UndefOr[GoogleActionsTransactionsV3UserInfoOptions] = js.native
}

object GoogleActionsTransactionsV3OrderOptions {
  @scala.inline
  def apply(): GoogleActionsTransactionsV3OrderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsTransactionsV3OrderOptions]
  }
  @scala.inline
  implicit class GoogleActionsTransactionsV3OrderOptionsOps[Self <: GoogleActionsTransactionsV3OrderOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRequestDeliveryAddress(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestDeliveryAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestDeliveryAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestDeliveryAddress")(js.undefined)
        ret
    }
    @scala.inline
    def withUserInfoOptions(value: GoogleActionsTransactionsV3UserInfoOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userInfoOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserInfoOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userInfoOptions")(js.undefined)
        ret
    }
  }
  
}

