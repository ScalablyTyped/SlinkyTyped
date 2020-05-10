package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.bmp
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.gif
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.jpg
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.pdf
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.png
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.png24
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.png32
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.png8
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.pngjpg
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.svg
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.arcgisJsApi.esri.ArcGISMapServiceProperties because var conflicts: fullExtent. Inlined copyright, legendEnabled */ @js.native
trait MapImageLayerProperties
  extends LayerProperties
     with ScaleRangeLayerProperties
     with RefreshableLayerProperties
     with TemporalLayerProperties {
  /**
    * The copyright text as defined by the service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISMapService.html#copyright)
    */
  var copyright: js.UndefOr[String] = js.native
  /**
    * The output dots per inch (DPI) of the MapImageLayer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MapImageLayer.html#dpi)
    *
    * @default 96
    */
  var dpi: js.UndefOr[Double] = js.native
  /**
    * The version of the geodatabase of the map service data. Read the [Overview of versioning](https://desktop.arcgis.com/en/arcmap/latest/manage-data/geodatabases/an-overview-of-versioning.htm) topic for more details about this capability.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MapImageLayer.html#gdbVersion)
    */
  var gdbVersion: js.UndefOr[String] = js.native
  /**
    * The output image type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MapImageLayer.html#imageFormat)
    *
    * @default png24
    */
  var imageFormat: js.UndefOr[png | png8 | png24 | png32 | jpg | pdf | bmp | gif | svg | pngjpg] = js.native
  /**
    * Indicates the maximum height of the image exported by the service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MapImageLayer.html#imageMaxHeight)
    *
    * @default 2048
    */
  var imageMaxHeight: js.UndefOr[Double] = js.native
  /**
    * Indicates the maximum width of the image exported by the service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MapImageLayer.html#imageMaxWidth)
    *
    * @default 2048
    */
  var imageMaxWidth: js.UndefOr[Double] = js.native
  /**
    * Indicates whether the background of the image exported by the service is transparent.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MapImageLayer.html#imageTransparency)
    *
    * @default true
    */
  var imageTransparency: js.UndefOr[Boolean] = js.native
  /**
    * Indicates whether the layer will be included in the legend.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISMapService.html#legendEnabled)
    *
    * @default true
    */
  var legendEnabled: js.UndefOr[Boolean] = js.native
  /**
    * The portal item from which the layer is loaded. This will load the layer along with any overridden properties (e.g. renderers, definition expressions, etc.) saved to the portal item, not the map service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MapImageLayer.html#portalItem)
    */
  var portalItem: js.UndefOr[PortalItemProperties] = js.native
  /**
    * The [map service's metadata JSON](https://developers.arcgis.com/rest/services-reference/map-service.htm) exposed by the ArcGIS REST API. While most commonly used [properties](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MapImageLayer.html#properties-summary) are exposed on the MapImageLayer class directly, this property gives access to all information returned by the map service. This property is useful if working in an application built using an older version of the API which requires access to map service properties from a more recent version.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MapImageLayer.html#sourceJSON)
    */
  var sourceJSON: js.UndefOr[js.Any] = js.native
  /**
    * A [Collection](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Collection.html) of [Sublayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html) objects that allow you to alter the properties of one or more sublayers of the MapImageLayer. If this property is not specified, all the sublayers from the service are displayed as defined in the service. If an empty array is passed to this property then none of the sublayers from the service are displayed in the layer.  All sublayers are referenced in the order in which they are drawn in the view (bottom to top). They may be [added](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Collection.html#add), [removed](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Collection.html#remove), or [reordered](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Collection.html#reorder) using the [Collection](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Collection.html) methods. Because [Sublayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html) extends [Accessor](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Accessor.html), its properties may be [watched](https://developers.arcgis.com/javascript/latest/guide/programming-patterns/#watching-for-property-changes).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MapImageLayer.html#sublayers)
    */
  var sublayers: js.UndefOr[CollectionProperties[SublayerProperties]] = js.native
  /**
    * The URL to the REST endpoint of the map service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MapImageLayer.html#url)
    */
  var url: js.UndefOr[String] = js.native
}

object MapImageLayerProperties {
  @scala.inline
  def apply(): MapImageLayerProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapImageLayerProperties]
  }
  @scala.inline
  implicit class MapImageLayerPropertiesOps[Self <: MapImageLayerProperties] (val x: Self) extends AnyVal {
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
    def withDpi(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dpi")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDpi: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dpi")(js.undefined)
        ret
    }
    @scala.inline
    def withGdbVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gdbVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGdbVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gdbVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withImageFormat(value: png | png8 | png24 | png32 | jpg | pdf | bmp | gif | svg | pngjpg): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withImageMaxHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageMaxHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageMaxHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageMaxHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withImageMaxWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageMaxWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageMaxWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageMaxWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withImageTransparency(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageTransparency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageTransparency: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageTransparency")(js.undefined)
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
    def withPortalItem(value: PortalItemProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("portalItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPortalItem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("portalItem")(js.undefined)
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
    def withSublayers(value: CollectionProperties[SublayerProperties]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sublayers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSublayers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sublayers")(js.undefined)
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

