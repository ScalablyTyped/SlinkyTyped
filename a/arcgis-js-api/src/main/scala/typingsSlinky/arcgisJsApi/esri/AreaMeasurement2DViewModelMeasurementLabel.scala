package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.std.Object
import typingsSlinky.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AreaMeasurement2DViewModelMeasurementLabel extends Object {
  /**
    * The area (m²).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-AreaMeasurement2D-AreaMeasurement2DViewModel.html#measurementLabel)
    */
  var area: Double = js.native
  /**
    * The perimeter (m).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-AreaMeasurement2D-AreaMeasurement2DViewModel.html#measurementLabel)
    */
  var perimeter: Double = js.native
}

object AreaMeasurement2DViewModelMeasurementLabel {
  @scala.inline
  def apply(
    area: Double,
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    perimeter: Double,
    propertyIsEnumerable: PropertyKey => Boolean
  ): AreaMeasurement2DViewModelMeasurementLabel = {
    val __obj = js.Dynamic.literal(area = area.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), perimeter = perimeter.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[AreaMeasurement2DViewModelMeasurementLabel]
  }
  @scala.inline
  implicit class AreaMeasurement2DViewModelMeasurementLabelOps[Self <: AreaMeasurement2DViewModelMeasurementLabel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArea(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("area")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPerimeter(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("perimeter")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

