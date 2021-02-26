package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.click
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.freehand
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.hybrid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PolygonDrawActionProperties extends DrawActionProperties {
  
  /**
    * The drawing mode.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-draw-PolygonDrawAction.html#mode)
    */
  var mode: js.UndefOr[hybrid | freehand | click] = js.native
}
object PolygonDrawActionProperties {
  
  @scala.inline
  def apply(): PolygonDrawActionProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolygonDrawActionProperties]
  }
  
  @scala.inline
  implicit class PolygonDrawActionPropertiesMutableBuilder[Self <: PolygonDrawActionProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMode(value: hybrid | freehand | click): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
  }
}
