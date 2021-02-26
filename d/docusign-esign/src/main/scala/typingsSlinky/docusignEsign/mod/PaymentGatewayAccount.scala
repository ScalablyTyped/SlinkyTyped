package typingsSlinky.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PaymentGatewayAccount extends StObject {
  
  /**
    * When **true**, the sender can pass custom metadata about the payment to the payment gateway. You pass in this metadata on an EnvelopeRecipientTab, in the `customMetadata`
    * property under `paymentDetails`.
    *
    * For example, this property is set to **true** for the Authorize.net gateway by default. As a result, the extra metadata that you send displays for the Authorize.net transaction
    * in the merchant gateway portal under **Description**.
    *
    * **Note**: This property is read only and cannot be changed.
    */
  var allowCustomMetadata: js.UndefOr[Boolean] = js.native
  
  /**
    * This property contains metadata about the payment gateway account's configuration such as the API key, `userId`, and `merchantId` details.
    */
  var config: js.UndefOr[PaymentGatewayAccountSetting] = js.native
  
  /**
    * A user-defined name for a connected gateway account.
    *
    * This name is used in the Admin panel in the list of connected accounts and in Tagger in the payment gateway selector.
    *
    * The human-readable version of `paymentGatewayAccountId`.
    */
  var displayName: js.UndefOr[String] = js.native
  
  /**
    * When **true**, the payment gateway account is enabled.
    */
  var isEnabled: js.UndefOr[String] = js.native
  
  /**
    * Reserved for DocuSign.
    */
  var isLegacy: js.UndefOr[String] = js.native
  
  /**
    * The UTC DateTime that the payment gateway account was last updated.
    */
  var lastModified: js.UndefOr[String] = js.native
  
  /**
    * Reserved for DocuSign.
    */
  var payPalLegacySettings: js.UndefOr[PayPalLegacySettings] = js.native
  
  /**
    * Payment gateway used by the connected gateway account.
    * This is the name used by the API.
    * For a human-readable version use `paymentGatewayDisplayName`.
    *
    * Possible values are:
    *
    * * `Stripe`
    * * `Braintree`
    * * `AuthorizeDotNet`
    */
  var paymentGateway: js.UndefOr[String] = js.native
  
  /**
    * A GUID that identifies the payment gateway account. For a human-readable version use `displayName`.
    */
  var paymentGatewayAccountId: js.UndefOr[String] = js.native
  
  /**
    * The display name of the payment gateway that the connected gateway account uses.
    * This is the human-readable version of `paymentGateway`.
    *
    * Possible values are:
    *
    * * Stripe
    * * Braintree
    * * Authorize.Net
    */
  var paymentGatewayDisplayName: js.UndefOr[String] = js.native
  
  /**
    * A list of ISO 4217 currency codes for the currencies that the payment gateway account supports.
    *
    * Examples:
    *
    * - `USD`
    * - `CAD`
    * - `EUR`
    * - `HKD`
    */
  var supportedCurrencies: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * An array of paymentMethodWithOptions objects that specify the payment methods that are available for the gateway.
    */
  var supportedPaymentMethods: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * An array of `paymentMethodWithOptions` objects that specify the payment methods that are available for the gateway, as well as the payment options that are compatible with
    * each payment method.
    */
  var supportedPaymentMethodsWithOptions: js.UndefOr[
    js.Array[
      /* This object contains information about a payment method that the gateway accepts and the payment options that are compatible with it.
    */ PaymentMethodWithOptions
    ]
  ] = js.native
}
object PaymentGatewayAccount {
  
  @scala.inline
  def apply(): PaymentGatewayAccount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PaymentGatewayAccount]
  }
  
  @scala.inline
  implicit class PaymentGatewayAccountMutableBuilder[Self <: PaymentGatewayAccount] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowCustomMetadata(value: Boolean): Self = StObject.set(x, "allowCustomMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowCustomMetadataUndefined: Self = StObject.set(x, "allowCustomMetadata", js.undefined)
    
    @scala.inline
    def setConfig(value: PaymentGatewayAccountSetting): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setIsEnabled(value: String): Self = StObject.set(x, "isEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsEnabledUndefined: Self = StObject.set(x, "isEnabled", js.undefined)
    
    @scala.inline
    def setIsLegacy(value: String): Self = StObject.set(x, "isLegacy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsLegacyUndefined: Self = StObject.set(x, "isLegacy", js.undefined)
    
    @scala.inline
    def setLastModified(value: String): Self = StObject.set(x, "lastModified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedUndefined: Self = StObject.set(x, "lastModified", js.undefined)
    
    @scala.inline
    def setPayPalLegacySettings(value: PayPalLegacySettings): Self = StObject.set(x, "payPalLegacySettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayPalLegacySettingsUndefined: Self = StObject.set(x, "payPalLegacySettings", js.undefined)
    
    @scala.inline
    def setPaymentGateway(value: String): Self = StObject.set(x, "paymentGateway", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaymentGatewayAccountId(value: String): Self = StObject.set(x, "paymentGatewayAccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaymentGatewayAccountIdUndefined: Self = StObject.set(x, "paymentGatewayAccountId", js.undefined)
    
    @scala.inline
    def setPaymentGatewayDisplayName(value: String): Self = StObject.set(x, "paymentGatewayDisplayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaymentGatewayDisplayNameUndefined: Self = StObject.set(x, "paymentGatewayDisplayName", js.undefined)
    
    @scala.inline
    def setPaymentGatewayUndefined: Self = StObject.set(x, "paymentGateway", js.undefined)
    
    @scala.inline
    def setSupportedCurrencies(value: js.Array[String]): Self = StObject.set(x, "supportedCurrencies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportedCurrenciesUndefined: Self = StObject.set(x, "supportedCurrencies", js.undefined)
    
    @scala.inline
    def setSupportedCurrenciesVarargs(value: String*): Self = StObject.set(x, "supportedCurrencies", js.Array(value :_*))
    
    @scala.inline
    def setSupportedPaymentMethods(value: js.Array[String]): Self = StObject.set(x, "supportedPaymentMethods", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportedPaymentMethodsUndefined: Self = StObject.set(x, "supportedPaymentMethods", js.undefined)
    
    @scala.inline
    def setSupportedPaymentMethodsVarargs(value: String*): Self = StObject.set(x, "supportedPaymentMethods", js.Array(value :_*))
    
    @scala.inline
    def setSupportedPaymentMethodsWithOptions(
      value: js.Array[
          /* This object contains information about a payment method that the gateway accepts and the payment options that are compatible with it.
      */ PaymentMethodWithOptions
        ]
    ): Self = StObject.set(x, "supportedPaymentMethodsWithOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportedPaymentMethodsWithOptionsUndefined: Self = StObject.set(x, "supportedPaymentMethodsWithOptions", js.undefined)
    
    @scala.inline
    def setSupportedPaymentMethodsWithOptionsVarargs(
      value: (/* This object contains information about a payment method that the gateway accepts and the payment options that are compatible with it.
      */ PaymentMethodWithOptions)*
    ): Self = StObject.set(x, "supportedPaymentMethodsWithOptions", js.Array(value :_*))
  }
}
