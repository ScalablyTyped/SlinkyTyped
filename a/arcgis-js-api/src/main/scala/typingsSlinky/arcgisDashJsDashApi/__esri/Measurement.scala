package typingsSlinky.arcgisDashJsDashApi.__esri

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`direct-line`
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`nautical-miles`
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`square-feet`
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`square-inches`
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`square-kilometers`
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`square-meters`
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`square-miles`
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`square-us-feet`
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`square-yards`
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`us-feet`
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.acres
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.area
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.ares
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.distance
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.feet
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.hectares
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.imperial
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.inches
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.kilometers
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.meters
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.metric
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.miles
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.yards
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Measurement extends Widget {
  /**
    * Specifies the current measurement tool to display. Setting its value to `area` activates the area measurement tool and it works for both [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) and [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html). To measure distance in a [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) set the property to `distance` and in a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html) set it to `direct-line`. If this property is not set, the widget will not be displayed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Measurement.html#activeTool)
    *
    * @default null
    */
  var activeTool: area | distance | `direct-line` = js.native
  /**
    * The measurement widget that is currently being used. Use this property to get access to the active widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Measurement.html#activeWidget)
    *
    * @default null
    */
  val activeWidget: AreaMeasurement2D | AreaMeasurement3D | DirectLineMeasurement3D | DistanceMeasurement2D = js.native
  /**
    * Unit system (imperial, metric) or specific unit used for displaying the area values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Measurement.html#areaUnit)
    */
  var areaUnit: metric | imperial | `square-inches` | `square-feet` | `square-us-feet` | `square-yards` | `square-miles` | `square-meters` | `square-kilometers` | acres | ares | hectares = js.native
  /**
    * The widget's default CSS icon class.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Measurement.html#iconClass)
    */
  val iconClass: String = js.native
  /**
    * Unit system (imperial, metric) or specific unit used for displaying the distance values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Measurement.html#linearUnit)
    */
  var linearUnit: metric | imperial | inches | feet | `us-feet` | yards | miles | `nautical-miles` | meters | kilometers = js.native
  /**
    * A reference to the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) or [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html). Set this to link the widget to a specific view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Measurement.html#view)
    */
  var view: MapView | SceneView = js.native
  /**
    * The view model for this widget. This is a class that contains all the logic (properties and methods) that controls this widget's behavior. See the [MeasurementViewModel](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Measurement-MeasurementViewModel.html) class to access all properties and methods on the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Measurement.html#viewModel)
    */
  var viewModel: MeasurementViewModel = js.native
  /**
    * Removes all measurement widgets and associated graphics.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Measurement.html#clear)
    *
    *
    */
  def clear(): Unit = js.native
  /**
    * Starts a new measurement for the active measurement widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Measurement.html#startMeasurement)
    *
    *
    */
  def startMeasurement(): Unit = js.native
}

@JSGlobal("__esri.Measurement")
@js.native
object Measurement extends TopLevel[MeasurementConstructor]

