package typingsSlinky.reactQuery.mod

import typingsSlinky.reactQuery.anon.Config
import typingsSlinky.reactQuery.anon.QueryFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-query", "usePaginatedQuery")
@js.native
object usePaginatedQuery extends js.Object {
  def apply[TResult, TKey /* <: String */](queryKey: js.UndefOr[Null | TKey], queryFn: QueryFunction[TResult, js.Array[TKey]]): PaginatedQueryResult[TResult] = js.native
  def apply[TResult, TKey /* <: String */](
    queryKey: js.UndefOr[Null | TKey],
    queryFn: QueryFunction[TResult, js.Array[TKey]],
    config: QueryOptions[TResult]
  ): PaginatedQueryResult[TResult] = js.native
  def apply[TResult, TKey /* <: AnyQueryKey */, TVariables /* <: AnyVariables */](hasQueryKeyVariablesQueryFnConfig: Config[TKey, TVariables, TResult]): PaginatedQueryResult[TResult] = js.native
  def apply[TResult, TSingleKey /* <: String */, TVariables /* <: AnyVariables */](hasQueryKeyVariablesQueryFnConfig: QueryFn[TSingleKey, TVariables, TResult]): PaginatedQueryResult[TResult] = js.native
  def apply[TResult, TKey /* <: String */, TVariables /* <: AnyVariables */](
    queryKey: js.UndefOr[Null | TKey],
    variables: TVariables,
    queryFn: QueryFunctionWithVariables[TResult, js.Array[TKey], TVariables]
  ): PaginatedQueryResult[TResult] = js.native
  def apply[TResult, TKey /* <: String */, TVariables /* <: AnyVariables */](
    queryKey: js.UndefOr[Null | TKey],
    variables: TVariables,
    queryFn: QueryFunctionWithVariables[TResult, js.Array[TKey], TVariables],
    config: QueryOptions[TResult]
  ): PaginatedQueryResult[TResult] = js.native
}

