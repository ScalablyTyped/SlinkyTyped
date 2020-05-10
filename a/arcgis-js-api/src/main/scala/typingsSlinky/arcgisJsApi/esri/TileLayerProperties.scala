package typingsSlinky.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.arcgisJsApi.esri.ArcGISCachedServiceProperties because var conflicts: copyright. Inlined tileInfo
- typingsSlinky.arcgisJsApi.esri.ArcGISMapServiceProperties because var conflicts: fullExtent. Inlined copyright, legendEnabled */ @js.native
trait TileLayerProperties
  extends LayerProperties
     with RefreshableLayerProperties
     with ScaleRangeLayerProperties
     with PortalLayerProperties {
  /**
    * The copyright text as defined by the service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISMapService.html#copyright)
    */
  var copyright: js.UndefOr[String] = js.native
  /**
    * Indicates whether the layer will be included in the legend.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISMapService.html#legendEnabled)
    *
    * @default true
    */
  var legendEnabled: js.UndefOr[Boolean] = js.native
  /**
    * Resampling is enabled by default in 2D [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) and 3D [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html). This means that tile images are resampled at a lower level of detail and displayed at levels where tiles may not be available. Setting this property to `false` disables this behavior. Instead, if a tile is not available, a transparent image is displayed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-TileLayer.html#resampling)
    *
    * @default true
    */
  var resampling: js.UndefOr[Boolean] = js.native
  /**
    * The [tiled map service's metadata JSON](https://developers.arcgis.com/rest/services-reference/map-service.htm) exposed by the ArcGIS REST API. While most commonly used [properties](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-TileLayer.html#properties-summary) are exposed on the TileLayer class directly, this property gives access to all information returned by the tiled map service. This property is useful if working in an application built using an older version of the API which requires access to tiled map service properties from a more recent version.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-TileLayer.html#sourceJSON)
    */
  var sourceJSON: js.UndefOr[js.Any] = js.native
  /**
    * Contains information about the tiling scheme for the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISCachedService.html#tileInfo)
    */
  var tileInfo: js.UndefOr[TileInfoProperties] = js.native
  /**
    * An array of tile servers used for changing map tiles.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-TileLayer.html#tileServers)
    */
  var tileServers: js.UndefOr[js.Array[String]] = js.native
  /**
    * The URL of the REST endpoint of the layer. The URL may either point to a resource on ArcGIS Enterprise or ArcGIS Online.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-TileLayer.html#url)
    */
  var url: js.UndefOr[String] = js.native
}

object TileLayerProperties {
  @scala.inline
  def apply(): TileLayerProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TileLayerProperties]
  }
  @scala.inline
  implicit class TileLayerPropertiesOps[Self <: TileLayerProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCopyright(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copyright")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCopyright: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copyright")(js.undefined)
        ret
    }
    @scala.inline
    def withLegendEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legendEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLegendEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legendEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withResampling(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resampling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResampling: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resampling")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceJSON(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceJSON")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceJSON: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceJSON")(js.undefined)
        ret
    }
    @scala.inline
    def withTileInfo(value: TileInfoProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tileInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTileInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tileInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withTileServers(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tileServers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTileServers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tileServers")(js.undefined)
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.undefined)
        ret
    }
  }
  
}

