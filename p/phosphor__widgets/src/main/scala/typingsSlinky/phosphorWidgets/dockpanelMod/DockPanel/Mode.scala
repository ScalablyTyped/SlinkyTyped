package typingsSlinky.phosphorWidgets.dockpanelMod.DockPanel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A type alias for the supported dock panel modes.
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.phosphorWidgets.phosphorWidgetsStrings.`single-document`
  - typingsSlinky.phosphorWidgets.phosphorWidgetsStrings.`multiple-document`
*/
trait Mode extends js.Object

object Mode {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def `multiple-document`: typingsSlinky.phosphorWidgets.phosphorWidgetsStrings.`multiple-document` = this.cast("multiple-document")
  @scala.inline
  def `single-document`: typingsSlinky.phosphorWidgets.phosphorWidgetsStrings.`single-document` = this.cast("single-document")
}

