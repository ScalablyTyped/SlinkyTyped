package typingsSlinky.reactQuery.mod

import typingsSlinky.reactQuery.reactQueryStrings.error
import typingsSlinky.reactQuery.reactQueryStrings.idle
import typingsSlinky.reactQuery.reactQueryStrings.loading
import typingsSlinky.reactQuery.reactQueryStrings.success
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MutationResultBase[TResult] extends js.Object {
  var data: js.UndefOr[TResult] = js.undefined
  var error: Null | js.Any
  var promise: js.Promise[TResult]
  var status: idle | loading | error | success
  def reset(): Unit
}

object MutationResultBase {
  @scala.inline
  def apply[TResult](
    promise: js.Promise[TResult],
    reset: () => Unit,
    status: idle | loading | error | success,
    data: TResult = null,
    error: js.Any = null
  ): MutationResultBase[TResult] = {
    val __obj = js.Dynamic.literal(promise = promise.asInstanceOf[js.Any], reset = js.Any.fromFunction0(reset), status = status.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    __obj.asInstanceOf[MutationResultBase[TResult]]
  }
}

