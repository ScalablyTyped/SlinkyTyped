package typingsSlinky.apolloClient.queriesMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.apolloClient.anon.FetchMoreForQueryId
import typingsSlinky.graphql.executeMod.ExecutionResult
import typingsSlinky.graphql.executeMod.ExecutionResultDataDefault
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-client/data/queries", "QueryStore")
@js.native
class QueryStore () extends js.Object {
  var store: js.Any = js.native
  def get(queryId: String): QueryStoreValue = js.native
  def getStore(): StringDictionary[QueryStoreValue] = js.native
  def initQuery(query: FetchMoreForQueryId): Unit = js.native
  def markQueryError(queryId: String, error: js.Error): Unit = js.native
  def markQueryError(queryId: String, error: js.Error, fetchMoreForQueryId: String): Unit = js.native
  def markQueryResult(queryId: String, result: ExecutionResult[ExecutionResultDataDefault]): Unit = js.native
  def markQueryResult(queryId: String, result: ExecutionResult[ExecutionResultDataDefault], fetchMoreForQueryId: String): Unit = js.native
  def markQueryResultClient(queryId: String, complete: Boolean): Unit = js.native
  def reset(observableQueryIds: js.Array[String]): Unit = js.native
  def stopQuery(queryId: String): Unit = js.native
}

