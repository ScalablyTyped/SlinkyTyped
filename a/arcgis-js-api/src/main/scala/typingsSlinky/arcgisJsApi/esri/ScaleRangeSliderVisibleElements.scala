package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.std.Object
import typingsSlinky.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScaleRangeSliderVisibleElements extends Object {
  
  /**
    * Indicates whether the preview thumbnail of the region is visible.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ScaleRangeSlider.html#VisibleElements)
    */
  var preview: Boolean = js.native
}
object ScaleRangeSliderVisibleElements {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    preview: Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): ScaleRangeSliderVisibleElements = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), preview = preview.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[ScaleRangeSliderVisibleElements]
  }
  
  @scala.inline
  implicit class ScaleRangeSliderVisibleElementsMutableBuilder[Self <: ScaleRangeSliderVisibleElements] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPreview(value: Boolean): Self = StObject.set(x, "preview", value.asInstanceOf[js.Any])
  }
}
