package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.std.Object
import typingsSlinky.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PredominanceSchemeForPointOutline extends Object {
  
  /**
    * The outline color of the marker symbol.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-predominance.html#PredominanceSchemeForPoint)
    */
  var color: Color_ = js.native
  
  /**
    * The width of the marker symbol in points.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-predominance.html#PredominanceSchemeForPoint)
    */
  var width: Double = js.native
}
object PredominanceSchemeForPointOutline {
  
  @scala.inline
  def apply(
    color: Color_,
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    width: Double
  ): PredominanceSchemeForPointOutline = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[PredominanceSchemeForPointOutline]
  }
  
  @scala.inline
  implicit class PredominanceSchemeForPointOutlineMutableBuilder[Self <: PredominanceSchemeForPointOutline] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: Color_): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
