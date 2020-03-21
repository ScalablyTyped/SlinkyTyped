package typingsSlinky.googlepay.google.payments.api

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.googlepay.googlepayStrings.DEFAULT
  - typingsSlinky.googlepay.googlepayStrings.COMPLETE_IMMEDIATE_PURCHASE
*/
trait CheckoutOption extends js.Object

object CheckoutOption {
  @scala.inline
  def COMPLETE_IMMEDIATE_PURCHASE: typingsSlinky.googlepay.googlepayStrings.COMPLETE_IMMEDIATE_PURCHASE = this.cast("COMPLETE_IMMEDIATE_PURCHASE")
  @scala.inline
  def DEFAULT: typingsSlinky.googlepay.googlepayStrings.DEFAULT = this.cast("DEFAULT")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

