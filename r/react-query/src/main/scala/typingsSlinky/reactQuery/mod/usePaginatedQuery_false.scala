package typingsSlinky.reactQuery.mod

import typingsSlinky.reactQuery.reactQueryBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-query", "usePaginatedQuery")
@js.native
object usePaginatedQuery_false extends js.Object {
  def apply[TResult, TKey /* <: String */](
    queryKey: js.UndefOr[(js.Function0[js.UndefOr[TKey | `false` | Null]]) | `false`],
    queryFn: QueryFunction[TResult, js.Array[TKey]]
  ): PaginatedQueryResult[TResult] = js.native
  def apply[TResult, TKey /* <: String */](
    queryKey: js.UndefOr[(js.Function0[js.UndefOr[TKey | `false` | Null]]) | `false`],
    queryFn: QueryFunction[TResult, js.Array[TKey]],
    config: QueryOptions[TResult]
  ): PaginatedQueryResult[TResult] = js.native
  def apply[TResult, TKey /* <: String */, TVariables /* <: AnyVariables */](
    queryKey: js.UndefOr[(js.Function0[js.UndefOr[TKey | `false` | Null]]) | `false`],
    variables: TVariables,
    queryFn: QueryFunctionWithVariables[TResult, js.Array[TKey], TVariables]
  ): PaginatedQueryResult[TResult] = js.native
  def apply[TResult, TKey /* <: String */, TVariables /* <: AnyVariables */](
    queryKey: js.UndefOr[(js.Function0[js.UndefOr[TKey | `false` | Null]]) | `false`],
    variables: TVariables,
    queryFn: QueryFunctionWithVariables[TResult, js.Array[TKey], TVariables],
    config: QueryOptions[TResult]
  ): PaginatedQueryResult[TResult] = js.native
}

