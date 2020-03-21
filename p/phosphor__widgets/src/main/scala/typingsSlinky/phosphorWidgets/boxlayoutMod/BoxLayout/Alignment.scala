package typingsSlinky.phosphorWidgets.boxlayoutMod.BoxLayout

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A type alias for a box layout alignment.
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.phosphorWidgets.phosphorWidgetsStrings.start
  - typingsSlinky.phosphorWidgets.phosphorWidgetsStrings.center
  - typingsSlinky.phosphorWidgets.phosphorWidgetsStrings.end
  - typingsSlinky.phosphorWidgets.phosphorWidgetsStrings.justify
*/
trait Alignment extends js.Object

object Alignment {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def center: typingsSlinky.phosphorWidgets.phosphorWidgetsStrings.center = this.cast("center")
  @scala.inline
  def end: typingsSlinky.phosphorWidgets.phosphorWidgetsStrings.end = this.cast("end")
  @scala.inline
  def justify: typingsSlinky.phosphorWidgets.phosphorWidgetsStrings.justify = this.cast("justify")
  @scala.inline
  def start: typingsSlinky.phosphorWidgets.phosphorWidgetsStrings.start = this.cast("start")
}

