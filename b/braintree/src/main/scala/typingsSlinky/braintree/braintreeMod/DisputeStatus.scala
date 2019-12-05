package typingsSlinky.braintree.braintreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.braintree.braintreeStrings.Accepted
  - typings.braintree.braintreeStrings.Disputed
  - typings.braintree.braintreeStrings.Expired
  - typings.braintree.braintreeStrings.Open
  - typings.braintree.braintreeStrings.Lost
  - typings.braintree.braintreeStrings.Won
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

