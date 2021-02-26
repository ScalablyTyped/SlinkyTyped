package typingsSlinky.ol

import typingsSlinky.ol.olFeatureMod.FeatureLike
import typingsSlinky.ol.pluggableMapMod.FrameState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object vectorTileLayerMod {
  
  @JSImport("ol/renderer/canvas/VectorTileLayer", JSImport.Default)
  @js.native
  class default protected () extends CanvasVectorTileLayerRenderer {
    def this(layer: typingsSlinky.ol.vectorTileMod.default) = this()
  }
  
  @js.native
  trait CanvasVectorTileLayerRenderer
    extends typingsSlinky.ol.tileLayerMod.default {
    
    def isDrawableTile(tile: typingsSlinky.ol.vectorRenderTileMod.default): Boolean = js.native
    
    def prepareTile(
      tile: typingsSlinky.ol.vectorRenderTileMod.default,
      pixelRatio: Double,
      projection: typingsSlinky.ol.projectionMod.default,
      queue: Boolean
    ): js.UndefOr[Boolean] = js.native
    
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
}
