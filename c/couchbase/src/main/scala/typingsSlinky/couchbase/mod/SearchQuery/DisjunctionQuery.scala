package typingsSlinky.couchbase.mod.SearchQuery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("couchbase", "SearchQuery.DisjunctionQuery")
@js.native
abstract class DisjunctionQuery () extends Query {
  
  /**
    * Defines the amount to boost the query.
    * @param boost Amount to boost the query.
    */
  def boost(boost: Double): this.type = js.native
  
  /**
    * Specifies additional predicate queries.
    * @param queries Additional predicate queries.
    */
  def or(queries: Query*): this.type = js.native
  /**
    * Specifies additional predicate queries.
    * @param queries Additional predicate queries.
    */
  def or(queries: js.Array[Query]): this.type = js.native
}
