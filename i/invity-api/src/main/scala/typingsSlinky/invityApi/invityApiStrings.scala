package typingsSlinky.invityApi

import typingsSlinky.invityApi.mod.BuyCryptoPaymentMethod
import typingsSlinky.invityApi.mod.BuyTradeFinalStatus
import typingsSlinky.invityApi.mod.BuyTradeStatus
import typingsSlinky.invityApi.mod.BuyTradeTag
import typingsSlinky.invityApi.mod.ExchangeTradeFinalStatus
import typingsSlinky.invityApi.mod.ExchangeTradeStatus
import typingsSlinky.invityApi.mod.TicketTopic
import typingsSlinky.invityApi.mod._ExchangeFee
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object invityApiStrings {
  
  @js.native
  sealed trait APPROVAL_PENDING extends BuyTradeStatus
  @scala.inline
  def APPROVAL_PENDING: APPROVAL_PENDING = "APPROVAL_PENDING".asInstanceOf[APPROVAL_PENDING]
  
  @js.native
  sealed trait BLOCKED
    extends BuyTradeFinalStatus
       with BuyTradeStatus
  @scala.inline
  def BLOCKED: BLOCKED = "BLOCKED".asInstanceOf[BLOCKED]
  
  @js.native
  sealed trait `Buy crypto` extends TicketTopic
  @scala.inline
  def `Buy crypto`: `Buy crypto` = ("Buy crypto").asInstanceOf[`Buy crypto`]
  
  @js.native
  sealed trait CONFIRM extends ExchangeTradeStatus
  @scala.inline
  def CONFIRM: CONFIRM = "CONFIRM".asInstanceOf[CONFIRM]
  
  @js.native
  sealed trait CONFIRMING extends ExchangeTradeStatus
  @scala.inline
  def CONFIRMING: CONFIRMING = "CONFIRMING".asInstanceOf[CONFIRMING]
  
  @js.native
  sealed trait CONVERTING extends ExchangeTradeStatus
  @scala.inline
  def CONVERTING: CONVERTING = "CONVERTING".asInstanceOf[CONVERTING]
  
  @js.native
  sealed trait ERROR
    extends BuyTradeFinalStatus
       with BuyTradeStatus
       with ExchangeTradeFinalStatus
       with ExchangeTradeStatus
  @scala.inline
  def ERROR: ERROR = "ERROR".asInstanceOf[ERROR]
  
  @js.native
  sealed trait `Exchange crypto` extends TicketTopic
  @scala.inline
  def `Exchange crypto`: `Exchange crypto` = ("Exchange crypto").asInstanceOf[`Exchange crypto`]
  
  @js.native
  sealed trait GET extends StObject
  @scala.inline
  def GET: GET = "GET".asInstanceOf[GET]
  
  @js.native
  sealed trait IFRAME extends StObject
  @scala.inline
  def IFRAME: IFRAME = "IFRAME".asInstanceOf[IFRAME]
  
  @js.native
  sealed trait INCLUDED extends _ExchangeFee
  @scala.inline
  def INCLUDED: INCLUDED = "INCLUDED".asInstanceOf[INCLUDED]
  
  @js.native
  sealed trait `Invest in crypto` extends TicketTopic
  @scala.inline
  def `Invest in crypto`: `Invest in crypto` = ("Invest in crypto").asInstanceOf[`Invest in crypto`]
  
  @js.native
  sealed trait InvityDotio extends TicketTopic
  @scala.inline
  def InvityDotio: InvityDotio = "Invity.io".asInstanceOf[InvityDotio]
  
  @js.native
  sealed trait KYC
    extends ExchangeTradeFinalStatus
       with ExchangeTradeStatus
  @scala.inline
  def KYC: KYC = "KYC".asInstanceOf[KYC]
  
  @js.native
  sealed trait LOADING extends ExchangeTradeStatus
  @scala.inline
  def LOADING: LOADING = "LOADING".asInstanceOf[LOADING]
  
  @js.native
  sealed trait LOGIN_REQUEST extends BuyTradeStatus
  @scala.inline
  def LOGIN_REQUEST: LOGIN_REQUEST = "LOGIN_REQUEST".asInstanceOf[LOGIN_REQUEST]
  
  @js.native
  sealed trait NONE extends StObject
  @scala.inline
  def NONE: NONE = "NONE".asInstanceOf[NONE]
  
  @js.native
  sealed trait POST extends StObject
  @scala.inline
  def POST: POST = "POST".asInstanceOf[POST]
  
  @js.native
  sealed trait QUOTE_TIMEOUT extends StObject
  @scala.inline
  def QUOTE_TIMEOUT: QUOTE_TIMEOUT = "QUOTE_TIMEOUT".asInstanceOf[QUOTE_TIMEOUT]
  
  @js.native
  sealed trait REQUESTING extends BuyTradeStatus
  @scala.inline
  def REQUESTING: REQUESTING = "REQUESTING".asInstanceOf[REQUESTING]
  
  @js.native
  sealed trait SENDING extends ExchangeTradeStatus
  @scala.inline
  def SENDING: SENDING = "SENDING".asInstanceOf[SENDING]
  
  @js.native
  sealed trait SUBMITTED extends BuyTradeStatus
  @scala.inline
  def SUBMITTED: SUBMITTED = "SUBMITTED".asInstanceOf[SUBMITTED]
  
  @js.native
  sealed trait SUCCESS
    extends BuyTradeFinalStatus
       with BuyTradeStatus
       with ExchangeTradeFinalStatus
       with ExchangeTradeStatus
  @scala.inline
  def SUCCESS: SUCCESS = "SUCCESS".asInstanceOf[SUCCESS]
  
  @js.native
  sealed trait UNKNOWN extends _ExchangeFee
  @scala.inline
  def UNKNOWN: UNKNOWN = "UNKNOWN".asInstanceOf[UNKNOWN]
  
  @js.native
  sealed trait alternativeCurrency extends BuyTradeTag
  @scala.inline
  def alternativeCurrency: alternativeCurrency = "alternativeCurrency".asInstanceOf[alternativeCurrency]
  
  @js.native
  sealed trait bancontact extends BuyCryptoPaymentMethod
  @scala.inline
  def bancontact: bancontact = "bancontact".asInstanceOf[bancontact]
  
  @js.native
  sealed trait bankTransfer extends BuyCryptoPaymentMethod
  @scala.inline
  def bankTransfer: bankTransfer = "bankTransfer".asInstanceOf[bankTransfer]
  
  @js.native
  sealed trait bestRate extends BuyTradeTag
  @scala.inline
  def bestRate: bestRate = "bestRate".asInstanceOf[bestRate]
  
  @js.native
  sealed trait creditCard extends BuyCryptoPaymentMethod
  @scala.inline
  def creditCard: creditCard = "creditCard".asInstanceOf[creditCard]
  
  @js.native
  sealed trait eps extends BuyCryptoPaymentMethod
  @scala.inline
  def eps: eps = "eps".asInstanceOf[eps]
  
  @js.native
  sealed trait favorite extends BuyTradeTag
  @scala.inline
  def favorite: favorite = "favorite".asInstanceOf[favorite]
  
  @js.native
  sealed trait giropay extends BuyCryptoPaymentMethod
  @scala.inline
  def giropay: giropay = "giropay".asInstanceOf[giropay]
  
  @js.native
  sealed trait hex extends StObject
  @scala.inline
  def hex: hex = "hex".asInstanceOf[hex]
  
  @js.native
  sealed trait iDeal extends BuyCryptoPaymentMethod
  @scala.inline
  def iDeal: iDeal = "iDeal".asInstanceOf[iDeal]
  
  @js.native
  sealed trait number extends StObject
  @scala.inline
  def number: number = "number".asInstanceOf[number]
  
  @js.native
  sealed trait renewed extends BuyTradeTag
  @scala.inline
  def renewed: renewed = "renewed".asInstanceOf[renewed]
  
  @js.native
  sealed trait sofort extends BuyCryptoPaymentMethod
  @scala.inline
  def sofort: sofort = "sofort".asInstanceOf[sofort]
  
  @js.native
  sealed trait text extends StObject
  @scala.inline
  def text: text = "text".asInstanceOf[text]
  
  @js.native
  sealed trait wantCrypto extends BuyTradeTag
  @scala.inline
  def wantCrypto: wantCrypto = "wantCrypto".asInstanceOf[wantCrypto]
}
