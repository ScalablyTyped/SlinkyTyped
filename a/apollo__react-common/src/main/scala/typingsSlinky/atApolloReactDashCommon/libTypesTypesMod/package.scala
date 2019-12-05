package typingsSlinky.atApolloReactDashCommon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libTypesTypesMod {
  import typingsSlinky.apolloDashClient.apolloDashClientMod.ObservableQuery
  import typingsSlinky.apolloDashClient.coreTypesMod.PureQueryOptions
  import typingsSlinky.atApolloReactDashCommon.Anon_Context
  import typingsSlinky.atApolloReactDashCommon.Anon_FetchMore
  import typingsSlinky.atApolloReactDashCommon.atApolloReactDashCommonStrings.refetch
  import typingsSlinky.atApolloReactDashCommon.atApolloReactDashCommonStrings.startPolling
  import typingsSlinky.atApolloReactDashCommon.atApolloReactDashCommonStrings.stopPolling
  import typingsSlinky.atApolloReactDashCommon.atApolloReactDashCommonStrings.subscribeToMore
  import typingsSlinky.atApolloReactDashCommon.atApolloReactDashCommonStrings.updateQuery
  import typingsSlinky.atApolloReactDashCommon.atApolloReactDashCommonStrings.variables
  import typingsSlinky.std.Pick
  import typingsSlinky.std.Record

  type Context = Record[String, js.Any]
  type MutationFetchResult[TData, C, E] = ExecutionResult[TData] with (Anon_Context[E, C])
  type MutationFunction[TData, TVariables] = js.Function1[
    /* options */ js.UndefOr[MutationFunctionOptions[TData, TVariables]], 
    js.Promise[MutationFetchResult[TData, Record[String, js.Any], Record[String, js.Any]]]
  ]
  type ObservableQueryFields[TData, TVariables] = (Pick[
    ObservableQuery[TData, TVariables], 
    startPolling | stopPolling | subscribeToMore | updateQuery | refetch | variables
  ]) with (Anon_FetchMore[TVariables, TData])
  type OperationVariables = Record[String, js.Any]
  type RefetchQueriesFunction = js.Function1[/* repeated */ js.Any, js.Array[String | PureQueryOptions]]
}
