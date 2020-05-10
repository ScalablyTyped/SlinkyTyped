package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.std.Object
import typingsSlinky.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VectorTileLayerCapabilitiesOperations extends Object {
  /**
    * Indicates if the tiles from the service can be exported.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VectorTileLayer.html#capabilities)
    */
  var supportsExportTiles: Boolean = js.native
  /**
    * Indicates if the service exposes a tile map that describes the presence of tiles.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VectorTileLayer.html#capabilities)
    */
  var supportsTileMap: Boolean = js.native
}

object VectorTileLayerCapabilitiesOperations {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    supportsExportTiles: Boolean,
    supportsTileMap: Boolean
  ): VectorTileLayerCapabilitiesOperations = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), supportsExportTiles = supportsExportTiles.asInstanceOf[js.Any], supportsTileMap = supportsTileMap.asInstanceOf[js.Any])
    __obj.asInstanceOf[VectorTileLayerCapabilitiesOperations]
  }
  @scala.inline
  implicit class VectorTileLayerCapabilitiesOperationsOps[Self <: VectorTileLayerCapabilitiesOperations] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSupportsExportTiles(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportsExportTiles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSupportsTileMap(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportsTileMap")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

