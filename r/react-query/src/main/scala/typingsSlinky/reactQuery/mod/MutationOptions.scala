package typingsSlinky.reactQuery.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MutationOptions[TResult, TVariables] extends MutateOptions[TResult, TVariables] {
  var onMutate: js.UndefOr[js.Function1[/* variables */ TVariables, js.Promise[_] | _]] = js.native
  var useErrorBoundary: js.UndefOr[Boolean] = js.native
}

object MutationOptions {
  @scala.inline
  def apply[TResult, TVariables](): MutationOptions[TResult, TVariables] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MutationOptions[TResult, TVariables]]
  }
  @scala.inline
  implicit class MutationOptionsOps[Self[tresult, tvariables] <: MutationOptions[tresult, tvariables], TResult, TVariables] (val x: Self[TResult, TVariables]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TResult, TVariables] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TResult, TVariables]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[TResult, TVariables]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[TResult, TVariables]) with Other]
    @scala.inline
    def withOnMutate(value: /* variables */ TVariables => js.Promise[_] | _): Self[TResult, TVariables] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMutate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMutate: Self[TResult, TVariables] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMutate")(js.undefined)
        ret
    }
    @scala.inline
    def withUseErrorBoundary(value: Boolean): Self[TResult, TVariables] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useErrorBoundary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseErrorBoundary: Self[TResult, TVariables] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useErrorBoundary")(js.undefined)
        ret
    }
  }
  
}

