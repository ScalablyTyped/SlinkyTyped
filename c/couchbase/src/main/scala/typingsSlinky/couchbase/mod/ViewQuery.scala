package typingsSlinky.couchbase.mod

import typingsSlinky.couchbase.mod.ViewQuery.ErrorMode
import typingsSlinky.couchbase.mod.ViewQuery.Order
import typingsSlinky.couchbase.mod.ViewQuery.Update
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Class for dynamically construction of view queries. This class should never be constructed directly, instead you should use ViewQuery.from to construct this object.
  */
@JSImport("couchbase", "ViewQuery")
@js.native
class ViewQuery () extends StObject {
  
  /**
    * Allows you to specify custom view options that may not be available though the fluent interface defined by this class.
    * @param opts
    */
  def custom(opts: js.Any): ViewQuery = js.native
  
  /**
    * Specifies the design document and view name to use for this query.
    * @param ddoc The design document to use.
    * @param name The view to use.
    */
  def from(ddoc: String, name: String): ViewQuery = js.native
  
  /**
    * Flag to request a view request accross all nodes in the case of a development view.
    * @param full_set
    */
  def full_set(full_set: Boolean): ViewQuery = js.native
  
  /**
    * Specifies whether to preform grouping during view execution.
    * @param group
    */
  def group(group: Boolean): ViewQuery = js.native
  
  /**
    * Specifies the level at which to perform view grouping.
    * @param group_level
    */
  def group_level(group_level: Double): ViewQuery = js.native
  
  /**
    * Specifies a range of document id's to retrieve from the index.
    * @param start
    * @param end
    */
  def id_range(start: js.Any, end: js.Any): ViewQuery = js.native
  
  /**
    * Flag to request a view request include the full document value.
    * @param include_docs
    */
  def include_docs(include_docs: Boolean): ViewQuery = js.native
  
  /**
    * Specifies a specified key to retrieve from the index.
    * @param key
    */
  def key(key: js.Any): ViewQuery = js.native
  
  /**
    * Specifies a list of keys you wish to retrieve from the index.
    * @param keys
    */
  def keys(key: js.Array[_]): ViewQuery = js.native
  
  /**
    * Specifies the maximum number of results to return.
    * @param limit
    */
  def limit(limit: Double): ViewQuery = js.native
  
  /**
    * Sets the error handling mode for this query.
    * @param mode
    */
  def on_error(mode: ErrorMode): ViewQuery = js.native
  
  /**
    * Specifies the desired ordering for the results.
    * @param order
    */
  def order(order: Order): ViewQuery = js.native
  
  /**
    * Specifies a range of keys to retrieve from the index. You may specify both a start and an end point and additionally specify whether or not the end value is inclusive or exclusive.
    * @param start
    * @param end
    * @param inclusive_end
    */
  def range(start: js.Any, end: js.Any): ViewQuery = js.native
  def range(start: js.Any, end: js.Any, inclusive_end: Boolean): ViewQuery = js.native
  def range(start: js.Any, end: js.Array[_]): ViewQuery = js.native
  def range(start: js.Any, end: js.Array[_], inclusive_end: Boolean): ViewQuery = js.native
  def range(start: js.Array[_], end: js.Any): ViewQuery = js.native
  def range(start: js.Array[_], end: js.Any, inclusive_end: Boolean): ViewQuery = js.native
  def range(start: js.Array[_], end: js.Array[_]): ViewQuery = js.native
  def range(start: js.Array[_], end: js.Array[_], inclusive_end: Boolean): ViewQuery = js.native
  
  /**
    * Specifies whether to execute the map-reduce reduce step.
    * @param reduce
    */
  def reduce(reduce: Boolean): ViewQuery = js.native
  
  /**
    * Specifies how many results to skip from the beginning of the result set.
    * @param skip
    */
  def skip(skip: Double): ViewQuery = js.native
  
  /**
    * Specifies how this query will affect view indexing, both before and after the query is executed.
    * @param stale
    */
  def stale(stale: Update): ViewQuery = js.native
}
object ViewQuery {
  
  @js.native
  sealed trait ErrorMode extends StObject
  /**
    * Enumeration for specifying on_error behaviour.
    */
  @JSImport("couchbase", "ViewQuery.ErrorMode")
  @js.native
  object ErrorMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ErrorMode with Double] = js.native
    
    /**
      * Continues querying when an error occurs.
      */
    @js.native
    sealed trait CONTINUE extends ErrorMode
    /* 0 */ val CONTINUE: typingsSlinky.couchbase.mod.ViewQuery.ErrorMode.CONTINUE with Double = js.native
    
    /**
      * Stops and errors query when an error occurs.
      */
    @js.native
    sealed trait STOP extends ErrorMode
    /* 1 */ val STOP: typingsSlinky.couchbase.mod.ViewQuery.ErrorMode.STOP with Double = js.native
  }
  
  @js.native
  sealed trait Order extends StObject
  /**
    * Enumeration for specifying view result ordering.
    */
  @JSImport("couchbase", "ViewQuery.Order")
  @js.native
  object Order extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Order with Double] = js.native
    
    /**
      * Orders with lower values first and higher values last.
      */
    @js.native
    sealed trait ASCENDING extends Order
    /* 0 */ val ASCENDING: typingsSlinky.couchbase.mod.ViewQuery.Order.ASCENDING with Double = js.native
    
    /**
      * Orders with higher values first and lower values last.
      */
    @js.native
    sealed trait DESCENDING extends Order
    /* 1 */ val DESCENDING: typingsSlinky.couchbase.mod.ViewQuery.Order.DESCENDING with Double = js.native
  }
  
  @js.native
  sealed trait Update extends StObject
  /**
    * Enumeration for specifying view update semantics.
    */
  @JSImport("couchbase", "ViewQuery.Update")
  @js.native
  object Update extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Update with Double] = js.native
    
    /**
      * Forces the view to be indexed after the results of this query has been fetched.
      */
    @js.native
    sealed trait AFTER extends Update
    /* 2 */ val AFTER: typingsSlinky.couchbase.mod.ViewQuery.Update.AFTER with Double = js.native
    
    /**
      * Causes the view to be fully indexed before results are retrieved.
      */
    @js.native
    sealed trait BEFORE extends Update
    /* 0 */ val BEFORE: typingsSlinky.couchbase.mod.ViewQuery.Update.BEFORE with Double = js.native
    
    /**
      * Allows the index to stay in whatever state it is already in prior retrieval of the query results.
      */
    @js.native
    sealed trait NONE extends Update
    /* 1 */ val NONE: typingsSlinky.couchbase.mod.ViewQuery.Update.NONE with Double = js.native
  }
  
  /**
    * Instantiates a ViewQuery object for the specified design document and view name.
    * @param ddoc The design document to use.
    * @param name The view to use.
    */
  /* static member */
  @JSImport("couchbase", "ViewQuery.from")
  @js.native
  def from(ddoc: String, name: String): ViewQuery = js.native
}
