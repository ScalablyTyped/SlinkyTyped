package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.std.Object
import typingsSlinky.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AreaMeasurement2DViewModelMeasurement extends Object {
  
  /**
    * The area (m²).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-AreaMeasurement2D-AreaMeasurement2DViewModel.html#measurement)
    */
  var area: Double = js.native
  
  /**
    * Measurement area.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-AreaMeasurement2D-AreaMeasurement2DViewModel.html#measurement)
    */
  var geometry: js.Any = js.native
  
  /**
    * The perimeter (m).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-AreaMeasurement2D-AreaMeasurement2DViewModel.html#measurement)
    */
  var perimeter: Double = js.native
}
object AreaMeasurement2DViewModelMeasurement {
  
  @scala.inline
  def apply(
    area: Double,
    constructor: js.Function,
    geometry: js.Any,
    hasOwnProperty: PropertyKey => Boolean,
    perimeter: Double,
    propertyIsEnumerable: PropertyKey => Boolean
  ): AreaMeasurement2DViewModelMeasurement = {
    val __obj = js.Dynamic.literal(area = area.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], geometry = geometry.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), perimeter = perimeter.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[AreaMeasurement2DViewModelMeasurement]
  }
  
  @scala.inline
  implicit class AreaMeasurement2DViewModelMeasurementMutableBuilder[Self <: AreaMeasurement2DViewModelMeasurement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArea(value: Double): Self = StObject.set(x, "area", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeometry(value: js.Any): Self = StObject.set(x, "geometry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPerimeter(value: Double): Self = StObject.set(x, "perimeter", value.asInstanceOf[js.Any])
  }
}
