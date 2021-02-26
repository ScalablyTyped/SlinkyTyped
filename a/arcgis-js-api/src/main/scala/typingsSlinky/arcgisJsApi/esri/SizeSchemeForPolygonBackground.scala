package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.std.Object
import typingsSlinky.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SizeSchemeForPolygonBackground extends Object {
  
  /**
    * The color of the fill symbol representing the polygon.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-size.html#SizeSchemeForPolygon)
    */
  var color: Color_ = js.native
  
  /**
    * Properties for defining the outline of the background fill symbol.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-size.html#SizeSchemeForPolygon)
    */
  var outline: SizeSchemeForPolygonBackgroundOutline = js.native
}
object SizeSchemeForPolygonBackground {
  
  @scala.inline
  def apply(
    color: Color_,
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    outline: SizeSchemeForPolygonBackgroundOutline,
    propertyIsEnumerable: PropertyKey => Boolean
  ): SizeSchemeForPolygonBackground = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), outline = outline.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[SizeSchemeForPolygonBackground]
  }
  
  @scala.inline
  implicit class SizeSchemeForPolygonBackgroundMutableBuilder[Self <: SizeSchemeForPolygonBackground] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: Color_): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutline(value: SizeSchemeForPolygonBackgroundOutline): Self = StObject.set(x, "outline", value.asInstanceOf[js.Any])
  }
}
