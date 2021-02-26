package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.f32
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.f64
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.s16
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.s32
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.s8
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.u16
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.u32
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.u8
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.unknown
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PixelBlockProperties extends StObject {
  
  /**
    * The height (or number of rows) of the PixelBlock in pixels.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-PixelBlock.html#height)
    */
  var height: js.UndefOr[Double] = js.native
  
  /**
    * An array of nodata mask.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-PixelBlock.html#mask)
    */
  var mask: js.UndefOr[js.Array[Double] | js.typedarray.Uint8Array] = js.native
  
  /**
    * Indicates whether mask should be used as alpha values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-PixelBlock.html#maskIsAlpha)
    */
  var maskIsAlpha: js.UndefOr[Boolean] = js.native
  
  /**
    * The pixel type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-PixelBlock.html#pixelType)
    */
  var pixelType: js.UndefOr[unknown | s8 | s16 | s32 | u8 | u16 | u32 | f32 | f64] = js.native
  
  /**
    * A two dimensional array representing the pixels from the Image Service displayed on the client.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-PixelBlock.html#pixels)
    */
  var pixels: js.UndefOr[
    js.Array[Double] | js.typedarray.Int8Array | js.typedarray.Uint8Array | js.typedarray.Uint8ClampedArray | js.typedarray.Int16Array | js.typedarray.Uint16Array | js.typedarray.Int32Array | js.typedarray.Uint32Array | js.typedarray.Float32Array | js.typedarray.Float64Array
  ] = js.native
  
  /**
    * An array of objects containing numeric statistical properties.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-PixelBlock.html#statistics)
    */
  var statistics: js.UndefOr[js.Array[PixelBlockStatistics]] = js.native
  
  /**
    * Number of valid pixels.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-PixelBlock.html#validPixelCount)
    */
  var validPixelCount: js.UndefOr[Double] = js.native
  
  /**
    * The width (or number of columns) of the PixelBlock in pixels.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-PixelBlock.html#width)
    */
  var width: js.UndefOr[Double] = js.native
}
object PixelBlockProperties {
  
  @scala.inline
  def apply(): PixelBlockProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PixelBlockProperties]
  }
  
  @scala.inline
  implicit class PixelBlockPropertiesMutableBuilder[Self <: PixelBlockProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setMask(value: js.Array[Double] | js.typedarray.Uint8Array): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaskIsAlpha(value: Boolean): Self = StObject.set(x, "maskIsAlpha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaskIsAlphaUndefined: Self = StObject.set(x, "maskIsAlpha", js.undefined)
    
    @scala.inline
    def setMaskUint8Array(value: js.typedarray.Uint8Array): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaskUndefined: Self = StObject.set(x, "mask", js.undefined)
    
    @scala.inline
    def setMaskVarargs(value: Double*): Self = StObject.set(x, "mask", js.Array(value :_*))
    
    @scala.inline
    def setPixelType(value: unknown | s8 | s16 | s32 | u8 | u16 | u32 | f32 | f64): Self = StObject.set(x, "pixelType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPixelTypeUndefined: Self = StObject.set(x, "pixelType", js.undefined)
    
    @scala.inline
    def setPixels(
      value: js.Array[Double] | js.typedarray.Int8Array | js.typedarray.Uint8Array | js.typedarray.Uint8ClampedArray | js.typedarray.Int16Array | js.typedarray.Uint16Array | js.typedarray.Int32Array | js.typedarray.Uint32Array | js.typedarray.Float32Array | js.typedarray.Float64Array
    ): Self = StObject.set(x, "pixels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPixelsFloat32Array(value: js.typedarray.Float32Array): Self = StObject.set(x, "pixels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPixelsFloat64Array(value: js.typedarray.Float64Array): Self = StObject.set(x, "pixels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPixelsInt16Array(value: js.typedarray.Int16Array): Self = StObject.set(x, "pixels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPixelsInt32Array(value: js.typedarray.Int32Array): Self = StObject.set(x, "pixels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPixelsInt8Array(value: js.typedarray.Int8Array): Self = StObject.set(x, "pixels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPixelsUint16Array(value: js.typedarray.Uint16Array): Self = StObject.set(x, "pixels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPixelsUint32Array(value: js.typedarray.Uint32Array): Self = StObject.set(x, "pixels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPixelsUint8Array(value: js.typedarray.Uint8Array): Self = StObject.set(x, "pixels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPixelsUint8ClampedArray(value: js.typedarray.Uint8ClampedArray): Self = StObject.set(x, "pixels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPixelsUndefined: Self = StObject.set(x, "pixels", js.undefined)
    
    @scala.inline
    def setPixelsVarargs(value: Double*): Self = StObject.set(x, "pixels", js.Array(value :_*))
    
    @scala.inline
    def setStatistics(value: js.Array[PixelBlockStatistics]): Self = StObject.set(x, "statistics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatisticsUndefined: Self = StObject.set(x, "statistics", js.undefined)
    
    @scala.inline
    def setStatisticsVarargs(value: PixelBlockStatistics*): Self = StObject.set(x, "statistics", js.Array(value :_*))
    
    @scala.inline
    def setValidPixelCount(value: Double): Self = StObject.set(x, "validPixelCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidPixelCountUndefined: Self = StObject.set(x, "validPixelCount", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
