package typingsSlinky.apolloClient.anon

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.apolloCache.dataProxyMod.DataProxy
import typingsSlinky.apolloClient.typesMod.MutationQueryReducersMap
import typingsSlinky.apolloClient.typesMod.OperationVariables
import typingsSlinky.apolloClient.watchQueryOptionsMod.ErrorPolicy
import typingsSlinky.apolloClient.watchQueryOptionsMod.FetchPolicy
import typingsSlinky.apolloClient.watchQueryOptionsMod.MutationUpdaterFn
import typingsSlinky.apolloClient.watchQueryOptionsMod.RefetchQueryDescription
import typingsSlinky.apolloLink.typesMod.FetchResult
import typingsSlinky.graphql.astMod.DocumentNode
import typingsSlinky.graphql.executeMod.ExecutionResult
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<apollo-client.apollo-client/core/watchQueryOptions.MutationOptions<{[key: string] : any}, apollo-client.apollo-client/core/types.OperationVariables>> */
@js.native
trait PartialMutationOptionskey extends js.Object {
  var awaitRefetchQueries: js.UndefOr[Boolean] = js.native
  var context: js.UndefOr[js.Any] = js.native
  var errorPolicy: js.UndefOr[ErrorPolicy] = js.native
  var fetchPolicy: js.UndefOr[FetchPolicy] = js.native
  var mutation: js.UndefOr[DocumentNode] = js.native
  var optimisticResponse: js.UndefOr[
    StringDictionary[js.Any] | (js.Function1[/* vars */ OperationVariables, StringDictionary[_]])
  ] = js.native
  var refetchQueries: js.UndefOr[
    (js.Function1[/* result */ ExecutionResult[StringDictionary[_]], RefetchQueryDescription]) | RefetchQueryDescription
  ] = js.native
  var update: js.UndefOr[MutationUpdaterFn[StringDictionary[_]]] = js.native
  var updateQueries: js.UndefOr[MutationQueryReducersMap[StringDictionary[_]]] = js.native
  var variables: js.UndefOr[OperationVariables] = js.native
}

object PartialMutationOptionskey {
  @scala.inline
  def apply(): PartialMutationOptionskey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialMutationOptionskey]
  }
  @scala.inline
  implicit class PartialMutationOptionskeyOps[Self <: PartialMutationOptionskey] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAwaitRefetchQueries(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("awaitRefetchQueries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAwaitRefetchQueries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("awaitRefetchQueries")(js.undefined)
        ret
    }
    @scala.inline
    def withContext(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorPolicy(value: ErrorPolicy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorPolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorPolicy")(js.undefined)
        ret
    }
    @scala.inline
    def withFetchPolicy(value: FetchPolicy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetchPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFetchPolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetchPolicy")(js.undefined)
        ret
    }
    @scala.inline
    def withMutation(value: DocumentNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mutation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMutation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mutation")(js.undefined)
        ret
    }
    @scala.inline
    def withOptimisticResponseFunction1(value: /* vars */ OperationVariables => StringDictionary[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optimisticResponse")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOptimisticResponse(
      value: StringDictionary[js.Any] | (js.Function1[/* vars */ OperationVariables, StringDictionary[_]])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optimisticResponse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptimisticResponse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optimisticResponse")(js.undefined)
        ret
    }
    @scala.inline
    def withRefetchQueriesFunction1(value: /* result */ ExecutionResult[StringDictionary[_]] => RefetchQueryDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refetchQueries")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRefetchQueries(
      value: (js.Function1[/* result */ ExecutionResult[StringDictionary[_]], RefetchQueryDescription]) | RefetchQueryDescription
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refetchQueries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRefetchQueries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refetchQueries")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdate(
      value: (/* proxy */ DataProxy, /* mutationResult */ FetchResult[StringDictionary[_], Record[String, js.Any], Record[String, js.Any]]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateQueries(value: MutationQueryReducersMap[StringDictionary[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateQueries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateQueries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateQueries")(js.undefined)
        ret
    }
    @scala.inline
    def withVariables(value: OperationVariables): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variables")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVariables: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variables")(js.undefined)
        ret
    }
  }
  
}

