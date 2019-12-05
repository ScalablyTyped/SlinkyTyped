package typingsSlinky.reactDashStripeDashElements.reactDashStripeDashElementsMod.ReactStripeElements

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// From https://stripe.com/docs/stripe-js/reference#element-types
/* Rewritten from type alias, can be one of: 
  - typings.reactDashStripeDashElements.reactDashStripeDashElementsStrings.card
  - typings.reactDashStripeDashElements.reactDashStripeDashElementsStrings.cardNumber
  - typings.reactDashStripeDashElements.reactDashStripeDashElementsStrings.cardExpiry
  - typings.reactDashStripeDashElements.reactDashStripeDashElementsStrings.cardCvc
  - typings.reactDashStripeDashElements.reactDashStripeDashElementsStrings.paymentRequestButton
  - typings.reactDashStripeDashElements.reactDashStripeDashElementsStrings.iban
  - typings.reactDashStripeDashElements.reactDashStripeDashElementsStrings.idealBank
*/
trait TokenType extends js.Object

object TokenType {
  @scala.inline
  def card: typingsSlinky.reactDashStripeDashElements.reactDashStripeDashElementsStrings.card = this.cast("card")
  @scala.inline
  def cardCvc: typingsSlinky.reactDashStripeDashElements.reactDashStripeDashElementsStrings.cardCvc = this.cast("cardCvc")
  @scala.inline
  def cardExpiry: typingsSlinky.reactDashStripeDashElements.reactDashStripeDashElementsStrings.cardExpiry = this.cast("cardExpiry")
  @scala.inline
  def cardNumber: typingsSlinky.reactDashStripeDashElements.reactDashStripeDashElementsStrings.cardNumber = this.cast("cardNumber")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def iban: typingsSlinky.reactDashStripeDashElements.reactDashStripeDashElementsStrings.iban = this.cast("iban")
  @scala.inline
  def idealBank: typingsSlinky.reactDashStripeDashElements.reactDashStripeDashElementsStrings.idealBank = this.cast("idealBank")
  @scala.inline
  def paymentRequestButton: typingsSlinky.reactDashStripeDashElements.reactDashStripeDashElementsStrings.paymentRequestButton = this.cast("paymentRequestButton")
}

