package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.HashMap
import typingsSlinky.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextSymbol3DLayerMaterial extends AnonymousAccessor {
  
  /**
    * The color of the text.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-TextSymbol3DLayer.html#material)
    */
  var color: js.UndefOr[Color_] = js.native
}
object TextSymbol3DLayerMaterial {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    set: (js.UndefOr[
      js.Function2[/* propertyName */ String, /* value */ js.Any, TextSymbol3DLayerMaterial]
    ]) with (js.UndefOr[js.Function1[/* props */ HashMap[_], TextSymbol3DLayerMaterial]])
  ): TextSymbol3DLayerMaterial = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), set = set.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextSymbol3DLayerMaterial]
  }
  
  @scala.inline
  implicit class TextSymbol3DLayerMaterialMutableBuilder[Self <: TextSymbol3DLayerMaterial] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: Color_): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
  }
}
