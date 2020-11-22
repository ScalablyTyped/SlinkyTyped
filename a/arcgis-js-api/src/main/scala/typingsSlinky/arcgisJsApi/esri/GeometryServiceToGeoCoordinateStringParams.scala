package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`geo-ref`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.dd
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.ddm
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.dms
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.gars
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.mgrs
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.usng
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.utm
import typingsSlinky.std.Object
import typingsSlinky.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GeometryServiceToGeoCoordinateStringParams extends Object {
  
  /**
    * If `true`, then spaces are added between components of the string.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-GeometryService.html#toGeoCoordinateString)
    */
  var addSpaces: js.UndefOr[Boolean] = js.native
  
  /**
    * Conversion options for mgrs and utm conversion types.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-GeometryService.html#toGeoCoordinateString)
    */
  var conversionMode: js.UndefOr[String] = js.native
  
  /**
    * The conversion type of the input strings.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-GeometryService.html#toGeoCoordinateString)
    */
  var conversionType: mgrs | usng | utm | `geo-ref` | gars | dms | ddm | dd = js.native
  
  /**
    * An array of XY-coordinates (in JSON format) to be converted.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-GeometryService.html#toGeoCoordinateString)
    */
  var coordinates: js.Array[js.Array[Double]] = js.native
  
  /**
    * The number of digits to output for each of the numerical portions in the string.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-GeometryService.html#toGeoCoordinateString)
    */
  var numOfDigits: js.UndefOr[Double] = js.native
  
  /**
    * If `true`, then numeric portions of the string are rounded to the nearest whole magnitude as specified by `numOfDigits`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-GeometryService.html#toGeoCoordinateString)
    */
  var rounding: js.UndefOr[Boolean] = js.native
  
  /**
    * The spatial reference (or WKID of the spatial reference) of the XY-coordinates to be converted.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-GeometryService.html#toGeoCoordinateString)
    */
  var sr: SpatialReference | String | Double = js.native
}
object GeometryServiceToGeoCoordinateStringParams {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    conversionType: mgrs | usng | utm | `geo-ref` | gars | dms | ddm | dd,
    coordinates: js.Array[js.Array[Double]],
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    sr: SpatialReference | String | Double
  ): GeometryServiceToGeoCoordinateStringParams = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], conversionType = conversionType.asInstanceOf[js.Any], coordinates = coordinates.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), sr = sr.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeometryServiceToGeoCoordinateStringParams]
  }
  
  @scala.inline
  implicit class GeometryServiceToGeoCoordinateStringParamsOps[Self <: GeometryServiceToGeoCoordinateStringParams] (val x: Self) extends AnyVal {
    
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
    def setConversionType(value: mgrs | usng | utm | `geo-ref` | gars | dms | ddm | dd): Self = this.set("conversionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCoordinatesVarargs(value: js.Array[Double]*): Self = this.set("coordinates", js.Array(value :_*))
    
    @scala.inline
    def setCoordinates(value: js.Array[js.Array[Double]]): Self = this.set("coordinates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSr(value: SpatialReference | String | Double): Self = this.set("sr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddSpaces(value: Boolean): Self = this.set("addSpaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddSpaces: Self = this.set("addSpaces", js.undefined)
    
    @scala.inline
    def setConversionMode(value: String): Self = this.set("conversionMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConversionMode: Self = this.set("conversionMode", js.undefined)
    
    @scala.inline
    def setNumOfDigits(value: Double): Self = this.set("numOfDigits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumOfDigits: Self = this.set("numOfDigits", js.undefined)
    
    @scala.inline
    def setRounding(value: Boolean): Self = this.set("rounding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRounding: Self = this.set("rounding", js.undefined)
  }
}
