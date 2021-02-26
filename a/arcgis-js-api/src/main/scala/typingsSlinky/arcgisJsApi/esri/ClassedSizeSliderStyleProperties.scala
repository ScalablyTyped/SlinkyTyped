package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.std.Object
import typingsSlinky.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClassedSizeSliderStyleProperties extends Object {
  
  /**
    * The background color of the slider's track.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ClassedSizeSlider.html#style)
    */
  var trackBackgroundColor: js.UndefOr[Color_ | js.Array[Double] | String] = js.native
  
  /**
    * The color of the slider's track.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ClassedSizeSlider.html#style)
    */
  var trackFillColor: js.UndefOr[Color_ | js.Array[Double] | String] = js.native
}
object ClassedSizeSliderStyleProperties {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): ClassedSizeSliderStyleProperties = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[ClassedSizeSliderStyleProperties]
  }
  
  @scala.inline
  implicit class ClassedSizeSliderStylePropertiesMutableBuilder[Self <: ClassedSizeSliderStyleProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTrackBackgroundColor(value: Color_ | js.Array[Double] | String): Self = StObject.set(x, "trackBackgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrackBackgroundColorUndefined: Self = StObject.set(x, "trackBackgroundColor", js.undefined)
    
    @scala.inline
    def setTrackBackgroundColorVarargs(value: Double*): Self = StObject.set(x, "trackBackgroundColor", js.Array(value :_*))
    
    @scala.inline
    def setTrackFillColor(value: Color_ | js.Array[Double] | String): Self = StObject.set(x, "trackFillColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrackFillColorUndefined: Self = StObject.set(x, "trackFillColor", js.undefined)
    
    @scala.inline
    def setTrackFillColorVarargs(value: Double*): Self = StObject.set(x, "trackFillColor", js.Array(value :_*))
  }
}
