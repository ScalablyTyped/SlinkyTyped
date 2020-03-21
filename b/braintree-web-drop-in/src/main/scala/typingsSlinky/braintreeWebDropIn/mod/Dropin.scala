package typingsSlinky.braintreeWebDropIn.mod

import typingsSlinky.braintreeWebDropIn.AnonPaymentMethodIsSelected
import typingsSlinky.braintreeWebDropIn.AnonPaymentOption
import typingsSlinky.braintreeWebDropIn.braintreeWebDropInStrings.noPaymentMethodRequestable
import typingsSlinky.braintreeWebDropIn.braintreeWebDropInStrings.paymentMethodRequestable
import typingsSlinky.braintreeWebDropIn.braintreeWebDropInStrings.paymentOptionSelected
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dropin extends js.Object {
  def clearSelectedPaymentMethod(): Unit = js.native
  def isPaymentMethodRequestable(): Boolean = js.native
  @JSName("on")
  def on_noPaymentMethodRequestable(event: noPaymentMethodRequestable, handler: js.Function0[Unit]): Unit = js.native
  @JSName("on")
  def on_paymentMethodRequestable(
    event: paymentMethodRequestable,
    handler: js.Function1[/* payload */ AnonPaymentMethodIsSelected, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_paymentOptionSelected(event: paymentOptionSelected, handler: js.Function1[/* payload */ AnonPaymentOption, Unit]): Unit = js.native
  def requestPaymentMethod(): js.Promise[PaymentMethodPayload] = js.native
  def requestPaymentMethod(
    callback: js.Function2[/* error */ js.Object | Null, /* payload */ js.UndefOr[PaymentMethodPayload], Unit]
  ): Unit = js.native
  def teardown(): js.Promise[Unit] = js.native
  def teardown(callback: js.Function1[/* error */ js.UndefOr[js.Object | Null], Unit]): Unit = js.native
}

