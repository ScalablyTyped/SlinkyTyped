package typingsSlinky.bootstrapColorpicker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.bootstrapColorpicker.bootstrapColorpickerStrings.hex
  - typingsSlinky.bootstrapColorpicker.bootstrapColorpickerStrings.rgb
  - typingsSlinky.bootstrapColorpicker.bootstrapColorpickerStrings.rgba
*/
trait ColorFormat extends js.Object

object ColorFormat {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def hex: typingsSlinky.bootstrapColorpicker.bootstrapColorpickerStrings.hex = this.cast("hex")
  @scala.inline
  def rgb: typingsSlinky.bootstrapColorpicker.bootstrapColorpickerStrings.rgb = this.cast("rgb")
  @scala.inline
  def rgba: typingsSlinky.bootstrapColorpicker.bootstrapColorpickerStrings.rgba = this.cast("rgba")
}

