package typingsSlinky.recurlyRecurlyJs.recurlyMod

import org.scalajs.dom.raw.HTMLFormElement
import typingsSlinky.recurlyRecurlyJs.`3dSecureMod`.Risk
import typingsSlinky.recurlyRecurlyJs.adyenMod.Adyen
import typingsSlinky.recurlyRecurlyJs.adyenMod.AdyenInstance
import typingsSlinky.recurlyRecurlyJs.adyenMod.AdyenOptions
import typingsSlinky.recurlyRecurlyJs.anon.ThreeDSecure
import typingsSlinky.recurlyRecurlyJs.applePayMod.ApplePay
import typingsSlinky.recurlyRecurlyJs.applePayMod.ApplePayConfig
import typingsSlinky.recurlyRecurlyJs.applePayMod.ApplePayInstance
import typingsSlinky.recurlyRecurlyJs.bankAccountMod.BankAccount
import typingsSlinky.recurlyRecurlyJs.configureMod.Configure
import typingsSlinky.recurlyRecurlyJs.configureMod.RecurlyOptions
import typingsSlinky.recurlyRecurlyJs.elementsMod.Elements
import typingsSlinky.recurlyRecurlyJs.elementsMod.ElementsInstance
import typingsSlinky.recurlyRecurlyJs.emitterMod.Emitter
import typingsSlinky.recurlyRecurlyJs.giftCardMod.Done
import typingsSlinky.recurlyRecurlyJs.giftCardMod.GiftCard
import typingsSlinky.recurlyRecurlyJs.giftCardMod.GiftCardOptions
import typingsSlinky.recurlyRecurlyJs.paypalMod.PayPal
import typingsSlinky.recurlyRecurlyJs.paypalMod.PayPalConfig
import typingsSlinky.recurlyRecurlyJs.paypalMod.PayPalInstance
import typingsSlinky.recurlyRecurlyJs.tokenMod.CustomerData
import typingsSlinky.recurlyRecurlyJs.tokenMod.Token
import typingsSlinky.recurlyRecurlyJs.tokenMod.TokenHandler
import typingsSlinky.recurlyRecurlyJs.validateMod.Validate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Recurly extends Emitter[RecurlyEvent] {
  
  def Adyen(): AdyenInstance = js.native
  def Adyen(adyenOptions: AdyenOptions): AdyenInstance = js.native
  @JSName("Adyen")
  var Adyen_Original: Adyen = js.native
  
  def ApplePay(config: ApplePayConfig): ApplePayInstance = js.native
  @JSName("ApplePay")
  var ApplePay_Original: ApplePay = js.native
  
  def Elements(): ElementsInstance = js.native
  @JSName("Elements")
  var Elements_Original: Elements = js.native
  
  def PayPal(): PayPalInstance = js.native
  def PayPal(config: PayPalConfig): PayPalInstance = js.native
  @JSName("PayPal")
  var PayPal_Original: PayPal = js.native
  
  var Pricing: typingsSlinky.recurlyRecurlyJs.pricingMod.Pricing = js.native
  
  def Risk(): ThreeDSecure = js.native
  @JSName("Risk")
  var Risk_Original: Risk = js.native
  
  var bankAccount: BankAccount = js.native
  
  def configure(recurlyConfig: String): Unit = js.native
  def configure(recurlyConfig: RecurlyOptions): Unit = js.native
  @JSName("configure")
  var configure_Original: Configure = js.native
  
  def giftCard(giftCardOptions: GiftCardOptions, done: Done): Unit = js.native
  @JSName("giftCard")
  var giftCard_Original: GiftCard = js.native
  
  def token(elements: ElementsInstance, second: CustomerData, third: TokenHandler): Unit = js.native
  def token(elements: ElementsInstance, second: HTMLFormElement, third: TokenHandler): Unit = js.native
  def token(form: CustomerData, second: TokenHandler): Unit = js.native
  def token(form: HTMLFormElement, second: TokenHandler): Unit = js.native
  @JSName("token")
  var token_Original: Token = js.native
  
  var validate: Validate = js.native
}
