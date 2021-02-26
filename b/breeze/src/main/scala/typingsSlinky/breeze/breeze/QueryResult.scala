package typingsSlinky.breeze.breeze

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueryResult extends StObject {
  
  /** EntityManager that executed the query */
  var entityManager: js.UndefOr[EntityManager] = js.native
  
  /** Raw response from the server */
  var httpResponse: HttpResponse = js.native
  
  /** Total number of results available on the server */
  var inlineCount: js.UndefOr[Double] = js.native
  
  /** Query that was executed */
  var query: EntityQuery = js.native
  
  /** Top level entities returned */
  var results: js.Array[Entity] = js.native
  
  /** All entities returned by the query.  Differs from results when an expand is used. */
  var retrievedEntities: js.UndefOr[js.Array[Entity]] = js.native
}
object QueryResult {
  
  @scala.inline
  def apply(httpResponse: HttpResponse, query: EntityQuery, results: js.Array[Entity]): QueryResult = {
    val __obj = js.Dynamic.literal(httpResponse = httpResponse.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryResult]
  }
  
  @scala.inline
  implicit class QueryResultMutableBuilder[Self <: QueryResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntityManager(value: EntityManager): Self = StObject.set(x, "entityManager", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntityManagerUndefined: Self = StObject.set(x, "entityManager", js.undefined)
    
    @scala.inline
    def setHttpResponse(value: HttpResponse): Self = StObject.set(x, "httpResponse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInlineCount(value: Double): Self = StObject.set(x, "inlineCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInlineCountUndefined: Self = StObject.set(x, "inlineCount", js.undefined)
    
    @scala.inline
    def setQuery(value: EntityQuery): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResults(value: js.Array[Entity]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultsVarargs(value: Entity*): Self = StObject.set(x, "results", js.Array(value :_*))
    
    @scala.inline
    def setRetrievedEntities(value: js.Array[Entity]): Self = StObject.set(x, "retrievedEntities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetrievedEntitiesUndefined: Self = StObject.set(x, "retrievedEntities", js.undefined)
    
    @scala.inline
    def setRetrievedEntitiesVarargs(value: Entity*): Self = StObject.set(x, "retrievedEntities", js.Array(value :_*))
  }
}
