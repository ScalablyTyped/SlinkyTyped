package typingsSlinky.arcgisDashJsDashApi.__esri

import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`nautical-miles`
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`us-feet`
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.centimeters
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.decimeters
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.feet_
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.inches
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.kilometers_
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.meters_
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.miles_
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.millimeters
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.yards
import typingsSlinky.std.Object
import typingsSlinky.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait meshUtilsGeoreferenceOptions extends Object {
  /**
    * Indicates whether to georeference relative to the globe or the projected coordinate system.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-meshUtils.html#georeference)
    */
  var geographic: js.UndefOr[Boolean] = js.undefined
  /**
    * Indicates the unit of the source data. A linear scale will be applied to the position attributes to convert the source data to the unit of the spatial reference at which the mesh is being georeferenced. By default the unit of the source data is assumed to be the same as the target spatial reference.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-meshUtils.html#georeference)
    */
  var unit: js.UndefOr[
    millimeters | centimeters | decimeters | meters_ | kilometers_ | inches | feet_ | yards | miles_ | `nautical-miles` | `us-feet`
  ] = js.undefined
}

object meshUtilsGeoreferenceOptions {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    geographic: js.UndefOr[Boolean] = js.undefined,
    unit: millimeters | centimeters | decimeters | meters_ | kilometers_ | inches | feet_ | yards | miles_ | `nautical-miles` | `us-feet` = null
  ): meshUtilsGeoreferenceOptions = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    if (!js.isUndefined(geographic)) __obj.updateDynamic("geographic")(geographic.asInstanceOf[js.Any])
    if (unit != null) __obj.updateDynamic("unit")(unit.asInstanceOf[js.Any])
    __obj.asInstanceOf[meshUtilsGeoreferenceOptions]
  }
}

