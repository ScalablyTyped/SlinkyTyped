package typingsSlinky.apolloReactCommon.typesMod

import typingsSlinky.apolloClient.observableQueryMod.FetchMoreOptions
import typingsSlinky.apolloClient.observableQueryMod.UpdateQueryOptions
import typingsSlinky.apolloClient.typesMod.ApolloQueryResult
import typingsSlinky.apolloClient.watchQueryOptionsMod.FetchMoreQueryOptions
import typingsSlinky.apolloClient.watchQueryOptionsMod.SubscribeToMoreOptions
import typingsSlinky.apolloReactCommon.anon.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<apollo-client.apollo-client.ObservableQuery<TData, TVariables>, 'startPolling' | 'stopPolling' | 'subscribeToMore' | 'updateQuery' | 'refetch' | 'variables'> & {  fetchMore  :<K extends keyof TVariables>(fetchMoreOptions : apollo-client.apollo-client.FetchMoreQueryOptions<TVariables, K> & apollo-client.apollo-client.FetchMoreOptions<TData, TVariables>): std.Promise<apollo-client.apollo-client.ApolloQueryResult<TData>> & <TData2, TVariables2, K extends keyof TVariables2>(fetchMoreOptions : {  query ? :graphql.graphql.DocumentNode} & apollo-client.apollo-client.FetchMoreQueryOptions<TVariables2, K> & apollo-client.apollo-client.FetchMoreOptions<TData2, TVariables2>): std.Promise<apollo-client.apollo-client.ApolloQueryResult<TData2>>} */
@js.native
trait ObservableQueryFields[TData, TVariables] extends js.Object {
  var fetchMore: (js.Function1[
    /* fetchMoreOptions */ (FetchMoreQueryOptions[TVariables, /* keyof TVariables */ String]) with (FetchMoreOptions[TData, TVariables]), 
    js.Promise[ApolloQueryResult[TData]]
  ]) with (js.Function1[
    /* fetchMoreOptions */ Query with (FetchMoreQueryOptions[_, /* keyof any */ String]) with (FetchMoreOptions[_, _]), 
    js.Promise[ApolloQueryResult[_]]
  ]) = js.native
  var refetch: js.Function0[js.Promise[ApolloQueryResult[TData]]] = js.native
  var startPolling: js.Function1[/* pollInterval */ Double, Unit] = js.native
  var stopPolling: js.Function0[Unit] = js.native
  var subscribeToMore: js.Function1[/* options */ SubscribeToMoreOptions[TData, TVariables, TData], js.Function0[Unit]] = js.native
  var updateQuery: js.Function1[
    /* mapFn */ js.Function2[/* previousQueryResult */ TData, /* options */ UpdateQueryOptions[TVariables], TData], 
    Unit
  ] = js.native
  var variables: TVariables = js.native
}

object ObservableQueryFields {
  @scala.inline
  def apply[TData, TVariables](
    fetchMore: (js.Function1[
      /* fetchMoreOptions */ (FetchMoreQueryOptions[TVariables, /* keyof TVariables */ String]) with (FetchMoreOptions[TData, TVariables]), 
      js.Promise[ApolloQueryResult[TData]]
    ]) with (js.Function1[
      /* fetchMoreOptions */ Query with (FetchMoreQueryOptions[_, /* keyof any */ String]) with (FetchMoreOptions[_, _]), 
      js.Promise[ApolloQueryResult[_]]
    ]),
    refetch: () => js.Promise[ApolloQueryResult[TData]],
    startPolling: /* pollInterval */ Double => Unit,
    stopPolling: () => Unit,
    subscribeToMore: /* options */ SubscribeToMoreOptions[TData, TVariables, TData] => js.Function0[Unit],
    updateQuery: /* mapFn */ js.Function2[/* previousQueryResult */ TData, /* options */ UpdateQueryOptions[TVariables], TData] => Unit,
    variables: TVariables
  ): ObservableQueryFields[TData, TVariables] = {
    val __obj = js.Dynamic.literal(fetchMore = fetchMore.asInstanceOf[js.Any], refetch = js.Any.fromFunction0(refetch), startPolling = js.Any.fromFunction1(startPolling), stopPolling = js.Any.fromFunction0(stopPolling), subscribeToMore = js.Any.fromFunction1(subscribeToMore), updateQuery = js.Any.fromFunction1(updateQuery), variables = variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObservableQueryFields[TData, TVariables]]
  }
  @scala.inline
  implicit class ObservableQueryFieldsOps[Self[tdata, tvariables] <: ObservableQueryFields[tdata, tvariables], TData, TVariables] (val x: Self[TData, TVariables]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TData, TVariables] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TData, TVariables]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[TData, TVariables]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[TData, TVariables]) with Other]
    @scala.inline
    def withFetchMore(
      value: (js.Function1[
          /* fetchMoreOptions */ (FetchMoreQueryOptions[TVariables, /* keyof TVariables */ String]) with (FetchMoreOptions[TData, TVariables]), 
          js.Promise[ApolloQueryResult[TData]]
        ]) with (js.Function1[
          /* fetchMoreOptions */ Query with (FetchMoreQueryOptions[_, /* keyof any */ String]) with (FetchMoreOptions[_, _]), 
          js.Promise[ApolloQueryResult[_]]
        ])
    ): Self[TData, TVariables] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetchMore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRefetch(value: () => js.Promise[ApolloQueryResult[TData]]): Self[TData, TVariables] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refetch")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withStartPolling(value: /* pollInterval */ Double => Unit): Self[TData, TVariables] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startPolling")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStopPolling(value: () => Unit): Self[TData, TVariables] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopPolling")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSubscribeToMore(value: /* options */ SubscribeToMoreOptions[TData, TVariables, TData] => js.Function0[Unit]): Self[TData, TVariables] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscribeToMore")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdateQuery(
      value: /* mapFn */ js.Function2[/* previousQueryResult */ TData, /* options */ UpdateQueryOptions[TVariables], TData] => Unit
    ): Self[TData, TVariables] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateQuery")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withVariables(value: TVariables): Self[TData, TVariables] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variables")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

