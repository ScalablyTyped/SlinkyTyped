package typingsSlinky.ol

import typingsSlinky.ol.extentMod.Extent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/render/canvas/ImageReplay", JSImport.Namespace)
@js.native
object renderCanvasImageReplayMod extends js.Object {
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
  
  type CanvasImageReplay = typingsSlinky.ol.renderCanvasReplayMod.default
}

