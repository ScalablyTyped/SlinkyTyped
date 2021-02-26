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
trait PixelBlock extends Accessor {
  
  /**
    * Adds another plane to the PixelBlock.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-PixelBlock.html#addData)
    */
  def addData(planeData: PixelBlockAddDataPlaneData): Unit = js.native
  
  /**
    * Returns pixels and masks using a single array in bip format (e.g.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-PixelBlock.html#getAsRGBA)
    */
  def getAsRGBA(): js.typedarray.Uint8ClampedArray = js.native
  
  /**
    * Similar to [getAsRGBA](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-PixelBlock.html#getAsRGBA), but returns floating point data.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-PixelBlock.html#getAsRGBAFloat)
    */
  def getAsRGBAFloat(): js.typedarray.Float32Array = js.native
  
  /**
    * Returns the plane band count of the PixelBlock.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-PixelBlock.html#getPlaneCount)
    */
  def getPlaneCount(): Double = js.native
  
  /**
    * The height (or number of rows) of the PixelBlock in pixels.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-PixelBlock.html#height)
    */
  var height: Double = js.native
  
  /**
    * An array of nodata mask.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-PixelBlock.html#mask)
    */
  var mask: js.Array[Double] | js.typedarray.Uint8Array = js.native
  
  /**
    * Indicates whether mask should be used as alpha values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-PixelBlock.html#maskIsAlpha)
    */
  var maskIsAlpha: Boolean = js.native
  
  /**
    * The pixel type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-PixelBlock.html#pixelType)
    */
  var pixelType: unknown | s8 | s16 | s32 | u8 | u16 | u32 | f32 | f64 = js.native
  
  /**
    * A two dimensional array representing the pixels from the Image Service displayed on the client.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-PixelBlock.html#pixels)
    */
  var pixels: js.Array[Double] | js.typedarray.Int8Array | js.typedarray.Uint8Array | js.typedarray.Uint8ClampedArray | js.typedarray.Int16Array | js.typedarray.Uint16Array | js.typedarray.Int32Array | js.typedarray.Uint32Array | js.typedarray.Float32Array | js.typedarray.Float64Array = js.native
  
  /**
    * An array of objects containing numeric statistical properties.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-PixelBlock.html#statistics)
    */
  var statistics: js.Array[PixelBlockStatistics] = js.native
  
  /**
    * Number of valid pixels.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-PixelBlock.html#validPixelCount)
    */
  var validPixelCount: Double = js.native
  
  /**
    * The width (or number of columns) of the PixelBlock in pixels.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-PixelBlock.html#width)
    */
  var width: Double = js.native
}
