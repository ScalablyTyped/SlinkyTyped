package typingsSlinky.braintreeWeb.mod

import typingsSlinky.braintreeWeb.AnonClient
import typingsSlinky.braintreeWeb.AnonDisplayName
import typingsSlinky.braintreeWeb.AnonToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApplePay_ extends js.Object {
  /**
    * @description The current version of the SDK, i.e. `3.0.2`.
    * @type {string}
    */
  var VERSION: String = js.native
  /**
    * @static
    * @function create
    * @param {object} options Creation options:
    * @param {Client} options.client A {@link Client} instance.
    * @param {callback} callback The second argument, `data`, is the {@link ApplePay} instance.
    * @returns {void}
    */
  def create(options: AnonClient, callback: callback): Unit = js.native
  /**
    * Merges a payment request with Braintree defaults
    * The following properties are assigned to `paymentRequest` if not already defined
    * - countryCode
    * - currencyCode
    * - merchantCapabilities
    * - supportedNetworks
    * @public
    * @param {external:ApplePayPaymentRequest} paymentRequest The payment request details to apply on top of those from Braintree.
    * @returns {external:ApplePayPaymentRequest} The decorated `paymentRequest`.
    * @example
    * var applePay = require('braintree-web/apple-pay');
    *
    * applePay.create({client: clientInstance}, function (createErr, applePayInstance) {
    *   // ...
    *   var paymentRequest = applePay.createPaymentRequest({
    *    total: {
    *      label: 'My Company',
    *      amount: '19.99'
    *   });
    *
    *   console.log(paymentRequest);
    *   // { total: { }, countryCode: 'US', currencyCode: 'USD', merchantCapabilities: [ ], supportedNetworks: [ ] }
    *
    */
  def createPaymentRequest(paymentRequest: ApplePayPaymentRequest): ApplePayPaymentRequest = js.native
  /**
    * Validates the merchant website, as required by ApplePaySession before payment can be authorized.
    * @public
    * @param {object} options Options
    * @param {string} options.validationURL The validationURL fram an ApplePayValidateMerchantEvent.
    * @param {string} [options.displayName]
    * - The canonical name for your store.
    * - The system may display this name to the user.
    * - Use a 128-character or less, UTF-8 string.
    * - Do not localize the name.
    * @param {string} [options.merchantIdentifier]
    * Your Apple merchant identifier. This is the Apple Merchant ID created on the Apple Developer Portal.
    * Defaults to the merchant identifier specified in the Braintree Control Panel.
    * You can use this field to override the merchant identifier for this transaction.
    * @param {callback} callback The second argument, <code>data</code>, is the Apple Pay merchant session object.
    * Pass the merchant session to your Apple Pay session's completeMerchantValidation method.
    * @returns {void}
    * @example
    * var applePay = require('braintree-web/apple-pay');
    *
    * applePay.create({client: clientInstance}, function (createErr, applePayInstance) {
    *   var session = new ApplePaySession(1, {
    *     // This should be the payment request object that
    *     // contains the information needed to display the payment sheet.
    *   });
    *
    *   session.onvalidatemerchant = function (event) {
    *     applePay.performValidation({
    *       validationURL: event.validationURL
    *     }, function(err, validationData) {
    *       if (err) {
    *         console.error(err);
    *         session.abort();
    *         return;
    *       }
    *       session.completeMerchantValidation(validationData);
    *     });
    *   };
    * });
    */
  def performValidation(options: AnonDisplayName, callback: callback): Unit = js.native
  /**
    * Tokenizes an Apple Pay payment.
    * @public
    * @param {object} options Options
    * @param {object} options.token The `payment.token` property of an {@link external:ApplePayPaymentAuthorizedEvent}
    * @param {callback} callback The second argument, <code>data</code>, is the tokenized payload.
    * @returns {void}
    * @example
    * var applePay = require('braintree-web/apple-pay');
    *
    * applePay.create({client: clientInstance}, function (createErr, applePayInstance) {
    *   var session = new ApplePaySession(1, { });
    *
    *   session.onpaymentauthorized = function (event) {
    *     applePay.tokenize({
    *       token: event.payment.token
    *     }, function (err, tokenizedPayload) {
    *       if (err) {
    *         session.completePayment(ApplePaySession.STATUS_FAILURE);
    *         return;
    *       }
    *       session.completePayment(ApplePaySession.STATUS_SUCCESS);
    *
    *       // Send the tokenizedPayload to your server.
    *     });
    *  };
    * });
    */
  def tokenize(options: AnonToken, callback: callback): Unit = js.native
}

object ApplePay_ {
  @scala.inline
  def apply(
    VERSION: String,
    create: (AnonClient, callback) => Unit,
    createPaymentRequest: ApplePayPaymentRequest => ApplePayPaymentRequest,
    performValidation: (AnonDisplayName, callback) => Unit,
    tokenize: (AnonToken, callback) => Unit
  ): ApplePay_ = {
    val __obj = js.Dynamic.literal(VERSION = VERSION.asInstanceOf[js.Any], create = js.Any.fromFunction2(create), createPaymentRequest = js.Any.fromFunction1(createPaymentRequest), performValidation = js.Any.fromFunction2(performValidation), tokenize = js.Any.fromFunction2(tokenize))
    __obj.asInstanceOf[ApplePay_]
  }
  @scala.inline
  implicit class ApplePay_Ops[Self <: ApplePay_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withVERSION(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VERSION")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreate(value: (AnonClient, callback) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withCreatePaymentRequest(value: ApplePayPaymentRequest => ApplePayPaymentRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createPaymentRequest")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPerformValidation(value: (AnonDisplayName, callback) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("performValidation")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withTokenize(value: (AnonToken, callback) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tokenize")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

