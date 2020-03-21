package typingsSlinky.materialUiCore.mod.PropTypes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.materialUiCore.materialUiCoreStrings.inherit
  - typingsSlinky.materialUiCore.materialUiCoreStrings.primary
  - typingsSlinky.materialUiCore.materialUiCoreStrings.secondary
  - typingsSlinky.materialUiCore.materialUiCoreStrings.default
*/
trait Color extends js.Object

object Color {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def default: typingsSlinky.materialUiCore.materialUiCoreStrings.default = this.cast("default")
  @scala.inline
  def inherit: typingsSlinky.materialUiCore.materialUiCoreStrings.inherit = this.cast("inherit")
  @scala.inline
  def primary: typingsSlinky.materialUiCore.materialUiCoreStrings.primary = this.cast("primary")
  @scala.inline
  def secondary: typingsSlinky.materialUiCore.materialUiCoreStrings.secondary = this.cast("secondary")
}

