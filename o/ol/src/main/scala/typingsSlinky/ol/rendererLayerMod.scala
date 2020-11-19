package typingsSlinky.ol

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.ol.coordinateMod.Coordinate
import typingsSlinky.ol.olFeatureMod.FeatureLike
import typingsSlinky.ol.pixelMod.Pixel
import typingsSlinky.ol.pluggableMapMod.FrameState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ol/renderer/Layer", JSImport.Namespace)
@js.native
object rendererLayerMod extends js.Object {
  
  @js.native
  trait LayerRenderer[LayerType /* <: typingsSlinky.ol.layerLayerMod.default[typingsSlinky.ol.sourceSourceMod.default] */]
    extends typingsSlinky.ol.observableMod.default {
    
    /* protected */ def createLoadedTileFinder(
      source: typingsSlinky.ol.sourceTileMod.default,
      projection: typingsSlinky.ol.projectionMod.default,
      tiles: NumberDictionary[StringDictionary[typingsSlinky.ol.olTileMod.default]]
    ): js.Function2[/* p0 */ Double, /* p1 */ typingsSlinky.ol.tileRangeMod.default, Boolean] = js.native
    
    def forEachFeatureAtCoordinate[T](
      coordinate: Coordinate,
      frameState: FrameState,
      hitTolerance: Double,
      callback: js.Function2[
          /* p0 */ FeatureLike, 
          /* p1 */ typingsSlinky.ol.layerLayerMod.default[typingsSlinky.ol.sourceSourceMod.default], 
          T
        ],
      declutteredFeatures: js.Array[FeatureLike]
    ): T | Unit = js.native
    
    def getDataAtPixel(pixel: Pixel, frameState: FrameState, hitTolerance: Double): js.typedarray.Uint8ClampedArray | js.typedarray.Uint8Array = js.native
    
    def getFeatures(pixel: Pixel): js.Promise[
        js.Array[typingsSlinky.ol.olFeatureMod.default[typingsSlinky.ol.geometryMod.default]]
      ] = js.native
    
    def getLayer(): LayerType = js.native
    
    def handleFontsChanged(): Unit = js.native
    
    /* protected */ def loadImage(image: typingsSlinky.ol.imageBaseMod.default): Boolean = js.native
    
    def loadedTileCallback(
      tiles: NumberDictionary[StringDictionary[typingsSlinky.ol.olTileMod.default]],
      zoom: Double,
      tile: typingsSlinky.ol.olTileMod.default
    ): Unit = js.native
    
    def prepareFrame(frameState: FrameState): Boolean = js.native
    
    def renderFrame(frameState: FrameState, target: HTMLElement): HTMLElement = js.native
    
    /* protected */ def renderIfReadyAndVisible(): Unit = js.native
  }
  
  @js.native
  class default[LayerType /* <: typingsSlinky.ol.layerLayerMod.default[typingsSlinky.ol.sourceSourceMod.default] */] protected () extends LayerRenderer[LayerType] {
    def this(layer: LayerType) = this()
  }
}
