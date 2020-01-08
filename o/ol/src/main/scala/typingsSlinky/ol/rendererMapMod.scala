package typingsSlinky.ol

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.ol.coordinateMod.Coordinate
import typingsSlinky.ol.featureMod.FeatureLike
import typingsSlinky.ol.layerLayerMod.State
import typingsSlinky.ol.pixelMod.Pixel
import typingsSlinky.ol.pluggableMapMod.FrameState
import typingsSlinky.ol.renderEventTypeMod.EventType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/renderer/Map", JSImport.Namespace)
@js.native
object rendererMapMod extends js.Object {
  @js.native
  trait MapRenderer
    extends typingsSlinky.ol.disposableMod.default {
    /* protected */ def calculateMatrices2D(frameState: FrameState): Unit = js.native
    def dispatchRenderEvent(`type`: EventType, frameState: FrameState): Unit = js.native
    def forEachFeatureAtCoordinate[S, T, U](
      coordinate: Coordinate,
      frameState: FrameState,
      hitTolerance: Double,
      callback: js.ThisFunction2[/* this */ S, /* p0 */ FeatureLike, /* p1 */ typingsSlinky.ol.layerLayerMod.default, T],
      thisArg: S,
      layerFilter: js.ThisFunction1[/* this */ U, /* p0 */ typingsSlinky.ol.layerLayerMod.default, Boolean],
      thisArg2: U
    ): js.UndefOr[T] = js.native
    def forEachLayerAtPixel[S, T, U](
      pixel: Pixel,
      frameState: FrameState,
      hitTolerance: Double,
      callback: js.ThisFunction2[
          /* this */ S, 
          /* p0 */ typingsSlinky.ol.layerLayerMod.default, 
          /* p1 */ scala.scalajs.js.typedarray.Uint8ClampedArray | scala.scalajs.js.typedarray.Uint8Array, 
          T
        ],
      thisArg: S,
      layerFilter: js.ThisFunction1[/* this */ U, /* p0 */ typingsSlinky.ol.layerLayerMod.default, Boolean],
      thisArg2: U
    ): js.UndefOr[T] = js.native
    /* protected */ def getLayerRenderer(layer: typingsSlinky.ol.layerBaseMod.default): typingsSlinky.ol.rendererLayerMod.default = js.native
    /* protected */ def getLayerRendererByKey(layerKey: String): typingsSlinky.ol.rendererLayerMod.default = js.native
    /* protected */ def getLayerRenderers(): StringDictionary[typingsSlinky.ol.rendererLayerMod.default] = js.native
    def getMap(): typingsSlinky.ol.pluggableMapMod.default = js.native
    def hasFeatureAtCoordinate[U](
      coordinate: Coordinate,
      frameState: FrameState,
      hitTolerance: Double,
      layerFilter: js.ThisFunction1[/* this */ U, /* p0 */ typingsSlinky.ol.layerLayerMod.default, Boolean],
      thisArg: U
    ): Boolean = js.native
    def registerLayerRenderers(constructors: js.Array[typingsSlinky.ol.rendererLayerMod.default]): Unit = js.native
    def removeLayerRenderers(): Unit = js.native
    def renderFrame(frameState: FrameState): Unit = js.native
    /* protected */ def scheduleExpireIconCache(frameState: FrameState): Unit = js.native
    /* protected */ def scheduleRemoveUnusedLayerRenderers(frameState: FrameState): Unit = js.native
  }
  
  @js.native
  class default protected () extends MapRenderer {
    def this(map: typingsSlinky.ol.pluggableMapMod.default) = this()
  }
  
  def sortByZIndex(state1: State, state2: State): Double = js.native
}

