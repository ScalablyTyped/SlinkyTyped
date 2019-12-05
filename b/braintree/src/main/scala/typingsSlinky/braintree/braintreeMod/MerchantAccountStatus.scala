package typingsSlinky.braintree.braintreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.braintree.braintreeStrings.Pending
  - typings.braintree.braintreeStrings.Active
  - typings.braintree.braintreeStrings.Suspended
*/
trait MerchantAccountStatus extends js.Object

object MerchantAccountStatus {
  @scala.inline
  def Active: typingsSlinky.braintree.braintreeStrings.Active = this.cast("Active")
  @scala.inline
  def Pending: typingsSlinky.braintree.braintreeStrings.Pending = this.cast("Pending")
  @scala.inline
  def Suspended: typingsSlinky.braintree.braintreeStrings.Suspended = this.cast("Suspended")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

