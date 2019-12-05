package typingsSlinky.arcgisDashJsDashApi.__esri

import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`square-feet`
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`square-inches`
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`square-kilometers`
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`square-meters`
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`square-miles`
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`square-us-feet`
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`square-yards`
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.acres
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.ares
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.disabled
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.hectares
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.imperial
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.measured
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.measuring
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.metric
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.ready
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("__esri.AreaMeasurement2DViewModel")
@js.native
class AreaMeasurement2DViewModelCls () extends AreaMeasurement2DViewModel {
  def this(properties: js.Any) = this()
  /**
    * When the coordinate sustem is projected (other than web mercator) then perimeters less than this threshold will be computed planimetrically. Otherwise areas will be computed geodetically.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-AreaMeasurement2D-AreaMeasurement2DViewModel.html#geodesicDistanceThreshold)
    *
    * @default 100000
    */
  /* CompleteClass */
  override var geodesicDistanceThreshold: Double = js.native
  /**
    * The area and perimeter of the measurement polygon in square meters and meters respectively.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-AreaMeasurement2D-AreaMeasurement2DViewModel.html#measurement)
    */
  /* CompleteClass */
  override val measurement: AreaMeasurement2DViewModelMeasurement = js.native
  /**
    * This property returns the locale specific representation of the area and perimeter. Areas and perimeters are rounded to two decimal places. Areas are sourced from the [measurement](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-AreaMeasurement2D-AreaMeasurement2DViewModel.html#measurement) property (in square meters) and converted to the user defined units/system.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-AreaMeasurement2D-AreaMeasurement2DViewModel.html#measurementLabel)
    */
  /* CompleteClass */
  override val measurementLabel: AreaMeasurement2DViewModelMeasurementLabel = js.native
  /**
    * The ViewModel's state.
    *
    *    Value    | Description
    * ------------|-------------
    * disabled    | not ready yet
    * ready       | ready for measuring
    * measuring   | measuring has started
    * measured    | measuring has finished
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-AreaMeasurement2D-AreaMeasurement2DViewModel.html#state)
    *
    * @default disabled
    */
  /* CompleteClass */
  override val state: disabled | ready | measuring | measured = js.native
  /**
    * Unit system (imperial, metric) or specific unit used for displaying the area values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-AreaMeasurement2D-AreaMeasurement2DViewModel.html#unit)
    */
  /* CompleteClass */
  override var unit: metric | imperial | `square-inches` | `square-feet` | `square-us-feet` | `square-yards` | `square-miles` | `square-meters` | `square-kilometers` | acres | ares | hectares = js.native
  /**
    * List of available units and unit systems (imperial, metric) for displaying the area values. By default, the following units are included: `metric`, `imperial`, `square-inches`, `square-feet`, `square-us-feet`, `square-yards`, `square-miles`, `square-meters`, `square-kilometers`, `acres`, `ares`, `hectares`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-AreaMeasurement2D-AreaMeasurement2DViewModel.html#unitOptions)
    */
  /* CompleteClass */
  override var unitOptions: js.Array[
    metric | imperial | `square-inches` | `square-feet` | `square-us-feet` | `square-yards` | `square-miles` | `square-meters` | `square-kilometers` | acres | ares | hectares
  ] = js.native
  /**
    * The view from which the widget will operate.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-AreaMeasurement2D-AreaMeasurement2DViewModel.html#view)
    */
  /* CompleteClass */
  override var view: MapView = js.native
  /**
    * Clears the current measurement.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-AreaMeasurement2D-AreaMeasurement2DViewModel.html#clearMeasurement)
    *
    *
    */
  /* CompleteClass */
  override def clearMeasurement(): Unit = js.native
  /**
    * Starts a new measurement.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-AreaMeasurement2D-AreaMeasurement2DViewModel.html#newMeasurement)
    *
    *
    */
  /* CompleteClass */
  override def newMeasurement(): Unit = js.native
}

