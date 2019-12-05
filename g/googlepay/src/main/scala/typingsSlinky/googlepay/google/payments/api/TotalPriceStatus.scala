package typingsSlinky.googlepay.google.payments.api

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.googlepay.googlepayStrings.ESTIMATED
  - typings.googlepay.googlepayStrings.FINAL
  - typings.googlepay.googlepayStrings.NOT_CURRENTLY_KNOWN
*/
trait TotalPriceStatus extends js.Object

object TotalPriceStatus {
  @scala.inline
  def ESTIMATED: typingsSlinky.googlepay.googlepayStrings.ESTIMATED = this.cast("ESTIMATED")
  @scala.inline
  def FINAL: typingsSlinky.googlepay.googlepayStrings.FINAL = this.cast("FINAL")
  @scala.inline
  def NOT_CURRENTLY_KNOWN: typingsSlinky.googlepay.googlepayStrings.NOT_CURRENTLY_KNOWN = this.cast("NOT_CURRENTLY_KNOWN")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

