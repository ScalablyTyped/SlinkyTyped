package typingsSlinky.braintreeWeb

import typingsSlinky.braintreeWeb.anon.BillingAgreementDescription
import typingsSlinky.braintreeWeb.anon.Client
import typingsSlinky.braintreeWeb.coreMod.callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object paypalMod {
  
  @js.native
  trait PayPal extends StObject {
    
    var VERSION: String = js.native
    
    /**
      * @example
      * braintree.paypal.create({
      *   client: clientInstance
      * }, function (createErr, paypalInstance) {
      *   if (createErr) {
      *     if (createErr.code === 'PAYPAL_BROWSER_NOT_SUPPORTED') {
      *       console.error('This browser is not supported.');
      *     } else {
      *       console.error('Error!', createErr);
      *     }
      *   }
      * });
      */
    def create(options: Client): js.Promise[PayPal] = js.native
    def create(options: Client, callback: callback[PayPal]): Unit = js.native
    
    /**
      * Cleanly tear down anything set up by `create`.
      */
    def teardown(): Unit = js.native
    def teardown(callback: js.Function0[Unit]): Unit = js.native
    
    /**
      * Launches the PayPal login flow and returns a nonce payload. Only one PayPal login flow should be active at a time.
      * One way to achieve this is to disable your PayPal button while the flow is open.
      * * Checkout flows only.
      * * `authorize` - Submits the transaction for authorization but not settlement.
      * * `sale` - Payment will be immediately submitted for settlement upon creating a transaction.
      * * Changes the call-to-action in the PayPal flow. By default the final button will show the localized
      * word for "Continue" and implies that the final amount billed is not yet known.
      *
      * Setting this option to `commit` changes the button text to "Pay Now" and page text will convey to
      * the user that billing will take place immediately.         *
      * Supported locales are:
      * `da_DK`,
      * `de_DE`,
      * `en_AU`,
      * `en_GB`,
      * `en_US`,
      * `es_ES`,
      * `fr_CA`,
      * `fr_FR`,
      * `id_ID`,
      * `it_IT`,
      * `ja_JP`,
      * `ko_KR`,
      * `nl_NL`,
      * `no_NO`,
      * `pl_PL`,
      * `pt_BR`,
      * `pt_PT`,
      * `ru_RU`,
      * `sv_SE`,
      * `th_TH`,
      * `zh_CN`,
      * `zh_HK`,
      * and `zh_TW`.
      * @example
      * button.addEventListener('click', function () {
      *   // Disable the button so that we don't attempt to open multiple popups.
      *   button.setAttribute('disabled', 'disabled');
      *
      *   // Because PayPal tokenization opens a popup, this must be called
      *   // as a result of a user action, such as a button click.
      *   paypalInstance.tokenize({
      *     flow: 'vault' // Required
      *     // Any other tokenization options
      *   }, function (tokenizeErr, payload) {
      *     button.removeAttribute('disabled');
      *
      *     if (tokenizeErr) {
      *       // Handle tokenization errors or premature flow closure
      *
      *       switch (tokenizeErr.code) {
      *         case 'PAYPAL_POPUP_CLOSED':
      *           console.error('Customer closed PayPal popup.');
      *           break;
      *         case 'PAYPAL_ACCOUNT_TOKENIZATION_FAILED':
      *           console.error('PayPal tokenization failed. See details:', tokenizeErr.details);
      *           break;
      *         case 'PAYPAL_FLOW_FAILED':
      *           console.error('Unable to initialize PayPal flow. Are your options correct?', tokenizeErr.details);
      *           break;
      *         default:
      *           console.error('Error!', tokenizeErr);
      *       }
      *     } else {
      *       // Submit payload.nonce to your server
      *     }
      *   });
      * });
      */
    def tokenize(options: BillingAgreementDescription): js.Promise[PayPalTokenizePayload] = js.native
    def tokenize(options: BillingAgreementDescription, callback: callback[PayPalTokenizePayload]): PayPalTokenizeReturn = js.native
  }
  
  @js.native
  trait PayPalAccountDetails extends StObject {
    
    var billingAddress: PayPalBillingAddress = js.native
    
    var countryCode: String = js.native
    
    var email: String = js.native
    
    var firstName: String = js.native
    
    var lastName: String = js.native
    
    var payerId: String = js.native
    
    var phone: String = js.native
    
    var shippingAddress: PayPalShippingAddress = js.native
  }
  object PayPalAccountDetails {
    
    @scala.inline
    def apply(
      billingAddress: PayPalBillingAddress,
      countryCode: String,
      email: String,
      firstName: String,
      lastName: String,
      payerId: String,
      phone: String,
      shippingAddress: PayPalShippingAddress
    ): PayPalAccountDetails = {
      val __obj = js.Dynamic.literal(billingAddress = billingAddress.asInstanceOf[js.Any], countryCode = countryCode.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], firstName = firstName.asInstanceOf[js.Any], lastName = lastName.asInstanceOf[js.Any], payerId = payerId.asInstanceOf[js.Any], phone = phone.asInstanceOf[js.Any], shippingAddress = shippingAddress.asInstanceOf[js.Any])
      __obj.asInstanceOf[PayPalAccountDetails]
    }
    
    @scala.inline
    implicit class PayPalAccountDetailsMutableBuilder[Self <: PayPalAccountDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBillingAddress(value: PayPalBillingAddress): Self = StObject.set(x, "billingAddress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCountryCode(value: String): Self = StObject.set(x, "countryCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFirstName(value: String): Self = StObject.set(x, "firstName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastName(value: String): Self = StObject.set(x, "lastName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPayerId(value: String): Self = StObject.set(x, "payerId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPhone(value: String): Self = StObject.set(x, "phone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShippingAddress(value: PayPalShippingAddress): Self = StObject.set(x, "shippingAddress", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PayPalBillingAddress extends StObject {
    
    var city: String = js.native
    
    var countryCode: String = js.native
    
    var line1: String = js.native
    
    var line2: String = js.native
    
    var postalCode: String = js.native
    
    var state: String = js.native
  }
  object PayPalBillingAddress {
    
    @scala.inline
    def apply(city: String, countryCode: String, line1: String, line2: String, postalCode: String, state: String): PayPalBillingAddress = {
      val __obj = js.Dynamic.literal(city = city.asInstanceOf[js.Any], countryCode = countryCode.asInstanceOf[js.Any], line1 = line1.asInstanceOf[js.Any], line2 = line2.asInstanceOf[js.Any], postalCode = postalCode.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[PayPalBillingAddress]
    }
    
    @scala.inline
    implicit class PayPalBillingAddressMutableBuilder[Self <: PayPalBillingAddress] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCity(value: String): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCountryCode(value: String): Self = StObject.set(x, "countryCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLine1(value: String): Self = StObject.set(x, "line1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLine2(value: String): Self = StObject.set(x, "line2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPostalCode(value: String): Self = StObject.set(x, "postalCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PayPalShippingAddress extends StObject {
    
    var city: String = js.native
    
    var countryCode: String = js.native
    
    var line1: String = js.native
    
    var line2: String = js.native
    
    var postalCode: String = js.native
    
    var recipientName: String = js.native
    
    var state: String = js.native
  }
  object PayPalShippingAddress {
    
    @scala.inline
    def apply(
      city: String,
      countryCode: String,
      line1: String,
      line2: String,
      postalCode: String,
      recipientName: String,
      state: String
    ): PayPalShippingAddress = {
      val __obj = js.Dynamic.literal(city = city.asInstanceOf[js.Any], countryCode = countryCode.asInstanceOf[js.Any], line1 = line1.asInstanceOf[js.Any], line2 = line2.asInstanceOf[js.Any], postalCode = postalCode.asInstanceOf[js.Any], recipientName = recipientName.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[PayPalShippingAddress]
    }
    
    @scala.inline
    implicit class PayPalShippingAddressMutableBuilder[Self <: PayPalShippingAddress] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCity(value: String): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCountryCode(value: String): Self = StObject.set(x, "countryCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLine1(value: String): Self = StObject.set(x, "line1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLine2(value: String): Self = StObject.set(x, "line2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPostalCode(value: String): Self = StObject.set(x, "postalCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecipientName(value: String): Self = StObject.set(x, "recipientName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PayPalTokenizePayload extends StObject {
    
    var details: PayPalAccountDetails = js.native
    
    var nonce: String = js.native
    
    var `type`: String = js.native
  }
  object PayPalTokenizePayload {
    
    @scala.inline
    def apply(details: PayPalAccountDetails, nonce: String, `type`: String): PayPalTokenizePayload = {
      val __obj = js.Dynamic.literal(details = details.asInstanceOf[js.Any], nonce = nonce.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[PayPalTokenizePayload]
    }
    
    @scala.inline
    implicit class PayPalTokenizePayloadMutableBuilder[Self <: PayPalTokenizePayload] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDetails(value: PayPalAccountDetails): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PayPalTokenizeReturn extends StObject {
    
    def close(): js.Any = js.native
  }
  object PayPalTokenizeReturn {
    
    @scala.inline
    def apply(close: () => js.Any): PayPalTokenizeReturn = {
      val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close))
      __obj.asInstanceOf[PayPalTokenizeReturn]
    }
    
    @scala.inline
    implicit class PayPalTokenizeReturnMutableBuilder[Self <: PayPalTokenizeReturn] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClose(value: () => js.Any): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
    }
  }
}
