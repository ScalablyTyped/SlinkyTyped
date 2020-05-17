package typingsSlinky.reactQuery.mod

import typingsSlinky.reactQuery.reactQueryStrings.success
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SuccessMutationResult[TResult]
  extends MutationResultBase[TResult]
     with MutationResult[TResult] {
  @JSName("data")
  var data_SuccessMutationResult: TResult = js.native
  @JSName("error")
  var error_SuccessMutationResult: js.UndefOr[scala.Nothing] = js.native
  @JSName("status")
  var status_SuccessMutationResult: success = js.native
}

object SuccessMutationResult {
  @scala.inline
  def apply[TResult](data: TResult, promise: js.Promise[TResult], reset: () => Unit, status: success): SuccessMutationResult[TResult] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], promise = promise.asInstanceOf[js.Any], reset = js.Any.fromFunction0(reset), status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuccessMutationResult[TResult]]
  }
  @scala.inline
  implicit class SuccessMutationResultOps[Self[tresult] <: SuccessMutationResult[tresult], TResult] (val x: Self[TResult]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TResult] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TResult]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TResult] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TResult] with Other]
    @scala.inline
    def withData(value: TResult): Self[TResult] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: success): Self[TResult] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

