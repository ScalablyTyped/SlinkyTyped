package typingsSlinky.paypalCordovaPlugin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PayPalConfiguration extends js.Object {
  
  /**
    * If set to false, the SDK will only support paying with PayPal, not with credit cards.
    * This applies only to single payments (via PayPalPaymentViewController).
    * Future payments (via PayPalFuturePaymentViewController) always use PayPal.
    * Defaults to true.
    */
  var acceptCreditCards: Boolean = js.native
  
  /**
    * Will be overridden by email used in most recent PayPal login.
    */
  var defaultUserEmail: String = js.native
  
  /**
    * Will be overridden by phone country code used in most recent PayPal login
    */
  var defaultUserPhoneCountryCode: String = js.native
  
  /**
    * Will be overridden by phone number used in most recent PayPal login.
    * @note If you set defaultUserPhoneNumber, be sure to also set defaultUserPhoneCountryCode.
    */
  var defaultUserPhoneNumber: String = js.native
  
  /**
    * Normally, the SDK blurs the screen when the app is backgrounded,
    * to obscure credit card or PayPal account details in the iOS-saved screenshot.
    * If your app already does its own blurring upon backgrounding, you might choose to disable this.
    * Defaults to false.
    */
  var disableBlurWhenBackgrounding: Boolean = js.native
  
  /**
    * Sandbox credentials can be difficult to type on a mobile device. Setting this flag to true will
    * cause the sandboxUserPassword and sandboxUserPin to always be pre-populated into login fields.
    *
    * This setting will have no effect if the operation mode is production.
    * Defaults to false.
    */
  var forceDefaultsInSandbox: Boolean = js.native
  
  /**
    * If not set, or if set to nil, defaults to the device's current language setting.
    *
    * Can be specified as a language code ("en", "fr", "zh-Hans", etc.) or as a locale ("en_AU", "fr_FR", "zh-Hant_HK", etc.).
    * If the library does not contain localized strings for a specified locale, then will fall back to the language. E.g., "es_CO" -> "es".
    * If the library does not contain localized strings for a specified language, then will fall back to American English.
    *
    * If you specify only a language code, and that code matches the device's currently preferred language,
    * then the library will attempt to use the device's current region as well.
    * E.g., specifying "en" on a device set to "English" and "United Kingdom" will result in "en_GB".
    *
    * These localizations are currently included:
    * da,de,en,en_AU,en_GB,en_SV,es,es_MX,fr,he,it,ja,ko,nb,nl,pl,pt,pt_BR,ru,sv,tr,zh-Hans,zh-Hant_HK,zh-Hant_TW.
    */
  var languageOrLocale: String = js.native
  
  /**
    * Your company name, as it should be displayed to the user
    * when requesting consent via a PayPalFuturePaymentViewController.
    */
  var merchantName: String = js.native
  
  /**
    * URL of your company's privacy policy, which will be offered to the user
    * when requesting consent via a PayPalFuturePaymentViewController.
    */
  var merchantPrivacyPolicyURL: String = js.native
  
  /**
    * URL of your company's user agreement, which will be offered to the user
    * when requesting consent via a PayPalFuturePaymentViewController.
    */
  var merchantUserAgreementURL: String = js.native
  
  /**
    * For single payments, options for the shipping address.
    *
    * - 0 - PayPalShippingAddressOptionNone: no shipping address applies.
    *
    * - 1 - PayPalShippingAddressOptionProvided: shipping address will be provided by your app,
    *   in the shippingAddress property of PayPalPayment.
    *
    * - 2 - PayPalShippingAddressOptionPayPal: user will choose from shipping addresses on file
    *   for their PayPal account.
    *
    * - 3 - PayPalShippingAddressOptionBoth: user will choose from the shipping address provided by your app,
    *   in the shippingAddress property of PayPalPayment, plus the shipping addresses on file for the user's PayPal account.
    *
    * Defaults to 0 (PayPalShippingAddressOptionNone).
    */
  var payPalShippingAddressOption: Double = js.native
  
  /**
    * If you will present the SDK's view controller within a popover, then set this property to true.
    * Defaults to false. (iOS only)
    */
  var presentingInPopover: Boolean = js.native
  
  /**
    * If set to true, then if the user pays via their PayPal account,
    * the SDK will remember the user's PayPal username or phone number;
    * if the user pays via their credit card, then the SDK will remember
    * the PayPal Vault token representing the user's credit card.
    *
    * If set to false, then any previously-remembered username, phone number, or
    * credit card token will be erased, and subsequent payment information will
    * not be remembered.
    *
    * Defaults to true.
    */
  var rememberUser: Boolean = js.native
  
  /**
    * Password to use for sandbox if 'forceDefaultsInSandbox' is set.
    */
  var sandboxUserPassword: String = js.native
  
  /**
    * PIN to use for sandbox if 'forceDefaultsInSandbox' is set.
    */
  var sandboxUserPin: String = js.native
}
object PayPalConfiguration {
  
