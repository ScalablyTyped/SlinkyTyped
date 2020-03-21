package typingsSlinky.googlepay.google.payments.api

import typingsSlinky.googlepay.googlepayStrings.default_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.googlepay.googlepayStrings.default_
  - typingsSlinky.googlepay.googlepayStrings.black
  - typingsSlinky.googlepay.googlepayStrings.white
*/
trait ButtonColor extends js.Object

object ButtonColor {
  @scala.inline
  def black: typingsSlinky.googlepay.googlepayStrings.black = this.cast("black")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def default: default_ = this.cast("default")
  @scala.inline
  def white: typingsSlinky.googlepay.googlepayStrings.white = this.cast("white")
}

