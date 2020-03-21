package typingsSlinky.rheostat.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.rheostat.rheostatStrings.horizontal
  - typingsSlinky.rheostat.rheostatStrings.vertical
*/
trait Orientation extends js.Object

object Orientation {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def horizontal: typingsSlinky.rheostat.rheostatStrings.horizontal = this.cast("horizontal")
  @scala.inline
  def vertical: typingsSlinky.rheostat.rheostatStrings.vertical = this.cast("vertical")
}

