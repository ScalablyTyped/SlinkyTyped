package typingsSlinky.atApolloReactDashHoc.libTypesMod

import typingsSlinky.apolloDashClient.apolloDashClientMod.ApolloError
import typingsSlinky.apolloDashClient.coreObservableQueryMod.FetchMoreOptions
import typingsSlinky.apolloDashClient.coreObservableQueryMod.UpdateQueryOptions
import typingsSlinky.apolloDashClient.coreTypesMod.ApolloQueryResult
import typingsSlinky.apolloDashClient.coreTypesMod.OperationVariables
import typingsSlinky.apolloDashClient.coreWatchQueryOptionsMod.FetchMoreQueryOptions
import typingsSlinky.apolloDashClient.coreWatchQueryOptionsMod.SubscribeToMoreOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryControls[TData, TGraphQLVariables] extends js.Object {
  var error: js.UndefOr[ApolloError] = js.native
  var loading: Boolean = js.native
  var networkStatus: Double = js.native
  var variables: TGraphQLVariables = js.native
  def fetchMore(
    fetchMoreOptions: (FetchMoreQueryOptions[TGraphQLVariables, _]) with (FetchMoreOptions[TData, TGraphQLVariables])
  ): js.Promise[ApolloQueryResult[TData]] = js.native
  def refetch(): js.Promise[ApolloQueryResult[TData]] = js.native
  def refetch(variables: TGraphQLVariables): js.Promise[ApolloQueryResult[TData]] = js.native
  def startPolling(pollInterval: Double): Unit = js.native
  def stopPolling(): Unit = js.native
  def subscribeToMore(options: SubscribeToMoreOptions[_, OperationVariables, _]): js.Function0[Unit] = js.native
  def updateQuery(mapFn: js.Function2[/* previousQueryResult */ js.Any, /* options */ UpdateQueryOptions[_], _]): Unit = js.native
}

