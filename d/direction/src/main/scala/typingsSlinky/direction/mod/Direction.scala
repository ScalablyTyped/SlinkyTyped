package typingsSlinky.direction.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.direction.directionStrings.ltr
  - typingsSlinky.direction.directionStrings.rtl
  - typingsSlinky.direction.directionStrings.neutral
*/
trait Direction extends js.Object

object Direction {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def ltr: typingsSlinky.direction.directionStrings.ltr = this.cast("ltr")
  @scala.inline
  def neutral: typingsSlinky.direction.directionStrings.neutral = this.cast("neutral")
  @scala.inline
  def rtl: typingsSlinky.direction.directionStrings.rtl = this.cast("rtl")
}

