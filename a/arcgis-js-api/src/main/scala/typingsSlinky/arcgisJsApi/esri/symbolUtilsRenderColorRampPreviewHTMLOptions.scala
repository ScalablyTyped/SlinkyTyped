package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.horizontal
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.vertical
import typingsSlinky.std.Object
import typingsSlinky.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait symbolUtilsRenderColorRampPreviewHTMLOptions extends Object {
  
  /**
    * Specifies the alignment of the color ramp.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-support-symbolUtils.html#renderColorRampPreviewHTML)
    */
  var align: js.UndefOr[horizontal | vertical] = js.native
  
  /**
    * Indicates whether to render the color ramp with a continuous gradient.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-support-symbolUtils.html#renderColorRampPreviewHTML)
    */
  var gradient: js.UndefOr[Boolean] = js.native
  
  /**
    * The height of the ramp in pixels.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-support-symbolUtils.html#renderColorRampPreviewHTML)
    */
  var height: js.UndefOr[Double] = js.native
  
  /**
    * The width of the ramp in pixels.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-support-symbolUtils.html#renderColorRampPreviewHTML)
    */
  var width: js.UndefOr[Double] = js.native
}
object symbolUtilsRenderColorRampPreviewHTMLOptions {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): symbolUtilsRenderColorRampPreviewHTMLOptions = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[symbolUtilsRenderColorRampPreviewHTMLOptions]
  }
  
  @scala.inline
  implicit class symbolUtilsRenderColorRampPreviewHTMLOptionsMutableBuilder[Self <: symbolUtilsRenderColorRampPreviewHTMLOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlign(value: horizontal | vertical): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    @scala.inline
    def setGradient(value: Boolean): Self = StObject.set(x, "gradient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGradientUndefined: Self = StObject.set(x, "gradient", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
