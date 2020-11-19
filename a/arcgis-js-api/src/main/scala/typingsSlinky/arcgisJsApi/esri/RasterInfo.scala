package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`vector-magdir`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`vector-uv`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.elevation
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.f32
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.f64
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.generic
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.processed
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.s16
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.s32
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.s8
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.scientific
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.thematic
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.u16
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.u32
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.u8
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.unknown
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RasterInfo extends JSONSupport {
  
  /**
    * The raster attribute table associated with an imagery layer. It returns categorical mapping of pixel values such as class, group, or category, or membership.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RasterInfo.html#attributeTable)
    */
  var attributeTable: FeatureSet = js.native
  
  /**
    * Raster band count.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RasterInfo.html#bandCount)
    */
  var bandCount: Double = js.native
  
  /**
    * Raster colormap that can be used to display the imagery layer. Each element in the array defines the pixel value and the red, green, and blue color values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RasterInfo.html#colormap)
    */
  var colormap: js.Array[js.Array[Double]] = js.native
  
  /**
    * Raster data type controls how the data is rendered by default.
    *
    * Value | Description |
    * ----- | ----------- |
    * generic | Uses the application defaults for resampling and stretching.
    * elevation | Applies bilinear resampling and a Min-Max stretch.
    * thematic | Applies nearest neighbor resampling and a Deviation stretch.
    * processed | No stretch is applied.
    * scientific | Uses the blue to red color ramp to display the data.
    * vector-uv | Uses the U (magnitude component) and V(direction component) components in the vector field renderer.
    * vector-magdir | Uses the magnitude and direction in the vector field renderer.
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RasterInfo.html#dataType)
    */
  var dataType: generic | elevation | thematic | processed | scientific | `vector-uv` | `vector-magdir` = js.native
  
  /**
    * The minimum and maximum X and Y coordinates of a bounding box containing all the raster data.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RasterInfo.html#extent)
    */
  var extent: Extent = js.native
  
  /**
    * Raster height (row count) in pixels.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RasterInfo.html#height)
    */
  var height: Double = js.native
  
  /**
    * Raster histograms return basic name-value pairs for number of bins, min and max bounding values, counts of pixels in each bin.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RasterInfo.html#histograms)
    */
  var histograms: js.Array[_] = js.native
  
  /**
    * Raster key properties.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RasterInfo.html#keyProperties)
    */
  var keyProperties: js.Any = js.native
  
  /**
    * The multidimensional information associated with the raster.  If defined, multidimensional information contains various "dimensions" of data for a particular value, such as time, depth, altitude, etc. Defining slices of particular dimensions in the layer is handled with the [multidimensionalDefinition](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-MosaicRule.html#multidimensionalDefinition) property of the [mosaicRule](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RasterInfo.html#mosaicRule).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RasterInfo.html#multidimensionalInfo)
    */
  var multidimensionalInfo: js.Any = js.native
  
  /**
    * The pixel value representing no available information. Can be a number (same value for all bands) or array (specific value for each band).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RasterInfo.html#noDataValue)
    */
  var noDataValue: Double | js.Array[Double] = js.native
  
  /**
    * Raster pixel size. Specifies the pixel size being identified on the x and y axis. Defaults to the base resolution of the dataset when not specified.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RasterInfo.html#pixelSize)
    */
  var pixelSize: RasterInfoPixelSize = js.native
  
  /**
    * Pixel type for the raster data source.
    *
    * Value | Range of values that each cell can contain |
    * ----- | ------------------------------------------- |
    * unknown | Pixel type is unknown |
    * s8 | -128 to 127 |
    * s16 | -32768 to 32767 |
    * s32 | -2147483648 to 2147483647 |
    * u8 | 0 to 255 |
    * u16 | 0 to 65535
    * u32 | 0 to 4294967295
    * f32 | -3.402823466e+38 to 3.402823466e+38
    * f64 | 0 to 18446744073709551616
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RasterInfo.html#pixelType)
    */
  var pixelType: unknown | s8 | s16 | s32 | u8 | u16 | u32 | f32 | f64 = js.native
  
  /**
    * The spatial reference of the raster.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RasterInfo.html#spatialReference)
    */
  var spatialReference: SpatialReference = js.native
  
  /**
    * Raster band statistics. These include the minimum value in the raster, maximum value, mean of all values, and standard deviation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RasterInfo.html#statistics)
    */
  var statistics: js.Array[RasterInfoStatistics] = js.native
  
  /**
    * Raster width (column count) in pixels.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RasterInfo.html#width)
    */
  var width: Double = js.native
}
object RasterInfo {
  
