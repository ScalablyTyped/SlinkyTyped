package typingsSlinky.ol

import typingsSlinky.ol.extentMod.Extent
import typingsSlinky.ol.featureMod.FeatureLike
import typingsSlinky.ol.featureloaderMod.FeatureLoader
import typingsSlinky.ol.tileMod.LoadFunction
import typingsSlinky.ol.tileMod.Options
import typingsSlinky.ol.tileStateMod.TileState
import typingsSlinky.ol.tilecoordMod.TileCoord
import typingsSlinky.ol.vectorTileMod.VectorTile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/VectorTile", JSImport.Namespace)
@js.native
object vectorTileMod extends js.Object {
  @js.native
  trait VectorTile
    extends typingsSlinky.ol.tileMod.default {
    def getExtent(): Extent = js.native
    def getFeatures(): js.Array[FeatureLike] = js.native
    def getFormat(): typingsSlinky.ol.formatFeatureMod.default = js.native
    def getProjection(): typingsSlinky.ol.projProjectionMod.default = js.native
    def getReplayGroup(layer: typingsSlinky.ol.layerLayerMod.default, key: String): typingsSlinky.ol.renderReplayGroupMod.default = js.native
    def onError(): Unit = js.native
    def onLoad(
      features: js.Array[typingsSlinky.ol.featureMod.default],
      dataProjection: typingsSlinky.ol.projProjectionMod.default,
      extent: Extent
    ): Unit = js.native
    def setExtent(extent: Extent): Unit = js.native
    def setFeatures(features: js.Array[typingsSlinky.ol.featureMod.default]): Unit = js.native
    def setLoader(loader: FeatureLoader): Unit = js.native
    def setProjection(projection: typingsSlinky.ol.projProjectionMod.default): Unit = js.native
    def setReplayGroup(
      layer: typingsSlinky.ol.layerLayerMod.default,
      key: String,
      replayGroup: typingsSlinky.ol.renderReplayGroupMod.default
    ): Unit = js.native
  }
  
  @js.native
  class default protected () extends VectorTile {
    def this(
      tileCoord: TileCoord,
      state: TileState,
      src: String,
      format: typingsSlinky.ol.formatFeatureMod.default,
      tileLoadFunction: LoadFunction
    ) = this()
    def this(
      tileCoord: TileCoord,
      state: TileState,
      src: String,
      format: typingsSlinky.ol.formatFeatureMod.default,
      tileLoadFunction: LoadFunction,
      opt_options: Options
    ) = this()
  }
  
}

