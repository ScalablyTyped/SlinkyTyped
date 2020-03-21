package typingsSlinky.chromaJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.chromaJs.chromaJsStrings.rgb
  - typingsSlinky.chromaJs.chromaJsStrings.hsl
  - typingsSlinky.chromaJs.chromaJsStrings.hsv
  - typingsSlinky.chromaJs.chromaJsStrings.hsi
  - typingsSlinky.chromaJs.chromaJsStrings.lab
  - typingsSlinky.chromaJs.chromaJsStrings.lch
  - typingsSlinky.chromaJs.chromaJsStrings.hcl
  - typingsSlinky.chromaJs.chromaJsStrings.lrgb
*/
trait InterpolationMode extends js.Object

object InterpolationMode {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def hcl: typingsSlinky.chromaJs.chromaJsStrings.hcl = this.cast("hcl")
  @scala.inline
  def hsi: typingsSlinky.chromaJs.chromaJsStrings.hsi = this.cast("hsi")
  @scala.inline
  def hsl: typingsSlinky.chromaJs.chromaJsStrings.hsl = this.cast("hsl")
  @scala.inline
  def hsv: typingsSlinky.chromaJs.chromaJsStrings.hsv = this.cast("hsv")
  @scala.inline
  def lab: typingsSlinky.chromaJs.chromaJsStrings.lab = this.cast("lab")
  @scala.inline
  def lch: typingsSlinky.chromaJs.chromaJsStrings.lch = this.cast("lch")
  @scala.inline
  def lrgb: typingsSlinky.chromaJs.chromaJsStrings.lrgb = this.cast("lrgb")
  @scala.inline
  def rgb: typingsSlinky.chromaJs.chromaJsStrings.rgb = this.cast("rgb")
}

