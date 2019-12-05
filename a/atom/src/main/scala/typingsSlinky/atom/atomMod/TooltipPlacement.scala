package typingsSlinky.atom.atomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.atom.atomStrings.top
  - typings.atom.atomStrings.bottom
  - typings.atom.atomStrings.left
  - typings.atom.atomStrings.right
  - typings.atom.atomStrings.auto
  - typings.atom.atomStrings.`auto top`
  - typings.atom.atomStrings.`auto bottom`
  - typings.atom.atomStrings.`auto left`
  - typings.atom.atomStrings.`auto right`
*/
trait TooltipPlacement extends js.Object

object TooltipPlacement {
  @scala.inline
  def auto: typingsSlinky.atom.atomStrings.auto = this.cast("auto")
  @scala.inline
  def `auto bottom`: typingsSlinky.atom.atomStrings.`auto bottom` = this.cast("auto bottom")
  @scala.inline
  def `auto left`: typingsSlinky.atom.atomStrings.`auto left` = this.cast("auto left")
  @scala.inline
  def `auto right`: typingsSlinky.atom.atomStrings.`auto right` = this.cast("auto right")
  @scala.inline
  def `auto top`: typingsSlinky.atom.atomStrings.`auto top` = this.cast("auto top")
  @scala.inline
  def bottom: typingsSlinky.atom.atomStrings.bottom = this.cast("bottom")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def left: typingsSlinky.atom.atomStrings.left = this.cast("left")
  @scala.inline
  def right: typingsSlinky.atom.atomStrings.right = this.cast("right")
  @scala.inline
  def top: typingsSlinky.atom.atomStrings.top = this.cast("top")
}

