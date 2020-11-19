package typingsSlinky.apolloClient.queriesMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.apolloClient.anon.FetchMoreForQueryId
import typingsSlinky.graphql.executeMod.ExecutionResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("apollo-client/data/queries", "QueryStore")
@js.native
class QueryStore () extends js.Object {
  
  def get(queryId: String): QueryStoreValue = js.native
  
  def getStore(): StringDictionary[QueryStoreValue] = js.native
  
  def initQuery(query: FetchMoreForQueryId): Unit = js.native
  
  def markQueryError(queryId: String, error: js.Error): Unit = js.native
  def markQueryError(queryId: String, error: js.Error, fetchMoreForQueryId: String): Unit = js.native
  
  def markQueryResult(queryId: String, result: ExecutionResult[StringDictionary[_], StringDictionary[_]]): Unit = js.native
  def markQueryResult(
    queryId: String,
    result: ExecutionResult[StringDictionary[_], StringDictionary[_]],
    fetchMoreForQueryId: String
  ): Unit = js.native
  
  def markQueryResultClient(queryId: String, complete: Boolean): Unit = js.native
  
  def reset(observableQueryIds: js.Array[String]): Unit = js.native
  
  def stopQuery(queryId: String): Unit = js.native
  
  var store: js.Any = js.native
}
