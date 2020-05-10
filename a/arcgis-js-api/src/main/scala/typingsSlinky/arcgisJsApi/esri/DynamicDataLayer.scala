package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`data-layer`
import typingsSlinky.std.Object
import typingsSlinky.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DynamicDataLayer extends Object {
  /**
    * A table, feature class, or raster that resides in a registered workspace (either a folder or geodatabase). The data sources are not visible in the Services Directory by default. They may be viewed, published, and configured using the ArcGIS Server Manager.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#DynamicDataLayer)
    */
  var dataSource: TableDataSource | QueryTableDataSource | RasterDataSource | JoinTableDataSource = js.native
  /**
    * Controls field visibility in the layer. Only specified fields will be visible. If `null`, all fields are visible in the dynamic layer. The specification for a field object is provided below.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#DynamicDataLayer)
    */
  var fields: js.Array[DynamicDataLayerFields] = js.native
  /**
    * This value is always `data-layer` and is inferred when the `dataSource` property is set.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#DynamicDataLayer)
    */
  var `type`: `data-layer` = js.native
}

object DynamicDataLayer {
  @scala.inline
  def apply(
    constructor: js.Function,
    dataSource: TableDataSource | QueryTableDataSource | RasterDataSource | JoinTableDataSource,
    fields: js.Array[DynamicDataLayerFields],
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    `type`: `data-layer`
  ): DynamicDataLayer = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], dataSource = dataSource.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DynamicDataLayer]
  }
  @scala.inline
  implicit class DynamicDataLayerOps[Self <: DynamicDataLayer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataSource(value: TableDataSource | QueryTableDataSource | RasterDataSource | JoinTableDataSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFields(value: js.Array[DynamicDataLayerFields]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: `data-layer`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

