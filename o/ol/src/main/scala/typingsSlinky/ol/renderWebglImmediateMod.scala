package typingsSlinky.ol

import typingsSlinky.ol.coordinateMod.Coordinate
import typingsSlinky.ol.extentMod.Extent
import typingsSlinky.ol.sizeMod.Size
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/render/webgl/Immediate", JSImport.Namespace)
@js.native
object renderWebglImmediateMod extends js.Object {
  @js.native
  class default protected ()
    extends typingsSlinky.ol.renderVectorContextMod.default {
    def this(
      context: typingsSlinky.ol.webglContextMod.default,
      center: Coordinate,
      resolution: Double,
      rotation: Double,
      size: Size,
      extent: Extent,
      pixelRatio: Double
    ) = this()
  }
  
  type WebGLImmediateRenderer = typingsSlinky.ol.renderVectorContextMod.default
}

