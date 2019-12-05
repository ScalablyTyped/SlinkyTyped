package typingsSlinky.braintree.braintreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.braintree.braintreeStrings.Active
  - typings.braintree.braintreeStrings.Canceled
  - typings.braintree.braintreeStrings.Expired
  - typings.braintree.braintreeStrings.PastDue
  - typings.braintree.braintreeStrings.Pending
*/
trait SubscriptionStatus extends js.Object

object SubscriptionStatus {
  @scala.inline
  def Active: typingsSlinky.braintree.braintreeStrings.Active = this.cast("Active")
  @scala.inline
  def Canceled: typingsSlinky.braintree.braintreeStrings.Canceled = this.cast("Canceled")
  @scala.inline
  def Expired: typingsSlinky.braintree.braintreeStrings.Expired = this.cast("Expired")
  @scala.inline
  def PastDue: typingsSlinky.braintree.braintreeStrings.PastDue = this.cast("PastDue")
  @scala.inline
  def Pending: typingsSlinky.braintree.braintreeStrings.Pending = this.cast("Pending")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

