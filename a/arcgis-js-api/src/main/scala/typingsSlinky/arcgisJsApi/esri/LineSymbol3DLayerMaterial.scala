package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.HashMap
import typingsSlinky.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LineSymbol3DLayerMaterial extends AnonymousAccessor {
  
  /**
    * The color of the line.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-LineSymbol3DLayer.html#material)
    */
  var color: js.UndefOr[Color_] = js.native
}
object LineSymbol3DLayerMaterial {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    set: (js.UndefOr[
      js.Function2[/* propertyName */ String, /* value */ js.Any, LineSymbol3DLayerMaterial]
    ]) with (js.UndefOr[js.Function1[/* props */ HashMap[_], LineSymbol3DLayerMaterial]])
  ): LineSymbol3DLayerMaterial = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), set = set.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineSymbol3DLayerMaterial]
  }
  
  @scala.inline
  implicit class LineSymbol3DLayerMaterialMutableBuilder[Self <: LineSymbol3DLayerMaterial] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: Color_): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
  }
}
