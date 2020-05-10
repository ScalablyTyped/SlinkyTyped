package typingsSlinky.googlepay.google.payments.api

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Enum string of a display item status.
  *
  * Options:
  *
  * - `FINAL`:
  *   DisplayItem is final and the item displays the value in price.
  *
  * - `PENDING`:
  *   DisplayItem does not display value in price but instead display as
  *   "pending".
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.googlepay.googlepayStrings.FINAL
  - typingsSlinky.googlepay.googlepayStrings.PENDING
*/
trait DisplayItemStatus extends js.Object

object DisplayItemStatus {
  @scala.inline
  def FINAL: typingsSlinky.googlepay.googlepayStrings.FINAL = "FINAL".asInstanceOf[typingsSlinky.googlepay.googlepayStrings.FINAL]
  @scala.inline
  def PENDING: typingsSlinky.googlepay.googlepayStrings.PENDING = "PENDING".asInstanceOf[typingsSlinky.googlepay.googlepayStrings.PENDING]
}

