package typingsSlinky.figma

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

////////////////////////////////////////////////////////////////////////////////
// Styles
/* Rewritten from type alias, can be one of: 
  - typings.figma.figmaStrings.PAINT
  - typings.figma.figmaStrings.TEXT
  - typings.figma.figmaStrings.EFFECT
  - typings.figma.figmaStrings.GRID
*/
trait StyleType extends js.Object

object StyleType {
  @scala.inline
  def EFFECT: typingsSlinky.figma.figmaStrings.EFFECT = this.cast("EFFECT")
  @scala.inline
  def GRID: typingsSlinky.figma.figmaStrings.GRID = this.cast("GRID")
  @scala.inline
  def PAINT: typingsSlinky.figma.figmaStrings.PAINT = this.cast("PAINT")
  @scala.inline
  def TEXT: typingsSlinky.figma.figmaStrings.TEXT = this.cast("TEXT")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

