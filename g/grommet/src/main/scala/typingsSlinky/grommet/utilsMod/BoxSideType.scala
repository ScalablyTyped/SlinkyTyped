package typingsSlinky.grommet.utilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Extracting types for common properties among components
/* Rewritten from type alias, can be one of: 
  - typings.grommet.grommetStrings.top
  - typings.grommet.grommetStrings.left
  - typings.grommet.grommetStrings.bottom
  - typings.grommet.grommetStrings.right
  - typings.grommet.grommetStrings.horizontal
  - typings.grommet.grommetStrings.vertical
  - typings.grommet.grommetStrings.all
*/
trait BoxSideType extends _BorderType

object BoxSideType {
  @scala.inline
  def all: typingsSlinky.grommet.grommetStrings.all = this.cast("all")
  @scala.inline
  def bottom: typingsSlinky.grommet.grommetStrings.bottom = this.cast("bottom")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def horizontal: typingsSlinky.grommet.grommetStrings.horizontal = this.cast("horizontal")
  @scala.inline
  def left: typingsSlinky.grommet.grommetStrings.left = this.cast("left")
  @scala.inline
  def right: typingsSlinky.grommet.grommetStrings.right = this.cast("right")
  @scala.inline
  def top: typingsSlinky.grommet.grommetStrings.top = this.cast("top")
  @scala.inline
  def vertical: typingsSlinky.grommet.grommetStrings.vertical = this.cast("vertical")
}

