package typingsSlinky.paypalCordovaPlugin

import typingsSlinky.paypalCordovaPlugin.PayPalCordovaPlugin.PayPalMobileStatic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  var PayPalMobile: PayPalMobileStatic = js.native
  
  @js.native
  /**
    * @param options A set of options to use. Any options not specified will assume default values.
    */
  class PayPalConfiguration ()
    extends typingsSlinky.paypalCordovaPlugin.PayPalConfiguration {
    def this(options: PayPalConfigurationOptions) = this()
  }
  
  //#endregion
  //#region cdv-plugin-paypal-mobile-sdk.js
  @js.native
  object PayPalCordovaPlugin extends js.Object
  
  @js.native
  class PayPalItem protected ()
    extends typingsSlinky.paypalCordovaPlugin.PayPalItem {
    /**
      * @param name Name of the item. 127 characters max.
      * @param quantity Number of units. 10 characters max.
      * @param price Unit price for this item 10 characters max.
      * May be negative for "coupon" etc.
      * @param currency ISO standard currency code.
      * @param sku The stock keeping unit for this item. 50 characters max (optional).
      */
    def this(name: String, quantity: Double, price: String, currency: String) = this()
    def this(name: String, quantity: Double, price: String, currency: String, sku: String) = this()
  }
  
  /**
    * Convenience constructor. Returns a PayPalPayment with the specified amount, currency code, and short description.
    */
  @js.native
  class PayPalPayment protected ()
    extends typingsSlinky.paypalCordovaPlugin.PayPalPayment {
    /**
      * @param amount The amount of the payment.
      * @param currencyCode The ISO 4217 currency for the payment.
      * @param shortDescription A short descripton of the payment.
      * @param intent • "Sale" for an immediate payment.
      * • "Auth" for payment authorization only, to be captured separately at a later time.
      * • "Order" for taking an order, with authorization and capture to be done separately at a later time.
      * @param details PayPalPaymentDetails object (optional).
      */
    def this(amount: String, currency: String, shortDescription: String, intent: String) = this()
    def this(
      amount: String,
      currency: String,
      shortDescription: String,
      intent: String,
      details: typingsSlinky.paypalCordovaPlugin.PayPalPaymentDetails
    ) = this()
  }
  
  /**
    * The PayPalPaymentDetails class defines optional amount details.
    *
    * @see https://developer.paypal.com/webapps/developer/docs/api/#details-object for more details.
    */
  @js.native
  class PayPalPaymentDetails protected ()
    extends typingsSlinky.paypalCordovaPlugin.PayPalPaymentDetails {
    /**
      * @param subtotal Sub-total (amount) of items being paid for. 10 characters max with support for 2 decimal places.
      * @param shipping Amount charged for shipping. 10 characters max with support for 2 decimal places.
      * @param tax Amount charged for tax. 10 characters max with support for 2 decimal places.
      */
    def this(subtotal: String, shipping: String, tax: String) = this()
  }
  
  @js.native
  class PayPalShippingAddress protected ()
    extends typingsSlinky.paypalCordovaPlugin.PayPalShippingAddress {
    /**
      * @param recipientName Name of the recipient at this address. 50 characters max.
      * @param line1 Line 1 of the address (e.g., Number, street, etc). 100 characters max.
      * @param line2 Line 2 of the address (e.g., Suite, apt #, etc). 100 characters max. Optional.
      * @param city City name. 50 characters max.
      * @param state 2-letter code for US states, and the equivalent for other countries. 100 characters max. Required in certain countries.
      * @param postalCode ZIP code or equivalent is usually required for countries that have them. 20 characters max. Required in certain countries.
      * @param countryCode 2-letter country code. 2 characters max.
      */
    def this(
      recipientName: String,
      line1: String,
      line2: String,
      city: String,
      state: String,
      postalCode: String,
      countryCode: String
    ) = this()
  }
}
