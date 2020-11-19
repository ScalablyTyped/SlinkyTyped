package typingsSlinky.apolloReactHoc.typesMod

import typingsSlinky.apolloClient.mod.ApolloError
import typingsSlinky.apolloClient.observableQueryMod.FetchMoreOptions
import typingsSlinky.apolloClient.observableQueryMod.UpdateQueryOptions
import typingsSlinky.apolloClient.typesMod.ApolloQueryResult
import typingsSlinky.apolloClient.typesMod.OperationVariables
import typingsSlinky.apolloClient.watchQueryOptionsMod.FetchMoreQueryOptions
import typingsSlinky.apolloClient.watchQueryOptionsMod.SubscribeToMoreOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueryControls[TData, TGraphQLVariables] extends js.Object {
  
  var error: js.UndefOr[ApolloError] = js.native
  
  def fetchMore(
    fetchMoreOptions: (FetchMoreQueryOptions[TGraphQLVariables, _]) with (FetchMoreOptions[TData, TGraphQLVariables])
  ): js.Promise[ApolloQueryResult[TData]] = js.native
  
  var loading: Boolean = js.native
  
  var networkStatus: Double = js.native
  
  def refetch(): js.Promise[ApolloQueryResult[TData]] = js.native
  def refetch(variables: TGraphQLVariables): js.Promise[ApolloQueryResult[TData]] = js.native
  
  def startPolling(pollInterval: Double): Unit = js.native
  
  def stopPolling(): Unit = js.native
  
  def subscribeToMore(options: SubscribeToMoreOptions[_, OperationVariables, _]): js.Function0[Unit] = js.native
  
  def updateQuery(mapFn: js.Function2[/* previousQueryResult */ js.Any, /* options */ UpdateQueryOptions[_], _]): Unit = js.native
  
  var variables: TGraphQLVariables = js.native
}
