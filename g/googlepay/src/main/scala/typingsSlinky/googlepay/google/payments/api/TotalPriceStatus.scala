package typingsSlinky.googlepay.google.payments.api

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The status of the total price used.
  *
  * Options:
  *
  * - `NOT_CURRENTLY_KNOWN`:
  *   The total price is not known currently.
  *
  * - `ESTIMATED`:
  *   The total price provided is an estimated price. The final price may
  *   change depending on the selected shipping address or billing address,
  *   if requested.
  *
  * - `FINAL`:
  *   The total price is the final total price of the transaction, and will
  *   not change based on selections made by the buyer.
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.googlepay.googlepayStrings.NOT_CURRENTLY_KNOWN
  - typingsSlinky.googlepay.googlepayStrings.ESTIMATED
  - typingsSlinky.googlepay.googlepayStrings.FINAL
*/
trait TotalPriceStatus extends js.Object
object TotalPriceStatus {
  
  @scala.inline
  def ESTIMATED: typingsSlinky.googlepay.googlepayStrings.ESTIMATED = "ESTIMATED".asInstanceOf[typingsSlinky.googlepay.googlepayStrings.ESTIMATED]
  
  @scala.inline
  def FINAL: typingsSlinky.googlepay.googlepayStrings.FINAL = "FINAL".asInstanceOf[typingsSlinky.googlepay.googlepayStrings.FINAL]
  
  @scala.inline
  def NOT_CURRENTLY_KNOWN: typingsSlinky.googlepay.googlepayStrings.NOT_CURRENTLY_KNOWN = "NOT_CURRENTLY_KNOWN".asInstanceOf[typingsSlinky.googlepay.googlepayStrings.NOT_CURRENTLY_KNOWN]
}
