package typingsSlinky.couchbase.mod.SearchQuery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("couchbase", "SearchQuery.QueryStringQuery")
@js.native
abstract class QueryStringQuery () extends Query {
  
  /**
    * Defines the amount to boost the query.
    * @param boost Amount to boost the query.
    */
  def boost(boost: Double): this.type = js.native
}
