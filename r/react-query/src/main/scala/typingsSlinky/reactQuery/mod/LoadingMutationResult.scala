package typingsSlinky.reactQuery.mod

import typingsSlinky.reactQuery.reactQueryStrings.loading
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoadingMutationResult[TResult]
  extends MutationResultBase[TResult]
     with MutationResult[TResult] {
  @JSName("data")
  var data_LoadingMutationResult: js.UndefOr[scala.Nothing] = js.native
  @JSName("error")
  var error_LoadingMutationResult: js.UndefOr[scala.Nothing] = js.native
  @JSName("status")
  var status_LoadingMutationResult: loading = js.native
}

object LoadingMutationResult {
  @scala.inline
  def apply[TResult](promise: js.Promise[TResult], reset: () => Unit, status: loading): LoadingMutationResult[TResult] = {
    val __obj = js.Dynamic.literal(promise = promise.asInstanceOf[js.Any], reset = js.Any.fromFunction0(reset), status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadingMutationResult[TResult]]
  }
  @scala.inline
  implicit class LoadingMutationResultOps[Self[tresult] <: LoadingMutationResult[tresult], TResult] (val x: Self[TResult]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TResult] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TResult]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TResult] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TResult] with Other]
    @scala.inline
    def withStatus(value: loading): Self[TResult] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

