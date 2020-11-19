package typingsSlinky.reactQuery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type AnyQueryKey = Array[java.lang.String | typingsSlinky.reactQuery.mod.QueryKeyPart]
  
  type AnyVariables = js.Array[js.Any] | Array[js.Any]
  
  type ConsoleFunction = js.Function1[/* repeated */ js.Any, scala.Unit]
  
  type InfiniteQueryFunction[TResult, TKey /* <: typingsSlinky.reactQuery.mod.AnyQueryKey */, TMoreVariable] = js.Function1[
    /* keysAndMore */ (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _.List.Append<TKey, TMoreVariable> */ js.Any) | TKey, 
    js.Promise[TResult]
  ]
  
  type InfiniteQueryFunctionWithVariables[TResult, TKey /* <: typingsSlinky.reactQuery.mod.AnyQueryKey */, TVariables /* <: typingsSlinky.reactQuery.mod.AnyVariables */, TMoreVariable] = js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _.List.Append<_.List.Concat<TKey, TVariables>, TMoreVariable> */ /* keysAndVariablesAndMore */ js.Any, 
    js.Promise[TResult]
  ]
  
  type MutateFunction[TResult, TVariables] = js.Function2[
    js.UndefOr[/* variables */ TVariables], 
    js.UndefOr[typingsSlinky.reactQuery.mod.MutateOptions[TResult, TVariables]], 
    js.Promise[TResult]
  ]
  
  type MutationFunction[TResults, TVariables] = js.Function1[/* variables */ TVariables, js.Promise[TResults]]
  
  type QueryFunction[TResult, TKey /* <: typingsSlinky.reactQuery.mod.AnyQueryKey */] = js.Function1[/* key */ TKey, js.Promise[TResult]]
  
  type QueryFunctionWithVariables[TResult, TKey /* <: typingsSlinky.reactQuery.mod.AnyQueryKey */, TVariables /* <: typingsSlinky.reactQuery.mod.AnyVariables */] = js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _.List.Concat<TKey, TVariables> */ /* key */ js.Any, 
    js.Promise[TResult]
  ]
  
  type QueryKeyPart = js.UndefOr[
    java.lang.String | js.Object | scala.Boolean | scala.Double | scala.Null | (js.Array[
      /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias react-query.react-query.QueryKeyPart */ js.Object
    ])
  ]
}
