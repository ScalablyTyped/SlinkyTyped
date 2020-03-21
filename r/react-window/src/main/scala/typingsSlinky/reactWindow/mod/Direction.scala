package typingsSlinky.reactWindow.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.reactWindow.reactWindowStrings.vertical
  - typingsSlinky.reactWindow.reactWindowStrings.horizontal
*/
trait Direction extends js.Object

object Direction {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def horizontal: typingsSlinky.reactWindow.reactWindowStrings.horizontal = this.cast("horizontal")
  @scala.inline
  def vertical: typingsSlinky.reactWindow.reactWindowStrings.vertical = this.cast("vertical")
}

