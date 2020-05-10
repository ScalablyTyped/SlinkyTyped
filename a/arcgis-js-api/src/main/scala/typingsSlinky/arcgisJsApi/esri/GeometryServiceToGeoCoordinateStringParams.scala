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
import scala.scalajs.js.annotation._

@js.native
trait GeometryServiceToGeoCoordinateStringParams extends Object {
  /**
    * If `true`, then spaces are added between components of the string. The `addSpaces` parameter applies only to conversion types `mgrs`, `usng` and `utm`. The default value for `mgrs` is `false` , while the default value for both `usng` and `utm` is `true`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-GeometryService.html#toGeoCoordinateString)
    */
  var addSpaces: js.UndefOr[Boolean] = js.native
  /**
    * Conversion options for mgrs and utm conversion types. See the [ArcGIS REST API documentation](https://developers.arcgis.com/rest/services-reference/to-geocoordinatestring.htm) for valid conversion modes and their descriptions.
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
    * The number of digits to output for each of the numerical portions in the string. The default value depends of `conversionType`. See the [ArcGIS REST API documentation](https://developers.arcgis.com/rest/services-reference/from-geocoordinatestring.htm) for default values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-GeometryService.html#toGeoCoordinateString)
    */
  var numOfDigits: js.UndefOr[Double] = js.native
  /**
    * If `true`, then numeric portions of the string are rounded to the nearest whole magnitude as specified by `numOfDigits`. Otherwise, numeric portions of the string are truncated. The rounding parameter applies only to conversion types `mgrs`, `usng` and `geo-ref`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-GeometryService.html#toGeoCoordinateString)
    *
    * @default true
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
    def withConversionType(value: mgrs | usng | utm | `geo-ref` | gars | dms | ddm | dd): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conversionType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCoordinates(value: js.Array[js.Array[Double]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coordinates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSr(value: SpatialReference | String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAddSpaces(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addSpaces")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddSpaces: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addSpaces")(js.undefined)
        ret
    }
    @scala.inline
    def withConversionMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conversionMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConversionMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conversionMode")(js.undefined)
        ret
    }
    @scala.inline
    def withNumOfDigits(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numOfDigits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumOfDigits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numOfDigits")(js.undefined)
        ret
    }
    @scala.inline
    def withRounding(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rounding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRounding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rounding")(js.undefined)
        ret
    }
  }
  
}

