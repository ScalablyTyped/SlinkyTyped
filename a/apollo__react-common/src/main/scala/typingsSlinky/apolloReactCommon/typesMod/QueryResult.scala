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

@js.native
trait QueryResult[TData, TVariables] extends ObservableQueryFields[TData, TVariables] {
  var called: Boolean = js.native
  var client: default[_] = js.native
  var data: js.UndefOr[TData] = js.native
  var error: js.UndefOr[ApolloError] = js.native
  var loading: Boolean = js.native
  var networkStatus: NetworkStatus = js.native
}

object QueryResult {
  @scala.inline
  def apply[TData, TVariables](
    called: Boolean,
    client: default[_],
    fetchMore: (js.Function1[
      /* fetchMoreOptions */ (FetchMoreQueryOptions[TVariables, /* keyof TVariables */ String]) with (FetchMoreOptions[TData, TVariables]), 
      js.Promise[ApolloQueryResult[TData]]
    ]) with (js.Function1[
      /* fetchMoreOptions */ AnonQuery with (FetchMoreQueryOptions[_, /* keyof any */ String]) with (FetchMoreOptions[_, _]), 
      js.Promise[ApolloQueryResult[_]]
    ]),
    loading: Boolean,
    networkStatus: NetworkStatus,
    refetch: () => js.Promise[ApolloQueryResult[TData]],
    startPolling: /* pollInterval */ Double => Unit,
    stopPolling: () => Unit,
    subscribeToMore: /* options */ SubscribeToMoreOptions[TData, TVariables, TData] => js.Function0[Unit],
    updateQuery: /* mapFn */ js.Function2[TData, /* options */ UpdateQueryOptions[TVariables], TData] => Unit,
    variables: TVariables
  ): QueryResult[TData, TVariables] = {
    val __obj = js.Dynamic.literal(called = called.asInstanceOf[js.Any], client = client.asInstanceOf[js.Any], fetchMore = fetchMore.asInstanceOf[js.Any], loading = loading.asInstanceOf[js.Any], networkStatus = networkStatus.asInstanceOf[js.Any], refetch = js.Any.fromFunction0(refetch), startPolling = js.Any.fromFunction1(startPolling), stopPolling = js.Any.fromFunction0(stopPolling), subscribeToMore = js.Any.fromFunction1(subscribeToMore), updateQuery = js.Any.fromFunction1(updateQuery), variables = variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryResult[TData, TVariables]]
  }
  @scala.inline
  implicit class QueryResultOps[Self[tdata, tvariables] <: QueryResult[tdata, tvariables], TData, TVariables] (val x: Self[TData, TVariables]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TData, TVariables] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TData, TVariables]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[TData, TVariables]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[TData, TVariables]) with Other]
    @scala.inline
    def withCalled(value: Boolean): Self[TData, TVariables] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("called")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClient(value: default[_]): Self[TData, TVariables] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoading(value: Boolean): Self[TData, TVariables] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loading")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNetworkStatus(value: NetworkStatus): Self[TData, TVariables] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withData(value: TData): Self[TData, TVariables] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self[TData, TVariables] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withError(value: ApolloError): Self[TData, TVariables] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutError: Self[TData, TVariables] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.undefined)
        ret
    }
  }
  
}

