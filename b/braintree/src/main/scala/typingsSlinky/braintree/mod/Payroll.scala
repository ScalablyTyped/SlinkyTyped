package typingsSlinky.braintree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.braintree.braintreeStrings.Yes
  - typingsSlinky.braintree.braintreeStrings.No
  - typingsSlinky.braintree.braintreeStrings.Unknown
*/
trait Payroll extends js.Object

object Payroll {
  @scala.inline
  def No: typingsSlinky.braintree.braintreeStrings.No = this.cast("No")
  @scala.inline
  def Unknown: typingsSlinky.braintree.braintreeStrings.Unknown = this.cast("Unknown")
  @scala.inline
  def Yes: typingsSlinky.braintree.braintreeStrings.Yes = this.cast("Yes")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

