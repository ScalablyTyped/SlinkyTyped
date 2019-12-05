package typingsSlinky.ol.styleAtlasMod

import org.scalajs.dom.raw.CanvasRenderingContext2D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Atlas extends js.Object {
  def add(
    id: String,
    width: Double,
    height: Double,
    renderCallback: js.Function3[/* p0 */ CanvasRenderingContext2D, /* p1 */ Double, /* p2 */ Double, Unit]
  ): AtlasInfo = js.native
  def add(
    id: String,
    width: Double,
    height: Double,
    renderCallback: js.Function3[/* p0 */ CanvasRenderingContext2D, /* p1 */ Double, /* p2 */ Double, Unit],
    opt_this: js.Any
  ): AtlasInfo = js.native
  def get(id: String): AtlasInfo = js.native
}

