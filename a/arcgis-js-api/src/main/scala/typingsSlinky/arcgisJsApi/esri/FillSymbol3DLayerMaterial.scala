package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.HashMap
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.multiply
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.replace
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.tint
import typingsSlinky.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FillSymbol3DLayerMaterial extends AnonymousAccessor {
  
  /**
    * The color of the fill.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-FillSymbol3DLayer.html#material)
    */
  var color: js.UndefOr[Color_] = js.native
  
  /**
    * Specifies how the material `color` is applied to the geometry color/texture information.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-FillSymbol3DLayer.html#material)
    */
  var colorMixMode: js.UndefOr[tint | replace | multiply] = js.native
}
object FillSymbol3DLayerMaterial {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    set: (js.UndefOr[
      js.Function2[/* propertyName */ String, /* value */ js.Any, FillSymbol3DLayerMaterial]
    ]) with (js.UndefOr[js.Function1[/* props */ HashMap[_], FillSymbol3DLayerMaterial]])
  ): FillSymbol3DLayerMaterial = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), set = set.asInstanceOf[js.Any])
    __obj.asInstanceOf[FillSymbol3DLayerMaterial]
  }
  
  @scala.inline
  implicit class FillSymbol3DLayerMaterialMutableBuilder[Self <: FillSymbol3DLayerMaterial] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: Color_): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorMixMode(value: tint | replace | multiply): Self = StObject.set(x, "colorMixMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorMixModeUndefined: Self = StObject.set(x, "colorMixMode", js.undefined)
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
  }
}
