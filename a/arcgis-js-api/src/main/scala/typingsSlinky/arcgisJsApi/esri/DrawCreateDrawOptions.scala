package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.click
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.freehand
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.hybrid
import typingsSlinky.std.Object
import typingsSlinky.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DrawCreateDrawOptions extends Object {
  
  /**
    * The drawing mode.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-draw-Draw.html#create)
    */
  var mode: js.UndefOr[hybrid | freehand | click] = js.native
}
object DrawCreateDrawOptions {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): DrawCreateDrawOptions = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[DrawCreateDrawOptions]
  }
  
  @scala.inline
  implicit class DrawCreateDrawOptionsMutableBuilder[Self <: DrawCreateDrawOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMode(value: hybrid | freehand | click): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
  }
}
