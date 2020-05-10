package typingsSlinky.apolloReactCommon.typesMod

import typingsSlinky.apolloCache.dataProxyMod.DataProxy
import typingsSlinky.apolloClient.mod.ApolloError
import typingsSlinky.apolloClient.mod.default
import typingsSlinky.apolloClient.typesMod.PureQueryOptions
import typingsSlinky.apolloClient.watchQueryOptionsMod.ErrorPolicy
import typingsSlinky.apolloClient.watchQueryOptionsMod.MutationUpdaterFn
import typingsSlinky.apolloClient.watchQueryOptionsMod.WatchQueryFetchPolicy
import typingsSlinky.apolloLink.typesMod.FetchResult
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseMutationOptions[TData, TVariables] extends js.Object {
  var awaitRefetchQueries: js.UndefOr[Boolean] = js.native
  var client: js.UndefOr[default[js.Object]] = js.native
  var context: js.UndefOr[Context] = js.native
  var errorPolicy: js.UndefOr[ErrorPolicy] = js.native
  var fetchPolicy: js.UndefOr[WatchQueryFetchPolicy] = js.native
  var ignoreResults: js.UndefOr[Boolean] = js.native
  var notifyOnNetworkStatusChange: js.UndefOr[Boolean] = js.native
  var onCompleted: js.UndefOr[js.Function1[/* data */ TData, Unit]] = js.native
  var onError: js.UndefOr[js.Function1[/* error */ ApolloError, Unit]] = js.native
  var optimisticResponse: js.UndefOr[TData | (js.Function1[/* vars */ TVariables, TData])] = js.native
  var refetchQueries: js.UndefOr[(js.Array[String | PureQueryOptions]) | RefetchQueriesFunction] = js.native
  var update: js.UndefOr[MutationUpdaterFn[TData]] = js.native
  var variables: js.UndefOr[TVariables] = js.native
}

object BaseMutationOptions {
  @scala.inline
  def apply[TData, TVariables](): BaseMutationOptions[TData, TVariables] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseMutationOptions[TData, TVariables]]
  }
  @scala.inline
  implicit class BaseMutationOptionsOps[Self[tdata, tvariables] <: BaseMutationOptions[tdata, tvariables], TData, TVariables] (val x: Self[TData, TVariables]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TData, TVariables] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TData, TVariables]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[TData, TVariables]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[TData, TVariables]) with Other]
    @scala.inline
    def withAwaitRefetchQueries(value: Boolean): Self[TData, TVariables] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("awaitRefetchQueries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAwaitRefetchQueries: Self[TData, TVariables] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("awaitRefetchQueries")(js.undefined)
        ret
    }
    @scala.inline
    def withClient(value: default[js.Object]): Self[TData, TVariables] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClient: Self[TData, TVariables] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client")(js.undefined)
        ret
    }
    @scala.inline
    def withContext(value: Context): Self[TData, TVariables] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContext: Self[TData, TVariables] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorPolicy(value: ErrorPolicy): Self[TData, TVariables] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorPolicy: Self[TData, TVariables] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorPolicy")(js.undefined)
        ret
    }
    @scala.inline
    def withFetchPolicy(value: WatchQueryFetchPolicy): Self[TData, TVariables] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetchPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFetchPolicy: Self[TData, TVariables] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetchPolicy")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreResults(value: Boolean): Self[TData, TVariables] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreResults: Self[TData, TVariables] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreResults")(js.undefined)
        ret
    }
    @scala.inline
    def withNotifyOnNetworkStatusChange(value: Boolean): Self[TData, TVariables] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notifyOnNetworkStatusChange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotifyOnNetworkStatusChange: Self[TData, TVariables] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notifyOnNetworkStatusChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCompleted(value: /* data */ TData => Unit): Self[TData, TVariables] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCompleted")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnCompleted: Self[TData, TVariables] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCompleted")(js.undefined)
        ret
    }
    @scala.inline
    def withOnError(value: /* error */ ApolloError => Unit): Self[TData, TVariables] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onError")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnError: Self[TData, TVariables] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onError")(js.undefined)
        ret
    }
    @scala.inline
    def withOptimisticResponseFunction1(value: /* vars */ TVariables => TData): Self[TData, TVariables] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optimisticResponse")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOptimisticResponse(value: TData | (js.Function1[/* vars */ TVariables, TData])): Self[TData, TVariables] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optimisticResponse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptimisticResponse: Self[TData, TVariables] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optimisticResponse")(js.undefined)
        ret
    }
    @scala.inline
    def withRefetchQueriesFunction1(value: /* repeated */ js.Any => js.Array[String | PureQueryOptions]): Self[TData, TVariables] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refetchQueries")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRefetchQueries(value: (js.Array[String | PureQueryOptions]) | RefetchQueriesFunction): Self[TData, TVariables] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refetchQueries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRefetchQueries: Self[TData, TVariables] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refetchQueries")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdate(
      value: (/* proxy */ DataProxy, /* mutationResult */ FetchResult[TData, Record[String, js.Any], Record[String, js.Any]]) => Unit
    ): Self[TData, TVariables] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutUpdate: Self[TData, TVariables] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.undefined)
        ret
    }
    @scala.inline
    def withVariables(value: TVariables): Self[TData, TVariables] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variables")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVariables: Self[TData, TVariables] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variables")(js.undefined)
        ret
    }
  }
  
}

