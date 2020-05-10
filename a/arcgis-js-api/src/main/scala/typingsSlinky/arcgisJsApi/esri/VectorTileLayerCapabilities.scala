package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.std.Object
import typingsSlinky.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VectorTileLayerCapabilities extends Object {
  var exportMap: VectorTileLayerCapabilitiesExportMap = js.native
  /**
    * Indicates options supported by the exportTiles operation. Will be `null` if the `supportsExportTiles` is `false`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VectorTileLayer.html#capabilities)
    */
  var exportTiles: js.Any = js.native
  /**
    * Indicates operations that can be performed on the service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VectorTileLayer.html#capabilities)
    */
  var operations: VectorTileLayerCapabilitiesOperations = js.native
}

object VectorTileLayerCapabilities {
  @scala.inline
  def apply(
    constructor: js.Function,
    exportMap: VectorTileLayerCapabilitiesExportMap,
    exportTiles: js.Any,
    hasOwnProperty: PropertyKey => Boolean,
    operations: VectorTileLayerCapabilitiesOperations,
    propertyIsEnumerable: PropertyKey => Boolean
  ): VectorTileLayerCapabilities = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], exportMap = exportMap.asInstanceOf[js.Any], exportTiles = exportTiles.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), operations = operations.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[VectorTileLayerCapabilities]
  }
  @scala.inline
  implicit class VectorTileLayerCapabilitiesOps[Self <: VectorTileLayerCapabilities] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExportMap(value: VectorTileLayerCapabilitiesExportMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exportMap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExportTiles(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exportTiles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOperations(value: VectorTileLayerCapabilitiesOperations): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operations")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