  @scala.inline
  def apply(
    acceptCreditCards: Boolean,
    defaultUserEmail: String,
    defaultUserPhoneCountryCode: String,
    defaultUserPhoneNumber: String,
    disableBlurWhenBackgrounding: Boolean,
    forceDefaultsInSandbox: Boolean,
    languageOrLocale: String,
    merchantName: String,
    merchantPrivacyPolicyURL: String,
    merchantUserAgreementURL: String,
    payPalShippingAddressOption: Double,
    presentingInPopover: Boolean,
    rememberUser: Boolean,
    sandboxUserPassword: String,
    sandboxUserPin: String
  ): PayPalConfiguration = {
    val __obj = js.Dynamic.literal(acceptCreditCards = acceptCreditCards.asInstanceOf[js.Any], defaultUserEmail = defaultUserEmail.asInstanceOf[js.Any], defaultUserPhoneCountryCode = defaultUserPhoneCountryCode.asInstanceOf[js.Any], defaultUserPhoneNumber = defaultUserPhoneNumber.asInstanceOf[js.Any], disableBlurWhenBackgrounding = disableBlurWhenBackgrounding.asInstanceOf[js.Any], forceDefaultsInSandbox = forceDefaultsInSandbox.asInstanceOf[js.Any], languageOrLocale = languageOrLocale.asInstanceOf[js.Any], merchantName = merchantName.asInstanceOf[js.Any], merchantPrivacyPolicyURL = merchantPrivacyPolicyURL.asInstanceOf[js.Any], merchantUserAgreementURL = merchantUserAgreementURL.asInstanceOf[js.Any], payPalShippingAddressOption = payPalShippingAddressOption.asInstanceOf[js.Any], presentingInPopover = presentingInPopover.asInstanceOf[js.Any], rememberUser = rememberUser.asInstanceOf[js.Any], sandboxUserPassword = sandboxUserPassword.asInstanceOf[js.Any], sandboxUserPin = sandboxUserPin.asInstanceOf[js.Any])
    __obj.asInstanceOf[PayPalConfiguration]
  }
  
  @scala.inline
  implicit class PayPalConfigurationOps[Self <: PayPalConfiguration] (val x: Self) extends AnyVal {
    
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
    def setAcceptCreditCards(value: Boolean): Self = this.set("acceptCreditCards", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultUserEmail(value: String): Self = this.set("defaultUserEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultUserPhoneCountryCode(value: String): Self = this.set("defaultUserPhoneCountryCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultUserPhoneNumber(value: String): Self = this.set("defaultUserPhoneNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableBlurWhenBackgrounding(value: Boolean): Self = this.set("disableBlurWhenBackgrounding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceDefaultsInSandbox(value: Boolean): Self = this.set("forceDefaultsInSandbox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageOrLocale(value: String): Self = this.set("languageOrLocale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMerchantName(value: String): Self = this.set("merchantName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMerchantPrivacyPolicyURL(value: String): Self = this.set("merchantPrivacyPolicyURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMerchantUserAgreementURL(value: String): Self = this.set("merchantUserAgreementURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayPalShippingAddressOption(value: Double): Self = this.set("payPalShippingAddressOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPresentingInPopover(value: Boolean): Self = this.set("presentingInPopover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRememberUser(value: Boolean): Self = this.set("rememberUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSandboxUserPassword(value: String): Self = this.set("sandboxUserPassword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSandboxUserPin(value: String): Self = this.set("sandboxUserPin", value.asInstanceOf[js.Any])
  }
}
