package typingsSlinky.dfVisible

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.dfVisible.dfVisibleStrings.horizontal
  - typingsSlinky.dfVisible.dfVisibleStrings.vertical
  - typingsSlinky.dfVisible.dfVisibleStrings.both
*/
trait Direction extends js.Object

object Direction {
  @scala.inline
  def both: typingsSlinky.dfVisible.dfVisibleStrings.both = this.cast("both")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def horizontal: typingsSlinky.dfVisible.dfVisibleStrings.horizontal = this.cast("horizontal")
  @scala.inline
  def vertical: typingsSlinky.dfVisible.dfVisibleStrings.vertical = this.cast("vertical")
}

