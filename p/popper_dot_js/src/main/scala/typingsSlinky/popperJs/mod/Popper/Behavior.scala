package typingsSlinky.popperJs.mod.Popper

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.popperJs.popperJsStrings.flip
  - typingsSlinky.popperJs.popperJsStrings.clockwise
  - typingsSlinky.popperJs.popperJsStrings.counterclockwise
*/
trait Behavior extends js.Object

object Behavior {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def clockwise: typingsSlinky.popperJs.popperJsStrings.clockwise = this.cast("clockwise")
  @scala.inline
  def counterclockwise: typingsSlinky.popperJs.popperJsStrings.counterclockwise = this.cast("counterclockwise")
  @scala.inline
  def flip: typingsSlinky.popperJs.popperJsStrings.flip = this.cast("flip")
}

