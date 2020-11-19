package typingsSlinky.apolloReactCommon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object typesMod {
  
  type Context = typingsSlinky.std.Record[java.lang.String, js.Any]
  
  type MutationFunction[TData, TVariables] = js.Function1[
    /* options */ js.UndefOr[
      typingsSlinky.apolloReactCommon.typesMod.MutationFunctionOptions[TData, TVariables]
    ], 
    js.Promise[
      typingsSlinky.apolloReactCommon.typesMod.MutationFetchResult[
        TData, 
        typingsSlinky.std.Record[java.lang.String, js.Any], 
        typingsSlinky.std.Record[java.lang.String, js.Any]
      ]
    ]
  ]
  
  type OperationVariables = typingsSlinky.std.Record[java.lang.String, js.Any]
  
  type RefetchQueriesFunction = js.Function1[
    /* repeated */ js.Any, 
    js.Array[java.lang.String | typingsSlinky.apolloClient.typesMod.PureQueryOptions]
  ]
}
