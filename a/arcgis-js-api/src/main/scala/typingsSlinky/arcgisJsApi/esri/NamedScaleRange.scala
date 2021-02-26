package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.std.Object
import typingsSlinky.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NamedScaleRange extends Object {
  
  /**
    * The named scale range, such as "room" or "metropolitan area".
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ScaleRangeSlider-ScaleRanges.html#NamedScaleRange)
    */
  var id: String = js.native
  
  /**
    * The maximum scale.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ScaleRangeSlider-ScaleRanges.html#NamedScaleRange)
    */
  var maxScale: Double = js.native
  
  /**
    * The minimum scale.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ScaleRangeSlider-ScaleRanges.html#NamedScaleRange)
    */
  var minScale: Double = js.native
}
object NamedScaleRange {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    id: String,
    maxScale: Double,
    minScale: Double,
    propertyIsEnumerable: PropertyKey => Boolean
  ): NamedScaleRange = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), id = id.asInstanceOf[js.Any], maxScale = maxScale.asInstanceOf[js.Any], minScale = minScale.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[NamedScaleRange]
  }
  
  @scala.inline
  implicit class NamedScaleRangeMutableBuilder[Self <: NamedScaleRange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxScale(value: Double): Self = StObject.set(x, "maxScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinScale(value: Double): Self = StObject.set(x, "minScale", value.asInstanceOf[js.Any])
  }
}
