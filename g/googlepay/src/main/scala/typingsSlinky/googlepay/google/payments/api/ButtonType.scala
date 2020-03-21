package typingsSlinky.googlepay.google.payments.api

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.googlepay.googlepayStrings.long
  - typingsSlinky.googlepay.googlepayStrings.short
*/
trait ButtonType extends js.Object

object ButtonType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def long: typingsSlinky.googlepay.googlepayStrings.long = this.cast("long")
  @scala.inline
  def short: typingsSlinky.googlepay.googlepayStrings.short = this.cast("short")
}

