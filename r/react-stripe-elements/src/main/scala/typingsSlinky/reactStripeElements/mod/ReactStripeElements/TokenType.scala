package typingsSlinky.reactStripeElements.mod.ReactStripeElements

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// From https://stripe.com/docs/stripe-js/reference#element-types
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.reactStripeElements.reactStripeElementsStrings.card
  - typingsSlinky.reactStripeElements.reactStripeElementsStrings.cardNumber
  - typingsSlinky.reactStripeElements.reactStripeElementsStrings.cardExpiry
  - typingsSlinky.reactStripeElements.reactStripeElementsStrings.cardCvc
  - typingsSlinky.reactStripeElements.reactStripeElementsStrings.paymentRequestButton
  - typingsSlinky.reactStripeElements.reactStripeElementsStrings.iban
  - typingsSlinky.reactStripeElements.reactStripeElementsStrings.idealBank
*/
trait TokenType extends js.Object

object TokenType {
  @scala.inline
  def card: typingsSlinky.reactStripeElements.reactStripeElementsStrings.card = this.cast("card")
  @scala.inline
  def cardCvc: typingsSlinky.reactStripeElements.reactStripeElementsStrings.cardCvc = this.cast("cardCvc")
  @scala.inline
  def cardExpiry: typingsSlinky.reactStripeElements.reactStripeElementsStrings.cardExpiry = this.cast("cardExpiry")
  @scala.inline
  def cardNumber: typingsSlinky.reactStripeElements.reactStripeElementsStrings.cardNumber = this.cast("cardNumber")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def iban: typingsSlinky.reactStripeElements.reactStripeElementsStrings.iban = this.cast("iban")
  @scala.inline
  def idealBank: typingsSlinky.reactStripeElements.reactStripeElementsStrings.idealBank = this.cast("idealBank")
  @scala.inline
  def paymentRequestButton: typingsSlinky.reactStripeElements.reactStripeElementsStrings.paymentRequestButton = this.cast("paymentRequestButton")
}

