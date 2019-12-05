package typingsSlinky.arcgisDashJsDashApi.__esri

import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`global-id`
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`small-integer`
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.blob
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.date
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.double
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.guid
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.integer
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.long
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.oid
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.raster
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.single
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.string
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.xml
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchLayerFieldProperties extends js.Object {
  /**
    * Whether or not the field is an exact match.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webdoc-applicationProperties-SearchLayerField.html#exactMatch)
    */
  var exactMatch: js.UndefOr[Boolean] = js.undefined
  /**
    * The name of the field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webdoc-applicationProperties-SearchLayerField.html#name)
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * The data type of the field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webdoc-applicationProperties-SearchLayerField.html#type)
    */
  var `type`: js.UndefOr[
    `small-integer` | integer | single | double | long | string | date | oid | typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.geometry | blob | raster | guid | `global-id` | xml
  ] = js.undefined
}

object SearchLayerFieldProperties {
  @scala.inline
  def apply(
    exactMatch: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    `type`: `small-integer` | integer | single | double | long | string | date | oid | typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.geometry | blob | raster | guid | `global-id` | xml = null
  ): SearchLayerFieldProperties = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(exactMatch)) __obj.updateDynamic("exactMatch")(exactMatch.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchLayerFieldProperties]
  }
}

