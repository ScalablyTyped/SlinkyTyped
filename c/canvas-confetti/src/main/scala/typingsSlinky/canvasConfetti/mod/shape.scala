package typingsSlinky.canvasConfetti.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.canvasConfetti.canvasConfettiStrings.square
  - typingsSlinky.canvasConfetti.canvasConfettiStrings.circle
*/
trait shape extends js.Object

object shape {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def circle: typingsSlinky.canvasConfetti.canvasConfettiStrings.circle = this.cast("circle")
  @scala.inline
  def square: typingsSlinky.canvasConfetti.canvasConfettiStrings.square = this.cast("square")
}

