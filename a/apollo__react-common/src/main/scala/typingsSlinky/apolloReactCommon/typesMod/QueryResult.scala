package typingsSlinky.apolloReactCommon.typesMod

import typingsSlinky.apolloClient.mod.ApolloError
import typingsSlinky.apolloClient.mod.default
import typingsSlinky.apolloClient.networkStatusMod.NetworkStatus
import typingsSlinky.apolloClient.observableQueryMod.FetchMoreOptions
import typingsSlinky.apolloClient.observableQueryMod.UpdateQueryOptions
import typingsSlinky.apolloClient.typesMod.ApolloQueryResult
import typingsSlinky.apolloClient.watchQueryOptionsMod.FetchMoreQueryOptions
import typingsSlinky.apolloClient.watchQueryOptionsMod.SubscribeToMoreOptions
import typingsSlinky.apolloReactCommon.AnonQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryResult[TData, TVariables] extends ObservableQueryFields[TData, TVariables] {
  var called: Boolean
  var client: default[_]
  var data: js.UndefOr[TData] = js.undefined
  var error: js.UndefOr[ApolloError] = js.undefined
  var loading: Boolean
  var networkStatus: NetworkStatus
}

object QueryResult {
  @scala.inline
  def apply[TData, TVariables](
    called: Boolean,
    client: default[_],
    fetchMore: (js.Function1[
      /* fetchMoreOptions */ (FetchMoreQueryOptions[TVariables, String]) with (FetchMoreOptions[TData, TVariables]), 
      js.Promise[ApolloQueryResult[TData]]
    ]) with (js.Function1[
      /* fetchMoreOptions */ AnonQuery with (FetchMoreQueryOptions[_, String]) with (FetchMoreOptions[_, _]), 
      js.Promise[ApolloQueryResult[_]]
    ]),
    loading: Boolean,
    networkStatus: NetworkStatus,
    refetch: () => js.Promise[ApolloQueryResult[TData]],
    startPolling: /* pollInterval */ Double => Unit,
    stopPolling: () => Unit,
    subscribeToMore: /* options */ SubscribeToMoreOptions[TData, TVariables, TData] => js.Function0[Unit],
    updateQuery: /* mapFn */ js.Function2[TData, /* options */ UpdateQueryOptions[TVariables], TData] => Unit,
    variables: TVariables,
    data: TData = null,
    error: ApolloError = null
  ): QueryResult[TData, TVariables] = {
    val __obj = js.Dynamic.literal(called = called.asInstanceOf[js.Any], client = client.asInstanceOf[js.Any], fetchMore = fetchMore.asInstanceOf[js.Any], loading = loading.asInstanceOf[js.Any], networkStatus = networkStatus.asInstanceOf[js.Any], refetch = js.Any.fromFunction0(refetch), startPolling = js.Any.fromFunction1(startPolling), stopPolling = js.Any.fromFunction0(stopPolling), subscribeToMore = js.Any.fromFunction1(subscribeToMore), updateQuery = js.Any.fromFunction1(updateQuery), variables = variables.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryResult[TData, TVariables]]
  }
}

