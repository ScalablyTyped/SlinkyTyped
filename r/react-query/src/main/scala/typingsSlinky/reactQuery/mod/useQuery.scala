package typingsSlinky.reactQuery.mod

import typingsSlinky.reactQuery.anon.Config
import typingsSlinky.reactQuery.anon.QueryFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-query", "useQuery")
@js.native
object useQuery extends js.Object {
  
  def apply[TResult, TSingleKey /* <: String */](queryKey: TSingleKey, queryFn: QueryFunction[TResult, js.Array[TSingleKey]]): QueryResult[TResult] = js.native
  def apply[TResult, TSingleKey /* <: String */](
    queryKey: TSingleKey,
    queryFn: QueryFunction[TResult, js.Array[TSingleKey]],
    config: QueryOptions[TResult]
  ): QueryResult[TResult] = js.native
  def apply[TResult, TSingleKey /* <: String */](queryKey: js.UndefOr[scala.Nothing], queryFn: QueryFunction[TResult, js.Array[TSingleKey]]): QueryResult[TResult] = js.native
  def apply[TResult, TSingleKey /* <: String */](
    queryKey: js.UndefOr[scala.Nothing],
    queryFn: QueryFunction[TResult, js.Array[TSingleKey]],
    config: QueryOptions[TResult]
  ): QueryResult[TResult] = js.native
  def apply[TResult, TSingleKey /* <: String */](queryKey: Null, queryFn: QueryFunction[TResult, js.Array[TSingleKey]]): QueryResult[TResult] = js.native
  def apply[TResult, TSingleKey /* <: String */](
    queryKey: Null,
    queryFn: QueryFunction[TResult, js.Array[TSingleKey]],
    config: QueryOptions[TResult]
  ): QueryResult[TResult] = js.native
  def apply[TResult, TKey /* <: AnyQueryKey */, TVariables /* <: AnyVariables */](hasQueryKeyVariablesQueryFnConfig: Config[TKey, TVariables, TResult]): QueryResult[TResult] = js.native
  def apply[TResult, TSingleKey /* <: String */, TVariables /* <: AnyVariables */](hasQueryKeyVariablesQueryFnConfig: QueryFn[TSingleKey, TVariables, TResult]): QueryResult[TResult] = js.native
  def apply[TResult, TKey /* <: AnyQueryKey */, TVariables /* <: AnyVariables */](
    queryKey: TKey,
    variables: TVariables,
    queryFn: QueryFunctionWithVariables[TResult, TKey, TVariables]
  ): QueryResult[TResult] = js.native
  def apply[TResult, TKey /* <: AnyQueryKey */, TVariables /* <: AnyVariables */](
    queryKey: TKey,
    variables: TVariables,
    queryFn: QueryFunctionWithVariables[TResult, TKey, TVariables],
    config: QueryOptions[TResult]
  ): QueryResult[TResult] = js.native
  def apply[TResult, TKey /* <: AnyQueryKey */, TVariables /* <: AnyVariables */](
    queryKey: js.UndefOr[scala.Nothing],
    variables: TVariables,
    queryFn: QueryFunctionWithVariables[TResult, TKey, TVariables]
  ): QueryResult[TResult] = js.native
  def apply[TResult, TKey /* <: AnyQueryKey */, TVariables /* <: AnyVariables */](
    queryKey: js.UndefOr[scala.Nothing],
    variables: TVariables,
    queryFn: QueryFunctionWithVariables[TResult, TKey, TVariables],
    config: QueryOptions[TResult]
  ): QueryResult[TResult] = js.native
  def apply[TResult, TKey /* <: AnyQueryKey */, TVariables /* <: AnyVariables */](
    queryKey: Null,
    variables: TVariables,
    queryFn: QueryFunctionWithVariables[TResult, TKey, TVariables]
  ): QueryResult[TResult] = js.native
  def apply[TResult, TKey /* <: AnyQueryKey */, TVariables /* <: AnyVariables */](
    queryKey: Null,
    variables: TVariables,
    queryFn: QueryFunctionWithVariables[TResult, TKey, TVariables],
    config: QueryOptions[TResult]
  ): QueryResult[TResult] = js.native
}
