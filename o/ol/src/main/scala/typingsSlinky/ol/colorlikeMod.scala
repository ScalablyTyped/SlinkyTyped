package typingsSlinky.ol

import org.scalajs.dom.raw.CanvasGradient
import org.scalajs.dom.raw.CanvasPattern
import typingsSlinky.ol.colorMod.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/colorlike", JSImport.Namespace)
@js.native
object colorlikeMod extends js.Object {
  def asColorLike(color: Color): ColorLike = js.native
  def asColorLike(color: ColorLike): ColorLike = js.native
  type ColorLike = String | CanvasPattern | CanvasGradient
}

