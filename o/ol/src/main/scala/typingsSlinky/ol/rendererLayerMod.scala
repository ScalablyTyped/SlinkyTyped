package typingsSlinky.ol

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.ol.coordinateMod.Coordinate
import typingsSlinky.ol.extentMod.Extent
import typingsSlinky.ol.featureMod.FeatureLike
import typingsSlinky.ol.pluggableMapMod.FrameState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/renderer/Layer", JSImport.Namespace)
@js.native
object rendererLayerMod extends js.Object {
  @js.native
  trait LayerRenderer
    extends typingsSlinky.ol.observableMod.default {
    /* protected */ def createLoadedTileFinder(
      source: typingsSlinky.ol.sourceTileMod.default,
      projection: typingsSlinky.ol.projProjectionMod.default,
      tiles: NumberDictionary[StringDictionary[typingsSlinky.ol.tileMod.default]]
    ): js.Function2[/* p0 */ Double, /* p1 */ typingsSlinky.ol.tileRangeMod.default, Boolean] = js.native
    def forEachFeatureAtCoordinate[T](
      coordinate: Coordinate,
      frameState: FrameState,
      hitTolerance: Double,
      callback: js.Function2[/* p0 */ FeatureLike, /* p1 */ typingsSlinky.ol.layerLayerMod.default, T]
    ): T | Unit = js.native
    def getLayer(): typingsSlinky.ol.layerLayerMod.default = js.native
    def hasFeatureAtCoordinate(coordinate: Coordinate, frameState: FrameState): Boolean = js.native
    /* protected */ def loadImage(image: typingsSlinky.ol.imageBaseMod.default): Boolean = js.native
    /* protected */ def manageTilePyramid[T](
      frameState: FrameState,
      tileSource: typingsSlinky.ol.sourceTileMod.default,
      tileGrid: typingsSlinky.ol.tilegridTileGridMod.default,
      pixelRatio: Double,
      projection: typingsSlinky.ol.projProjectionMod.default,
      extent: Extent,
      currentZ: Double,
      preload: Double
    ): Unit = js.native
    /* protected */ def manageTilePyramid[T](
      frameState: FrameState,
      tileSource: typingsSlinky.ol.sourceTileMod.default,
      tileGrid: typingsSlinky.ol.tilegridTileGridMod.default,
      pixelRatio: Double,
      projection: typingsSlinky.ol.projProjectionMod.default,
      extent: Extent,
      currentZ: Double,
      preload: Double,
      opt_tileCallback: js.Function0[Unit]
    ): Unit = js.native
    /* protected */ def manageTilePyramid[T](
      frameState: FrameState,
      tileSource: typingsSlinky.ol.sourceTileMod.default,
      tileGrid: typingsSlinky.ol.tilegridTileGridMod.default,
      pixelRatio: Double,
      projection: typingsSlinky.ol.projProjectionMod.default,
      extent: Extent,
      currentZ: Double,
      preload: Double,
      opt_tileCallback: js.Function0[Unit],
      opt_this: T
    ): Unit = js.native
    /* protected */ def renderIfReadyAndVisible(): Unit = js.native
    /* protected */ def scheduleExpireCache(frameState: FrameState, tileSource: typingsSlinky.ol.sourceTileMod.default): Unit = js.native
    /* protected */ def updateUsedTiles(
      usedTiles: StringDictionary[StringDictionary[typingsSlinky.ol.tileRangeMod.default]],
      tileSource: typingsSlinky.ol.sourceTileMod.default,
      z: Double,
      tileRange: typingsSlinky.ol.tileRangeMod.default
    ): Unit = js.native
  }
  
  @js.native
  class default protected () extends LayerRenderer {
    def this(layer: typingsSlinky.ol.layerLayerMod.default) = this()
  }
  
}

