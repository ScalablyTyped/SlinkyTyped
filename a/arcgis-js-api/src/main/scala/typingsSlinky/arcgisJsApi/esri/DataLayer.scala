package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`envelope-intersects`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`index-intersects`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.contains
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.crosses
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.intersects
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.layer
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.overlaps
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.relation
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.touches
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.within
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataLayer
  extends Accessor
     with JSONSupport {
  
  /**
    * The geometry to apply to the spatial filter. The spatial relationship as specified by [spatialRelationship](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-DataLayer.html#spatialRelationship) is applied to this geometry while performing the query.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-DataLayer.html#geometry)
    */
  var geometry: Geometry_ = js.native
  
  /**
    * The name of the data layer in the map service that is being referenced.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-DataLayer.html#name)
    */
  var name: String = js.native
  
  /**
    * The spatial relationship to be applied on the input geometry while performing the query.
    *
    * Possible Value | Description
    * ---------------|------------
    * intersects | Part of a feature from feature class 1 is contained in a feature from feature class 2.
    * contains | Part or all of a feature from feature class 1 is contained within a feature from feature class 2.
    * crosses | The feature from feature class 1 crosses a feature from feature class 2.
    * envelope-intersects | The envelope of feature class 1 intersects with the envelope of feature class 2.
    * index-intersects | The envelope of the query feature class intersects the index entry for the target feature class.
    * overlaps | Features from feature class 1 overlap features in feature class 2.
    * touches | The feature from feature class 1 touches the border of a feature from feature class 2.
    * within | The feature from feature class 1 is completely enclosed by the feature from feature class 2.
    * relation | Allows specification of any relationship defined using the [Shape Comparison Language](http://resources.esri.com/help/9.3/arcgisengine/dotnet/concepts_start.htm#40de6491-9b2d-440d-848b-2609efcd46b1.htm).
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-DataLayer.html#spatialRelationship)
    */
  var spatialRelationship: intersects | contains | crosses | `envelope-intersects` | `index-intersects` | overlaps | touches | within | relation = js.native
  
  var `type`: layer = js.native
  
  /**
    * A where clause for the query. Any legal SQL where clause operating on the fields in the layer is allowed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-DataLayer.html#where)
    */
  var where: String = js.native
}
