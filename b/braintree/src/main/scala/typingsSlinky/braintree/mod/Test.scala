package typingsSlinky.braintree.mod

import typingsSlinky.braintree.AnonAbstractTransactable
import typingsSlinky.braintree.AnonAccountNotAuthorizedContactUs
import typingsSlinky.braintree.AnonAmexPayWithPoints
import typingsSlinky.braintree.AnonAuthorize
import typingsSlinky.braintree.AnonIssuingBank
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("braintree", "Test")
@js.native
class Test () extends js.Object {
  var CreditCardDefaults: AnonIssuingBank = js.native
  var CreditCardNumbers: AnonAmexPayWithPoints = js.native
  var MerchantAccountTest: AnonAccountNotAuthorizedContactUs = js.native
  var Nonces: AnonAbstractTransactable = js.native
  var TransactionAmounts: AnonAuthorize = js.native
}

