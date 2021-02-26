package typingsSlinky.awsSdk.iotthingsgraphMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchEntitiesRequest extends StObject {
  
  /**
    * The entity types for which to search.
    */
  var entityTypes: EntityTypes = js.native
  
  /**
    * Optional filter to apply to the search. Valid filters are NAME NAMESPACE, SEMANTIC_TYPE_PATH and REFERENCED_ENTITY_ID. REFERENCED_ENTITY_ID filters on entities that are used by the entity in the result set. For example, you can filter on the ID of a property that is used in a state. Multiple filters function as OR criteria in the query. Multiple values passed inside the filter function as AND criteria.
    */
  var filters: js.UndefOr[EntityFilters] = js.native
  
  /**
    * The maximum number of results to return in the response.
    */
  var maxResults: js.UndefOr[MaxResults] = js.native
  
  /**
    * The version of the user's namespace. Defaults to the latest version of the user's namespace.
    */
  var namespaceVersion: js.UndefOr[Version] = js.native
  
  /**
    * The string that specifies the next page of results. Use this when you're paginating results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}
object SearchEntitiesRequest {
  
  @scala.inline
  def apply(entityTypes: EntityTypes): SearchEntitiesRequest = {
    val __obj = js.Dynamic.literal(entityTypes = entityTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchEntitiesRequest]
  }
  
  @scala.inline
  implicit class SearchEntitiesRequestMutableBuilder[Self <: SearchEntitiesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntityTypes(value: EntityTypes): Self = StObject.set(x, "entityTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntityTypesVarargs(value: EntityType*): Self = StObject.set(x, "entityTypes", js.Array(value :_*))
    
    @scala.inline
    def setFilters(value: EntityFilters): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    @scala.inline
    def setFiltersVarargs(value: EntityFilter*): Self = StObject.set(x, "filters", js.Array(value :_*))
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    @scala.inline
    def setNamespaceVersion(value: Version): Self = StObject.set(x, "namespaceVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamespaceVersionUndefined: Self = StObject.set(x, "namespaceVersion", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
