package typingsSlinky.braintree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubMerchantAccountApprovedNotification
  extends BaseWebhookNotification
     with WebhookNotification {
  @JSName("kind")
  var kind_SubMerchantAccountApprovedNotification: SubMerchantAccountApprovedNotificationKind = js.native
  var merchantAccount: MerchantAccount = js.native
}

object SubMerchantAccountApprovedNotification {
  @scala.inline
  def apply(
    kind: SubMerchantAccountApprovedNotificationKind,
    merchantAccount: MerchantAccount,
    timestamp: js.Date
  ): SubMerchantAccountApprovedNotification = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], merchantAccount = merchantAccount.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubMerchantAccountApprovedNotification]
  }
  @scala.inline
  implicit class SubMerchantAccountApprovedNotificationOps[Self <: SubMerchantAccountApprovedNotification] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKind(value: SubMerchantAccountApprovedNotificationKind): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMerchantAccount(value: MerchantAccount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("merchantAccount")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

