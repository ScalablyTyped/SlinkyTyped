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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataLayerProperties extends StObject {
  
  /**
    * The geometry to apply to the spatial filter.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-DataLayer.html#geometry)
    */
  var geometry: js.UndefOr[GeometryProperties] = js.native
  
  /**
    * The name of the data layer in the map service that is being referenced.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-DataLayer.html#name)
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * The spatial relationship to be applied on the input geometry while performing the query.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-DataLayer.html#spatialRelationship)
    */
  var spatialRelationship: js.UndefOr[
    intersects | contains | crosses | `envelope-intersects` | `index-intersects` | overlaps | touches | within | relation
  ] = js.native
  
  var `type`: js.UndefOr[layer] = js.native
  
  /**
    * A where clause for the query.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-DataLayer.html#where)
    */
  var where: js.UndefOr[String] = js.native
}
object DataLayerProperties {
  
  @scala.inline
  def apply(): DataLayerProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataLayerProperties]
  }
  
  @scala.inline
  implicit class DataLayerPropertiesMutableBuilder[Self <: DataLayerProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGeometry(value: GeometryProperties): Self = StObject.set(x, "geometry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeometryUndefined: Self = StObject.set(x, "geometry", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setSpatialRelationship(
      value: intersects | contains | crosses | `envelope-intersects` | `index-intersects` | overlaps | touches | within | relation
    ): Self = StObject.set(x, "spatialRelationship", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpatialRelationshipUndefined: Self = StObject.set(x, "spatialRelationship", js.undefined)
    
    @scala.inline
    def setType(value: layer): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setWhere(value: String): Self = StObject.set(x, "where", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWhereUndefined: Self = StObject.set(x, "where", js.undefined)
  }
}
