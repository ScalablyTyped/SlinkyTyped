package typingsSlinky.paypalCordovaPlugin.PayPalCordovaPlugin

import typingsSlinky.paypalCordovaPlugin.PayPalConfiguration
import typingsSlinky.paypalCordovaPlugin.PayPalPayment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PayPalMobileStatic extends js.Object {
  
  /**
    * @deprecated
    * Once a user has consented to future payments, when the user subsequently initiates a PayPal payment
    * from their device to be completed by your server, PayPal uses a Correlation ID to verify that the
    * payment is originating from a valid, user-consented device+application.
    * This helps reduce fraud and decrease declines.
    * This method MUST be called prior to initiating a pre-consented payment (a "future payment") from a mobile device.
    * Pass the result to your server, to include in the payment request sent to PayPal.
    * Do not otherwise cache or store this value.
    *
    * @param environment available options are "PayPalEnvironmentNoNetwork", "PayPalEnvironmentProduction" and "PayPalEnvironmentSandbox"
    * @param callback applicationCorrelationID Your server will send this to PayPal in a 'Paypal-Application-Correlation-Id' header.
    */
  def applicationCorrelationIDForEnvironment(environment: String, completionCallback: js.Function1[/* applicationCorrelationId */ String, Unit]): Unit = js.native
  
  /**
    * Once a user has consented to future payments, when the user subsequently initiates a PayPal payment
    * from their device to be completed by your server, PayPal uses a Correlation ID to verify that the
    * payment is originating from a valid, user-consented device+application.
    * This helps reduce fraud and decrease declines.
    * This method MUST be called prior to initiating a pre-consented payment (a "future payment") from a mobile device.
    * Pass the result to your server, to include in the payment request sent to PayPal.
    * Do not otherwise cache or store this value.
    *
    * @param callback clientMetadataID Your server will send this to PayPal in a 'PayPal-Client-Metadata-Id' header.
    */
  def clientMetadataID(completionCallback: js.Function1[/* clientMetadataId */ String, Unit]): Unit = js.native
  
  /**
    * You MUST call this method to initialize the PayPal Mobile SDK.
    *
    * The PayPal Mobile SDK can operate in different environments to facilitate development and testing.
    *
    * @param clientIdsForEnvironments set of client ids for environments
    * Example: var clientIdsForEnvironments = {
    *  PayPalEnvironmentProduction : @"my-client-id-for-Production",
    *  PayPalEnvironmentSandbox : @"my-client-id-for-Sandbox"
    *  }
    * @param completionCallback a callback function on success
    */
  def init(clientIdsForEnvironments: PayPalClientIds, completionCallback: js.Function0[Unit]): Unit = js.native
  
  /**
    * You must preconnect to PayPal to prepare the device for processing payments.
    * This improves the user experience, by making the presentation of the
    * UI faster. The preconnect is valid for a limited time, so
    * the recommended time to preconnect is on page load.
    *
    * @param environment available options are "PayPalEnvironmentNoNetwork", "PayPalEnvironmentProduction" and "PayPalEnvironmentSandbox"
    * @param configuration PayPalConfiguration object, for Future Payments merchantName, merchantPrivacyPolicyURL
    *      and merchantUserAgreementURL must be set be set
    * @param completionCallback a callback function on success
    */
  def prepareToRender(environment: String, configuration: PayPalConfiguration, completionCallback: js.Function0[Unit]): Unit = js.native
  
  /**
    * Please Read Docs on Future Payments at https://github.com/paypal/PayPal-iOS-SDK#future-payments
    *
    * @param completionCallback a callback function accepting a js object with future payment authorization
    * @param cancelCallback a callback function accepting a reason string, called when the user canceled without agreement
    */
  def renderFuturePaymentUI(
    completionCallback: js.Function1[/* result */ FuturePaymentResult, Unit],
    cancelCallback: js.Function1[/* cancelReason */ String, Unit]
  ): Unit = js.native
  
  /**
    * Please Read Docs on Profile Sharing at https://github.com/paypal/PayPal-iOS-SDK#profile-sharing
    *
    * @param scopes scopes Set of requested scope-values. Accepted scopes are: openid, profile, address, email, phone, futurepayments and paypalattributes
    * See https://developer.paypal.com/docs/integration/direct/identity/attributes/ for more details
    * @param completionCallback a callback function accepting a js object with future payment authorization
    * @param cancelCallback a callback function accepting a reason string, called when the user canceled without agreement
    */
  def renderProfileSharingUI(
    scopes: js.Array[String],
    completionCallback: js.Function1[/* result */ js.Any, Unit],
    cancelCallback: js.Function1[/* cancelReason */ String, Unit]
  ): Unit = js.native
  
  /**
    * Start PayPal UI to collect payment from the user.
    * See https://developer.paypal.com/webapps/developer/docs/integration/mobile/ios-integration-guide/
    * for more documentation of the params.
    *
    * @param payment PayPalPayment object
    * @param completionCallback a callback function accepting a js object, called when the user has completed payment
    * @param cancelCallback a callback function accepting a reason string, called when the user cancels the payment
    */
  def renderSinglePaymentUI(
    payment: PayPalPayment,
    completionCallback: js.Function1[/* result */ SinglePaymentResult, Unit],
    cancelCallback: js.Function1[/* cancelReason */ String, Unit]
  ): Unit = js.native
  
  /**
    * Retrieve the version of the PayPal iOS SDK library. Useful when contacting support.
    *
    * @param completionCallback a callback function accepting a string
    */
  def version(completionCallback: js.Function1[/* result */ String, Unit]): Unit = js.native
}
object PayPalMobileStatic {
  
