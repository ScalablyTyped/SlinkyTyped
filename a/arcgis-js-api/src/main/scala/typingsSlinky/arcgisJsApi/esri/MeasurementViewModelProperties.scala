package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`direct-line`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`nautical-miles`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`square-feet`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`square-inches`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`square-kilometers`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`square-meters`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`square-miles`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`square-us-feet`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`square-yards`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`us-feet`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.acres
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.area
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.ares
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.distance
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.feet_
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.hectares
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
trait MeasurementViewModelProperties extends StObject {
  
  /**
    * Specifies the current measurement tool to display.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Measurement-MeasurementViewModel.html#activeTool)
    */
  var activeTool: js.UndefOr[area | distance | `direct-line`] = js.native
  
  /**
    * View model of the active measurement widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Measurement-MeasurementViewModel.html#activeViewModel)
    */
  var activeViewModel: js.UndefOr[
    AreaMeasurement2DViewModel | AreaMeasurement3DViewModelProperties | DirectLineMeasurement3DViewModelProperties | DistanceMeasurement2DViewModelProperties
  ] = js.native
  
  /**
    * Unit system (imperial, metric) or specific unit used for displaying the area values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Measurement-MeasurementViewModel.html#areaUnit)
    */
  var areaUnit: js.UndefOr[
    metric | imperial | `square-inches` | `square-feet` | `square-us-feet` | `square-yards` | `square-miles` | `square-meters` | `square-kilometers` | acres | ares | hectares
  ] = js.native
  
  /**
    * Unit system (imperial, metric) or specific unit used for displaying the distance values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Measurement-MeasurementViewModel.html#linearUnit)
    */
  var linearUnit: js.UndefOr[
    metric | imperial | inches | feet_ | `us-feet` | yards | miles_ | `nautical-miles` | meters_ | kilometers_
  ] = js.native
  
  /**
    * A reference to the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) or [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Measurement-MeasurementViewModel.html#view)
    */
  var view: js.UndefOr[MapViewProperties | SceneViewProperties] = js.native
}
object MeasurementViewModelProperties {
  
  @scala.inline
  def apply(): MeasurementViewModelProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MeasurementViewModelProperties]
  }
  
  @scala.inline
  implicit class MeasurementViewModelPropertiesMutableBuilder[Self <: MeasurementViewModelProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActiveTool(value: area | distance | `direct-line`): Self = StObject.set(x, "activeTool", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveToolUndefined: Self = StObject.set(x, "activeTool", js.undefined)
    
    @scala.inline
    def setActiveViewModel(
      value: AreaMeasurement2DViewModel | AreaMeasurement3DViewModelProperties | DirectLineMeasurement3DViewModelProperties | DistanceMeasurement2DViewModelProperties
    ): Self = StObject.set(x, "activeViewModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveViewModelUndefined: Self = StObject.set(x, "activeViewModel", js.undefined)
    
    @scala.inline
    def setAreaUnit(
      value: metric | imperial | `square-inches` | `square-feet` | `square-us-feet` | `square-yards` | `square-miles` | `square-meters` | `square-kilometers` | acres | ares | hectares
    ): Self = StObject.set(x, "areaUnit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAreaUnitUndefined: Self = StObject.set(x, "areaUnit", js.undefined)
    
    @scala.inline
    def setLinearUnit(
      value: metric | imperial | inches | feet_ | `us-feet` | yards | miles_ | `nautical-miles` | meters_ | kilometers_
    ): Self = StObject.set(x, "linearUnit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinearUnitUndefined: Self = StObject.set(x, "linearUnit", js.undefined)
    
    @scala.inline
    def setView(value: MapViewProperties | SceneViewProperties): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
