package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.arcgisJsApi.esri.LocationSchemeForPoint
  - typingsSlinky.arcgisJsApi.esri.LocationSchemeForPolyline
  - typingsSlinky.arcgisJsApi.esri.LocationSchemeForPolygon
  - typingsSlinky.arcgisJsApi.esri.LocationSchemeForMesh
*/
trait LocationScheme extends StObject
object LocationScheme {
  
  @scala.inline
  def LocationSchemeForMesh(
    color: Color_,
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    opacity: Double,
    propertyIsEnumerable: PropertyKey => Boolean
  ): typingsSlinky.arcgisJsApi.esri.LocationSchemeForMesh = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), opacity = opacity.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[typingsSlinky.arcgisJsApi.esri.LocationSchemeForMesh]
  }
  
  @scala.inline
  def LocationSchemeForPoint(
    color: Color_,
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    opacity: Double,
    outline: LocationSchemeForPointOutline,
    propertyIsEnumerable: PropertyKey => Boolean,
    size: Double
  ): typingsSlinky.arcgisJsApi.esri.LocationSchemeForPoint = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), opacity = opacity.asInstanceOf[js.Any], outline = outline.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.arcgisJsApi.esri.LocationSchemeForPoint]
  }
  
  @scala.inline
  def LocationSchemeForPolygon(
    color: Color_,
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    opacity: Double,
    outline: LocationSchemeForPolygonOutline,
    propertyIsEnumerable: PropertyKey => Boolean
  ): typingsSlinky.arcgisJsApi.esri.LocationSchemeForPolygon = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), opacity = opacity.asInstanceOf[js.Any], outline = outline.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[typingsSlinky.arcgisJsApi.esri.LocationSchemeForPolygon]
  }
  
  @scala.inline
  def LocationSchemeForPolyline(
    color: Color_,
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    opacity: Double,
    propertyIsEnumerable: PropertyKey => Boolean,
    width: Double
  ): typingsSlinky.arcgisJsApi.esri.LocationSchemeForPolyline = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), opacity = opacity.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.arcgisJsApi.esri.LocationSchemeForPolyline]
  }
}
