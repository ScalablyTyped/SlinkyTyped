package typingsSlinky.phosphorDragdrop.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.phosphorDragdrop.phosphorDragdropStrings.none
  - typingsSlinky.phosphorDragdrop.phosphorDragdropStrings.copy
  - typingsSlinky.phosphorDragdrop.phosphorDragdropStrings.link
  - typingsSlinky.phosphorDragdrop.phosphorDragdropStrings.move
*/
trait DropAction extends js.Object

object DropAction {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def copy: typingsSlinky.phosphorDragdrop.phosphorDragdropStrings.copy = this.cast("copy")
  @scala.inline
  def link: typingsSlinky.phosphorDragdrop.phosphorDragdropStrings.link = this.cast("link")
  @scala.inline
  def move: typingsSlinky.phosphorDragdrop.phosphorDragdropStrings.move = this.cast("move")
  @scala.inline
  def none: typingsSlinky.phosphorDragdrop.phosphorDragdropStrings.none = this.cast("none")
}

