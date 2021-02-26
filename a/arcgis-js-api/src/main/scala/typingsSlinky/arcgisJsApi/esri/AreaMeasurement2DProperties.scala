package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`square-feet`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`square-inches`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`square-kilometers`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`square-meters`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`square-miles`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`square-us-feet`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`square-yards`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.acres
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.ares
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.hectares
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.imperial
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.metric
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AreaMeasurement2DProperties extends WidgetProperties {
  
  /**
    * The widget's default CSS icon class.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-AreaMeasurement2D.html#iconClass)
    */
  var iconClass: js.UndefOr[String] = js.native
  
  /**
    * Unit system (imperial, metric) or specific unit used for displaying the area values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-AreaMeasurement2D.html#unit)
    */
  var unit: js.UndefOr[
    metric | imperial | `square-inches` | `square-feet` | `square-us-feet` | `square-yards` | `square-miles` | `square-meters` | `square-kilometers` | acres | ares | hectares
  ] = js.native
  
  /**
    * List of available units and unit systems (imperial, metric) for displaying the area values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-AreaMeasurement2D.html#unitOptions)
    */
  var unitOptions: js.UndefOr[
    js.Array[
      metric | imperial | `square-inches` | `square-feet` | `square-us-feet` | `square-yards` | `square-miles` | `square-meters` | `square-kilometers` | acres | ares | hectares
    ]
  ] = js.native
  
  /**
    * A reference to the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-AreaMeasurement2D.html#view)
    */
  var view: js.UndefOr[MapViewProperties] = js.native
  
  /**
    * The view model for this widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-AreaMeasurement2D.html#viewModel)
    */
  var viewModel: js.UndefOr[AreaMeasurement2DViewModel] = js.native
}
object AreaMeasurement2DProperties {
  
  @scala.inline
  def apply(): AreaMeasurement2DProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AreaMeasurement2DProperties]
  }
  
  @scala.inline
  implicit class AreaMeasurement2DPropertiesMutableBuilder[Self <: AreaMeasurement2DProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIconClass(value: String): Self = StObject.set(x, "iconClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconClassUndefined: Self = StObject.set(x, "iconClass", js.undefined)
    
    @scala.inline
    def setUnit(
      value: metric | imperial | `square-inches` | `square-feet` | `square-us-feet` | `square-yards` | `square-miles` | `square-meters` | `square-kilometers` | acres | ares | hectares
    ): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnitOptions(
      value: js.Array[
          metric | imperial | `square-inches` | `square-feet` | `square-us-feet` | `square-yards` | `square-miles` | `square-meters` | `square-kilometers` | acres | ares | hectares
        ]
    ): Self = StObject.set(x, "unitOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnitOptionsUndefined: Self = StObject.set(x, "unitOptions", js.undefined)
    
    @scala.inline
    def setUnitOptionsVarargs(
      value: (metric | imperial | `square-inches` | `square-feet` | `square-us-feet` | `square-yards` | `square-miles` | `square-meters` | `square-kilometers` | acres | ares | hectares)*
    ): Self = StObject.set(x, "unitOptions", js.Array(value :_*))
    
    @scala.inline
    def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
    
    @scala.inline
    def setView(value: MapViewProperties): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewModel(value: AreaMeasurement2DViewModel): Self = StObject.set(x, "viewModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewModelUndefined: Self = StObject.set(x, "viewModel", js.undefined)
    
    @scala.inline
    def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
