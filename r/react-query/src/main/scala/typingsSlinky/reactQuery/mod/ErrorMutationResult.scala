package typingsSlinky.reactQuery.mod

import typingsSlinky.reactQuery.reactQueryStrings.error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ErrorMutationResult[TResult]
  extends MutationResultBase[TResult]
     with MutationResult[TResult] {
  @JSName("data")
  var data_ErrorMutationResult: js.UndefOr[scala.Nothing] = js.native
  @JSName("status")
  var status_ErrorMutationResult: error = js.native
}

object ErrorMutationResult {
  @scala.inline
  def apply[TResult](promise: js.Promise[TResult], reset: () => Unit, status: error): ErrorMutationResult[TResult] = {
    val __obj = js.Dynamic.literal(promise = promise.asInstanceOf[js.Any], reset = js.Any.fromFunction0(reset), status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorMutationResult[TResult]]
  }
  @scala.inline
  implicit class ErrorMutationResultOps[Self[tresult] <: ErrorMutationResult[tresult], TResult] (val x: Self[TResult]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TResult] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TResult]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TResult] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TResult] with Other]
    @scala.inline
    def withStatus(value: error): Self[TResult] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

