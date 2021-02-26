package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.std.Object
import typingsSlinky.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SizeSchemeForPolygon
  extends Object
     with SizeScheme {
  
  /**
    * The schema defining the backgound symbol of the feature.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-size.html#SizeSchemeForPolygon)
    */
  var background: SizeSchemeForPolygonBackground = js.native
  
  /**
    * The scheme defining the symbology of the marker symbol used to represent polygon features by size.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-size.html#SizeSchemeForPolygon)
    */
  var marker: SizeSchemeForPoint = js.native
  
  /**
    * The opacity of the symbol.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-size.html#SizeSchemeForPolygon)
    */
  var opacity: Double = js.native
}
object SizeSchemeForPolygon {
  
  @scala.inline
  def apply(
    background: SizeSchemeForPolygonBackground,
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    marker: SizeSchemeForPoint,
    opacity: Double,
    propertyIsEnumerable: PropertyKey => Boolean
  ): SizeSchemeForPolygon = {
    val __obj = js.Dynamic.literal(background = background.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), marker = marker.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[SizeSchemeForPolygon]
  }
  
  @scala.inline
  implicit class SizeSchemeForPolygonMutableBuilder[Self <: SizeSchemeForPolygon] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackground(value: SizeSchemeForPolygonBackground): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarker(value: SizeSchemeForPoint): Self = StObject.set(x, "marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
  }
}
