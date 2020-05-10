package typingsSlinky.apolloReactCommon.typesMod

import typingsSlinky.apolloCache.dataProxyMod.DataProxy
import typingsSlinky.apolloClient.typesMod.PureQueryOptions
import typingsSlinky.apolloClient.watchQueryOptionsMod.MutationUpdaterFn
import typingsSlinky.apolloClient.watchQueryOptionsMod.WatchQueryFetchPolicy
import typingsSlinky.apolloLink.typesMod.FetchResult
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MutationFunctionOptions[TData, TVariables] extends js.Object {
  var awaitRefetchQueries: js.UndefOr[Boolean] = js.native
  var context: js.UndefOr[Context] = js.native
  var fetchPolicy: js.UndefOr[WatchQueryFetchPolicy] = js.native
  var optimisticResponse: js.UndefOr[TData | (js.Function1[/* vars */ TVariables | js.Object, TData])] = js.native
  var refetchQueries: js.UndefOr[(js.Array[String | PureQueryOptions]) | RefetchQueriesFunction] = js.native
  var update: js.UndefOr[MutationUpdaterFn[TData]] = js.native
  var variables: js.UndefOr[TVariables] = js.native
}

object MutationFunctionOptions {
  @scala.inline
  def apply[TData, TVariables](): MutationFunctionOptions[TData, TVariables] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MutationFunctionOptions[TData, TVariables]]
  }
  @scala.inline
  implicit class MutationFunctionOptionsOps[Self[tdata, tvariables] <: MutationFunctionOptions[tdata, tvariables], TData, TVariables] (val x: Self[TData, TVariables]) extends AnyVal {
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
    def withOptimisticResponseFunction1(value: /* vars */ TVariables | js.Object => TData): Self[TData, TVariables] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optimisticResponse")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOptimisticResponse(value: TData | (js.Function1[/* vars */ TVariables | js.Object, TData])): Self[TData, TVariables] = {
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

