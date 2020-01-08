package typingsSlinky.arcgisDashJsDashApi.__esri

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`nautical-miles`
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`us-feet`
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.disabled
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.feet_
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.imperial
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.inches
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.kilometers_
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.measured
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.measuring
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.meters_
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.metric
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.miles_
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.ready
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.yards
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DistanceMeasurement2DViewModel extends js.Object {
  /**
    * When the coordinate sustem is projected (other than web mercator) then distances less than this threshold will be computed planimetrically. Otherwise distances will be computed geodetically.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-DistanceMeasurement2D-DistanceMeasurement2DViewModel.html#geodesicDistanceThreshold)
    *
    * @default 100000
    */
  var geodesicDistanceThreshold: Double
  /**
    * The length and geometry of the measurement polyline in meters.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-DistanceMeasurement2D-DistanceMeasurement2DViewModel.html#measurement)
    */
  val measurement: DistanceMeasurement2DViewModelMeasurement
  /**
    * This property returns the locale specific representation of the length. Lengths are rounded to two decimal places. Lengths are sourced from the [measurement](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-DistanceMeasurement2D-DistanceMeasurement2DViewModel.html#measurement) property (in meters) and converted to the user defined units or system.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-DistanceMeasurement2D-DistanceMeasurement2DViewModel.html#measurementLabel)
    */
  val measurementLabel: String
  /**
    * The view model's state.
    *
    *    Value    | Description
    * ------------|-------------
    * disabled    | not ready yet
    * ready       | ready for measuring
    * measuring   | measuring has started
    * measured    | measuring has finished
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-DistanceMeasurement2D-DistanceMeasurement2DViewModel.html#state)
    *
    * @default disabled
    */
  val state: disabled | ready | measuring | measured
  /**
    * Unit system (imperial, metric) or specific unit used for displaying the distance values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-DistanceMeasurement2D-DistanceMeasurement2DViewModel.html#unit)
    */
  var unit: metric | imperial | inches | feet_ | `us-feet` | yards | miles_ | `nautical-miles` | meters_ | kilometers_
  /**
    * List of available units and unit systems (imperial, metric) for displaying the distance values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-DistanceMeasurement2D-DistanceMeasurement2DViewModel.html#unitOptions)
    */
  var unitOptions: js.Array[
    metric | imperial | inches | feet_ | `us-feet` | yards | miles_ | `nautical-miles` | meters_ | kilometers_
  ]
  /**
    * The view from which the widget will operate.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-DistanceMeasurement2D-DistanceMeasurement2DViewModel.html#view)
    */
  var view: MapView
  /**
    * Clears the current measurement.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-DistanceMeasurement2D-DistanceMeasurement2DViewModel.html#clearMeasurement)
    *
    *
    */
  def clearMeasurement(): Unit
  /**
    * Starts a new measurement.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-DistanceMeasurement2D-DistanceMeasurement2DViewModel.html#newMeasurement)
    *
    *
    */
  def newMeasurement(): Unit
}

@JSGlobal("__esri.DistanceMeasurement2DViewModel")
@js.native
object DistanceMeasurement2DViewModel extends TopLevel[DistanceMeasurement2DViewModelConstructor]

