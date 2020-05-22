package typingsSlinky.reactQuery.anon

import typingsSlinky.reactQuery.mod.AnyQueryKey
import typingsSlinky.reactQuery.mod.AnyVariables
import typingsSlinky.reactQuery.mod.QueryFunctionWithVariables
import typingsSlinky.reactQuery.mod.QueryOptions
import typingsSlinky.reactQuery.reactQueryBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config[TKey /* <: AnyQueryKey */, TVariables /* <: AnyVariables */, TResult] extends js.Object {
  var config: js.UndefOr[QueryOptions[TResult]] = js.undefined
  var queryFn: QueryFunctionWithVariables[TResult, TKey, TVariables]
  var queryKey: js.UndefOr[TKey | `false` | Null | (js.Function0[js.UndefOr[TKey | `false` | Null]])] = js.undefined
  var variables: js.UndefOr[TVariables] = js.undefined
}

object Config {
  @scala.inline
  def apply[TKey, TVariables, TResult](
    queryFn: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _.List.Concat<TKey, TVariables> */ /* key */ js.Any => js.Promise[TResult],
    config: QueryOptions[TResult] = null,
    queryKey: js.UndefOr[Null | TKey | `false` | (js.Function0[js.UndefOr[TKey | `false` | Null]])] = js.undefined,
    variables: TVariables = null
  ): Config[TKey, TVariables, TResult] = {
    val __obj = js.Dynamic.literal(queryFn = js.Any.fromFunction1(queryFn))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (!js.isUndefined(queryKey)) __obj.updateDynamic("queryKey")(queryKey.asInstanceOf[js.Any])
    if (variables != null) __obj.updateDynamic("variables")(variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config[TKey, TVariables, TResult]]
  }
}

