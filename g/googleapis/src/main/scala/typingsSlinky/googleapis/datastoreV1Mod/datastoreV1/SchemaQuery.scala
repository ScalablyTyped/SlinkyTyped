package typingsSlinky.googleapis.datastoreV1Mod.datastoreV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A query for entities.
  */
@js.native
trait SchemaQuery extends StObject {
  
  /**
    * The properties to make distinct. The query results will contain the first
    * result for each distinct combination of values for the given properties
    * (if empty, all results are returned).
    */
  var distinctOn: js.UndefOr[js.Array[SchemaPropertyReference]] = js.native
  
  /**
    * An ending point for the query results. Query cursors are returned in
    * query result batches and [can only be used to limit the same
    * query](https://cloud.google.com/datastore/docs/concepts/queries#cursors_limits_and_offsets).
    */
  var endCursor: js.UndefOr[String] = js.native
  
  /**
    * The filter to apply.
    */
  var filter: js.UndefOr[SchemaFilter] = js.native
  
  /**
    * The kinds to query (if empty, returns entities of all kinds). Currently
    * at most 1 kind may be specified.
    */
  var kind: js.UndefOr[js.Array[SchemaKindExpression]] = js.native
  
  /**
    * The maximum number of results to return. Applies after all other
    * constraints. Optional. Unspecified is interpreted as no limit. Must be
    * &gt;= 0 if specified.
    */
  var limit: js.UndefOr[Double] = js.native
  
  /**
    * The number of results to skip. Applies before limit, but after all other
    * constraints. Optional. Must be &gt;= 0 if specified.
    */
  var offset: js.UndefOr[Double] = js.native
  
  /**
    * The order to apply to the query results (if empty, order is unspecified).
    */
  var order: js.UndefOr[js.Array[SchemaPropertyOrder]] = js.native
  
  /**
    * The projection to return. Defaults to returning all properties.
    */
  var projection: js.UndefOr[js.Array[SchemaProjection]] = js.native
  
  /**
    * A starting point for the query results. Query cursors are returned in
    * query result batches and [can only be used to continue the same
    * query](https://cloud.google.com/datastore/docs/concepts/queries#cursors_limits_and_offsets).
    */
  var startCursor: js.UndefOr[String] = js.native
}
object SchemaQuery {
  
  @scala.inline
  def apply(): SchemaQuery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaQuery]
  }
  
  @scala.inline
  implicit class SchemaQueryMutableBuilder[Self <: SchemaQuery] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDistinctOn(value: js.Array[SchemaPropertyReference]): Self = StObject.set(x, "distinctOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistinctOnUndefined: Self = StObject.set(x, "distinctOn", js.undefined)
    
    @scala.inline
    def setDistinctOnVarargs(value: SchemaPropertyReference*): Self = StObject.set(x, "distinctOn", js.Array(value :_*))
    
    @scala.inline
    def setEndCursor(value: String): Self = StObject.set(x, "endCursor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndCursorUndefined: Self = StObject.set(x, "endCursor", js.undefined)
    
    @scala.inline
    def setFilter(value: SchemaFilter): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    @scala.inline
    def setKind(value: js.Array[SchemaKindExpression]): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setKindVarargs(value: SchemaKindExpression*): Self = StObject.set(x, "kind", js.Array(value :_*))
    
    @scala.inline
    def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    @scala.inline
    def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    @scala.inline
    def setOrder(value: js.Array[SchemaPropertyOrder]): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    
    @scala.inline
    def setOrderVarargs(value: SchemaPropertyOrder*): Self = StObject.set(x, "order", js.Array(value :_*))
    
    @scala.inline
    def setProjection(value: js.Array[SchemaProjection]): Self = StObject.set(x, "projection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectionUndefined: Self = StObject.set(x, "projection", js.undefined)
    
    @scala.inline
    def setProjectionVarargs(value: SchemaProjection*): Self = StObject.set(x, "projection", js.Array(value :_*))
    
    @scala.inline
    def setStartCursor(value: String): Self = StObject.set(x, "startCursor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartCursorUndefined: Self = StObject.set(x, "startCursor", js.undefined)
  }
}
