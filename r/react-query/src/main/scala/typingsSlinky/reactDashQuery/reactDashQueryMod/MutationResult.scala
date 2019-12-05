package typingsSlinky.reactDashQuery.reactDashQueryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MutationResult[TResults] extends js.Object {
  var data: TResults | Null
  var error: Null | js.Error
  var isLoading: Boolean
  var promise: js.Promise[TResults]
}

object MutationResult {
  @scala.inline
  def apply[TResults](isLoading: Boolean, promise: js.Promise[TResults], data: TResults = null, error: js.Error = null): MutationResult[TResults] = {
    val __obj = js.Dynamic.literal(isLoading = isLoading.asInstanceOf[js.Any], promise = promise.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    __obj.asInstanceOf[MutationResult[TResults]]
  }
}

