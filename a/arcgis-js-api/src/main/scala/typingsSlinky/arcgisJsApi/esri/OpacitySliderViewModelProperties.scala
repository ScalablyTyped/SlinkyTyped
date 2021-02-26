package typingsSlinky.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OpacitySliderViewModelProperties extends SmartMappingSliderViewModelProperties {
  
  /**
    * The opacity stops from the [OpacityVariable](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-OpacityVariable.html) to link to the slider.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-OpacitySlider-OpacitySliderViewModel.html#stops)
    */
  var stops: js.UndefOr[js.Array[OpacityStopProperties]] = js.native
}
object OpacitySliderViewModelProperties {
  
  @scala.inline
  def apply(): OpacitySliderViewModelProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OpacitySliderViewModelProperties]
  }
  
  @scala.inline
  implicit class OpacitySliderViewModelPropertiesMutableBuilder[Self <: OpacitySliderViewModelProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStops(value: js.Array[OpacityStopProperties]): Self = StObject.set(x, "stops", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStopsUndefined: Self = StObject.set(x, "stops", js.undefined)
    
    @scala.inline
    def setStopsVarargs(value: OpacityStopProperties*): Self = StObject.set(x, "stops", js.Array(value :_*))
  }
}
