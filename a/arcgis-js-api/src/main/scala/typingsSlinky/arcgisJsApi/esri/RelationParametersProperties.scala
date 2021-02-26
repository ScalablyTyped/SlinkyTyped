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
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.relation
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.touch
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.within
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RelationParametersProperties extends StObject {
  
  /**
    * The first array of geometries to compute the relation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RelationParameters.html#geometries1)
    */
  var geometries1: js.UndefOr[js.Array[GeometryProperties]] = js.native
  
  /**
    * The second array of geometries to compute the relation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RelationParameters.html#geometries2)
    */
  var geometries2: js.UndefOr[js.Array[GeometryProperties]] = js.native
  
  /**
    * The spatial relationship to be tested between the two input geometry arrays.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RelationParameters.html#relation)
    */
  var relation: js.UndefOr[
    cross | disjoint | in_ | `interior-intersection` | intersection | `line-coincidence` | `line-touch` | overlap | `point-touch` | typingsSlinky.arcgisJsApi.arcgisJsApiStrings.relation | touch | within
  ] = js.native
  
  /**
    * The string describes the spatial relationship to be tested when `RelationParameters.relation = 'relation'`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RelationParameters.html#relationParameter)
    */
  var relationParameter: js.UndefOr[String] = js.native
}
object RelationParametersProperties {
  
  @scala.inline
  def apply(): RelationParametersProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RelationParametersProperties]
  }
  
  @scala.inline
  implicit class RelationParametersPropertiesMutableBuilder[Self <: RelationParametersProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGeometries1(value: js.Array[GeometryProperties]): Self = StObject.set(x, "geometries1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeometries1Undefined: Self = StObject.set(x, "geometries1", js.undefined)
    
    @scala.inline
    def setGeometries1Varargs(value: GeometryProperties*): Self = StObject.set(x, "geometries1", js.Array(value :_*))
    
    @scala.inline
    def setGeometries2(value: js.Array[GeometryProperties]): Self = StObject.set(x, "geometries2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeometries2Undefined: Self = StObject.set(x, "geometries2", js.undefined)
    
    @scala.inline
    def setGeometries2Varargs(value: GeometryProperties*): Self = StObject.set(x, "geometries2", js.Array(value :_*))
    
    @scala.inline
    def setRelation(
      value: cross | disjoint | in_ | `interior-intersection` | intersection | `line-coincidence` | `line-touch` | overlap | `point-touch` | relation | touch | within
    ): Self = StObject.set(x, "relation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelationParameter(value: String): Self = StObject.set(x, "relationParameter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelationParameterUndefined: Self = StObject.set(x, "relationParameter", js.undefined)
    
    @scala.inline
    def setRelationUndefined: Self = StObject.set(x, "relation", js.undefined)
  }
}
