package typingsSlinky.braintree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.braintree.braintreeStrings.approved
  - typingsSlinky.braintree.braintreeStrings.soft_declined
  - typingsSlinky.braintree.braintreeStrings.hard_declined
*/
trait TransactionProcessorResponseType extends js.Object

object TransactionProcessorResponseType {
  @scala.inline
  def approved: typingsSlinky.braintree.braintreeStrings.approved = this.cast("approved")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def hard_declined: typingsSlinky.braintree.braintreeStrings.hard_declined = this.cast("hard_declined")
  @scala.inline
  def soft_declined: typingsSlinky.braintree.braintreeStrings.soft_declined = this.cast("soft_declined")
}

