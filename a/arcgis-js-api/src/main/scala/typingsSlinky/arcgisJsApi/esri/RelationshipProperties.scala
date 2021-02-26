package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`many-to-many`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`one-to-many`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`one-to-one`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.destination
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.origin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RelationshipProperties extends StObject {
  
  /**
    * The cardinality which specifies the number of objects in the origin [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html) related to the number of objects in the destination [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Relationship.html#cardinality)
    */
  var cardinality: js.UndefOr[`one-to-one` | `one-to-many` | `many-to-many`] = js.native
  
  /**
    * Indicates whether the relationship is composite.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Relationship.html#composite)
    */
  var composite: js.UndefOr[Boolean] = js.native
  
  /**
    * The unique ID for the relationship.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Relationship.html#id)
    */
  var id: js.UndefOr[Double] = js.native
  
  /**
    * The field used to establish the relate within the [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Relationship.html#keyField)
    */
  var keyField: js.UndefOr[String] = js.native
  
  /**
    * The key field in an attributed relationship class table that matches the [keyField](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Relationship.html#keyField).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Relationship.html#keyFieldInRelationshipTable)
    */
  var keyFieldInRelationshipTable: js.UndefOr[String] = js.native
  
  /**
    * The name of the relationship.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Relationship.html#name)
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * The unique ID of the related [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Relationship.html#relatedTableId)
    */
  var relatedTableId: js.UndefOr[Double] = js.native
  
  /**
    * The relationship table id.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Relationship.html#relationshipTableId)
    */
  var relationshipTableId: js.UndefOr[Double] = js.native
  
  /**
    * Indicates whether the table participating in the relationship is the `origin` or `destination` table.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Relationship.html#role)
    */
  var role: js.UndefOr[origin | destination] = js.native
}
object RelationshipProperties {
  
  @scala.inline
  def apply(): RelationshipProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RelationshipProperties]
  }
  
  @scala.inline
  implicit class RelationshipPropertiesMutableBuilder[Self <: RelationshipProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCardinality(value: `one-to-one` | `one-to-many` | `many-to-many`): Self = StObject.set(x, "cardinality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCardinalityUndefined: Self = StObject.set(x, "cardinality", js.undefined)
    
    @scala.inline
    def setComposite(value: Boolean): Self = StObject.set(x, "composite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompositeUndefined: Self = StObject.set(x, "composite", js.undefined)
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setKeyField(value: String): Self = StObject.set(x, "keyField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyFieldInRelationshipTable(value: String): Self = StObject.set(x, "keyFieldInRelationshipTable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyFieldInRelationshipTableUndefined: Self = StObject.set(x, "keyFieldInRelationshipTable", js.undefined)
    
    @scala.inline
    def setKeyFieldUndefined: Self = StObject.set(x, "keyField", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setRelatedTableId(value: Double): Self = StObject.set(x, "relatedTableId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelatedTableIdUndefined: Self = StObject.set(x, "relatedTableId", js.undefined)
    
    @scala.inline
    def setRelationshipTableId(value: Double): Self = StObject.set(x, "relationshipTableId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelationshipTableIdUndefined: Self = StObject.set(x, "relationshipTableId", js.undefined)
    
    @scala.inline
    def setRole(value: origin | destination): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
  }
}