  @scala.inline
  def apply(
    attributeTable: FeatureSet,
    bandCount: Double,
    colormap: js.Array[js.Array[Double]],
    dataType: generic | elevation | thematic | processed | scientific | `vector-uv` | `vector-magdir`,
    extent: Extent,
    height: Double,
    histograms: js.Array[_],
    keyProperties: js.Any,
    multidimensionalInfo: js.Any,
    noDataValue: Double | js.Array[Double],
    pixelSize: RasterInfoPixelSize,
    pixelType: unknown | s8 | s16 | s32 | u8 | u16 | u32 | f32 | f64,
    spatialReference: SpatialReference,
    statistics: js.Array[RasterInfoStatistics],
    toJSON: () => js.Any,
    width: Double
  ): RasterInfo = {
    val __obj = js.Dynamic.literal(attributeTable = attributeTable.asInstanceOf[js.Any], bandCount = bandCount.asInstanceOf[js.Any], colormap = colormap.asInstanceOf[js.Any], dataType = dataType.asInstanceOf[js.Any], extent = extent.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], histograms = histograms.asInstanceOf[js.Any], keyProperties = keyProperties.asInstanceOf[js.Any], multidimensionalInfo = multidimensionalInfo.asInstanceOf[js.Any], noDataValue = noDataValue.asInstanceOf[js.Any], pixelSize = pixelSize.asInstanceOf[js.Any], pixelType = pixelType.asInstanceOf[js.Any], spatialReference = spatialReference.asInstanceOf[js.Any], statistics = statistics.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[RasterInfo]
  }
  
  @scala.inline
  implicit class RasterInfoOps[Self <: RasterInfo] (val x: Self) extends AnyVal {
    
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
    def setAttributeTable(value: FeatureSet): Self = this.set("attributeTable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBandCount(value: Double): Self = this.set("bandCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColormapVarargs(value: js.Array[Double]*): Self = this.set("colormap", js.Array(value :_*))
    
    @scala.inline
    def setColormap(value: js.Array[js.Array[Double]]): Self = this.set("colormap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataType(value: generic | elevation | thematic | processed | scientific | `vector-uv` | `vector-magdir`): Self = this.set("dataType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtent(value: Extent): Self = this.set("extent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHistogramsVarargs(value: js.Any*): Self = this.set("histograms", js.Array(value :_*))
    
    @scala.inline
    def setHistograms(value: js.Array[_]): Self = this.set("histograms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyProperties(value: js.Any): Self = this.set("keyProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultidimensionalInfo(value: js.Any): Self = this.set("multidimensionalInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoDataValueVarargs(value: Double*): Self = this.set("noDataValue", js.Array(value :_*))
    
    @scala.inline
    def setNoDataValue(value: Double | js.Array[Double]): Self = this.set("noDataValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPixelSize(value: RasterInfoPixelSize): Self = this.set("pixelSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPixelType(value: unknown | s8 | s16 | s32 | u8 | u16 | u32 | f32 | f64): Self = this.set("pixelType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpatialReference(value: SpatialReference): Self = this.set("spatialReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatisticsVarargs(value: RasterInfoStatistics*): Self = this.set("statistics", js.Array(value :_*))
    
    @scala.inline
    def setStatistics(value: js.Array[RasterInfoStatistics]): Self = this.set("statistics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
  }
}
