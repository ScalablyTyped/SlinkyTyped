package typingsSlinky.googlepay.google.payments.api

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.googlepay.googlepayStrings.AMEX
  - typings.googlepay.googlepayStrings.DISCOVER
  - typings.googlepay.googlepayStrings.JCB
  - typings.googlepay.googlepayStrings.MASTERCARD
  - typings.googlepay.googlepayStrings.VISA
  - typings.googlepay.googlepayStrings.INTERAC
*/
trait AllowedCardNetwork extends js.Object

object AllowedCardNetwork {
  @scala.inline
  def AMEX: typingsSlinky.googlepay.googlepayStrings.AMEX = this.cast("AMEX")
  @scala.inline
  def DISCOVER: typingsSlinky.googlepay.googlepayStrings.DISCOVER = this.cast("DISCOVER")
  @scala.inline
  def INTERAC: typingsSlinky.googlepay.googlepayStrings.INTERAC = this.cast("INTERAC")
  @scala.inline
  def JCB: typingsSlinky.googlepay.googlepayStrings.JCB = this.cast("JCB")
  @scala.inline
  def MASTERCARD: typingsSlinky.googlepay.googlepayStrings.MASTERCARD = this.cast("MASTERCARD")
  @scala.inline
  def VISA: typingsSlinky.googlepay.googlepayStrings.VISA = this.cast("VISA")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

