package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`begin-end`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.arrow
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.begin
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.circle
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.cross
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.diamond
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.end
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.square
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.x
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LineSymbolMarkerProperties extends StObject {
  
  /**
    * The color of the marker.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-LineSymbolMarker.html#color)
    */
  var color: js.UndefOr[Color_ | js.Array[Double] | String] = js.native
  
  /**
    * The placement of the marker(s) on the line.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-LineSymbolMarker.html#placement)
    */
  var placement: js.UndefOr[begin | end | `begin-end`] = js.native
  
  /**
    * The marker style.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-LineSymbolMarker.html#style)
    */
  var style: js.UndefOr[arrow | circle | square | diamond | cross | x] = js.native
}
object LineSymbolMarkerProperties {
  
  @scala.inline
  def apply(): LineSymbolMarkerProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LineSymbolMarkerProperties]
  }
  
  @scala.inline
  implicit class LineSymbolMarkerPropertiesMutableBuilder[Self <: LineSymbolMarkerProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: Color_ | js.Array[Double] | String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setColorVarargs(value: Double*): Self = StObject.set(x, "color", js.Array(value :_*))
    
    @scala.inline
    def setPlacement(value: begin | end | `begin-end`): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
    
    @scala.inline
    def setStyle(value: arrow | circle | square | diamond | cross | typingsSlinky.arcgisJsApi.arcgisJsApiStrings.x): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
