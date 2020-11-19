package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`many-to-many`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`one-to-many`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`one-to-one`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.destination
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.origin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Relationship_ extends Accessor {
  
  /**
    * The cardinality which specifies the number of objects in the origin [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html) related to the number of objects in the destination [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html). Please see the [Desktop help](http://desktop.arcgis.com/en/arcmap/10.3/manage-data/relationships/relationship-class-properties.htm#GUID-989CB1D1-AC51-4A4C-8D9D-0AB9E647FFFD) for additional information on cardinality.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Relationship.html#cardinality)
    */
  var cardinality: `one-to-one` | `one-to-many` | `many-to-many` = js.native
  
  var composite: Boolean = js.native
  
  /**
    * The unique ID for the relationship. These ids for the relationships the [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html) participates in are listed in the ArcGIS Services directory.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Relationship.html#id)
    */
  var id: Double = js.native
  
  /**
    * The field used to establish the relate within the [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Relationship.html#keyField)
    */
  var keyField: String = js.native
  
  var keyFieldInRelationshipTable: String = js.native
  
  /**
    * The name of the relationship.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Relationship.html#name)
    */
  var name: String = js.native
  
  /**
    * The unique ID of the related [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Relationship.html#relatedTableId)
    */
  var relatedTableId: Double = js.native
  
  var relationshipTableId: Double = js.native
  
  var role: origin | destination = js.native
}
