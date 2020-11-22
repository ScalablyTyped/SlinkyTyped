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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.arcgisJsApi.esri.ArcGISMapServiceProperties because var conflicts: fullExtent. Inlined copyright, legendEnabled */ @js.native
trait MapImageLayerProperties
  extends LayerProperties
     with ScaleRangeLayerProperties
     with RefreshableLayerProperties
     with TemporalLayerProperties
     with BlendLayerProperties {
  
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
    */
  var dpi: js.UndefOr[Double] = js.native
  
  /**
    * The version of the geodatabase of the map service data.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MapImageLayer.html#gdbVersion)
    */
  var gdbVersion: js.UndefOr[String] = js.native
  
  /**
    * The output image type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MapImageLayer.html#imageFormat)
    */
  var imageFormat: js.UndefOr[png | png8 | png24 | png32 | jpg | pdf | bmp | gif | svg | pngjpg] = js.native
  
  /**
    * Indicates the maximum height of the image exported by the service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MapImageLayer.html#imageMaxHeight)
    */
  var imageMaxHeight: js.UndefOr[Double] = js.native
  
  /**
    * Indicates the maximum width of the image exported by the service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MapImageLayer.html#imageMaxWidth)
    */
  var imageMaxWidth: js.UndefOr[Double] = js.native
  
  /**
    * Indicates whether the background of the image exported by the service is transparent.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MapImageLayer.html#imageTransparency)
    */
  var imageTransparency: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicates whether the layer will be included in the legend.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISMapService.html#legendEnabled)
    */
  var legendEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * The portal item from which the layer is loaded.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MapImageLayer.html#portalItem)
    */
  var portalItem: js.UndefOr[PortalItemProperties] = js.native
  
  /**
    * The [map service's metadata JSON](https://developers.arcgis.com/rest/services-reference/map-service.htm) exposed by the ArcGIS REST API.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MapImageLayer.html#sourceJSON)
    */
  var sourceJSON: js.UndefOr[js.Any] = js.native
  
  /**
    * A [Collection](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Collection.html) of [Sublayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html) objects that allow you to alter the properties of one or more sublayers of the MapImageLayer.
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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCopyright(value: String): Self = this.set("copyright", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCopyright: Self = this.set("copyright", js.undefined)
    
    @scala.inline
    def setDpi(value: Double): Self = this.set("dpi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDpi: Self = this.set("dpi", js.undefined)
    
    @scala.inline
    def setGdbVersion(value: String): Self = this.set("gdbVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGdbVersion: Self = this.set("gdbVersion", js.undefined)
    
    @scala.inline
    def setImageFormat(value: png | png8 | png24 | png32 | jpg | pdf | bmp | gif | svg | pngjpg): Self = this.set("imageFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageFormat: Self = this.set("imageFormat", js.undefined)
    
    @scala.inline
    def setImageMaxHeight(value: Double): Self = this.set("imageMaxHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageMaxHeight: Self = this.set("imageMaxHeight", js.undefined)
    
    @scala.inline
    def setImageMaxWidth(value: Double): Self = this.set("imageMaxWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageMaxWidth: Self = this.set("imageMaxWidth", js.undefined)
    
    @scala.inline
    def setImageTransparency(value: Boolean): Self = this.set("imageTransparency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageTransparency: Self = this.set("imageTransparency", js.undefined)
    
    @scala.inline
    def setLegendEnabled(value: Boolean): Self = this.set("legendEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLegendEnabled: Self = this.set("legendEnabled", js.undefined)
    
    @scala.inline
    def setPortalItem(value: PortalItemProperties): Self = this.set("portalItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePortalItem: Self = this.set("portalItem", js.undefined)
    
    @scala.inline
    def setSourceJSON(value: js.Any): Self = this.set("sourceJSON", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceJSON: Self = this.set("sourceJSON", js.undefined)
    
    @scala.inline
    def setSublayersVarargs(value: SublayerProperties*): Self = this.set("sublayers", js.Array(value :_*))
    
    @scala.inline
    def setSublayers(value: CollectionProperties[SublayerProperties]): Self = this.set("sublayers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSublayers: Self = this.set("sublayers", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
}
