package typingsSlinky.ol

import typingsSlinky.ol.coordinateMod.Coordinate
import typingsSlinky.ol.olFeatureMod.FeatureLike
import typingsSlinky.ol.pixelMod.Pixel
import typingsSlinky.ol.pluggableMapMod.FrameState
import typingsSlinky.ol.renderEventTypeMod.EventType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ol/renderer/Map", JSImport.Namespace)
@js.native
object mapMod extends js.Object {
  
  @js.native
  trait MapRenderer
    extends typingsSlinky.ol.disposableMod.default {
    
    /* protected */ def calculateMatrices2D(frameState: FrameState): Unit = js.native
    
    def dispatchRenderEvent(`type`: EventType, frameState: FrameState): Unit = js.native
    
    def forEachFeatureAtCoordinate[S, T, U](
      coordinate: Coordinate,
      frameState: FrameState,
      hitTolerance: Double,
      checkWrapped: Boolean,
      callback: js.ThisFunction2[
          /* this */ S, 
          /* p0 */ FeatureLike, 
          /* p1 */ typingsSlinky.ol.layerLayerMod.default[typingsSlinky.ol.sourceSourceMod.default], 
          T
        ],
      thisArg: S,
      layerFilter: js.ThisFunction1[
          /* this */ U, 
          /* p0 */ typingsSlinky.ol.layerLayerMod.default[typingsSlinky.ol.sourceSourceMod.default], 
          Boolean
        ],
      thisArg2: U
    ): js.UndefOr[T] = js.native
    
    def forEachLayerAtPixel[T](
      pixel: Pixel,
      frameState: FrameState,
      hitTolerance: Double,
      callback: js.Function2[
          /* p0 */ typingsSlinky.ol.layerLayerMod.default[typingsSlinky.ol.sourceSourceMod.default], 
          /* p1 */ js.typedarray.Uint8ClampedArray | js.typedarray.Uint8Array, 
          T
        ],
      layerFilter: js.Function1[
          /* p0 */ typingsSlinky.ol.layerLayerMod.default[typingsSlinky.ol.sourceSourceMod.default], 
          Boolean
        ]
    ): js.UndefOr[T] = js.native
    
    def getMap(): typingsSlinky.ol.pluggableMapMod.default = js.native
    
    def hasFeatureAtCoordinate[U](
      coordinate: Coordinate,
      frameState: FrameState,
      hitTolerance: Double,
      checkWrapped: Boolean,
      layerFilter: js.ThisFunction1[
          /* this */ U, 
          /* p0 */ typingsSlinky.ol.layerLayerMod.default[typingsSlinky.ol.sourceSourceMod.default], 
          Boolean
        ],
      thisArg: U
    ): Boolean = js.native
    
    /**
      * Render.
      */
    def renderFrame(frameState: FrameState): Unit = js.native
    
    /* protected */ def scheduleExpireIconCache(frameState: FrameState): Unit = js.native
  }
  
  @js.native
  abstract class default protected () extends MapRenderer {
    def this(map: typingsSlinky.ol.pluggableMapMod.default) = this()
  }
}
