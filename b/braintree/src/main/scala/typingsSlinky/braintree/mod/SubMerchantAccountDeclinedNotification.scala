package typingsSlinky.braintree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubMerchantAccountDeclinedNotification
  extends BaseWebhookNotification
     with WebhookNotification {
  @JSName("kind")
  var kind_SubMerchantAccountDeclinedNotification: SubMerchantAccountDeclinedNotificationKind
  var merchantAccount: MerchantAccount
}

object SubMerchantAccountDeclinedNotification {
  @scala.inline
  def apply(
    kind: SubMerchantAccountDeclinedNotificationKind,
    merchantAccount: MerchantAccount,
    timestamp: js.Date
  ): SubMerchantAccountDeclinedNotification = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], merchantAccount = merchantAccount.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SubMerchantAccountDeclinedNotification]
  }
}

