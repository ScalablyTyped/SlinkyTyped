package typingsSlinky.ol

import typingsSlinky.ol.extentMod.Extent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/render/canvas/PolygonReplay", JSImport.Namespace)
@js.native
object renderCanvasPolygonReplayMod extends js.Object {
  @js.native
  class default protected ()
    extends typingsSlinky.ol.renderCanvasReplayMod.default {
    def this(
      tolerance: Double,
      maxExtent: Extent,
      resolution: Double,
      pixelRatio: Double,
      overlaps: Boolean,
      declutterTree: js.Any
    ) = this()
  }
  
  type CanvasPolygonReplay = typingsSlinky.ol.renderCanvasReplayMod.default
}

