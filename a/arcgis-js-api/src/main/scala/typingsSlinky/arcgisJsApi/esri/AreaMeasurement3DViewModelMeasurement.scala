package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.std.Object
import typingsSlinky.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AreaMeasurement3DViewModelMeasurement extends Object {
  /**
    * The area of the polygon.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-AreaMeasurement3D-AreaMeasurement3DViewModel.html#measurement)
    */
  var area: MeasurementValue = js.native
  /**
    * Describes the mode in which the measurement was taken. In `euclidean` mode, the area and perimeter length are computed from a flat polygon with straight segments on the perimeter in the [ECEF](https://en.wikipedia.org/wiki/ECEF) coordinate system. In `geodesic` mode, the area and perimeter length are computed from a geodesic polygon on the WGS84 ellipsoid.  **Possible Values:** euclidean | geodesic
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-AreaMeasurement3D-AreaMeasurement3DViewModel.html#measurement)
    */
  var measurementMode: String = js.native
  /**
    * The perimeter length of the polygon.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-AreaMeasurement3D-AreaMeasurement3DViewModel.html#measurement)
    */
  var perimeterLength: MeasurementValue = js.native
}

object AreaMeasurement3DViewModelMeasurement {
  @scala.inline
  def apply(
    area: MeasurementValue,
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    measurementMode: String,
    perimeterLength: MeasurementValue,
    propertyIsEnumerable: PropertyKey => Boolean
  ): AreaMeasurement3DViewModelMeasurement = {
    val __obj = js.Dynamic.literal(area = area.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), measurementMode = measurementMode.asInstanceOf[js.Any], perimeterLength = perimeterLength.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[AreaMeasurement3DViewModelMeasurement]
  }
  @scala.inline
  implicit class AreaMeasurement3DViewModelMeasurementOps[Self <: AreaMeasurement3DViewModelMeasurement] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArea(value: MeasurementValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("area")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMeasurementMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("measurementMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPerimeterLength(value: MeasurementValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("perimeterLength")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

