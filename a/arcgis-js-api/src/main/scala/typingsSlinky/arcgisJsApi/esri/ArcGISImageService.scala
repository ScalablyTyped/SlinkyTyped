package typingsSlinky.arcgisJsApi.esri

import org.scalajs.dom.experimental.AbortSignal
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.all
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.any
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.bilinear
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.bmp
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.cubic
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.f32
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.f64
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.gif
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.jpg
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.jpgpng
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.lerc
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.majority
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.nearest
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.png
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.png24
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.png32
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.png8
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.s16
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.s32
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.s8
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.tiff
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.u16
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.u32
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.u8
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.unknown
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArcGISImageService extends js.Object {
  
  /**
    * Describes the layer's supported capabilities.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#capabilities)
    */
  var capabilities: ArcGISImageServiceCapabilities = js.native
  
  /**
    * The compression quality value.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#compressionQuality)
    */
  var compressionQuality: Double = js.native
  
  /**
    * Controls the tolerance of the lerc compression algorithm.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#compressionTolerance)
    */
  var compressionTolerance: Double = js.native
  
  /**
    * The copyright text as defined by the service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#copyright)
    */
  var copyright: String = js.native
  
  /**
    * The SQL where clause used to filter rasters.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#definitionExpression)
    */
  var definitionExpression: String = js.native
  
  /**
    * Returns an image using the [export REST operation](https://developers.arcgis.com/rest/services-reference/export-image.htm) that displays data from an [ImageryLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryLayer.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#fetchImage)
    */
  def fetchImage(extent: Extent, width: Double, height: Double): js.Promise[_] = js.native
  def fetchImage(extent: Extent, width: Double, height: Double, options: ArcGISImageServiceFetchImageOptions): js.Promise[_] = js.native
  
  /**
    * An array of fields in the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#fields)
    */
  var fields: js.Array[Field] = js.native
  
  /**
    * The format of the exported image.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#format)
    */
  var format: png | png8 | png24 | png32 | jpg | bmp | gif | jpgpng | lerc | tiff = js.native
  
  /**
    * Generates raster info for the specified rendering rule.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#generateRasterInfo)
    */
  def generateRasterInfo(renderingRule: RasterFunction): js.Promise[RasterInfo] = js.native
  
  /**
    * Gets the [image coordinate system](https://developers.arcgis.com/rest/services-reference/raster-ics.htm) information of a catalog item in an image service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#getCatalogItemICSInfo)
    */
  def getCatalogItemICSInfo(rasterId: Double): js.Promise[_] = js.native
  def getCatalogItemICSInfo(rasterId: Double, abortOptions: AbortSignal): js.Promise[_] = js.native
  
  /**
    * Get the [raster info](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RasterInfo.html) of a [catalog item](https://developers.arcgis.com/rest/services-reference/raster-catalog-item.htm) in an image service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#getCatalogItemRasterInfo)
    */
  def getCatalogItemRasterInfo(rasterId: Double): js.Promise[RasterInfo] = js.native
  def getCatalogItemRasterInfo(rasterId: Double, abortOptions: AbortSignal): js.Promise[RasterInfo] = js.native
  
  /**
    * Indicates if the layer has [multidimensionalInfo](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#multidimensionalInfo).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#hasMultidimensions)
    */
  var hasMultidimensions: Boolean = js.native
  
  /**
    * Indicates the maximum height of the image exported by the service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#imageMaxHeight)
    */
  var imageMaxHeight: Double = js.native
  
  /**
    * Indicates the maximum width of the image exported by the service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#imageMaxWidth)
    */
  var imageMaxWidth: Double = js.native
  
  /**
    * Defines how to interpolate pixel values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#interpolation)
    */
  var interpolation: nearest | bilinear | cubic | majority = js.native
  
  /**
    * Defines how overlapping images should be mosaicked.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#mosaicRule)
    */
  var mosaicRule: MosaicRule = js.native
  
  /**
    * The multidimensional information associated with the layer if the layer's [hasMultidimensions](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#hasMultidimensions) property is `true`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#multidimensionalInfo)
    */
  var multidimensionalInfo: js.Any = js.native
  
  /**
    * The pixel value representing no available information.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#noData)
    */
  var noData: Double | js.Array[Double] = js.native
  
  /**
    * Interpretation of the [noData](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#noData) setting.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#noDataInterpretation)
    */
  var noDataInterpretation: any | all = js.native
  
  /**
    * The name of an `oid` [field](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#fields) containing a unique value or identifier for each raster in the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#objectIdField)
    */
  var objectIdField: String = js.native
  
  /**
    * A function that processes [pixelData](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-ImageryLayerView.html#pixelData).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#pixelFilter)
    */
  def pixelFilter(pixelData: PixelData): Unit = js.native
  /**
    * A function that processes [pixelData](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-ImageryLayerView.html#pixelData).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#pixelFilter)
    */
  @JSName("pixelFilter")
  var pixelFilter_Original: PixelFilterFunction = js.native
  
  /**
    * Raster source pixel type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#pixelType)
    */
  var pixelType: unknown | s8 | s16 | s32 | u8 | u16 | u32 | f32 | f64 = js.native
  
  /**
    * Prefix used to define the fields from the raster attribute table.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#rasterAttributeTableFieldPrefix)
    */
  var rasterAttributeTableFieldPrefix: String = js.native
  
  /**
    * A complete list of fields that consists of raster catalog fields, item pixel value, service pixel value, service pixel value with various server defined function templates, and raster attribute table fields.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#rasterFields)
    */
  val rasterFields: js.Array[Field] = js.native
  
  /**
    * The renderer assigned to the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#renderer)
    */
  var renderer: ClassBreaksRenderer | UniqueValueRenderer | RasterStretchRenderer | RasterShadedReliefRenderer | RasterColormapRenderer = js.native
  
  /**
    * Specifies the rule for how the requested image should be rendered.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#renderingRule)
    */
  var renderingRule: RasterFunction = js.native
  
  /**
    * Source raster information of the image service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#serviceRasterInfo)
    */
  val serviceRasterInfo: RasterInfo = js.native
  
  /**
    * The [image service's metadata JSON](https://developers.arcgis.com/rest/services-reference/image-service.htm) exposed by the ArcGIS REST API.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#sourceJSON)
    */
  var sourceJSON: js.Any = js.native
  
  /**
    * The spatial reference of the image service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#spatialReference)
    */
  val spatialReference: SpatialReference = js.native
  
  /**
    * The URL to the REST endpoint of the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#url)
    */
  var url: String = js.native
  
  /**
    * The version of ArcGIS Server in which the image service is published.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#version)
    */
  val version: Double = js.native
}
