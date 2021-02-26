package typingsSlinky.awsSdk.comprehendmedicalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DetectEntitiesResponse extends StObject {
  
  /**
    *  The collection of medical entities extracted from the input text and their associated information. For each entity, the response provides the entity text, the entity category, where the entity text begins and ends, and the level of confidence that Amazon Comprehend Medical has in the detection and analysis. Attributes and traits of the entity are also returned.
    */
  var Entities: EntityList = js.native
  
  /**
    * The version of the model used to analyze the documents. The version number looks like X.X.X. You can use this information to track the model used for a particular batch of documents.
    */
  var ModelVersion: String = js.native
  
  /**
    *  If the result of the previous request to DetectEntities was truncated, include the PaginationToken to fetch the next page of entities.
    */
  var PaginationToken: js.UndefOr[String] = js.native
  
  /**
    *  Attributes extracted from the input text that we were unable to relate to an entity.
    */
  var UnmappedAttributes: js.UndefOr[UnmappedAttributeList] = js.native
}
object DetectEntitiesResponse {
  
  @scala.inline
  def apply(Entities: EntityList, ModelVersion: String): DetectEntitiesResponse = {
    val __obj = js.Dynamic.literal(Entities = Entities.asInstanceOf[js.Any], ModelVersion = ModelVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetectEntitiesResponse]
  }
  
  @scala.inline
  implicit class DetectEntitiesResponseMutableBuilder[Self <: DetectEntitiesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntities(value: EntityList): Self = StObject.set(x, "Entities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntitiesVarargs(value: Entity*): Self = StObject.set(x, "Entities", js.Array(value :_*))
    
    @scala.inline
    def setModelVersion(value: String): Self = StObject.set(x, "ModelVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaginationToken(value: String): Self = StObject.set(x, "PaginationToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaginationTokenUndefined: Self = StObject.set(x, "PaginationToken", js.undefined)
    
    @scala.inline
    def setUnmappedAttributes(value: UnmappedAttributeList): Self = StObject.set(x, "UnmappedAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnmappedAttributesUndefined: Self = StObject.set(x, "UnmappedAttributes", js.undefined)
    
    @scala.inline
    def setUnmappedAttributesVarargs(value: UnmappedAttribute*): Self = StObject.set(x, "UnmappedAttributes", js.Array(value :_*))
  }
}
