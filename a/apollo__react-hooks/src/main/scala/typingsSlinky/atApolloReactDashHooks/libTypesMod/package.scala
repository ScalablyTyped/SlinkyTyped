package typingsSlinky.atApolloReactDashHooks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libTypesMod {
  import typingsSlinky.atApolloReactDashCommon.libTypesTypesMod.ExecutionResult
  import typingsSlinky.atApolloReactDashCommon.libTypesTypesMod.MutationFunctionOptions
  import typingsSlinky.atApolloReactDashCommon.libTypesTypesMod.MutationResult
  import typingsSlinky.atApolloReactDashCommon.libTypesTypesMod.QueryResult
  import typingsSlinky.atApolloReactDashHooks.Anon_ClientApolloClient

  type CommonOptions[TOptions] = TOptions with Anon_ClientApolloClient
  type MutationTuple[TData, TVariables] = js.Tuple2[
    js.Function1[
      /* options */ js.UndefOr[MutationFunctionOptions[TData, TVariables]], 
      js.Promise[ExecutionResult[TData]]
    ], 
    MutationResult[TData]
  ]
  type QueryTuple[TData, TVariables] = js.Tuple2[
    js.Function1[/* options */ js.UndefOr[QueryLazyOptions[TVariables]], Unit], 
    QueryResult[TData, TVariables]
  ]
}
