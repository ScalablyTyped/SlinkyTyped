package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`interior-intersection`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`line-coincidence`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`line-touch`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`point-touch`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.cross
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.disjoint
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.in_
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.intersection
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.overlap
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.touch
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.within
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RelationParameters
  extends Accessor
     with JSONSupport {
  
  /**
    * The first array of geometries to compute the relation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RelationParameters.html#geometries1)
    */
  var geometries1: js.Array[Geometry_] = js.native
  
  /**
    * The second array of geometries to compute the relation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RelationParameters.html#geometries2)
    */
  var geometries2: js.Array[Geometry_] = js.native
  
  /**
    * The spatial relationship to be tested between the two input geometry arrays.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RelationParameters.html#relation)
    */
  var relation: cross | disjoint | in_ | `interior-intersection` | intersection | `line-coincidence` | `line-touch` | overlap | `point-touch` | typingsSlinky.arcgisJsApi.arcgisJsApiStrings.relation | touch | within = js.native
  
  /**
    * The string describes the spatial relationship to be tested when `RelationParameters.relation = 'relation'`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RelationParameters.html#relationParameter)
    */
  var relationParameter: String = js.native
}
