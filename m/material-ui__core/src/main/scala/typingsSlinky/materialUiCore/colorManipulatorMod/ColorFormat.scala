package typingsSlinky.materialUiCore.colorManipulatorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.materialUiCore.materialUiCoreStrings.rgb
  - typingsSlinky.materialUiCore.materialUiCoreStrings.rgba
  - typingsSlinky.materialUiCore.materialUiCoreStrings.hsl
  - typingsSlinky.materialUiCore.materialUiCoreStrings.hsla
*/
trait ColorFormat extends js.Object

object ColorFormat {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def hsl: typingsSlinky.materialUiCore.materialUiCoreStrings.hsl = this.cast("hsl")
  @scala.inline
  def hsla: typingsSlinky.materialUiCore.materialUiCoreStrings.hsla = this.cast("hsla")
  @scala.inline
  def rgb: typingsSlinky.materialUiCore.materialUiCoreStrings.rgb = this.cast("rgb")
  @scala.inline
  def rgba: typingsSlinky.materialUiCore.materialUiCoreStrings.rgba = this.cast("rgba")
}