  @scala.inline
  def apply(
    applicationCorrelationIDForEnvironment: (String, js.Function1[/* applicationCorrelationId */ String, Unit]) => Unit,
    clientMetadataID: js.Function1[/* clientMetadataId */ String, Unit] => Unit,
    init: (PayPalClientIds, js.Function0[Unit]) => Unit,
    prepareToRender: (String, PayPalConfiguration, js.Function0[Unit]) => Unit,
    renderFuturePaymentUI: (js.Function1[/* result */ FuturePaymentResult, Unit], js.Function1[/* cancelReason */ String, Unit]) => Unit,
    renderProfileSharingUI: (js.Array[String], js.Function1[/* result */ js.Any, Unit], js.Function1[/* cancelReason */ String, Unit]) => Unit,
    renderSinglePaymentUI: (PayPalPayment, js.Function1[/* result */ SinglePaymentResult, Unit], js.Function1[/* cancelReason */ String, Unit]) => Unit,
    version: js.Function1[/* result */ String, Unit] => Unit
  ): PayPalMobileStatic = {
    val __obj = js.Dynamic.literal(applicationCorrelationIDForEnvironment = js.Any.fromFunction2(applicationCorrelationIDForEnvironment), clientMetadataID = js.Any.fromFunction1(clientMetadataID), init = js.Any.fromFunction2(init), prepareToRender = js.Any.fromFunction3(prepareToRender), renderFuturePaymentUI = js.Any.fromFunction2(renderFuturePaymentUI), renderProfileSharingUI = js.Any.fromFunction3(renderProfileSharingUI), renderSinglePaymentUI = js.Any.fromFunction3(renderSinglePaymentUI), version = js.Any.fromFunction1(version))
    __obj.asInstanceOf[PayPalMobileStatic]
  }
  
  @scala.inline
  implicit class PayPalMobileStaticOps[Self <: PayPalMobileStatic] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setApplicationCorrelationIDForEnvironment(value: (String, js.Function1[/* applicationCorrelationId */ String, Unit]) => Unit): Self = this.set("applicationCorrelationIDForEnvironment", js.Any.fromFunction2(value))
    
    @scala.inline
    def setClientMetadataID(value: js.Function1[/* clientMetadataId */ String, Unit] => Unit): Self = this.set("clientMetadataID", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInit(value: (PayPalClientIds, js.Function0[Unit]) => Unit): Self = this.set("init", js.Any.fromFunction2(value))
    
    @scala.inline
    def setPrepareToRender(value: (String, PayPalConfiguration, js.Function0[Unit]) => Unit): Self = this.set("prepareToRender", js.Any.fromFunction3(value))
    
    @scala.inline
    def setRenderFuturePaymentUI(
      value: (js.Function1[/* result */ FuturePaymentResult, Unit], js.Function1[/* cancelReason */ String, Unit]) => Unit
    ): Self = this.set("renderFuturePaymentUI", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRenderProfileSharingUI(
      value: (js.Array[String], js.Function1[/* result */ js.Any, Unit], js.Function1[/* cancelReason */ String, Unit]) => Unit
    ): Self = this.set("renderProfileSharingUI", js.Any.fromFunction3(value))
    
    @scala.inline
    def setRenderSinglePaymentUI(
      value: (PayPalPayment, js.Function1[/* result */ SinglePaymentResult, Unit], js.Function1[/* cancelReason */ String, Unit]) => Unit
    ): Self = this.set("renderSinglePaymentUI", js.Any.fromFunction3(value))
    
    @scala.inline
    def setVersion(value: js.Function1[/* result */ String, Unit] => Unit): Self = this.set("version", js.Any.fromFunction1(value))
  }
}
