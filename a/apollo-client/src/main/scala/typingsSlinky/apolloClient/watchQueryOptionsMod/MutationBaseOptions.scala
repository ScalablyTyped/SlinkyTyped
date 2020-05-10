package typingsSlinky.apolloClient.watchQueryOptionsMod

import typingsSlinky.apolloCache.dataProxyMod.DataProxy
import typingsSlinky.apolloClient.typesMod.MutationQueryReducersMap
import typingsSlinky.apolloLink.typesMod.FetchResult
import typingsSlinky.graphql.executeMod.ExecutionResult
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MutationBaseOptions[T, TVariables] extends js.Object {
  var awaitRefetchQueries: js.UndefOr[Boolean] = js.native
  var errorPolicy: js.UndefOr[ErrorPolicy] = js.native
  var optimisticResponse: js.UndefOr[T | (js.Function1[/* vars */ TVariables, T])] = js.native
  var refetchQueries: js.UndefOr[
    (js.Function1[/* result */ ExecutionResult[T], RefetchQueryDescription]) | RefetchQueryDescription
  ] = js.native
  var update: js.UndefOr[MutationUpdaterFn[T]] = js.native
  var updateQueries: js.UndefOr[MutationQueryReducersMap[T]] = js.native
  var variables: js.UndefOr[TVariables] = js.native
}

object MutationBaseOptions {
  @scala.inline
  def apply[T, TVariables](): MutationBaseOptions[T, TVariables] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MutationBaseOptions[T, TVariables]]
  }
  @scala.inline
  implicit class MutationBaseOptionsOps[Self[t, tvariables] <: MutationBaseOptions[t, tvariables], T, TVariables] (val x: Self[T, TVariables]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T, TVariables] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T, TVariables]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[T, TVariables]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[T, TVariables]) with Other]
    @scala.inline
    def withAwaitRefetchQueries(value: Boolean): Self[T, TVariables] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("awaitRefetchQueries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAwaitRefetchQueries: Self[T, TVariables] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("awaitRefetchQueries")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorPolicy(value: ErrorPolicy): Self[T, TVariables] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorPolicy: Self[T, TVariables] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorPolicy")(js.undefined)
        ret
    }
    @scala.inline
    def withOptimisticResponseFunction1(value: /* vars */ TVariables => T): Self[T, TVariables] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optimisticResponse")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOptimisticResponse(value: T | (js.Function1[/* vars */ TVariables, T])): Self[T, TVariables] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optimisticResponse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptimisticResponse: Self[T, TVariables] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optimisticResponse")(js.undefined)
        ret
    }
    @scala.inline
    def withRefetchQueriesFunction1(value: /* result */ ExecutionResult[T] => RefetchQueryDescription): Self[T, TVariables] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refetchQueries")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRefetchQueries(
      value: (js.Function1[/* result */ ExecutionResult[T], RefetchQueryDescription]) | RefetchQueryDescription
    ): Self[T, TVariables] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refetchQueries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRefetchQueries: Self[T, TVariables] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refetchQueries")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdate(
      value: (/* proxy */ DataProxy, /* mutationResult */ FetchResult[T, Record[String, js.Any], Record[String, js.Any]]) => Unit
    ): Self[T, TVariables] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutUpdate: Self[T, TVariables] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateQueries(value: MutationQueryReducersMap[T]): Self[T, TVariables] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateQueries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateQueries: Self[T, TVariables] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateQueries")(js.undefined)
        ret
    }
    @scala.inline
    def withVariables(value: TVariables): Self[T, TVariables] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variables")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVariables: Self[T, TVariables] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variables")(js.undefined)
        ret
    }
  }
  
}

