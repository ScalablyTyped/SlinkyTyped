package typingsSlinky.awsSdk.athenaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StopQueryExecutionInput extends js.Object {
  /**
    * The unique ID of the query execution to stop.
    */
  var QueryExecutionId: typingsSlinky.awsSdk.athenaMod.QueryExecutionId = js.native
}

object StopQueryExecutionInput {
  @scala.inline
  def apply(QueryExecutionId: QueryExecutionId): StopQueryExecutionInput = {
    val __obj = js.Dynamic.literal(QueryExecutionId = QueryExecutionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopQueryExecutionInput]
  }
}

