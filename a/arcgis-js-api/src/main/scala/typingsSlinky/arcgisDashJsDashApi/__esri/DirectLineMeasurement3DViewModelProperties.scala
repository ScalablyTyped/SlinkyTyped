package typingsSlinky.arcgisDashJsDashApi.__esri

import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`nautical-miles`
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`us-feet`
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.feet_
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.imperial
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.inches
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.kilometers_
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.meters_
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.metric
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.miles_
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.yards
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectLineMeasurement3DViewModelProperties extends js.Object {
  /**
    * Unit system (imperial, metric) or specific unit used for displaying the distance values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-DirectLineMeasurement3D-DirectLineMeasurement3DViewModel.html#unit)
    */
  var unit: js.UndefOr[
    metric | imperial | inches | feet_ | `us-feet` | yards | miles_ | `nautical-miles` | meters_ | kilometers_
  ] = js.undefined
  /**
    * List of unit systems (imperial, metric) and specific units for displaying the distance values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-DirectLineMeasurement3D-DirectLineMeasurement3DViewModel.html#unitOptions)
    */
  var unitOptions: js.UndefOr[
    js.Array[
      metric | imperial | inches | feet_ | `us-feet` | yards | miles_ | `nautical-miles` | meters_ | kilometers_
    ]
  ] = js.undefined
  /**
    * The view from which the widget will operate.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-DirectLineMeasurement3D-DirectLineMeasurement3DViewModel.html#view)
    */
  var view: js.UndefOr[SceneViewProperties] = js.undefined
}

object DirectLineMeasurement3DViewModelProperties {
  @scala.inline
  def apply(
    unit: metric | imperial | inches | feet_ | `us-feet` | yards | miles_ | `nautical-miles` | meters_ | kilometers_ = null,
    unitOptions: js.Array[
      metric | imperial | inches | feet_ | `us-feet` | yards | miles_ | `nautical-miles` | meters_ | kilometers_
    ] = null,
    view: SceneViewProperties = null
  ): DirectLineMeasurement3DViewModelProperties = {
    val __obj = js.Dynamic.literal()
    if (unit != null) __obj.updateDynamic("unit")(unit.asInstanceOf[js.Any])
    if (unitOptions != null) __obj.updateDynamic("unitOptions")(unitOptions.asInstanceOf[js.Any])
    if (view != null) __obj.updateDynamic("view")(view.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectLineMeasurement3DViewModelProperties]
  }
}

