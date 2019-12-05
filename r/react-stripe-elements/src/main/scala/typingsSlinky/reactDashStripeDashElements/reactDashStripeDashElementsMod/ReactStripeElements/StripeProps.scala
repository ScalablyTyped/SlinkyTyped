package typingsSlinky.reactDashStripeDashElements.reactDashStripeDashElementsMod.ReactStripeElements

import typingsSlinky.stripeDashV3.stripe.CreatePaymentMethodOptions
import typingsSlinky.stripeDashV3.stripe.HandleCardPaymentWithoutElementsOptions
import typingsSlinky.stripeDashV3.stripe.HandleCardSetupOptions
import typingsSlinky.stripeDashV3.stripe.PaymentIntentResponse
import typingsSlinky.stripeDashV3.stripe.PaymentMethodResponse
import typingsSlinky.stripeDashV3.stripe.SetupIntentResponse
import typingsSlinky.stripeDashV3.stripe.paymentMethod.paymentMethodType
import typingsSlinky.stripeDashV3.stripe.paymentRequest.StripePaymentRequest
import typingsSlinky.stripeDashV3.stripe.paymentRequest.StripePaymentRequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StripeProps extends js.Object {
  var paymentRequest: js.Function1[/* options */ StripePaymentRequestOptions, StripePaymentRequest] = js.native
  def createPaymentMethod(paymentMethodType: paymentMethodType): js.Promise[PaymentMethodResponse] = js.native
  def createPaymentMethod(paymentMethodType: paymentMethodType, data: CreatePaymentMethodOptions): js.Promise[PaymentMethodResponse] = js.native
  def createSource(): js.Promise[SourceResponse] = js.native
  def createSource(sourceData: SourceOptions): js.Promise[SourceResponse] = js.native
  def createToken(): js.Promise[PatchedTokenResponse] = js.native
  def createToken(options: TokenOptions): js.Promise[PatchedTokenResponse] = js.native
  def handleCardPayment(clientSecret: String): js.Promise[PaymentIntentResponse] = js.native
  def handleCardPayment(clientSecret: String, options: HandleCardPaymentWithoutElementsOptions): js.Promise[PaymentIntentResponse] = js.native
  def handleCardSetup(clientSecret: String): js.Promise[SetupIntentResponse] = js.native
  def handleCardSetup(clientSecret: String, data: HandleCardSetupOptions): js.Promise[SetupIntentResponse] = js.native
}

