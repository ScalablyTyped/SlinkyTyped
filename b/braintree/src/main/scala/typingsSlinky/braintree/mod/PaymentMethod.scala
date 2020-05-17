package typingsSlinky.braintree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.braintree.mod.AndroidPayCard
  - typingsSlinky.braintree.mod.ApplePayCard
  - typingsSlinky.braintree.mod.PayPalAccount
  - typingsSlinky.braintree.mod.CreditCard
  - typingsSlinky.braintree.mod.SamsungPayCard
  - typingsSlinky.braintree.mod.VenmoAccount
  - typingsSlinky.braintree.mod.VisaCheckoutCard
  - typingsSlinky.braintree.mod.MasterpassCard
*/
trait PaymentMethod extends js.Object

object PaymentMethod {
  @scala.inline
  implicit def apply(value: AndroidPayCard): PaymentMethod = value.asInstanceOf[PaymentMethod]
  @scala.inline
  implicit def apply(value: ApplePayCard): PaymentMethod = value.asInstanceOf[PaymentMethod]
  @scala.inline
  implicit def apply(value: CreditCard): PaymentMethod = value.asInstanceOf[PaymentMethod]
  @scala.inline
  implicit def apply(value: MasterpassCard): PaymentMethod = value.asInstanceOf[PaymentMethod]
  @scala.inline
  implicit def apply(value: PayPalAccount): PaymentMethod = value.asInstanceOf[PaymentMethod]
  @scala.inline
  implicit def apply(value: SamsungPayCard): PaymentMethod = value.asInstanceOf[PaymentMethod]
  @scala.inline
  implicit def apply(value: VenmoAccount): PaymentMethod = value.asInstanceOf[PaymentMethod]
  @scala.inline
  implicit def apply(value: VisaCheckoutCard): PaymentMethod = value.asInstanceOf[PaymentMethod]
}

