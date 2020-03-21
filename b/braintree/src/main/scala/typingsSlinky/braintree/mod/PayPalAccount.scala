package typingsSlinky.braintree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("braintree", "PayPalAccount")
@js.native
class PayPalAccount () extends PaymentMethod {
  var billingAgreementId: String = js.native
  var createdAt: js.Date = js.native
  var customerId: String = js.native
  var default: Boolean = js.native
  var email: String = js.native
  var imageUrl: String = js.native
  var payerId: String = js.native
  var revokedAt: String = js.native
  var subscriptions: js.UndefOr[js.Array[Subscription]] = js.native
  var token: String = js.native
  var updatedAt: js.Date = js.native
}

