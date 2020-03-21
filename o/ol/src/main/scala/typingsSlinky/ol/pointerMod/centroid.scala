package typingsSlinky.ol.pointerMod

import org.scalajs.dom.raw.PointerEvent
import typingsSlinky.ol.pixelMod.Pixel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/interaction/Pointer", "centroid")
@js.native
object centroid extends js.Object {
  def apply(pointerEvents: js.Array[PointerEvent]): Pixel = js.native
}

