package typingsSlinky.reactQuery.mod

import typingsSlinky.reactQuery.anon.Config
import typingsSlinky.reactQuery.anon.QueryFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-query", "usePaginatedQuery")
@js.native
object usePaginatedQuery extends js.Object {
  
  def apply[TResult, TKey /* <: AnyQueryKey */](queryKey: TKey, queryFn: QueryFunction[TResult, TKey]): PaginatedQueryResult[TResult] = js.native
  def apply[TResult, TKey /* <: AnyQueryKey */](queryKey: TKey, queryFn: QueryFunction[TResult, TKey], config: QueryOptions[TResult]): PaginatedQueryResult[TResult] = js.native
  def apply[TResult, TKey /* <: AnyQueryKey */](queryKey: js.UndefOr[scala.Nothing], queryFn: QueryFunction[TResult, TKey]): PaginatedQueryResult[TResult] = js.native
  def apply[TResult, TKey /* <: AnyQueryKey */](
    queryKey: js.UndefOr[scala.Nothing],
    queryFn: QueryFunction[TResult, TKey],
    config: QueryOptions[TResult]
  ): PaginatedQueryResult[TResult] = js.native
  def apply[TResult, TKey /* <: AnyQueryKey */](queryKey: Null, queryFn: QueryFunction[TResult, TKey]): PaginatedQueryResult[TResult] = js.native
  def apply[TResult, TKey /* <: AnyQueryKey */](queryKey: Null, queryFn: QueryFunction[TResult, TKey], config: QueryOptions[TResult]): PaginatedQueryResult[TResult] = js.native
  def apply[TResult, TKey /* <: AnyQueryKey */, TVariables /* <: AnyVariables */](hasQueryKeyVariablesQueryFnConfig: Config[TKey, TVariables, TResult]): PaginatedQueryResult[TResult] = js.native
  def apply[TResult, TSingleKey /* <: String */, TVariables /* <: AnyVariables */](hasQueryKeyVariablesQueryFnConfig: QueryFn[TSingleKey, TVariables, TResult]): PaginatedQueryResult[TResult] = js.native
  def apply[TResult, TKey /* <: String */, TVariables /* <: AnyVariables */](
    queryKey: TKey,
    variables: TVariables,
    queryFn: QueryFunctionWithVariables[TResult, js.Array[TKey], TVariables]
  ): PaginatedQueryResult[TResult] = js.native
  def apply[TResult, TKey /* <: String */, TVariables /* <: AnyVariables */](
    queryKey: TKey,
    variables: TVariables,
    queryFn: QueryFunctionWithVariables[TResult, js.Array[TKey], TVariables],
    config: QueryOptions[TResult]
  ): PaginatedQueryResult[TResult] = js.native
  def apply[TResult, TKey /* <: String */, TVariables /* <: AnyVariables */](
    queryKey: js.UndefOr[scala.Nothing],
    variables: TVariables,
    queryFn: QueryFunctionWithVariables[TResult, js.Array[TKey], TVariables]
  ): PaginatedQueryResult[TResult] = js.native
  def apply[TResult, TKey /* <: String */, TVariables /* <: AnyVariables */](
    queryKey: js.UndefOr[scala.Nothing],
    variables: TVariables,
    queryFn: QueryFunctionWithVariables[TResult, js.Array[TKey], TVariables],
    config: QueryOptions[TResult]
  ): PaginatedQueryResult[TResult] = js.native
  def apply[TResult, TKey /* <: String */, TVariables /* <: AnyVariables */](
    queryKey: Null,
    variables: TVariables,
    queryFn: QueryFunctionWithVariables[TResult, js.Array[TKey], TVariables]
  ): PaginatedQueryResult[TResult] = js.native
  def apply[TResult, TKey /* <: String */, TVariables /* <: AnyVariables */](
    queryKey: Null,
    variables: TVariables,
    queryFn: QueryFunctionWithVariables[TResult, js.Array[TKey], TVariables],
    config: QueryOptions[TResult]
  ): PaginatedQueryResult[TResult] = js.native
}
