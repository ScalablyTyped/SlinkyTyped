package typingsSlinky.braintreeWeb

import typingsSlinky.braintreeWeb.anon.Bin
import typingsSlinky.braintreeWeb.anon.Commercial
import typingsSlinky.braintreeWeb.anon.EmailRequired
import typingsSlinky.braintreeWeb.anon.GoogleMerchantId
import typingsSlinky.braintreeWeb.braintreeWebStrings.Unknown_
import typingsSlinky.braintreeWeb.coreMod.callback
import typingsSlinky.googlepay.google.payments.api.PaymentDataRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object googlePaymentMod {
  
  @js.native
  trait GooglePayment extends StObject {
    
    def create(options: GoogleMerchantId): Unit = js.native
    def create(options: GoogleMerchantId, callback: callback[_]): Unit = js.native
    
    /**
      * Create a configuration object for use in the `loadPaymentData` method.
      *
      * **Note**: Version 1 of the Google Pay Api is deprecated and will become unsupported in a future version.
      * Until then, version 1 will continue to be used by default, and version 1 schema parameters and overrides will
      * remain functional on existing integrations. However, new integrations and all following examples will be
      * presented in the GooglePay version 2 schema.
      * See [Google Pay's upgrade guide](https://developers.google.com/pay/api/web/guides/resources/update-to-latest-version)
      * to see how to update your integration.
      *
      * If `options.googlePayVersion === 2` was set during the initial {@link module:braintree-web/google-payment.create|create} call,
      * overrides must match the Google Pay v2 schema to be valid.
      * Optionally, any of the parameters in the [PaymentDataRequest](https://developers.google.com/pay/api/web/reference/object#PaymentDataRequest)
      * parameters can be overridden, but note that it is recommended only to override top level parameters to avoid
      * squashing deeply nested configuration objects.
      * An example can be found below showing how to safely edit these deeply nested objects.
      * @example
      * var paymentDataRequest = googlePaymentInstance.createPaymentDataRequest({
      *   merchantInfo: {
      *     merchantId: 'my-merchant-id-from-google'
      *   },
      *   transactionInfo: {
      *     currencyCode: 'USD',
      *     totalPriceStatus: 'FINAL',
      *     totalPrice: '100.00'
      *   }
      * });
      *
      * // Update card payment methods to require billing address
      * var cardPaymentMethod = paymentDataRequest.allowedPaymentMethods;
      * cardPaymentMethod.parameters.billingAddressRequired = true;
      * cardPaymentMethod.parameters.billingAddressParameters = {
      *   format: 'FULL',
      *   phoneNumberRequired: true
      * };
      *
      * var paymentsClient = new google.payments.api.PaymentsClient({
      *   environment: 'TEST' // or 'PRODUCTION'
      * })
      *
      * paymentsClient.loadPaymentData(paymentDataRequest).then(function (response) {
      *   // handle response with googlePaymentInstance.parseResponse
      *   // (see below)
      * });
      * @example <caption>With deferred client</caption>
      * googlePaymentInstance.createPaymentDataRequest({
      *   merchantInfo: {
      *     merchantId: 'my-merchant-id-from-google'
      *   },
      *   transactionInfo: {
      *     currencyCode: 'USD',
      *     totalPriceStatus: 'FINAL',
      *     totalPrice: '100.00'
      *   }
      * }).then(function (paymentDataRequest) {
      *   // Update card payment methods to require billing address
      *   var cardPaymentMethod = paymentDataRequest.allowedPaymentMethods;
      *   cardPaymentMethod.parameters.billingAddressRequired = true;
      *   cardPaymentMethod.parameters.billingAddressParameters = {
      *     format: 'FULL',
      *     phoneNumberRequired: true
      *   };
      *
      *   var paymentsClient = new google.payments.api.PaymentsClient({
      *     environment: 'TEST' // or 'PRODUCTION'
      *   })
      *
      *   return paymentsClient.loadPaymentData(paymentDataRequest);
      * }).then(function (response) {
      *   // handle response with googlePaymentInstance.parseResponse
      *   // (see below)
      * });
      */
    def createPaymentDataRequest(): js.Promise[PaymentDataRequest] = js.native
    def createPaymentDataRequest(overrides: EmailRequired): js.Promise[PaymentDataRequest] = js.native
    
    /**
      * // include https://pay.google.com/gp/p/js/pay.js in a script tag
      * // on your page to load the `google.payments.api.PaymentsClient` global object.
      *
      * var paymentButton = document.querySelector('#google-pay-button');
      * var paymentsClient = new google.payments.api.PaymentsClient({
      *   environment: 'TEST' // or 'PRODUCTION'
      * });
      *
      * braintree.client.create({
      *   authorization: 'tokenization-key-or-client-token'
      * }).then(function (clientInstance) {
      *   return braintree.googlePayment.create({
      *     client: clientInstance,
      *      googlePayVersion: 2,
      *      googleMerchantId: 'your-merchant-id-from-google'
      *   });
      * }).then(function (googlePaymentInstance) {
      *   paymentButton.addEventListener('click', function (event) {
      *     var paymentDataRequest;
      *
      *     event.preventDefault();
      *
      *     paymentDataRequest = googlePaymentInstance.createPaymentDataRequest({
      *       transactionInfo: {
      *         currencyCode: 'USD',
      *         totalPriceStatus: 'FINAL',
      *         totalPrice: '100.00'
      *       }
      *     });
      *
      *     paymentsClient.loadPaymentData(paymentDataRequest).then(function (paymentData) {
      *       return googlePaymentInstance.parseResponse(paymentData);
      *     }).then(function (result) {
      *       // send result.nonce to your server
      *     }).catch(function (err) {
      *       // handle err
      *     });
      *   });
      * });
      *
      * @example <caption>Check Browser and Customer Compatibility</caption>
      * var paymentsClient = new google.payments.api.PaymentsClient({
      *   environment: 'TEST' // or 'PRODUCTION'
      * });
      *
      * function setupGooglePayButton(googlePaymentInstance) {
      *   var button = document.createElement('button');
      *
      *   button.id = 'google-pay';
      *   button.appendChild(document.createTextNode('Google Pay'));
      *   button.addEventListener('click', function (event) {
      *     var paymentRequestData;
      *
      *     event.preventDefault();
      *
      *     paymentDataRequest = googlePaymentInstance.createPaymentDataRequest({
      *       transactionInfo: {
      *         currencyCode: 'USD',
      *         totalPriceStatus: 'FINAL',
      *         totalPrice: '100.00' // your amount
      *       }
      *     });
      *
      *     paymentsClient.loadPaymentData(paymentDataRequest).then(function (paymentData) {
      *       return googlePaymentInstance.parseResponse(paymentData);
      *       }).then(function (result) {
      *       // send result.nonce to your server
      *     }).catch(function (err) {
      *       // handle errors
      *     });
      *   });
      *
      *   document.getElementById('container').appendChild(button);
      * }
      *
      * braintree.client.create({
      *   authorization: 'tokenization-key-or-client-token'
      * }).then(function (clientInstance) {
      *   return braintree.googlePayment.create({
      *     client: clientInstance,
      *     googlePayVersion: 2,
      *     googleMerchantId: 'your-merchant-id-from-google'
      *   });
      * }).then(function (googlePaymentInstance) {
      *
      *   return paymentsClient.isReadyToPay({
      *     // see https://developers.google.com/pay/api/web/reference/object#IsReadyToPayRequest for all options
      *     apiVersion: 2,
      *     apiVersionMinor: 0,
      *     allowedPaymentMethods: googlePaymentInstance.createPaymentDataRequest().allowedPaymentMethods,
      *     existingPaymentMethodRequired: true
      *   });
      * }).then(function (response) {
      *   if (response.result) {
      *     setupGooglePayButton(googlePaymentInstance);
      *   }
      * }).catch(function (err) {
      *   // handle setup errors
      * });
      *
      */
    @JSName("create")
    def create_Promise(options: GoogleMerchantId): js.Promise[GooglePayment] = js.native
    
    def parseResponse(response: js.Any): Unit = js.native
    def parseResponse(response: js.Any, callback: callback[_]): Unit = js.native
    /**
      * Parse the response from the tokenization.
      * @example with callback
      * var paymentsClient = new google.payments.api.PaymentsClient({
      *   environment: 'TEST' // or 'PRODUCTION'
      * })
      *
      * paymentsClient.loadPaymentData(paymentDataRequestFromCreatePaymentDataRequest).then(function (response) {
      *   googlePaymentInstance.parseResponse(response, function (err, data) {
      *     if (err) {
      *       // handle errors
      *     }
      *     // send parsedResponse.nonce to your server
      *   });
      * });
      * @example with promise
      * var paymentsClient = new google.payments.api.PaymentsClient({
      *   environment: 'TEST' // or 'PRODUCTION'
      * })
      *
      * paymentsClient.loadPaymentData(paymentDataRequestFromCreatePaymentDataRequest).then(function (response) {
      *   return googlePaymentInstance.parseResponse(response);
      * }).then(function (parsedResponse) {
      *   // send parsedResponse.nonce to your server
      * }).catch(function (err) {
      *   // handle errors
      * });
      */
    @JSName("parseResponse")
    def parseResponse_Promise(response: js.Any): js.Promise[GooglePaymentTokenizePayload] = js.native
  }
  
  @js.native
  trait GooglePaymentTokenizePayload extends StObject {
    
    var binData: Commercial = js.native
    
    var description: String = js.native
    
    var details: Bin = js.native
    
    var nonce: String = js.native
    
    var `type`: String = js.native
  }
  object GooglePaymentTokenizePayload {
    
    @scala.inline
    def apply(binData: Commercial, description: String, details: Bin, nonce: String, `type`: String): GooglePaymentTokenizePayload = {
      val __obj = js.Dynamic.literal(binData = binData.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], nonce = nonce.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[GooglePaymentTokenizePayload]
    }
    
    @scala.inline
    implicit class GooglePaymentTokenizePayloadMutableBuilder[Self <: GooglePaymentTokenizePayload] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBinData(value: Commercial): Self = StObject.set(x, "binData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDetails(value: Bin): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.braintreeWeb.braintreeWebStrings.Yes
    - typingsSlinky.braintreeWeb.braintreeWebStrings.No
    - typingsSlinky.braintreeWeb.braintreeWebStrings.Unknown_
  */
  trait GooglePaymentTokenizeValues extends StObject
  object GooglePaymentTokenizeValues {
    
    @scala.inline
    def No: typingsSlinky.braintreeWeb.braintreeWebStrings.No = "No".asInstanceOf[typingsSlinky.braintreeWeb.braintreeWebStrings.No]
    
    @scala.inline
    def Unknown: Unknown_ = "Unknown".asInstanceOf[Unknown_]
    
    @scala.inline
    def Yes: typingsSlinky.braintreeWeb.braintreeWebStrings.Yes = "Yes".asInstanceOf[typingsSlinky.braintreeWeb.braintreeWebStrings.Yes]
  }
}
