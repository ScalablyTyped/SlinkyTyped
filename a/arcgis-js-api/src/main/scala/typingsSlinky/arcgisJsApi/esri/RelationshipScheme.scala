package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.arcgisJsApi.esri.RelationshipSchemeForPoint
  - typingsSlinky.arcgisJsApi.esri.RelationshipSchemeForPolyline
  - typingsSlinky.arcgisJsApi.esri.RelationshipSchemeForPolygon
  - typingsSlinky.arcgisJsApi.esri.RelationshipSchemeForMesh
*/
trait RelationshipScheme extends StObject
object RelationshipScheme {
  
  @scala.inline
  def RelationshipSchemeForMesh(
    colorsForClassBreaks: js.Array[RelationshipSchemeForMeshColorsForClassBreaks],
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    id: String,
    name: String,
    noDataColor: Color_,
    opacity: Double,
    propertyIsEnumerable: PropertyKey => Boolean,
    tags: js.Array[String]
  ): typingsSlinky.arcgisJsApi.esri.RelationshipSchemeForMesh = {
    val __obj = js.Dynamic.literal(colorsForClassBreaks = colorsForClassBreaks.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], noDataColor = noDataColor.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), tags = tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.arcgisJsApi.esri.RelationshipSchemeForMesh]
  }
  
  @scala.inline
  def RelationshipSchemeForPoint(
    colorsForClassBreaks: js.Array[RelationshipSchemeForPointColorsForClassBreaks],
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    id: String,
    name: String,
    noDataColor: Color_,
    opacity: Double,
    outline: RelationshipSchemeForPointOutline,
    propertyIsEnumerable: PropertyKey => Boolean,
    size: Double,
    tags: js.Array[String]
  ): typingsSlinky.arcgisJsApi.esri.RelationshipSchemeForPoint = {
    val __obj = js.Dynamic.literal(colorsForClassBreaks = colorsForClassBreaks.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], noDataColor = noDataColor.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], outline = outline.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), size = size.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.arcgisJsApi.esri.RelationshipSchemeForPoint]
  }
  
  @scala.inline
  def RelationshipSchemeForPolygon(
    colorsForClassBreaks: js.Array[RelationshipSchemeForPolygonColorsForClassBreaks],
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    id: String,
    name: String,
    noDataColor: Color_,
    opacity: Double,
    outline: RelationshipSchemeForPolygonOutline,
    propertyIsEnumerable: PropertyKey => Boolean,
    tags: js.Array[String]
  ): typingsSlinky.arcgisJsApi.esri.RelationshipSchemeForPolygon = {
    val __obj = js.Dynamic.literal(colorsForClassBreaks = colorsForClassBreaks.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], noDataColor = noDataColor.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], outline = outline.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), tags = tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.arcgisJsApi.esri.RelationshipSchemeForPolygon]
  }
  
  @scala.inline
  def RelationshipSchemeForPolyline(
    colorsForClassBreaks: js.Array[RelationshipSchemeForPolylineColorsForClassBreaks],
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    id: String,
    name: String,
    noDataColor: Color_,
    opacity: Double,
    propertyIsEnumerable: PropertyKey => Boolean,
    tags: js.Array[String],
    width: Double
  ): typingsSlinky.arcgisJsApi.esri.RelationshipSchemeForPolyline = {
    val __obj = js.Dynamic.literal(colorsForClassBreaks = colorsForClassBreaks.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], noDataColor = noDataColor.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), tags = tags.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.arcgisJsApi.esri.RelationshipSchemeForPolyline]
  }
}
