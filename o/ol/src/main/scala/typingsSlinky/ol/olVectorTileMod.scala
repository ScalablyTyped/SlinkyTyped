package typingsSlinky.ol

import typingsSlinky.ol.featureloaderMod.FeatureLoader
import typingsSlinky.ol.olFeatureMod.FeatureLike
import typingsSlinky.ol.olTileMod.LoadFunction
import typingsSlinky.ol.olTileMod.Options
import typingsSlinky.ol.tileStateMod.TileState
import typingsSlinky.ol.tilecoordMod.TileCoord
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/VectorTile", JSImport.Namespace)
@js.native
object olVectorTileMod extends js.Object {
  @js.native
  trait VectorTile
    extends typingsSlinky.ol.olTileMod.default {
    def getFeatures(): js.Array[FeatureLike] = js.native
    def getFormat(): typingsSlinky.ol.featureMod.default = js.native
    def onError(): Unit = js.native
    def onLoad(
      features: js.Array[typingsSlinky.ol.olFeatureMod.default[typingsSlinky.ol.geometryMod.default]],
      dataProjection: typingsSlinky.ol.projectionMod.default
    ): Unit = js.native
    def setFeatures(features: js.Array[typingsSlinky.ol.olFeatureMod.default[typingsSlinky.ol.geometryMod.default]]): Unit = js.native
    def setLoader(loader: FeatureLoader): Unit = js.native
  }
  
  @js.native
  class default protected () extends VectorTile {
    def this(
      tileCoord: TileCoord,
      state: TileState,
      src: String,
      format: typingsSlinky.ol.featureMod.default,
      tileLoadFunction: LoadFunction
    ) = this()
    def this(
      tileCoord: TileCoord,
      state: TileState,
      src: String,
      format: typingsSlinky.ol.featureMod.default,
      tileLoadFunction: LoadFunction,
      opt_options: Options
    ) = this()
  }
  
}

