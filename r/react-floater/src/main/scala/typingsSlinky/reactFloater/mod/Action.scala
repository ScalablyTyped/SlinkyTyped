package typingsSlinky.reactFloater.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.reactFloater.reactFloaterStrings.open
  - typingsSlinky.reactFloater.reactFloaterStrings.close
*/
trait Action extends js.Object

object Action {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def close: typingsSlinky.reactFloater.reactFloaterStrings.close = this.cast("close")
  @scala.inline
  def open: typingsSlinky.reactFloater.reactFloaterStrings.open = this.cast("open")
}

