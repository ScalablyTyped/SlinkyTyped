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
import scala.scalajs.js.annotation._

@js.native
trait RasterInfoProperties extends js.Object {
  /**
    * The raster attribute table associated with an imagery layer. It returns categorical mapping of pixel values such as class, group, or category, or membership.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RasterInfo.html#attributeTable)
    */
  var attributeTable: js.UndefOr[FeatureSetProperties] = js.native
  /**
    * Raster band count.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RasterInfo.html#bandCount)
    */
  var bandCount: js.UndefOr[Double] = js.native
  /**
    * Raster colormap that can be used to display the imagery layer. Each element in the array defines the pixel value and the red, green, and blue color values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RasterInfo.html#colormap)
    */
  var colormap: js.UndefOr[js.Array[js.Array[Double]]] = js.native
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
  var dataType: js.UndefOr[
    generic | elevation | thematic | processed | scientific | `vector-uv` | `vector-magdir`
  ] = js.native
  /**
    * The minimum and maximum X and Y coordinates of a bounding box containing all the raster data.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RasterInfo.html#extent)
    */
  var extent: js.UndefOr[ExtentProperties] = js.native
  /**
    * Raster height (row count) in pixels.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RasterInfo.html#height)
    */
  var height: js.UndefOr[Double] = js.native
  /**
    * Raster histograms return basic name-value pairs for number of bins, min and max bounding values, counts of pixels in each bin.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RasterInfo.html#histograms)
    */
  var histograms: js.UndefOr[js.Array[_]] = js.native
  /**
    * Raster key properties.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RasterInfo.html#keyProperties)
    */
  var keyProperties: js.UndefOr[js.Any] = js.native
  /**
    * The multidimensional information associated with the raster.  If defined, multidimensional information contains various "dimensions" of data for a particular value, such as time, depth, altitude, etc. Defining slices of particular dimensions in the layer is handled with the [multidimensionalDefinition](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-MosaicRule.html#multidimensionalDefinition) property of the [mosaicRule](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RasterInfo.html#mosaicRule).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RasterInfo.html#multidimensionalInfo)
    */
  var multidimensionalInfo: js.UndefOr[js.Any] = js.native
  /**
    * The pixel value representing no available information. Can be a number (same value for all bands) or array (specific value for each band).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RasterInfo.html#noDataValue)
    */
  var noDataValue: js.UndefOr[Double | js.Array[Double]] = js.native
  /**
    * Raster pixel size. Specifies the pixel size being identified on the x and y axis. Defaults to the base resolution of the dataset when not specified.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RasterInfo.html#pixelSize)
    */
  var pixelSize: js.UndefOr[RasterInfoPixelSize] = js.native
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
  var pixelType: js.UndefOr[unknown | s8 | s16 | s32 | u8 | u16 | u32 | f32 | f64] = js.native
  /**
    * The spatial reference of the raster.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RasterInfo.html#spatialReference)
    */
  var spatialReference: js.UndefOr[SpatialReferenceProperties] = js.native
  /**
    * Raster band statistics. These include the minimum value in the raster, maximum value, mean of all values, and standard deviation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RasterInfo.html#statistics)
    */
  var statistics: js.UndefOr[js.Array[RasterInfoStatistics]] = js.native
  /**
    * Raster width (column count) in pixels.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RasterInfo.html#width)
    */
  var width: js.UndefOr[Double] = js.native
}

object RasterInfoProperties {
  @scala.inline
  def apply(): RasterInfoProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RasterInfoProperties]
  }
  @scala.inline
  implicit class RasterInfoPropertiesOps[Self <: RasterInfoProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttributeTable(value: FeatureSetProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributeTable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttributeTable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributeTable")(js.undefined)
        ret
    }
    @scala.inline
    def withBandCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bandCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBandCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bandCount")(js.undefined)
        ret
    }
    @scala.inline
    def withColormap(value: js.Array[js.Array[Double]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colormap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColormap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colormap")(js.undefined)
        ret
    }
    @scala.inline
    def withDataType(value: generic | elevation | thematic | processed | scientific | `vector-uv` | `vector-magdir`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataType")(js.undefined)
        ret
    }
    @scala.inline
    def withExtent(value: ExtentProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extent")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withHistograms(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("histograms")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHistograms: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("histograms")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyProperties(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyProperties")(js.undefined)
        ret
    }
    @scala.inline
    def withMultidimensionalInfo(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multidimensionalInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultidimensionalInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multidimensionalInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withNoDataValue(value: Double | js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noDataValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoDataValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noDataValue")(js.undefined)
        ret
    }
    @scala.inline
    def withPixelSize(value: RasterInfoPixelSize): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pixelSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPixelSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pixelSize")(js.undefined)
        ret
    }
    @scala.inline
    def withPixelType(value: unknown | s8 | s16 | s32 | u8 | u16 | u32 | f32 | f64): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pixelType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPixelType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pixelType")(js.undefined)
        ret
    }
    @scala.inline
    def withSpatialReference(value: SpatialReferenceProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spatialReference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpatialReference: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spatialReference")(js.undefined)
        ret
    }
    @scala.inline
    def withStatistics(value: js.Array[RasterInfoStatistics]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statistics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatistics: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statistics")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}

