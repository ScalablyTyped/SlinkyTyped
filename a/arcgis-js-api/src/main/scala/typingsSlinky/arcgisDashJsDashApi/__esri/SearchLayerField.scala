package typingsSlinky.arcgisDashJsDashApi.__esri

import org.scalablytyped.runtime.TopLevel
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

@js.native
trait SearchLayerField extends Accessor {
  /**
    * Whether or not the field is an exact match.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webdoc-applicationProperties-SearchLayerField.html#exactMatch)
    */
  var exactMatch: Boolean = js.native
  /**
    * The name of the field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webdoc-applicationProperties-SearchLayerField.html#name)
    */
  var name: String = js.native
  /**
    * The data type of the field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webdoc-applicationProperties-SearchLayerField.html#type)
    */
  var `type`: `small-integer` | integer | single | double | long | string | date | oid | typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.geometry | blob | raster | guid | `global-id` | xml = js.native
}

@JSGlobal("__esri.SearchLayerField")
@js.native
object SearchLayerField extends TopLevel[SearchLayerFieldConstructor]

