package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.arcgisJsApi.esri.TypeSchemeForPoint
  - typingsSlinky.arcgisJsApi.esri.TypeSchemeForPolyline
  - typingsSlinky.arcgisJsApi.esri.TypeSchemeForPolygon
  - typingsSlinky.arcgisJsApi.esri.TypeSchemeForMesh
*/
trait TypeScheme extends StObject
object TypeScheme {
  
  @scala.inline
  def TypeSchemeForMesh(
    colors: js.Array[Color_],
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    name: String,
    noDataColor: Color_,
    opacity: Double,
    propertyIsEnumerable: PropertyKey => Boolean,
    tags: js.Array[String]
  ): typingsSlinky.arcgisJsApi.esri.TypeSchemeForMesh = {
    val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), name = name.asInstanceOf[js.Any], noDataColor = noDataColor.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), tags = tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.arcgisJsApi.esri.TypeSchemeForMesh]
  }
  
  @scala.inline
  def TypeSchemeForPoint(
    colors: js.Array[Color_],
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    name: String,
    noDataColor: Color_,
    opacity: Double,
    outline: TypeSchemeForPointOutline,
    propertyIsEnumerable: PropertyKey => Boolean,
    size: Double,
    tags: js.Array[String]
  ): typingsSlinky.arcgisJsApi.esri.TypeSchemeForPoint = {
    val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), name = name.asInstanceOf[js.Any], noDataColor = noDataColor.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], outline = outline.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), size = size.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.arcgisJsApi.esri.TypeSchemeForPoint]
  }
  
  @scala.inline
  def TypeSchemeForPolygon(
    colors: js.Array[Color_],
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    name: String,
    noDataColor: Color_,
    opacity: Double,
    outline: TypeSchemeForPolygonOutline,
    propertyIsEnumerable: PropertyKey => Boolean,
    tags: js.Array[String]
  ): typingsSlinky.arcgisJsApi.esri.TypeSchemeForPolygon = {
    val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), name = name.asInstanceOf[js.Any], noDataColor = noDataColor.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], outline = outline.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), tags = tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.arcgisJsApi.esri.TypeSchemeForPolygon]
  }
  
  @scala.inline
  def TypeSchemeForPolyline(
    colors: js.Array[Color_],
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    name: String,
    noDataColor: Color_,
    opacity: Double,
    propertyIsEnumerable: PropertyKey => Boolean,
    tags: js.Array[String],
    width: Double
  ): typingsSlinky.arcgisJsApi.esri.TypeSchemeForPolyline = {
    val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), name = name.asInstanceOf[js.Any], noDataColor = noDataColor.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), tags = tags.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.arcgisJsApi.esri.TypeSchemeForPolyline]
  }
}
