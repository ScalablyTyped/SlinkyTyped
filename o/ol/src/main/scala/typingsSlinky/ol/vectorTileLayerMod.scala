package typingsSlinky.ol

import typingsSlinky.ol.olFeatureMod.FeatureLike
import typingsSlinky.ol.pluggableMapMod.FrameState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ol/renderer/canvas/VectorTileLayer", JSImport.Namespace)
@js.native
object vectorTileLayerMod extends js.Object {
  
  @js.native
  trait CanvasVectorTileLayerRenderer
    extends typingsSlinky.ol.tileLayerMod.default {
    
    def prepareTile(
      tile: typingsSlinky.ol.vectorRenderTileMod.default,
      pixelRatio: Double,
      projection: typingsSlinky.ol.projectionMod.default,
      queue: Boolean
    ): Boolean = js.native
    
    def renderFeature(
      feature: FeatureLike,
      squaredTolerance: Double,
      styles: js.Array[typingsSlinky.ol.styleStyleMod.default],
      executorGroup: typingsSlinky.ol.builderGroupMod.default
    ): Boolean = js.native
    def renderFeature(
      feature: FeatureLike,
      squaredTolerance: Double,
      styles: typingsSlinky.ol.styleStyleMod.default,
      executorGroup: typingsSlinky.ol.builderGroupMod.default
    ): Boolean = js.native
    
    def renderQueuedTileImages_(hifi: Boolean, frameState: FrameState): Unit = js.native
  }
  
  @js.native
  class default protected () extends CanvasVectorTileLayerRenderer {
    def this(layer: typingsSlinky.ol.vectorTileMod.default) = this()
  }
}
