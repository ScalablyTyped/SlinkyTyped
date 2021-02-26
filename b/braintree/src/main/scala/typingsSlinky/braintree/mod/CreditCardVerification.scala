package typingsSlinky.braintree.mod

import typingsSlinky.braintree.anon.Bin
import typingsSlinky.braintree.anon.CountryName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("braintree", "CreditCardVerification")
@js.native
class CreditCardVerification () extends StObject {
  
  var amount: String = js.native
  
  var avsErrorResponseCode: js.UndefOr[String] = js.native
  
  var avsPostalCodeResponseCode: js.UndefOr[String] = js.native
  
  var avsScreetAddressResponseCode: js.UndefOr[String] = js.native
  
  var billing: js.UndefOr[CountryName] = js.native
  
  var createdAt: js.Date = js.native
  
  var creditCard: js.UndefOr[Bin] = js.native
  
  var currencyIsoCode: String = js.native
  
  var cvvResponseCode: String = js.native
  
  var gatewayRejectionReason: js.UndefOr[String] = js.native
  
  var id: String = js.native
  
  var merchantAccountId: String = js.native
  
  var processorResponseCode: String = js.native
  
  var processorResponseText: String = js.native
  
  var processorResponseType: String = js.native
  
  var riskData: js.UndefOr[TransactionRiskData] = js.native
  
  var status: String = js.native
}
