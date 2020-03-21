package typingsSlinky.reactInteractive.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.reactInteractive.reactInteractiveStrings.mouseClick
  - typingsSlinky.reactInteractive.reactInteractiveStrings.tapClick
  - typingsSlinky.reactInteractive.reactInteractiveStrings.keyClick
*/
trait ClickType extends js.Object

object ClickType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def keyClick: typingsSlinky.reactInteractive.reactInteractiveStrings.keyClick = this.cast("keyClick")
  @scala.inline
  def mouseClick: typingsSlinky.reactInteractive.reactInteractiveStrings.mouseClick = this.cast("mouseClick")
  @scala.inline
  def tapClick: typingsSlinky.reactInteractive.reactInteractiveStrings.tapClick = this.cast("tapClick")
}

