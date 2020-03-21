package typingsSlinky.braintree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.braintree.braintreeStrings.US
  - typingsSlinky.braintree.braintreeStrings.International
*/
trait CustomerLocation extends js.Object

object CustomerLocation {
  @scala.inline
  def International: typingsSlinky.braintree.braintreeStrings.International = this.cast("International")
  @scala.inline
  def US: typingsSlinky.braintree.braintreeStrings.US = this.cast("US")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

