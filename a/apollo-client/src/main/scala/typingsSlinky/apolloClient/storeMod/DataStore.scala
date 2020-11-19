package typingsSlinky.apolloClient.storeMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.apolloCache.mod.ApolloCache
import typingsSlinky.apolloClient.anon.MutationId
import typingsSlinky.apolloClient.anon.OptimisticResponse
import typingsSlinky.apolloClient.anon.Result
import typingsSlinky.graphql.astMod.DocumentNode
import typingsSlinky.graphql.executeMod.ExecutionResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("apollo-client/data/store", "DataStore")
@js.native
class DataStore[TSerialized] protected () extends js.Object {
  def this(initialCache: ApolloCache[TSerialized]) = this()
  
  var cache: js.Any = js.native
  
  def getCache(): ApolloCache[TSerialized] = js.native
  
  def markMutationComplete(hasMutationIdOptimisticResponse: OptimisticResponse): Unit = js.native
  
  def markMutationInit(mutation: MutationId): Unit = js.native
  
  def markMutationResult(mutation: Result): Unit = js.native
  
  def markQueryResult(
    result: ExecutionResult[StringDictionary[_], StringDictionary[_]],
    document: DocumentNode,
    variables: js.Any
  ): Unit = js.native
  def markQueryResult(
    result: ExecutionResult[StringDictionary[_], StringDictionary[_]],
    document: DocumentNode,
    variables: js.Any,
    fetchMoreForQueryId: js.UndefOr[scala.Nothing],
    ignoreErrors: Boolean
  ): Unit = js.native
  def markQueryResult(
    result: ExecutionResult[StringDictionary[_], StringDictionary[_]],
    document: DocumentNode,
    variables: js.Any,
    fetchMoreForQueryId: String
  ): Unit = js.native
  def markQueryResult(
    result: ExecutionResult[StringDictionary[_], StringDictionary[_]],
    document: DocumentNode,
    variables: js.Any,
    fetchMoreForQueryId: String,
    ignoreErrors: Boolean
  ): Unit = js.native
  
  def markSubscriptionResult(
    result: ExecutionResult[StringDictionary[_], StringDictionary[_]],
    document: DocumentNode,
    variables: js.Any
  ): Unit = js.native
  
  def markUpdateQueryResult(document: DocumentNode, variables: js.Any, newResult: js.Any): Unit = js.native
  
  def reset(): js.Promise[Unit] = js.native
}
