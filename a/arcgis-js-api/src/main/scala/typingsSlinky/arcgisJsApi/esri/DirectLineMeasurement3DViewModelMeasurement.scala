package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.std.Object
import typingsSlinky.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DirectLineMeasurement3DViewModelMeasurement extends Object {
  /**
    * The direct distance between the two points.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-DirectLineMeasurement3D-DirectLineMeasurement3DViewModel.html#measurement)
    */
  var directDistance: DirectLineMeasurement3DViewModelMeasurementValue = js.native
  /**
    * The horizontal distance between the two points.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-DirectLineMeasurement3D-DirectLineMeasurement3DViewModel.html#measurement)
    */
  var horizontalDistance: DirectLineMeasurement3DViewModelMeasurementValue = js.native
  /**
    * Describes the mode in which the measurement was taken. In `euclidean` mode, the distances are measured as straight lines in the [ECEF](https://en.wikipedia.org/wiki/ECEF) coordinate system. In `geodesic` mode, the distances are measured as geodesic lines on the WGS84 ellipsoid.  **Possible Values:** euclidean | geodesic
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-DirectLineMeasurement3D-DirectLineMeasurement3DViewModel.html#measurement)
    */
  var measurementMode: String = js.native
  /**
    * The vertical distance between the two points.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-DirectLineMeasurement3D-DirectLineMeasurement3DViewModel.html#measurement)
    */
  var verticalDistance: DirectLineMeasurement3DViewModelMeasurementValue = js.native
}

object DirectLineMeasurement3DViewModelMeasurement {
  @scala.inline
  def apply(
    constructor: js.Function,
    directDistance: DirectLineMeasurement3DViewModelMeasurementValue,
    hasOwnProperty: PropertyKey => Boolean,
    horizontalDistance: DirectLineMeasurement3DViewModelMeasurementValue,
    measurementMode: String,
    propertyIsEnumerable: PropertyKey => Boolean,
    verticalDistance: DirectLineMeasurement3DViewModelMeasurementValue
  ): DirectLineMeasurement3DViewModelMeasurement = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], directDistance = directDistance.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), horizontalDistance = horizontalDistance.asInstanceOf[js.Any], measurementMode = measurementMode.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), verticalDistance = verticalDistance.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectLineMeasurement3DViewModelMeasurement]
  }
  @scala.inline
  implicit class DirectLineMeasurement3DViewModelMeasurementOps[Self <: DirectLineMeasurement3DViewModelMeasurement] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDirectDistance(value: DirectLineMeasurement3DViewModelMeasurementValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directDistance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHorizontalDistance(value: DirectLineMeasurement3DViewModelMeasurementValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontalDistance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMeasurementMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("measurementMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVerticalDistance(value: DirectLineMeasurement3DViewModelMeasurementValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalDistance")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

