package typingsSlinky.ol

import org.scalajs.dom.raw.CanvasRenderingContext2D
import typingsSlinky.ol.extentMod.Extent
import typingsSlinky.ol.transformMod.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/render/canvas/Immediate", JSImport.Namespace)
@js.native
object renderCanvasImmediateMod extends js.Object {
  @js.native
  class default protected ()
    extends typingsSlinky.ol.renderVectorContextMod.default {
    def this(
      context: CanvasRenderingContext2D,
      pixelRatio: Double,
      extent: Extent,
      transform: Transform,
      viewRotation: Double
    ) = this()
  }
  
  type CanvasImmediateRenderer = typingsSlinky.ol.renderVectorContextMod.default
}

