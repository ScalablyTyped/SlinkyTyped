package typingsSlinky.atApolloReactDashComponents.libTypesMod

import typingsSlinky.apolloDashCache.libTypesDataProxyMod.DataProxy
import typingsSlinky.apolloDashClient.apolloDashClientMod.ApolloError
import typingsSlinky.apolloDashClient.apolloDashClientMod.default
import typingsSlinky.apolloDashClient.coreTypesMod.PureQueryOptions
import typingsSlinky.apolloDashClient.coreWatchQueryOptionsMod.ErrorPolicy
import typingsSlinky.apolloDashClient.coreWatchQueryOptionsMod.WatchQueryFetchPolicy
import typingsSlinky.apolloDashLink.libTypesMod.FetchResult
import typingsSlinky.atApolloReactDashCommon.libTypesTypesMod.BaseMutationOptions
import typingsSlinky.atApolloReactDashCommon.libTypesTypesMod.Context
import typingsSlinky.atApolloReactDashCommon.libTypesTypesMod.MutationFunction
import typingsSlinky.atApolloReactDashCommon.libTypesTypesMod.MutationResult
import typingsSlinky.atApolloReactDashCommon.libTypesTypesMod.RefetchQueriesFunction
import typingsSlinky.graphql.languageAstMod.DocumentNode
import typingsSlinky.react.reactMod._Global_.JSX.Element
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MutationComponentOptions[TData, TVariables] extends BaseMutationOptions[TData, TVariables] {
  var mutation: DocumentNode
  def children(mutateFunction: MutationFunction[TData, TVariables], result: MutationResult[TData]): Element | Null
}

object MutationComponentOptions {
  @scala.inline
  def apply[TData, TVariables](
    children: (MutationFunction[TData, TVariables], MutationResult[TData]) => Element | Null,
    mutation: DocumentNode,
    awaitRefetchQueries: js.UndefOr[Boolean] = js.undefined,
    client: default[js.Object] = null,
    context: Context = null,
    errorPolicy: ErrorPolicy = null,
    fetchPolicy: WatchQueryFetchPolicy = null,
    ignoreResults: js.UndefOr[Boolean] = js.undefined,
    notifyOnNetworkStatusChange: js.UndefOr[Boolean] = js.undefined,
    onCompleted: TData => Unit = null,
    onError: /* error */ ApolloError => Unit = null,
    optimisticResponse: TData | (js.Function1[TVariables, TData]) = null,
    refetchQueries: (js.Array[String | PureQueryOptions]) | RefetchQueriesFunction = null,
    update: (/* proxy */ DataProxy, /* mutationResult */ FetchResult[TData, Record[String, js.Any], Record[String, js.Any]]) => Unit = null,
    variables: TVariables = null
  ): MutationComponentOptions[TData, TVariables] = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction2(children), mutation = mutation.asInstanceOf[js.Any])
    if (!js.isUndefined(awaitRefetchQueries)) __obj.updateDynamic("awaitRefetchQueries")(awaitRefetchQueries.asInstanceOf[js.Any])
    if (client != null) __obj.updateDynamic("client")(client.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (errorPolicy != null) __obj.updateDynamic("errorPolicy")(errorPolicy.asInstanceOf[js.Any])
    if (fetchPolicy != null) __obj.updateDynamic("fetchPolicy")(fetchPolicy.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreResults)) __obj.updateDynamic("ignoreResults")(ignoreResults.asInstanceOf[js.Any])
    if (!js.isUndefined(notifyOnNetworkStatusChange)) __obj.updateDynamic("notifyOnNetworkStatusChange")(notifyOnNetworkStatusChange.asInstanceOf[js.Any])
    if (onCompleted != null) __obj.updateDynamic("onCompleted")(js.Any.fromFunction1(onCompleted))
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1(onError))
    if (optimisticResponse != null) __obj.updateDynamic("optimisticResponse")(optimisticResponse.asInstanceOf[js.Any])
    if (refetchQueries != null) __obj.updateDynamic("refetchQueries")(refetchQueries.asInstanceOf[js.Any])
    if (update != null) __obj.updateDynamic("update")(js.Any.fromFunction2(update))
    if (variables != null) __obj.updateDynamic("variables")(variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[MutationComponentOptions[TData, TVariables]]
  }
}

