package typingsSlinky.googlepay.google.payments.api

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Payment method tokenization type enum string.
  *
  * Options:
  *
  * - `PAYMENT_GATEWAY`:
  *   Tokenize a payment response to be consumed or charged by a specified
  *   third-party gateway service.
  *
  * - `DIRECT`:
  *   Tokenize to be consumed/charged directly by the merchant.
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.googlepay.googlepayStrings.PAYMENT_GATEWAY
  - typingsSlinky.googlepay.googlepayStrings.DIRECT
*/
trait PaymentMethodTokenizationType extends js.Object
object PaymentMethodTokenizationType {
  
  @scala.inline
  def DIRECT: typingsSlinky.googlepay.googlepayStrings.DIRECT = "DIRECT".asInstanceOf[typingsSlinky.googlepay.googlepayStrings.DIRECT]
  
  @scala.inline
  def PAYMENT_GATEWAY: typingsSlinky.googlepay.googlepayStrings.PAYMENT_GATEWAY = "PAYMENT_GATEWAY".asInstanceOf[typingsSlinky.googlepay.googlepayStrings.PAYMENT_GATEWAY]
}
