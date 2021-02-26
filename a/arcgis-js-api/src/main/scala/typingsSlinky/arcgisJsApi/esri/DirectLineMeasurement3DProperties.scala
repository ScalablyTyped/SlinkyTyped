package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`nautical-miles`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`us-feet`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.feet_
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.imperial
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.inches
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.kilometers_
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.meters_
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.metric
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.miles_
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.yards
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DirectLineMeasurement3DProperties extends WidgetProperties {
  
  /**
    * The widget's default CSS icon class.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-DirectLineMeasurement3D.html#iconClass)
    */
  var iconClass: js.UndefOr[String] = js.native
  
  /**
    * Unit system (imperial, metric) or specific unit used for displaying the distance values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-DirectLineMeasurement3D.html#unit)
    */
  var unit: js.UndefOr[
    metric | imperial | inches | feet_ | `us-feet` | yards | miles_ | `nautical-miles` | meters_ | kilometers_
  ] = js.native
  
  /**
    * List of unit systems (imperial, metric) and specific units for displaying the distance values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-DirectLineMeasurement3D.html#unitOptions)
    */
  var unitOptions: js.UndefOr[
    js.Array[
      metric | imperial | inches | feet_ | `us-feet` | yards | miles_ | `nautical-miles` | meters_ | kilometers_
    ]
  ] = js.native
  
  /**
    * A reference to the [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-DirectLineMeasurement3D.html#view)
    */
  var view: js.UndefOr[SceneViewProperties] = js.native
  
  /**
    * The view model for this widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-DirectLineMeasurement3D.html#viewModel)
    */
  var viewModel: js.UndefOr[DirectLineMeasurement3DViewModelProperties] = js.native
}
object DirectLineMeasurement3DProperties {
  
  @scala.inline
  def apply(): DirectLineMeasurement3DProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DirectLineMeasurement3DProperties]
  }
  
  @scala.inline
  implicit class DirectLineMeasurement3DPropertiesMutableBuilder[Self <: DirectLineMeasurement3DProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIconClass(value: String): Self = StObject.set(x, "iconClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconClassUndefined: Self = StObject.set(x, "iconClass", js.undefined)
    
    @scala.inline
    def setUnit(
      value: metric | imperial | inches | feet_ | `us-feet` | yards | miles_ | `nautical-miles` | meters_ | kilometers_
    ): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnitOptions(
      value: js.Array[
          metric | imperial | inches | feet_ | `us-feet` | yards | miles_ | `nautical-miles` | meters_ | kilometers_
        ]
    ): Self = StObject.set(x, "unitOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnitOptionsUndefined: Self = StObject.set(x, "unitOptions", js.undefined)
    
    @scala.inline
    def setUnitOptionsVarargs(
      value: (metric | imperial | inches | feet_ | `us-feet` | yards | miles_ | `nautical-miles` | meters_ | kilometers_)*
    ): Self = StObject.set(x, "unitOptions", js.Array(value :_*))
    
    @scala.inline
    def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
    
    @scala.inline
    def setView(value: SceneViewProperties): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewModel(value: DirectLineMeasurement3DViewModelProperties): Self = StObject.set(x, "viewModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewModelUndefined: Self = StObject.set(x, "viewModel", js.undefined)
    
    @scala.inline
    def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
