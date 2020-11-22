package typingsSlinky.ol

import typingsSlinky.ol.featureloaderMod.FeatureLoader
import typingsSlinky.ol.olFeatureMod.FeatureLike
import typingsSlinky.ol.olTileMod.LoadFunction
import typingsSlinky.ol.olTileMod.Options
import typingsSlinky.ol.tileStateMod.TileState
import typingsSlinky.ol.tilecoordMod.TileCoord
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ol/VectorTile", JSImport.Namespace)
@js.native
object olVectorTileMod extends js.Object {
  
  @js.native
  trait VectorTile
    extends typingsSlinky.ol.olTileMod.default {
    
    /**
      * Get the features for this tile. Geometries will be in the view projection.
      */
    def getFeatures(): js.Array[FeatureLike] = js.native
    
    /**
      * Get the feature format assigned for reading this tile's features.
      */
    def getFormat(): typingsSlinky.ol.featureMod.default = js.native
    
    /**
      * Handler for tile load errors.
      */
    def onError(): Unit = js.native
    
    /**
      * Handler for successful tile load.
      */
    def onLoad(
      features: js.Array[typingsSlinky.ol.olFeatureMod.default[typingsSlinky.ol.geometryMod.default]],
      dataProjection: typingsSlinky.ol.projectionMod.default
    ): Unit = js.native
    
    /**
      * Function for use in an {@link module:ol/source/VectorTile~VectorTile}'s tileLoadFunction.
      * Sets the features for the tile.
      */
    def setFeatures(features: js.Array[typingsSlinky.ol.olFeatureMod.default[typingsSlinky.ol.geometryMod.default]]): Unit = js.native
    
    /**
      * Set the feature loader for reading this tile's features.
      */
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
