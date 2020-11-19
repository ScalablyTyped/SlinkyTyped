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
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.disabled
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.distance
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.feet_
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.hectares
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.imperial
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.inches
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.kilometers_
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.measured
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.measuring
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.meters_
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.metric
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.miles_
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.ready
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.yards
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MeasurementViewModel extends Accessor {
  
  /**
    * Specifies the current measurement tool to display. Setting its value to `area` activates the area measurement tool and it works for both [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) and [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html). To measure distance in a [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) set the property to `distance` and in a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html) set it to `direct-line`. If this property is not set, the widget will not be displayed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Measurement-MeasurementViewModel.html#activeTool)
    *
    * @default null
    */
  var activeTool: area | distance | `direct-line` = js.native
  
  /**
    * View model of the active measurement widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Measurement-MeasurementViewModel.html#activeViewModel)
    */
  var activeViewModel: AreaMeasurement2DViewModel | AreaMeasurement3DViewModel | DirectLineMeasurement3DViewModel | DistanceMeasurement2DViewModel = js.native
  
  /**
    * Unit system (imperial, metric) or specific unit used for displaying the area values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Measurement-MeasurementViewModel.html#areaUnit)
    */
  var areaUnit: metric | imperial | `square-inches` | `square-feet` | `square-us-feet` | `square-yards` | `square-miles` | `square-meters` | `square-kilometers` | acres | ares | hectares = js.native
  
  /**
    * Unit system (imperial, metric) or specific unit used for displaying the distance values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Measurement-MeasurementViewModel.html#linearUnit)
    */
  var linearUnit: metric | imperial | inches | feet_ | `us-feet` | yards | miles_ | `nautical-miles` | meters_ | kilometers_ = js.native
  
  /**
    * The ViewModel's state.
    *
    * Value       | Description
    * ------------|-------------
    * disabled    | not ready yet
    * ready       | ready for measuring
    * measuring   | measuring has started
    * measured    | measuring has finished
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Measurement-MeasurementViewModel.html#state)
    *
    * @default disabled
    */
  val state: disabled | ready | measuring | measured = js.native
  
  /**
    * A reference to the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) or [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Measurement-MeasurementViewModel.html#view)
    */
  var view: MapView | SceneView = js.native
}
