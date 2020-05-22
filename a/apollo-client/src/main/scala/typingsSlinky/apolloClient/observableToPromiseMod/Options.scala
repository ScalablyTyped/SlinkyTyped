package typingsSlinky.apolloClient.observableToPromiseMod

import typingsSlinky.apolloClient.observableQueryMod.ObservableQuery
import typingsSlinky.apolloClient.typesMod.OperationVariables
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var errorCallbacks: js.UndefOr[js.Array[js.Function1[/* error */ js.Error, _]]] = js.undefined
  var observable: ObservableQuery[_, OperationVariables]
  var shouldResolve: js.UndefOr[Boolean] = js.undefined
  @JSName("wait")
  var wait_FOptions: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    observable: ObservableQuery[_, OperationVariables],
    errorCallbacks: js.Array[js.Function1[/* error */ js.Error, _]] = null,
    shouldResolve: js.UndefOr[Boolean] = js.undefined,
    wait: js.UndefOr[Double] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal(observable = observable.asInstanceOf[js.Any])
    if (errorCallbacks != null) __obj.updateDynamic("errorCallbacks")(errorCallbacks.asInstanceOf[js.Any])
    if (!js.isUndefined(shouldResolve)) __obj.updateDynamic("shouldResolve")(shouldResolve.get.asInstanceOf[js.Any])
    if (!js.isUndefined(wait)) __obj.updateDynamic("wait")(wait.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

