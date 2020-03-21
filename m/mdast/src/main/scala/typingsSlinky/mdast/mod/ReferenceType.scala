package typingsSlinky.mdast.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.mdast.mdastStrings.shortcut
  - typingsSlinky.mdast.mdastStrings.collapsed
  - typingsSlinky.mdast.mdastStrings.full
*/
trait ReferenceType extends js.Object

object ReferenceType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def collapsed: typingsSlinky.mdast.mdastStrings.collapsed = this.cast("collapsed")
  @scala.inline
  def full: typingsSlinky.mdast.mdastStrings.full = this.cast("full")
  @scala.inline
  def shortcut: typingsSlinky.mdast.mdastStrings.shortcut = this.cast("shortcut")
}

