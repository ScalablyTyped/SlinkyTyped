package typingsSlinky.braintree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.braintree.braintreeStrings.transaction_disbursed
  - typingsSlinky.braintree.braintreeStrings.transaction_settled
  - typingsSlinky.braintree.braintreeStrings.transaction_settlement_declined
*/
trait TransactionNotificationKind extends WebhookNotificationKind

object TransactionNotificationKind {
  @scala.inline
  def transaction_disbursed: typingsSlinky.braintree.braintreeStrings.transaction_disbursed = "transaction_disbursed".asInstanceOf[typingsSlinky.braintree.braintreeStrings.transaction_disbursed]
  @scala.inline
  def transaction_settled: typingsSlinky.braintree.braintreeStrings.transaction_settled = "transaction_settled".asInstanceOf[typingsSlinky.braintree.braintreeStrings.transaction_settled]
  @scala.inline
  def transaction_settlement_declined: typingsSlinky.braintree.braintreeStrings.transaction_settlement_declined = "transaction_settlement_declined".asInstanceOf[typingsSlinky.braintree.braintreeStrings.transaction_settlement_declined]
}

