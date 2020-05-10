package typingsSlinky.googlepay.google.payments.api

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Supported environment names to run Google Pay.
  *
  * Options:
  *
  * - `PRODUCTION`:
  *   Used to return chargeable payment methods when a valid Google
  *   merchant ID is specified and configured for the domain.
  *
  * - `TEST`:
  *   Dummy payment methods that are suitable for testing (default).
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.googlepay.googlepayStrings.PRODUCTION
  - typingsSlinky.googlepay.googlepayStrings.TEST
*/
trait Environment extends js.Object

object Environment {
  @scala.inline
  def PRODUCTION: typingsSlinky.googlepay.googlepayStrings.PRODUCTION = "PRODUCTION".asInstanceOf[typingsSlinky.googlepay.googlepayStrings.PRODUCTION]
  @scala.inline
  def TEST: typingsSlinky.googlepay.googlepayStrings.TEST = "TEST".asInstanceOf[typingsSlinky.googlepay.googlepayStrings.TEST]
}

