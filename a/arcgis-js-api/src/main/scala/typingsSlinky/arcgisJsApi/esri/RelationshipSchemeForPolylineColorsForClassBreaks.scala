package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.std.Object
import typingsSlinky.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RelationshipSchemeForPolylineColorsForClassBreaks extends Object {
  
  /**
    * The colors of the line symbols used for each bin in the relationship visualization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-relationship.html#RelationshipSchemeForPolyline)
    */
  var colors: js.Array[js.Array[Color_]] = js.native
  
  /**
    * The number of breaks (rows/columns) for each variable in the relationship visualization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-relationship.html#RelationshipSchemeForPolyline)
    */
  var numClasses: Double = js.native
}
object RelationshipSchemeForPolylineColorsForClassBreaks {
  
  @scala.inline
  def apply(
    colors: js.Array[js.Array[Color_]],
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    numClasses: Double,
    propertyIsEnumerable: PropertyKey => Boolean
  ): RelationshipSchemeForPolylineColorsForClassBreaks = {
    val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), numClasses = numClasses.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[RelationshipSchemeForPolylineColorsForClassBreaks]
  }
  
  @scala.inline
  implicit class RelationshipSchemeForPolylineColorsForClassBreaksMutableBuilder[Self <: RelationshipSchemeForPolylineColorsForClassBreaks] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColors(value: js.Array[js.Array[Color_]]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorsVarargs(value: js.Array[Color_]*): Self = StObject.set(x, "colors", js.Array(value :_*))
    
    @scala.inline
    def setNumClasses(value: Double): Self = StObject.set(x, "numClasses", value.asInstanceOf[js.Any])
  }
}
