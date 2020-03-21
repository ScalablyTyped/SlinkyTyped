package typingsSlinky.braintree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.braintree.braintreeStrings.Accepted
  - typingsSlinky.braintree.braintreeStrings.Disputed
  - typingsSlinky.braintree.braintreeStrings.Expired
  - typingsSlinky.braintree.braintreeStrings.Open
  - typingsSlinky.braintree.braintreeStrings.Lost
  - typingsSlinky.braintree.braintreeStrings.Won
*/
trait DisputeStatus extends js.Object

object DisputeStatus {
  @scala.inline
  def Accepted: typingsSlinky.braintree.braintreeStrings.Accepted = this.cast("Accepted")
  @scala.inline
  def Disputed: typingsSlinky.braintree.braintreeStrings.Disputed = this.cast("Disputed")
  @scala.inline
  def Expired: typingsSlinky.braintree.braintreeStrings.Expired = this.cast("Expired")
  @scala.inline
  def Lost: typingsSlinky.braintree.braintreeStrings.Lost = this.cast("Lost")
  @scala.inline
  def Open: typingsSlinky.braintree.braintreeStrings.Open = this.cast("Open")
  @scala.inline
  def Won: typingsSlinky.braintree.braintreeStrings.Won = this.cast("Won")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

