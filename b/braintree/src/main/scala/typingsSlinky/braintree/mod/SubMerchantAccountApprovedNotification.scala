package typingsSlinky.braintree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubMerchantAccountApprovedNotification
  extends BaseWebhookNotification
     with WebhookNotification {
  @JSName("kind")
  var kind_SubMerchantAccountApprovedNotification: SubMerchantAccountApprovedNotificationKind
  var merchantAccount: MerchantAccount
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
}

