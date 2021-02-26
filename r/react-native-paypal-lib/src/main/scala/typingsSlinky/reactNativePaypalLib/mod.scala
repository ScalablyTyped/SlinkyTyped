package typingsSlinky.reactNativePaypalLib

import typingsSlinky.reactNativePaypalLib.reactNativePaypalLibStrings.AUTHORIZE
import typingsSlinky.reactNativePaypalLib.reactNativePaypalLibStrings.NO_NETWORK
import typingsSlinky.reactNativePaypalLib.reactNativePaypalLibStrings.ORDER
import typingsSlinky.reactNativePaypalLib.reactNativePaypalLibStrings.PRODUCTION
import typingsSlinky.reactNativePaypalLib.reactNativePaypalLibStrings.SALE
import typingsSlinky.reactNativePaypalLib.reactNativePaypalLibStrings.SANDBOX
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default {
    
    @JSImport("react-native-paypal-lib", "default.ENVIRONMENT")
    @js.native
    val ENVIRONMENT: EnvironmentParam = js.native
    
    @JSImport("react-native-paypal-lib", "default.INTENT")
    @js.native
    val INTENT: IntentParam = js.native
    
    @JSImport("react-native-paypal-lib", "default.paymentRequest")
    @js.native
    def paymentRequest(params: PaymentParams): js.Promise[PaymentConfirmation] = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.reactNativePaypalLib.reactNativePaypalLibStrings.AUD
    - typingsSlinky.reactNativePaypalLib.reactNativePaypalLibStrings.BRL
    - typingsSlinky.reactNativePaypalLib.reactNativePaypalLibStrings.CAD
    - typingsSlinky.reactNativePaypalLib.reactNativePaypalLibStrings.CNY
    - typingsSlinky.reactNativePaypalLib.reactNativePaypalLibStrings.CZK
    - typingsSlinky.reactNativePaypalLib.reactNativePaypalLibStrings.DKK
    - typingsSlinky.reactNativePaypalLib.reactNativePaypalLibStrings.EUR
    - typingsSlinky.reactNativePaypalLib.reactNativePaypalLibStrings.HKD
    - typingsSlinky.reactNativePaypalLib.reactNativePaypalLibStrings.HUF
    - typingsSlinky.reactNativePaypalLib.reactNativePaypalLibStrings.INR
    - typingsSlinky.reactNativePaypalLib.reactNativePaypalLibStrings.ILS
    - typingsSlinky.reactNativePaypalLib.reactNativePaypalLibStrings.JPY
    - typingsSlinky.reactNativePaypalLib.reactNativePaypalLibStrings.MYR
    - typingsSlinky.reactNativePaypalLib.reactNativePaypalLibStrings.MXN
    - typingsSlinky.reactNativePaypalLib.reactNativePaypalLibStrings.TWD
    - typingsSlinky.reactNativePaypalLib.reactNativePaypalLibStrings.NZD
    - typingsSlinky.reactNativePaypalLib.reactNativePaypalLibStrings.NOK
    - typingsSlinky.reactNativePaypalLib.reactNativePaypalLibStrings.PHP
    - typingsSlinky.reactNativePaypalLib.reactNativePaypalLibStrings.PLN
    - typingsSlinky.reactNativePaypalLib.reactNativePaypalLibStrings.GBP
    - typingsSlinky.reactNativePaypalLib.reactNativePaypalLibStrings.RUB
    - typingsSlinky.reactNativePaypalLib.reactNativePaypalLibStrings.SGD
    - typingsSlinky.reactNativePaypalLib.reactNativePaypalLibStrings.SEK
    - typingsSlinky.reactNativePaypalLib.reactNativePaypalLibStrings.CHF
    - typingsSlinky.reactNativePaypalLib.reactNativePaypalLibStrings.THB
    - typingsSlinky.reactNativePaypalLib.reactNativePaypalLibStrings.USD
  */
  trait CURRENCIES extends StObject
  object CURRENCIES {
    
    @scala.inline
    def AUD: typingsSlinky.reactNativePaypalLib.reactNativePaypalLibStrings.AUD = "AUD".asInstanceOf[typingsSlinky.reactNativePaypalLib.reactNativePaypalLibStrings.AUD]
    
    @scala.inline
    def BRL: typingsSlinky.reactNativePaypalLib.reactNativePaypalLibStrings.BRL = "BRL".asInstanceOf[typingsSlinky.reactNativePaypalLib.reactNativePaypalLibStrings.BRL]
    
    @scala.inline
    def CAD: typingsSlinky.reactNativePaypalLib.reactNativePaypalLibStrings.CAD = "CAD".asInstanceOf[typingsSlinky.reactNativePaypalLib.reactNativePaypalLibStrings.CAD]
    
    @scala.inline
    def CHF: typingsSlinky.reactNativePaypalLib.reactNativePaypalLibStrings.CHF = "CHF".asInstanceOf[typingsSlinky.reactNativePaypalLib.reactNativePaypalLibStrings.CHF]
    
    @scala.inline
    def CNY: typingsSlinky.reactNativePaypalLib.reactNativePaypalLibStrings.CNY = "CNY".asInstanceOf[typingsSlinky.reactNativePaypalLib.reactNativePaypalLibStrings.CNY]
    
    @scala.inline
    def CZK: typingsSlinky.reactNativePaypalLib.reactNativePaypalLibStrings.CZK = "CZK".asInstanceOf[typingsSlinky.reactNativePaypalLib.reactNativePaypalLibStrings.CZK]
    
    @scala.inline
    def DKK: typingsSlinky.reactNativePaypalLib.reactNativePaypalLibStrings.DKK = "DKK".asInstanceOf[typingsSlinky.reactNativePaypalLib.reactNativePaypalLibStrings.DKK]
    
    @scala.inline
    def EUR: typingsSlinky.reactNativePaypalLib.reactNativePaypalLibStrings.EUR = "EUR".asInstanceOf[typingsSlinky.reactNativePaypalLib.reactNativePaypalLibStrings.EUR]
    
    @scala.inline
    def GBP: typingsSlinky.reactNativePaypalLib.reactNativePaypalLibStrings.GBP = "GBP".asInstanceOf[typingsSlinky.reactNativePaypalLib.reactNativePaypalLibStrings.GBP]
    
    @scala.inline
    def HKD: typingsSlinky.reactNativePaypalLib.reactNativePaypalLibStrings.HKD = "HKD".asInstanceOf[typingsSlinky.reactNativePaypalLib.reactNativePaypalLibStrings.HKD]
    
    @scala.inline
    def HUF: typingsSlinky.reactNativePaypalLib.reactNativePaypalLibStrings.HUF = "HUF".asInstanceOf[typingsSlinky.reactNativePaypalLib.reactNativePaypalLibStrings.HUF]
    
    @scala.inline
    def ILS: typingsSlinky.reactNativePaypalLib.reactNativePaypalLibStrings.ILS = "ILS".asInstanceOf[typingsSlinky.reactNativePaypalLib.reactNativePaypalLibStrings.ILS]
    
    @scala.inline
    def INR: typingsSlinky.reactNativePaypalLib.reactNativePaypalLibStrings.INR = "INR".asInstanceOf[typingsSlinky.reactNativePaypalLib.reactNativePaypalLibStrings.INR]
    
    @scala.inline
    def JPY: typingsSlinky.reactNativePaypalLib.reactNativePaypalLibStrings.JPY = "JPY".asInstanceOf[typingsSlinky.reactNativePaypalLib.reactNativePaypalLibStrings.JPY]
    
    @scala.inline
    def MXN: typingsSlinky.reactNativePaypalLib.reactNativePaypalLibStrings.MXN = "MXN".asInstanceOf[typingsSlinky.reactNativePaypalLib.reactNativePaypalLibStrings.MXN]
    
    @scala.inline
    def MYR: typingsSlinky.reactNativePaypalLib.reactNativePaypalLibStrings.MYR = "MYR".asInstanceOf[typingsSlinky.reactNativePaypalLib.reactNativePaypalLibStrings.MYR]
    
    @scala.inline
    def NOK: typingsSlinky.reactNativePaypalLib.reactNativePaypalLibStrings.NOK = "NOK".asInstanceOf[typingsSlinky.reactNativePaypalLib.reactNativePaypalLibStrings.NOK]
    
    @scala.inline
    def NZD: typingsSlinky.reactNativePaypalLib.reactNativePaypalLibStrings.NZD = "NZD".asInstanceOf[typingsSlinky.reactNativePaypalLib.reactNativePaypalLibStrings.NZD]
    
    @scala.inline
    def PHP: typingsSlinky.reactNativePaypalLib.reactNativePaypalLibStrings.PHP = "PHP".asInstanceOf[typingsSlinky.reactNativePaypalLib.reactNativePaypalLibStrings.PHP]
    
    @scala.inline
    def PLN: typingsSlinky.reactNativePaypalLib.reactNativePaypalLibStrings.PLN = "PLN".asInstanceOf[typingsSlinky.reactNativePaypalLib.reactNativePaypalLibStrings.PLN]
    
    @scala.inline
    def RUB: typingsSlinky.reactNativePaypalLib.reactNativePaypalLibStrings.RUB = "RUB".asInstanceOf[typingsSlinky.reactNativePaypalLib.reactNativePaypalLibStrings.RUB]
    
    @scala.inline
    def SEK: typingsSlinky.reactNativePaypalLib.reactNativePaypalLibStrings.SEK = "SEK".asInstanceOf[typingsSlinky.reactNativePaypalLib.reactNativePaypalLibStrings.SEK]
    
    @scala.inline
    def SGD: typingsSlinky.reactNativePaypalLib.reactNativePaypalLibStrings.SGD = "SGD".asInstanceOf[typingsSlinky.reactNativePaypalLib.reactNativePaypalLibStrings.SGD]
    
    @scala.inline
    def THB: typingsSlinky.reactNativePaypalLib.reactNativePaypalLibStrings.THB = "THB".asInstanceOf[typingsSlinky.reactNativePaypalLib.reactNativePaypalLibStrings.THB]
    
    @scala.inline
    def TWD: typingsSlinky.reactNativePaypalLib.reactNativePaypalLibStrings.TWD = "TWD".asInstanceOf[typingsSlinky.reactNativePaypalLib.reactNativePaypalLibStrings.TWD]
    
    @scala.inline
    def USD: typingsSlinky.reactNativePaypalLib.reactNativePaypalLibStrings.USD = "USD".asInstanceOf[typingsSlinky.reactNativePaypalLib.reactNativePaypalLibStrings.USD]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.reactNativePaypalLib.reactNativePaypalLibStrings.NO_NETWORK
    - typingsSlinky.reactNativePaypalLib.reactNativePaypalLibStrings.SANDBOX
    - typingsSlinky.reactNativePaypalLib.reactNativePaypalLibStrings.PRODUCTION
  */
  trait ENVIRONMENT extends StObject
  object ENVIRONMENT {
    
    @scala.inline
    def NO_NETWORK: typingsSlinky.reactNativePaypalLib.reactNativePaypalLibStrings.NO_NETWORK = "NO_NETWORK".asInstanceOf[typingsSlinky.reactNativePaypalLib.reactNativePaypalLibStrings.NO_NETWORK]
    
    @scala.inline
    def PRODUCTION: typingsSlinky.reactNativePaypalLib.reactNativePaypalLibStrings.PRODUCTION = "PRODUCTION".asInstanceOf[typingsSlinky.reactNativePaypalLib.reactNativePaypalLibStrings.PRODUCTION]
    
    @scala.inline
    def SANDBOX: typingsSlinky.reactNativePaypalLib.reactNativePaypalLibStrings.SANDBOX = "SANDBOX".asInstanceOf[typingsSlinky.reactNativePaypalLib.reactNativePaypalLibStrings.SANDBOX]
  }
  
  @js.native
  trait EnvironmentParam extends StObject {
    
    var NO_NETWORK: typingsSlinky.reactNativePaypalLib.reactNativePaypalLibStrings.NO_NETWORK = js.native
    
    var PRODUCTION: typingsSlinky.reactNativePaypalLib.reactNativePaypalLibStrings.PRODUCTION = js.native
    
    var SANDBOX: typingsSlinky.reactNativePaypalLib.reactNativePaypalLibStrings.SANDBOX = js.native
  }
  object EnvironmentParam {
    
    @scala.inline
    def apply(NO_NETWORK: NO_NETWORK, PRODUCTION: PRODUCTION, SANDBOX: SANDBOX): EnvironmentParam = {
      val __obj = js.Dynamic.literal(NO_NETWORK = NO_NETWORK.asInstanceOf[js.Any], PRODUCTION = PRODUCTION.asInstanceOf[js.Any], SANDBOX = SANDBOX.asInstanceOf[js.Any])
      __obj.asInstanceOf[EnvironmentParam]
    }
    
    @scala.inline
    implicit class EnvironmentParamMutableBuilder[Self <: EnvironmentParam] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNO_NETWORK(value: NO_NETWORK): Self = StObject.set(x, "NO_NETWORK", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPRODUCTION(value: PRODUCTION): Self = StObject.set(x, "PRODUCTION", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSANDBOX(value: SANDBOX): Self = StObject.set(x, "SANDBOX", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.reactNativePaypalLib.reactNativePaypalLibStrings.SALE
    - typingsSlinky.reactNativePaypalLib.reactNativePaypalLibStrings.AUTHORIZE
    - typingsSlinky.reactNativePaypalLib.reactNativePaypalLibStrings.ORDER
  */
  trait INTENT extends StObject
  object INTENT {
    
    @scala.inline
    def AUTHORIZE: typingsSlinky.reactNativePaypalLib.reactNativePaypalLibStrings.AUTHORIZE = "AUTHORIZE".asInstanceOf[typingsSlinky.reactNativePaypalLib.reactNativePaypalLibStrings.AUTHORIZE]
    
    @scala.inline
    def ORDER: typingsSlinky.reactNativePaypalLib.reactNativePaypalLibStrings.ORDER = "ORDER".asInstanceOf[typingsSlinky.reactNativePaypalLib.reactNativePaypalLibStrings.ORDER]
    
    @scala.inline
    def SALE: typingsSlinky.reactNativePaypalLib.reactNativePaypalLibStrings.SALE = "SALE".asInstanceOf[typingsSlinky.reactNativePaypalLib.reactNativePaypalLibStrings.SALE]
  }
  
  @js.native
  trait IntentParam extends StObject {
    
    var AUTHORIZE: typingsSlinky.reactNativePaypalLib.reactNativePaypalLibStrings.AUTHORIZE = js.native
    
    var ORDER: typingsSlinky.reactNativePaypalLib.reactNativePaypalLibStrings.ORDER = js.native
    
    var SALE: typingsSlinky.reactNativePaypalLib.reactNativePaypalLibStrings.SALE = js.native
  }
  object IntentParam {
    
    @scala.inline
    def apply(AUTHORIZE: AUTHORIZE, ORDER: ORDER, SALE: SALE): IntentParam = {
      val __obj = js.Dynamic.literal(AUTHORIZE = AUTHORIZE.asInstanceOf[js.Any], ORDER = ORDER.asInstanceOf[js.Any], SALE = SALE.asInstanceOf[js.Any])
      __obj.asInstanceOf[IntentParam]
    }
    
    @scala.inline
    implicit class IntentParamMutableBuilder[Self <: IntentParam] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAUTHORIZE(value: AUTHORIZE): Self = StObject.set(x, "AUTHORIZE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setORDER(value: ORDER): Self = StObject.set(x, "ORDER", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSALE(value: SALE): Self = StObject.set(x, "SALE", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PayPalPayment extends StObject {
    
    var environment: String = js.native
    
    var paypal_sdk_version: String = js.native
    
    var platform: String = js.native
    
    var product_name: String = js.native
  }
  object PayPalPayment {
    
    @scala.inline
    def apply(environment: String, paypal_sdk_version: String, platform: String, product_name: String): PayPalPayment = {
      val __obj = js.Dynamic.literal(environment = environment.asInstanceOf[js.Any], paypal_sdk_version = paypal_sdk_version.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], product_name = product_name.asInstanceOf[js.Any])
      __obj.asInstanceOf[PayPalPayment]
    }
    
    @scala.inline
    implicit class PayPalPaymentMutableBuilder[Self <: PayPalPayment] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnvironment(value: String): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaypal_sdk_version(value: String): Self = StObject.set(x, "paypal_sdk_version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProduct_name(value: String): Self = StObject.set(x, "product_name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PaymentConfirmation extends StObject {
    
    var client: PayPalPayment = js.native
    
    var response: ProofOfPayment = js.native
    
    var response_type: String = js.native
  }
  object PaymentConfirmation {
    
    @scala.inline
    def apply(client: PayPalPayment, response: ProofOfPayment, response_type: String): PaymentConfirmation = {
      val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], response_type = response_type.asInstanceOf[js.Any])
      __obj.asInstanceOf[PaymentConfirmation]
    }
    
    @scala.inline
    implicit class PaymentConfirmationMutableBuilder[Self <: PaymentConfirmation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClient(value: PayPalPayment): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponse(value: ProofOfPayment): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponse_type(value: String): Self = StObject.set(x, "response_type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PaymentParams extends StObject {
    
    var acceptCreditCards: Boolean = js.native
    
    var clientId: String = js.native
    
    var currency: CURRENCIES = js.native
    
    var description: String = js.native
    
    var environment: ENVIRONMENT = js.native
    
    var intent: INTENT = js.native
    
    var price: Double = js.native
  }
  object PaymentParams {
    
    @scala.inline
    def apply(
      acceptCreditCards: Boolean,
      clientId: String,
      currency: CURRENCIES,
      description: String,
      environment: ENVIRONMENT,
      intent: INTENT,
      price: Double
    ): PaymentParams = {
      val __obj = js.Dynamic.literal(acceptCreditCards = acceptCreditCards.asInstanceOf[js.Any], clientId = clientId.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], environment = environment.asInstanceOf[js.Any], intent = intent.asInstanceOf[js.Any], price = price.asInstanceOf[js.Any])
      __obj.asInstanceOf[PaymentParams]
    }
    
    @scala.inline
    implicit class PaymentParamsMutableBuilder[Self <: PaymentParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAcceptCreditCards(value: Boolean): Self = StObject.set(x, "acceptCreditCards", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrency(value: CURRENCIES): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnvironment(value: ENVIRONMENT): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIntent(value: INTENT): Self = StObject.set(x, "intent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrice(value: Double): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ProofOfPayment extends StObject {
    
    var create_time: String = js.native
    
    var id: String = js.native
    
    var intent: String = js.native
    
    var state: String = js.native
  }
  object ProofOfPayment {
    
    @scala.inline
    def apply(create_time: String, id: String, intent: String, state: String): ProofOfPayment = {
      val __obj = js.Dynamic.literal(create_time = create_time.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], intent = intent.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProofOfPayment]
    }
    
    @scala.inline
    implicit class ProofOfPaymentMutableBuilder[Self <: ProofOfPayment] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreate_time(value: String): Self = StObject.set(x, "create_time", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIntent(value: String): Self = StObject.set(x, "intent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
}
