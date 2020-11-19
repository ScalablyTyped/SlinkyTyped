package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`geo-ref`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.dd
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.ddm
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.dms
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.gars
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.mrgs
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.usng
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.utm
import typingsSlinky.std.Object
import typingsSlinky.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GeometryServiceFromGeoCoordinateStringParams extends Object {
  
  /**
    * Conversion options for mrgs, utm and gars conversion types. See the [ArcGIS REST API documentation](https://developers.arcgis.com/rest/services-reference/from-geocoordinatestring.htm) for possible values and their descriptions.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-GeometryService.html#fromGeoCoordinateString)
    */
  var conversionMode: js.UndefOr[String] = js.native
  
  /**
    * The conversion type of the input strings.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-GeometryService.html#fromGeoCoordinateString)
    *
    * @default mrgs
    */
  var conversionType: js.UndefOr[mrgs | usng | utm | `geo-ref` | gars | dms | ddm | dd] = js.native
  
  /**
    * The spatial reference or well-known ID to convert the input string coordinates to.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-GeometryService.html#fromGeoCoordinateString)
    */
  var sr: SpatialReference | String | Double = js.native
  
  /**
    * An array of formatted strings as specified by `conversionType`. Example: `["01N AA 66021 00000" , "11S NT 00000 62155" , "31U BT 94071 65288"]`
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-GeometryService.html#fromGeoCoordinateString)
    */
  var strings: js.Array[String] = js.native
}
object GeometryServiceFromGeoCoordinateStringParams {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    sr: SpatialReference | String | Double,
    strings: js.Array[String]
  ): GeometryServiceFromGeoCoordinateStringParams = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), sr = sr.asInstanceOf[js.Any], strings = strings.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeometryServiceFromGeoCoordinateStringParams]
  }
  
  @scala.inline
  implicit class GeometryServiceFromGeoCoordinateStringParamsOps[Self <: GeometryServiceFromGeoCoordinateStringParams] (val x: Self) extends AnyVal {
    
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
    def setSr(value: SpatialReference | String | Double): Self = this.set("sr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStringsVarargs(value: String*): Self = this.set("strings", js.Array(value :_*))
    
    @scala.inline
    def setStrings(value: js.Array[String]): Self = this.set("strings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConversionMode(value: String): Self = this.set("conversionMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConversionMode: Self = this.set("conversionMode", js.undefined)
    
    @scala.inline
    def setConversionType(value: mrgs | usng | utm | `geo-ref` | gars | dms | ddm | dd): Self = this.set("conversionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConversionType: Self = this.set("conversionType", js.undefined)
  }
}
