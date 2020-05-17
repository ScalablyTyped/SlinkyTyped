package typingsSlinky.apolloReactHooks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type CommonOptions[TOptions] = TOptions with typingsSlinky.apolloReactHooks.anon.ClientApolloClient
  type MutationTuple[TData, TVariables] = js.Tuple2[
    js.Function1[
      /* options */ js.UndefOr[
        typingsSlinky.apolloReactCommon.typesMod.MutationFunctionOptions[TData, TVariables]
      ], 
      js.Promise[typingsSlinky.apolloReactCommon.typesMod.ExecutionResult[TData]]
    ], 
    typingsSlinky.apolloReactCommon.typesMod.MutationResult[TData]
  ]
  type QueryTuple[TData, TVariables] = js.Tuple2[
    js.Function1[
      /* options */ js.UndefOr[typingsSlinky.apolloReactHooks.typesMod.QueryLazyOptions[TVariables]], 
      scala.Unit
    ], 
    typingsSlinky.apolloReactCommon.typesMod.QueryResult[TData, TVariables]
  ]
}
