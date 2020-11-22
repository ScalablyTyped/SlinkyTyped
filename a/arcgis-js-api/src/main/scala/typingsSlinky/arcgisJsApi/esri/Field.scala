package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`count-or-amount`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`date-and-time`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`global-id`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`location-or-place-name`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`name-or-title`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`ordered-or-ranked`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`percentage-or-ratio`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`small-integer`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`type-or-category`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`unique-identifier`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.binary
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.blob
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.coordinate
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.date
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.description
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.double
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.guid
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.integer
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.long
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.measurement
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.none
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.oid
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.raster
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.single
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.string
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.xml
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Field
  extends Accessor
     with JSONSupport {
  
  /**
    * The display name for the field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Field.html#alias)
    */
  var alias: String = js.native
  
  /**
    * The default value set for the field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Field.html#defaultValue)
    */
  var defaultValue: Double | String | js.Any = js.native
  
  /**
    * Contains information describing the purpose of each field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Field.html#description)
    */
  var description: String = js.native
  
  /**
    * The domain associated with the field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Field.html#domain)
    */
  var domain: Domain = js.native
  
  /**
    * Indicates whether the field is editable.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Field.html#editable)
    */
  var editable: Boolean = js.native
  
  /**
    * The field length.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Field.html#length)
    */
  var length: Double = js.native
  
  /**
    * The name of the field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Field.html#name)
    */
  var name: String = js.native
  
  /**
    * Indicates if the field can accept `null` values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Field.html#nullable)
    */
  var nullable: Boolean = js.native
  
  /**
    * The data type of the field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Field.html#type)
    */
  var `type`: `small-integer` | integer | single | double | long | string | date | oid | typingsSlinky.arcgisJsApi.arcgisJsApiStrings.geometry | blob | raster | guid | `global-id` | xml = js.native
  
  /**
    * The types of values that can be assigned to a field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Field.html#valueType)
    */
  var valueType: binary | coordinate | `count-or-amount` | `date-and-time` | description | `location-or-place-name` | measurement | `name-or-title` | none | `ordered-or-ranked` | `percentage-or-ratio` | `type-or-category` | `unique-identifier` = js.native
}
